parser grammar SHRValueSetParser;

options { tokenVocab=SHRValueSetLexer; }

// VALUESET DEFINITIONS (Grammar: ValueSet)

doc:                    docHeader vocabularyDefs? valuesetDefs;
docHeader:              KW_GRAMMAR KW_G_VALUE_SET version KW_NAMESPACE  namespace;

vocabularyDefs:         vocabularyDef+;
vocabularyDef:          KW_VOCABULARY ALL_CAPS EQUAL (URL | URN_OID | URN);

valuesetDefs:           valuesetDef*;
valuesetDef:            valuesetHeader valuesetProps? valuesetValues?;
valuesetHeader:         KW_VALUESET (URL | URN_OID| simpleName);
valuesetValues:         valuesetValue+;
valuesetValue:          fullyQualifiedCode | valuesetInlineValue | valuesetDescendingFrom | valuesetFromCode | valuesetFromCodeSystem;
valuesetInlineValue:    code;
valuesetDescendingFrom: KW_INCLUDES_CODES_DESCENDING_FROM fullyQualifiedCode (KW_AND_NOT_DESCENDING_FROM fullyQualifiedCode)*;
valuesetFromCodeSystem: KW_INCLUDES_CODES_FROM ALL_CAPS;
valuesetFromCode:       KW_INCLUDES_CODES_FROM fullyQualifiedCode;

valuesetProps:      valuesetProp+;
valuesetProp:       conceptProp | descriptionProp;
conceptProp:        KW_CONCEPT (concepts | tbd);
concepts:           fullyQualifiedCode (COMMA fullyQualifiedCode)*;
descriptionProp:    KW_DESCRIPTION STRING;

// COMMON BITS

version:            WHOLE_NUMBER DOT WHOLE_NUMBER;
namespace:          LOWER_WORD | DOT_SEPARATED_LW;
simpleName:         UPPER_WORD | ALL_CAPS;
code:               CODE STRING?;
fullyQualifiedCode: (ALL_CAPS code) | tbdCode;
tbd:                KW_TBD STRING?;
tbdCode:            KW_TBD_CODE STRING?;
