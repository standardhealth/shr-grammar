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
dataDef:            elementDef | entryDef | abstractDef | groupDef;

groupDef:           groupHeader elementProps? field*;
groupHeader:        KW_GROUP simpleName;

elementDef:         elementHeader elementProps? values;
elementHeader:      KW_ELEMENT simpleName;

entryDef:           entryHeader elementProps? values;
entryHeader:        KW_ENTRY simpleName;

abstractDef:        abstractHeader elementProps? values;
abstractHeader:     KW_ABSTRACT simpleName;

elementProps:       elementProp+;
elementProp:        parentProp | conceptProp | descriptionProp;

values:             value? field*;

value:              KW_VALUE (COLON | KW_ONLY) valueType (KW_OR valueType)*;
valueType:          simpleOrFQName | primitive | elementWithConstraint | tbd;



field:              propertyField | elementWithConstraint;

propertyField:      KW_PROPERTY propertyFieldType count;
propertyFieldType:  specialWord | simpleOrFQName | tbd;

parentProp:         KW_PARENT (simpleOrFQName | tbd);
conceptProp:        KW_CONCEPT (concepts | tbd);
concepts:           fullyQualifiedCode (COMMA fullyQualifiedCode)*;
descriptionProp:    KW_DESCRIPTION STRING;

// COMMON BITS

version:            WHOLE_NUMBER DOT WHOLE_NUMBER;
namespace:          LOWER_WORD | DOT_SEPARATED_LW;
specialWord:        KW_BAR_ENTRY | KW_VALUE;
simpleName:         UPPER_WORD | ALL_CAPS | LOWER_WORD; //LOWER_WORD is not intended use, and will throw an error. However, this prevents compiler crash.
fullyQualifiedName: DOT_SEPARATED_UW;
simpleOrFQName:     simpleName | fullyQualifiedName;
code:               CODE STRING?;
fullyQualifiedCode: (ALL_CAPS code) | tbdCode;
codeOrFQCode:       fullyQualifiedCode | code;
bindingStrength:    KW_REQUIRED | KW_PREFERRED | KW_EXAMPLE| KW_EXTENSIBLE;
typeConstraint:     (simpleOrFQName | primitive | tbd) count;
subsetConstraint:   (simpleOrFQName | primitive | tbd);

elementWithConstraint:      (specialWord | simpleOrFQName | elementBracketPath | primitive) (count | elementConstraint)?;
//valueWithConstraint:      KW_VALUE elementConstraint?;

// NOTE: not supporting _Value in subpath for now because that requires more significant work to support it in
// the importer, models, and other tooling.
elementBracketPathFirstPart:    specialWord | simpleOrFQName;
elementBracketPathSecondPart:   OPEN_BRACKET (simpleName | primitive) CLOSE_BRACKET;
elementBracketPathThirdPart:    DOT simpleName elementBracketPathSecondPart*;
elementBracketPath:             elementBracketPathFirstPart elementBracketPathSecondPart* elementBracketPathThirdPart*;
elementConstraint:          elementCodeVSConstraint | elementCodeValueConstraint | elementIncludesCodeValueConstraint | elementBooleanConstraint | elementStringConstraint | elementIntegerConstraint | elementDecimalConstraint | elementTypeConstraint | elementSubsetConstraint | elementIncludesTypeConstraint | elementUrlConstraint;
elementCodeVSConstraint:    KW_FROM valueset (OPEN_PAREN bindingStrength CLOSE_PAREN)?;
elementCodeValueConstraint: EQUAL fullyQualifiedCode;
elementIncludesCodeValueConstraint: (PLUS EQUAL fullyQualifiedCode)+;
elementBooleanConstraint:   EQUAL (KW_TRUE | KW_FALSE);
elementStringConstraint:    EQUAL STRING; // Can also be applied to fix a URI
elementIntegerConstraint:   EQUAL MINUS? WHOLE_NUMBER; // Can also be applied to fix a decimal value
elementDecimalConstraint:   EQUAL MINUS? WHOLE_NUMBER DOT WHOLE_NUMBER? EXP?;
elementTypeConstraint:      (KW_SUBSTITUTE | KW_ONLY) (simpleOrFQName | primitive | tbd);
elementSubsetConstraint:    KW_ONLY (subsetConstraint) (KW_OR (subsetConstraint))+;
elementUrlConstraint:       EQUAL URL;
elementIncludesTypeConstraint: (KW_INCLUDES typeConstraint)+;
valueset:           URL | PATH_URL | URN_OID | URN |simpleName | tbd;
primitive:          KW_BOOLEAN | KW_INTEGER | KW_STRING | KW_DECIMAL | KW_URI | KW_BASE64_BINARY | KW_INSTANT | KW_DATE
                    | KW_DATE_TIME | KW_TIME | KW_CONCEPT_CODE | KW_OID | KW_ID | KW_MARKDOWN | KW_UNSIGNED_INT
                    | KW_POSITIVE_INT | KW_XHTML;
count:              WHOLE_NUMBER RANGE (WHOLE_NUMBER | STAR);
tbd:                KW_TBD STRING?;
tbdCode:            KW_TBD_CODE STRING?;
