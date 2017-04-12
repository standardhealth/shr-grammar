lexer grammar SHRDataElementLexer;

// KEYWORDS for SHR
KW_GRAMMAR:         'Grammar:';
KW_G_DATA_ELEMENT:  'DataElement';
KW_NAMESPACE:       'Namespace:';
KW_USES:            'Uses:';
KW_PATH:            'Path:';
KW_VOCABULARY:      'CodeSystem:'; // Don't rename token for now (it will cause merge conflicts w/ other work)
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
