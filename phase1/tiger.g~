grammar Tiger;

options {
    language = Java;
}

tokens {

}

@header {

}




program
    :   tiger_program
    ;




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

IntegerLiteral
    :   0 | natural_number digit*
    ;

fragment
NatrualNumber
    :   ('1'..'9')
    ;

FixedPointLiteral
    :   (IntergerLiteral '.' digit | digit digit | digit digit digit)
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
RPAREN      :   ')';
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
GREATEREQ    :   '>=';
AND         :   '&';
OR          :   '|';
ASSIGN      :   ':=';




//parser
tiger_program
    :   type_declaration_list funct_declaration_list main_function
    ;

funct_declaration_list
    :   funct_declaration funct_declaration_list
    |
    ;

funct_declaration
//    :   ret_type FUNCTION Identifier '(' param_list ')' BEGIN block_list END ';'
    :   ret_type FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI
    ;

/* main is mandatory in every program, no parameters, no return value. */
main_function
//    :   VOID MAIN '(' ')' BEGIN block_list END ';'
    :   VOID MAIN LPAREN RPAREN BEGIN block_list END SEMI
    ;

ret_type
    :   VOID
    |   type_id
    ;

param_list
    :   param param_list_tail
    |
    ;

param_list_tail
    :   COMMA param param_list_tail
    |
    ;

param
//    :   Identifier ':' type_id
    :   Identifier COLON type_id
    ;

block_list
    :   block block_tail
    ;

block_tail
    :   block block_tail
    |
    ;

/* The body of the function is sequence of clocks, each starts a new scope with
declarations local to that scope followed by sequence of statement. */
block
//    :   BEGIN declaration_segment stat_seq END ';'
    :   BEGIN declaration_segment stat_seq END SEMI
    ;

declaration_segment
    :   type_declaration_list var_declaration_list
    ;

type_declaration_list
    :   type_declaration type_declaration_list
    |
    ;

var_declaration_list
    :   var_declaration var_declaration_list
    |
    ;

type_declaration
//    :   type Idemtifier '=' type ';'
    :   type Idemtifier EQ type SEMI
    ;

type
    :   base_type
    |   array '[' IntegerLiteral ']' OF base_type
    |   array '[' IntegerLiteral ']' '[' IntegerLiteral ']' OF base_type
    ;

type_id
    :   base_type
    |   Identifier
    ;

base_type
    :   INT
    |   FIXEDPT
    ;

var_declaration
//    :   var Identifier ':' type_id optional_init ';'
    :   var Identifier COLON type_id optional_init SEMI
    ;

id_list
    :   Identifier
//    |   Identifier ',' id_list
    |   Identifier COMMA id_list
    ;

optional_init
    :   ASSIGN const
    |
    ;

stat_seq
    :   stat
    |   stat stat_seq
    ;

stat
    :   value ASSIGN expr SEMI
    |   IF expr THEN stat_seq ENDIF
    |   IF expr THEN stat_seq ELSE stat_seq ENDIF SEMI
    |   WHILE expr DO stat_seq ENDDO
    |   FOR Identifier ASSIGN index_expr TO index_expr DO stat_seq ENDDO
    |   opt_prefix Identifier LPAREN expr_list RPAREN SEMI
    |   BREAK SEMI
    |   RETURN expr SEMI
    |   block
    ;

opt_prefix
    :   value ASSIGN
    |   
    ;
/*
expr
    :   const
    |   value
    |   expr binary_operator expr
    |   LPAREN expr RPAREN
    ;
*/

expr
    :   expr_lev3 logic_expr 
    ;

expr_lev3
    :   expr_lev2 comparative_expr
    ;

expr_lev2
    :   expr_lev1 addtion_expr
    ;

expr_lev1
    :   primary_expression mult_expr
    ;

primary_expression
    :   const
    |   value
    |   LPAREN expr RPAREN
    ;

mult_expr
    :   mult_operator primary_expression mult_expr
    |
    ;

addtion_expr
    :   addition_operator expr_lev1 addtion_expr
    |
    ;

comparative_expr
    :   comparative_operator expr_lev2 comparative_expr
    |
    ;

logic_expr
    :   and_or_operator expr_lev3 logic expr




const
    :   IntegerLiteral
    |   FixedPointLiteral
    ;


/* arithmetic, comparative and logical and & and or | operators*/

logical_operator
    :   paren_operator
    |   and_or_operator
    ;

// 1st level
paren_operator
    :   LPAREN
    |   RPAREN
    ;

// 5th level
and_or_operator
    :   AND
    |   OR
    ;


arithmetic_operator
    :   mult_operator
    |   addition_operator
    ;

// 2nd level
mult_operator
    :   MULT
    |   DIV
    ;

// 3rd level
addition_operator
    :   PLUS
    |   MINUS
    ;

// 4th level
comparative_operator
    :   EQ
    |   NEQ
    |   LESSER
    |   LESSEREQ
    |   GREATER
    |   GREATEREQ
    ;


binary_operator
    :   addition_operator
    |   mult_operator
    |   comparative_operator
    |   and_or_operator
    ;



expr_list
    :   expr expr_list_tail
    |
    ;

expr_list_tail
    :   COMMA expr expr_list_tail
    |   
    ;

value
    :   Identifier value_tail
    ;

value_tail
    :   '[' index_expr']'
    |   '[' index_expr']' '[' index-expr ']'
    |
    ;

index_expr
    :   IntegerLiteral
    |   Identifier
    |   index_expr index_oper index_expr
    ;

/* +. and * are the only ones allowed in index expressions*/
index_oper
    :   PLUS
    |   MINUS
    |   MULT
    ;
