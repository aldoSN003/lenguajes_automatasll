// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/csv_data/CsvData.g4 by ANTLR 4.13.2
package csv_data;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CsvDataLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOCONTROL=1, GENERO=2, PROMEDIO=3, NOMBRE=4, CARRERA=5, SEMESTRE=6, EDAD=7, 
		COMMA=8, UPPER=9, LOWER=10, DIGIT=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NOCONTROL", "GENERO", "PROMEDIO", "NOMBRE", "CARRERA", "SEMESTRE", "EDAD", 
			"COMMA", "UPPER", "LOWER", "DIGIT", "WS"
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


	public CsvDataLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CsvData.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\f]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003.\b\u0003\n\u0003\f\u0003"+
		"1\t\u0003\u0001\u0004\u0004\u00044\b\u0004\u000b\u0004\f\u00045\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005?\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006M\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004"+
		"\u000bX\b\u000b\u000b\u000b\f\u000bY\u0001\u000b\u0001\u000b\u0000\u0000"+
		"\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0006"+
		"\u0002\u0000FFMM\u0003\u0000  AZaz\u0001\u0000AZ\u0001\u0000az\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  g\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000"+
		"\u0000\u0005%\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t"+
		"3\u0001\u0000\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\rL\u0001\u0000"+
		"\u0000\u0000\u000fN\u0001\u0000\u0000\u0000\u0011P\u0001\u0000\u0000\u0000"+
		"\u0013R\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017W"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0003\u0015\n\u0000\u001a\u001b\u0003"+
		"\u0015\n\u0000\u001b\u001c\u00050\u0000\u0000\u001c\u001d\u00059\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0015\n\u0000"+
		"\u001f \u0003\u0015\n\u0000 !\u0003\u0015\n\u0000!\"\u0003\u0015\n\u0000"+
		"\"\u0002\u0001\u0000\u0000\u0000#$\u0007\u0000\u0000\u0000$\u0004\u0001"+
		"\u0000\u0000\u0000%&\u0003\u0015\n\u0000&\'\u0003\u0015\n\u0000\'(\u0005"+
		".\u0000\u0000()\u0003\u0015\n\u0000)*\u0003\u0015\n\u0000*\u0006\u0001"+
		"\u0000\u0000\u0000+/\u0003\u0011\b\u0000,.\u0003\u0013\t\u0000-,\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000\b\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000024\u0007\u0001\u0000\u000032\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\n\u0001"+
		"\u0000\u0000\u00007?\u000219\u000089\u00051\u0000\u00009?\u00050\u0000"+
		"\u0000:;\u00051\u0000\u0000;?\u00051\u0000\u0000<=\u00051\u0000\u0000"+
		"=?\u00052\u0000\u0000>7\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000"+
		">:\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?\f\u0001\u0000\u0000"+
		"\u0000@A\u00051\u0000\u0000AM\u00058\u0000\u0000BC\u00051\u0000\u0000"+
		"CM\u00059\u0000\u0000DE\u00052\u0000\u0000EM\u00050\u0000\u0000FG\u0005"+
		"2\u0000\u0000GM\u00051\u0000\u0000HI\u00052\u0000\u0000IM\u00052\u0000"+
		"\u0000JK\u00052\u0000\u0000KM\u00053\u0000\u0000L@\u0001\u0000\u0000\u0000"+
		"LB\u0001\u0000\u0000\u0000LD\u0001\u0000\u0000\u0000LF\u0001\u0000\u0000"+
		"\u0000LH\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000M\u000e\u0001"+
		"\u0000\u0000\u0000NO\u0005,\u0000\u0000O\u0010\u0001\u0000\u0000\u0000"+
		"PQ\u0007\u0002\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0007\u0003"+
		"\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TU\u0007\u0004\u0000\u0000"+
		"U\u0016\u0001\u0000\u0000\u0000VX\u0007\u0005\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0006\u000b\u0000\u0000"+
		"\\\u0018\u0001\u0000\u0000\u0000\u0006\u0000/5>LY\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}