lexer grammar Tiger;

options {}

tokens {}

@header {}

@rulecatch {}

@members {}

Identifier
    : ('A'..'Z'|'a'..'z')('A'..'Z'|'a'..'z'|'0'..'9'|'_')*
    ;

Comment
    : '/*' ( options {greedy=false;} : . )* '*/'
    ;

Integerliteral
    : ('1'..'9')('0'..'9')*|'0'
    ;

Fixedpointliteral
    : Integerliteral'.'('0'..'9')('0'..'9')?('0'..'9')?
    ;

FUNCTION: 'function';
BEGIN: 'begin';
END: 'end';
VOID: 'void';
MAIN: 'main';
TYPE: 'type';
ARRAY: 'array';
OF: 'of';
INT: 'int';
FIXEDPT: 'fixedpt';
VAR: 'var';
IF: 'if';
THEN: 'then';
ENDIF: 'endif';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
ENDDO: 'enddo';
FOR: 'for';
TO: 'to';
DO: 'do';
BREAK: 'break';
RETURN: 'return';

COMMA: ',';
COLON: ':';
SEMI: ';';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
EQ: '=';
NEQ: '<>';
LESSER: '<';
LESSEREQ: '<=';
GREATER: '>';
GREATEREQ: '>=';
AND: '&';
OR: '|';
ASSIGN: ':=';



