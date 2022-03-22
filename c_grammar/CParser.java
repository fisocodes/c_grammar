// Generated from C.g4 by ANTLR 4.9.2
package c_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOMMENT=1, MCOMMENT=2, VOID=3, MAIN=4, PRINT=5, IF=6, ELSE=7, GREATHER=8, 
		LESSER=9, EQUALS=10, GREATEQUAL=11, LESSEQUAL=12, AND=13, OR=14, LP=15, 
		RP=16, LCB=17, RCB=18, SEMI=19, MUL=20, DIV=21, ADD=22, SUB=23, TYPE=24, 
		ASSIGN=25, FALSE=26, VALUE=27, TRUE=28, ID=29, BLANKS=30;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_declaration = 3, 
		RULE_assignment = 4, RULE_expression = 5, RULE_print = 6, RULE_ifelse = 7, 
		RULE_ifblock = 8, RULE_elseblock = 9, RULE_elseifblock = 10, RULE_condition = 11, 
		RULE_lo = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "statement", "declaration", "assignment", "expression", 
			"print", "ifelse", "ifblock", "elseblock", "elseifblock", "condition", 
			"lo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'void'", "'main'", "'printf'", "'if'", "'else'", "'>'", 
			"'<'", "'=='", "'>='", "'<='", "'&&'", "'||'", "'('", "')'", "'{'", "'}'", 
			"';'", "'*'", "'/'", "'+'", "'-'", "'int'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOMMENT", "MCOMMENT", "VOID", "MAIN", "PRINT", "IF", "ELSE", 
			"GREATHER", "LESSER", "EQUALS", "GREATEQUAL", "LESSEQUAL", "AND", "OR", 
			"LP", "RP", "LCB", "RCB", "SEMI", "MUL", "DIV", "ADD", "SUB", "TYPE", 
			"ASSIGN", "FALSE", "VALUE", "TRUE", "ID", "BLANKS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			main();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(CParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(CParser.MAIN, 0); }
		public TerminalNode LP() { return getToken(CParser.LP, 0); }
		public TerminalNode RP() { return getToken(CParser.RP, 0); }
		public TerminalNode LCB() { return getToken(CParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(CParser.RCB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(VOID);
			setState(29);
			match(MAIN);
			setState(30);
			match(LP);
			setState(31);
			match(RP);
			setState(32);
			match(LCB);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << LP) | (1L << TYPE) | (1L << VALUE) | (1L << ID))) != 0)) {
				{
				{
				setState(33);
				statement();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(RCB);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CParser.SEMI, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				declaration();
				setState(42);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				assignment();
				setState(45);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				expression(0);
				setState(48);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				print();
				setState(51);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				ifelse();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(TYPE);
			setState(57);
			match(ID);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(ASSIGN);
			setState(61);
			expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdExpContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
		public IdExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIdExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CParser.DIV, 0); }
		public MulDivExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitMulDivExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends ExpressionContext {
		public TerminalNode LP() { return getToken(CParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CParser.RP, 0); }
		public ParenExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CParser.SUB, 0); }
		public AddSubExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAddSubExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueExpContext extends ExpressionContext {
		public TerminalNode VALUE() { return getToken(CParser.VALUE, 0); }
		public ValueExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitValueExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				{
				_localctx = new ValueExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(64);
				match(VALUE);
				}
				break;
			case ID:
				{
				_localctx = new IdExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(ID);
				}
				break;
			case LP:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(LP);
				setState(67);
				expression(0);
				setState(68);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(72);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(73);
						((MulDivExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(74);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(76);
						((AddSubExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CParser.PRINT, 0); }
		public TerminalNode LP() { return getToken(CParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CParser.RP, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(PRINT);
			setState(84);
			match(LP);
			setState(85);
			expression(0);
			setState(86);
			match(RP);
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

	public static class IfelseContext extends ParserRuleContext {
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public List<ElseifblockContext> elseifblock() {
			return getRuleContexts(ElseifblockContext.class);
		}
		public ElseifblockContext elseifblock(int i) {
			return getRuleContext(ElseifblockContext.class,i);
		}
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifelse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			ifblock();
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					elseifblock();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(95);
				elseblock();
				}
				break;
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

	public static class IfblockContext extends ParserRuleContext {
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
	 
		public IfblockContext() { }
		public void copyFrom(IfblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfBracesContext extends IfblockContext {
		public TerminalNode IF() { return getToken(CParser.IF, 0); }
		public TerminalNode LP() { return getToken(CParser.LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CParser.RP, 0); }
		public TerminalNode LCB() { return getToken(CParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(CParser.RCB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfBracesContext(IfblockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIfBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfNoBracesContext extends IfblockContext {
		public TerminalNode IF() { return getToken(CParser.IF, 0); }
		public TerminalNode LP() { return getToken(CParser.LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfNoBracesContext(IfblockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIfNoBraces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifblock);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IfNoBracesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(IF);
				setState(99);
				match(LP);
				setState(100);
				condition(0);
				setState(101);
				match(RP);
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(102);
					statement();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new IfBracesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(IF);
				setState(106);
				match(LP);
				setState(107);
				condition(0);
				setState(108);
				match(RP);
				setState(109);
				match(LCB);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << LP) | (1L << TYPE) | (1L << VALUE) | (1L << ID))) != 0)) {
					{
					{
					setState(110);
					statement();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(RCB);
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

	public static class ElseblockContext extends ParserRuleContext {
		public ElseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblock; }
	 
		public ElseblockContext() { }
		public void copyFrom(ElseblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseBracesContext extends ElseblockContext {
		public TerminalNode ELSE() { return getToken(CParser.ELSE, 0); }
		public TerminalNode LCB() { return getToken(CParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(CParser.RCB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseBracesContext(ElseblockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitElseBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseNoBracesContext extends ElseblockContext {
		public TerminalNode ELSE() { return getToken(CParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseNoBracesContext(ElseblockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitElseNoBraces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseblockContext elseblock() throws RecognitionException {
		ElseblockContext _localctx = new ElseblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseblock);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ElseNoBracesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(ELSE);
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(121);
					statement();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ElseBracesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(ELSE);
				setState(125);
				match(LCB);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << LP) | (1L << TYPE) | (1L << VALUE) | (1L << ID))) != 0)) {
					{
					{
					setState(126);
					statement();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(RCB);
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

	public static class ElseifblockContext extends ParserRuleContext {
		public ElseifblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifblock; }
	 
		public ElseifblockContext() { }
		public void copyFrom(ElseifblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseifNoBracesContext extends ElseifblockContext {
		public TerminalNode ELSE() { return getToken(CParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CParser.IF, 0); }
		public TerminalNode LP() { return getToken(CParser.LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseifNoBracesContext(ElseifblockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitElseifNoBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseifBracesContext extends ElseifblockContext {
		public TerminalNode ELSE() { return getToken(CParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CParser.IF, 0); }
		public TerminalNode LP() { return getToken(CParser.LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CParser.RP, 0); }
		public TerminalNode LCB() { return getToken(CParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(CParser.RCB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseifBracesContext(ElseifblockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitElseifBraces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifblockContext elseifblock() throws RecognitionException {
		ElseifblockContext _localctx = new ElseifblockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseifblock);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ElseifNoBracesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(ELSE);
				setState(136);
				match(IF);
				setState(137);
				match(LP);
				setState(138);
				condition(0);
				setState(139);
				match(RP);
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(140);
					statement();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ElseifBracesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(ELSE);
				setState(144);
				match(IF);
				setState(145);
				match(LP);
				setState(146);
				condition(0);
				setState(147);
				match(RP);
				setState(148);
				match(LCB);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << LP) | (1L << TYPE) | (1L << VALUE) | (1L << ID))) != 0)) {
					{
					{
					setState(149);
					statement();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(RCB);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueCondContext extends ConditionContext {
		public TerminalNode TRUE() { return getToken(CParser.TRUE, 0); }
		public TrueCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitTrueCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseCondContext extends ConditionContext {
		public TerminalNode FALSE() { return getToken(CParser.FALSE, 0); }
		public FalseCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFalseCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpCondContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LoContext lo() {
			return getRuleContext(LoContext.class,0);
		}
		public ExpCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExpCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondCondContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public LoContext lo() {
			return getRuleContext(LoContext.class,0);
		}
		public CondCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCondCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenCondContext extends ConditionContext {
		public TerminalNode LP() { return getToken(CParser.LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CParser.RP, 0); }
		public ParenCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParenCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ParenCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160);
				match(LP);
				setState(161);
				condition(0);
				setState(162);
				match(RP);
				}
				break;
			case 2:
				{
				_localctx = new ExpCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				expression(0);
				setState(165);
				lo();
				setState(166);
				expression(0);
				}
				break;
			case 3:
				{
				_localctx = new TrueCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(TRUE);
				}
				break;
			case 4:
				{
				_localctx = new FalseCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondCondContext(new ConditionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(172);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(173);
					lo();
					setState(174);
					condition(6);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class LoContext extends ParserRuleContext {
		public TerminalNode GREATHER() { return getToken(CParser.GREATHER, 0); }
		public TerminalNode LESSER() { return getToken(CParser.LESSER, 0); }
		public TerminalNode EQUALS() { return getToken(CParser.EQUALS, 0); }
		public TerminalNode GREATEQUAL() { return getToken(CParser.GREATEQUAL, 0); }
		public TerminalNode LESSEQUAL() { return getToken(CParser.LESSEQUAL, 0); }
		public TerminalNode AND() { return getToken(CParser.AND, 0); }
		public TerminalNode OR() { return getToken(CParser.OR, 0); }
		public LoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoContext lo() throws RecognitionException {
		LoContext _localctx = new LoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATHER) | (1L << LESSER) | (1L << EQUALS) | (1L << GREATEQUAL) | (1L << LESSEQUAL) | (1L << AND) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 11:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3%\n\3"+
		"\f\3\16\3(\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\49\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7I\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7Q\n\7\f\7\16\7T\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\t\5\tc\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\5\nj\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nr\n\n\f\n\16\nu\13\n\3\n\3"+
		"\n\5\ny\n\n\3\13\3\13\5\13}\n\13\3\13\3\13\3\13\7\13\u0082\n\13\f\13\16"+
		"\13\u0085\13\13\3\13\5\13\u0088\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0090"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0099\n\f\f\f\16\f\u009c\13\f\3\f"+
		"\3\f\5\f\u00a0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad"+
		"\n\r\3\r\3\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\3\16\3\16\3\16"+
		"\2\4\f\30\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\26\27\3\2\30\31"+
		"\3\2\n\20\2\u00c4\2\34\3\2\2\2\4\36\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\n=\3"+
		"\2\2\2\fH\3\2\2\2\16U\3\2\2\2\20Z\3\2\2\2\22x\3\2\2\2\24\u0087\3\2\2\2"+
		"\26\u009f\3\2\2\2\30\u00ac\3\2\2\2\32\u00b7\3\2\2\2\34\35\5\4\3\2\35\3"+
		"\3\2\2\2\36\37\7\5\2\2\37 \7\6\2\2 !\7\21\2\2!\"\7\22\2\2\"&\7\23\2\2"+
		"#%\5\6\4\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2"+
		"\2)*\7\24\2\2*\5\3\2\2\2+,\5\b\5\2,-\7\25\2\2-9\3\2\2\2./\5\n\6\2/\60"+
		"\7\25\2\2\609\3\2\2\2\61\62\5\f\7\2\62\63\7\25\2\2\639\3\2\2\2\64\65\5"+
		"\16\b\2\65\66\7\25\2\2\669\3\2\2\2\679\5\20\t\28+\3\2\2\28.\3\2\2\28\61"+
		"\3\2\2\28\64\3\2\2\28\67\3\2\2\29\7\3\2\2\2:;\7\32\2\2;<\7\37\2\2<\t\3"+
		"\2\2\2=>\7\37\2\2>?\7\33\2\2?@\5\f\7\2@\13\3\2\2\2AB\b\7\1\2BI\7\35\2"+
		"\2CI\7\37\2\2DE\7\21\2\2EF\5\f\7\2FG\7\22\2\2GI\3\2\2\2HA\3\2\2\2HC\3"+
		"\2\2\2HD\3\2\2\2IR\3\2\2\2JK\f\7\2\2KL\t\2\2\2LQ\5\f\7\bMN\f\6\2\2NO\t"+
		"\3\2\2OQ\5\f\7\7PJ\3\2\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\r"+
		"\3\2\2\2TR\3\2\2\2UV\7\7\2\2VW\7\21\2\2WX\5\f\7\2XY\7\22\2\2Y\17\3\2\2"+
		"\2Z^\5\22\n\2[]\5\26\f\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3"+
		"\2\2\2`^\3\2\2\2ac\5\24\13\2ba\3\2\2\2bc\3\2\2\2c\21\3\2\2\2de\7\b\2\2"+
		"ef\7\21\2\2fg\5\30\r\2gi\7\22\2\2hj\5\6\4\2ih\3\2\2\2ij\3\2\2\2jy\3\2"+
		"\2\2kl\7\b\2\2lm\7\21\2\2mn\5\30\r\2no\7\22\2\2os\7\23\2\2pr\5\6\4\2q"+
		"p\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\24\2\2"+
		"wy\3\2\2\2xd\3\2\2\2xk\3\2\2\2y\23\3\2\2\2z|\7\t\2\2{}\5\6\4\2|{\3\2\2"+
		"\2|}\3\2\2\2}\u0088\3\2\2\2~\177\7\t\2\2\177\u0083\7\23\2\2\u0080\u0082"+
		"\5\6\4\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\24"+
		"\2\2\u0087z\3\2\2\2\u0087~\3\2\2\2\u0088\25\3\2\2\2\u0089\u008a\7\t\2"+
		"\2\u008a\u008b\7\b\2\2\u008b\u008c\7\21\2\2\u008c\u008d\5\30\r\2\u008d"+
		"\u008f\7\22\2\2\u008e\u0090\5\6\4\2\u008f\u008e\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u00a0\3\2\2\2\u0091\u0092\7\t\2\2\u0092\u0093\7\b\2\2\u0093"+
		"\u0094\7\21\2\2\u0094\u0095\5\30\r\2\u0095\u0096\7\22\2\2\u0096\u009a"+
		"\7\23\2\2\u0097\u0099\5\6\4\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2"+
		"\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009d\u009e\7\24\2\2\u009e\u00a0\3\2\2\2\u009f\u0089\3\2\2\2"+
		"\u009f\u0091\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\b\r\1\2\u00a2\u00a3"+
		"\7\21\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7\22\2\2\u00a5\u00ad\3\2\2"+
		"\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\5\f\7\2\u00a9"+
		"\u00ad\3\2\2\2\u00aa\u00ad\7\36\2\2\u00ab\u00ad\7\34\2\2\u00ac\u00a1\3"+
		"\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00b4\3\2\2\2\u00ae\u00af\f\7\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b1\5"+
		"\30\r\b\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b7\u00b8\t\4\2\2\u00b8\33\3\2\2\2\24&8HPR^bisx|\u0083\u0087\u008f"+
		"\u009a\u009f\u00ac\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}