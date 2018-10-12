parser grammar SHRDataElementParser;

options { tokenVocab=SHRDataElementLexer; }

// DATA DEFINITIONS (Grammar: DataElement)

doc:                docHeader descriptionProp? usesStatement? pathDefs? vocabularyDefs? dataDefs;
docHeader:          KW_GRAMMAR KW_G_DATA_ELEMENT version KW_NAMESPACE namespace;

usesStatement:      KW_USES namespace (COMMA namespace)*;

pathDefs:           pathDef+;
pathDef:            KW_PATH ALL_CAPS EQUAL URL;

vocabularyDefs:     vocabularyDef+;
vocabularyDef:      KW_VOCABULARY ALL_CAPS EQUAL (URL | URN_OID | URN); // (KW_VOCAB_VERSION WHOLE_NUMBER DOT WHOLE_NUMBER)?;

dataDefs:           dataDef*;
dataDef:            elementDef | entryDef;

elementDef:         elementHeader elementProps? values;
elementHeader:      KW_ABSTRACT? KW_ELEMENT simpleName;

entryDef:           entryHeader elementProps? values;
entryHeader:        KW_ENTRY simpleName;

elementProps:       elementProp+;
elementProp:        parentProp | conceptProp | descriptionProp;

values:             value? field*;

value:              KW_VALUE OPEN_PAREN? valueType (KW_OR valueType)* CLOSE_PAREN?; // TODO: Remove PAREN (here for backwards compatibility now)
valueType:          simpleOrFQName | ref | primitive | elementWithConstraint | tbd;

field:              OPEN_PAREN? fieldType (KW_OR fieldType)* CLOSE_PAREN? count? ; // TODO: Remove PAREN (here for backwards compatibility now)
fieldType:          specialWord | simpleOrFQName | ref | elementWithConstraint | tbd;

parentProp:         KW_PARENT (simpleOrFQName | tbd);
conceptProp:        KW_CONCEPT (concepts | tbd);
concepts:           fullyQualifiedCode (COMMA fullyQualifiedCode)*;
descriptionProp:    KW_DESCRIPTION STRING;
propertyProp:       KW_PROPERTY field

// COMMON BITS

version:            WHOLE_NUMBER DOT WHOLE_NUMBER;
namespace:          LOWER_WORD | DOT_SEPARATED_LW;
specialWord:        KW_BAR_ENTRY | KW_BAR_VALUE ;
simpleName:         UPPER_WORD | ALL_CAPS | LOWER_WORD; //LOWER_WORD is not intended use, and will throw an error. However, this prevents compiler crash.
fullyQualifiedName: DOT_SEPARATED_UW;
simpleOrFQName:     simpleName | fullyQualifiedName;
ref:                simpleOrFQName;
code:               CODE STRING?;
fullyQualifiedCode: (ALL_CAPS code) | tbdCode;
codeOrFQCode:       fullyQualifiedCode | code;
bindingInfix:       KW_PREFERRED | KW_EXAMPLE| KW_EXTENSIBLE
typeConstraint:     (simpleOrFQName | ref | primitive | tbd) count;

//elementWithConstraint

elementWithConstraint:      (specialWord | simpleOrFQName | elementPath | primitive) elementConstraint?;
// NOTE: not supporting _Value in subpath for now because that requires more significant work to support it in
// the importer, models, and other tooling.
elementPath:                (specialWord | simpleOrFQName) (((DOT simpleName)+ (DOT primitive)?) | ((DOT simpleName)* DOT primitive));
elementConstraint:          elementCodeVSConstraint | elementCodeValueConstraint | elementIncludesCodeValueConstraint | elementBooleanConstraint | elementTypeConstraint | elementIncludesTypeConstraint | elementWithUnitsConstraint;
legacyWithCode:             KW_WITH (KW_CONCEPT_CODE | simpleOrFQName); // Just here for backwards compatibility until definitions are updated
elementCodeVSConstraint:    legacyWithCode? KW_FROM valueset OPEN_PAREN bindingInfix? CLOSE_PAREN KW_IF_COVERED?;
elementCodeValueConstraint: KW_IS codeOrFQCode;
elementIncludesCodeValueConstraint: (KW_INCLUDES codeOrFQCode)+;
elementBooleanConstraint:   KW_IS (KW_TRUE | KW_FALSE);
elementTypeConstraint:      (KW_IS_TYPE | KW_VALUE_IS_TYPE) (simpleOrFQName | ref | primitive | tbd);
elementIncludesTypeConstraint: (KW_INCLUDES typeConstraint)+;
elementWithUnitsConstraint: KW_WITH KW_UNITS fullyQualifiedCode;
valueset:           URL | PATH_URL | URN_OID | simpleName | tbd;
primitive:          KW_BOOLEAN | KW_INTEGER | KW_STRING | KW_DECIMAL | KW_URI | KW_BASE64_BINARY | KW_INSTANT | KW_DATE
                    | KW_DATE_TIME | KW_TIME | KW_CONCEPT_CODE | KW_OID | KW_ID | KW_MARKDOWN | KW_UNSIGNED_INT
                    | KW_POSITIVE_INT | KW_XHTML;
count:              WHOLE_NUMBER RANGE (WHOLE_NUMBER | STAR);
tbd:                KW_TBD STRING?;
tbdCode:            KW_TBD_CODE STRING?;
