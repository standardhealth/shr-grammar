lexer grammar PatternsLexer;

// Common Lexer Definitions for patterns defining words and numbers
// Used by SHRDataElementLexer, SHRMapLexer, and SHRValueSetLexer
WHOLE_NUMBER:       [0-9]+;
ALL_CAPS:           [A-Z][A-Z0-9_]*;
UPPER_WORD:         [A-Z][0-9a-zA-Z\\-_]*;
LOWER_WORD:         [a-z][0-9a-zA-Z\\-]*;
DOT_SEPARATED_LW:   [a-z][0-9a-zA-Z\\-]* ('.' [a-z][0-9a-zA-z\\-]*)+;
DOT_SEPARATED_UW:   [a-z][0-9a-zA-Z\\-]* ('.' [a-z][0-9a-zA-z\\-]*)* ('.' [A-Z][0-9a-zA-z\\-]*);
STRING:             '"' (~[\\"])* '"';
