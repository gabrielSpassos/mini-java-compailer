// Generated from Gramatica.g4 by ANTLR 4.7.2

  package org.meri.antlr_step_by_step.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_EOF=1, T_mais=2, T_menos=3, T_divi=4, T_vezes=5, T_num=6, T_id=7, T_space=8;
	public static final int
		RULE_expr = 0, RULE_expr_c = 1, RULE_termo = 2, RULE_fator = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "expr_c", "termo", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'+'", "'-'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_EOF", "T_mais", "T_menos", "T_divi", "T_vezes", "T_num", "T_id", 
			"T_space"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public Expr_cContext expr_c() {
			return getRuleContext(Expr_cContext.class,0);
		}
		public TerminalNode T_EOF() { return getToken(GramaticaParser.T_EOF, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			expr_c();
			setState(9);
			match(T_EOF);
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

	public static class Expr_cContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> T_mais() { return getTokens(GramaticaParser.T_mais); }
		public TerminalNode T_mais(int i) {
			return getToken(GramaticaParser.T_mais, i);
		}
		public List<TerminalNode> T_menos() { return getTokens(GramaticaParser.T_menos); }
		public TerminalNode T_menos(int i) {
			return getToken(GramaticaParser.T_menos, i);
		}
		public Expr_cContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpr_c(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpr_c(this);
		}
	}

	public final Expr_cContext expr_c() throws RecognitionException {
		Expr_cContext _localctx = new Expr_cContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr_c);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			termo();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_mais || _la==T_menos) {
				{
				{
				setState(12);
				_la = _input.LA(1);
				if ( !(_la==T_mais || _la==T_menos) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(13);
				termo();
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> T_vezes() { return getTokens(GramaticaParser.T_vezes); }
		public TerminalNode T_vezes(int i) {
			return getToken(GramaticaParser.T_vezes, i);
		}
		public List<TerminalNode> T_divi() { return getTokens(GramaticaParser.T_divi); }
		public TerminalNode T_divi(int i) {
			return getToken(GramaticaParser.T_divi, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			fator();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_divi || _la==T_vezes) {
				{
				{
				setState(20);
				_la = _input.LA(1);
				if ( !(_la==T_divi || _la==T_vezes) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(21);
				fator();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode T_num() { return getToken(GramaticaParser.T_num, 0); }
		public TerminalNode T_id() { return getToken(GramaticaParser.T_id, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fator);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_num:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(T_num);
				}
				break;
			case T_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(T_id);
				 System.out.println("------> Reconheceu o "+LT(0).getText()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n#\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\7\3\21\n\3\f\3\16\3\24\13\3"+
		"\3\4\3\4\3\4\7\4\31\n\4\f\4\16\4\34\13\4\3\5\3\5\3\5\5\5!\n\5\3\5\2\2"+
		"\6\2\4\6\b\2\4\3\2\4\5\3\2\6\7\2!\2\n\3\2\2\2\4\r\3\2\2\2\6\25\3\2\2\2"+
		"\b \3\2\2\2\n\13\5\4\3\2\13\f\7\3\2\2\f\3\3\2\2\2\r\22\5\6\4\2\16\17\t"+
		"\2\2\2\17\21\5\6\4\2\20\16\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3"+
		"\2\2\2\23\5\3\2\2\2\24\22\3\2\2\2\25\32\5\b\5\2\26\27\t\3\2\2\27\31\5"+
		"\b\5\2\30\26\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\7\3"+
		"\2\2\2\34\32\3\2\2\2\35!\7\b\2\2\36\37\7\t\2\2\37!\b\5\1\2 \35\3\2\2\2"+
		" \36\3\2\2\2!\t\3\2\2\2\5\22\32 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}