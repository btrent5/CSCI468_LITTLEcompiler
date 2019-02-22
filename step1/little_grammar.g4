grammar little_grammar;

/*
 * Parser Rules
 */
id            : IDENTIFIER ; // prevent error since first rule needs to be lowercase

/*
 * Lexer Rules
 */
KEYWORD       : 'PROGRAM' | 'BEGIN'| 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'ELSE' | 'ENDIF' | 'WHILE' | 'ENDWHILE' | 'CONTINUE' | 'BREAK' | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT' ;
IDENTIFIER    : [A-z]([0-9]|[A-z])* ;
FLOATLITERAL  : [0-9]*'.'[0-9]+ ;
INTLITERAL    : [0-9]+ ;
STRINGLITERAL : '"'.*?'"' ;
COMMENT       : '--' .*? '\n' -> skip ;
OPERATOR      : ':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ','| '<=' | '>=' ;
WS            : [ \t\n]+ -> skip ; // skips spaces, tabs, newlines
