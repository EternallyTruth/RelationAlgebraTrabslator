// Generated from C:/Users/76165/Desktop/myantlr/src/main/java/com/antlr\RelationlAlgebra.g4 by ANTLR 4.7
package algebraOut;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RelationlAlgebraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RelationlAlgebraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RelationlAlgebraParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(RelationlAlgebraParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link RelationlAlgebraParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(RelationlAlgebraParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link RelationlAlgebraParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(RelationlAlgebraParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationlAlgebraParser#initialRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialRelation(RelationlAlgebraParser.InitialRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationlAlgebraParser#attrlistinitial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrlistinitial(RelationlAlgebraParser.AttrlistinitialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpr(RelationlAlgebraParser.BracketExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code union}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(RelationlAlgebraParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formExpr}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormExpr(RelationlAlgebraParser.FormExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(RelationlAlgebraParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cartesianProduct}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianProduct(RelationlAlgebraParser.CartesianProductContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selection}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(RelationlAlgebraParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rename}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename(RelationlAlgebraParser.RenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoin(RelationlAlgebraParser.NaturalJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intersection}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection(RelationlAlgebraParser.IntersectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alias}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(RelationlAlgebraParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code difference}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifference(RelationlAlgebraParser.DifferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code projection}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(RelationlAlgebraParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code join}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(RelationlAlgebraParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringDomain}
	 * labeled alternative in {@link RelationlAlgebraParser#domain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDomain(RelationlAlgebraParser.StringDomainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intDomain}
	 * labeled alternative in {@link RelationlAlgebraParser#domain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDomain(RelationlAlgebraParser.IntDomainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oldnameIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#oldname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldnameIdentifier(RelationlAlgebraParser.OldnameIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newnameIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#newname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewnameIdentifier(RelationlAlgebraParser.NewnameIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationlAlgebraParser#attrlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrlist(RelationlAlgebraParser.AttrlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketsCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsCondlist(RelationlAlgebraParser.BracketsCondlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCondlist(RelationlAlgebraParser.NotCondlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparedCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparedCondlist(RelationlAlgebraParser.ComparedCondlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondlist(RelationlAlgebraParser.AndCondlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondlist(RelationlAlgebraParser.OrCondlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(RelationlAlgebraParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonEqual}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEqual(RelationlAlgebraParser.NonEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(RelationlAlgebraParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterEqual}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqual(RelationlAlgebraParser.GreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(RelationlAlgebraParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(RelationlAlgebraParser.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternMatch}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternMatch(RelationlAlgebraParser.PatternMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributeCompared}
	 * labeled alternative in {@link RelationlAlgebraParser#compared}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeCompared(RelationlAlgebraParser.AttributeComparedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringCompared}
	 * labeled alternative in {@link RelationlAlgebraParser#compared}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCompared(RelationlAlgebraParser.StringComparedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberCompared}
	 * labeled alternative in {@link RelationlAlgebraParser#compared}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberCompared(RelationlAlgebraParser.NumberComparedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationIdentifier(RelationlAlgebraParser.RelationIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributeIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeIdentifier(RelationlAlgebraParser.AttributeIdentifierContext ctx);
}