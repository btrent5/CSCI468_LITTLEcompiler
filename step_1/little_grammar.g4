grammar Little;

/* Grammar rules for Lexer */
INTLITERAL:
FLOATLITERAL:
STRINGLITERAL:
COMMENT:
KEYWORD: 'PROGRAM' | 'BEGIN'| 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'ELSE' | 'ENDIF' | 'WHILE' | 'ENDWHILE' | 'CONTINUE' | 'BREAK' | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT';
OPERATOR: ':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ','| '<=' | '>=';
WHITESPACE: [ \t\n]+ -> skip ;