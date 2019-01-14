parser grammar SHRMapParser;

options { tokenVocab=SHRMapLexer; }

// MAPPINGS (Grammar: Map)

doc:                docHeader targetStatement mappingDefs;
docHeader:          KW_GRAMMAR KW_G_MAP version KW_NAMESPACE  namespace;
targetStatement:    KW_TARGET simpleName;

mappingDefs:        mappingDef*;
mappingDef:         mappingDefHeader mappingRule*;
mappingDefHeader:   simpleName (KW_MAPS_TO TARGET_PHRASE)? COLON;

mappingRule:        fieldMapping | cardMapping | fixedMapping;
fieldMapping:       source KW_MAPS_TO TARGET_PHRASE;
source:             sourcePart (DOT sourcePart)*;
sourcePart:         sourceWord (OPEN_BRACKET sourceWord CLOSE_BRACKET)*;
sourceWord:         specialWord | simpleOrFQName | primitive | tbd;
cardMapping:        KW_CONSTRAIN TARGET_WORD KW_TO count;
fixedMapping:       KW_FIX TARGET_WORD_2 TARGET_PHRASE_2;

// COMMON BITS

version:            WHOLE_NUMBER DOT WHOLE_NUMBER;
namespace:          LOWER_WORD | DOT_SEPARATED_LW;
specialWord:        KW_BAR_CONCEPT | KW_BAR_ENTRY | KW_BAR_VALUE ;
simpleName:         UPPER_WORD | ALL_CAPS;
fullyQualifiedName: DOT_SEPARATED_UW;
simpleOrFQName:     simpleName | fullyQualifiedName;

primitive:          KW_BOOLEAN | KW_INTEGER | KW_STRING | KW_DECIMAL | KW_URI | KW_BASE64_BINARY | KW_INSTANT | KW_DATE
                    | KW_DATE_TIME | KW_TIME | KW_CONCEPT_CODE | KW_OID | KW_ID | KW_MARKDOWN | KW_UNSIGNED_INT
                    | KW_POSITIVE_INT | KW_XHTML;
count:              WHOLE_NUMBER RANGE (WHOLE_NUMBER | STAR);
tbd:                KW_TBD STRING?;