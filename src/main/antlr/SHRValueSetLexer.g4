lexer grammar SHRValueSetLexer;

import PatternsLexer, IgnoredTokensLexer;

// KEYWORDS for SHR ValueSets
KW_GRAMMAR:         'Grammar:';
KW_G_VALUE_SET:     'ValueSet';
KW_NAMESPACE:       'Namespace:';
KW_VOCABULARY:      'CodeSystem:'; // Don't rename token for now (it will cause merge conflicts w/ other work)
KW_VALUESET:        'ValueSet:';
KW_INCLUDES_CODES_FROM: 'Includes codes from';
KW_INCLUDES_CODES_DESCENDING_FROM: 'Includes codes descending from';
KW_AND_NOT_DESCENDING_FROM: 'and not descending from';
KW_CONCEPT:         'Concept:';
KW_DESCRIPTION:     'Description:';
KW_TBD:             'TBD';
KW_TBD_CODE:        'TBD#TBD';

// SYMBOLS
DOT:                '.';
EQUAL:              '=';
COMMA:              ',';

// PATTERNS
URL:                [a-z]+ '://' [a-zA-Z][0-9a-zA-Z_%#=\\?\\-\\.\\/]*;
URN_OID:            'urn:oid:' [0-2]'.'[0-9]+('.'[0-9]+)*;
URN:                'urn' (':'[0-9a-zA-Z\\.]+)+;
CODE:               '#' ~[, \r\t\n]+;
