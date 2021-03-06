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
KW_FIX:             'fix' -> pushMode(FIXED_MAPPING_TARGET);
KW_TO:              'to';

// KEYWORDS for special mappable items
KW_BAR_CONCEPT:     '_Concept';
KW_BAR_ENTRY:       '_Entry';
KW_BAR_VALUE:       '_Value';

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

mode FIXED_MAPPING_TARGET;
TARGET_WORD_2: ~[ \r\t\n]+;
TARGET_PHRASE_2: ('to'[ \t]+ ~[ \r\t\n]* ~[ \r\t\n:] [ \r\t]*)+ -> popMode;
WS4: [ \r\t\n]+ -> channel(HIDDEN);
