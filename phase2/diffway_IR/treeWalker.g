tree grammar treeWalker;

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

@header {
    import java.util.*;

} 

@members {

    private SymbolTable st;
    private List<String> reserved;
    private List<String> ir_code;
	private FileWriter ir_file;
	private static final IR_FILE = "ir_code.txt";
    private Map<String, String> temp;
    private int t_idx = 0;
    private int l_idx = 0;
    private 
    private IRGenerator irg; //can return an IRs (Array)List, which contains the sequence of the emitted ir
   // private 

    public treeWalker(SymbolTable st, TreeNodeStream nodes) {
        this.st = st;
        irg = new IRGenerator(st);

        temp = new HashMap<String, String>();
		
		/* reserved space to create a file that contains what every we have for the ir list
		try{
			ir_file = new FileWriter(IR_FILE);
			
		} catch (IOException e) {
			System.out.println("Cannot generate the IR file");
		}
		*/

		ir_code = new ArrayList<String>();
        
		reserved = new ArrayList<String>();
		
        this(nodes); // need to take a look what this it for

        reserved = new ArrayList<String>();
        reserved.add();
        reserved.add();

        //... add all reserved oprations

    }

    public List<String> getIRList() {
       // return irg.getIRList();

        return ir_code;
    }

    public  String getNewTemp() {
		String tar = "t" + Integer.toString(t_idx);
		t_idx++;
		return tar;
	}

    public  String getNewLabel() {
		String label = "Label_" + Integer.toString(l_idx) + ": ";
		l_idx++;
		return tar;
	}


    public void emit(String toEmit) {
        ir_code.add(toEmit);
    }

    
}

program
    :	type_declaration_list funct_list main_function
        {
            //generate file to write to
        }
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
	: funct_declaration_list
	;
	
funct_declaration_list
    : funct_declaration funct_declaration_list
    | VOID (funct_declaration_tail funct_declaration_list)?
    ;    

funct_ret_type returns [String type]
	:	alltype {$type = $alltype.type;}
	;

alltype returns [String type]
	:	Identifier {$type = $Identifier.text;}| INT {$type = $INT.text;}| FIXEDPT {$type = $FIXEDPT.text;}
	;

funct_declaration_tail
    :	FUNCTION Identifier{irg.emitLabel($Identifier.text);}
        LPAREN param_list
                {
                    for(String param: $param_list.paramList) {
                        String type = st.lookup(param).getTypeName();
                        irg.emit_assign_stat(param, (st.lookup(param).getTypeName()== "IntegerLiteral")?"0":"0.0"); //initialize the params to 0 or 0.0 depends on the base type and emitted each params
                    }
                }
        RPAREN BEGIN block_list END SEMI
    ;

funct_declaration
	:	funct_ret_type
        {
            String ret_type = $funct_ret_type.type;
        }
        FUNCTION Identifier {irg.emitLabel($Identifier.text);/*emit lable id: */}
        LPAREN param_list
                {
                    for(String param: $param_list.paramList) {
                        String type = st.lookup(param).getTypeName();
                        irg.emit_assign_stat(param, (st.lookup(param).getTypeName()== "IntegerLiteral")?"0":"0.0"); //initialize the params to 0 or 0.0 depends on the base type and emitted each params
                    }
                }
        RPAREN BEGIN block_list END SEMI
	;
	
main_function
    :   MAIN {irg.emitLabel($MAIN.text);} LPAREN RPAREN BEGIN block_list END SEMI
    ;

param_list returns [List<String> paramList]
    :   {$paramList = new ArrayList<String>();}
        (param {$paramList.add(param.id);} (COMMA param {$paramList.add(param.id);})*)?
    ;

param returns [String id]
    :   Identifier {$id = $Identifier.text;} COLON type_id
    ;

block_list
    :   block+
    ;
    
/* The body of the function is sequence of clocks, each starts a new scope with
declarations local to that scope followed by sequence of statement. */
block
    :   BEGIN type_declaration_list var_declaration_list stat_seq END SEMI
    ;

type_declaration_list
    :   type_declaration*
    ;
    
var_declaration_list
    :   var_declaration*
    ;
    
type_declaration
    : TYPE Identifier EQ type SEMI
    ;

type
    :   base_type
    |   ARRAY LBRACK IntegerLiteral RBRACK arr_brack OF base_type
    ;

arr_brack
    :	(LBRACK! IntegerLiteral RBRACK!)?
    ;

type_id returns [Sting type]
    :   base_type {$type = $base_type.type;}
    |   Identifier {$type = $Identifier.text;}
    ;

base_type returns [String type]
    :   INT {$type = $INT.text;}
    |   FIXEDPT {$type = $FIXEDPT.text;}
    ;

var_declaration
    :   id_list COLON type_id optional_init
        {
            String val = $optional_init.val;
            if(val.equals("null")) { //need more code to verify the defined type
                val = ($type_id.type.equals("IntegerLiteral"))?"0":"0.0";
            }
            for(String id: $id_list.idList) {
                irg.emit_assign_stat(id, val);
            }
        }
        SEMI
    ;

id_list returns [List<String> idList]
    {
        $idList = new ArrayList<String>();
    }
    :   VAR Identifier {$idList.add($Identifier.text);} (COMMA Identifier{$idList.add($Identifier.text);})*
    ;

optional_init returns [String val]
    {
        String $val = "null";
    }  
    :   (ASSIGN^ constant{$val = $constant.val;})?
    ;

stat_seq
    : stat+
    ;

stat
    :	if_else_expr //if else
    |   WHILE while_condition DO stat_seq ENDDO SEMI //while loop
    |   FOR for_expr DO! stat_seq ENDDO SEMI //for
    |	Identifier (assign_stmt | argument_list) SEMI //func_call
    |   BREAK SEMI //break
    |   RETURN expr SEMI //return
    |   block
    ;










argument_list
	: LPAREN expr_list RPAREN
	;
	
assign_stmt
	: value_tail assign_stmt_tail
	;

assign_stmt_tail
	: ASSIGN expr_or_list
	;

for_expr
    	:	   Identifier ASSIGN index_expr TO index_expr
    	;
    	
while_condition
	: expr
	;
	
expr_or_list
    : constant expr_tail1 ((AND | OR) expr_lev3)*
    | Identifier (value_tail expr_tail1 ((AND | OR) expr_lev3)* | argument_list)
    | LPAREN expr RPAREN expr_tail1 ((AND | OR) expr_lev3)*
    ;
	
expr_tail1
	: expr_tail2 ((EQ|NEQ|LESSER|LESSEREQ|GREATER|GREATEREQ) expr_lev2)*
	;
	
expr_tail2
	: expr_tail3 ((PLUS|MINUS) expr_lev1)*
	;

expr_tail3
	: ((MULT|DIV) primary_expression)*
	;
    
if_else_expr
    :	if_stat then_stat else_expr ENDIF SEMI
    ;
    
if_stat returns [String label]
	: IF expr
	;
	
then_stat returns [String label]
	: THEN stat_seq
	;
	
else_expr    
    :	(ELSE stat_seq)?
    ;	

opt_prefix
    :   (value ASSIGN)?
    ;

expr returns [String val, String label]
    {
        String op;
        //E : generate label
        //r = new temp
    }
    :   expr_lev3 {
            $val = $expr_lev3.val; $label = $expr_lev3.label;
        }
        ((AND {op = $AND.text;} | OR{$op = $OR.text;})
            expr_lev3
            {
                if (op.equals($AND.text)) {
                    
                } else {
                    
                    //temp = generate
                }
            }
        
        )*
    ;

expr_lev3 returns [String val, String label] // val is either value or label of branch
    {
        String op;
        label = "null";
    }
    :   expr_lev2 {$val = $expr_lev2.val;}
        ((EQ {op = $EQ.text;}|NEQ{op = $NEQ.text;}|LESSER{op = $LESSER.text;}|LESSEREQ{op = $LESSEREQ.text;}|GREATER{op = $GREATER.text;}|GREATEREQ{op = $GREATEREQ.text;})

            expr_lev2
            {
                $label = irg.emit_branch(op, $val, expr_lev2);
              //  isBool = true;
            }

        )*
    ;

expr_lev2 returns [String val]
    {
        String op;
    }
    :   expr_lev1 {$val = $expr_lev1.val}
        ((PLUS {op = $PLUS.text;}|MINUS {op = $MINUS.text;})
            expr_lev1
            {
                $val = irg.emit_binary_op(op, $val, $expr_lev1.val);
            }
        )*
    ;

expr_lev1 returns [String val]
    {
        String op;
    }
    :   primary_expression {$val = primary_expression.val;}
        ((MULT {op = $MULT.text;}|DIV {op = $DIT.text;})
            primary_expression {
                if (op.equals($MULT.text)) {
                    $val = irg.emit_mult($val, $primary_expression.val);
                } else {
                    $val = irg.emit_div($val, $primary_expression.val);
                }
                })*
    ;

primary_expression returns [String val]
    :   constant {$id = $constant.val;}
    |   value {$id = $value.val;}
    |   LPAREN expr{$id = $expr.val} RPAREN
    ;

mult_expr
    :   ((MULT|DIV) primary_expression mult_expr)?
    ;

addtion_expr
    :   ((PLUS|MINUS) expr_lev1 addtion_expr)?
    ;

comparative_expr
    :   ((EQ^|NEQ^|LESSER^|LESSEREQ^|GREATER^|GREATEREQ^) expr_lev2 comparative_expr)?
    ;

logic_expr
    :   ((AND^ | OR^) expr_lev3 logic_expr)?
    ;

constant returns [String val]
    :   IntegerLiteral {$val = IntegerLiteral.text;}
    |   FixedPointLiteral {$val = FixedPointLiteral.text;}
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

value returns {String val}
    :   Identifier {$ val = $Identifier.text;} value_tail
        {
            if(!$value_tail.offset.equals("null")) {
                $val = irg.emit_array_load("null", $val, Integer.parseInt($value_tail.offset));
            }
        }
    ;

value_tail returns [String offset]
    {
       offset = "null";
    }
    :   (LBRACK index_expr{$offset = index_expr.val} RBRACK
            value_tail_tail {
            //need symbol table to get the size
            String size = st.;
            $offset = emit_mult($offset, size);
            $offset = emit_add($offset ,$value_tail_tail);
        })?
    ;
    
value_tail_tail returns[String idx]
    :	(LBRACK index_expr{$idx = val;} RBRACK)?
    ;

index_expr returns [String val]
    {
        String op;
    }
    :	index_expr_lev1 {$val = index_expr_lev1.val;}
        ((PLUS^ {op = $PLUS.text;} | MINUS^ {op = $MINUS.text;} )
            index_expr_lev1 
        {
            if(op.equals($PLUS.text))
                $val = irg.emit_add($val, $index_expr_lev1.val);
            else
                $val = irg.emit_sub($val, $index_expr_lev1.val);
                
        } 
        )*
          
    ;
    
index_expr_lev1 returns [String val]
    :	primary_index_expr{$val = $primary_index_expr.val;}
        (MULT^ primary_index_expr
            {
                $val = irg.emit_mult($val, $primary_index_expr.val);
            })*
    ;       

primary_index_expr returns[String val]
    :	IntegerLiteral {$val = $IntegerLiteral.text;}
    |  	Identifier
        {
           // if()
            $val = $Identifier.text;
        }
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
