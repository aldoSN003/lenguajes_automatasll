// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/parentheses/Parentheses.g4 by ANTLR 4.13.2
package parentheses;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParenthesesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, CLOSE=2;
	public static final int
		RULE_mrule = 0, RULE_nested = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"mrule", "nested"
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
	public String getGrammarFileName() { return "Parentheses.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParenthesesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MruleContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(ParenthesesParser.OPEN, 0); }
		public NestedContext nested() {
			return getRuleContext(NestedContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ParenthesesParser.CLOSE, 0); }
		public TerminalNode EOF() { return getToken(ParenthesesParser.EOF, 0); }
		public MruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParenthesesListener ) ((ParenthesesListener)listener).enterMrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParenthesesListener ) ((ParenthesesListener)listener).exitMrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParenthesesVisitor ) return ((ParenthesesVisitor<? extends T>)visitor).visitMrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MruleContext mrule() throws RecognitionException {
		MruleContext _localctx = new MruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mrule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(OPEN);
			setState(5);
			nested();
			setState(6);
			match(CLOSE);
			setState(7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NestedContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(ParenthesesParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(ParenthesesParser.OPEN, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(ParenthesesParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(ParenthesesParser.CLOSE, i);
		}
		public NestedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParenthesesListener ) ((ParenthesesListener)listener).enterNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParenthesesListener ) ((ParenthesesListener)listener).exitNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParenthesesVisitor ) return ((ParenthesesVisitor<? extends T>)visitor).visitNested(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedContext nested() throws RecognitionException {
		NestedContext _localctx = new NestedContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nested);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(9);
					_la = _input.LA(1);
					if ( !(_la==OPEN || _la==CLOSE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(14);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		"\u0004\u0001\u0002\u0010\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0005\u0001\u000b\b\u0001\n\u0001\f\u0001\u000e\t\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0001\u0001\u0000\u0001\u0002\u000e\u0000"+
		"\u0004\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004\u0005"+
		"\u0005\u0001\u0000\u0000\u0005\u0006\u0003\u0002\u0001\u0000\u0006\u0007"+
		"\u0005\u0002\u0000\u0000\u0007\b\u0005\u0000\u0000\u0001\b\u0001\u0001"+
		"\u0000\u0000\u0000\t\u000b\u0007\u0000\u0000\u0000\n\t\u0001\u0000\u0000"+
		"\u0000\u000b\u000e\u0001\u0000\u0000\u0000\f\n\u0001\u0000\u0000\u0000"+
		"\f\r\u0001\u0000\u0000\u0000\r\u0003\u0001\u0000\u0000\u0000\u000e\f\u0001"+
		"\u0000\u0000\u0000\u0001\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}