// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/parentheses_attributes/ParenthesesAttributes.g4 by ANTLR 4.13.2
package parentheses_attributes;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParenthesesAttributesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, CLOSE=2;
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
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN", "CLOSE"
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
	public String getGrammarFileName() { return "ParenthesesAttributes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParenthesesAttributesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public int c;
		public TerminalNode EOF() { return getToken(ParenthesesAttributesParser.EOF, 0); }
		public List<TerminalNode> OPEN() { return getTokens(ParenthesesAttributesParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(ParenthesesAttributesParser.OPEN, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(ParenthesesAttributesParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(ParenthesesAttributesParser.CLOSE, i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParenthesesAttributesListener ) ((ParenthesesAttributesListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParenthesesAttributesListener ) ((ParenthesesAttributesListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParenthesesAttributesVisitor ) return ((ParenthesesAttributesVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		((SContext)_localctx).c = 0;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(6);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN:
					{
					setState(2);
					match(OPEN);
					_localctx.c++;
					}
					break;
				case CLOSE:
					{
					setState(4);
					match(CLOSE);
					_localctx.c--;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(8); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN || _la==CLOSE );
			setState(10);
			match(EOF);

			if(_localctx.c==0){
			    System.out.println("Correcto");
			} else{System.out.println("Incorrecto");}

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
		"\u0004\u0001\u0002\u000e\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\u0007\b\u0000\u000b\u0000\f\u0000"+
		"\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0000\u000e\u0000\u0006\u0001\u0000\u0000\u0000\u0002\u0003\u0005"+
		"\u0001\u0000\u0000\u0003\u0007\u0006\u0000\uffff\uffff\u0000\u0004\u0005"+
		"\u0005\u0002\u0000\u0000\u0005\u0007\u0006\u0000\uffff\uffff\u0000\u0006"+
		"\u0002\u0001\u0000\u0000\u0000\u0006\u0004\u0001\u0000\u0000\u0000\u0007"+
		"\b\u0001\u0000\u0000\u0000\b\u0006\u0001\u0000\u0000\u0000\b\t\u0001\u0000"+
		"\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\u000b\u0005\u0000\u0000\u0001"+
		"\u000b\f\u0006\u0000\uffff\uffff\u0000\f\u0001\u0001\u0000\u0000\u0000"+
		"\u0002\u0006\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}