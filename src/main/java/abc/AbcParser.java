// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/abc/Abc.g4 by ANTLR 4.13.2
package abc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AbcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LETTER=1, SEMICOLON=2, COMMA=3;
	public static final int
		RULE_mrule = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"mrule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LETTER", "SEMICOLON", "COMMA"
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
	public String getGrammarFileName() { return "Abc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AbcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MruleContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(AbcParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(AbcParser.LETTER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(AbcParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AbcParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AbcParser.COMMA, i);
		}
		public MruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcVisitor ) return ((AbcVisitor<? extends T>)visitor).visitMrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MruleContext mrule() throws RecognitionException {
		MruleContext _localctx = new MruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mrule);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2);
					match(LETTER);
					setState(3);
					match(COMMA);
					}
					} 
				}
				setState(8);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(9);
			match(LETTER);
			setState(10);
			match(SEMICOLON);
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
		"\u0004\u0001\u0003\r\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0005\b\u0000\n\u0000\f\u0000\b\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\f\u0000\u0006"+
		"\u0001\u0000\u0000\u0000\u0002\u0003\u0005\u0001\u0000\u0000\u0003\u0005"+
		"\u0005\u0003\u0000\u0000\u0004\u0002\u0001\u0000\u0000\u0000\u0005\b\u0001"+
		"\u0000\u0000\u0000\u0006\u0004\u0001\u0000\u0000\u0000\u0006\u0007\u0001"+
		"\u0000\u0000\u0000\u0007\t\u0001\u0000\u0000\u0000\b\u0006\u0001\u0000"+
		"\u0000\u0000\t\n\u0005\u0001\u0000\u0000\n\u000b\u0005\u0002\u0000\u0000"+
		"\u000b\u0001\u0001\u0000\u0000\u0000\u0001\u0006";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}