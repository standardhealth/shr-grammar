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
entryHeader:        KW_ENTRY_ELEMENT simpleName;

elementProps:       elementProp+;
elementProp:        basedOnProp | conceptProp | descriptionProp;

values:             value? field*;

value:              KW_VALUE count? OPEN_PAREN? valueType (KW_OR valueType)* CLOSE_PAREN?; // TODO: Remove PAREN (here for backwards compatibility now)
valueType:          simpleOrFQName | ref | primitive | elementWithConstraint | tbd;

field:              count? OPEN_PAREN? fieldType (KW_OR fieldType)* CLOSE_PAREN?; // TODO: Remove PAREN (here for backwards compatibility now)
fieldType:          simpleOrFQName | ref | elementWithConstraint | tbd;

basedOnProp:        KW_BASED_ON (simpleOrFQName | tbd);
conceptProp:        KW_CONCEPT (concepts | tbd);
concepts:           fullyQualifiedCode (COMMA fullyQualifiedCode)*;
descriptionProp:    KW_DESCRIPTION STRING;

// COMMON BITS

version:            WHOLE_NUMBER DOT WHOLE_NUMBER;
namespace:          LOWER_WORD | DOT_SEPARATED_LW;
simpleName:         UPPER_WORD | ALL_CAPS | LOWER_WORD; //LOWER_WORD is not intended use, and will throw an error. However, this prevents compiler crash.
fullyQualifiedName: DOT_SEPARATED_UW;
simpleOrFQName:     simpleName | fullyQualifiedName;
ref:                KW_REF OPEN_PAREN simpleOrFQName CLOSE_PAREN;
code:               CODE STRING?;
fullyQualifiedCode: (ALL_CAPS code) | tbdCode;
codeOrFQCode:       fullyQualifiedCode | code;
bindingInfix:       KW_MUST_BE | KW_SHOULD_BE | KW_COULD_BE;
typeConstraint:     count (simpleOrFQName | ref | tbd);

//elementWithConstraint

elementWithConstraint:      (simpleOrFQName | elementPath | primitive) elementConstraint?;
elementPath:                simpleOrFQName (((DOT simpleName)+ (DOT primitive)?) | ((DOT simpleName)* DOT primitive));
elementConstraint:          elementCodeVSConstraint | elementCodeValueConstraint | elementIncludesCodeValueConstraint | elementBooleanConstraint | elementTypeConstraint | elementIncludesTypeConstraint | elementWithUnitsConstraint;
legacyWithCode:             KW_WITH (KW_CODE | simpleOrFQName); // Just here for backwards compatibility until definitions are updated
elementCodeVSConstraint:    legacyWithCode? bindingInfix? KW_FROM valueset KW_IF_COVERED?;
elementCodeValueConstraint: KW_IS codeOrFQCode;
elementIncludesCodeValueConstraint: (KW_INCLUDES codeOrFQCode)+;
elementBooleanConstraint:   KW_IS (KW_TRUE | KW_FALSE);
elementTypeConstraint:      (KW_IS_TYPE | KW_VALUE_IS_TYPE) (simpleOrFQName | ref | tbd);
elementIncludesTypeConstraint: (KW_INCLUDES typeConstraint)+;
elementWithUnitsConstraint: KW_WITH KW_UNITS fullyQualifiedCode;
valueset:           URL | PATH_URL | URN_OID | simpleName | tbd;
primitive:          KW_BOOLEAN | KW_INTEGER | KW_STRING | KW_DECIMAL | KW_URI | KW_BASE64_BINARY | KW_INSTANT | KW_DATE
                    | KW_DATE_TIME | KW_TIME | KW_CODE | KW_OID | KW_ID | KW_MARKDOWN | KW_UNSIGNED_INT
                    | KW_POSITIVE_INT | KW_XHTML;
count:              WHOLE_NUMBER RANGE (WHOLE_NUMBER | STAR);
tbd:                KW_TBD STRING?;
tbdCode:            KW_TBD_CODE STRING?;
