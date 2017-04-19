lexer grammar SHRMapLexer;

import PrimitivesLexer, PatternsLexer, IgnoredTokensLexer;

// KEYWORDS for SHR Map
KW_GRAMMAR:         'Grammar:';
KW_G_MAP:           'Map';
KW_NAMESPACE:       'Namespace:';
KW_TBD:             'TBD';

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

mode MAPPING_TARGET;
TARGET_PHRASE: (~[ \r\t\n]* ~[ \r\t\n:] [ \r\t]*)+ -> popMode;
WS2: [ \r\t\n]+ -> channel(HIDDEN);

mode CARDINALITY_MAPPING_TARGET;
TARGET_WORD: ~[ \r\t\n]+ -> popMode;
WS3: [ \r\t\n]+ -> channel(HIDDEN);
