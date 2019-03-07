// Generated from /Users/kmahalingam/standardhealth/shr-grammar/src/main/antlr/PatternsLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PatternsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHOLE_NUMBER=1, ALL_CAPS=2, UPPER_WORD=3, LOWER_WORD=4, DOT_SEPARATED_LW=5, 
		DOT_SEPARATED_UW=6, STRING=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHOLE_NUMBER", "ALL_CAPS", "UPPER_WORD", "LOWER_WORD", "DOT_SEPARATED_LW", 
		"DOT_SEPARATED_UW", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHOLE_NUMBER", "ALL_CAPS", "UPPER_WORD", "LOWER_WORD", "DOT_SEPARATED_LW", 
		"DOT_SEPARATED_UW", "STRING"
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


	public PatternsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PatternsLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tc\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\7\4 \n\4\f\4\16\4#\13"+
		"\4\3\5\3\5\7\5\'\n\5\f\5\16\5*\13\5\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6"+
		"\3\6\3\6\3\6\7\6\66\n\6\f\6\16\69\13\6\6\6;\n\6\r\6\16\6<\3\7\3\7\7\7"+
		"A\n\7\f\7\16\7D\13\7\3\7\3\7\3\7\7\7I\n\7\f\7\16\7L\13\7\7\7N\n\7\f\7"+
		"\16\7Q\13\7\3\7\3\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\3\b\3\b\7\b]\n\b\f\b\16"+
		"\b`\13\b\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\n\3\2\62;\3\2"+
		"C\\\5\2\62;C\\aa\6\2\62;C\\^ac|\3\2c|\7\2//\62;C\\^^c|\5\2//\62;C|\4\2"+
		"$$^^\2n\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\3\22\3\2\2\2\5\26\3\2\2\2\7\35\3\2\2\2\t$\3\2"+
		"\2\2\13+\3\2\2\2\r>\3\2\2\2\17Z\3\2\2\2\21\23\t\2\2\2\22\21\3\2\2\2\23"+
		"\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\4\3\2\2\2\26\32\t\3\2\2\27"+
		"\31\t\4\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33"+
		"\6\3\2\2\2\34\32\3\2\2\2\35!\t\3\2\2\36 \t\5\2\2\37\36\3\2\2\2 #\3\2\2"+
		"\2!\37\3\2\2\2!\"\3\2\2\2\"\b\3\2\2\2#!\3\2\2\2$(\t\6\2\2%\'\t\7\2\2&"+
		"%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\n\3\2\2\2*(\3\2\2\2+/\t\6\2"+
		"\2,.\t\7\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60:\3\2\2\2\61"+
		"/\3\2\2\2\62\63\7\60\2\2\63\67\t\6\2\2\64\66\t\b\2\2\65\64\3\2\2\2\66"+
		"9\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29\67\3\2\2\2:\62\3\2\2\2"+
		";<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\f\3\2\2\2>B\t\6\2\2?A\t\7\2\2@?\3\2\2"+
		"\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CO\3\2\2\2DB\3\2\2\2EF\7\60\2\2FJ\t\6"+
		"\2\2GI\t\b\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2"+
		"\2\2ME\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\60"+
		"\2\2SW\t\3\2\2TV\t\b\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\16\3"+
		"\2\2\2YW\3\2\2\2Z^\7$\2\2[]\n\t\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_"+
		"\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7$\2\2b\20\3\2\2\2\17\2\24\32!(/\67<BJ"+
		"OW^\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}