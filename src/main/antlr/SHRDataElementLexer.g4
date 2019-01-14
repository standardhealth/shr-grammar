lexer grammar SHRDataElementLexer;

import PrimitivesLexer, PatternsLexer, IgnoredTokensLexer;

// KEYWORDS for SHR Data Elements
KW_GRAMMAR:         'Grammar:';
KW_G_DATA_ELEMENT:  'DataElement';
KW_NAMESPACE:       'Namespace:';
KW_USES:            'Uses:';
KW_PATH:            'Path:';
KW_VOCABULARY:      'CodeSystem:';
//KW_VOCAB_VERSION:   'Version:';
KW_ABSTRACT:        'Abstract:';
KW_ELEMENT:         'Element:';
KW_ENTRY:           'Entry:';
KW_PARENT:          'Parent:';
KW_VALUE:           'Value';
KW_CONCEPT:         'Concept:';
KW_DESCRIPTION:     'Description:';
KW_PROPERTY:        'Property:';
KW_OR:              'or';
KW_WITH:            'with';
KW_REQUIRED:        'required';
KW_PREFERRED:       'preferred';
KW_EXAMPLE:         'example';
KW_EXTENSIBLE:      'extensible';
KW_FROM:            'from';
KW_IS:              'is';
KW_SUBSTITUTE:      'substitute';
KW_INCLUDES:        'includes';
KW_TRUE:            'true';
KW_FALSE:           'false';
KW_TBD:             'TBD';
KW_TBD_CODE:        'TBD#TBD';
KW_ONLY:            'only';

// KEYWORDS for special constrainable items
KW_BAR_ENTRY:       '_Entry';
KW_BAR_VALUE:       '_Value';

// SYMBOLS
DOT:                '.';
EQUAL:              '=';
COMMA:              ',';
STAR:               '*';
OPEN_PAREN:         '(';
CLOSE_PAREN:        ')';
RANGE:              '..';
PLUS:               '+';
COLON:              ':';
OPEN_BRACKET:       '[';
CLOSE_BRACKET:      ']';

// PATTERNS
URL:                [a-z]+ '://' [a-zA-Z][0-9a-zA-Z_%#=\\?\\-\\.\\/]*;
PATH_URL:           [A-Z][A-Z0-9]* '/' [0-9a-zA-Z][0-9a-zA-Z_%#=\\?\\-\\.\\/]*;
URN_OID:            'urn:oid:' [0-2]'.'[0-9]+('.'[0-9]+)*;
URN:                'urn' (':'[0-9a-zA-Z\\.]+)+;
CODE:               '#' ~[, \r\t\n]+;
