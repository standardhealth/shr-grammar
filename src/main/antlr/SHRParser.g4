parser grammar SHRParser;

options { tokenVocab=SHRLexer; }

shr:                dataDefsDoc | valuesetDefsDoc | mappingsDoc /* | contentProfiles*/;

// DATA DEFINITIONS (Grammar: DataElement)

dataDefsDoc:        dataDefsHeader descriptionProp? usesStatement? pathDefs? vocabularyDefs? dataDefs;
dataDefsHeader:     KW_GRAMMAR KW_G_DATA_ELEMENT version KW_NAMESPACE namespace;

usesStatement:      KW_USES namespace (COMMA namespace)*;

pathDefs:           (defaultPathDef pathDef*) | (defaultPathDef? pathDef+);
defaultPathDef:     KW_PATH URL;
pathDef:            KW_PATH ALL_CAPS EQUAL URL;

vocabularyDefs:     vocabularyDef+;
vocabularyDef:      KW_VOCABULARY ALL_CAPS EQUAL (URL | URN_OID | URN);

dataDefs:           dataDef*;
dataDef:            elementDef | entryDef;

elementDef:         elementHeader elementProps? values;
elementHeader:      KW_ELEMENT simpleName;

entryDef:           entryHeader elementProps? values;
entryHeader:        KW_ENTRY_ELEMENT simpleName;

elementProps:       elementProp+;
elementProp:        basedOnProp | conceptProp | descriptionProp;

values:             value? field*;

value:              KW_VALUE (uncountedValue | countedValue);
uncountedValue:     (valueType (KW_OR valueType)*) | (OPEN_PAREN valueType (KW_OR valueType)* CLOSE_PAREN);
countedValue:       count valueType | count OPEN_PAREN valueType (KW_OR valueType)* CLOSE_PAREN;
valueType:          simpleOrFQName | ref | primitive | codeFromVS | elementWithConstraint | tbd;

field:              countedField (KW_OR countedField)*;
countedField:       count? (fieldType | OPEN_PAREN fieldType (KW_OR fieldType)* CLOSE_PAREN);
fieldType:          simpleOrFQName | ref | elementWithConstraint | tbd;

basedOnProp:        KW_BASED_ON (simpleOrFQName | tbd);
conceptProp:        KW_CONCEPT (tbd | concepts);
concepts:           fullyQualifiedCode (COMMA fullyQualifiedCode)*;
descriptionProp:    KW_DESCRIPTION STRING;

// VALUESET DEFINITIONS (Grammar: ValueSet)

valuesetDefsDoc:    valuesetDefsHeader usesStatement? pathDefs? vocabularyDefs? valuesetDefs;
valuesetDefsHeader: KW_GRAMMAR KW_G_VALUE_SET version KW_NAMESPACE  namespace;

valuesetDefs:           valuesetDef*;
valuesetDef:            valuesetHeader valuesetProps? valuesetValues?;
valuesetHeader:         KW_VALUESET (URL | URN_OID| simpleName);
valuesetValues:         valuesetValue+;
valuesetValue:          fullyQualifiedCode | valuesetInlineValue | valuesetDescendingFrom | valuesetFrom;
valuesetInlineValue:    CODE STRING?;
valuesetDescendingFrom: KW_INCLUDES_CODES_DESCENDING_FROM fullyQualifiedCode (KW_AND_NOT_DESCENDING_FROM fullyQualifiedCode)*;
valuesetFrom:           KW_INCLUDES_CODES_FROM fullyQualifiedCode;

valuesetProps:      valuesetProp+;
valuesetProp:       conceptProp | descriptionProp;

// MAPPINGS (Grammar: Map)

mappingsDoc:        mappingsHeader targetStatement mappingDefs;
mappingsHeader:     KW_GRAMMAR KW_G_MAP version KW_NAMESPACE  namespace;
targetStatement:    KW_TARGET simpleName;

mappingDefs:        mappingDef*;
mappingDef:         mappingDefHeader fieldMapping*;
mappingDefHeader:   simpleName (KW_MAPS_TO simpleName)? COLON;

fieldMapping:       fieldToFieldMapping | urlMapping | cardMapping;
fieldToFieldMapping:source KW_MAPS_TO target;
source:             sourcePart (DOT sourcePart)* (OPEN_BRACKET source CLOSE_BRACKET)?;
sourcePart:         simpleOrFQName | primitive | tbd;
target:             targetPart (DOT targetPart)* (OPEN_BRACKET target CLOSE_BRACKET)?;
targetPart:         LOWER_WORD | DOT_SEPARATED_LW /*yuck*/ | UPPER_WORD | ALL_CAPS | primitive;
urlMapping:         source KW_MAPS_TO URL;
cardMapping:        targetPart KW_IS count;

// CONTENT PROFILES: TODO -- May Be a Separate Grammar

// COMMON BITS

version:            WHOLE_NUMBER DOT WHOLE_NUMBER;
namespace:          LOWER_WORD | DOT_SEPARATED_LW;
simpleName:         UPPER_WORD | ALL_CAPS;
fullyQualifiedName: DOT_SEPARATED_UW;
simpleOrFQName:     simpleName | fullyQualifiedName;
ref:                KW_REF OPEN_PAREN simpleOrFQName CLOSE_PAREN;
code:               CODE STRING?;
fullyQualifiedCode: (ALL_CAPS code) | tbdCode;
codeOrFQCode:       fullyQualifiedCode | code;
codeFromVS:         (KW_CODE_FROM | KW_CODING_FROM) valueset;

//elementWithConstraint

elementWithConstraint:      (simpleOrFQName | elementPath | primitive) elementConstraint?;
elementPath:                simpleOrFQName (((DOT simpleName)+ (DOT primitive)?) | ((DOT simpleName)* DOT primitive));
elementConstraint:          elementCodeVSConstraint | elementCodeValueConstraint | elementIncludesCodeValueConstraint | elementBooleanConstraint | elementTypeConstraint | /*elementIncludesTypeConstraint |*/ elementWithUnitsConstraint;
elementCodeVSConstraint:    KW_WITH codeFromVS;
elementCodeValueConstraint: KW_IS codeOrFQCode;
elementIncludesCodeValueConstraint: (KW_INCLUDES codeOrFQCode)+;
elementBooleanConstraint:   KW_IS (KW_TRUE | KW_FALSE);
elementTypeConstraint:      (KW_IS_TYPE | KW_VALUE_IS_TYPE) (simpleOrFQName | tbd);
elementWithUnitsConstraint: KW_WITH KW_UNITS fullyQualifiedCode;
valueset:           URL | PATH_URL | URN_OID | simpleName | tbd;
primitive:          KW_BOOLEAN | KW_INTEGER | KW_STRING | KW_DECIMAL | KW_URI | KW_BASE64_BINARY | KW_INSTANT | KW_DATE
                    | KW_DATE_TIME | KW_TIME | KW_CODE | KW_OID | KW_ID | KW_MARKDOWN | KW_UNSIGNED_INT
                    | KW_POSITIVE_INT;
count:              WHOLE_NUMBER RANGE (WHOLE_NUMBER | STAR);
tbd:                KW_TBD STRING?;
tbdCode:            KW_TBD_CODE STRING?;
