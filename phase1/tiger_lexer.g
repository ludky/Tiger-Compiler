lexer grammar Tiger;

options {

}

tokens {

}

@header {

}

@rulecatch {

}

@members {

}



program
    :
    ;









Comment
    :   '/*' ( options {greedy=false;} : . )* '*/'
    ;

// Reserved key words
FUNCTION    :   'function';
BEGIN       :   'begin';
END         :   'end';
VOID        :   'void';
MAIN        :   'main';
TYPE        :   'type';
ARRAY       :   'array';
OF          :   'of';
INT         :   'int';
FIXEDPT     :   'fixedpt';
VAR         :   'var';
IF          :   'if';
THEN        :   'then';
ENDIF       :   'endif';
ELSE        :   'else';
WHILE       :   'while';
DO          :   'do';
ENDDO       :   'enddo';
FOR         :   'for';
TO          :   'to';
DO          :   'do';
BREAK       :   'break';
RETURN      :   'return';

//Punctuation Symbols/Binary operator
COMMA       :   ',';
COLON       :   ':';
SEMI        :   ';';
LPAREN      :   '(';
ROAREN      :   ')';
LBRACK      :   '{';
RBRACK      :   '}';
PLUS        :   '+';
MINUS       :   '-';
MULT        :   '*';
DIV         :   '/';
EQ          :   '=';
NEQ         :   '<>';
LESSER      :   '<';
LESSEREQ    :   '<=';
GREATER     :   '>';
GREATERQ    :   '>=';
AND         :   '&';
OR          :   '|';
ASSIGN      :   ':=';


//Lexical rules

Identifier
    :   letter (letter | digit | '_')*
    ;

fragment
Letter
    :   ('A'..'Z')
    |   ('a'..'z')
    ;
fragment
Digit
    :   ('0'..'9')
    ;
fragment
Digits
    :   ('0'..'9')+
    ;

IntergerLiteral
    :   0 | natural_number digit*
    ;

fragment
NatrualNumber
    :   ('1'..'9')
    ;

FixedPointLiteral
    :   (IntergerLiteral '.' digit?digit?digit)
    ;




// Paser


