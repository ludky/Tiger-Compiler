grammar tiger;


options {
    k = 1;
    language = Java;
  //  output = AST;
}



program
 //   :   tiger_program
    :	type_declaration_list funct_declaration_list main_function
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

//Lexical rules

Identifier
    :   Letter (Letter | Digit | '_')*
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

NaturalNumber
    :    ('1'..'9')
    ;

IntegerLiteral
    :   '0' | NaturalNumber Digit*
    ;

fragment
NatrualNumber
    :   ('1'..'9')
    ;

FixedPointLiteral
    :   (IntegerLiteral '.' Digit | Digit Digit | Digit Digit Digit)
    ;


Comment
    :   '/*' ( options {greedy=false;} : . )* '*/'
    ;


//parser
/*
tiger_program
    :   type_declaration_list funct_declaration_list main_function
    ;
*/


/*
funct_declaration_list
    :   funct_declaration funct_declaration_list
    |
    ;

funct_declaration
//    :   ret_type FUNCTION Identifier '(' param_list ')' BEGIN block_list END ';'
    :	ret_type FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI	

    ;
ret_type
    :	VOID
    |	type_id
    ;

*/




funct_declaration_list
    : type_id funct_declaration_tail funct_declaration_list
    | VOID (funct_declaration_tail funct_declaration_list)?
    ;    
    
funct_declaration_tail
    :	FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI
    ;


    
/* main is mandatory in every program, no parameters, no return value. */




main_function
//    :   VOID MAIN '(' ')' BEGIN block_list END ';'
    :   VOID MAIN LPAREN RPAREN BEGIN block_list END SEMI
    ;


/*
ret_type
    :   VOID
    |   type_id
    ;
*/

param_list
    :   (param param_list_tail)?
//    |
    ;

param_list_tail
    :   (COMMA param param_list_tail)?
//    |
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
    :   (type_declaration type_declaration_list)?
//    |
    ;

var_declaration_list
    :   (var_declaration var_declaration_list)?
//    |
    ;

type_declaration
//    :   type Idemtifier '=' type ';'
//    :   type Identifier EQ type SEMI
    : TYPE Identifier EQ type SEMI
    ;

type
    :   base_type
    |   ARRAY LBRACK IntegerLiteral RBRACK arr_brack OF base_type
//    |   ARRAY LBRACK IntegerLiteral RBRACK LBRACK IntegerLiteral RBRACK OF base_type
    ;

arr_brack
    :	(LBRACK IntegerLiteral RBRACK)?
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
    :   VAR id_list COLON type_id optional_init SEMI
    ;

id_list
    :   Identifier id_list_tail
//    |   Identifier ',' id_list
 //   |   Identifier COMMA id_list
    ;
    
id_list_tail
    :	(COMMA id_list)?
//    |
    ;
    

optional_init
    :   (ASSIGN constant)?
//    |
    ;

stat_seq
//    :   stat
//    |   stat stat_seq
    : stat stat_seq
    ;




stat
    :	if_else_expr ENDIF SEMI
    |   WHILE expr DO stat_seq ENDDO SEMI
    |   FOR Identifier ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI
  //  |	Identifier ((value_tail ASSIGN expr_or_list) | LPAREN expr_list RPAREN) SEMI
    |   BREAK SEMI
    |   RETURN expr SEMI
    |   block
    ;

      
expr_or_list
    : constant expr_tail
    | Identifier (value_tail expr_tail | LPAREN expr_list RPAREN)
    | LPAREN expr RPAREN expr_tail
    ;
    
expr_tail
	: mult_expr addtion_expr comparative_expr logic_expr
	;

/*
stat
    :	Identifier value_or_expr SEMI
    |	if_else_expr ENDIF SEMI
    |   WHILE expr DO stat_seq ENDDO SEMI
    |   FOR Identifier ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI
    |   BREAK SEMI
    |   RETURN expr SEMI
    |   block
    ;


value_or_expr
    :	value_tail ASSIGN expr_or_list
    |	LPAREN expr_list RPAREN
    ;

      
expr_or_list
    : primary_expr expr_tail
    | Identifier (value_tail value_expr_tail | LPAREN expr_list RPAREN)
    ;

expr_tail
    :	primary_expr mult_expr expr addtion_expr expr comparative_expr expr logic_expr expr
    ;

primary_expr
    :	LPAREN expr RPAREN
    |	constant
    ;

value_expr_tail
    :	primary_value_expr mult_expr expr addtion_expr expr comparative_expr expr logic_expr expr
    ;
    
primary_value_expr
    :	value_tail
    ;

*/

    
if_else_expr
    :	IF expr THEN stat_seq else_expr ENDIF SEMI
    ;
    
else_expr    
    :	(ELSE stat_seq)?
//    |
    ;	


opt_prefix
    :   (value ASSIGN)?
//    |
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
    :   constant
    |   value
    |   LPAREN expr RPAREN
    ;

mult_expr
    :   (mult_operator primary_expression mult_expr)?
//    |
    ;

addtion_expr
    :   (addition_operator expr_lev1 addtion_expr)?
//    |
    ;

comparative_expr
    :   (comparative_operator expr_lev2 comparative_expr)?
//    |
    ;

logic_expr
    :   and_or_operator expr_lev3 logic_expr
    ;


constant
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
    :   (expr expr_list_tail)?
//    |
    ;

expr_list_tail
    :   (COMMA expr expr_list_tail)?
//    |   
    ;




value
    :   Identifier value_tail
    ;

value_tail
    :   ('[' index_expr']' value_tail_tail)?
//    |
    ;
    
value_tail_tail
    :	('[' index_expr ']')?
//    |
    ;

/*
index_expr
    :   IntegerLiteral
    |   Identifier
    |   index_expr index_oper index_expr
    ;
*/



index_expr
    :	index_expr2 index_expr_add
    ;
    
index_expr2
    :	primary_index_expr index_expr_mult
    ;       


primary_index_expr
    :	IntegerLiteral
    |  	Identifier
    ;

index_expr_mult
    :	index_mult primary_index_expr index_expr_mult
    ;
    
index_mult
    :	MULT
    ;
    
index_expr_add
    :	index_add index_expr2 index_expr_add
    ;
    
index_add
    :	PLUS
    |   MINUS
    ;


/* +. and * are the only ones allowed in index expressions*/
/*
index_oper
    :   index_add
    |   index_mult
    ;
    */




