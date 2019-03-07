// Generated from /Users/kmahalingam/standardhealth/shr-grammar/src/main/antlr/SHRValueSetParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SHRValueSetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_GRAMMAR=1, KW_G_VALUE_SET=2, KW_NAMESPACE=3, KW_VOCABULARY=4, KW_VALUESET=5, 
		KW_INCLUDES_CODES_FROM=6, KW_INCLUDES_CODES_DESCENDING_FROM=7, KW_AND_NOT_DESCENDING_FROM=8, 
		KW_CONCEPT=9, KW_DESCRIPTION=10, KW_TBD=11, KW_TBD_CODE=12, DOT=13, EQUAL=14, 
		COMMA=15, URL=16, URN_OID=17, URN=18, CODE=19, WHOLE_NUMBER=20, ALL_CAPS=21, 
		UPPER_WORD=22, LOWER_WORD=23, DOT_SEPARATED_LW=24, DOT_SEPARATED_UW=25, 
		STRING=26, WS=27, NEWLINE=28, COMMENT=29, LINE_COMMENT=30;
	public static final int
		RULE_doc = 0, RULE_docHeader = 1, RULE_vocabularyDefs = 2, RULE_vocabularyDef = 3, 
		RULE_valuesetDefs = 4, RULE_valuesetDef = 5, RULE_valuesetHeader = 6, 
		RULE_valuesetValues = 7, RULE_valuesetValue = 8, RULE_valuesetInlineValue = 9, 
		RULE_valuesetDescendingFrom = 10, RULE_valuesetFromCodeSystem = 11, RULE_valuesetFromCode = 12, 
		RULE_valuesetProps = 13, RULE_valuesetProp = 14, RULE_conceptProp = 15, 
		RULE_concepts = 16, RULE_descriptionProp = 17, RULE_version = 18, RULE_namespace = 19, 
		RULE_simpleName = 20, RULE_code = 21, RULE_fullyQualifiedCode = 22, RULE_tbd = 23, 
		RULE_tbdCode = 24;
	public static final String[] ruleNames = {
		"doc", "docHeader", "vocabularyDefs", "vocabularyDef", "valuesetDefs", 
		"valuesetDef", "valuesetHeader", "valuesetValues", "valuesetValue", "valuesetInlineValue", 
		"valuesetDescendingFrom", "valuesetFromCodeSystem", "valuesetFromCode", 
		"valuesetProps", "valuesetProp", "conceptProp", "concepts", "descriptionProp", 
		"version", "namespace", "simpleName", "code", "fullyQualifiedCode", "tbd", 
		"tbdCode"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Grammar:'", "'ValueSet'", "'Namespace:'", "'CodeSystem:'", "'ValueSet:'", 
		"'Includes codes from'", "'Includes codes descending from'", "'and not descending from'", 
		"'Concept:'", "'Description:'", "'TBD'", "'TBD#TBD'", "'.'", "'='", "','", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_GRAMMAR", "KW_G_VALUE_SET", "KW_NAMESPACE", "KW_VOCABULARY", 
		"KW_VALUESET", "KW_INCLUDES_CODES_FROM", "KW_INCLUDES_CODES_DESCENDING_FROM", 
		"KW_AND_NOT_DESCENDING_FROM", "KW_CONCEPT", "KW_DESCRIPTION", "KW_TBD", 
		"KW_TBD_CODE", "DOT", "EQUAL", "COMMA", "URL", "URN_OID", "URN", "CODE", 
		"WHOLE_NUMBER", "ALL_CAPS", "UPPER_WORD", "LOWER_WORD", "DOT_SEPARATED_LW", 
		"DOT_SEPARATED_UW", "STRING", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "SHRValueSetParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SHRValueSetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocContext extends ParserRuleContext {
		public DocHeaderContext docHeader() {
			return getRuleContext(DocHeaderContext.class,0);
		}
		public ValuesetDefsContext valuesetDefs() {
			return getRuleContext(ValuesetDefsContext.class,0);
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
			setState(50);
			docHeader();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_VOCABULARY) {
				{
				setState(51);
				vocabularyDefs();
				}
			}

			setState(54);
			valuesetDefs();
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
		public TerminalNode KW_GRAMMAR() { return getToken(SHRValueSetParser.KW_GRAMMAR, 0); }
		public TerminalNode KW_G_VALUE_SET() { return getToken(SHRValueSetParser.KW_G_VALUE_SET, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public TerminalNode KW_NAMESPACE() { return getToken(SHRValueSetParser.KW_NAMESPACE, 0); }
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
			setState(56);
			match(KW_GRAMMAR);
			setState(57);
			match(KW_G_VALUE_SET);
			setState(58);
			version();
			setState(59);
			match(KW_NAMESPACE);
			setState(60);
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
		enterRule(_localctx, 4, RULE_vocabularyDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				vocabularyDef();
				}
				}
				setState(65); 
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
		public TerminalNode KW_VOCABULARY() { return getToken(SHRValueSetParser.KW_VOCABULARY, 0); }
		public TerminalNode ALL_CAPS() { return getToken(SHRValueSetParser.ALL_CAPS, 0); }
		public TerminalNode EQUAL() { return getToken(SHRValueSetParser.EQUAL, 0); }
		public TerminalNode URL() { return getToken(SHRValueSetParser.URL, 0); }
		public TerminalNode URN_OID() { return getToken(SHRValueSetParser.URN_OID, 0); }
		public TerminalNode URN() { return getToken(SHRValueSetParser.URN, 0); }
		public VocabularyDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vocabularyDef; }
	}

	public final VocabularyDefContext vocabularyDef() throws RecognitionException {
		VocabularyDefContext _localctx = new VocabularyDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vocabularyDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(KW_VOCABULARY);
			setState(68);
			match(ALL_CAPS);
			setState(69);
			match(EQUAL);
			setState(70);
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

	public static class ValuesetDefsContext extends ParserRuleContext {
		public List<ValuesetDefContext> valuesetDef() {
			return getRuleContexts(ValuesetDefContext.class);
		}
		public ValuesetDefContext valuesetDef(int i) {
			return getRuleContext(ValuesetDefContext.class,i);
		}
		public ValuesetDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetDefs; }
	}

	public final ValuesetDefsContext valuesetDefs() throws RecognitionException {
		ValuesetDefsContext _localctx = new ValuesetDefsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valuesetDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_VALUESET) {
				{
				{
				setState(72);
				valuesetDef();
				}
				}
				setState(77);
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

	public static class ValuesetDefContext extends ParserRuleContext {
		public ValuesetHeaderContext valuesetHeader() {
			return getRuleContext(ValuesetHeaderContext.class,0);
		}
		public ValuesetPropsContext valuesetProps() {
			return getRuleContext(ValuesetPropsContext.class,0);
		}
		public ValuesetValuesContext valuesetValues() {
			return getRuleContext(ValuesetValuesContext.class,0);
		}
		public ValuesetDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetDef; }
	}

	public final ValuesetDefContext valuesetDef() throws RecognitionException {
		ValuesetDefContext _localctx = new ValuesetDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valuesetDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			valuesetHeader();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONCEPT || _la==KW_DESCRIPTION) {
				{
				setState(79);
				valuesetProps();
				}
			}

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_INCLUDES_CODES_FROM) | (1L << KW_INCLUDES_CODES_DESCENDING_FROM) | (1L << KW_TBD_CODE) | (1L << CODE) | (1L << ALL_CAPS))) != 0)) {
				{
				setState(82);
				valuesetValues();
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

	public static class ValuesetHeaderContext extends ParserRuleContext {
		public TerminalNode KW_VALUESET() { return getToken(SHRValueSetParser.KW_VALUESET, 0); }
		public TerminalNode URL() { return getToken(SHRValueSetParser.URL, 0); }
		public TerminalNode URN_OID() { return getToken(SHRValueSetParser.URN_OID, 0); }
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public ValuesetHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetHeader; }
	}

	public final ValuesetHeaderContext valuesetHeader() throws RecognitionException {
		ValuesetHeaderContext _localctx = new ValuesetHeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valuesetHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(KW_VALUESET);
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URL:
				{
				setState(86);
				match(URL);
				}
				break;
			case URN_OID:
				{
				setState(87);
				match(URN_OID);
				}
				break;
			case ALL_CAPS:
			case UPPER_WORD:
				{
				setState(88);
				simpleName();
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

	public static class ValuesetValuesContext extends ParserRuleContext {
		public List<ValuesetValueContext> valuesetValue() {
			return getRuleContexts(ValuesetValueContext.class);
		}
		public ValuesetValueContext valuesetValue(int i) {
			return getRuleContext(ValuesetValueContext.class,i);
		}
		public ValuesetValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetValues; }
	}

	public final ValuesetValuesContext valuesetValues() throws RecognitionException {
		ValuesetValuesContext _localctx = new ValuesetValuesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valuesetValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				valuesetValue();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_INCLUDES_CODES_FROM) | (1L << KW_INCLUDES_CODES_DESCENDING_FROM) | (1L << KW_TBD_CODE) | (1L << CODE) | (1L << ALL_CAPS))) != 0) );
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

	public static class ValuesetValueContext extends ParserRuleContext {
		public FullyQualifiedCodeContext fullyQualifiedCode() {
			return getRuleContext(FullyQualifiedCodeContext.class,0);
		}
		public ValuesetInlineValueContext valuesetInlineValue() {
			return getRuleContext(ValuesetInlineValueContext.class,0);
		}
		public ValuesetDescendingFromContext valuesetDescendingFrom() {
			return getRuleContext(ValuesetDescendingFromContext.class,0);
		}
		public ValuesetFromCodeContext valuesetFromCode() {
			return getRuleContext(ValuesetFromCodeContext.class,0);
		}
		public ValuesetFromCodeSystemContext valuesetFromCodeSystem() {
			return getRuleContext(ValuesetFromCodeSystemContext.class,0);
		}
		public ValuesetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetValue; }
	}

	public final ValuesetValueContext valuesetValue() throws RecognitionException {
		ValuesetValueContext _localctx = new ValuesetValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valuesetValue);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				fullyQualifiedCode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				valuesetInlineValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				valuesetDescendingFrom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				valuesetFromCode();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				valuesetFromCodeSystem();
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

	public static class ValuesetInlineValueContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ValuesetInlineValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetInlineValue; }
	}

	public final ValuesetInlineValueContext valuesetInlineValue() throws RecognitionException {
		ValuesetInlineValueContext _localctx = new ValuesetInlineValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valuesetInlineValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			code();
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

	public static class ValuesetDescendingFromContext extends ParserRuleContext {
		public TerminalNode KW_INCLUDES_CODES_DESCENDING_FROM() { return getToken(SHRValueSetParser.KW_INCLUDES_CODES_DESCENDING_FROM, 0); }
		public List<FullyQualifiedCodeContext> fullyQualifiedCode() {
			return getRuleContexts(FullyQualifiedCodeContext.class);
		}
		public FullyQualifiedCodeContext fullyQualifiedCode(int i) {
			return getRuleContext(FullyQualifiedCodeContext.class,i);
		}
		public List<TerminalNode> KW_AND_NOT_DESCENDING_FROM() { return getTokens(SHRValueSetParser.KW_AND_NOT_DESCENDING_FROM); }
		public TerminalNode KW_AND_NOT_DESCENDING_FROM(int i) {
			return getToken(SHRValueSetParser.KW_AND_NOT_DESCENDING_FROM, i);
		}
		public ValuesetDescendingFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetDescendingFrom; }
	}

	public final ValuesetDescendingFromContext valuesetDescendingFrom() throws RecognitionException {
		ValuesetDescendingFromContext _localctx = new ValuesetDescendingFromContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valuesetDescendingFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(KW_INCLUDES_CODES_DESCENDING_FROM);
			setState(106);
			fullyQualifiedCode();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_AND_NOT_DESCENDING_FROM) {
				{
				{
				setState(107);
				match(KW_AND_NOT_DESCENDING_FROM);
				setState(108);
				fullyQualifiedCode();
				}
				}
				setState(113);
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

	public static class ValuesetFromCodeSystemContext extends ParserRuleContext {
		public TerminalNode KW_INCLUDES_CODES_FROM() { return getToken(SHRValueSetParser.KW_INCLUDES_CODES_FROM, 0); }
		public TerminalNode ALL_CAPS() { return getToken(SHRValueSetParser.ALL_CAPS, 0); }
		public ValuesetFromCodeSystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetFromCodeSystem; }
	}

	public final ValuesetFromCodeSystemContext valuesetFromCodeSystem() throws RecognitionException {
		ValuesetFromCodeSystemContext _localctx = new ValuesetFromCodeSystemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valuesetFromCodeSystem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(KW_INCLUDES_CODES_FROM);
			setState(115);
			match(ALL_CAPS);
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

	public static class ValuesetFromCodeContext extends ParserRuleContext {
		public TerminalNode KW_INCLUDES_CODES_FROM() { return getToken(SHRValueSetParser.KW_INCLUDES_CODES_FROM, 0); }
		public FullyQualifiedCodeContext fullyQualifiedCode() {
			return getRuleContext(FullyQualifiedCodeContext.class,0);
		}
		public ValuesetFromCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetFromCode; }
	}

	public final ValuesetFromCodeContext valuesetFromCode() throws RecognitionException {
		ValuesetFromCodeContext _localctx = new ValuesetFromCodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valuesetFromCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(KW_INCLUDES_CODES_FROM);
			setState(118);
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

	public static class ValuesetPropsContext extends ParserRuleContext {
		public List<ValuesetPropContext> valuesetProp() {
			return getRuleContexts(ValuesetPropContext.class);
		}
		public ValuesetPropContext valuesetProp(int i) {
			return getRuleContext(ValuesetPropContext.class,i);
		}
		public ValuesetPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetProps; }
	}

	public final ValuesetPropsContext valuesetProps() throws RecognitionException {
		ValuesetPropsContext _localctx = new ValuesetPropsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_valuesetProps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				valuesetProp();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_CONCEPT || _la==KW_DESCRIPTION );
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

	public static class ValuesetPropContext extends ParserRuleContext {
		public ConceptPropContext conceptProp() {
			return getRuleContext(ConceptPropContext.class,0);
		}
		public DescriptionPropContext descriptionProp() {
			return getRuleContext(DescriptionPropContext.class,0);
		}
		public ValuesetPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetProp; }
	}

	public final ValuesetPropContext valuesetProp() throws RecognitionException {
		ValuesetPropContext _localctx = new ValuesetPropContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valuesetProp);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CONCEPT:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				conceptProp();
				}
				break;
			case KW_DESCRIPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
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

	public static class ConceptPropContext extends ParserRuleContext {
		public TerminalNode KW_CONCEPT() { return getToken(SHRValueSetParser.KW_CONCEPT, 0); }
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
		enterRule(_localctx, 30, RULE_conceptProp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(KW_CONCEPT);
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TBD_CODE:
			case ALL_CAPS:
				{
				setState(130);
				concepts();
				}
				break;
			case KW_TBD:
				{
				setState(131);
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
		public List<TerminalNode> COMMA() { return getTokens(SHRValueSetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHRValueSetParser.COMMA, i);
		}
		public ConceptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concepts; }
	}

	public final ConceptsContext concepts() throws RecognitionException {
		ConceptsContext _localctx = new ConceptsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_concepts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			fullyQualifiedCode();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				fullyQualifiedCode();
				}
				}
				setState(141);
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
		public TerminalNode KW_DESCRIPTION() { return getToken(SHRValueSetParser.KW_DESCRIPTION, 0); }
		public TerminalNode STRING() { return getToken(SHRValueSetParser.STRING, 0); }
		public DescriptionPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionProp; }
	}

	public final DescriptionPropContext descriptionProp() throws RecognitionException {
		DescriptionPropContext _localctx = new DescriptionPropContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_descriptionProp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(KW_DESCRIPTION);
			setState(143);
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
		public List<TerminalNode> WHOLE_NUMBER() { return getTokens(SHRValueSetParser.WHOLE_NUMBER); }
		public TerminalNode WHOLE_NUMBER(int i) {
			return getToken(SHRValueSetParser.WHOLE_NUMBER, i);
		}
		public TerminalNode DOT() { return getToken(SHRValueSetParser.DOT, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(WHOLE_NUMBER);
			setState(146);
			match(DOT);
			setState(147);
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
		public TerminalNode LOWER_WORD() { return getToken(SHRValueSetParser.LOWER_WORD, 0); }
		public TerminalNode DOT_SEPARATED_LW() { return getToken(SHRValueSetParser.DOT_SEPARATED_LW, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		public TerminalNode UPPER_WORD() { return getToken(SHRValueSetParser.UPPER_WORD, 0); }
		public TerminalNode ALL_CAPS() { return getToken(SHRValueSetParser.ALL_CAPS, 0); }
		public SimpleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleName; }
	}

	public final SimpleNameContext simpleName() throws RecognitionException {
		SimpleNameContext _localctx = new SimpleNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simpleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==ALL_CAPS || _la==UPPER_WORD) ) {
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

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(SHRValueSetParser.CODE, 0); }
		public TerminalNode STRING() { return getToken(SHRValueSetParser.STRING, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(CODE);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(154);
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
		public TerminalNode ALL_CAPS() { return getToken(SHRValueSetParser.ALL_CAPS, 0); }
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
		enterRule(_localctx, 44, RULE_fullyQualifiedCode);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_CAPS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(157);
				match(ALL_CAPS);
				setState(158);
				code();
				}
				}
				break;
			case KW_TBD_CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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

	public static class TbdContext extends ParserRuleContext {
		public TerminalNode KW_TBD() { return getToken(SHRValueSetParser.KW_TBD, 0); }
		public TerminalNode STRING() { return getToken(SHRValueSetParser.STRING, 0); }
		public TbdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbd; }
	}

	public final TbdContext tbd() throws RecognitionException {
		TbdContext _localctx = new TbdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tbd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(KW_TBD);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(163);
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
		public TerminalNode KW_TBD_CODE() { return getToken(SHRValueSetParser.KW_TBD_CODE, 0); }
		public TerminalNode STRING() { return getToken(SHRValueSetParser.STRING, 0); }
		public TbdCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbdCode; }
	}

	public final TbdCodeContext tbdCode() throws RecognitionException {
		TbdCodeContext _localctx = new TbdCodeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tbdCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(KW_TBD_CODE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(167);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\5\2\67\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4"+
		"B\n\4\r\4\16\4C\3\5\3\5\3\5\3\5\3\5\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3"+
		"\7\5\7S\n\7\3\7\5\7V\n\7\3\b\3\b\3\b\3\b\5\b\\\n\b\3\t\6\t_\n\t\r\t\16"+
		"\t`\3\n\3\n\3\n\3\n\3\n\5\nh\n\n\3\13\3\13\3\f\3\f\3\f\3\f\7\fp\n\f\f"+
		"\f\16\fs\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\6\17|\n\17\r\17\16\17}\3"+
		"\20\3\20\5\20\u0082\n\20\3\21\3\21\3\21\5\21\u0087\n\21\3\22\3\22\3\22"+
		"\7\22\u008c\n\22\f\22\16\22\u008f\13\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u009e\n\27\3\30\3\30\3\30\5\30"+
		"\u00a3\n\30\3\31\3\31\5\31\u00a7\n\31\3\32\3\32\5\32\u00ab\n\32\3\32\2"+
		"\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\5\3\2\22"+
		"\24\3\2\31\32\3\2\27\30\2\u00a8\2\64\3\2\2\2\4:\3\2\2\2\6A\3\2\2\2\bE"+
		"\3\2\2\2\nM\3\2\2\2\fP\3\2\2\2\16W\3\2\2\2\20^\3\2\2\2\22g\3\2\2\2\24"+
		"i\3\2\2\2\26k\3\2\2\2\30t\3\2\2\2\32w\3\2\2\2\34{\3\2\2\2\36\u0081\3\2"+
		"\2\2 \u0083\3\2\2\2\"\u0088\3\2\2\2$\u0090\3\2\2\2&\u0093\3\2\2\2(\u0097"+
		"\3\2\2\2*\u0099\3\2\2\2,\u009b\3\2\2\2.\u00a2\3\2\2\2\60\u00a4\3\2\2\2"+
		"\62\u00a8\3\2\2\2\64\66\5\4\3\2\65\67\5\6\4\2\66\65\3\2\2\2\66\67\3\2"+
		"\2\2\678\3\2\2\289\5\n\6\29\3\3\2\2\2:;\7\3\2\2;<\7\4\2\2<=\5&\24\2=>"+
		"\7\5\2\2>?\5(\25\2?\5\3\2\2\2@B\5\b\5\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2"+
		"CD\3\2\2\2D\7\3\2\2\2EF\7\6\2\2FG\7\27\2\2GH\7\20\2\2HI\t\2\2\2I\t\3\2"+
		"\2\2JL\5\f\7\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OM\3"+
		"\2\2\2PR\5\16\b\2QS\5\34\17\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\5\20\t\2"+
		"UT\3\2\2\2UV\3\2\2\2V\r\3\2\2\2W[\7\7\2\2X\\\7\22\2\2Y\\\7\23\2\2Z\\\5"+
		"*\26\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\17\3\2\2\2]_\5\22\n\2^]\3\2\2\2"+
		"_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\21\3\2\2\2bh\5.\30\2ch\5\24\13\2dh\5\26"+
		"\f\2eh\5\32\16\2fh\5\30\r\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf"+
		"\3\2\2\2h\23\3\2\2\2ij\5,\27\2j\25\3\2\2\2kl\7\t\2\2lq\5.\30\2mn\7\n\2"+
		"\2np\5.\30\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\27\3\2\2\2sq\3\2"+
		"\2\2tu\7\b\2\2uv\7\27\2\2v\31\3\2\2\2wx\7\b\2\2xy\5.\30\2y\33\3\2\2\2"+
		"z|\5\36\20\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\35\3\2\2\2\177\u0082"+
		"\5 \21\2\u0080\u0082\5$\23\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\37\3\2\2\2\u0083\u0086\7\13\2\2\u0084\u0087\5\"\22\2\u0085\u0087\5\60"+
		"\31\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087!\3\2\2\2\u0088\u008d"+
		"\5.\30\2\u0089\u008a\7\21\2\2\u008a\u008c\5.\30\2\u008b\u0089\3\2\2\2"+
		"\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e#\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\f\2\2\u0091\u0092\7\34\2\2\u0092"+
		"%\3\2\2\2\u0093\u0094\7\26\2\2\u0094\u0095\7\17\2\2\u0095\u0096\7\26\2"+
		"\2\u0096\'\3\2\2\2\u0097\u0098\t\3\2\2\u0098)\3\2\2\2\u0099\u009a\t\4"+
		"\2\2\u009a+\3\2\2\2\u009b\u009d\7\25\2\2\u009c\u009e\7\34\2\2\u009d\u009c"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e-\3\2\2\2\u009f\u00a0\7\27\2\2\u00a0"+
		"\u00a3\5,\27\2\u00a1\u00a3\5\62\32\2\u00a2\u009f\3\2\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3/\3\2\2\2\u00a4\u00a6\7\r\2\2\u00a5\u00a7\7\34\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\61\3\2\2\2\u00a8\u00aa\7\16\2\2\u00a9"+
		"\u00ab\7\34\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\63\3\2\2"+
		"\2\23\66CMRU[`gq}\u0081\u0086\u008d\u009d\u00a2\u00a6\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}