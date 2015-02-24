grammar Tiger;

options {
    k = 1;
    language = Java;
}


program
    :	type_declaration_list funct_declaration_list main_function
    ;

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
LBRACK      :   '[';
RBRACK      :   ']';
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
fragment
NaturalNumber
    :    ('1'..'9')
    ;

Identifier
    :   Letter (Letter | Digit | '_')*
    ;
    
IntegerLiteral
    :   '0' | NaturalNumber Digit*
    ;

FixedPointLiteral
    :   (IntegerLiteral '.' Digit | Digit Digit | Digit Digit Digit)
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

WS  
    :  (' '|'\r'|'\t'|'\u000C'|'\n')+ {$channel=HIDDEN;}
    ;

funct_declaration_list
    : type_id funct_declaration_tail funct_declaration_list
    | VOID (funct_declaration_tail funct_declaration_list)?
    ;    
    
funct_declaration_tail
    :	FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI
    ;

main_function
    :   MAIN LPAREN RPAREN BEGIN block_list END SEMI
    ;

param_list
    :   (param param_list_tail)?
    ;

param_list_tail
    :   (COMMA param param_list_tail)?
    ;

param
    :   Identifier COLON type_id
    ;

block_list
    :   block block_tail
    ;

block_tail
    :   (block block_tail)?
    ;

/* The body of the function is sequence of clocks, each starts a new scope with
declarations local to that scope followed by sequence of statement. */
block
    :   BEGIN declaration_segment stat_seq END SEMI
    ;

declaration_segment
    :   type_declaration_list var_declaration_list
    ;

type_declaration_list
    :   (type_declaration type_declaration_list)?
    ;

var_declaration_list
    :   (var_declaration var_declaration_list)?
    ;

type_declaration
    : TYPE Identifier EQ type SEMI
    ;

type
    :   base_type
    |   ARRAY LBRACK IntegerLiteral RBRACK arr_brack OF base_type
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
    :   VAR id_list COLON type_id optional_init SEMI
    ;

id_list
    :   Identifier id_list_tail
    ;
    
id_list_tail
    :	(COMMA id_list)?
    ;
    

optional_init
    :   (ASSIGN constant)?
    ;

stat_seq
    : stat (stat_seq)?
    ;

stat
    :	if_else_expr
    |   WHILE expr DO stat_seq ENDDO SEMI
    |   FOR Identifier ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI
    |	Identifier (value_tail ASSIGN expr_or_list | LPAREN expr_list RPAREN) SEMI
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
    
if_else_expr
    :	IF expr THEN stat_seq else_expr ENDIF SEMI
    ;
    
else_expr    
    :	(ELSE stat_seq)?
    ;	

opt_prefix
    :   (value ASSIGN)?
    ;

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
    ;

addtion_expr
    :   (addition_operator expr_lev1 addtion_expr)?
    ;

comparative_expr
    :   (comparative_operator expr_lev2 comparative_expr)?
    ;

logic_expr
    :   (and_or_operator expr_lev3 logic_expr)?
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

// 5th level
and_or_operator
    :   AND
    |   OR
    ;

binary_operator
    :   addition_operator
    |   mult_operator
    |   comparative_operator
    |   and_or_operator
    ;

expr_list
    :   (expr expr_list_tail)?
    ;

expr_list_tail
    :   (COMMA expr expr_list_tail)?
    ;

value
    :   Identifier value_tail
    ;

value_tail
    :   (LBRACK index_expr RBRACK value_tail_tail)?
    ;
    
value_tail_tail
    :	(LBRACK index_expr RBRACK)?
    ;

index_expr
    :	index_expr_lev1 index_add_expr
    ;
    
index_expr_lev1
    :	primary_index_expr index_mult_expr
    ;       

primary_index_expr
    :	IntegerLiteral
    |  	Identifier
    ;

index_mult_expr
    :	(index_mult_opr primary_index_expr index_mult_expr)?
    ;
    
index_mult_opr
    :	MULT
    ;
    
index_add_expr
    :	(index_add_opr index_expr_lev1 index_add_expr)?
    ;
    
index_add_opr
    :	PLUS
    |   MINUS
    ;
