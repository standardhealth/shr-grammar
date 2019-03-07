// Generated from /Users/kmahalingam/standardhealth/shr-grammar/src/main/antlr/SHRDataElementParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SHRDataElementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_GRAMMAR=1, KW_G_DATA_ELEMENT=2, KW_NAMESPACE=3, KW_USES=4, KW_PATH=5, 
		KW_VOCABULARY=6, KW_ABSTRACT=7, KW_ELEMENT=8, KW_ENTRY_ELEMENT=9, KW_BASED_ON=10, 
		KW_VALUE=11, KW_CONCEPT=12, KW_DESCRIPTION=13, KW_REF=14, KW_OR=15, KW_WITH=16, 
		KW_MUST_BE=17, KW_SHOULD_BE=18, KW_COULD_BE=19, KW_IF_COVERED=20, KW_FROM=21, 
		KW_UNITS=22, KW_IS=23, KW_IS_TYPE=24, KW_VALUE_IS_TYPE=25, KW_INCLUDES=26, 
		KW_TRUE=27, KW_FALSE=28, KW_TBD=29, KW_TBD_CODE=30, KW_BAR_ENTRY=31, KW_BAR_VALUE=32, 
		DOT=33, EQUAL=34, COMMA=35, STAR=36, OPEN_PAREN=37, CLOSE_PAREN=38, RANGE=39, 
		URL=40, PATH_URL=41, URN_OID=42, URN=43, CODE=44, KW_BOOLEAN=45, KW_INTEGER=46, 
		KW_STRING=47, KW_DECIMAL=48, KW_URI=49, KW_BASE64_BINARY=50, KW_INSTANT=51, 
		KW_DATE=52, KW_DATE_TIME=53, KW_TIME=54, KW_CODE=55, KW_OID=56, KW_ID=57, 
		KW_MARKDOWN=58, KW_UNSIGNED_INT=59, KW_POSITIVE_INT=60, KW_XHTML=61, WHOLE_NUMBER=62, 
		ALL_CAPS=63, UPPER_WORD=64, LOWER_WORD=65, DOT_SEPARATED_LW=66, DOT_SEPARATED_UW=67, 
		STRING=68, WS=69, NEWLINE=70, COMMENT=71, LINE_COMMENT=72;
	public static final int
		RULE_doc = 0, RULE_docHeader = 1, RULE_usesStatement = 2, RULE_pathDefs = 3, 
		RULE_pathDef = 4, RULE_vocabularyDefs = 5, RULE_vocabularyDef = 6, RULE_dataDefs = 7, 
		RULE_dataDef = 8, RULE_elementDef = 9, RULE_elementHeader = 10, RULE_entryDef = 11, 
		RULE_entryHeader = 12, RULE_elementProps = 13, RULE_elementProp = 14, 
		RULE_values = 15, RULE_value = 16, RULE_valueType = 17, RULE_field = 18, 
		RULE_fieldType = 19, RULE_basedOnProp = 20, RULE_conceptProp = 21, RULE_concepts = 22, 
		RULE_descriptionProp = 23, RULE_version = 24, RULE_namespace = 25, RULE_specialWord = 26, 
		RULE_simpleName = 27, RULE_fullyQualifiedName = 28, RULE_simpleOrFQName = 29, 
		RULE_ref = 30, RULE_code = 31, RULE_fullyQualifiedCode = 32, RULE_codeOrFQCode = 33, 
		RULE_bindingInfix = 34, RULE_typeConstraint = 35, RULE_elementWithConstraint = 36, 
		RULE_elementPath = 37, RULE_elementConstraint = 38, RULE_legacyWithCode = 39, 
		RULE_elementCodeVSConstraint = 40, RULE_elementCodeValueConstraint = 41, 
		RULE_elementIncludesCodeValueConstraint = 42, RULE_elementBooleanConstraint = 43, 
		RULE_elementTypeConstraint = 44, RULE_elementIncludesTypeConstraint = 45, 
		RULE_elementWithUnitsConstraint = 46, RULE_valueset = 47, RULE_primitive = 48, 
		RULE_count = 49, RULE_tbd = 50, RULE_tbdCode = 51;
	public static final String[] ruleNames = {
		"doc", "docHeader", "usesStatement", "pathDefs", "pathDef", "vocabularyDefs", 
		"vocabularyDef", "dataDefs", "dataDef", "elementDef", "elementHeader", 
		"entryDef", "entryHeader", "elementProps", "elementProp", "values", "value", 
		"valueType", "field", "fieldType", "basedOnProp", "conceptProp", "concepts", 
		"descriptionProp", "version", "namespace", "specialWord", "simpleName", 
		"fullyQualifiedName", "simpleOrFQName", "ref", "code", "fullyQualifiedCode", 
		"codeOrFQCode", "bindingInfix", "typeConstraint", "elementWithConstraint", 
		"elementPath", "elementConstraint", "legacyWithCode", "elementCodeVSConstraint", 
		"elementCodeValueConstraint", "elementIncludesCodeValueConstraint", "elementBooleanConstraint", 
		"elementTypeConstraint", "elementIncludesTypeConstraint", "elementWithUnitsConstraint", 
		"valueset", "primitive", "count", "tbd", "tbdCode"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Grammar:'", "'DataElement'", "'Namespace:'", "'Uses:'", "'Path:'", 
		"'CodeSystem:'", "'Abstract'", "'Element:'", "'EntryElement:'", "'Based on:'", 
		"'Value:'", "'Concept:'", "'Description:'", "'ref'", "'or'", "'with'", 
		"'must be'", "'should be'", "'could be'", "'if covered'", "'from'", "'units'", 
		"'is'", "'is type'", "'value is type'", "'includes'", "'true'", "'false'", 
		"'TBD'", "'TBD#TBD'", "'_Entry'", "'_Value'", "'.'", "'='", "','", "'*'", 
		"'('", "')'", "'..'", null, null, null, null, null, "'boolean'", "'integer'", 
		"'string'", "'decimal'", "'uri'", "'base64Binary'", "'instant'", "'date'", 
		"'dateTime'", "'time'", "'code'", "'oid'", "'id'", "'markdown'", "'unsignedInt'", 
		"'positiveInt'", "'xhtml'", null, null, null, null, null, null, null, 
		null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_GRAMMAR", "KW_G_DATA_ELEMENT", "KW_NAMESPACE", "KW_USES", "KW_PATH", 
		"KW_VOCABULARY", "KW_ABSTRACT", "KW_ELEMENT", "KW_ENTRY_ELEMENT", "KW_BASED_ON", 
		"KW_VALUE", "KW_CONCEPT", "KW_DESCRIPTION", "KW_REF", "KW_OR", "KW_WITH", 
		"KW_MUST_BE", "KW_SHOULD_BE", "KW_COULD_BE", "KW_IF_COVERED", "KW_FROM", 
		"KW_UNITS", "KW_IS", "KW_IS_TYPE", "KW_VALUE_IS_TYPE", "KW_INCLUDES", 
		"KW_TRUE", "KW_FALSE", "KW_TBD", "KW_TBD_CODE", "KW_BAR_ENTRY", "KW_BAR_VALUE", 
		"DOT", "EQUAL", "COMMA", "STAR", "OPEN_PAREN", "CLOSE_PAREN", "RANGE", 
		"URL", "PATH_URL", "URN_OID", "URN", "CODE", "KW_BOOLEAN", "KW_INTEGER", 
		"KW_STRING", "KW_DECIMAL", "KW_URI", "KW_BASE64_BINARY", "KW_INSTANT", 
		"KW_DATE", "KW_DATE_TIME", "KW_TIME", "KW_CODE", "KW_OID", "KW_ID", "KW_MARKDOWN", 
		"KW_UNSIGNED_INT", "KW_POSITIVE_INT", "KW_XHTML", "WHOLE_NUMBER", "ALL_CAPS", 
		"UPPER_WORD", "LOWER_WORD", "DOT_SEPARATED_LW", "DOT_SEPARATED_UW", "STRING", 
		"WS", "NEWLINE", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "SHRDataElementParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SHRDataElementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocContext extends ParserRuleContext {
		public DocHeaderContext docHeader() {
			return getRuleContext(DocHeaderContext.class,0);
		}
		public DataDefsContext dataDefs() {
			return getRuleContext(DataDefsContext.class,0);
		}
		public DescriptionPropContext descriptionProp() {
			return getRuleContext(DescriptionPropContext.class,0);
		}
		public UsesStatementContext usesStatement() {
			return getRuleContext(UsesStatementContext.class,0);
		}
		public PathDefsContext pathDefs() {
			return getRuleContext(PathDefsContext.class,0);
		}
		public VocabularyDefsContext vocabularyDefs() {
			return getRuleContext(VocabularyDefsContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_doc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			docHeader();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DESCRIPTION) {
				{
				setState(105);
				descriptionProp();
				}
			}

			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_USES) {
				{
				setState(108);
				usesStatement();
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PATH) {
				{
				setState(111);
				pathDefs();
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_VOCABULARY) {
				{
				setState(114);
				vocabularyDefs();
				}
			}

			setState(117);
			dataDefs();
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
		public TerminalNode KW_GRAMMAR() { return getToken(SHRDataElementParser.KW_GRAMMAR, 0); }
		public TerminalNode KW_G_DATA_ELEMENT() { return getToken(SHRDataElementParser.KW_G_DATA_ELEMENT, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public TerminalNode KW_NAMESPACE() { return getToken(SHRDataElementParser.KW_NAMESPACE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
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
			setState(119);
			match(KW_GRAMMAR);
			setState(120);
			match(KW_G_DATA_ELEMENT);
			setState(121);
			version();
			setState(122);
			match(KW_NAMESPACE);
			setState(123);
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

	public static class UsesStatementContext extends ParserRuleContext {
		public TerminalNode KW_USES() { return getToken(SHRDataElementParser.KW_USES, 0); }
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SHRDataElementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHRDataElementParser.COMMA, i);
		}
		public UsesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usesStatement; }
	}

	public final UsesStatementContext usesStatement() throws RecognitionException {
		UsesStatementContext _localctx = new UsesStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_usesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(KW_USES);
			setState(126);
			namespace();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127);
				match(COMMA);
				setState(128);
				namespace();
				}
				}
				setState(133);
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

	public static class PathDefsContext extends ParserRuleContext {
		public List<PathDefContext> pathDef() {
			return getRuleContexts(PathDefContext.class);
		}
		public PathDefContext pathDef(int i) {
			return getRuleContext(PathDefContext.class,i);
		}
		public PathDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathDefs; }
	}

	public final PathDefsContext pathDefs() throws RecognitionException {
		PathDefsContext _localctx = new PathDefsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pathDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				pathDef();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_PATH );
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

	public static class PathDefContext extends ParserRuleContext {
		public TerminalNode KW_PATH() { return getToken(SHRDataElementParser.KW_PATH, 0); }
		public TerminalNode ALL_CAPS() { return getToken(SHRDataElementParser.ALL_CAPS, 0); }
		public TerminalNode EQUAL() { return getToken(SHRDataElementParser.EQUAL, 0); }
		public TerminalNode URL() { return getToken(SHRDataElementParser.URL, 0); }
		public PathDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathDef; }
	}

	public final PathDefContext pathDef() throws RecognitionException {
		PathDefContext _localctx = new PathDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pathDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(KW_PATH);
			setState(140);
			match(ALL_CAPS);
			setState(141);
			match(EQUAL);
			setState(142);
			match(URL);
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

	public static class VocabularyDefsContext extends ParserRuleContext {
		public List<VocabularyDefContext> vocabularyDef() {
			return getRuleContexts(VocabularyDefContext.class);
		}
		public VocabularyDefContext vocabularyDef(int i) {
			return getRuleContext(VocabularyDefContext.class,i);
		}
		public VocabularyDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vocabularyDefs; }
	}

	public final VocabularyDefsContext vocabularyDefs() throws RecognitionException {
		VocabularyDefsContext _localctx = new VocabularyDefsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vocabularyDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				vocabularyDef();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_VOCABULARY );
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

	public static class VocabularyDefContext extends ParserRuleContext {
		public TerminalNode KW_VOCABULARY() { return getToken(SHRDataElementParser.KW_VOCABULARY, 0); }
		public TerminalNode ALL_CAPS() { return getToken(SHRDataElementParser.ALL_CAPS, 0); }
		public TerminalNode EQUAL() { return getToken(SHRDataElementParser.EQUAL, 0); }
		public TerminalNode URL() { return getToken(SHRDataElementParser.URL, 0); }
		public TerminalNode URN_OID() { return getToken(SHRDataElementParser.URN_OID, 0); }
		public TerminalNode URN() { return getToken(SHRDataElementParser.URN, 0); }
		public VocabularyDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vocabularyDef; }
	}

	public final VocabularyDefContext vocabularyDef() throws RecognitionException {
		VocabularyDefContext _localctx = new VocabularyDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vocabularyDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(KW_VOCABULARY);
			setState(150);
			match(ALL_CAPS);
			setState(151);
			match(EQUAL);
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << URL) | (1L << URN_OID) | (1L << URN))) != 0)) ) {
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

	public static class DataDefsContext extends ParserRuleContext {
		public List<DataDefContext> dataDef() {
			return getRuleContexts(DataDefContext.class);
		}
		public DataDefContext dataDef(int i) {
			return getRuleContext(DataDefContext.class,i);
		}
		public DataDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDefs; }
	}

	public final DataDefsContext dataDefs() throws RecognitionException {
		DataDefsContext _localctx = new DataDefsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ABSTRACT) | (1L << KW_ELEMENT) | (1L << KW_ENTRY_ELEMENT))) != 0)) {
				{
				{
				setState(154);
				dataDef();
				}
				}
				setState(159);
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

	public static class DataDefContext extends ParserRuleContext {
		public ElementDefContext elementDef() {
			return getRuleContext(ElementDefContext.class,0);
		}
		public EntryDefContext entryDef() {
			return getRuleContext(EntryDefContext.class,0);
		}
		public DataDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDef; }
	}

	public final DataDefContext dataDef() throws RecognitionException {
		DataDefContext _localctx = new DataDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dataDef);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ABSTRACT:
			case KW_ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				elementDef();
				}
				break;
			case KW_ENTRY_ELEMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				entryDef();
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

	public static class ElementDefContext extends ParserRuleContext {
		public ElementHeaderContext elementHeader() {
			return getRuleContext(ElementHeaderContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ElementPropsContext elementProps() {
			return getRuleContext(ElementPropsContext.class,0);
		}
		public ElementDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDef; }
	}

	public final ElementDefContext elementDef() throws RecognitionException {
		ElementDefContext _localctx = new ElementDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elementDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			elementHeader();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BASED_ON) | (1L << KW_CONCEPT) | (1L << KW_DESCRIPTION))) != 0)) {
				{
				setState(165);
				elementProps();
				}
			}

			setState(168);
			values();
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

	public static class ElementHeaderContext extends ParserRuleContext {
		public TerminalNode KW_ELEMENT() { return getToken(SHRDataElementParser.KW_ELEMENT, 0); }
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode KW_ABSTRACT() { return getToken(SHRDataElementParser.KW_ABSTRACT, 0); }
		public ElementHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementHeader; }
	}

	public final ElementHeaderContext elementHeader() throws RecognitionException {
		ElementHeaderContext _localctx = new ElementHeaderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT) {
				{
				setState(170);
				match(KW_ABSTRACT);
				}
			}

			setState(173);
			match(KW_ELEMENT);
			setState(174);
			simpleName();
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

	public static class EntryDefContext extends ParserRuleContext {
		public EntryHeaderContext entryHeader() {
			return getRuleContext(EntryHeaderContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ElementPropsContext elementProps() {
			return getRuleContext(ElementPropsContext.class,0);
		}
		public EntryDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryDef; }
	}

	public final EntryDefContext entryDef() throws RecognitionException {
		EntryDefContext _localctx = new EntryDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_entryDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			entryHeader();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BASED_ON) | (1L << KW_CONCEPT) | (1L << KW_DESCRIPTION))) != 0)) {
				{
				setState(177);
				elementProps();
				}
			}

			setState(180);
			values();
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

	public static class EntryHeaderContext extends ParserRuleContext {
		public TerminalNode KW_ENTRY_ELEMENT() { return getToken(SHRDataElementParser.KW_ENTRY_ELEMENT, 0); }
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public EntryHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryHeader; }
	}

	public final EntryHeaderContext entryHeader() throws RecognitionException {
		EntryHeaderContext _localctx = new EntryHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_entryHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(KW_ENTRY_ELEMENT);
			setState(183);
			simpleName();
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

	public static class ElementPropsContext extends ParserRuleContext {
		public List<ElementPropContext> elementProp() {
			return getRuleContexts(ElementPropContext.class);
		}
		public ElementPropContext elementProp(int i) {
			return getRuleContext(ElementPropContext.class,i);
		}
		public ElementPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementProps; }
	}

	public final ElementPropsContext elementProps() throws RecognitionException {
		ElementPropsContext _localctx = new ElementPropsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elementProps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				elementProp();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BASED_ON) | (1L << KW_CONCEPT) | (1L << KW_DESCRIPTION))) != 0) );
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

	public static class ElementPropContext extends ParserRuleContext {
		public BasedOnPropContext basedOnProp() {
			return getRuleContext(BasedOnPropContext.class,0);
		}
		public ConceptPropContext conceptProp() {
			return getRuleContext(ConceptPropContext.class,0);
		}
		public DescriptionPropContext descriptionProp() {
			return getRuleContext(DescriptionPropContext.class,0);
		}
		public ElementPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementProp; }
	}

	public final ElementPropContext elementProp() throws RecognitionException {
		ElementPropContext _localctx = new ElementPropContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elementProp);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BASED_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				basedOnProp();
				}
				break;
			case KW_CONCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				conceptProp();
				}
				break;
			case KW_DESCRIPTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				descriptionProp();
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

	public static class ValuesContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_VALUE) {
				{
				setState(195);
				value();
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (KW_REF - 14)) | (1L << (KW_TBD - 14)) | (1L << (KW_BAR_ENTRY - 14)) | (1L << (KW_BAR_VALUE - 14)) | (1L << (OPEN_PAREN - 14)) | (1L << (KW_BOOLEAN - 14)) | (1L << (KW_INTEGER - 14)) | (1L << (KW_STRING - 14)) | (1L << (KW_DECIMAL - 14)) | (1L << (KW_URI - 14)) | (1L << (KW_BASE64_BINARY - 14)) | (1L << (KW_INSTANT - 14)) | (1L << (KW_DATE - 14)) | (1L << (KW_DATE_TIME - 14)) | (1L << (KW_TIME - 14)) | (1L << (KW_CODE - 14)) | (1L << (KW_OID - 14)) | (1L << (KW_ID - 14)) | (1L << (KW_MARKDOWN - 14)) | (1L << (KW_UNSIGNED_INT - 14)) | (1L << (KW_POSITIVE_INT - 14)) | (1L << (KW_XHTML - 14)) | (1L << (WHOLE_NUMBER - 14)) | (1L << (ALL_CAPS - 14)) | (1L << (UPPER_WORD - 14)) | (1L << (LOWER_WORD - 14)) | (1L << (DOT_SEPARATED_UW - 14)))) != 0)) {
				{
				{
				setState(198);
				field();
				}
				}
				setState(203);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode KW_VALUE() { return getToken(SHRDataElementParser.KW_VALUE, 0); }
		public List<ValueTypeContext> valueType() {
			return getRuleContexts(ValueTypeContext.class);
		}
		public ValueTypeContext valueType(int i) {
			return getRuleContext(ValueTypeContext.class,i);
		}
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(SHRDataElementParser.OPEN_PAREN, 0); }
		public List<TerminalNode> KW_OR() { return getTokens(SHRDataElementParser.KW_OR); }
		public TerminalNode KW_OR(int i) {
			return getToken(SHRDataElementParser.KW_OR, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SHRDataElementParser.CLOSE_PAREN, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(KW_VALUE);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHOLE_NUMBER) {
				{
				setState(205);
				count();
				}
			}

			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(208);
				match(OPEN_PAREN);
				}
			}

			setState(211);
			valueType();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_OR) {
				{
				{
				setState(212);
				match(KW_OR);
				setState(213);
				valueType();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PAREN) {
				{
				setState(219);
				match(CLOSE_PAREN);
				}
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

	public static class ValueTypeContext extends ParserRuleContext {
		public SimpleOrFQNameContext simpleOrFQName() {
			return getRuleContext(SimpleOrFQNameContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ElementWithConstraintContext elementWithConstraint() {
			return getRuleContext(ElementWithConstraintContext.class,0);
		}
		public TbdContext tbd() {
			return getRuleContext(TbdContext.class,0);
		}
		public ValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueType; }
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_valueType);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				simpleOrFQName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				ref();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				primitive();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				elementWithConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				tbd();
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

	public static class FieldContext extends ParserRuleContext {
		public List<FieldTypeContext> fieldType() {
			return getRuleContexts(FieldTypeContext.class);
		}
		public FieldTypeContext fieldType(int i) {
			return getRuleContext(FieldTypeContext.class,i);
		}
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(SHRDataElementParser.OPEN_PAREN, 0); }
		public List<TerminalNode> KW_OR() { return getTokens(SHRDataElementParser.KW_OR); }
		public TerminalNode KW_OR(int i) {
			return getToken(SHRDataElementParser.KW_OR, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SHRDataElementParser.CLOSE_PAREN, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHOLE_NUMBER) {
				{
				setState(229);
				count();
				}
			}

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(232);
				match(OPEN_PAREN);
				}
			}

			setState(235);
			fieldType();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_OR) {
				{
				{
				setState(236);
				match(KW_OR);
				setState(237);
				fieldType();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PAREN) {
				{
				setState(243);
				match(CLOSE_PAREN);
				}
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

	public static class FieldTypeContext extends ParserRuleContext {
		public SpecialWordContext specialWord() {
			return getRuleContext(SpecialWordContext.class,0);
		}
		public SimpleOrFQNameContext simpleOrFQName() {
			return getRuleContext(SimpleOrFQNameContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public ElementWithConstraintContext elementWithConstraint() {
			return getRuleContext(ElementWithConstraintContext.class,0);
		}
		public TbdContext tbd() {
			return getRuleContext(TbdContext.class,0);
		}
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fieldType);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				specialWord();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				simpleOrFQName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				ref();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				elementWithConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				tbd();
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

	public static class BasedOnPropContext extends ParserRuleContext {
		public TerminalNode KW_BASED_ON() { return getToken(SHRDataElementParser.KW_BASED_ON, 0); }
		public SimpleOrFQNameContext simpleOrFQName() {
			return getRuleContext(SimpleOrFQNameContext.class,0);
		}
		public TbdContext tbd() {
			return getRuleContext(TbdContext.class,0);
		}
		public BasedOnPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basedOnProp; }
	}

	public final BasedOnPropContext basedOnProp() throws RecognitionException {
		BasedOnPropContext _localctx = new BasedOnPropContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basedOnProp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(KW_BASED_ON);
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_CAPS:
			case UPPER_WORD:
			case LOWER_WORD:
			case DOT_SEPARATED_UW:
				{
				setState(254);
				simpleOrFQName();
				}
				break;
			case KW_TBD:
				{
				setState(255);
				tbd();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConceptPropContext extends ParserRuleContext {
		public TerminalNode KW_CONCEPT() { return getToken(SHRDataElementParser.KW_CONCEPT, 0); }
		public ConceptsContext concepts() {
			return getRuleContext(ConceptsContext.class,0);
		}
		public TbdContext tbd() {
			return getRuleContext(TbdContext.class,0);
		}
		public ConceptPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptProp; }
	}

	public final ConceptPropContext conceptProp() throws RecognitionException {
		ConceptPropContext _localctx = new ConceptPropContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conceptProp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(KW_CONCEPT);
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TBD_CODE:
			case ALL_CAPS:
				{
				setState(259);
				concepts();
				}
				break;
			case KW_TBD:
				{
				setState(260);
				tbd();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConceptsContext extends ParserRuleContext {
		public List<FullyQualifiedCodeContext> fullyQualifiedCode() {
			return getRuleContexts(FullyQualifiedCodeContext.class);
		}
		public FullyQualifiedCodeContext fullyQualifiedCode(int i) {
			return getRuleContext(FullyQualifiedCodeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SHRDataElementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHRDataElementParser.COMMA, i);
		}
		public ConceptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concepts; }
	}

	public final ConceptsContext concepts() throws RecognitionException {
		ConceptsContext _localctx = new ConceptsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_concepts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			fullyQualifiedCode();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264);
				match(COMMA);
				setState(265);
				fullyQualifiedCode();
				}
				}
				setState(270);
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

	public static class DescriptionPropContext extends ParserRuleContext {
		public TerminalNode KW_DESCRIPTION() { return getToken(SHRDataElementParser.KW_DESCRIPTION, 0); }
		public TerminalNode STRING() { return getToken(SHRDataElementParser.STRING, 0); }
		public DescriptionPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionProp; }
	}

	public final DescriptionPropContext descriptionProp() throws RecognitionException {
		DescriptionPropContext _localctx = new DescriptionPropContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_descriptionProp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(KW_DESCRIPTION);
			setState(272);
			match(STRING);
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
		public List<TerminalNode> WHOLE_NUMBER() { return getTokens(SHRDataElementParser.WHOLE_NUMBER); }
		public TerminalNode WHOLE_NUMBER(int i) {
			return getToken(SHRDataElementParser.WHOLE_NUMBER, i);
		}
		public TerminalNode DOT() { return getToken(SHRDataElementParser.DOT, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(WHOLE_NUMBER);
			setState(275);
			match(DOT);
			setState(276);
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
		public TerminalNode LOWER_WORD() { return getToken(SHRDataElementParser.LOWER_WORD, 0); }
		public TerminalNode DOT_SEPARATED_LW() { return getToken(SHRDataElementParser.DOT_SEPARATED_LW, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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

	public static class SpecialWordContext extends ParserRuleContext {
		public TerminalNode KW_BAR_ENTRY() { return getToken(SHRDataElementParser.KW_BAR_ENTRY, 0); }
		public TerminalNode KW_BAR_VALUE() { return getToken(SHRDataElementParser.KW_BAR_VALUE, 0); }
		public SpecialWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialWord; }
	}

	public final SpecialWordContext specialWord() throws RecognitionException {
		SpecialWordContext _localctx = new SpecialWordContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_specialWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==KW_BAR_ENTRY || _la==KW_BAR_VALUE) ) {
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
		public TerminalNode UPPER_WORD() { return getToken(SHRDataElementParser.UPPER_WORD, 0); }
		public TerminalNode ALL_CAPS() { return getToken(SHRDataElementParser.ALL_CAPS, 0); }
		public TerminalNode LOWER_WORD() { return getToken(SHRDataElementParser.LOWER_WORD, 0); }
		public SimpleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleName; }
	}

	public final SimpleNameContext simpleName() throws RecognitionException {
		SimpleNameContext _localctx = new SimpleNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_simpleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (ALL_CAPS - 63)) | (1L << (UPPER_WORD - 63)) | (1L << (LOWER_WORD - 63)))) != 0)) ) {
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

	public static class FullyQualifiedNameContext extends ParserRuleContext {
		public TerminalNode DOT_SEPARATED_UW() { return getToken(SHRDataElementParser.DOT_SEPARATED_UW, 0); }
		public FullyQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullyQualifiedName; }
	}

	public final FullyQualifiedNameContext fullyQualifiedName() throws RecognitionException {
		FullyQualifiedNameContext _localctx = new FullyQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fullyQualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(DOT_SEPARATED_UW);
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

	public static class SimpleOrFQNameContext extends ParserRuleContext {
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public FullyQualifiedNameContext fullyQualifiedName() {
			return getRuleContext(FullyQualifiedNameContext.class,0);
		}
		public SimpleOrFQNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleOrFQName; }
	}

	public final SimpleOrFQNameContext simpleOrFQName() throws RecognitionException {
		SimpleOrFQNameContext _localctx = new SimpleOrFQNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simpleOrFQName);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_CAPS:
			case UPPER_WORD:
			case LOWER_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				simpleName();
				}
				break;
			case DOT_SEPARATED_UW:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				fullyQualifiedName();
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

	public static class RefContext extends ParserRuleContext {
		public TerminalNode KW_REF() { return getToken(SHRDataElementParser.KW_REF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(SHRDataElementParser.OPEN_PAREN, 0); }
		public SimpleOrFQNameContext simpleOrFQName() {
			return getRuleContext(SimpleOrFQNameContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SHRDataElementParser.CLOSE_PAREN, 0); }
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(KW_REF);
			setState(291);
			match(OPEN_PAREN);
			setState(292);
			simpleOrFQName();
			setState(293);
			match(CLOSE_PAREN);
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

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(SHRDataElementParser.CODE, 0); }
		public TerminalNode STRING() { return getToken(SHRDataElementParser.STRING, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(CODE);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(296);
				match(STRING);
				}
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

	public static class FullyQualifiedCodeContext extends ParserRuleContext {
		public TerminalNode ALL_CAPS() { return getToken(SHRDataElementParser.ALL_CAPS, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TbdCodeContext tbdCode() {
			return getRuleContext(TbdCodeContext.class,0);
		}
		public FullyQualifiedCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullyQualifiedCode; }
	}

	public final FullyQualifiedCodeContext fullyQualifiedCode() throws RecognitionException {
		FullyQualifiedCodeContext _localctx = new FullyQualifiedCodeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fullyQualifiedCode);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_CAPS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(299);
				match(ALL_CAPS);
				setState(300);
				code();
				}
				}
				break;
			case KW_TBD_CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				tbdCode();
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

	public static class CodeOrFQCodeContext extends ParserRuleContext {
		public FullyQualifiedCodeContext fullyQualifiedCode() {
			return getRuleContext(FullyQualifiedCodeContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CodeOrFQCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeOrFQCode; }
	}

	public final CodeOrFQCodeContext codeOrFQCode() throws RecognitionException {
		CodeOrFQCodeContext _localctx = new CodeOrFQCodeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_codeOrFQCode);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TBD_CODE:
			case ALL_CAPS:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				fullyQualifiedCode();
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				code();
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

	public static class BindingInfixContext extends ParserRuleContext {
		public TerminalNode KW_MUST_BE() { return getToken(SHRDataElementParser.KW_MUST_BE, 0); }
		public TerminalNode KW_SHOULD_BE() { return getToken(SHRDataElementParser.KW_SHOULD_BE, 0); }
		public TerminalNode KW_COULD_BE() { return getToken(SHRDataElementParser.KW_COULD_BE, 0); }
		public BindingInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingInfix; }
	}

	public final BindingInfixContext bindingInfix() throws RecognitionException {
		BindingInfixContext _localctx = new BindingInfixContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bindingInfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_MUST_BE) | (1L << KW_SHOULD_BE) | (1L << KW_COULD_BE))) != 0)) ) {
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

	public static class TypeConstraintContext extends ParserRuleContext {
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public SimpleOrFQNameContext simpleOrFQName() {
			return getRuleContext(SimpleOrFQNameContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public TbdContext tbd() {
			return getRuleContext(TbdContext.class,0);
		}
		public TypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraint; }
	}

	public final TypeConstraintContext typeConstraint() throws RecognitionException {
		TypeConstraintContext _localctx = new TypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			count();
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_CAPS:
			case UPPER_WORD:
			case LOWER_WORD:
			case DOT_SEPARATED_UW:
				{
				setState(311);
				simpleOrFQName();
				}
				break;
			case KW_REF:
				{
				setState(312);
				ref();
				}
				break;
			case KW_BOOLEAN:
			case KW_INTEGER:
			case KW_STRING:
			case KW_DECIMAL:
			case KW_URI:
			case KW_BASE64_BINARY:
			case KW_INSTANT:
			case KW_DATE:
			case KW_DATE_TIME:
			case KW_TIME:
			case KW_CODE:
			case KW_OID:
			case KW_ID:
			case KW_MARKDOWN:
			case KW_UNSIGNED_INT:
			case KW_POSITIVE_INT:
			case KW_XHTML:
				{
				setState(313);
				primitive();
				}
				break;
			case KW_TBD:
				{
				setState(314);
				tbd();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElementWithConstraintContext extends ParserRuleContext {
		public SpecialWordContext specialWord() {
			return getRuleContext(SpecialWordContext.class,0);
		}
		public SimpleOrFQNameContext simpleOrFQName() {
			return getRuleContext(SimpleOrFQNameContext.class,0);
		}
		public ElementPathContext elementPath() {
			return getRuleContext(ElementPathContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ElementConstraintContext elementConstraint() {
			return getRuleContext(ElementConstraintContext.class,0);
		}
		public ElementWithConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementWithConstraint; }
	}

	public final ElementWithConstraintContext elementWithConstraint() throws RecognitionException {
		ElementWithConstraintContext _localctx = new ElementWithConstraintContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elementWithConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(317);
				specialWord();
				}
				break;
			case 2:
				{
				setState(318);
				simpleOrFQName();
				}
				break;
			case 3:
				{
				setState(319);
				elementPath();
				}
				break;
			case 4:
				{
				setState(320);
				primitive();
				}
				break;
			}
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_WITH) | (1L << KW_MUST_BE) | (1L << KW_SHOULD_BE) | (1L << KW_COULD_BE) | (1L << KW_FROM) | (1L << KW_IS) | (1L << KW_IS_TYPE) | (1L << KW_VALUE_IS_TYPE) | (1L << KW_INCLUDES))) != 0)) {
				{
				setState(323);
				elementConstraint();
				}
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

	public static class ElementPathContext extends ParserRuleContext {
		public SpecialWordContext specialWord() {
			return getRuleContext(SpecialWordContext.class,0);
		}
		public SimpleOrFQNameContext simpleOrFQName() {
			return getRuleContext(SimpleOrFQNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SHRDataElementParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SHRDataElementParser.DOT, i);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public List<SimpleNameContext> simpleName() {
			return getRuleContexts(SimpleNameContext.class);
		}
		public SimpleNameContext simpleName(int i) {
			return getRuleContext(SimpleNameContext.class,i);
		}
		public ElementPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementPath; }
	}

	public final ElementPathContext elementPath() throws RecognitionException {
		ElementPathContext _localctx = new ElementPathContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elementPath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BAR_ENTRY:
			case KW_BAR_VALUE:
				{
				setState(326);
				specialWord();
				}
				break;
			case ALL_CAPS:
			case UPPER_WORD:
			case LOWER_WORD:
			case DOT_SEPARATED_UW:
				{
				setState(327);
				simpleOrFQName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				{
				setState(332); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(330);
						match(DOT);
						setState(331);
						simpleName();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(334); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(336);
					match(DOT);
					setState(337);
					primitive();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(340);
						match(DOT);
						setState(341);
						simpleName();
						}
						} 
					}
					setState(346);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(347);
				match(DOT);
				setState(348);
				primitive();
				}
				}
				break;
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

	public static class ElementConstraintContext extends ParserRuleContext {
		public ElementCodeVSConstraintContext elementCodeVSConstraint() {
			return getRuleContext(ElementCodeVSConstraintContext.class,0);
		}
		public ElementCodeValueConstraintContext elementCodeValueConstraint() {
			return getRuleContext(ElementCodeValueConstraintContext.class,0);
		}
		public ElementIncludesCodeValueConstraintContext elementIncludesCodeValueConstraint() {
			return getRuleContext(ElementIncludesCodeValueConstraintContext.class,0);
		}
		public ElementBooleanConstraintContext elementBooleanConstraint() {
			return getRuleContext(ElementBooleanConstraintContext.class,0);
		}
		public ElementTypeConstraintContext elementTypeConstraint() {
			return getRuleContext(ElementTypeConstraintContext.class,0);
		}
		public ElementIncludesTypeConstraintContext elementIncludesTypeConstraint() {
			return getRuleContext(ElementIncludesTypeConstraintContext.class,0);
		}
		public ElementWithUnitsConstraintContext elementWithUnitsConstraint() {
			return getRuleContext(ElementWithUnitsConstraintContext.class,0);
		}
		public ElementConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementConstraint; }
	}

	public final ElementConstraintContext elementConstraint() throws RecognitionException {
		ElementConstraintContext _localctx = new ElementConstraintContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elementConstraint);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				elementCodeVSConstraint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				elementCodeValueConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				elementIncludesCodeValueConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				elementBooleanConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				elementTypeConstraint();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				elementIncludesTypeConstraint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				elementWithUnitsConstraint();
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

	public static class LegacyWithCodeContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(SHRDataElementParser.KW_WITH, 0); }
		public TerminalNode KW_CODE() { return getToken(SHRDataElementParser.KW_CODE, 0); }
		public SimpleOrFQNameContext simpleOrFQName() {
			return getRuleContext(SimpleOrFQNameContext.class,0);
		}
		public LegacyWithCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legacyWithCode; }
	}

	public final LegacyWithCodeContext legacyWithCode() throws RecognitionException {
		LegacyWithCodeContext _localctx = new LegacyWithCodeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_legacyWithCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(KW_WITH);
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CODE:
				{
				setState(361);
				match(KW_CODE);
				}
				break;
			case ALL_CAPS:
			case UPPER_WORD:
			case LOWER_WORD:
			case DOT_SEPARATED_UW:
				{
				setState(362);
				simpleOrFQName();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElementCodeVSConstraintContext extends ParserRuleContext {
		public TerminalNode KW_FROM() { return getToken(SHRDataElementParser.KW_FROM, 0); }
		public ValuesetContext valueset() {
			return getRuleContext(ValuesetContext.class,0);
		}
		public LegacyWithCodeContext legacyWithCode() {
			return getRuleContext(LegacyWithCodeContext.class,0);
		}
		public BindingInfixContext bindingInfix() {
			return getRuleContext(BindingInfixContext.class,0);
		}
		public TerminalNode KW_IF_COVERED() { return getToken(SHRDataElementParser.KW_IF_COVERED, 0); }
		public ElementCodeVSConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCodeVSConstraint; }
	}

	public final ElementCodeVSConstraintContext elementCodeVSConstraint() throws RecognitionException {
		ElementCodeVSConstraintContext _localctx = new ElementCodeVSConstraintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_elementCodeVSConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WITH) {
				{
				setState(365);
				legacyWithCode();
				}
			}

			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_MUST_BE) | (1L << KW_SHOULD_BE) | (1L << KW_COULD_BE))) != 0)) {
				{
				setState(368);
				bindingInfix();
				}
			}

			setState(371);
			match(KW_FROM);
			setState(372);
			valueset();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF_COVERED) {
				{
				setState(373);
				match(KW_IF_COVERED);
				}
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

	public static class ElementCodeValueConstraintContext extends ParserRuleContext {
		public TerminalNode KW_IS() { return getToken(SHRDataElementParser.KW_IS, 0); }
		public CodeOrFQCodeContext codeOrFQCode() {
			return getRuleContext(CodeOrFQCodeContext.class,0);
		}
		public ElementCodeValueConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCodeValueConstraint; }
	}

	public final ElementCodeValueConstraintContext elementCodeValueConstraint() throws RecognitionException {
		ElementCodeValueConstraintContext _localctx = new ElementCodeValueConstraintContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_elementCodeValueConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(KW_IS);
			setState(377);
			codeOrFQCode();
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

	public static class ElementIncludesCodeValueConstraintContext extends ParserRuleContext {
		public List<TerminalNode> KW_INCLUDES() { return getTokens(SHRDataElementParser.KW_INCLUDES); }
		public TerminalNode KW_INCLUDES(int i) {
			return getToken(SHRDataElementParser.KW_INCLUDES, i);
		}
		public List<CodeOrFQCodeContext> codeOrFQCode() {
			return getRuleContexts(CodeOrFQCodeContext.class);
		}
		public CodeOrFQCodeContext codeOrFQCode(int i) {
			return getRuleContext(CodeOrFQCodeContext.class,i);
		}
		public ElementIncludesCodeValueConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementIncludesCodeValueConstraint; }
	}

	public final ElementIncludesCodeValueConstraintContext elementIncludesCodeValueConstraint() throws RecognitionException {
		ElementIncludesCodeValueConstraintContext _localctx = new ElementIncludesCodeValueConstraintContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elementIncludesCodeValueConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(379);
				match(KW_INCLUDES);
				setState(380);
				codeOrFQCode();
				}
				}
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_INCLUDES );
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

	public static class ElementBooleanConstraintContext extends ParserRuleContext {
		public TerminalNode KW_IS() { return getToken(SHRDataElementParser.KW_IS, 0); }
		public TerminalNode KW_TRUE() { return getToken(SHRDataElementParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(SHRDataElementParser.KW_FALSE, 0); }
		public ElementBooleanConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementBooleanConstraint; }
	}

	public final ElementBooleanConstraintContext elementBooleanConstraint() throws RecognitionException {
		ElementBooleanConstraintContext _localctx = new ElementBooleanConstraintContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elementBooleanConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(KW_IS);
			setState(386);
			_la = _input.LA(1);
			if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
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

	public static class ElementTypeConstraintContext extends ParserRuleContext {
		public TerminalNode KW_IS_TYPE() { return getToken(SHRDataElementParser.KW_IS_TYPE, 0); }
		public TerminalNode KW_VALUE_IS_TYPE() { return getToken(SHRDataElementParser.KW_VALUE_IS_TYPE, 0); }
		public SimpleOrFQNameContext simpleOrFQName() {
			return getRuleContext(SimpleOrFQNameContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public TbdContext tbd() {
			return getRuleContext(TbdContext.class,0);
		}
		public ElementTypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementTypeConstraint; }
	}

	public final ElementTypeConstraintContext elementTypeConstraint() throws RecognitionException {
		ElementTypeConstraintContext _localctx = new ElementTypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_elementTypeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==KW_IS_TYPE || _la==KW_VALUE_IS_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_CAPS:
			case UPPER_WORD:
			case LOWER_WORD:
			case DOT_SEPARATED_UW:
				{
				setState(389);
				simpleOrFQName();
				}
				break;
			case KW_REF:
				{
				setState(390);
				ref();
				}
				break;
			case KW_BOOLEAN:
			case KW_INTEGER:
			case KW_STRING:
			case KW_DECIMAL:
			case KW_URI:
			case KW_BASE64_BINARY:
			case KW_INSTANT:
			case KW_DATE:
			case KW_DATE_TIME:
			case KW_TIME:
			case KW_CODE:
			case KW_OID:
			case KW_ID:
			case KW_MARKDOWN:
			case KW_UNSIGNED_INT:
			case KW_POSITIVE_INT:
			case KW_XHTML:
				{
				setState(391);
				primitive();
				}
				break;
			case KW_TBD:
				{
				setState(392);
				tbd();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElementIncludesTypeConstraintContext extends ParserRuleContext {
		public List<TerminalNode> KW_INCLUDES() { return getTokens(SHRDataElementParser.KW_INCLUDES); }
		public TerminalNode KW_INCLUDES(int i) {
			return getToken(SHRDataElementParser.KW_INCLUDES, i);
		}
		public List<TypeConstraintContext> typeConstraint() {
			return getRuleContexts(TypeConstraintContext.class);
		}
		public TypeConstraintContext typeConstraint(int i) {
			return getRuleContext(TypeConstraintContext.class,i);
		}
		public ElementIncludesTypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementIncludesTypeConstraint; }
	}

	public final ElementIncludesTypeConstraintContext elementIncludesTypeConstraint() throws RecognitionException {
		ElementIncludesTypeConstraintContext _localctx = new ElementIncludesTypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_elementIncludesTypeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(395);
				match(KW_INCLUDES);
				setState(396);
				typeConstraint();
				}
				}
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_INCLUDES );
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

	public static class ElementWithUnitsConstraintContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(SHRDataElementParser.KW_WITH, 0); }
		public TerminalNode KW_UNITS() { return getToken(SHRDataElementParser.KW_UNITS, 0); }
		public FullyQualifiedCodeContext fullyQualifiedCode() {
			return getRuleContext(FullyQualifiedCodeContext.class,0);
		}
		public ElementWithUnitsConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementWithUnitsConstraint; }
	}

	public final ElementWithUnitsConstraintContext elementWithUnitsConstraint() throws RecognitionException {
		ElementWithUnitsConstraintContext _localctx = new ElementWithUnitsConstraintContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_elementWithUnitsConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(KW_WITH);
			setState(402);
			match(KW_UNITS);
			setState(403);
			fullyQualifiedCode();
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

	public static class ValuesetContext extends ParserRuleContext {
		public TerminalNode URL() { return getToken(SHRDataElementParser.URL, 0); }
		public TerminalNode PATH_URL() { return getToken(SHRDataElementParser.PATH_URL, 0); }
		public TerminalNode URN_OID() { return getToken(SHRDataElementParser.URN_OID, 0); }
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TbdContext tbd() {
			return getRuleContext(TbdContext.class,0);
		}
		public ValuesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueset; }
	}

	public final ValuesetContext valueset() throws RecognitionException {
		ValuesetContext _localctx = new ValuesetContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_valueset);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URL:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(URL);
				}
				break;
			case PATH_URL:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(PATH_URL);
				}
				break;
			case URN_OID:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(URN_OID);
				}
				break;
			case ALL_CAPS:
			case UPPER_WORD:
			case LOWER_WORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				simpleName();
				}
				break;
			case KW_TBD:
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
				tbd();
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

	public static class PrimitiveContext extends ParserRuleContext {
		public TerminalNode KW_BOOLEAN() { return getToken(SHRDataElementParser.KW_BOOLEAN, 0); }
		public TerminalNode KW_INTEGER() { return getToken(SHRDataElementParser.KW_INTEGER, 0); }
		public TerminalNode KW_STRING() { return getToken(SHRDataElementParser.KW_STRING, 0); }
		public TerminalNode KW_DECIMAL() { return getToken(SHRDataElementParser.KW_DECIMAL, 0); }
		public TerminalNode KW_URI() { return getToken(SHRDataElementParser.KW_URI, 0); }
		public TerminalNode KW_BASE64_BINARY() { return getToken(SHRDataElementParser.KW_BASE64_BINARY, 0); }
		public TerminalNode KW_INSTANT() { return getToken(SHRDataElementParser.KW_INSTANT, 0); }
		public TerminalNode KW_DATE() { return getToken(SHRDataElementParser.KW_DATE, 0); }
		public TerminalNode KW_DATE_TIME() { return getToken(SHRDataElementParser.KW_DATE_TIME, 0); }
		public TerminalNode KW_TIME() { return getToken(SHRDataElementParser.KW_TIME, 0); }
		public TerminalNode KW_CODE() { return getToken(SHRDataElementParser.KW_CODE, 0); }
		public TerminalNode KW_OID() { return getToken(SHRDataElementParser.KW_OID, 0); }
		public TerminalNode KW_ID() { return getToken(SHRDataElementParser.KW_ID, 0); }
		public TerminalNode KW_MARKDOWN() { return getToken(SHRDataElementParser.KW_MARKDOWN, 0); }
		public TerminalNode KW_UNSIGNED_INT() { return getToken(SHRDataElementParser.KW_UNSIGNED_INT, 0); }
		public TerminalNode KW_POSITIVE_INT() { return getToken(SHRDataElementParser.KW_POSITIVE_INT, 0); }
		public TerminalNode KW_XHTML() { return getToken(SHRDataElementParser.KW_XHTML, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BOOLEAN) | (1L << KW_INTEGER) | (1L << KW_STRING) | (1L << KW_DECIMAL) | (1L << KW_URI) | (1L << KW_BASE64_BINARY) | (1L << KW_INSTANT) | (1L << KW_DATE) | (1L << KW_DATE_TIME) | (1L << KW_TIME) | (1L << KW_CODE) | (1L << KW_OID) | (1L << KW_ID) | (1L << KW_MARKDOWN) | (1L << KW_UNSIGNED_INT) | (1L << KW_POSITIVE_INT) | (1L << KW_XHTML))) != 0)) ) {
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

	public static class CountContext extends ParserRuleContext {
		public List<TerminalNode> WHOLE_NUMBER() { return getTokens(SHRDataElementParser.WHOLE_NUMBER); }
		public TerminalNode WHOLE_NUMBER(int i) {
			return getToken(SHRDataElementParser.WHOLE_NUMBER, i);
		}
		public TerminalNode RANGE() { return getToken(SHRDataElementParser.RANGE, 0); }
		public TerminalNode STAR() { return getToken(SHRDataElementParser.STAR, 0); }
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_count);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(WHOLE_NUMBER);
			setState(415);
			match(RANGE);
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==WHOLE_NUMBER) ) {
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

	public static class TbdContext extends ParserRuleContext {
		public TerminalNode KW_TBD() { return getToken(SHRDataElementParser.KW_TBD, 0); }
		public TerminalNode STRING() { return getToken(SHRDataElementParser.STRING, 0); }
		public TbdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbd; }
	}

	public final TbdContext tbd() throws RecognitionException {
		TbdContext _localctx = new TbdContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_tbd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(KW_TBD);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(419);
				match(STRING);
				}
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

	public static class TbdCodeContext extends ParserRuleContext {
		public TerminalNode KW_TBD_CODE() { return getToken(SHRDataElementParser.KW_TBD_CODE, 0); }
		public TerminalNode STRING() { return getToken(SHRDataElementParser.STRING, 0); }
		public TbdCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbdCode; }
	}

	public final TbdCodeContext tbdCode() throws RecognitionException {
		TbdCodeContext _localctx = new TbdCodeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tbdCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(KW_TBD_CODE);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(423);
				match(STRING);
				}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u01ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\5\2m\n\2\3\2\5\2p\n\2\3\2\5\2s\n\2\3\2\5\2v\n\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0084\n\4\f\4\16"+
		"\4\u0087\13\4\3\5\6\5\u008a\n\5\r\5\16\5\u008b\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\6\7\u0094\n\7\r\7\16\7\u0095\3\b\3\b\3\b\3\b\3\b\3\t\7\t\u009e\n\t\f"+
		"\t\16\t\u00a1\13\t\3\n\3\n\5\n\u00a5\n\n\3\13\3\13\5\13\u00a9\n\13\3\13"+
		"\3\13\3\f\5\f\u00ae\n\f\3\f\3\f\3\f\3\r\3\r\5\r\u00b5\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\6\17\u00bd\n\17\r\17\16\17\u00be\3\20\3\20\3\20\5\20\u00c4"+
		"\n\20\3\21\5\21\u00c7\n\21\3\21\7\21\u00ca\n\21\f\21\16\21\u00cd\13\21"+
		"\3\22\3\22\5\22\u00d1\n\22\3\22\5\22\u00d4\n\22\3\22\3\22\3\22\7\22\u00d9"+
		"\n\22\f\22\16\22\u00dc\13\22\3\22\5\22\u00df\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00e6\n\23\3\24\5\24\u00e9\n\24\3\24\5\24\u00ec\n\24\3\24\3"+
		"\24\3\24\7\24\u00f1\n\24\f\24\16\24\u00f4\13\24\3\24\5\24\u00f7\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u00fe\n\25\3\26\3\26\3\26\5\26\u0103\n\26"+
		"\3\27\3\27\3\27\5\27\u0108\n\27\3\30\3\30\3\30\7\30\u010d\n\30\f\30\16"+
		"\30\u0110\13\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\5\37\u0123\n\37\3 \3 \3 \3 \3 \3!\3!\5"+
		"!\u012c\n!\3\"\3\"\3\"\5\"\u0131\n\"\3#\3#\5#\u0135\n#\3$\3$\3%\3%\3%"+
		"\3%\3%\5%\u013e\n%\3&\3&\3&\3&\5&\u0144\n&\3&\5&\u0147\n&\3\'\3\'\5\'"+
		"\u014b\n\'\3\'\3\'\6\'\u014f\n\'\r\'\16\'\u0150\3\'\3\'\5\'\u0155\n\'"+
		"\3\'\3\'\7\'\u0159\n\'\f\'\16\'\u015c\13\'\3\'\3\'\5\'\u0160\n\'\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u0169\n(\3)\3)\3)\5)\u016e\n)\3*\5*\u0171\n*\3*\5"+
		"*\u0174\n*\3*\3*\3*\5*\u0179\n*\3+\3+\3+\3,\3,\6,\u0180\n,\r,\16,\u0181"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\5.\u018c\n.\3/\3/\6/\u0190\n/\r/\16/\u0191\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u019d\n\61\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u01a7\n\64\3\65\3\65\5\65\u01ab\n"+
		"\65\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\13\4\2**,-\3\2CD\3\2!\"\3\2AC\3\2\23"+
		"\25\3\2\35\36\3\2\32\33\3\2/?\4\2&&@@\2\u01c1\2j\3\2\2\2\4y\3\2\2\2\6"+
		"\177\3\2\2\2\b\u0089\3\2\2\2\n\u008d\3\2\2\2\f\u0093\3\2\2\2\16\u0097"+
		"\3\2\2\2\20\u009f\3\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2\2\26\u00ad\3"+
		"\2\2\2\30\u00b2\3\2\2\2\32\u00b8\3\2\2\2\34\u00bc\3\2\2\2\36\u00c3\3\2"+
		"\2\2 \u00c6\3\2\2\2\"\u00ce\3\2\2\2$\u00e5\3\2\2\2&\u00e8\3\2\2\2(\u00fd"+
		"\3\2\2\2*\u00ff\3\2\2\2,\u0104\3\2\2\2.\u0109\3\2\2\2\60\u0111\3\2\2\2"+
		"\62\u0114\3\2\2\2\64\u0118\3\2\2\2\66\u011a\3\2\2\28\u011c\3\2\2\2:\u011e"+
		"\3\2\2\2<\u0122\3\2\2\2>\u0124\3\2\2\2@\u0129\3\2\2\2B\u0130\3\2\2\2D"+
		"\u0134\3\2\2\2F\u0136\3\2\2\2H\u0138\3\2\2\2J\u0143\3\2\2\2L\u014a\3\2"+
		"\2\2N\u0168\3\2\2\2P\u016a\3\2\2\2R\u0170\3\2\2\2T\u017a\3\2\2\2V\u017f"+
		"\3\2\2\2X\u0183\3\2\2\2Z\u0186\3\2\2\2\\\u018f\3\2\2\2^\u0193\3\2\2\2"+
		"`\u019c\3\2\2\2b\u019e\3\2\2\2d\u01a0\3\2\2\2f\u01a4\3\2\2\2h\u01a8\3"+
		"\2\2\2jl\5\4\3\2km\5\60\31\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5\6\4\2o"+
		"n\3\2\2\2op\3\2\2\2pr\3\2\2\2qs\5\b\5\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2"+
		"tv\5\f\7\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\20\t\2x\3\3\2\2\2yz\7\3\2"+
		"\2z{\7\4\2\2{|\5\62\32\2|}\7\5\2\2}~\5\64\33\2~\5\3\2\2\2\177\u0080\7"+
		"\6\2\2\u0080\u0085\5\64\33\2\u0081\u0082\7%\2\2\u0082\u0084\5\64\33\2"+
		"\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\7\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\5\n\6\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\t\3\2\2\2\u008d\u008e\7\7\2\2\u008e\u008f\7A\2\2\u008f\u0090"+
		"\7$\2\2\u0090\u0091\7*\2\2\u0091\13\3\2\2\2\u0092\u0094\5\16\b\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\r\3\2\2\2\u0097\u0098\7\b\2\2\u0098\u0099\7A\2\2\u0099\u009a"+
		"\7$\2\2\u009a\u009b\t\2\2\2\u009b\17\3\2\2\2\u009c\u009e\5\22\n\2\u009d"+
		"\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\21\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\5\24\13\2\u00a3"+
		"\u00a5\5\30\r\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\23\3\2\2"+
		"\2\u00a6\u00a8\5\26\f\2\u00a7\u00a9\5\34\17\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\5 \21\2\u00ab\25\3\2\2"+
		"\2\u00ac\u00ae\7\t\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0\u00b1\58\35\2\u00b1\27\3\2\2\2\u00b2"+
		"\u00b4\5\32\16\2\u00b3\u00b5\5\34\17\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5 \21\2\u00b7\31\3\2\2\2\u00b8"+
		"\u00b9\7\13\2\2\u00b9\u00ba\58\35\2\u00ba\33\3\2\2\2\u00bb\u00bd\5\36"+
		"\20\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00c4\5*\26\2\u00c1\u00c4\5,\27"+
		"\2\u00c2\u00c4\5\60\31\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\37\3\2\2\2\u00c5\u00c7\5\"\22\2\u00c6\u00c5\3\2\2"+
		"\2\u00c6\u00c7\3\2\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca\5&\24\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"!\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\7\r\2\2\u00cf\u00d1\5d\63\2"+
		"\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4"+
		"\7\'\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00da\5$\23\2\u00d6\u00d7\7\21\2\2\u00d7\u00d9\5$\23\2\u00d8\u00d6\3"+
		"\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\7(\2\2\u00de\u00dd\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df#\3\2\2\2\u00e0\u00e6\5<\37\2\u00e1\u00e6"+
		"\5> \2\u00e2\u00e6\5b\62\2\u00e3\u00e6\5J&\2\u00e4\u00e6\5f\64\2\u00e5"+
		"\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e9\5d\63\2\u00e8\u00e7"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\7\'\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f2\5("+
		"\25\2\u00ee\u00ef\7\21\2\2\u00ef\u00f1\5(\25\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7(\2\2\u00f6\u00f5\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\'\3\2\2\2\u00f8\u00fe\5\66\34\2\u00f9\u00fe\5<\37"+
		"\2\u00fa\u00fe\5> \2\u00fb\u00fe\5J&\2\u00fc\u00fe\5f\64\2\u00fd\u00f8"+
		"\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe)\3\2\2\2\u00ff\u0102\7\f\2\2\u0100\u0103\5<\37\2"+
		"\u0101\u0103\5f\64\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103+\3"+
		"\2\2\2\u0104\u0107\7\16\2\2\u0105\u0108\5.\30\2\u0106\u0108\5f\64\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108-\3\2\2\2\u0109\u010e\5B\"\2\u010a"+
		"\u010b\7%\2\2\u010b\u010d\5B\"\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2"+
		"\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f/\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0111\u0112\7\17\2\2\u0112\u0113\7F\2\2\u0113\61\3\2\2\2\u0114"+
		"\u0115\7@\2\2\u0115\u0116\7#\2\2\u0116\u0117\7@\2\2\u0117\63\3\2\2\2\u0118"+
		"\u0119\t\3\2\2\u0119\65\3\2\2\2\u011a\u011b\t\4\2\2\u011b\67\3\2\2\2\u011c"+
		"\u011d\t\5\2\2\u011d9\3\2\2\2\u011e\u011f\7E\2\2\u011f;\3\2\2\2\u0120"+
		"\u0123\58\35\2\u0121\u0123\5:\36\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123=\3\2\2\2\u0124\u0125\7\20\2\2\u0125\u0126\7\'\2\2\u0126\u0127"+
		"\5<\37\2\u0127\u0128\7(\2\2\u0128?\3\2\2\2\u0129\u012b\7.\2\2\u012a\u012c"+
		"\7F\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012cA\3\2\2\2\u012d\u012e"+
		"\7A\2\2\u012e\u0131\5@!\2\u012f\u0131\5h\65\2\u0130\u012d\3\2\2\2\u0130"+
		"\u012f\3\2\2\2\u0131C\3\2\2\2\u0132\u0135\5B\"\2\u0133\u0135\5@!\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135E\3\2\2\2\u0136\u0137\t\6\2\2"+
		"\u0137G\3\2\2\2\u0138\u013d\5d\63\2\u0139\u013e\5<\37\2\u013a\u013e\5"+
		"> \2\u013b\u013e\5b\62\2\u013c\u013e\5f\64\2\u013d\u0139\3\2\2\2\u013d"+
		"\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013eI\3\2\2\2"+
		"\u013f\u0144\5\66\34\2\u0140\u0144\5<\37\2\u0141\u0144\5L\'\2\u0142\u0144"+
		"\5b\62\2\u0143\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0147\5N(\2\u0146\u0145\3\2\2"+
		"\2\u0146\u0147\3\2\2\2\u0147K\3\2\2\2\u0148\u014b\5\66\34\2\u0149\u014b"+
		"\5<\37\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u015f\3\2\2\2\u014c"+
		"\u014d\7#\2\2\u014d\u014f\58\35\2\u014e\u014c\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0153\7#\2\2\u0153\u0155\5b\62\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0160\3\2\2\2\u0156\u0157\7#\2\2\u0157\u0159\58\35\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7#\2\2\u015e"+
		"\u0160\5b\62\2\u015f\u014e\3\2\2\2\u015f\u015a\3\2\2\2\u0160M\3\2\2\2"+
		"\u0161\u0169\5R*\2\u0162\u0169\5T+\2\u0163\u0169\5V,\2\u0164\u0169\5X"+
		"-\2\u0165\u0169\5Z.\2\u0166\u0169\5\\/\2\u0167\u0169\5^\60\2\u0168\u0161"+
		"\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0163\3\2\2\2\u0168\u0164\3\2\2\2\u0168"+
		"\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169O\3\2\2\2"+
		"\u016a\u016d\7\22\2\2\u016b\u016e\79\2\2\u016c\u016e\5<\37\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016c\3\2\2\2\u016eQ\3\2\2\2\u016f\u0171\5P)\2\u0170\u016f"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0174\5F$\2\u0173"+
		"\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7\27"+
		"\2\2\u0176\u0178\5`\61\2\u0177\u0179\7\26\2\2\u0178\u0177\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179S\3\2\2\2\u017a\u017b\7\31\2\2\u017b\u017c\5D#\2\u017c"+
		"U\3\2\2\2\u017d\u017e\7\34\2\2\u017e\u0180\5D#\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182W\3\2\2\2"+
		"\u0183\u0184\7\31\2\2\u0184\u0185\t\7\2\2\u0185Y\3\2\2\2\u0186\u018b\t"+
		"\b\2\2\u0187\u018c\5<\37\2\u0188\u018c\5> \2\u0189\u018c\5b\62\2\u018a"+
		"\u018c\5f\64\2\u018b\u0187\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018a\3\2\2\2\u018c[\3\2\2\2\u018d\u018e\7\34\2\2\u018e\u0190"+
		"\5H%\2\u018f\u018d\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192]\3\2\2\2\u0193\u0194\7\22\2\2\u0194\u0195\7\30\2"+
		"\2\u0195\u0196\5B\"\2\u0196_\3\2\2\2\u0197\u019d\7*\2\2\u0198\u019d\7"+
		"+\2\2\u0199\u019d\7,\2\2\u019a\u019d\58\35\2\u019b\u019d\5f\64\2\u019c"+
		"\u0197\3\2\2\2\u019c\u0198\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019b\3\2\2\2\u019da\3\2\2\2\u019e\u019f\t\t\2\2\u019fc\3\2"+
		"\2\2\u01a0\u01a1\7@\2\2\u01a1\u01a2\7)\2\2\u01a2\u01a3\t\n\2\2\u01a3e"+
		"\3\2\2\2\u01a4\u01a6\7\37\2\2\u01a5\u01a7\7F\2\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7g\3\2\2\2\u01a8\u01aa\7 \2\2\u01a9\u01ab\7F\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abi\3\2\2\2\66loru\u0085\u008b\u0095"+
		"\u009f\u00a4\u00a8\u00ad\u00b4\u00be\u00c3\u00c6\u00cb\u00d0\u00d3\u00da"+
		"\u00de\u00e5\u00e8\u00eb\u00f2\u00f6\u00fd\u0102\u0107\u010e\u0122\u012b"+
		"\u0130\u0134\u013d\u0143\u0146\u014a\u0150\u0154\u015a\u015f\u0168\u016d"+
		"\u0170\u0173\u0178\u0181\u018b\u0191\u019c\u01a6\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}