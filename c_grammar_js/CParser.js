// Generated from C.g4 by ANTLR 4.9.2
// jshint ignore: start
import antlr4 from 'antlr4';
import CVisitor from './CVisitor.js';


const serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786",
    "\u5964\u0003 \u00ba\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004",
    "\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007",
    "\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f",
    "\u0004\r\t\r\u0004\u000e\t\u000e\u0003\u0002\u0003\u0002\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003",
    "%\n\u0003\f\u0003\u000e\u0003(\u000b\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0004\u0005\u00049\n\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003",
    "\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007I",
    "\n\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007",
    "\u0003\u0007\u0007\u0007Q\n\u0007\f\u0007\u000e\u0007T\u000b\u0007\u0003",
    "\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\t\u0003\t\u0007\t]\n\t\f\t",
    "\u000e\t`\u000b\t\u0003\t\u0005\tc\n\t\u0003\n\u0003\n\u0003\n\u0003",
    "\n\u0003\n\u0005\nj\n\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003",
    "\n\u0007\nr\n\n\f\n\u000e\nu\u000b\n\u0003\n\u0003\n\u0005\ny\n\n\u0003",
    "\u000b\u0003\u000b\u0005\u000b}\n\u000b\u0003\u000b\u0003\u000b\u0003",
    "\u000b\u0007\u000b\u0082\n\u000b\f\u000b\u000e\u000b\u0085\u000b\u000b",
    "\u0003\u000b\u0005\u000b\u0088\n\u000b\u0003\f\u0003\f\u0003\f\u0003",
    "\f\u0003\f\u0003\f\u0005\f\u0090\n\f\u0003\f\u0003\f\u0003\f\u0003\f",
    "\u0003\f\u0003\f\u0003\f\u0007\f\u0099\n\f\f\f\u000e\f\u009c\u000b\f",
    "\u0003\f\u0003\f\u0005\f\u00a0\n\f\u0003\r\u0003\r\u0003\r\u0003\r\u0003",
    "\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0005\r\u00ad\n\r",
    "\u0003\r\u0003\r\u0003\r\u0003\r\u0007\r\u00b3\n\r\f\r\u000e\r\u00b6",
    "\u000b\r\u0003\u000e\u0003\u000e\u0003\u000e\u0002\u0004\f\u0018\u000f",
    "\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0002",
    "\u0005\u0003\u0002\u0018\u0019\u0003\u0002\u001a\u001b\u0003\u0002\f",
    "\u0012\u0002\u00c4\u0002\u001c\u0003\u0002\u0002\u0002\u0004\u001e\u0003",
    "\u0002\u0002\u0002\u00068\u0003\u0002\u0002\u0002\b:\u0003\u0002\u0002",
    "\u0002\n=\u0003\u0002\u0002\u0002\fH\u0003\u0002\u0002\u0002\u000eU",
    "\u0003\u0002\u0002\u0002\u0010Z\u0003\u0002\u0002\u0002\u0012x\u0003",
    "\u0002\u0002\u0002\u0014\u0087\u0003\u0002\u0002\u0002\u0016\u009f\u0003",
    "\u0002\u0002\u0002\u0018\u00ac\u0003\u0002\u0002\u0002\u001a\u00b7\u0003",
    "\u0002\u0002\u0002\u001c\u001d\u0005\u0004\u0003\u0002\u001d\u0003\u0003",
    "\u0002\u0002\u0002\u001e\u001f\u0007\u0005\u0002\u0002\u001f \u0007",
    "\u0006\u0002\u0002 !\u0007\u0013\u0002\u0002!\"\u0007\u0014\u0002\u0002",
    "\"&\u0007\u0015\u0002\u0002#%\u0005\u0006\u0004\u0002$#\u0003\u0002",
    "\u0002\u0002%(\u0003\u0002\u0002\u0002&$\u0003\u0002\u0002\u0002&\'",
    "\u0003\u0002\u0002\u0002\')\u0003\u0002\u0002\u0002(&\u0003\u0002\u0002",
    "\u0002)*\u0007\u0016\u0002\u0002*\u0005\u0003\u0002\u0002\u0002+,\u0005",
    "\b\u0005\u0002,-\u0007\u0017\u0002\u0002-9\u0003\u0002\u0002\u0002.",
    "/\u0005\n\u0006\u0002/0\u0007\u0017\u0002\u000209\u0003\u0002\u0002",
    "\u000212\u0005\f\u0007\u000223\u0007\u0017\u0002\u000239\u0003\u0002",
    "\u0002\u000245\u0005\u000e\b\u000256\u0007\u0017\u0002\u000269\u0003",
    "\u0002\u0002\u000279\u0005\u0010\t\u00028+\u0003\u0002\u0002\u00028",
    ".\u0003\u0002\u0002\u000281\u0003\u0002\u0002\u000284\u0003\u0002\u0002",
    "\u000287\u0003\u0002\u0002\u00029\u0007\u0003\u0002\u0002\u0002:;\u0007",
    "\u001c\u0002\u0002;<\u0007\u001f\u0002\u0002<\t\u0003\u0002\u0002\u0002",
    "=>\u0007\u001f\u0002\u0002>?\u0007\u001d\u0002\u0002?@\u0005\f\u0007",
    "\u0002@\u000b\u0003\u0002\u0002\u0002AB\b\u0007\u0001\u0002BI\u0007",
    "\u001e\u0002\u0002CI\u0007\u001f\u0002\u0002DE\u0007\u0013\u0002\u0002",
    "EF\u0005\f\u0007\u0002FG\u0007\u0014\u0002\u0002GI\u0003\u0002\u0002",
    "\u0002HA\u0003\u0002\u0002\u0002HC\u0003\u0002\u0002\u0002HD\u0003\u0002",
    "\u0002\u0002IR\u0003\u0002\u0002\u0002JK\f\u0007\u0002\u0002KL\t\u0002",
    "\u0002\u0002LQ\u0005\f\u0007\bMN\f\u0006\u0002\u0002NO\t\u0003\u0002",
    "\u0002OQ\u0005\f\u0007\u0007PJ\u0003\u0002\u0002\u0002PM\u0003\u0002",
    "\u0002\u0002QT\u0003\u0002\u0002\u0002RP\u0003\u0002\u0002\u0002RS\u0003",
    "\u0002\u0002\u0002S\r\u0003\u0002\u0002\u0002TR\u0003\u0002\u0002\u0002",
    "UV\u0007\u0007\u0002\u0002VW\u0007\u0013\u0002\u0002WX\u0005\f\u0007",
    "\u0002XY\u0007\u0014\u0002\u0002Y\u000f\u0003\u0002\u0002\u0002Z^\u0005",
    "\u0012\n\u0002[]\u0005\u0016\f\u0002\\[\u0003\u0002\u0002\u0002]`\u0003",
    "\u0002\u0002\u0002^\\\u0003\u0002\u0002\u0002^_\u0003\u0002\u0002\u0002",
    "_b\u0003\u0002\u0002\u0002`^\u0003\u0002\u0002\u0002ac\u0005\u0014\u000b",
    "\u0002ba\u0003\u0002\u0002\u0002bc\u0003\u0002\u0002\u0002c\u0011\u0003",
    "\u0002\u0002\u0002de\u0007\b\u0002\u0002ef\u0007\u0013\u0002\u0002f",
    "g\u0005\u0018\r\u0002gi\u0007\u0014\u0002\u0002hj\u0005\u0006\u0004",
    "\u0002ih\u0003\u0002\u0002\u0002ij\u0003\u0002\u0002\u0002jy\u0003\u0002",
    "\u0002\u0002kl\u0007\b\u0002\u0002lm\u0007\u0013\u0002\u0002mn\u0005",
    "\u0018\r\u0002no\u0007\u0014\u0002\u0002os\u0007\u0015\u0002\u0002p",
    "r\u0005\u0006\u0004\u0002qp\u0003\u0002\u0002\u0002ru\u0003\u0002\u0002",
    "\u0002sq\u0003\u0002\u0002\u0002st\u0003\u0002\u0002\u0002tv\u0003\u0002",
    "\u0002\u0002us\u0003\u0002\u0002\u0002vw\u0007\u0016\u0002\u0002wy\u0003",
    "\u0002\u0002\u0002xd\u0003\u0002\u0002\u0002xk\u0003\u0002\u0002\u0002",
    "y\u0013\u0003\u0002\u0002\u0002z|\u0007\t\u0002\u0002{}\u0005\u0006",
    "\u0004\u0002|{\u0003\u0002\u0002\u0002|}\u0003\u0002\u0002\u0002}\u0088",
    "\u0003\u0002\u0002\u0002~\u007f\u0007\t\u0002\u0002\u007f\u0083\u0007",
    "\u0015\u0002\u0002\u0080\u0082\u0005\u0006\u0004\u0002\u0081\u0080\u0003",
    "\u0002\u0002\u0002\u0082\u0085\u0003\u0002\u0002\u0002\u0083\u0081\u0003",
    "\u0002\u0002\u0002\u0083\u0084\u0003\u0002\u0002\u0002\u0084\u0086\u0003",
    "\u0002\u0002\u0002\u0085\u0083\u0003\u0002\u0002\u0002\u0086\u0088\u0007",
    "\u0016\u0002\u0002\u0087z\u0003\u0002\u0002\u0002\u0087~\u0003\u0002",
    "\u0002\u0002\u0088\u0015\u0003\u0002\u0002\u0002\u0089\u008a\u0007\t",
    "\u0002\u0002\u008a\u008b\u0007\b\u0002\u0002\u008b\u008c\u0007\u0013",
    "\u0002\u0002\u008c\u008d\u0005\u0018\r\u0002\u008d\u008f\u0007\u0014",
    "\u0002\u0002\u008e\u0090\u0005\u0006\u0004\u0002\u008f\u008e\u0003\u0002",
    "\u0002\u0002\u008f\u0090\u0003\u0002\u0002\u0002\u0090\u00a0\u0003\u0002",
    "\u0002\u0002\u0091\u0092\u0007\t\u0002\u0002\u0092\u0093\u0007\b\u0002",
    "\u0002\u0093\u0094\u0007\u0013\u0002\u0002\u0094\u0095\u0005\u0018\r",
    "\u0002\u0095\u0096\u0007\u0014\u0002\u0002\u0096\u009a\u0007\u0015\u0002",
    "\u0002\u0097\u0099\u0005\u0006\u0004\u0002\u0098\u0097\u0003\u0002\u0002",
    "\u0002\u0099\u009c\u0003\u0002\u0002\u0002\u009a\u0098\u0003\u0002\u0002",
    "\u0002\u009a\u009b\u0003\u0002\u0002\u0002\u009b\u009d\u0003\u0002\u0002",
    "\u0002\u009c\u009a\u0003\u0002\u0002\u0002\u009d\u009e\u0007\u0016\u0002",
    "\u0002\u009e\u00a0\u0003\u0002\u0002\u0002\u009f\u0089\u0003\u0002\u0002",
    "\u0002\u009f\u0091\u0003\u0002\u0002\u0002\u00a0\u0017\u0003\u0002\u0002",
    "\u0002\u00a1\u00a2\b\r\u0001\u0002\u00a2\u00a3\u0007\u0013\u0002\u0002",
    "\u00a3\u00a4\u0005\u0018\r\u0002\u00a4\u00a5\u0007\u0014\u0002\u0002",
    "\u00a5\u00ad\u0003\u0002\u0002\u0002\u00a6\u00a7\u0005\f\u0007\u0002",
    "\u00a7\u00a8\u0005\u001a\u000e\u0002\u00a8\u00a9\u0005\f\u0007\u0002",
    "\u00a9\u00ad\u0003\u0002\u0002\u0002\u00aa\u00ad\u0007\n\u0002\u0002",
    "\u00ab\u00ad\u0007\u000b\u0002\u0002\u00ac\u00a1\u0003\u0002\u0002\u0002",
    "\u00ac\u00a6\u0003\u0002\u0002\u0002\u00ac\u00aa\u0003\u0002\u0002\u0002",
    "\u00ac\u00ab\u0003\u0002\u0002\u0002\u00ad\u00b4\u0003\u0002\u0002\u0002",
    "\u00ae\u00af\f\u0007\u0002\u0002\u00af\u00b0\u0005\u001a\u000e\u0002",
    "\u00b0\u00b1\u0005\u0018\r\b\u00b1\u00b3\u0003\u0002\u0002\u0002\u00b2",
    "\u00ae\u0003\u0002\u0002\u0002\u00b3\u00b6\u0003\u0002\u0002\u0002\u00b4",
    "\u00b2\u0003\u0002\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002\u00b5",
    "\u0019\u0003\u0002\u0002\u0002\u00b6\u00b4\u0003\u0002\u0002\u0002\u00b7",
    "\u00b8\t\u0004\u0002\u0002\u00b8\u001b\u0003\u0002\u0002\u0002\u0014",
    "&8HPR^bisx|\u0083\u0087\u008f\u009a\u009f\u00ac\u00b4"].join("");


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class CParser extends antlr4.Parser {

    static grammarFileName = "C.g4";
    static literalNames = [ null, null, null, "'void'", "'main'", "'printf'", 
                            "'if'", "'else'", null, null, "'>'", "'<'", 
                            "'=='", "'>='", "'<='", "'&&'", "'||'", "'('", 
                            "')'", "'{'", "'}'", "';'", "'*'", "'/'", "'+'", 
                            "'-'", "'int'", "'='" ];
    static symbolicNames = [ null, "SCOMMENT", "MCOMMENT", "VOID", "MAIN", 
                             "PRINT", "IF", "ELSE", "TRUE", "FALSE", "GREATHER", 
                             "LESSER", "EQUALS", "GREATEQUAL", "LESSEQUAL", 
                             "AND", "OR", "LP", "RP", "LCB", "RCB", "SEMI", 
                             "MUL", "DIV", "ADD", "SUB", "TYPE", "ASSIGN", 
                             "VALUE", "ID", "BLANKS" ];
    static ruleNames = [ "program", "main", "statement", "declaration", 
                         "assignment", "expression", "print", "ifelse", 
                         "ifblock", "elseblock", "elseifblock", "condition", 
                         "lo" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = CParser.ruleNames;
        this.literalNames = CParser.literalNames;
        this.symbolicNames = CParser.symbolicNames;
    }

    get atn() {
        return atn;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 5:
    	    		return this.expression_sempred(localctx, predIndex);
    	case 11:
    	    		return this.condition_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    expression_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 5);
    		case 1:
    			return this.precpred(this._ctx, 4);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };

    condition_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 2:
    			return this.precpred(this._ctx, 5);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };




	program() {
	    let localctx = new ProgramContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, CParser.RULE_program);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 26;
	        this.main();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	main() {
	    let localctx = new MainContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, CParser.RULE_main);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 28;
	        this.match(CParser.VOID);
	        this.state = 29;
	        this.match(CParser.MAIN);
	        this.state = 30;
	        this.match(CParser.LP);
	        this.state = 31;
	        this.match(CParser.RP);
	        this.state = 32;
	        this.match(CParser.LCB);
	        this.state = 36;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << CParser.PRINT) | (1 << CParser.IF) | (1 << CParser.LP) | (1 << CParser.TYPE) | (1 << CParser.VALUE) | (1 << CParser.ID))) !== 0)) {
	            this.state = 33;
	            this.statement();
	            this.state = 38;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 39;
	        this.match(CParser.RCB);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	statement() {
	    let localctx = new StatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, CParser.RULE_statement);
	    try {
	        this.state = 54;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 41;
	            this.declaration();
	            this.state = 42;
	            this.match(CParser.SEMI);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 44;
	            this.assignment();
	            this.state = 45;
	            this.match(CParser.SEMI);
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 47;
	            this.expression(0);
	            this.state = 48;
	            this.match(CParser.SEMI);
	            break;

	        case 4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 50;
	            this.print();
	            this.state = 51;
	            this.match(CParser.SEMI);
	            break;

	        case 5:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 53;
	            this.ifelse();
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	declaration() {
	    let localctx = new DeclarationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, CParser.RULE_declaration);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 56;
	        this.match(CParser.TYPE);
	        this.state = 57;
	        this.match(CParser.ID);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	assignment() {
	    let localctx = new AssignmentContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, CParser.RULE_assignment);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 59;
	        this.match(CParser.ID);
	        this.state = 60;
	        this.match(CParser.ASSIGN);
	        this.state = 61;
	        this.expression(0);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


	expression(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new ExpressionContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 10;
	    this.enterRecursionRule(localctx, 10, CParser.RULE_expression, _p);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 70;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case CParser.VALUE:
	            localctx = new ValueExpContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;

	            this.state = 64;
	            this.match(CParser.VALUE);
	            break;
	        case CParser.ID:
	            localctx = new IdExpContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 65;
	            this.match(CParser.ID);
	            break;
	        case CParser.LP:
	            localctx = new ParenExpContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 66;
	            this.match(CParser.LP);
	            this.state = 67;
	            this.expression(0);
	            this.state = 68;
	            this.match(CParser.RP);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 80;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,4,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 78;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new MulDivExpContext(this, new ExpressionContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, CParser.RULE_expression);
	                    this.state = 72;
	                    if (!( this.precpred(this._ctx, 5))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
	                    }
	                    this.state = 73;
	                    localctx.op = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===CParser.MUL || _la===CParser.DIV)) {
	                        localctx.op = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 74;
	                    this.expression(6);
	                    break;

	                case 2:
	                    localctx = new AddSubExpContext(this, new ExpressionContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, CParser.RULE_expression);
	                    this.state = 75;
	                    if (!( this.precpred(this._ctx, 4))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
	                    }
	                    this.state = 76;
	                    localctx.op = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===CParser.ADD || _la===CParser.SUB)) {
	                        localctx.op = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 77;
	                    this.expression(5);
	                    break;

	                } 
	            }
	            this.state = 82;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,4,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	print() {
	    let localctx = new PrintContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, CParser.RULE_print);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 83;
	        this.match(CParser.PRINT);
	        this.state = 84;
	        this.match(CParser.LP);
	        this.state = 85;
	        this.expression(0);
	        this.state = 86;
	        this.match(CParser.RP);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifelse() {
	    let localctx = new IfelseContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, CParser.RULE_ifelse);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 88;
	        this.ifblock();
	        this.state = 92;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,5,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 89;
	                this.elseifblock(); 
	            }
	            this.state = 94;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,5,this._ctx);
	        }

	        this.state = 96;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,6,this._ctx);
	        if(la_===1) {
	            this.state = 95;
	            this.elseblock();

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifblock() {
	    let localctx = new IfblockContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, CParser.RULE_ifblock);
	    var _la = 0; // Token type
	    try {
	        this.state = 118;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new IfNoBracesContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 98;
	            this.match(CParser.IF);
	            this.state = 99;
	            this.match(CParser.LP);
	            this.state = 100;
	            this.condition(0);
	            this.state = 101;
	            this.match(CParser.RP);
	            this.state = 103;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,7,this._ctx);
	            if(la_===1) {
	                this.state = 102;
	                this.statement();

	            }
	            break;

	        case 2:
	            localctx = new IfBracesContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 105;
	            this.match(CParser.IF);
	            this.state = 106;
	            this.match(CParser.LP);
	            this.state = 107;
	            this.condition(0);
	            this.state = 108;
	            this.match(CParser.RP);
	            this.state = 109;
	            this.match(CParser.LCB);
	            this.state = 113;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << CParser.PRINT) | (1 << CParser.IF) | (1 << CParser.LP) | (1 << CParser.TYPE) | (1 << CParser.VALUE) | (1 << CParser.ID))) !== 0)) {
	                this.state = 110;
	                this.statement();
	                this.state = 115;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 116;
	            this.match(CParser.RCB);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseblock() {
	    let localctx = new ElseblockContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, CParser.RULE_elseblock);
	    var _la = 0; // Token type
	    try {
	        this.state = 133;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,12,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new ElseNoBracesContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 120;
	            this.match(CParser.ELSE);
	            this.state = 122;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,10,this._ctx);
	            if(la_===1) {
	                this.state = 121;
	                this.statement();

	            }
	            break;

	        case 2:
	            localctx = new ElseBracesContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 124;
	            this.match(CParser.ELSE);
	            this.state = 125;
	            this.match(CParser.LCB);
	            this.state = 129;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << CParser.PRINT) | (1 << CParser.IF) | (1 << CParser.LP) | (1 << CParser.TYPE) | (1 << CParser.VALUE) | (1 << CParser.ID))) !== 0)) {
	                this.state = 126;
	                this.statement();
	                this.state = 131;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 132;
	            this.match(CParser.RCB);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseifblock() {
	    let localctx = new ElseifblockContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, CParser.RULE_elseifblock);
	    var _la = 0; // Token type
	    try {
	        this.state = 157;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,15,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new ElseifNoBracesContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 135;
	            this.match(CParser.ELSE);
	            this.state = 136;
	            this.match(CParser.IF);
	            this.state = 137;
	            this.match(CParser.LP);
	            this.state = 138;
	            this.condition(0);
	            this.state = 139;
	            this.match(CParser.RP);
	            this.state = 141;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,13,this._ctx);
	            if(la_===1) {
	                this.state = 140;
	                this.statement();

	            }
	            break;

	        case 2:
	            localctx = new ElseifBracesContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 143;
	            this.match(CParser.ELSE);
	            this.state = 144;
	            this.match(CParser.IF);
	            this.state = 145;
	            this.match(CParser.LP);
	            this.state = 146;
	            this.condition(0);
	            this.state = 147;
	            this.match(CParser.RP);
	            this.state = 148;
	            this.match(CParser.LCB);
	            this.state = 152;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << CParser.PRINT) | (1 << CParser.IF) | (1 << CParser.LP) | (1 << CParser.TYPE) | (1 << CParser.VALUE) | (1 << CParser.ID))) !== 0)) {
	                this.state = 149;
	                this.statement();
	                this.state = 154;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 155;
	            this.match(CParser.RCB);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


	condition(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new ConditionContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 22;
	    this.enterRecursionRule(localctx, 22, CParser.RULE_condition, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 170;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,16,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new ParenCondContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;

	            this.state = 160;
	            this.match(CParser.LP);
	            this.state = 161;
	            this.condition(0);
	            this.state = 162;
	            this.match(CParser.RP);
	            break;

	        case 2:
	            localctx = new ExpCondContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 164;
	            this.expression(0);
	            this.state = 165;
	            this.lo();
	            this.state = 166;
	            this.expression(0);
	            break;

	        case 3:
	            localctx = new TrueCondContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 168;
	            this.match(CParser.TRUE);
	            break;

	        case 4:
	            localctx = new FalseCondContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 169;
	            this.match(CParser.FALSE);
	            break;

	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 178;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,17,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new CondCondContext(this, new ConditionContext(this, _parentctx, _parentState));
	                this.pushNewRecursionContext(localctx, _startState, CParser.RULE_condition);
	                this.state = 172;
	                if (!( this.precpred(this._ctx, 5))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
	                }
	                this.state = 173;
	                this.lo();
	                this.state = 174;
	                this.condition(6); 
	            }
	            this.state = 180;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,17,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	lo() {
	    let localctx = new LoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, CParser.RULE_lo);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 181;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << CParser.GREATHER) | (1 << CParser.LESSER) | (1 << CParser.EQUALS) | (1 << CParser.GREATEQUAL) | (1 << CParser.LESSEQUAL) | (1 << CParser.AND) | (1 << CParser.OR))) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

CParser.EOF = antlr4.Token.EOF;
CParser.SCOMMENT = 1;
CParser.MCOMMENT = 2;
CParser.VOID = 3;
CParser.MAIN = 4;
CParser.PRINT = 5;
CParser.IF = 6;
CParser.ELSE = 7;
CParser.TRUE = 8;
CParser.FALSE = 9;
CParser.GREATHER = 10;
CParser.LESSER = 11;
CParser.EQUALS = 12;
CParser.GREATEQUAL = 13;
CParser.LESSEQUAL = 14;
CParser.AND = 15;
CParser.OR = 16;
CParser.LP = 17;
CParser.RP = 18;
CParser.LCB = 19;
CParser.RCB = 20;
CParser.SEMI = 21;
CParser.MUL = 22;
CParser.DIV = 23;
CParser.ADD = 24;
CParser.SUB = 25;
CParser.TYPE = 26;
CParser.ASSIGN = 27;
CParser.VALUE = 28;
CParser.ID = 29;
CParser.BLANKS = 30;

CParser.RULE_program = 0;
CParser.RULE_main = 1;
CParser.RULE_statement = 2;
CParser.RULE_declaration = 3;
CParser.RULE_assignment = 4;
CParser.RULE_expression = 5;
CParser.RULE_print = 6;
CParser.RULE_ifelse = 7;
CParser.RULE_ifblock = 8;
CParser.RULE_elseblock = 9;
CParser.RULE_elseifblock = 10;
CParser.RULE_condition = 11;
CParser.RULE_lo = 12;

class ProgramContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_program;
    }

	main() {
	    return this.getTypedRuleContext(MainContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitProgram(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class MainContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_main;
    }

	VOID() {
	    return this.getToken(CParser.VOID, 0);
	};

	MAIN() {
	    return this.getToken(CParser.MAIN, 0);
	};

	LP() {
	    return this.getToken(CParser.LP, 0);
	};

	RP() {
	    return this.getToken(CParser.RP, 0);
	};

	LCB() {
	    return this.getToken(CParser.LCB, 0);
	};

	RCB() {
	    return this.getToken(CParser.RCB, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitMain(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_statement;
    }

	declaration() {
	    return this.getTypedRuleContext(DeclarationContext,0);
	};

	SEMI() {
	    return this.getToken(CParser.SEMI, 0);
	};

	assignment() {
	    return this.getTypedRuleContext(AssignmentContext,0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	print() {
	    return this.getTypedRuleContext(PrintContext,0);
	};

	ifelse() {
	    return this.getTypedRuleContext(IfelseContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DeclarationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_declaration;
    }

	TYPE() {
	    return this.getToken(CParser.TYPE, 0);
	};

	ID() {
	    return this.getToken(CParser.ID, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitDeclaration(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AssignmentContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_assignment;
    }

	ID() {
	    return this.getToken(CParser.ID, 0);
	};

	ASSIGN() {
	    return this.getToken(CParser.ASSIGN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitAssignment(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExpressionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_expression;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class IdExpContext extends ExpressionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ID() {
	    return this.getToken(CParser.ID, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitIdExp(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.IdExpContext = IdExpContext;

class MulDivExpContext extends ExpressionContext {

    constructor(parser, ctx) {
        super(parser);
        this.op = null; // Token;
        super.copyFrom(ctx);
    }

	expression = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExpressionContext);
	    } else {
	        return this.getTypedRuleContext(ExpressionContext,i);
	    }
	};

	MUL() {
	    return this.getToken(CParser.MUL, 0);
	};

	DIV() {
	    return this.getToken(CParser.DIV, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitMulDivExp(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.MulDivExpContext = MulDivExpContext;

class ParenExpContext extends ExpressionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	LP() {
	    return this.getToken(CParser.LP, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RP() {
	    return this.getToken(CParser.RP, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitParenExp(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.ParenExpContext = ParenExpContext;

class AddSubExpContext extends ExpressionContext {

    constructor(parser, ctx) {
        super(parser);
        this.op = null; // Token;
        super.copyFrom(ctx);
    }

	expression = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExpressionContext);
	    } else {
	        return this.getTypedRuleContext(ExpressionContext,i);
	    }
	};

	ADD() {
	    return this.getToken(CParser.ADD, 0);
	};

	SUB() {
	    return this.getToken(CParser.SUB, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitAddSubExp(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.AddSubExpContext = AddSubExpContext;

class ValueExpContext extends ExpressionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	VALUE() {
	    return this.getToken(CParser.VALUE, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitValueExp(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.ValueExpContext = ValueExpContext;

class PrintContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_print;
    }

	PRINT() {
	    return this.getToken(CParser.PRINT, 0);
	};

	LP() {
	    return this.getToken(CParser.LP, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RP() {
	    return this.getToken(CParser.RP, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitPrint(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class IfelseContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_ifelse;
    }

	ifblock() {
	    return this.getTypedRuleContext(IfblockContext,0);
	};

	elseifblock = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ElseifblockContext);
	    } else {
	        return this.getTypedRuleContext(ElseifblockContext,i);
	    }
	};

	elseblock() {
	    return this.getTypedRuleContext(ElseblockContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitIfelse(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class IfblockContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_ifblock;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class IfBracesContext extends IfblockContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	IF() {
	    return this.getToken(CParser.IF, 0);
	};

	LP() {
	    return this.getToken(CParser.LP, 0);
	};

	condition() {
	    return this.getTypedRuleContext(ConditionContext,0);
	};

	RP() {
	    return this.getToken(CParser.RP, 0);
	};

	LCB() {
	    return this.getToken(CParser.LCB, 0);
	};

	RCB() {
	    return this.getToken(CParser.RCB, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitIfBraces(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.IfBracesContext = IfBracesContext;

class IfNoBracesContext extends IfblockContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	IF() {
	    return this.getToken(CParser.IF, 0);
	};

	LP() {
	    return this.getToken(CParser.LP, 0);
	};

	condition() {
	    return this.getTypedRuleContext(ConditionContext,0);
	};

	RP() {
	    return this.getToken(CParser.RP, 0);
	};

	statement() {
	    return this.getTypedRuleContext(StatementContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitIfNoBraces(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.IfNoBracesContext = IfNoBracesContext;

class ElseblockContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_elseblock;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class ElseBracesContext extends ElseblockContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ELSE() {
	    return this.getToken(CParser.ELSE, 0);
	};

	LCB() {
	    return this.getToken(CParser.LCB, 0);
	};

	RCB() {
	    return this.getToken(CParser.RCB, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitElseBraces(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.ElseBracesContext = ElseBracesContext;

class ElseNoBracesContext extends ElseblockContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ELSE() {
	    return this.getToken(CParser.ELSE, 0);
	};

	statement() {
	    return this.getTypedRuleContext(StatementContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitElseNoBraces(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.ElseNoBracesContext = ElseNoBracesContext;

class ElseifblockContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_elseifblock;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class ElseifNoBracesContext extends ElseifblockContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ELSE() {
	    return this.getToken(CParser.ELSE, 0);
	};

	IF() {
	    return this.getToken(CParser.IF, 0);
	};

	LP() {
	    return this.getToken(CParser.LP, 0);
	};

	condition() {
	    return this.getTypedRuleContext(ConditionContext,0);
	};

	RP() {
	    return this.getToken(CParser.RP, 0);
	};

	statement() {
	    return this.getTypedRuleContext(StatementContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitElseifNoBraces(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.ElseifNoBracesContext = ElseifNoBracesContext;

class ElseifBracesContext extends ElseifblockContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ELSE() {
	    return this.getToken(CParser.ELSE, 0);
	};

	IF() {
	    return this.getToken(CParser.IF, 0);
	};

	LP() {
	    return this.getToken(CParser.LP, 0);
	};

	condition() {
	    return this.getTypedRuleContext(ConditionContext,0);
	};

	RP() {
	    return this.getToken(CParser.RP, 0);
	};

	LCB() {
	    return this.getToken(CParser.LCB, 0);
	};

	RCB() {
	    return this.getToken(CParser.RCB, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitElseifBraces(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.ElseifBracesContext = ElseifBracesContext;

class ConditionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_condition;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class TrueCondContext extends ConditionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	TRUE() {
	    return this.getToken(CParser.TRUE, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitTrueCond(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.TrueCondContext = TrueCondContext;

class FalseCondContext extends ConditionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	FALSE() {
	    return this.getToken(CParser.FALSE, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitFalseCond(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.FalseCondContext = FalseCondContext;

class ExpCondContext extends ConditionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	expression = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExpressionContext);
	    } else {
	        return this.getTypedRuleContext(ExpressionContext,i);
	    }
	};

	lo() {
	    return this.getTypedRuleContext(LoContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitExpCond(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.ExpCondContext = ExpCondContext;

class CondCondContext extends ConditionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	condition = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ConditionContext);
	    } else {
	        return this.getTypedRuleContext(ConditionContext,i);
	    }
	};

	lo() {
	    return this.getTypedRuleContext(LoContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitCondCond(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.CondCondContext = CondCondContext;

class ParenCondContext extends ConditionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	LP() {
	    return this.getToken(CParser.LP, 0);
	};

	condition() {
	    return this.getTypedRuleContext(ConditionContext,0);
	};

	RP() {
	    return this.getToken(CParser.RP, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitParenCond(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CParser.ParenCondContext = ParenCondContext;

class LoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CParser.RULE_lo;
    }

	GREATHER() {
	    return this.getToken(CParser.GREATHER, 0);
	};

	LESSER() {
	    return this.getToken(CParser.LESSER, 0);
	};

	EQUALS() {
	    return this.getToken(CParser.EQUALS, 0);
	};

	GREATEQUAL() {
	    return this.getToken(CParser.GREATEQUAL, 0);
	};

	LESSEQUAL() {
	    return this.getToken(CParser.LESSEQUAL, 0);
	};

	AND() {
	    return this.getToken(CParser.AND, 0);
	};

	OR() {
	    return this.getToken(CParser.OR, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CVisitor ) {
	        return visitor.visitLo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




CParser.ProgramContext = ProgramContext; 
CParser.MainContext = MainContext; 
CParser.StatementContext = StatementContext; 
CParser.DeclarationContext = DeclarationContext; 
CParser.AssignmentContext = AssignmentContext; 
CParser.ExpressionContext = ExpressionContext; 
CParser.PrintContext = PrintContext; 
CParser.IfelseContext = IfelseContext; 
CParser.IfblockContext = IfblockContext; 
CParser.ElseblockContext = ElseblockContext; 
CParser.ElseifblockContext = ElseifblockContext; 
CParser.ConditionContext = ConditionContext; 
CParser.LoContext = LoContext; 
