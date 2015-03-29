grammar Tiger;

options {
    k = 1;
    language = Java;
    output = AST;
}

tokens {
	BLOCK;
	TYPE_DECL_LIST;
	VAR_DECL_LIST;
	STAT_SEQ;
	VAR_DECL;
	TYPE_DECL;
	FOR_EXPR;
	W_CONDITION;
	RET_TYPE;
	PARAM_LIST;
	FUNCTION_LIST;
	IF_ELSE_EXPR;
	FUNCT_ARGUMENT_LIST;
	ASSIGN_STMT;
	INDEX1;
	INDEX2;
}

@members {
public int hasError = 0;
public void printTokenType() {
		int size_token = input.size();
		for (int i = 0; i < size_token; i++) {
			int temp = input.get(i).getType();
			if (temp < 0) {
				temp = 1;
			}
			if (temp != 70) {
				String nameOfToken = tokenNames[temp];
				System.out.print(nameOfToken + " ");
			}
		}
	}
		    public void displayRecognitionError(String[] tokenNames,
		                                        RecognitionException e) {
		        hasError = 1;
		        String hdr = getErrorHeader(e);
		        String[] input = e.input.toString().split("\n");
		        String[] errmsg = hdr.split(":");
		        String msg = getErrorMessage(e, tokenNames);
		        String temp = "";
		        String temp2 = "";
		        int i = errmsg[0].length() - 1;
		        int j = 0;
		        while ((errmsg[0].substring(i, i + 1).equals("0"))
		        		|| (errmsg[0].substring(i, i + 1).equals("1"))
		        		|| (errmsg[0].substring(i, i + 1).equals("2"))
		        		|| (errmsg[0].substring(i, i + 1).equals("3"))
		        		|| (errmsg[0].substring(i, i + 1).equals("4"))
		        		|| (errmsg[0].substring(i, i + 1).equals("5"))
		        		|| (errmsg[0].substring(i, i + 1).equals("6"))
		        		|| (errmsg[0].substring(i, i + 1).equals("7"))
		        		|| (errmsg[0].substring(i, i + 1).equals("8"))
		        		|| (errmsg[0].substring(i, i + 1).equals("9"))) {
		        	temp = errmsg[0].substring(i, i + 1) + temp;
		        	i--;
		        }
		        while (j < errmsg[1].length() && (errmsg[1].substring(j, j + 1).equals("0")
		        				||errmsg[1].substring(j, j + 1).equals("0")
		        				||errmsg[1].substring(j, j + 1).equals("1")
		        				||errmsg[1].substring(j, j + 1).equals("2")
		        				||errmsg[1].substring(j, j + 1).equals("3")
								||errmsg[1].substring(j, j + 1).equals("4")
								||errmsg[1].substring(j, j + 1).equals("5")
								||errmsg[1].substring(j, j + 1).equals("6")
								||errmsg[1].substring(j, j + 1).equals("7")
								||errmsg[1].substring(j, j + 1).equals("8")
								||errmsg[1].substring(j, j + 1).equals("9"))) {
		        	temp2 = temp2 + errmsg[1].substring(j, j + 1);
		        	j++;
		        }
		        int linenum = Integer.parseInt(temp);
		        int num = Integer.parseInt(temp2);
		        String line;
		        String finalmessage;
		        boolean lastline = true;
		        for (int k = 0; k < num; k++) {
		        	if (input[linenum - 1].substring(k, k + 1)!= null && !(input[linenum - 1].substring(k, k + 1).equals(" ")) && !(input[linenum - 1].substring(k, k + 1).equals("\t"))) {
		        		lastline = false;
		        	}
		        }
		        if (num == 0 || lastline) {
		        	line = input[linenum - 2];
		        	finalmessage = line;
		        } else {
		            line = input[linenum - 1];
		            finalmessage = line.substring(0, num);
		        }
		        
		        System.out.println(hdr + " " + msg + ". prefix of error : " + finalmessage);
		    }
}

program
    :	type_declaration_list funct_list main_function
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
    :   IntegerLiteral '.' Digit (Digit (Digit)?)?
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
funct_list
	: funct_declaration_list -> ^(FUNCTION_LIST funct_declaration_list?)
	;
	
funct_declaration_list
    : funct_declaration funct_declaration_list
    | VOID! (funct_declaration_tail funct_declaration_list)?
    ;    

funct_ret_type
	:	alltype -> ^(RET_TYPE alltype)
	;

alltype
	:	Identifier | INT | FIXEDPT
	;
funct_declaration_tail
    :	FUNCTION Identifier LPAREN! param_list RPAREN! BEGIN! block_list END! SEMI!
    ;

funct_declaration
	:	funct_ret_type FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI
		-> ^(Identifier funct_ret_type param_list? block_list)
	;
	
main_function
    :   MAIN^ LPAREN! RPAREN! BEGIN! block_list END! SEMI!
    ;

param_list
    :   (param (COMMA param)*)? -> ^(PARAM_LIST param*)
    ;

param
    :   Identifier COLON^ type_id
    ;

block_list
    :   block+
    ;
    
/* The body of the function is sequence of clocks, each starts a new scope with
declarations local to that scope followed by sequence of statement. */
block
    :   BEGIN type_declaration_list var_declaration_list stat_seq END SEMI
    	-> ^(BLOCK type_declaration_list var_declaration_list stat_seq)
    ;

type_declaration_list
    :   type_declaration* -> ^(TYPE_DECL_LIST type_declaration*)
    ;
    
var_declaration_list
    :   var_declaration* -> ^(VAR_DECL_LIST var_declaration*)
    ;
    
type_declaration
    : TYPE Identifier EQ type SEMI -> ^(TYPE_DECL Identifier EQ type)
    ;

type
    :   base_type
    |   ARRAY^ LBRACK! IntegerLiteral RBRACK! arr_brack OF base_type
    ;

arr_brack
    :	(LBRACK! IntegerLiteral RBRACK!)?
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
    :   id_list COLON type_id optional_init SEMI -> ^(VAR_DECL id_list type_id optional_init?)
    ;

id_list
    :   VAR Identifier (COMMA Identifier)* -> ^(VAR Identifier+)
    ;

optional_init
    :   (ASSIGN^ constant)?
    ;

stat_seq
    : stat+ -> ^(STAT_SEQ stat+)
    ;

stat
    :	if_else_expr
    |   WHILE^ while_condition DO! stat_seq ENDDO! SEMI!
    |   FOR^ for_expr DO! stat_seq ENDDO! SEMI!
    |	Identifier^ (assign_stmt | argument_list) SEMI!
    |   BREAK SEMI!
    |   RETURN^ expr SEMI!
    |   block
    ;

argument_list
	: LPAREN expr_list RPAREN -> ^(FUNCT_ARGUMENT_LIST expr_list?)
	;
	
assign_stmt
	: value_tail assign_stmt_tail -> ^(ASSIGN_STMT value_tail? assign_stmt_tail)
	;

assign_stmt_tail
	: ASSIGN expr_or_list
	;

for_expr
    	:	   Identifier ASSIGN index_expr TO index_expr
    		   -> ^(Identifier index_expr TO index_expr)
    	;
    	
while_condition
	: expr -> ^(W_CONDITION expr)
	;
	
expr_or_list
    : constant expr_tail1 ((AND^ | OR^) expr_lev3)*
    | Identifier (value_tail expr_tail1 ((AND^ | OR^) expr_lev3)* | argument_list)
    | LPAREN expr RPAREN expr_tail1 ((AND^ | OR^) expr_lev3)*
    ;
	
expr_tail1
	: expr_tail2 ((EQ^|NEQ^|LESSER^|LESSEREQ^|GREATER^|GREATEREQ^) expr_lev2)*
	;
	
expr_tail2
	: expr_tail3 ((PLUS^|MINUS^) expr_lev1)*
	;

expr_tail3
	: ((MULT^|DIV^) primary_expression)*
	;
    
if_else_expr
    :	if_stat then_stat else_expr ENDIF SEMI-> ^(IF_ELSE_EXPR if_stat then_stat else_expr?)
    ;
    
if_stat
	: IF^ expr
	;
	
then_stat
	: THEN^ stat_seq
	;
	
else_expr    
    :	(ELSE^ stat_seq)?
    ;	

opt_prefix
    :   (value ASSIGN)?
    ;

expr
    :   expr_lev3 ((AND^ | OR^) expr_lev3)*
    ;

expr_lev3
    :   expr_lev2 ((EQ^|NEQ^|LESSER^|LESSEREQ^|GREATER^|GREATEREQ^) expr_lev2)*
    ;

expr_lev2
    :   expr_lev1 ((PLUS^|MINUS^) expr_lev1)*
    ;

expr_lev1
    :   primary_expression ((MULT^|DIV^) primary_expression)*
    ;

primary_expression
    :   constant
    |   value
    |   LPAREN! expr RPAREN!
    ;

mult_expr
    :   ((MULT^|DIV^) primary_expression mult_expr)?
    ;

addtion_expr
    :   ((PLUS^|MINUS^) expr_lev1 addtion_expr)?
    ;

comparative_expr
    :   ((EQ^|NEQ^|LESSER^|LESSEREQ^|GREATER^|GREATEREQ^) expr_lev2 comparative_expr)?
    ;

logic_expr
    :   ((AND^ | OR^) expr_lev3 logic_expr)?
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
    :   LPAREN!
    |   RPAREN!
    ;

// 2nd level
mult_operator
    :   MULT^
    |   DIV^
    ;

// 3rd level
addition_operator
    :   PLUS^
    |   MINUS^
    ;

// 4th level
comparative_operator
    :   EQ^
    |   NEQ^
    |   LESSER^
    |   LESSEREQ^
    |   GREATER^
    |   GREATEREQ^
    ;

// 5th level
and_or_operator
    :   AND^
    |   OR^
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
    :   (LBRACK index_expr RBRACK value_tail_tail)? -> ^(INDEX1 index_expr value_tail_tail?)?
    ;
    
value_tail_tail
    :	(LBRACK index_expr RBRACK)? -> ^(INDEX2 index_expr)?
    ;

index_expr
    :	index_expr_lev1 ((PLUS^ | MINUS^) index_expr_lev1)*
    ;
    
index_expr_lev1
    :	primary_index_expr (MULT^ primary_index_expr)*
    ;       

primary_index_expr
    :	IntegerLiteral
    |  	Identifier
    ;

index_mult_expr
    :	(MULT^ primary_index_expr index_mult_expr)?
    ;
    
index_mult_opr
    :	MULT
    ;
    
index_add_expr
    :	((PLUS^ | MINUS^) index_expr_lev1 index_add_expr)?
    ;
    
index_add_opr
    :	PLUS
    |   MINUS
    ;
