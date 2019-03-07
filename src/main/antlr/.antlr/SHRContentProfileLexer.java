// Generated from /Users/kmahalingam/standardhealth/shr-grammar/src/main/antlr/SHRContentProfileLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SHRContentProfileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_GRAMMAR=1, KW_G_CONTENT_PROFILE=2, KW_NAMESPACE=3, KW_MUST_SUPPORT=4, 
		DOT=5, COLON=6, WHOLE_NUMBER=7, ALL_CAPS=8, UPPER_WORD=9, LOWER_WORD=10, 
		DOT_SEPARATED_LW=11, DOT_SEPARATED_UW=12, STRING=13, WS=14, NEWLINE=15, 
		COMMENT=16, LINE_COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"KW_GRAMMAR", "KW_G_CONTENT_PROFILE", "KW_NAMESPACE", "KW_MUST_SUPPORT", 
		"DOT", "COLON", "WHOLE_NUMBER", "ALL_CAPS", "UPPER_WORD", "LOWER_WORD", 
		"DOT_SEPARATED_LW", "DOT_SEPARATED_UW", "STRING", "WS", "NEWLINE", "COMMENT", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Grammar:'", "'ContentProfile'", "'Namespace:'", "'MS'", "'.'", 
		"':'", null, null, null, null, null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_GRAMMAR", "KW_G_CONTENT_PROFILE", "KW_NAMESPACE", "KW_MUST_SUPPORT", 
		"DOT", "COLON", "WHOLE_NUMBER", "ALL_CAPS", "UPPER_WORD", "LOWER_WORD", 
		"DOT_SEPARATED_LW", "DOT_SEPARATED_UW", "STRING", "WS", "NEWLINE", "COMMENT", 
		"LINE_COMMENT"
	};
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


	public SHRContentProfileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SHRContentProfileLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00c2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\bQ\n\b\r\b\16\bR\3\t\3\t\7\t"+
		"W\n\t\f\t\16\tZ\13\t\3\n\3\n\7\n^\n\n\f\n\16\na\13\n\3\13\3\13\7\13e\n"+
		"\13\f\13\16\13h\13\13\3\f\3\f\7\fl\n\f\f\f\16\fo\13\f\3\f\3\f\3\f\7\f"+
		"t\n\f\f\f\16\fw\13\f\6\fy\n\f\r\f\16\fz\3\r\3\r\7\r\177\n\r\f\r\16\r\u0082"+
		"\13\r\3\r\3\r\3\r\7\r\u0087\n\r\f\r\16\r\u008a\13\r\7\r\u008c\n\r\f\r"+
		"\16\r\u008f\13\r\3\r\3\r\3\r\7\r\u0094\n\r\f\r\16\r\u0097\13\r\3\16\3"+
		"\16\7\16\u009b\n\16\f\16\16\16\u009e\13\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00ae\n\21\f\21\16\21"+
		"\u00b1\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00bc\n"+
		"\22\f\22\16\22\u00bf\13\22\3\22\3\22\3\u00af\2\23\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\f\3"+
		"\2\62;\3\2C\\\5\2\62;C\\aa\6\2\62;C\\^ac|\3\2c|\7\2//\62;C\\^^c|\5\2/"+
		"/\62;C|\4\2$$^^\5\2\13\13\17\17\"\"\4\2\f\f\17\17\2\u00cf\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2"+
		"\2\5.\3\2\2\2\7=\3\2\2\2\tH\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17P\3\2\2\2"+
		"\21T\3\2\2\2\23[\3\2\2\2\25b\3\2\2\2\27i\3\2\2\2\31|\3\2\2\2\33\u0098"+
		"\3\2\2\2\35\u00a1\3\2\2\2\37\u00a5\3\2\2\2!\u00a9\3\2\2\2#\u00b7\3\2\2"+
		"\2%&\7I\2\2&\'\7t\2\2\'(\7c\2\2()\7o\2\2)*\7o\2\2*+\7c\2\2+,\7t\2\2,-"+
		"\7<\2\2-\4\3\2\2\2./\7E\2\2/\60\7q\2\2\60\61\7p\2\2\61\62\7v\2\2\62\63"+
		"\7g\2\2\63\64\7p\2\2\64\65\7v\2\2\65\66\7R\2\2\66\67\7t\2\2\678\7q\2\2"+
		"89\7h\2\29:\7k\2\2:;\7n\2\2;<\7g\2\2<\6\3\2\2\2=>\7P\2\2>?\7c\2\2?@\7"+
		"o\2\2@A\7g\2\2AB\7u\2\2BC\7r\2\2CD\7c\2\2DE\7e\2\2EF\7g\2\2FG\7<\2\2G"+
		"\b\3\2\2\2HI\7O\2\2IJ\7U\2\2J\n\3\2\2\2KL\7\60\2\2L\f\3\2\2\2MN\7<\2\2"+
		"N\16\3\2\2\2OQ\t\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\20\3\2"+
		"\2\2TX\t\3\2\2UW\t\4\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\22\3"+
		"\2\2\2ZX\3\2\2\2[_\t\3\2\2\\^\t\5\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_"+
		"`\3\2\2\2`\24\3\2\2\2a_\3\2\2\2bf\t\6\2\2ce\t\7\2\2dc\3\2\2\2eh\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2g\26\3\2\2\2hf\3\2\2\2im\t\6\2\2jl\t\7\2\2kj\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nx\3\2\2\2om\3\2\2\2pq\7\60\2\2qu\t"+
		"\6\2\2rt\t\b\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3"+
		"\2\2\2xp\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\30\3\2\2\2|\u0080\t\6"+
		"\2\2}\177\t\7\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u008d\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\60\2\2"+
		"\u0084\u0088\t\6\2\2\u0085\u0087\t\b\2\2\u0086\u0085\3\2\2\2\u0087\u008a"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u0083\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\60\2\2\u0091\u0095\t\3\2\2\u0092\u0094\t\b\2\2\u0093\u0092\3"+
		"\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\32\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009c\7$\2\2\u0099\u009b\n\t\2\2"+
		"\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7$\2\2\u00a0"+
		"\34\3\2\2\2\u00a1\u00a2\t\n\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\17\2"+
		"\2\u00a4\36\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\b\20\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7,\2\2\u00ab"+
		"\u00af\3\2\2\2\u00ac\u00ae\13\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\7\61\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\b\21\3\2\u00b6\"\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9"+
		"\7\61\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\n\13\2\2\u00bb\u00ba\3\2\2\2"+
		"\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\b\22\3\2\u00c1$\3\2\2\2\21\2"+
		"RX_fmuz\u0080\u0088\u008d\u0095\u009c\u00af\u00bd\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}