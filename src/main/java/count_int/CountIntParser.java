// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/count_int/CountInt.g4 by ANTLR 4.13.2
package count_int;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CountIntParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, COMMA=2, SEMICOLON=3;
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
			null, null, "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "COMMA", "SEMICOLON"
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
	public String getGrammarFileName() { return "CountInt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CountIntParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public int sum;
		public Token n0;
		public Token n1;
		public TerminalNode SEMICOLON() { return getToken(CountIntParser.SEMICOLON, 0); }
		public TerminalNode EOF() { return getToken(CountIntParser.EOF, 0); }
		public List<TerminalNode> INT() { return getTokens(CountIntParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CountIntParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CountIntParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CountIntParser.COMMA, i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CountIntListener ) ((CountIntListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CountIntListener ) ((CountIntListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CountIntVisitor ) return ((CountIntVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		 ((SContext)_localctx).sum =  0; 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2);
					((SContext)_localctx).n0 = match(INT);
					 _localctx.sum += Integer.parseInt((((SContext)_localctx).n0!=null?((SContext)_localctx).n0.getText():null)); 
					setState(4);
					match(COMMA);
					}
					} 
				}
				setState(9);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(10);
			((SContext)_localctx).n1 = match(INT);
			 _localctx.sum += Integer.parseInt((((SContext)_localctx).n1!=null?((SContext)_localctx).n1.getText():null)); 
			setState(12);
			match(SEMICOLON);
			System.out.println(_localctx.sum);
			setState(14);
			match(EOF);
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
		"\u0004\u0001\u0003\u0011\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0006\b\u0000\n\u0000\f\u0000\t\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0010\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0002\u0003\u0005\u0001\u0000\u0000\u0003\u0004\u0006\u0000"+
		"\uffff\uffff\u0000\u0004\u0006\u0005\u0002\u0000\u0000\u0005\u0002\u0001"+
		"\u0000\u0000\u0000\u0006\t\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000"+
		"\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b\n\u0001\u0000\u0000\u0000"+
		"\t\u0007\u0001\u0000\u0000\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b"+
		"\f\u0006\u0000\uffff\uffff\u0000\f\r\u0005\u0003\u0000\u0000\r\u000e\u0006"+
		"\u0000\uffff\uffff\u0000\u000e\u000f\u0005\u0000\u0000\u0001\u000f\u0001"+
		"\u0001\u0000\u0000\u0000\u0001\u0007";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}