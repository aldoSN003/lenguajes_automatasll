// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/csv_data/CsvData.g4 by ANTLR 4.13.2
package csv_data;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CsvDataParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOCONTROL=1, GENERO=2, PROMEDIO=3, NOMBRE=4, CARRERA=5, SEMESTRE=6, EDAD=7, 
		COMMA=8, UPPER=9, LOWER=10, DIGIT=11, WS=12;
	public static final int
		RULE_prule = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"prule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOCONTROL", "GENERO", "PROMEDIO", "NOMBRE", "CARRERA", "SEMESTRE", 
			"EDAD", "COMMA", "UPPER", "LOWER", "DIGIT", "WS"
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
	public String getGrammarFileName() { return "CsvData.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CsvDataParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PruleContext extends ParserRuleContext {
		public TerminalNode NOCONTROL() { return getToken(CsvDataParser.NOCONTROL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CsvDataParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsvDataParser.COMMA, i);
		}
		public TerminalNode NOMBRE() { return getToken(CsvDataParser.NOMBRE, 0); }
		public TerminalNode CARRERA() { return getToken(CsvDataParser.CARRERA, 0); }
		public TerminalNode SEMESTRE() { return getToken(CsvDataParser.SEMESTRE, 0); }
		public TerminalNode GENERO() { return getToken(CsvDataParser.GENERO, 0); }
		public TerminalNode EDAD() { return getToken(CsvDataParser.EDAD, 0); }
		public TerminalNode PROMEDIO() { return getToken(CsvDataParser.PROMEDIO, 0); }
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvDataListener ) ((CsvDataListener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvDataListener ) ((CsvDataListener)listener).exitPrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvDataVisitor ) return ((CsvDataVisitor<? extends T>)visitor).visitPrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(NOCONTROL);
			setState(3);
			match(COMMA);
			setState(4);
			match(NOMBRE);
			setState(5);
			match(COMMA);
			setState(6);
			match(CARRERA);
			setState(7);
			match(COMMA);
			setState(8);
			match(SEMESTRE);
			setState(9);
			match(COMMA);
			setState(10);
			match(GENERO);
			setState(11);
			match(COMMA);
			setState(12);
			match(EDAD);
			setState(13);
			match(COMMA);
			setState(14);
			match(PROMEDIO);
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
		"\u0004\u0001\f\u0011\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u000f\u0000\u0002\u0001\u0000"+
		"\u0000\u0000\u0002\u0003\u0005\u0001\u0000\u0000\u0003\u0004\u0005\b\u0000"+
		"\u0000\u0004\u0005\u0005\u0004\u0000\u0000\u0005\u0006\u0005\b\u0000\u0000"+
		"\u0006\u0007\u0005\u0005\u0000\u0000\u0007\b\u0005\b\u0000\u0000\b\t\u0005"+
		"\u0006\u0000\u0000\t\n\u0005\b\u0000\u0000\n\u000b\u0005\u0002\u0000\u0000"+
		"\u000b\f\u0005\b\u0000\u0000\f\r\u0005\u0007\u0000\u0000\r\u000e\u0005"+
		"\b\u0000\u0000\u000e\u000f\u0005\u0003\u0000\u0000\u000f\u0001\u0001\u0000"+
		"\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}