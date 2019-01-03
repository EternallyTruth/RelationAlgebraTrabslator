// Generated from C:/Users/76165/Desktop/myantlr/src/main/java/com/antlr\RelationlAlgebra.g4 by ANTLR 4.7
package algebraOut;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RelationlAlgebraParser}.
 */
public interface RelationlAlgebraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RelationlAlgebraParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RelationlAlgebraParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationlAlgebraParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RelationlAlgebraParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link RelationlAlgebraParser#start}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(RelationlAlgebraParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link RelationlAlgebraParser#start}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(RelationlAlgebraParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link RelationlAlgebraParser#start}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(RelationlAlgebraParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link RelationlAlgebraParser#start}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(RelationlAlgebraParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationlAlgebraParser#initialRelation}.
	 * @param ctx the parse tree
	 */
	void enterInitialRelation(RelationlAlgebraParser.InitialRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationlAlgebraParser#initialRelation}.
	 * @param ctx the parse tree
	 */
	void exitInitialRelation(RelationlAlgebraParser.InitialRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationlAlgebraParser#attrlistinitial}.
	 * @param ctx the parse tree
	 */
	void enterAttrlistinitial(RelationlAlgebraParser.AttrlistinitialContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationlAlgebraParser#attrlistinitial}.
	 * @param ctx the parse tree
	 */
	void exitAttrlistinitial(RelationlAlgebraParser.AttrlistinitialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpr(RelationlAlgebraParser.BracketExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpr(RelationlAlgebraParser.BracketExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code union}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnion(RelationlAlgebraParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code union}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnion(RelationlAlgebraParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formExpr}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFormExpr(RelationlAlgebraParser.FormExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formExpr}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFormExpr(RelationlAlgebraParser.FormExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(RelationlAlgebraParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(RelationlAlgebraParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cartesianProduct}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProduct(RelationlAlgebraParser.CartesianProductContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cartesianProduct}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProduct(RelationlAlgebraParser.CartesianProductContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selection}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelection(RelationlAlgebraParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selection}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelection(RelationlAlgebraParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rename}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRename(RelationlAlgebraParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rename}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRename(RelationlAlgebraParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoin(RelationlAlgebraParser.NaturalJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoin(RelationlAlgebraParser.NaturalJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intersection}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntersection(RelationlAlgebraParser.IntersectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intersection}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntersection(RelationlAlgebraParser.IntersectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alias}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAlias(RelationlAlgebraParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alias}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAlias(RelationlAlgebraParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code difference}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDifference(RelationlAlgebraParser.DifferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code difference}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDifference(RelationlAlgebraParser.DifferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code projection}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterProjection(RelationlAlgebraParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code projection}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitProjection(RelationlAlgebraParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code join}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJoin(RelationlAlgebraParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code join}
	 * labeled alternative in {@link RelationlAlgebraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJoin(RelationlAlgebraParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringDomain}
	 * labeled alternative in {@link RelationlAlgebraParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterStringDomain(RelationlAlgebraParser.StringDomainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDomain}
	 * labeled alternative in {@link RelationlAlgebraParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitStringDomain(RelationlAlgebraParser.StringDomainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intDomain}
	 * labeled alternative in {@link RelationlAlgebraParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterIntDomain(RelationlAlgebraParser.IntDomainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intDomain}
	 * labeled alternative in {@link RelationlAlgebraParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitIntDomain(RelationlAlgebraParser.IntDomainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oldnameIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#oldname}.
	 * @param ctx the parse tree
	 */
	void enterOldnameIdentifier(RelationlAlgebraParser.OldnameIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oldnameIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#oldname}.
	 * @param ctx the parse tree
	 */
	void exitOldnameIdentifier(RelationlAlgebraParser.OldnameIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newnameIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#newname}.
	 * @param ctx the parse tree
	 */
	void enterNewnameIdentifier(RelationlAlgebraParser.NewnameIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newnameIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#newname}.
	 * @param ctx the parse tree
	 */
	void exitNewnameIdentifier(RelationlAlgebraParser.NewnameIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationlAlgebraParser#attrlist}.
	 * @param ctx the parse tree
	 */
	void enterAttrlist(RelationlAlgebraParser.AttrlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationlAlgebraParser#attrlist}.
	 * @param ctx the parse tree
	 */
	void exitAttrlist(RelationlAlgebraParser.AttrlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketsCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 */
	void enterBracketsCondlist(RelationlAlgebraParser.BracketsCondlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketsCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 */
	void exitBracketsCondlist(RelationlAlgebraParser.BracketsCondlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 */
	void enterNotCondlist(RelationlAlgebraParser.NotCondlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 */
	void exitNotCondlist(RelationlAlgebraParser.NotCondlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparedCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 */
	void enterComparedCondlist(RelationlAlgebraParser.ComparedCondlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparedCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 */
	void exitComparedCondlist(RelationlAlgebraParser.ComparedCondlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 */
	void enterAndCondlist(RelationlAlgebraParser.AndCondlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 */
	void exitAndCondlist(RelationlAlgebraParser.AndCondlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 */
	void enterOrCondlist(RelationlAlgebraParser.OrCondlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orCondlist}
	 * labeled alternative in {@link RelationlAlgebraParser#condlist}.
	 * @param ctx the parse tree
	 */
	void exitOrCondlist(RelationlAlgebraParser.OrCondlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterEqual(RelationlAlgebraParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitEqual(RelationlAlgebraParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonEqual}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterNonEqual(RelationlAlgebraParser.NonEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonEqual}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitNonEqual(RelationlAlgebraParser.NonEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(RelationlAlgebraParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(RelationlAlgebraParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterEqual}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqual(RelationlAlgebraParser.GreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterEqual}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqual(RelationlAlgebraParser.GreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(RelationlAlgebraParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(RelationlAlgebraParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterLessEqual(RelationlAlgebraParser.LessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitLessEqual(RelationlAlgebraParser.LessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code patternMatch}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatch(RelationlAlgebraParser.PatternMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code patternMatch}
	 * labeled alternative in {@link RelationlAlgebraParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatch(RelationlAlgebraParser.PatternMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributeCompared}
	 * labeled alternative in {@link RelationlAlgebraParser#compared}.
	 * @param ctx the parse tree
	 */
	void enterAttributeCompared(RelationlAlgebraParser.AttributeComparedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributeCompared}
	 * labeled alternative in {@link RelationlAlgebraParser#compared}.
	 * @param ctx the parse tree
	 */
	void exitAttributeCompared(RelationlAlgebraParser.AttributeComparedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringCompared}
	 * labeled alternative in {@link RelationlAlgebraParser#compared}.
	 * @param ctx the parse tree
	 */
	void enterStringCompared(RelationlAlgebraParser.StringComparedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringCompared}
	 * labeled alternative in {@link RelationlAlgebraParser#compared}.
	 * @param ctx the parse tree
	 */
	void exitStringCompared(RelationlAlgebraParser.StringComparedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberCompared}
	 * labeled alternative in {@link RelationlAlgebraParser#compared}.
	 * @param ctx the parse tree
	 */
	void enterNumberCompared(RelationlAlgebraParser.NumberComparedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberCompared}
	 * labeled alternative in {@link RelationlAlgebraParser#compared}.
	 * @param ctx the parse tree
	 */
	void exitNumberCompared(RelationlAlgebraParser.NumberComparedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelationIdentifier(RelationlAlgebraParser.RelationIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelationIdentifier(RelationlAlgebraParser.RelationIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributeIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttributeIdentifier(RelationlAlgebraParser.AttributeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributeIdentifier}
	 * labeled alternative in {@link RelationlAlgebraParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttributeIdentifier(RelationlAlgebraParser.AttributeIdentifierContext ctx);
}