// Generated from Gramatica.g4 by ANTLR 4.7.2

	import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_PROGRAMA=1, T_INICIOCOMANDO=2, T_ASPAS=3, T_INTEIRO=4, T_BOOLV=5, T_BOOLF=6, 
		T_NEGACAO=7, T_LEIA=8, T_ENQUANTO=9, T_FACA=10, T_DIFERENCA=11, T_IGUAL=12, 
		T_MENOR=13, T_MAIOR=14, T_MAIORIGUAL=15, T_MULT=16, T_DIV=17, T_OU=18, 
		T_E=19, T_MAIS=20, T_MENOS=21, T_PROCEDIMENTO=22, T_SE=23, T_ENTAO=24, 
		T_SENAO=25, T_ATRIBUICAO=26, T_FUNCAO=27, T_BOOLEANO=28, T_FIMCOMANDO=29, 
		T_PONTOEVIRGULA=30, T_FIM=31, T_VAR=32, T_VIRGULA=33, T_DOISPONTOS=34, 
		T_ABREPARENTESES=35, T_FECHAPARENTESES=36, T_ESCREVA=37, T_UNDERLINE=38, 
		T_DIGITO=39, T_LETRA=40, WS=41, COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T_PROGRAMA", "T_INICIOCOMANDO", "T_ASPAS", "T_INTEIRO", "T_BOOLV", "T_BOOLF", 
			"T_NEGACAO", "T_LEIA", "T_ENQUANTO", "T_FACA", "T_DIFERENCA", "T_IGUAL", 
			"T_MENOR", "T_MAIOR", "T_MAIORIGUAL", "T_MULT", "T_DIV", "T_OU", "T_E", 
			"T_MAIS", "T_MENOS", "T_PROCEDIMENTO", "T_SE", "T_ENTAO", "T_SENAO", 
			"T_ATRIBUICAO", "T_FUNCAO", "T_BOOLEANO", "T_FIMCOMANDO", "T_PONTOEVIRGULA", 
			"T_FIM", "T_VAR", "T_VIRGULA", "T_DOISPONTOS", "T_ABREPARENTESES", "T_FECHAPARENTESES", 
			"T_ESCREVA", "T_UNDERLINE", "T_DIGITO", "T_LETRA", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'\"'", "'inteiro'", "'verdadeiro'", 
			"'falso'", "'nao'", "'leia'", "'enquanto'", "'faca'", "'<>'", "'='", 
			"'<'", "'>'", "'>='", "'*'", "'div'", "'ou'", "'e'", "'+'", "'-'", "'procedimento'", 
			"'se'", "'entao'", "'senao'", "':='", "'funcao'", "'booleano'", "'fim'", 
			"';'", "'fim.'", "'var'", "','", "':'", "'('", "')'", "'escreva'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_PROGRAMA", "T_INICIOCOMANDO", "T_ASPAS", "T_INTEIRO", "T_BOOLV", 
			"T_BOOLF", "T_NEGACAO", "T_LEIA", "T_ENQUANTO", "T_FACA", "T_DIFERENCA", 
			"T_IGUAL", "T_MENOR", "T_MAIOR", "T_MAIORIGUAL", "T_MULT", "T_DIV", "T_OU", 
			"T_E", "T_MAIS", "T_MENOS", "T_PROCEDIMENTO", "T_SE", "T_ENTAO", "T_SENAO", 
			"T_ATRIBUICAO", "T_FUNCAO", "T_BOOLEANO", "T_FIMCOMANDO", "T_PONTOEVIRGULA", 
			"T_FIM", "T_VAR", "T_VIRGULA", "T_DOISPONTOS", "T_ABREPARENTESES", "T_FECHAPARENTESES", 
			"T_ESCREVA", "T_UNDERLINE", "T_DIGITO", "T_LETRA", "WS", "COMMENT"
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




	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\6(\u0106\n(\r(\16"+
		"(\u0107\3)\6)\u010b\n)\r)\16)\u010c\3*\6*\u0110\n*\r*\16*\u0111\3*\3*"+
		"\3+\3+\7+\u0118\n+\f+\16+\u011b\13+\3+\5+\u011e\n+\3+\3+\3+\3+\2\2,\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\5\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f\f"+
		"\17\17\2\u0127\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5`\3\2\2\2\7g\3\2\2\2\ti\3\2\2\2\13"+
		"q\3\2\2\2\r|\3\2\2\2\17\u0082\3\2\2\2\21\u0086\3\2\2\2\23\u008b\3\2\2"+
		"\2\25\u0094\3\2\2\2\27\u0099\3\2\2\2\31\u009c\3\2\2\2\33\u009e\3\2\2\2"+
		"\35\u00a0\3\2\2\2\37\u00a2\3\2\2\2!\u00a5\3\2\2\2#\u00a7\3\2\2\2%\u00ab"+
		"\3\2\2\2\'\u00ae\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2-\u00b4\3\2\2\2"+
		"/\u00c1\3\2\2\2\61\u00c4\3\2\2\2\63\u00ca\3\2\2\2\65\u00d0\3\2\2\2\67"+
		"\u00d3\3\2\2\29\u00da\3\2\2\2;\u00e3\3\2\2\2=\u00e7\3\2\2\2?\u00e9\3\2"+
		"\2\2A\u00ee\3\2\2\2C\u00f2\3\2\2\2E\u00f4\3\2\2\2G\u00f6\3\2\2\2I\u00f8"+
		"\3\2\2\2K\u00fa\3\2\2\2M\u0102\3\2\2\2O\u0105\3\2\2\2Q\u010a\3\2\2\2S"+
		"\u010f\3\2\2\2U\u0115\3\2\2\2WX\7r\2\2XY\7t\2\2YZ\7q\2\2Z[\7i\2\2[\\\7"+
		"t\2\2\\]\7c\2\2]^\7o\2\2^_\7c\2\2_\4\3\2\2\2`a\7k\2\2ab\7p\2\2bc\7k\2"+
		"\2cd\7e\2\2de\7k\2\2ef\7q\2\2f\6\3\2\2\2gh\7$\2\2h\b\3\2\2\2ij\7k\2\2"+
		"jk\7p\2\2kl\7v\2\2lm\7g\2\2mn\7k\2\2no\7t\2\2op\7q\2\2p\n\3\2\2\2qr\7"+
		"x\2\2rs\7g\2\2st\7t\2\2tu\7f\2\2uv\7c\2\2vw\7f\2\2wx\7g\2\2xy\7k\2\2y"+
		"z\7t\2\2z{\7q\2\2{\f\3\2\2\2|}\7h\2\2}~\7c\2\2~\177\7n\2\2\177\u0080\7"+
		"u\2\2\u0080\u0081\7q\2\2\u0081\16\3\2\2\2\u0082\u0083\7p\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7q\2\2\u0085\20\3\2\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7k\2\2\u0089\u008a\7c\2\2\u008a\22\3\2\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7p\2\2\u008d\u008e\7s\2\2\u008e\u008f\7w\2\2\u008f"+
		"\u0090\7c\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\u0093\7q\2\2"+
		"\u0093\24\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096\u0097\7"+
		"e\2\2\u0097\u0098\7c\2\2\u0098\26\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b"+
		"\7@\2\2\u009b\30\3\2\2\2\u009c\u009d\7?\2\2\u009d\32\3\2\2\2\u009e\u009f"+
		"\7>\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1\36\3\2\2\2\u00a2\u00a3"+
		"\7@\2\2\u00a3\u00a4\7?\2\2\u00a4 \3\2\2\2\u00a5\u00a6\7,\2\2\u00a6\"\3"+
		"\2\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7x\2\2\u00aa"+
		"$\3\2\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7w\2\2\u00ad&\3\2\2\2\u00ae\u00af"+
		"\7g\2\2\u00af(\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7"+
		"/\2\2\u00b3,\3\2\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7f\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7o\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7p\2\2"+
		"\u00be\u00bf\7v\2\2\u00bf\u00c0\7q\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7u\2"+
		"\2\u00c2\u00c3\7g\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6"+
		"\7p\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\62\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7q\2\2\u00cf\64\3\2\2\2\u00d0\u00d1\7<\2\2\u00d1"+
		"\u00d2\7?\2\2\u00d2\66\3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7w\2\2\u00d5"+
		"\u00d6\7p\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7q\2\2"+
		"\u00d98\3\2\2\2\u00da\u00db\7d\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7q\2"+
		"\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00e2\7q\2\2\u00e2:\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7o\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7=\2\2\u00e8>\3"+
		"\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7o\2\2\u00ec"+
		"\u00ed\7\60\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7x\2\2\u00ef\u00f0\7c\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7.\2\2\u00f3D\3\2\2\2\u00f4\u00f5"+
		"\7<\2\2\u00f5F\3\2\2\2\u00f6\u00f7\7*\2\2\u00f7H\3\2\2\2\u00f8\u00f9\7"+
		"+\2\2\u00f9J\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd"+
		"\7e\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7x\2\2\u0100"+
		"\u0101\7c\2\2\u0101L\3\2\2\2\u0102\u0103\7a\2\2\u0103N\3\2\2\2\u0104\u0106"+
		"\4\62;\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108P\3\2\2\2\u0109\u010b\t\2\2\2\u010a\u0109\3\2\2\2"+
		"\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dR\3"+
		"\2\2\2\u010e\u0110\t\3\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b*"+
		"\2\2\u0114T\3\2\2\2\u0115\u0119\7%\2\2\u0116\u0118\n\4\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\7\17\2\2\u011d\u011c\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\f\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\b+\2\2\u0122V\3\2\2\2\b\2\u0107\u010c\u0111"+
		"\u0119\u011d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}