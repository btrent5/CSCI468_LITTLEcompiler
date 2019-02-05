grammar little_grammar;

/*
 * Parser Rules
 */


/*
 * Lexer Rules
 */
INTLITERAL    : [0-9]+ ;
FLOATLITERAL  : [0-9]*'.'[0-9]+ ;
STRINGLITERAL : '"'.*?'"' ;
COMMENT       : '--' .*? '\n' ;
KEYWORD       : 'PROGRAM' | 'BEGIN'| 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'ELSE' | 'ENDIF' | 'WHILE' | 'ENDWHILE' | 'CONTINUE' | 'BREAK' | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT' ;
OPERATOR      : ':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ','| '<=' | '>=' ;
WS            : [ \t\n]+ -> skip ; // skips spaces, tabs, newlines