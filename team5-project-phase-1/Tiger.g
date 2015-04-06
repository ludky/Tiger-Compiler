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
public static SymbolTable st = new SymbolTable();
protected int hasError = 0;
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
		        	if (input[linenum - 1].substring(k, k + 1)!= null 
		        	&& !(input[linenum - 1].substring(k, k + 1).equals(" ")) 
		        	&& !(input[linenum - 1].substring(k, k + 1).equals("\t"))) {
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
    :	
    {
    	st.initializeScope();
    }
    type_declaration_list funct_list main_function
    {
    	st.finalizeScope();
    	System.out.println(st.toString());
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
	: funct_declaration_list -> ^(FUNCTION_LIST funct_declaration_list?)
	;
	
funct_declaration_list
    : funct_declaration funct_declaration_list
    | VOID! (funct_declaration_tail funct_declaration_list)?
    ;    

funct_ret_type returns [String retType]
	:	(alltype {$retType = $alltype.retType;}) -> ^(RET_TYPE alltype)
	;

alltype returns [String retType]
	:	Identifier {$retType = $Identifier.text;}| INT {$retType = "int";}| FIXEDPT {$retType = "fixedpt";}
	;
//only void comes here, check NO return
funct_declaration_tail
    :	FUNCTION Identifier LPAREN! param_list RPAREN!
    {
    	Type rt = new Type("void");
    	if (st.lookupCurrentScope($Identifier.text) == null) {
    		st.insert($Identifier.text, new Function(rt, $param_list.pl));
    	} else {
    		throw new IllegalArgumentException("Function name has already been defined.");
    	}
    }
    BEGIN!
    {
		st.initializeScope();
	    for (Type t : $param_list.pl) {
	    	if (st.lookupCurrentScope(t.getIdentifier()) == null) {
	    		st.insert(t.getIdentifier(), t);
	    	} else {
	    		throw new IllegalArgumentException("Parameter name has already been defined.");
	    	}
	    }
	}
    	block_list
    	//forc to do not contain return in block
    	//ELSE throw error
    END!
    {
    	st.finalizeScope();
    }
    SEMI!
    ;

funct_declaration
	:	funct_ret_type FUNCTION Identifier LPAREN param_list RPAREN
	{
		Type rt = null; //
	    if ($funct_ret_type.retType.equals("int") ||
	    	$funct_ret_type.retType.equals("fixedpt")) {
	        rt = new Type($funct_ret_type.retType);
	    } else {
            if (st.lookup($funct_ret_type.retType) != null) {
            	if (st.lookup($funct_ret_type.retType).getTypeName().equals("definedtype")) {
            		rt = st.lookup($funct_ret_type.retType);
            	} else {
            		throw new IllegalArgumentException("Illegal function return type.");
            	}
            } else {
                throw new IllegalArgumentException("Illegal function return type.");
            }
	    }
	    if (st.lookupCurrentScope($Identifier.text) == null) {
	   		st.insert($Identifier.text, new Function(rt, $param_list.pl));
	   	} else {
	   		throw new IllegalArgumentException("Function name has already been defined.");
	   	}
	} 
	BEGIN 
	{
		st.initializeScope();
	    for (Type t : $param_list.pl) {
	    	if (st.lookupCurrentScope(t.getIdentifier()) == null) {
	    		st.insert(t.getIdentifier(), t);
	    	} else {
	    		throw new IllegalArgumentException("Parameter name has already been defined.");
	    	}
	    }
	}
	block_list END {st.finalizeScope();} SEMI
	-> ^(Identifier funct_ret_type param_list? block_list)
	;
	
main_function
    :   MAIN^ LPAREN! RPAREN! BEGIN! block_list END! SEMI!
    ;

param_list returns [ArrayList<Type> pl]
    :   
    {$pl = new ArrayList<Type>();}
    (pr1 = param {$pl.add($pr1.paramType);}(COMMA pr2 = param {$pl.add($pr2.paramType);})*)? -> ^(PARAM_LIST param*)
    ;

param returns [Type paramType]
    :   Identifier COLON^ type_id
    {
    	if (!($type_id.txt.equals("int")) && !($type_id.txt.equals("fixedpt"))) {
    		if (st.lookup($type_id.txt) != null) {
    			if (st.lookup($type_id.txt).getTypeName().equals("definedtype")) {
    				$paramType = st.lookup($type_id.txt);
    			} else {
    				throw new IllegalArgumentException("Illegal parameter type.");
    			}
    		} else {
    			throw new IllegalArgumentException("Illegal parameter type.");
    		}
    	} else {
    		$paramType = new Type($type_id.txt);
    	}
    	$paramType.setIdentifier($Identifier.text);
    	$paramType.setIsVar(true);
    }
    ;

block_list
    :   block+
    ;
    
/* The body of the function is sequence of clocks, each starts a new scope with
declarations local to that scope followed by sequence of statement. */
block
    :   BEGIN {st.initializeScope();} type_declaration_list var_declaration_list stat_seq END {st.finalizeScope();}SEMI
    	-> ^(BLOCK type_declaration_list var_declaration_list stat_seq)
    ;

type_declaration_list
    :   type_declaration* -> ^(TYPE_DECL_LIST type_declaration*)
    ;
    
var_declaration_list
    :   var_declaration* -> ^(VAR_DECL_LIST var_declaration*)
    ;
    
type_declaration
    : TYPE Identifier EQ type SEMI
    {
    	if (st.lookupCurrentScope($Identifier.text) == null) {
    		Type dt = null;
    		if ($type.isBase == 1) {
    			if ($type.txt.equals("int")) {
    				dt = new DefinedType(new Type("int"));
    			} else {
    				dt = new DefinedType(new Type("fixedpt"));
    			}
    		} else {
    			Type bt = null;
    			if ($type.txt.equals("int")) {
    				bt = new Type("int");
    			} else {
    				bt = new Type("fixedpt");
    			}
    			if ($type.is2D == 0) {
    				dt = new DefinedType(new Array("oneDarray", bt, $type.w));
    			} else {
    				dt = new DefinedType(new Array("twoDarray", bt, $type.w, $type.h, true));
    			}
    		}
    		dt.setIdentifier($Identifier.text);
    		st.insert($Identifier.text, dt);
    	} else {
    		throw new IllegalArgumentException("Type name has already been defined.");
    	}
    }
     -> ^(TYPE_DECL Identifier EQ type)
    ;

type returns[int isBase, String txt, int w, int h, int is2D]
    :   {$w = -1; $h = -1; $txt = ""; $is2D = -1;}
    t1 = base_type {$isBase = 1; $txt = $t1.txt;}
    |   ARRAY^ LBRACK! IntegerLiteral RBRACK! arr_brack OF t2 = base_type
    {
    	$is2D = $arr_brack.is2D;
    	$isBase = 0;
    	$txt = $t2.txt;
    	if ($arr_brack.is2D == 0) {
    		$w = Integer.parseInt($IntegerLiteral.text);
    	} else {
    		$w = Integer.parseInt($IntegerLiteral.text);
    		$h = $arr_brack.h;
    	}
    }
    ;

arr_brack returns[int is2D, int h]
    :{$h = -1;}	
    (LBRACK! IntegerLiteral RBRACK!)
    {
    	$is2D = 1;
    	$h = Integer.parseInt($IntegerLiteral.text);
    }
    | {$is2D = 0;}
    ;

type_id returns [String txt]
    :   base_type {$txt = $base_type.txt;}
    |   Identifier {$txt = $Identifier.text;}
    ;

base_type returns [String txt]
    :   INT {$txt = "int";}
    |   FIXEDPT {$txt = "fixedpt";}
    ;

var_declaration
    :   id_list COLON type_id
        {   
            Type curr = null;
            if ($type_id.txt.equals("int")) {
                curr = new Type("int");
            } else if ($type_id.txt.equals("fixedpt")) {
                curr = new Type("fixedpt");
            } else {
                if (st.lookup($type_id.txt) != null) {
                    if (st.lookup($type_id.txt).getTypeName().equals("definedtype")
                    	&& st.lookup($type_id.txt).getIsVar() == false) {
                        curr = st.lookup($type_id.txt);
                    } else {
                    	throw new IllegalArgumentException("Illegal variable type.");
                    }
                } else {
                	throw new IllegalArgumentException("Illegal variable type.");
                }
            }
            curr.setIsVar(true);
            for (String s : $id_list.idlist) {
                if (st.lookupCurrentScope(s) == null) {
                    curr.setIdentifier(s);
                    st.insert(s, curr);
                } else {
					throw new IllegalArgumentException("Variable name has already been defined.");
                }
            }
        }
        optional_init SEMI -> ^(VAR_DECL id_list type_id optional_init?)
    ;

id_list returns [ArrayList<String> idlist]
    :   {$idlist = new ArrayList<>();}
        VAR (id1 = Identifier {$idlist.add($id1.text);}) (COMMA (id2 = Identifier{$idlist.add($id2.text);}))* -> ^(VAR Identifier+)
    ;

optional_init returns [boolean isInt]
    :   ASSIGN^ constant {$isInt = $constant.isInt;}
    |
    ;

stat_seq
    : stat+ -> ^(STAT_SEQ stat+)
    ;

stat
    :	if_else_expr
    |   WHILE^ while_condition DO! stat_seq ENDDO! SEMI!
    |   FOR^ for_expr DO! stat_seq ENDDO! SEMI!
    |	Identifier^ (assign_stmt
    {
    	
    }| argument_list
    {
    	if (st.lookup($Identifier.text) == null) {
    		throw new IllegalArgumentException("Undefined function.");
    	} else {
    		if (!st.lookup($Identifier.text).getTypeName().equals("function")) {
    			throw new IllegalArgumentException("Undefined function.");
    		} else {
    			if ($argument_list.pm.size() != ((Function) st.lookup($Identifier.text)).getParamList().size()) {
    				throw new IllegalArgumentException("Number of parameters doesn't match.");
    			} else {
    				for (int i = 0; i < $argument_list.pm.size(); i++) {
    					if (!((Function) st.lookup($Identifier.text)).getParamList().get(i).equals($argument_list.pm.get(i))) {
    						throw new IllegalArgumentException("Type conflict.");
    					}
    				}
    			}
    		}
    	}
    }) SEMI!
    |   BREAK SEMI!
    |   RETURN^ expr SEMI!
    |   block
    ;

argument_list returns [ArrayList<Type> pm]
	: LPAREN expr_list {$pm = $expr_list.pm;} RPAREN -> ^(FUNCT_ARGUMENT_LIST expr_list?)
	;
	
assign_stmt
	: value_tail assign_stmt_tail -> ^(ASSIGN_STMT value_tail? assign_stmt_tail)
	;

assign_stmt_tail
	: ASSIGN expr_or_list
	;

for_expr
    	:	Identifier ASSIGN index_expr TO index_expr
    		{
    			if (st.lookup($Identifier.text) != null) {
    				if (!st.lookup($Identifier.text).getTypeName().equals("int")) {
    					throw new IllegalArgumentException("Illegal variable type.");
    				}
    			} else {
    				throw new IllegalArgumentException("Undefined variable.");
    			}
    		}
    		-> ^(Identifier index_expr TO index_expr)
    	;
    	
while_condition
	: expr 
	{
		if (!$expr.iscomp) {
			throw new IllegalArgumentException("The expression does not return a boolean.");
		}
	}
		-> ^(W_CONDITION expr)
	;
	
expr_or_list
    : (myid = IntegerLiteral! | myid = FixedPointLiteral!) expr_tail1[$myid, false] ((AND^ | OR^) expr_lev3)*
    | myid = Identifier! exprtest[$myid, true]
    | extail ((AND^ | OR^) expr_lev3)*
    ;

exprtest [Token myid, boolean isarray]
	: expr_tail1[$myid, $isarray] ((AND^ | OR^) expr_lev3)*
	| argument_list -> ^({$myid} argument_list)
	;
	
expr_tail1 [Token myid, boolean isarray]
	: expr_tail2[$myid, $isarray] ((EQ^|NEQ^|LESSER^|LESSEREQ^|GREATER^|GREATEREQ^) expr_lev2)*
	;
	
expr_tail2 [Token myid, boolean isarray]
	: expr_tail3[$myid, $isarray] ((PLUS^|MINUS^) expr_lev1)*
	;

expr_tail3 [Token myid, boolean isarray]
	: maderule[$myid] (({$isarray}? value_tail) ((MULT^|DIV^) primary_expression)* | ((MULT^|DIV^) primary_expression)*)
	;
	
maderule [Token myid]
	:  -> ^({$myid})
	;

extail
	: extail1 ((EQ^|NEQ^|LESSER^|LESSEREQ^|GREATER^|GREATEREQ^) expr_lev2)*
	;

extail1
	: extail2 ((PLUS^|MINUS^) expr_lev1)*
	;

extail2
	: LPAREN! expr RPAREN! ((MULT^|DIV^) primary_expression)*
	;

if_else_expr
    :	if_stat then_stat else_expr ENDIF SEMI-> ^(IF_ELSE_EXPR if_stat then_stat else_expr?)
    ;
    
if_stat
	: IF^ expr
		{
			if (!$expr.iscomp) {
				throw new IllegalArgumentException("The expression does not return a boolean.");
			}
		}
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

expr returns [Type atype, boolean iscomp]
    :   {$atype = null;}
    	(com1 = expr_lev3
    	{
    		if($com1.numofcom > 1) {
    			throw new IllegalArgumentException("Illegal expression.");
    		} else if ($com1.numofcom == 0) {
    			$iscomp = false;
    		} else {
    			$iscomp = true;
    		}
    		$atype = $com1.atype;
    	})
    	((AND^ | OR^) (com2 = expr_lev3
    	{
    		if($com2.numofcom > 1 || $com2.numofcom == 0 || $com1.numofcom == 0) {
    			$iscomp = false;
    			throw new IllegalArgumentException("Illegal expression.");
    		} else {
    			$iscomp = true;
    		}
    	}))* 
    ;

expr_lev3 returns [Type atype, int numofcom, boolean isaggregate, boolean iscomp]
    :   el1 = expr_lev2
    {
    	$numofcom = 0;
    	$atype = $el1.atype;
    	$isaggregate = $el1.isaggregate;
    	$iscomp = $el1.iscomp;
    }
    ((EQ^|NEQ^|LESSER^|LESSEREQ^|GREATER^|GREATEREQ^) el2 = expr_lev2
    {
    	if ($el1.iscomp || $el2.iscomp) {
    		throw new IllegalArgumentException("Illegal Expression.");
    	}
    	$numofcom++;
    	if ($el1.atype.getTypeName().equals("int") || $el1.atype.getTypeName().equals("fixedpt")) {
    		if ($el2.atype.getTypeName().equals("definedtype")) {
    			throw new IllegalArgumentException("Type conflict.");
    		} else {
    			if (!$atype.getTypeName().equals("fixedpt")) {
    				if ($el2.atype.getTypeName().equals("fixedpt")) {
    					$atype = new Type("fixedpt");
    				}
    			}
    		}
    	} else {
    		if (!($el2.atype.getIdentifier().equals($el1.atype.getIdentifier()))) {
    			throw new IllegalArgumentException("Type conflict.");
    		} else if ($el1.isaggregate || $el2.isaggregate) {
    			throw new IllegalArgumentException("Aggregate is not allowed.");
    		}
    	}
    })*
    ;

expr_lev2 returns [Type atype, boolean isaggregate, boolean iscomp]
    :   el1 = expr_lev1
    {
    	$atype = $el1.atype;
    	$isaggregate = $el1.isaggregate;
    	$iscomp = $el1.iscomp;
    }
    ((PLUS^|MINUS^) el2 = expr_lev1
    {
    	if ($el1.iscomp || $el2.iscomp) {
    		throw new IllegalArgumentException("Illegal Expression.");
    	}
    	if ($el1.atype.getTypeName().equals("int") || $el1.atype.getTypeName().equals("fixedpt")) {
    		if ($el2.atype.getTypeName().equals("definedtype")) {
    			throw new IllegalArgumentException("Type conflict.");
    		} else {
    			if (!$atype.getTypeName().equals("fixedpt")) {
    				if ($el2.atype.getTypeName().equals("fixedpt")) {
    					$atype = new Type("fixedpt");
    				}
    			}
    		}
    	} else {
    		if (!($el2.atype.getIdentifier().equals($el1.atype.getIdentifier()))) {
    			throw new IllegalArgumentException("Type conflict.");
    		} else if ($el1.isaggregate || $el2.isaggregate) {
    			throw new IllegalArgumentException("Aggregate is not allowed.");
    		}
    	}
    })*
    ;

expr_lev1  returns [Type atype, boolean isaggregate, boolean iscomp]
    :   pe1 = primary_expression
    {
    	$atype = $pe1.atype;
    	$isaggregate = $pe1.isaggregate;
    	$iscomp = $pe1.iscomp;
    }
    ((MULT^|DIV^) pe2 = primary_expression
    {
    	if ($pe1.iscomp || $pe2.iscomp) {
    		throw new IllegalArgumentException("Illegal Expression.");
    	}
    	if ($pe1.atype.getTypeName().equals("int") || $pe1.atype.getTypeName().equals("fixedpt")) {
    		if ($pe2.atype.getTypeName().equals("definedtype")) {
    			throw new IllegalArgumentException("Type conflict.");
    		} else {
    			if (!$atype.getTypeName().equals("fixedpt")) {
    				if ($pe2.atype.getTypeName().equals("fixedpt")) {
    					$atype = new Type("fixedpt");
    				}
    			}
    		}
    	} else {
    		if (!($pe2.atype.getIdentifier().equals($pe1.atype.getIdentifier()))) {
    			throw new IllegalArgumentException("Type conflict.");
    		} else if ($pe1.isaggregate || $pe2.isaggregate) {
    			throw new IllegalArgumentException("Aggregate is not allowed.");
    		}
    	}
    })*
    ;

primary_expression returns [Type atype, boolean iscomp, boolean isaggregate]
    :
    constant
    {
    	if ($constant.isInt) {
    		$atype = new Type("int");
    	} else {
    		$atype = new Type("fixedpt");
    	}
    }
    |   value
    {
    	$atype = $value.atype;
    	$isaggregate = $value.isaggregate;
    }
    |   LPAREN! expr RPAREN!
    {
    	$atype = $expr.atype;
    	$iscomp = $expr.iscomp
    }
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

constant returns [boolean isInt]
    :   IntegerLiteral {$isInt = true;}
    |   FixedPointLiteral {$isInt = false;}
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

expr_list returns [ArrayList<Type> pm]
    :	{$pm = new ArrayList<>();}
    (expr expr_list_tail
    {
    	if ($expr.iscomp) {
    		throw new IllegalArgumentException("Illegal expression for passing in values.");
    	}
    	$pm.add($expr.atype);
    	$pm.addAll($expr_list_tail.pm);
    })?
    ;
  
expr_list_tail returns [ArrayList<Type> pm]
    :   {$pm = new ArrayList<>();}
    	(COMMA expr
    	{
    		if ($expr.iscomp) {
    			throw new IllegalArgumentException("Illegal expression for passing in values.");
    		}
    		$pm.add($expr.atype);
    	})*
    ;

value returns [Type atype, boolean isaggregate]
    :   Identifier^ value_tail
    	{
    		$isaggregate = false;
    		$atype = null;
    		if (st.lookup($Identifier.text) == null) {
    			throw new IllegalArgumentException("Undefined variable.");
    		} else {
    			if ($value_tail.is1D && $value_tail.is2D) {
    				if (!(st.lookup($Identifier.text).getTypeName().equals("definedtype")
    					&& ((DefinedType) st.lookup($Identifier.text)).getBaseType().getTypeName().equals("twoDarray")
    					&& st.lookup($Identifier.text).getIsVar() == true)) {
    					throw new IllegalArgumentException("Illegal variable type.");
    				} else {
    					$atype = ((DefinedType) st.lookup($Identifier.text)).getBaseType().getBaseType();
    				}
    			} else if ($value_tail.is1D) {
    				if (!(st.lookup($Identifier.text).getTypeName().equals("definedtype")
    					&& st.lookup($Identifier.text).getBaseType().getTypeName().equals("oneDarray")
    					&& st.lookup($Identifier.text).getIsVar() == true)) {
    					throw new IllegalArgumentException("Illegal variable type.");
    				} else {
    					$atype = ((DefinedType) st.lookup($Identifier.text)).getBaseType().getBaseType();
    				}
    			} else {
    				if (!(st.lookup($Identifier.text).getTypeName().equals("int")
    					|| st.lookup($Identifier.text).getTypeName().equals("fixedpt")
    					|| (st.lookup($Identifier.text).getTypeName().equals("definedtype")
    					&& ((DefinedType) st.lookup($Identifier.text)).getBaseType().getTypeName().equals("int")
    					&& st.lookup($Identifier.text).getIsVar() == true)
    					|| (st.lookup($Identifier.text).getTypeName().equals("definedtype")
    					&& ((DefinedType) st.lookup($Identifier.text)).getBaseType().getTypeName().equals("fixedpt")
    					&& st.lookup($Identifier.text).getIsVar() == true)
    					|| (st.lookup($Identifier.text).getTypeName().equals("definedtype")
    					&& ((DefinedType) st.lookup($Identifier.text)).getBaseType().getTypeName().equals("twoDarray")
    					&& st.lookup($Identifier.text).getIsVar() == true)
    					|| (st.lookup($Identifier.text).getTypeName().equals("definedtype")
    					&& ((DefinedType) st.lookup($Identifier.text)).getBaseType().getTypeName().equals("oneDarray")
    					&& st.lookup($Identifier.text).getIsVar() == true))) {
    					throw new IllegalArgumentException("Illegal variable type."); 
    				} else if ((st.lookup($Identifier.text).getTypeName().equals("definedtype")
    					&& ((DefinedType) st.lookup($Identifier.text)).getBaseType().getTypeName().equals("int")
    					&& st.lookup($Identifier.text).getIsVar() == true)
    					|| (st.lookup($Identifier.text).getTypeName().equals("definedtype")
    					&& ((DefinedType) st.lookup($Identifier.text)).getBaseType().getTypeName().equals("fixedpt")
    					&& st.lookup($Identifier.text).getIsVar() == true)) {
    					$atype = st.lookup($Identifier.text);
    				} else if (st.lookup($Identifier.text).getTypeName().equals("int")) {
    					$atype = new Type("int");
    				} else if (st.lookup($Identifier.text).getTypeName().equals("fixedpt")) {
    					$atype = new Type("fixedpt");
    				} else {
    					$atype = st.lookup($Identifier.text);
    					$isaggregate = true;
    				}
    			}
    		}
    	}
    ;

value_tail returns [boolean is1D, boolean is2D]
    :   {$is1D = false;
    	 $is2D = false;}
    	(LBRACK index_expr RBRACK value_tail_tail
    	{
    		$is1D = true;
    		$is2D = $value_tail_tail.is2D;
    	}
    	)? -> ^(INDEX1 index_expr value_tail_tail?)?
    ;
    
value_tail_tail returns [boolean is2D]
    :	{ $is2D = false; }
    	(LBRACK index_expr RBRACK
    	{
    		$is2D = true;
    	})? -> ^(INDEX2 index_expr)?
    ;

index_expr
    :	index_expr_lev1 ((PLUS^ | MINUS^) index_expr_lev1)*
    ;
    
index_expr_lev1
    :	primary_index_expr (MULT^ primary_index_expr)*
    ;       

primary_index_expr
    :	IntegerLiteral
    |  	(Identifier 
    {
    	if (st.lookup($Identifier.text) != null) {
    		if (!st.lookup($Identifier.text).getTypeName().equals("int")) {
    			throw new IllegalArgumentException("Illegal variable type.");
    		}
    	} else {
    		throw new IllegalArgumentException("Undefined variable.");
    	}
    })
    ;
