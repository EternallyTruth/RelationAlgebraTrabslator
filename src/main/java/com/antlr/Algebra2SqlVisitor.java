package com.antlr;

import algebraOut.RelationlAlgebraParser;
import org.antlr.v4.runtime.tree.ParseTree;
import out.ExprParser;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 周飞
 * @date 2018/12/27 18:01
 */
public class Algebra2SqlVisitor extends algebraOut.RelationlAlgebraBaseVisitor<String> {
    private int countOfSubquery = 0;
    Map<String, Table> database = new HashMap<String, Table>();

    @Override
    public String visitFormExpr(algebraOut.RelationlAlgebraParser.FormExprContext ctx) {
        return visit(ctx.relation());
    }

    @Override
    public String visitBracketExpr(algebraOut.RelationlAlgebraParser.BracketExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitDivision(algebraOut.RelationlAlgebraParser.DivisionContext ctx) {
        String table1 = visit(ctx.expr(0));
        String table2 = visit(ctx.expr(1));
        Table Table1 = database.get(table1);
        Table Table2 = database.get(table2);
        ArrayList<String> common = commonList(Table1, Table2);
        ArrayList<String> more = moreList(Table1, Table2);
        StringBuilder buf = new StringBuilder();
        buf.append("SELECT ");
        for (String str : more) {
            buf.append(table1 + "1." + str + ",");
        }
        buf.deleteCharAt(buf.length() - 1);
        buf.append("\nFROM " + table1 + " " + table1 + "1\n");
        buf.append("WHERE NOT EXISTS(\nSELECT ");
        for (String str : Table2.getAttributes()) {
            buf.append(str + ",");
        }
        buf.deleteCharAt(buf.length() - 1);
        buf.append("\nFROM " + table2 + "\nWHERE NOT EXISTS(\nSELECT * \nFROM ");
        buf.append(table1 + " AS " + table1 + "2" + "\nWHERE ");
        for (String str : common) {
            buf.append(table1 + "2." + str + "=" + table2 + "." + str + " AND ");
        }
        buf.append("\n");
        for (String str : more) {
            buf.append(table1 + "2." + str + "=" + table1 + "1." + str + " AND ");
        }
        buf.delete(buf.length() - 4, buf.length() - 1);
        buf.append("\n))");
        if (ctx.getParent() instanceof algebraOut.RelationlAlgebraParser.StartContext) {
            return buf.toString();
        } else return "(" + buf.toString() + ")";
    }

    @Override
    public String visitCartesianProduct(algebraOut.RelationlAlgebraParser.CartesianProductContext ctx) {
        String query = visit(ctx.expr(0)) + " CROSS JOIN " + visit(ctx.expr(1));
        if (ctx.getParent() instanceof algebraOut.RelationlAlgebraParser.StartContext) {
            return query;
        } else return "(" + query + ")";
    }

    @Override
    public String visitSelection(algebraOut.RelationlAlgebraParser.SelectionContext ctx) {
        String condlist;
        String relation = visit(ctx.expr());
        String query;
        if (!ctx.condlist().isEmpty()) {
            condlist = visit(ctx.condlist(0));
            query = "SELECT * \n" + "FROM " + relation + "\n" + "WHERE " + condlist;
        } else query = "SELECT * \n" + "FROM " + relation;
        if (ctx.getParent() instanceof algebraOut.RelationlAlgebraParser.StartContext) return query;
        else return "(" + query + ")";
    }

    @Override
    public String visitRename(algebraOut.RelationlAlgebraParser.RenameContext ctx) {
        String oldname = visit(ctx.oldname());
        String newname = visit(ctx.newname());
        StringBuilder buf = new StringBuilder();
        int count1 = ctx.attrlist(0).attribute().size(); //更改后的水星列表大小
        ArrayList<String> attrlist = database.get(oldname).getAttributes();
        int count2 = attrlist.size(); //被修改表的属性列表大小
        int min;
        if (count1 < count2) min = count1;
        else min = count2;
        for (int i = 0; i < min; i++) {
            buf.append("ALTER TABLE " + oldname + " " + attrlist.get(i) + " TO " + ctx.attrlist(0).attribute(0).getText()+ ";\n");
        }
        String query = "ALTER TABLE " + oldname + " RENAME TO " + newname + ";\n";
        buf.append(query);
        buf.deleteCharAt(buf.length()-1);
        buf.deleteCharAt(buf.length()-1);
        return buf.toString();
    }

    @Override
    public String visitNaturalJoin(algebraOut.RelationlAlgebraParser.NaturalJoinContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String query;
        if (ctx.expr(0) instanceof algebraOut.RelationlAlgebraParser.FormExprContext
                && ctx.expr(1) instanceof algebraOut.RelationlAlgebraParser.FormExprContext) {
            query = left+ " NATURAL JOIN " + right;
        } else query = left+ "\nNATURAL JOIN\n" + right;
        if (ctx.getParent() instanceof algebraOut.RelationlAlgebraParser.StartContext) return query;
        else return "(" + query + ")";
    }

    @Override
    public String visitIntersection(algebraOut.RelationlAlgebraParser.IntersectionContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String query;
        if (ctx.expr(0) instanceof algebraOut.RelationlAlgebraParser.FormExprContext
                && ctx.expr(1) instanceof algebraOut.RelationlAlgebraParser.FormExprContext) {
            query = left + " INTERSECT " + right;
        } else query = left + "\nINTERSECT\n" + right;
        countOfSubquery++;
        if (ctx.getParent() instanceof algebraOut.RelationlAlgebraParser.StartContext) return query;
        else return "(" + query + ")";
    }

    @Override
    public String visitDifference(algebraOut.RelationlAlgebraParser.DifferenceContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String query;
        if (ctx.expr(0) instanceof algebraOut.RelationlAlgebraParser.FormExprContext
                && ctx.expr(1) instanceof algebraOut.RelationlAlgebraParser.FormExprContext) {
            query = left + " EXCEPT " + right;
        } else query = left + "\nEXCEPT\n" + right;
        if (ctx.getParent() instanceof algebraOut.RelationlAlgebraParser.StartContext) return query;
        else return "(" + query + ")";
    }

    @Override
    public String visitProjection(algebraOut.RelationlAlgebraParser.ProjectionContext ctx) {
        String attrlist = visit(ctx.attrlist());
        String relation = visit(ctx.expr());
        String query;
        query = "SELECT " + attrlist + "\n" + "FROM " + relation;
        if (ctx.getParent() instanceof algebraOut.RelationlAlgebraParser.StartContext) return query;
        else return "(" + query + ")";
    }

    @Override
    public String visitUnion(algebraOut.RelationlAlgebraParser.UnionContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String query;
        if (ctx.expr(0) instanceof algebraOut.RelationlAlgebraParser.FormExprContext
                && ctx.expr(1) instanceof algebraOut.RelationlAlgebraParser.FormExprContext) {
            query = left + " UNION " + right;
        } else query = left + "\nUNION\n" + right;
        if (ctx.getParent() instanceof algebraOut.RelationlAlgebraParser.StartContext) return query;
        else return "(" + query + ")";
    }

    @Override
    public String visitJoin(algebraOut.RelationlAlgebraParser.JoinContext ctx) {
        String relation1 = visit(ctx.expr(0));
        String relation2 = visit(ctx.expr(1));
        String condlist = visit(ctx.condlist());
        return "(" + relation1 + " JOIN " + relation2 + " ON\n" + "    " + condlist + ")";
    }

    @Override
    public String visitOldnameIdentifier(algebraOut.RelationlAlgebraParser.OldnameIdentifierContext ctx) {
        if (ctx.IDENTIFIER().isEmpty()) return "";
        else return ctx.IDENTIFIER(0).getText();
    }

    @Override
    public String visitNewnameIdentifier(algebraOut.RelationlAlgebraParser.NewnameIdentifierContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    @Override
    public String visitAttrlist(algebraOut.RelationlAlgebraParser.AttrlistContext ctx) {
        StringBuilder buf = new StringBuilder();
        for (algebraOut.RelationlAlgebraParser.AttributeContext actx : ctx.attribute()) {
            buf.append(actx.getText());
            buf.append(",");
        }
        buf.deleteCharAt(buf.length() - 1); //去掉最后一个逗号
        return buf.toString();
    }

    @Override
    public String visitBracketsCondlist(algebraOut.RelationlAlgebraParser.BracketsCondlistContext ctx) {
        return "( " + ctx.condlist() + ")";
    }

    @Override
    public String visitNotCondlist(algebraOut.RelationlAlgebraParser.NotCondlistContext ctx) {
        return "NOT " + visit(ctx.condlist());
    }

    @Override
    public String visitComparedCondlist(algebraOut.RelationlAlgebraParser.ComparedCondlistContext ctx) {
        return visit(ctx.compared(0)) + " " + visit(ctx.comparator()) + " " + visit(ctx.compared(1));
    }

    @Override
    public String visitAndCondlist(algebraOut.RelationlAlgebraParser.AndCondlistContext ctx) {
        return visit(ctx.condlist(0)) + " AND " + visit(ctx.condlist(1));
    }

    @Override
    public String visitOrCondlist(algebraOut.RelationlAlgebraParser.OrCondlistContext ctx) {
        return visit(ctx.condlist(0)) + " OR " + visit(ctx.condlist(1));
    }

    @Override
    public String visitEqual(algebraOut.RelationlAlgebraParser.EqualContext ctx) {
        return "=";
    }

    @Override
    public String visitNonEqual(algebraOut.RelationlAlgebraParser.NonEqualContext ctx) {
        return "<>";
    }

    @Override
    public String visitGreaterThan(algebraOut.RelationlAlgebraParser.GreaterThanContext ctx) {
        return ">";
    }

    @Override
    public String visitGreaterEqual(algebraOut.RelationlAlgebraParser.GreaterEqualContext ctx) {
        return ">=";
    }

    @Override
    public String visitLessThan(algebraOut.RelationlAlgebraParser.LessThanContext ctx) {
        return "<";
    }

    @Override
    public String visitLessEqual(algebraOut.RelationlAlgebraParser.LessEqualContext ctx) {
        return "<=";
    }

    @Override
    public String visitPatternMatch(algebraOut.RelationlAlgebraParser.PatternMatchContext ctx) {
        return ctx.MATCH().getText();
    }

    @Override
    public String visitAttributeCompared(algebraOut.RelationlAlgebraParser.AttributeComparedContext ctx) {
        return visit(ctx.attribute());
    }

    @Override
    public String visitStringCompared(algebraOut.RelationlAlgebraParser.StringComparedContext ctx) {
        return "'" + stripQuotes(ctx.STRING().getText()) + "'";
    }

    @Override
    public String visitNumberCompared(algebraOut.RelationlAlgebraParser.NumberComparedContext ctx) {
        return ctx.NUMBER().getText();
    }

    @Override
    public String visitRelationIdentifier(algebraOut.RelationlAlgebraParser.RelationIdentifierContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    @Override
    public String visitAttributeIdentifier(algebraOut.RelationlAlgebraParser.AttributeIdentifierContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    @Override
    public String visitStringDomain(algebraOut.RelationlAlgebraParser.StringDomainContext ctx) {
        String stringtype = stripQuotes(ctx.CHAR().getText());
        String len = ctx.NUMBER().getText();
        return stringtype + '(' + len + ')';
    }

    @Override
    public String visitIntDomain(algebraOut.RelationlAlgebraParser.IntDomainContext ctx) {
        return stripQuotes(ctx.INT().getText());
    }

    //去除引号
    private static String stripQuotes(String s) {
        if (s == null || (s.charAt(0) != '"' && s.charAt(0) != '\'')) return s;
        return s.substring(1, s.length() - 1);
    }

    @Override
    public String visitInitialRelation(algebraOut.RelationlAlgebraParser.InitialRelationContext ctx) {
        String TableName = visit(ctx.relation());
        String attrlist = visit(ctx.attrlistinitial());
        ArrayList<String> attributeList = new ArrayList<String>();
        int count = ctx.attrlistinitial().attribute().size();
        for (int i = 0; i < count; i++) {
            String dataname = visit(ctx.attrlistinitial().attribute(i));
            attributeList.add(dataname);
        }
        Table table = new Table(TableName, attributeList);
        database.put(TableName, table);
        String query = "CREATE TABLE " + TableName + "\n(\n" + attrlist + ");\n";
        return query;
    }

    @Override
    public String visitAttrlistinitial(algebraOut.RelationlAlgebraParser.AttrlistinitialContext ctx) {
        int count = ctx.attribute().size();
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String dataName = visit(ctx.attribute(i));
            String dataType = visit(ctx.domain(i));
            String attribute = " " + dataName + " " + dataType + ',';
            buf.append(attribute);
            buf.append("\n");
        }
        buf.deleteCharAt(buf.length() - 2); //去掉最后一个逗号
        return buf.toString();
    }

    @Override
    public String visitCreateTable(algebraOut.RelationlAlgebraParser.CreateTableContext ctx) {
        StringBuilder buf = new StringBuilder();
        for (algebraOut.RelationlAlgebraParser.InitialRelationContext ictx : ctx.initialRelation()) {
            buf.append(visit(ictx));
            buf.append("\n");
        }
        return buf.toString();
    }

    @Override
    public String visitAlias(RelationlAlgebraParser.AliasContext ctx) {
        String oldname = visit(ctx.expr());
        String newname = visit(ctx.newname());
        return oldname + " AS " + newname + " ";
    }

    @Override
    public String visitRelationExpr(algebraOut.RelationlAlgebraParser.RelationExprContext ctx) {
        StringBuilder buf = new StringBuilder();
        for (algebraOut.RelationlAlgebraParser.ExprContext ectx : ctx.expr()) {
            buf.append(visit(ectx));
            buf.append(";\n\n");
        }
        return buf.toString();
    }

    private ArrayList<String> commonList(Table table1, Table table2) {
        ArrayList<String> list1 = table1.getAttributes();
        ArrayList<String> list2 = table2.getAttributes();
        ArrayList<String> commomList = new ArrayList<String>();
        for (String attr : list1) {
            if (list2.indexOf(attr) != -1) commomList.add(attr);
        }
        return commomList;
    }

    private ArrayList<String> moreList(Table table1, Table table2) {
        ArrayList<String> list1 = table1.getAttributes();
        ArrayList<String> list2 = table2.getAttributes();
        ArrayList<String> moreList = new ArrayList<String>();
        for (String attr : list1) {
            if (list2.indexOf(attr) == -1) moreList.add(attr);
        }
        return moreList;
    }

}
