// Generated from C:/Users/76165/Desktop/myantlr/src/main/java/com/antlr\RelationlAlgebra.g4 by ANTLR 4.7
package algebraOut;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelationlAlgebraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PROJECTION=8, 
		SELECTION=9, UNION=10, DIFFERENCE=11, CARTESIAN_PRODUCT=12, INTERSECTION=13, 
		NATURAL_JOIN=14, JOIN=15, DIVISION=16, RENAME=17, ALIAS=18, AS=19, EQUAL=20, 
		NOT_EQUAL=21, GREATER_THAN=22, GREATER_EQUAL=23, LESS_THAN=24, LESS_EQUAL=25, 
		MATCH=26, AND=27, OR=28, NOT=29, CHAR=30, INT=31, STRING=32, IDENTIFIER=33, 
		NUMBER=34, WS=35, COMMENT=36, LINE_COMMENT=37;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_initialRelation = 2, RULE_attrlistinitial = 3, 
		RULE_expr = 4, RULE_domain = 5, RULE_oldname = 6, RULE_newname = 7, RULE_attrlist = 8, 
		RULE_condlist = 9, RULE_comparator = 10, RULE_compared = 11, RULE_relation = 12, 
		RULE_attribute = 13;
	public static final String[] ruleNames = {
		"prog", "start", "initialRelation", "attrlistinitial", "expr", "domain", 
		"oldname", "newname", "attrlist", "condlist", "comparator", "compared", 
		"relation", "attribute"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "':'", "','", "'['", "']'", null, null, null, 
		null, null, null, null, null, null, null, null, null, "'='", null, "'>'", 
		"'>='", "'<'", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "PROJECTION", "SELECTION", 
		"UNION", "DIFFERENCE", "CARTESIAN_PRODUCT", "INTERSECTION", "NATURAL_JOIN", 
		"JOIN", "DIVISION", "RENAME", "ALIAS", "AS", "EQUAL", "NOT_EQUAL", "GREATER_THAN", 
		"GREATER_EQUAL", "LESS_THAN", "LESS_EQUAL", "MATCH", "AND", "OR", "NOT", 
		"CHAR", "INT", "STRING", "IDENTIFIER", "NUMBER", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RelationlAlgebra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RelationlAlgebraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				start();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROJECTION) | (1L << SELECTION) | (1L << RENAME) | (1L << ALIAS) | (1L << IDENTIFIER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateTableContext extends StartContext {
		public List<InitialRelationContext> initialRelation() {
			return getRuleContexts(InitialRelationContext.class);
		}
		public InitialRelationContext initialRelation(int i) {
			return getRuleContext(InitialRelationContext.class,i);
		}
		public CreateTableContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationExprContext extends StartContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelationExprContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitRelationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			int _alt;
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new RelationExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(33);
						expr(0);
						setState(34);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(38); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(40);
						initialRelation();
						setState(41);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(45); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialRelationContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public AttrlistinitialContext attrlistinitial() {
			return getRuleContext(AttrlistinitialContext.class,0);
		}
		public InitialRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterInitialRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitInitialRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitInitialRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialRelationContext initialRelation() throws RecognitionException {
		InitialRelationContext _localctx = new InitialRelationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initialRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			relation();
			setState(50);
			match(T__1);
			setState(51);
			attrlistinitial();
			setState(52);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrlistinitialContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<DomainContext> domain() {
			return getRuleContexts(DomainContext.class);
		}
		public DomainContext domain(int i) {
			return getRuleContext(DomainContext.class,i);
		}
		public AttrlistinitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrlistinitial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterAttrlistinitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitAttrlistinitial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitAttrlistinitial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrlistinitialContext attrlistinitial() throws RecognitionException {
		AttrlistinitialContext _localctx = new AttrlistinitialContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attrlistinitial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			attribute();
			setState(55);
			match(T__3);
			setState(56);
			domain();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(57);
				match(T__4);
				setState(58);
				attribute();
				setState(59);
				match(T__3);
				setState(60);
				domain();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterBracketExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitBracketExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitBracketExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode UNION() { return getToken(RelationlAlgebraParser.UNION, 0); }
		public UnionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormExprContext extends ExprContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public FormExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterFormExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitFormExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitFormExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(RelationlAlgebraParser.DIVISION, 0); }
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CartesianProductContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CARTESIAN_PRODUCT() { return getToken(RelationlAlgebraParser.CARTESIAN_PRODUCT, 0); }
		public CartesianProductContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterCartesianProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitCartesianProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitCartesianProduct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectionContext extends ExprContext {
		public TerminalNode SELECTION() { return getToken(RelationlAlgebraParser.SELECTION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CondlistContext> condlist() {
			return getRuleContexts(CondlistContext.class);
		}
		public CondlistContext condlist(int i) {
			return getRuleContext(CondlistContext.class,i);
		}
		public SelectionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameContext extends ExprContext {
		public TerminalNode RENAME() { return getToken(RelationlAlgebraParser.RENAME, 0); }
		public OldnameContext oldname() {
			return getRuleContext(OldnameContext.class,0);
		}
		public NewnameContext newname() {
			return getRuleContext(NewnameContext.class,0);
		}
		public List<AttrlistContext> attrlist() {
			return getRuleContexts(AttrlistContext.class);
		}
		public AttrlistContext attrlist(int i) {
			return getRuleContext(AttrlistContext.class,i);
		}
		public RenameContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitRename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaturalJoinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NATURAL_JOIN() { return getToken(RelationlAlgebraParser.NATURAL_JOIN, 0); }
		public NaturalJoinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterNaturalJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitNaturalJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitNaturalJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntersectionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INTERSECTION() { return getToken(RelationlAlgebraParser.INTERSECTION, 0); }
		public IntersectionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterIntersection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitIntersection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitIntersection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasContext extends ExprContext {
		public TerminalNode ALIAS() { return getToken(RelationlAlgebraParser.ALIAS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(RelationlAlgebraParser.AS, 0); }
		public NewnameContext newname() {
			return getRuleContext(NewnameContext.class,0);
		}
		public AliasContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifferenceContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIFFERENCE() { return getToken(RelationlAlgebraParser.DIFFERENCE, 0); }
		public DifferenceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitDifference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitDifference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectionContext extends ExprContext {
		public TerminalNode PROJECTION() { return getToken(RelationlAlgebraParser.PROJECTION, 0); }
		public AttrlistContext attrlist() {
			return getRuleContext(AttrlistContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProjectionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(RelationlAlgebraParser.JOIN, 0); }
		public CondlistContext condlist() {
			return getRuleContext(CondlistContext.class,0);
		}
		public JoinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new FormExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(68);
				relation();
				}
				break;
			case T__1:
				{
				_localctx = new BracketExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(T__1);
				setState(70);
				expr(0);
				setState(71);
				match(T__2);
				}
				break;
			case SELECTION:
				{
				_localctx = new SelectionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(SELECTION);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(74);
					match(T__5);
					setState(75);
					condlist(0);
					setState(76);
					match(T__6);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(T__1);
				setState(84);
				expr(0);
				setState(85);
				match(T__2);
				}
				break;
			case PROJECTION:
				{
				_localctx = new ProjectionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(PROJECTION);
				setState(88);
				match(T__5);
				setState(89);
				attrlist();
				setState(90);
				match(T__6);
				setState(91);
				match(T__1);
				setState(92);
				expr(0);
				setState(93);
				match(T__2);
				}
				break;
			case RENAME:
				{
				_localctx = new RenameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(RENAME);
				setState(96);
				match(T__1);
				setState(97);
				oldname();
				setState(98);
				match(T__2);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(99);
					match(T__5);
					setState(100);
					attrlist();
					setState(101);
					match(T__6);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(T__1);
				setState(109);
				newname();
				setState(110);
				match(T__2);
				}
				break;
			case ALIAS:
				{
				_localctx = new AliasContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(ALIAS);
				setState(113);
				match(T__1);
				setState(114);
				expr(0);
				setState(115);
				match(T__2);
				setState(116);
				match(AS);
				setState(117);
				newname();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new UnionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(122);
						match(UNION);
						setState(123);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(125);
						match(INTERSECTION);
						setState(126);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new DifferenceContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(128);
						match(DIFFERENCE);
						setState(129);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(131);
						match(DIVISION);
						setState(132);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new CartesianProductContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(134);
						match(CARTESIAN_PRODUCT);
						setState(135);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new NaturalJoinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						match(NATURAL_JOIN);
						setState(138);
						expr(5);
						}
						break;
					case 7:
						{
						_localctx = new JoinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(140);
						match(JOIN);
						setState(141);
						expr(0);
						setState(142);
						match(T__5);
						setState(143);
						condlist(0);
						setState(144);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DomainContext extends ParserRuleContext {
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
	 
		public DomainContext() { }
		public void copyFrom(DomainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringDomainContext extends DomainContext {
		public TerminalNode CHAR() { return getToken(RelationlAlgebraParser.CHAR, 0); }
		public TerminalNode NUMBER() { return getToken(RelationlAlgebraParser.NUMBER, 0); }
		public StringDomainContext(DomainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterStringDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitStringDomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitStringDomain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDomainContext extends DomainContext {
		public TerminalNode INT() { return getToken(RelationlAlgebraParser.INT, 0); }
		public IntDomainContext(DomainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterIntDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitIntDomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitIntDomain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_domain);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				_localctx = new StringDomainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(CHAR);
				setState(152);
				match(T__1);
				setState(153);
				match(NUMBER);
				setState(154);
				match(T__2);
				}
				break;
			case INT:
				_localctx = new IntDomainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OldnameContext extends ParserRuleContext {
		public OldnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oldname; }
	 
		public OldnameContext() { }
		public void copyFrom(OldnameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OldnameIdentifierContext extends OldnameContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(RelationlAlgebraParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RelationlAlgebraParser.IDENTIFIER, i);
		}
		public OldnameIdentifierContext(OldnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterOldnameIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitOldnameIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitOldnameIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OldnameContext oldname() throws RecognitionException {
		OldnameContext _localctx = new OldnameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_oldname);
		int _la;
		try {
			_localctx = new OldnameIdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				match(IDENTIFIER);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewnameContext extends ParserRuleContext {
		public NewnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newname; }
	 
		public NewnameContext() { }
		public void copyFrom(NewnameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewnameIdentifierContext extends NewnameContext {
		public TerminalNode IDENTIFIER() { return getToken(RelationlAlgebraParser.IDENTIFIER, 0); }
		public NewnameIdentifierContext(NewnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterNewnameIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitNewnameIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitNewnameIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewnameContext newname() throws RecognitionException {
		NewnameContext _localctx = new NewnameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_newname);
		try {
			_localctx = new NewnameIdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrlistContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttrlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterAttrlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitAttrlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitAttrlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrlistContext attrlist() throws RecognitionException {
		AttrlistContext _localctx = new AttrlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attrlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			attribute();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(166);
				match(T__4);
				setState(167);
				attribute();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondlistContext extends ParserRuleContext {
		public CondlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condlist; }
	 
		public CondlistContext() { }
		public void copyFrom(CondlistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketsCondlistContext extends CondlistContext {
		public CondlistContext condlist() {
			return getRuleContext(CondlistContext.class,0);
		}
		public BracketsCondlistContext(CondlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterBracketsCondlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitBracketsCondlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitBracketsCondlist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCondlistContext extends CondlistContext {
		public TerminalNode NOT() { return getToken(RelationlAlgebraParser.NOT, 0); }
		public CondlistContext condlist() {
			return getRuleContext(CondlistContext.class,0);
		}
		public NotCondlistContext(CondlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterNotCondlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitNotCondlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitNotCondlist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparedCondlistContext extends CondlistContext {
		public List<ComparedContext> compared() {
			return getRuleContexts(ComparedContext.class);
		}
		public ComparedContext compared(int i) {
			return getRuleContext(ComparedContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparedCondlistContext(CondlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterComparedCondlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitComparedCondlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitComparedCondlist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndCondlistContext extends CondlistContext {
		public List<CondlistContext> condlist() {
			return getRuleContexts(CondlistContext.class);
		}
		public CondlistContext condlist(int i) {
			return getRuleContext(CondlistContext.class,i);
		}
		public TerminalNode AND() { return getToken(RelationlAlgebraParser.AND, 0); }
		public AndCondlistContext(CondlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterAndCondlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitAndCondlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitAndCondlist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrCondlistContext extends CondlistContext {
		public List<CondlistContext> condlist() {
			return getRuleContexts(CondlistContext.class);
		}
		public CondlistContext condlist(int i) {
			return getRuleContext(CondlistContext.class,i);
		}
		public TerminalNode OR() { return getToken(RelationlAlgebraParser.OR, 0); }
		public OrCondlistContext(CondlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterOrCondlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitOrCondlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitOrCondlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondlistContext condlist() throws RecognitionException {
		return condlist(0);
	}

	private CondlistContext condlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondlistContext _localctx = new CondlistContext(_ctx, _parentState);
		CondlistContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_condlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotCondlistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				match(NOT);
				setState(175);
				condlist(3);
				}
				break;
			case T__1:
				{
				_localctx = new BracketsCondlistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(T__1);
				setState(177);
				condlist(0);
				setState(178);
				match(T__2);
				}
				break;
			case STRING:
			case IDENTIFIER:
			case NUMBER:
				{
				_localctx = new ComparedCondlistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				compared();
				setState(181);
				comparator();
				setState(182);
				compared();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new OrCondlistContext(new CondlistContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condlist);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						match(OR);
						setState(188);
						condlist(6);
						}
						break;
					case 2:
						{
						_localctx = new AndCondlistContext(new CondlistContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condlist);
						setState(189);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(190);
						match(AND);
						setState(191);
						condlist(5);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	 
		public ComparatorContext() { }
		public void copyFrom(ComparatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualContext extends ComparatorContext {
		public TerminalNode EQUAL() { return getToken(RelationlAlgebraParser.EQUAL, 0); }
		public EqualContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatternMatchContext extends ComparatorContext {
		public TerminalNode MATCH() { return getToken(RelationlAlgebraParser.MATCH, 0); }
		public PatternMatchContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterPatternMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitPatternMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitPatternMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ComparatorContext {
		public TerminalNode LESS_THAN() { return getToken(RelationlAlgebraParser.LESS_THAN, 0); }
		public LessThanContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualContext extends ComparatorContext {
		public TerminalNode GREATER_EQUAL() { return getToken(RelationlAlgebraParser.GREATER_EQUAL, 0); }
		public GreaterEqualContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterGreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitGreaterEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitGreaterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualContext extends ComparatorContext {
		public TerminalNode LESS_EQUAL() { return getToken(RelationlAlgebraParser.LESS_EQUAL, 0); }
		public LessEqualContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitLessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonEqualContext extends ComparatorContext {
		public TerminalNode NOT_EQUAL() { return getToken(RelationlAlgebraParser.NOT_EQUAL, 0); }
		public NonEqualContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterNonEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitNonEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitNonEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ComparatorContext {
		public TerminalNode GREATER_THAN() { return getToken(RelationlAlgebraParser.GREATER_THAN, 0); }
		public GreaterThanContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparator);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(EQUAL);
				}
				break;
			case NOT_EQUAL:
				_localctx = new NonEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(NOT_EQUAL);
				}
				break;
			case GREATER_THAN:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(GREATER_THAN);
				}
				break;
			case GREATER_EQUAL:
				_localctx = new GreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(GREATER_EQUAL);
				}
				break;
			case LESS_THAN:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(LESS_THAN);
				}
				break;
			case LESS_EQUAL:
				_localctx = new LessEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(LESS_EQUAL);
				}
				break;
			case MATCH:
				_localctx = new PatternMatchContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				match(MATCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparedContext extends ParserRuleContext {
		public ComparedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compared; }
	 
		public ComparedContext() { }
		public void copyFrom(ComparedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberComparedContext extends ComparedContext {
		public TerminalNode NUMBER() { return getToken(RelationlAlgebraParser.NUMBER, 0); }
		public NumberComparedContext(ComparedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterNumberCompared(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitNumberCompared(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitNumberCompared(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeComparedContext extends ComparedContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributeComparedContext(ComparedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterAttributeCompared(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitAttributeCompared(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitAttributeCompared(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringComparedContext extends ComparedContext {
		public TerminalNode STRING() { return getToken(RelationlAlgebraParser.STRING, 0); }
		public StringComparedContext(ComparedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterStringCompared(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitStringCompared(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitStringCompared(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparedContext compared() throws RecognitionException {
		ComparedContext _localctx = new ComparedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compared);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new AttributeComparedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				attribute();
				}
				break;
			case STRING:
				_localctx = new StringComparedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NumberComparedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationIdentifierContext extends RelationContext {
		public TerminalNode IDENTIFIER() { return getToken(RelationlAlgebraParser.IDENTIFIER, 0); }
		public RelationIdentifierContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterRelationIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitRelationIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitRelationIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relation);
		try {
			_localctx = new RelationIdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttributeIdentifierContext extends AttributeContext {
		public TerminalNode IDENTIFIER() { return getToken(RelationlAlgebraParser.IDENTIFIER, 0); }
		public AttributeIdentifierContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).enterAttributeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationlAlgebraListener ) ((RelationlAlgebraListener)listener).exitAttributeIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationlAlgebraVisitor ) return ((RelationlAlgebraVisitor<? extends T>)visitor).visitAttributeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attribute);
		try {
			_localctx = new AttributeIdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return condlist_sempred((CondlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condlist_sempred(CondlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3"+
		"\3\3\6\3\'\n\3\r\3\16\3(\3\3\3\3\3\3\6\3.\n\3\r\3\16\3/\5\3\62\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16\5D\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0095\n\6\f\6\16"+
		"\6\u0098\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u009f\n\7\3\b\6\b\u00a2\n\b\r\b"+
		"\16\b\u00a3\3\t\3\t\3\n\3\n\3\n\7\n\u00ab\n\n\f\n\16\n\u00ae\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bb\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00c3\n\13\f\13\16\13\u00c6\13\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cf\n\f\3\r\3\r\3\r\5\r\u00d4\n\r\3\16\3"+
		"\16\3\17\3\17\3\17\2\4\n\24\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2"+
		"\2\u00ed\2\37\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b8\3\2\2\2\ny\3\2\2\2"+
		"\f\u009e\3\2\2\2\16\u00a1\3\2\2\2\20\u00a5\3\2\2\2\22\u00a7\3\2\2\2\24"+
		"\u00ba\3\2\2\2\26\u00ce\3\2\2\2\30\u00d3\3\2\2\2\32\u00d5\3\2\2\2\34\u00d7"+
		"\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"\3\3\2\2\2#$\5\n\6\2$%\7\3\2\2%\'\3\2\2\2&#\3\2\2\2\'(\3\2\2\2(&\3\2\2"+
		"\2()\3\2\2\2)\62\3\2\2\2*+\5\6\4\2+,\7\3\2\2,.\3\2\2\2-*\3\2\2\2./\3\2"+
		"\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61&\3\2\2\2\61-\3\2\2\2\62\5"+
		"\3\2\2\2\63\64\5\32\16\2\64\65\7\4\2\2\65\66\5\b\5\2\66\67\7\5\2\2\67"+
		"\7\3\2\2\289\5\34\17\29:\7\6\2\2:B\5\f\7\2;<\7\7\2\2<=\5\34\17\2=>\7\6"+
		"\2\2>?\5\f\7\2?A\3\2\2\2@;\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t\3"+
		"\2\2\2DB\3\2\2\2EF\b\6\1\2Fz\5\32\16\2GH\7\4\2\2HI\5\n\6\2IJ\7\5\2\2J"+
		"z\3\2\2\2KR\7\13\2\2LM\7\b\2\2MN\5\24\13\2NO\7\t\2\2OQ\3\2\2\2PL\3\2\2"+
		"\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\4\2\2VW\5\n\6"+
		"\2WX\7\5\2\2Xz\3\2\2\2YZ\7\n\2\2Z[\7\b\2\2[\\\5\22\n\2\\]\7\t\2\2]^\7"+
		"\4\2\2^_\5\n\6\2_`\7\5\2\2`z\3\2\2\2ab\7\23\2\2bc\7\4\2\2cd\5\16\b\2d"+
		"k\7\5\2\2ef\7\b\2\2fg\5\22\n\2gh\7\t\2\2hj\3\2\2\2ie\3\2\2\2jm\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\4\2\2op\5\20\t\2pq\7\5\2"+
		"\2qz\3\2\2\2rs\7\24\2\2st\7\4\2\2tu\5\n\6\2uv\7\5\2\2vw\7\25\2\2wx\5\20"+
		"\t\2xz\3\2\2\2yE\3\2\2\2yG\3\2\2\2yK\3\2\2\2yY\3\2\2\2ya\3\2\2\2yr\3\2"+
		"\2\2z\u0096\3\2\2\2{|\f\r\2\2|}\7\f\2\2}\u0095\5\n\6\16~\177\f\f\2\2\177"+
		"\u0080\7\17\2\2\u0080\u0095\5\n\6\r\u0081\u0082\f\13\2\2\u0082\u0083\7"+
		"\r\2\2\u0083\u0095\5\n\6\f\u0084\u0085\f\n\2\2\u0085\u0086\7\22\2\2\u0086"+
		"\u0095\5\n\6\13\u0087\u0088\f\7\2\2\u0088\u0089\7\16\2\2\u0089\u0095\5"+
		"\n\6\b\u008a\u008b\f\6\2\2\u008b\u008c\7\20\2\2\u008c\u0095\5\n\6\7\u008d"+
		"\u008e\f\5\2\2\u008e\u008f\7\21\2\2\u008f\u0090\5\n\6\2\u0090\u0091\7"+
		"\b\2\2\u0091\u0092\5\24\13\2\u0092\u0093\7\t\2\2\u0093\u0095\3\2\2\2\u0094"+
		"{\3\2\2\2\u0094~\3\2\2\2\u0094\u0081\3\2\2\2\u0094\u0084\3\2\2\2\u0094"+
		"\u0087\3\2\2\2\u0094\u008a\3\2\2\2\u0094\u008d\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\13\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009a\7 \2\2\u009a\u009b\7\4\2\2\u009b\u009c\7$\2\2\u009c"+
		"\u009f\7\5\2\2\u009d\u009f\7!\2\2\u009e\u0099\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\r\3\2\2\2\u00a0\u00a2\7#\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\17\3\2\2\2\u00a5"+
		"\u00a6\7#\2\2\u00a6\21\3\2\2\2\u00a7\u00ac\5\34\17\2\u00a8\u00a9\7\7\2"+
		"\2\u00a9\u00ab\5\34\17\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b0\b\13\1\2\u00b0\u00b1\7\37\2\2\u00b1\u00bb\5\24\13\5\u00b2"+
		"\u00b3\7\4\2\2\u00b3\u00b4\5\24\13\2\u00b4\u00b5\7\5\2\2\u00b5\u00bb\3"+
		"\2\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\5\26\f\2\u00b8\u00b9\5\30\r\2"+
		"\u00b9\u00bb\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b6"+
		"\3\2\2\2\u00bb\u00c4\3\2\2\2\u00bc\u00bd\f\7\2\2\u00bd\u00be\7\36\2\2"+
		"\u00be\u00c3\5\24\13\b\u00bf\u00c0\f\6\2\2\u00c0\u00c1\7\35\2\2\u00c1"+
		"\u00c3\5\24\13\7\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\25\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00cf\7\26\2\2\u00c8\u00cf\7\27\2\2\u00c9\u00cf\7"+
		"\30\2\2\u00ca\u00cf\7\31\2\2\u00cb\u00cf\7\32\2\2\u00cc\u00cf\7\33\2\2"+
		"\u00cd\u00cf\7\34\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9"+
		"\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\27\3\2\2\2\u00d0\u00d4\5\34\17\2\u00d1\u00d4\7\""+
		"\2\2\u00d2\u00d4\7$\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\31\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6\33\3\2\2\2\u00d7"+
		"\u00d8\7#\2\2\u00d8\35\3\2\2\2\24!(/\61BRky\u0094\u0096\u009e\u00a3\u00ac"+
		"\u00ba\u00c2\u00c4\u00ce\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}