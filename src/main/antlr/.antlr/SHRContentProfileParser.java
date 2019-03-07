// Generated from /Users/kmahalingam/standardhealth/shr-grammar/src/main/antlr/SHRContentProfileParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SHRContentProfileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_GRAMMAR=1, KW_G_CONTENT_PROFILE=2, KW_NAMESPACE=3, KW_MUST_SUPPORT=4, 
		DOT=5, COLON=6, WHOLE_NUMBER=7, ALL_CAPS=8, UPPER_WORD=9, LOWER_WORD=10, 
		DOT_SEPARATED_LW=11, DOT_SEPARATED_UW=12, STRING=13, WS=14, NEWLINE=15, 
		COMMENT=16, LINE_COMMENT=17;
	public static final int
		RULE_doc = 0, RULE_docHeader = 1, RULE_contentsDefs = 2, RULE_namespaceHeader = 3, 
		RULE_contentDefs = 4, RULE_contentDef = 5, RULE_contentHeader = 6, RULE_fields = 7, 
		RULE_field = 8, RULE_flags = 9, RULE_flag = 10, RULE_version = 11, RULE_namespace = 12, 
		RULE_simpleName = 13, RULE_pathName = 14, RULE_simpleOrPathName = 15;
	public static final String[] ruleNames = {
		"doc", "docHeader", "contentsDefs", "namespaceHeader", "contentDefs", 
		"contentDef", "contentHeader", "fields", "field", "flags", "flag", "version", 
		"namespace", "simpleName", "pathName", "simpleOrPathName"
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

	@Override
	public String getGrammarFileName() { return "SHRContentProfileParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SHRContentProfileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocContext extends ParserRuleContext {
		public DocHeaderContext docHeader() {
			return getRuleContext(DocHeaderContext.class,0);
		}
		public ContentsDefsContext contentsDefs() {
			return getRuleContext(ContentsDefsContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			docHeader();
			setState(33);
			contentsDefs();
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

	public static class DocHeaderContext extends ParserRuleContext {
		public TerminalNode KW_GRAMMAR() { return getToken(SHRContentProfileParser.KW_GRAMMAR, 0); }
		public TerminalNode KW_G_CONTENT_PROFILE() { return getToken(SHRContentProfileParser.KW_G_CONTENT_PROFILE, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public DocHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docHeader; }
	}

	public final DocHeaderContext docHeader() throws RecognitionException {
		DocHeaderContext _localctx = new DocHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_docHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(KW_GRAMMAR);
			setState(36);
			match(KW_G_CONTENT_PROFILE);
			setState(37);
			version();
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

	public static class ContentsDefsContext extends ParserRuleContext {
		public List<NamespaceHeaderContext> namespaceHeader() {
			return getRuleContexts(NamespaceHeaderContext.class);
		}
		public NamespaceHeaderContext namespaceHeader(int i) {
			return getRuleContext(NamespaceHeaderContext.class,i);
		}
		public List<ContentDefsContext> contentDefs() {
			return getRuleContexts(ContentDefsContext.class);
		}
		public ContentDefsContext contentDefs(int i) {
			return getRuleContext(ContentDefsContext.class,i);
		}
		public ContentsDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentsDefs; }
	}

	public final ContentsDefsContext contentsDefs() throws RecognitionException {
		ContentsDefsContext _localctx = new ContentsDefsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_contentsDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_NAMESPACE) {
				{
				{
				setState(39);
				namespaceHeader();
				setState(40);
				contentDefs();
				}
				}
				setState(46);
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

	public static class NamespaceHeaderContext extends ParserRuleContext {
		public TerminalNode KW_NAMESPACE() { return getToken(SHRContentProfileParser.KW_NAMESPACE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public NamespaceHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceHeader; }
	}

	public final NamespaceHeaderContext namespaceHeader() throws RecognitionException {
		NamespaceHeaderContext _localctx = new NamespaceHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespaceHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(KW_NAMESPACE);
			setState(48);
			namespace();
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

	public static class ContentDefsContext extends ParserRuleContext {
		public List<ContentDefContext> contentDef() {
			return getRuleContexts(ContentDefContext.class);
		}
		public ContentDefContext contentDef(int i) {
			return getRuleContext(ContentDefContext.class,i);
		}
		public ContentDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentDefs; }
	}

	public final ContentDefsContext contentDefs() throws RecognitionException {
		ContentDefsContext _localctx = new ContentDefsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_contentDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				contentDef();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL_CAPS) | (1L << UPPER_WORD) | (1L << LOWER_WORD))) != 0) );
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

	public static class ContentDefContext extends ParserRuleContext {
		public ContentHeaderContext contentHeader() {
			return getRuleContext(ContentHeaderContext.class,0);
		}
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public ContentDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentDef; }
	}

	public final ContentDefContext contentDef() throws RecognitionException {
		ContentDefContext _localctx = new ContentDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contentDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			contentHeader();
			setState(56);
			fields();
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

	public static class ContentHeaderContext extends ParserRuleContext {
		public SimpleOrPathNameContext simpleOrPathName() {
			return getRuleContext(SimpleOrPathNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SHRContentProfileParser.COLON, 0); }
		public ContentHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentHeader; }
	}

	public final ContentHeaderContext contentHeader() throws RecognitionException {
		ContentHeaderContext _localctx = new ContentHeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contentHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			simpleOrPathName();
			setState(59);
			match(COLON);
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

	public static class FieldsContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fields);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					field();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class FieldContext extends ParserRuleContext {
		public SimpleOrPathNameContext simpleOrPathName() {
			return getRuleContext(SimpleOrPathNameContext.class,0);
		}
		public FlagsContext flags() {
			return getRuleContext(FlagsContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			simpleOrPathName();
			setState(68);
			flags();
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

	public static class FlagsContext extends ParserRuleContext {
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public FlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flags; }
	}

	public final FlagsContext flags() throws RecognitionException {
		FlagsContext _localctx = new FlagsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				flag();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_MUST_SUPPORT );
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

	public static class FlagContext extends ParserRuleContext {
		public TerminalNode KW_MUST_SUPPORT() { return getToken(SHRContentProfileParser.KW_MUST_SUPPORT, 0); }
		public FlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flag; }
	}

	public final FlagContext flag() throws RecognitionException {
		FlagContext _localctx = new FlagContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(KW_MUST_SUPPORT);
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

	public static class VersionContext extends ParserRuleContext {
		public List<TerminalNode> WHOLE_NUMBER() { return getTokens(SHRContentProfileParser.WHOLE_NUMBER); }
		public TerminalNode WHOLE_NUMBER(int i) {
			return getToken(SHRContentProfileParser.WHOLE_NUMBER, i);
		}
		public TerminalNode DOT() { return getToken(SHRContentProfileParser.DOT, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(WHOLE_NUMBER);
			setState(78);
			match(DOT);
			setState(79);
			match(WHOLE_NUMBER);
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode LOWER_WORD() { return getToken(SHRContentProfileParser.LOWER_WORD, 0); }
		public TerminalNode DOT_SEPARATED_LW() { return getToken(SHRContentProfileParser.DOT_SEPARATED_LW, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==LOWER_WORD || _la==DOT_SEPARATED_LW) ) {
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

	public static class SimpleNameContext extends ParserRuleContext {
		public TerminalNode UPPER_WORD() { return getToken(SHRContentProfileParser.UPPER_WORD, 0); }
		public TerminalNode ALL_CAPS() { return getToken(SHRContentProfileParser.ALL_CAPS, 0); }
		public TerminalNode LOWER_WORD() { return getToken(SHRContentProfileParser.LOWER_WORD, 0); }
		public SimpleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleName; }
	}

	public final SimpleNameContext simpleName() throws RecognitionException {
		SimpleNameContext _localctx = new SimpleNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL_CAPS) | (1L << UPPER_WORD) | (1L << LOWER_WORD))) != 0)) ) {
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

	public static class PathNameContext extends ParserRuleContext {
		public List<SimpleNameContext> simpleName() {
			return getRuleContexts(SimpleNameContext.class);
		}
		public SimpleNameContext simpleName(int i) {
			return getRuleContext(SimpleNameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SHRContentProfileParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SHRContentProfileParser.DOT, i);
		}
		public PathNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathName; }
	}

	public final PathNameContext pathName() throws RecognitionException {
		PathNameContext _localctx = new PathNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pathName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			simpleName();
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				match(DOT);
				setState(87);
				simpleName();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
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

	public static class SimpleOrPathNameContext extends ParserRuleContext {
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public SimpleOrPathNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleOrPathName; }
	}

	public final SimpleOrPathNameContext simpleOrPathName() throws RecognitionException {
		SimpleOrPathNameContext _localctx = new SimpleOrPathNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleOrPathName);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				simpleName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				pathName();
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\5\3\6\6\6"+
		"\66\n\6\r\6\16\6\67\3\7\3\7\3\7\3\b\3\b\3\b\3\t\7\tA\n\t\f\t\16\tD\13"+
		"\t\3\n\3\n\3\n\3\13\6\13J\n\13\r\13\16\13K\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\6\20[\n\20\r\20\16\20\\\3\21\3\21\5\21"+
		"a\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\f\r"+
		"\3\2\n\f\2X\2\"\3\2\2\2\4%\3\2\2\2\6.\3\2\2\2\b\61\3\2\2\2\n\65\3\2\2"+
		"\2\f9\3\2\2\2\16<\3\2\2\2\20B\3\2\2\2\22E\3\2\2\2\24I\3\2\2\2\26M\3\2"+
		"\2\2\30O\3\2\2\2\32S\3\2\2\2\34U\3\2\2\2\36W\3\2\2\2 `\3\2\2\2\"#\5\4"+
		"\3\2#$\5\6\4\2$\3\3\2\2\2%&\7\3\2\2&\'\7\4\2\2\'(\5\30\r\2(\5\3\2\2\2"+
		")*\5\b\5\2*+\5\n\6\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2"+
		"\2/\7\3\2\2\2\60.\3\2\2\2\61\62\7\5\2\2\62\63\5\32\16\2\63\t\3\2\2\2\64"+
		"\66\5\f\7\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\13"+
		"\3\2\2\29:\5\16\b\2:;\5\20\t\2;\r\3\2\2\2<=\5 \21\2=>\7\b\2\2>\17\3\2"+
		"\2\2?A\5\22\n\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\21\3\2\2\2DB"+
		"\3\2\2\2EF\5 \21\2FG\5\24\13\2G\23\3\2\2\2HJ\5\26\f\2IH\3\2\2\2JK\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2L\25\3\2\2\2MN\7\6\2\2N\27\3\2\2\2OP\7\t\2\2P"+
		"Q\7\7\2\2QR\7\t\2\2R\31\3\2\2\2ST\t\2\2\2T\33\3\2\2\2UV\t\3\2\2V\35\3"+
		"\2\2\2WZ\5\34\17\2XY\7\7\2\2Y[\5\34\17\2ZX\3\2\2\2[\\\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]\37\3\2\2\2^a\5\34\17\2_a\5\36\20\2`^\3\2\2\2`_\3\2\2\2"+
		"a!\3\2\2\2\b.\67BK\\`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}