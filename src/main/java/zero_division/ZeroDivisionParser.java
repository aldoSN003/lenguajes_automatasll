// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/zero_division/ZeroDivision.g4 by ANTLR 4.13.2
package zero_division;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ZeroDivisionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DIV=2, WS=3;
	public static final int
		RULE_s = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"s"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DIV", "WS"
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
	public String getGrammarFileName() { return "ZeroDivision.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ZeroDivisionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public float r;
		public Token d0;
		public Token op;
		public Token d1;
		public TerminalNode EOF() { return getToken(ZeroDivisionParser.EOF, 0); }
		public List<TerminalNode> INT() { return getTokens(ZeroDivisionParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ZeroDivisionParser.INT, i);
		}
		public TerminalNode DIV() { return getToken(ZeroDivisionParser.DIV, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZeroDivisionListener ) ((ZeroDivisionListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZeroDivisionListener ) ((ZeroDivisionListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZeroDivisionVisitor ) return ((ZeroDivisionVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		((SContext)_localctx).r =  0.0f;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			((SContext)_localctx).d0 = match(INT);
			setState(3);
			((SContext)_localctx).op = match(DIV);
			setState(4);
			((SContext)_localctx).d1 = match(INT);
			setState(5);
			match(EOF);

			        float n0 = Float.parseFloat(((SContext)_localctx).d0.getText()); 
			        float n1 = Float.parseFloat(((SContext)_localctx).d1.getText());

			        if (n1 == 0.0f) {
			            System.out.println("Error: division por cero");
			            ((SContext)_localctx).r =  -1.0f;
			        } else {
			            ((SContext)_localctx).r =  n0 / n1;
			            System.out.println("Correcto: " + _localctx.r);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0003\t\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001"+
		"\u0000\u0000\u0000\u0007\u0000\u0002\u0001\u0000\u0000\u0000\u0002\u0003"+
		"\u0005\u0001\u0000\u0000\u0003\u0004\u0005\u0002\u0000\u0000\u0004\u0005"+
		"\u0005\u0001\u0000\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0007"+
		"\u0006\u0000\uffff\uffff\u0000\u0007\u0001\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}