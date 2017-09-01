lexer grammar IgnoredTokensLexer;

// Common Lexer Definitions for tokens we generally ignore
// Used by SHRDataElementLexer, SHRMapLexer, and SHRValueSetLexer
WS:                 [ \r\t] -> channel(HIDDEN);
NEWLINE:            '\n' -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/' -> skip;
LINE_COMMENT:       '//' ~[\r\n]* -> skip;
