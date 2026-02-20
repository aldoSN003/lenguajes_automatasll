// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/variables_attributes/VariablesAttributes.g4 by ANTLR 4.13.2
package variables_attributes;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class VariablesAttributesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SEMICOLON=3, EQUALS=4, ID=5, TYPE=6, DOT=7, FLOAT=8, INT=9, 
		WS=10;
	public static final int
		RULE_s = 0, RULE_tipo = 1, RULE_valor = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "tipo", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "';'", "'='", null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SEMICOLON", "EQUALS", "ID", "TYPE", "DOT", "FLOAT", 
			"INT", "WS"
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
	public String getGrammarFileName() { return "VariablesAttributes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VariablesAttributesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public TipoContext tipo;
		public ValorContext valor;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(VariablesAttributesParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(VariablesAttributesParser.EQUALS, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(VariablesAttributesParser.SEMICOLON, 0); }
		public TerminalNode EOF() { return getToken(VariablesAttributesParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesAttributesListener ) ((VariablesAttributesListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesAttributesListener ) ((VariablesAttributesListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesAttributesVisitor ) return ((VariablesAttributesVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			((SContext)_localctx).tipo = tipo();
			setState(7);
			match(ID);
			setState(8);
			match(EQUALS);
			setState(9);
			((SContext)_localctx).valor = valor();
			setState(10);
			match(SEMICOLON);
			   if((((SContext)_localctx).tipo!=null?_input.getText(((SContext)_localctx).tipo.start,((SContext)_localctx).tipo.stop):null).equals("int")&& (((SContext)_localctx).valor!=null?_input.getText(((SContext)_localctx).valor.start,((SContext)_localctx).valor.stop):null).contains(".")) {
			            System.out.println("Error, type int cannot contain . ");
			        }  else if((((SContext)_localctx).tipo!=null?_input.getText(((SContext)_localctx).tipo.start,((SContext)_localctx).tipo.stop):null).equals("float") && !(((SContext)_localctx).valor!=null?_input.getText(((SContext)_localctx).valor.start,((SContext)_localctx).valor.stop):null).contains(".")){
			          System.out.println("Error, type float must contain . ");
			            } else{
			                System.out.println("CORRECTO");
			            }

			    
			setState(12);
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesAttributesListener ) ((VariablesAttributesListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesAttributesListener ) ((VariablesAttributesListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesAttributesVisitor ) return ((VariablesAttributesVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VariablesAttributesParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(VariablesAttributesParser.FLOAT, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesAttributesListener ) ((VariablesAttributesListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesAttributesListener ) ((VariablesAttributesListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesAttributesVisitor ) return ((VariablesAttributesVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==INT) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\n\u0013\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000"+
		"\u0002\u0001\u0000\u0001\u0002\u0001\u0000\b\t\u000f\u0000\u0006\u0001"+
		"\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u0010\u0001"+
		"\u0000\u0000\u0000\u0006\u0007\u0003\u0002\u0001\u0000\u0007\b\u0005\u0005"+
		"\u0000\u0000\b\t\u0005\u0004\u0000\u0000\t\n\u0003\u0004\u0002\u0000\n"+
		"\u000b\u0005\u0003\u0000\u0000\u000b\f\u0006\u0000\uffff\uffff\u0000\f"+
		"\r\u0005\u0000\u0000\u0001\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0007\u0000\u0000\u0000\u000f\u0003\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0007\u0001\u0000\u0000\u0011\u0005\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}