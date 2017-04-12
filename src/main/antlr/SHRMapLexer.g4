lexer grammar SHRMapLexer;

// KEYWORDS for SHR
KW_GRAMMAR:         'Grammar:';
KW_G_MAP:           'Map';
KW_NAMESPACE:       'Namespace:';
KW_TBD:             'TBD';

// KEYWORDS for FHIR Primitives
KW_BOOLEAN:         'boolean';
KW_INTEGER:         'integer';
KW_STRING:          'string';
KW_DECIMAL:         'decimal';
KW_URI:             'uri';
KW_BASE64_BINARY:   'base64Binary';
KW_INSTANT:         'instant';
KW_DATE:            'date';
KW_DATE_TIME:       'dateTime';
KW_TIME:            'time';
KW_CODE:            'code';
KW_OID:             'oid';
KW_ID:              'id';
KW_MARKDOWN:        'markdown';
KW_UNSIGNED_INT:    'unsignedInt';
KW_POSITIVE_INT:    'positiveInt';
KW_XHTML:           'xhtml';

// KEYWORDS for mapping
KW_TARGET:          'Target:';
KW_MAPS_TO:         'maps to' -> pushMode(MAPPING_TARGET);
KW_CONSTRAIN:       'constrain' -> pushMode(CARDINALITY_MAPPING_TARGET);
KW_TO:              'to';

// SYMBOLS
DOT:                '.';
STAR:               '*';
OPEN_BRACKET:       '[';
CLOSE_BRACKET:      ']';
COLON:              ':';
RANGE:              '..';

// PATTERNS
WHOLE_NUMBER:       [0-9]+;
ALL_CAPS:           [A-Z][A-Z0-9_]*;
UPPER_WORD:         [A-Z][0-9a-zA-Z\\-_]*;
LOWER_WORD:         [a-z][0-9a-zA-Z\\-]*;
DOT_SEPARATED_LW:   [a-z][0-9a-zA-Z\\-]* ('.' [a-z][0-9a-zA-z\\-]*)+;
DOT_SEPARATED_UW:   [a-z][0-9a-zA-Z\\-]* ('.' [a-z][0-9a-zA-z\\-]*)* ('.' [A-Z][0-9a-zA-z\\-]*);
STRING:             '"' (~[\\"])* '"';

// THINGS WE GENERALLY IGNORE
WS:                 [ \r\t] -> channel(HIDDEN);
NEWLINE:            '\n' -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/' -> skip;
LINE_COMMENT:       '//' ~[\r\n]* -> skip;

mode MAPPING_TARGET;
TARGET_PHRASE: (~[ \r\t\n]* ~[ \r\t\n:] [ \r\t]*)+ -> popMode;
WS2: [ \r\t\n]+ -> channel(HIDDEN);

mode CARDINALITY_MAPPING_TARGET;
TARGET_WORD: ~[ \r\t\n]+ -> popMode;
WS3: [ \r\t\n]+ -> channel(HIDDEN);
