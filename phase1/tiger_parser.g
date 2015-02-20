parser grammar Tiger;

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

expr
    :   const
    |   value
    |   expr binary_operator expr
    |   LPAREN expr RPAREN
    ;

const
    :   IntegerLiteral
    |   FixedPointLiteral
    ;

/* arithmetic, comparative and logical and & and or | operators*/
binary_operator
    :   PLUS
    |   MINUS
    |   MULT
    |   DIV
    |   EQ
    |   NEQ
    |   LESSER
    |   LESSEREQ
    |   GREATER
    |   GREATEREQ
    |   AND
    |   OR
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
