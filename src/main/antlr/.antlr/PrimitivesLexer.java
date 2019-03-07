// Generated from /Users/kmahalingam/standardhealth/shr-grammar/src/main/antlr/PrimitivesLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrimitivesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_BOOLEAN=1, KW_INTEGER=2, KW_STRING=3, KW_DECIMAL=4, KW_URI=5, KW_BASE64_BINARY=6, 
		KW_INSTANT=7, KW_DATE=8, KW_DATE_TIME=9, KW_TIME=10, KW_CODE=11, KW_OID=12, 
		KW_ID=13, KW_MARKDOWN=14, KW_UNSIGNED_INT=15, KW_POSITIVE_INT=16, KW_XHTML=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"KW_BOOLEAN", "KW_INTEGER", "KW_STRING", "KW_DECIMAL", "KW_URI", "KW_BASE64_BINARY", 
		"KW_INSTANT", "KW_DATE", "KW_DATE_TIME", "KW_TIME", "KW_CODE", "KW_OID", 
		"KW_ID", "KW_MARKDOWN", "KW_UNSIGNED_INT", "KW_POSITIVE_INT", "KW_XHTML"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'integer'", "'string'", "'decimal'", "'uri'", "'base64Binary'", 
		"'instant'", "'date'", "'dateTime'", "'time'", "'code'", "'oid'", "'id'", 
		"'markdown'", "'unsignedInt'", "'positiveInt'", "'xhtml'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_BOOLEAN", "KW_INTEGER", "KW_STRING", "KW_DECIMAL", "KW_URI", 
		"KW_BASE64_BINARY", "KW_INSTANT", "KW_DATE", "KW_DATE_TIME", "KW_TIME", 
		"KW_CODE", "KW_OID", "KW_ID", "KW_MARKDOWN", "KW_UNSIGNED_INT", "KW_POSITIVE_INT", 
		"KW_XHTML"
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


	public PrimitivesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PrimitivesLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\2"+
		"\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23\3\2\2\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5-\3\2\2\2\7\65\3\2\2\2"+
		"\t<\3\2\2\2\13D\3\2\2\2\rH\3\2\2\2\17U\3\2\2\2\21]\3\2\2\2\23b\3\2\2\2"+
		"\25k\3\2\2\2\27p\3\2\2\2\31u\3\2\2\2\33y\3\2\2\2\35|\3\2\2\2\37\u0085"+
		"\3\2\2\2!\u0091\3\2\2\2#\u009d\3\2\2\2%&\7d\2\2&\'\7q\2\2\'(\7q\2\2()"+
		"\7n\2\2)*\7g\2\2*+\7c\2\2+,\7p\2\2,\4\3\2\2\2-.\7k\2\2./\7p\2\2/\60\7"+
		"v\2\2\60\61\7g\2\2\61\62\7i\2\2\62\63\7g\2\2\63\64\7t\2\2\64\6\3\2\2\2"+
		"\65\66\7u\2\2\66\67\7v\2\2\678\7t\2\289\7k\2\29:\7p\2\2:;\7i\2\2;\b\3"+
		"\2\2\2<=\7f\2\2=>\7g\2\2>?\7e\2\2?@\7k\2\2@A\7o\2\2AB\7c\2\2BC\7n\2\2"+
		"C\n\3\2\2\2DE\7w\2\2EF\7t\2\2FG\7k\2\2G\f\3\2\2\2HI\7d\2\2IJ\7c\2\2JK"+
		"\7u\2\2KL\7g\2\2LM\78\2\2MN\7\66\2\2NO\7D\2\2OP\7k\2\2PQ\7p\2\2QR\7c\2"+
		"\2RS\7t\2\2ST\7{\2\2T\16\3\2\2\2UV\7k\2\2VW\7p\2\2WX\7u\2\2XY\7v\2\2Y"+
		"Z\7c\2\2Z[\7p\2\2[\\\7v\2\2\\\20\3\2\2\2]^\7f\2\2^_\7c\2\2_`\7v\2\2`a"+
		"\7g\2\2a\22\3\2\2\2bc\7f\2\2cd\7c\2\2de\7v\2\2ef\7g\2\2fg\7V\2\2gh\7k"+
		"\2\2hi\7o\2\2ij\7g\2\2j\24\3\2\2\2kl\7v\2\2lm\7k\2\2mn\7o\2\2no\7g\2\2"+
		"o\26\3\2\2\2pq\7e\2\2qr\7q\2\2rs\7f\2\2st\7g\2\2t\30\3\2\2\2uv\7q\2\2"+
		"vw\7k\2\2wx\7f\2\2x\32\3\2\2\2yz\7k\2\2z{\7f\2\2{\34\3\2\2\2|}\7o\2\2"+
		"}~\7c\2\2~\177\7t\2\2\177\u0080\7m\2\2\u0080\u0081\7f\2\2\u0081\u0082"+
		"\7q\2\2\u0082\u0083\7y\2\2\u0083\u0084\7p\2\2\u0084\36\3\2\2\2\u0085\u0086"+
		"\7w\2\2\u0086\u0087\7p\2\2\u0087\u0088\7u\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7i\2\2\u008a\u008b\7p\2\2\u008b\u008c\7g\2\2\u008c\u008d\7f\2\2"+
		"\u008d\u008e\7K\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090 \3\2\2"+
		"\2\u0091\u0092\7r\2\2\u0092\u0093\7q\2\2\u0093\u0094\7u\2\2\u0094\u0095"+
		"\7k\2\2\u0095\u0096\7v\2\2\u0096\u0097\7k\2\2\u0097\u0098\7x\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7K\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2"+
		"\u009c\"\3\2\2\2\u009d\u009e\7z\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7v"+
		"\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7n\2\2\u00a2$\3\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}