lexer grammar SHRDataElementLexer;

import PrimitivesLexer, PatternsLexer, IgnoredTokensLexer;

// KEYWORDS for SHR Data Elements
KW_GRAMMAR:         'Grammar:';
KW_G_DATA_ELEMENT:  'DataElement';
KW_NAMESPACE:       'Namespace:';
KW_USES:            'Uses:';
KW_PATH:            'Path:';
KW_VOCABULARY:      'CodeSystem:';
KW_ELEMENT:         'Element:';
KW_ENTRY_ELEMENT:   'EntryElement:';
KW_BASED_ON:        'Based on:';
KW_VALUE:           'Value:';
KW_CONCEPT:         'Concept:';
KW_DESCRIPTION:     'Description:';
KW_REF:             'ref';
KW_OR:              'or';
KW_WITH:            'with';
KW_IS:              'is';
KW_IS_TYPE:         'is type';
KW_VALUE_IS_TYPE:   'value is type';
KW_INCLUDES:        'includes';
KW_TRUE:            'true';
KW_FALSE:           'false';
KW_TBD:             'TBD';
KW_TBD_CODE:        'TBD#TBD';

// KEYWORDS for types w/ qualifiers
KW_CODE_FROM:       'code from';
KW_CODING_FROM:     'Coding from';
KW_CODEABLECONCEPT_FROM: 'CodeableConcept from';
KW_UNITS:           'units';

// SYMBOLS
DOT:                '.';
EQUAL:              '=';
COMMA:              ',';
STAR:               '*';
OPEN_PAREN:         '(';
CLOSE_PAREN:        ')';
RANGE:              '..';

// PATTERNS
URL:                [a-z]+ '://' [a-zA-Z][0-9a-zA-Z_%#=\\?\\-\\.\\/]*;
PATH_URL:           [A-Z][A-Z0-9]* '/' [0-9a-zA-Z][0-9a-zA-Z_%#=\\?\\-\\.\\/]*;
URN_OID:            'urn:oid:' [0-2]'.'[0-9]+('.'[0-9]+)*;
URN:                'urn' (':'[0-9a-zA-Z\\.]+)+;
CODE:               '#' ~[, \r\t\n]+;
