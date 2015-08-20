package p3;

// $ANTLR 3.5.2 Tiger.g 2015-04-26 07:11:26

	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class TigerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ASSIGN", "ASSIGN_STMT", 
		"BEGIN", "BLOCK", "BREAK", "COLON", "COMMA", "COMMENT", "DIV", "DO", "Digit", 
		"Digits", "ELSE", "END", "ENDDO", "ENDIF", "EQ", "FIXEDPT", "FOR", "FOR_EXPR", 
		"FUNCTION", "FUNCTION_LIST", "FUNCT_ARGUMENT_LIST", "FixedPointLiteral", 
		"GREATER", "GREATEREQ", "IF", "IF_ELSE_EXPR", "INDEX1", "INDEX2", "INT", 
		"Identifier", "IntegerLiteral", "LBRACK", "LESSER", "LESSEREQ", "LINE_COMMENT", 
		"LPAREN", "Letter", "MAIN", "MINUS", "MULT", "NEQ", "NaturalNumber", "OF", 
		"OR", "PARAM_LIST", "PLUS", "RBRACK", "RETURN", "RET_TYPE", "RPAREN", 
		"SEMI", "STAT_SEQ", "THEN", "TO", "TYPE", "TYPE_DECL", "TYPE_DECL_LIST", 
		"VAR", "VAR_DECL", "VAR_DECL_LIST", "VOID", "WHILE", "WS", "W_CONDITION"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ARRAY=5;
	public static final int ASSIGN=6;
	public static final int ASSIGN_STMT=7;
	public static final int BEGIN=8;
	public static final int BLOCK=9;
	public static final int BREAK=10;
	public static final int COLON=11;
	public static final int COMMA=12;
	public static final int COMMENT=13;
	public static final int DIV=14;
	public static final int DO=15;
	public static final int Digit=16;
	public static final int Digits=17;
	public static final int ELSE=18;
	public static final int END=19;
	public static final int ENDDO=20;
	public static final int ENDIF=21;
	public static final int EQ=22;
	public static final int FIXEDPT=23;
	public static final int FOR=24;
	public static final int FOR_EXPR=25;
	public static final int FUNCTION=26;
	public static final int FUNCTION_LIST=27;
	public static final int FUNCT_ARGUMENT_LIST=28;
	public static final int FixedPointLiteral=29;
	public static final int GREATER=30;
	public static final int GREATEREQ=31;
	public static final int IF=32;
	public static final int IF_ELSE_EXPR=33;
	public static final int INDEX1=34;
	public static final int INDEX2=35;
	public static final int INT=36;
	public static final int Identifier=37;
	public static final int IntegerLiteral=38;
	public static final int LBRACK=39;
	public static final int LESSER=40;
	public static final int LESSEREQ=41;
	public static final int LINE_COMMENT=42;
	public static final int LPAREN=43;
	public static final int Letter=44;
	public static final int MAIN=45;
	public static final int MINUS=46;
	public static final int MULT=47;
	public static final int NEQ=48;
	public static final int NaturalNumber=49;
	public static final int OF=50;
	public static final int OR=51;
	public static final int PARAM_LIST=52;
	public static final int PLUS=53;
	public static final int RBRACK=54;
	public static final int RETURN=55;
	public static final int RET_TYPE=56;
	public static final int RPAREN=57;
	public static final int SEMI=58;
	public static final int STAT_SEQ=59;
	public static final int THEN=60;
	public static final int TO=61;
	public static final int TYPE=62;
	public static final int TYPE_DECL=63;
	public static final int TYPE_DECL_LIST=64;
	public static final int VAR=65;
	public static final int VAR_DECL=66;
	public static final int VAR_DECL_LIST=67;
	public static final int VOID=68;
	public static final int WHILE=69;
	public static final int WS=70;
	public static final int W_CONDITION=71;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TigerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TigerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return TigerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Tiger.g"; }


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


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// Tiger.g:108:1: program : type_declaration_list funct_list main_function ;
	public final TigerParser.program_return program() throws RecognitionException {
		TigerParser.program_return retval = new TigerParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_list1 =null;
		ParserRuleReturnScope funct_list2 =null;
		ParserRuleReturnScope main_function3 =null;


		try {
			// Tiger.g:109:5: ( type_declaration_list funct_list main_function )
			// Tiger.g:110:5: type_declaration_list funct_list main_function
			{
			root_0 = (Object)adaptor.nil();



			    	st.initializeScope();
			    
			pushFollow(FOLLOW_type_declaration_list_in_program142);
			type_declaration_list1=type_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, type_declaration_list1.getTree());

			pushFollow(FOLLOW_funct_list_in_program144);
			funct_list2=funct_list();
			state._fsp--;

			adaptor.addChild(root_0, funct_list2.getTree());

			pushFollow(FOLLOW_main_function_in_program146);
			main_function3=main_function();
			state._fsp--;

			adaptor.addChild(root_0, main_function3.getTree());


			    	st.finalizeScope();
			    	System.out.println(st.toString());
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class funct_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funct_list"
	// Tiger.g:207:1: funct_list : funct_declaration_list -> ^( FUNCTION_LIST ( funct_declaration_list )? ) ;
	public final TigerParser.funct_list_return funct_list() throws RecognitionException {
		TigerParser.funct_list_return retval = new TigerParser.funct_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope funct_declaration_list4 =null;

		RewriteRuleSubtreeStream stream_funct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule funct_declaration_list");

		try {
			// Tiger.g:208:2: ( funct_declaration_list -> ^( FUNCTION_LIST ( funct_declaration_list )? ) )
			// Tiger.g:208:4: funct_declaration_list
			{
			pushFollow(FOLLOW_funct_declaration_list_in_funct_list1131);
			funct_declaration_list4=funct_declaration_list();
			state._fsp--;

			stream_funct_declaration_list.add(funct_declaration_list4.getTree());
			// AST REWRITE
			// elements: funct_declaration_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 208:27: -> ^( FUNCTION_LIST ( funct_declaration_list )? )
			{
				// Tiger.g:208:30: ^( FUNCTION_LIST ( funct_declaration_list )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_LIST, "FUNCTION_LIST"), root_1);
				// Tiger.g:208:46: ( funct_declaration_list )?
				if ( stream_funct_declaration_list.hasNext() ) {
					adaptor.addChild(root_1, stream_funct_declaration_list.nextTree());
				}
				stream_funct_declaration_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funct_list"


	public static class funct_declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funct_declaration_list"
	// Tiger.g:211:1: funct_declaration_list : ( funct_declaration funct_declaration_list | VOID ! ( funct_declaration_tail funct_declaration_list )? );
	public final TigerParser.funct_declaration_list_return funct_declaration_list() throws RecognitionException {
		TigerParser.funct_declaration_list_return retval = new TigerParser.funct_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VOID7=null;
		ParserRuleReturnScope funct_declaration5 =null;
		ParserRuleReturnScope funct_declaration_list6 =null;
		ParserRuleReturnScope funct_declaration_tail8 =null;
		ParserRuleReturnScope funct_declaration_list9 =null;

		Object VOID7_tree=null;

		try {
			// Tiger.g:212:5: ( funct_declaration funct_declaration_list | VOID ! ( funct_declaration_tail funct_declaration_list )? )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==FIXEDPT||(LA2_0 >= INT && LA2_0 <= Identifier)) ) {
				alt2=1;
			}
			else if ( (LA2_0==VOID) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Tiger.g:212:7: funct_declaration funct_declaration_list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_funct_declaration_in_funct_declaration_list1155);
					funct_declaration5=funct_declaration();
					state._fsp--;

					adaptor.addChild(root_0, funct_declaration5.getTree());

					pushFollow(FOLLOW_funct_declaration_list_in_funct_declaration_list1157);
					funct_declaration_list6=funct_declaration_list();
					state._fsp--;

					adaptor.addChild(root_0, funct_declaration_list6.getTree());

					}
					break;
				case 2 :
					// Tiger.g:213:7: VOID ! ( funct_declaration_tail funct_declaration_list )?
					{
					root_0 = (Object)adaptor.nil();


					VOID7=(Token)match(input,VOID,FOLLOW_VOID_in_funct_declaration_list1165); 
					// Tiger.g:213:13: ( funct_declaration_tail funct_declaration_list )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==FUNCTION) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// Tiger.g:213:14: funct_declaration_tail funct_declaration_list
							{
							pushFollow(FOLLOW_funct_declaration_tail_in_funct_declaration_list1169);
							funct_declaration_tail8=funct_declaration_tail();
							state._fsp--;

							adaptor.addChild(root_0, funct_declaration_tail8.getTree());

							pushFollow(FOLLOW_funct_declaration_list_in_funct_declaration_list1171);
							funct_declaration_list9=funct_declaration_list();
							state._fsp--;

							adaptor.addChild(root_0, funct_declaration_list9.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funct_declaration_list"


	public static class funct_ret_type_return extends ParserRuleReturnScope {
		public String retType;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funct_ret_type"
	// Tiger.g:216:1: funct_ret_type returns [String retType] : ( alltype ) -> ^( RET_TYPE alltype ) ;
	public final TigerParser.funct_ret_type_return funct_ret_type() throws RecognitionException {
		TigerParser.funct_ret_type_return retval = new TigerParser.funct_ret_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope alltype10 =null;

		RewriteRuleSubtreeStream stream_alltype=new RewriteRuleSubtreeStream(adaptor,"rule alltype");

		try {
			// Tiger.g:217:2: ( ( alltype ) -> ^( RET_TYPE alltype ) )
			// Tiger.g:217:4: ( alltype )
			{
			// Tiger.g:217:4: ( alltype )
			// Tiger.g:217:5: alltype
			{
			pushFollow(FOLLOW_alltype_in_funct_ret_type1196);
			alltype10=alltype();
			state._fsp--;

			stream_alltype.add(alltype10.getTree());
			retval.retType = (alltype10!=null?((TigerParser.alltype_return)alltype10).retType:null);
			}

			// AST REWRITE
			// elements: alltype
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 217:45: -> ^( RET_TYPE alltype )
			{
				// Tiger.g:217:48: ^( RET_TYPE alltype )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RET_TYPE, "RET_TYPE"), root_1);
				adaptor.addChild(root_1, stream_alltype.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funct_ret_type"


	public static class alltype_return extends ParserRuleReturnScope {
		public String retType;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "alltype"
	// Tiger.g:220:1: alltype returns [String retType] : ( Identifier | INT | FIXEDPT );
	public final TigerParser.alltype_return alltype() throws RecognitionException {
		TigerParser.alltype_return retval = new TigerParser.alltype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier11=null;
		Token INT12=null;
		Token FIXEDPT13=null;

		Object Identifier11_tree=null;
		Object INT12_tree=null;
		Object FIXEDPT13_tree=null;

		try {
			// Tiger.g:221:2: ( Identifier | INT | FIXEDPT )
			int alt3=3;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt3=1;
				}
				break;
			case INT:
				{
				alt3=2;
				}
				break;
			case FIXEDPT:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// Tiger.g:221:4: Identifier
					{
					root_0 = (Object)adaptor.nil();


					Identifier11=(Token)match(input,Identifier,FOLLOW_Identifier_in_alltype1222); 
					Identifier11_tree = (Object)adaptor.create(Identifier11);
					adaptor.addChild(root_0, Identifier11_tree);

					retval.retType = (Identifier11!=null?Identifier11.getText():null);
					}
					break;
				case 2 :
					// Tiger.g:221:47: INT
					{
					root_0 = (Object)adaptor.nil();


					INT12=(Token)match(input,INT,FOLLOW_INT_in_alltype1227); 
					INT12_tree = (Object)adaptor.create(INT12);
					adaptor.addChild(root_0, INT12_tree);

					retval.retType = "int";
					}
					break;
				case 3 :
					// Tiger.g:221:72: FIXEDPT
					{
					root_0 = (Object)adaptor.nil();


					FIXEDPT13=(Token)match(input,FIXEDPT,FOLLOW_FIXEDPT_in_alltype1232); 
					FIXEDPT13_tree = (Object)adaptor.create(FIXEDPT13);
					adaptor.addChild(root_0, FIXEDPT13_tree);

					retval.retType = "fixedpt";
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alltype"


	public static class funct_declaration_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funct_declaration_tail"
	// Tiger.g:224:1: funct_declaration_tail : FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI -> ^( Identifier ( param_list )? block_list ) ;
	public final TigerParser.funct_declaration_tail_return funct_declaration_tail() throws RecognitionException {
		TigerParser.funct_declaration_tail_return retval = new TigerParser.funct_declaration_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION14=null;
		Token Identifier15=null;
		Token LPAREN16=null;
		Token RPAREN18=null;
		Token BEGIN19=null;
		Token END21=null;
		Token SEMI22=null;
		ParserRuleReturnScope param_list17 =null;
		ParserRuleReturnScope block_list20 =null;

		Object FUNCTION14_tree=null;
		Object Identifier15_tree=null;
		Object LPAREN16_tree=null;
		Object RPAREN18_tree=null;
		Object BEGIN19_tree=null;
		Object END21_tree=null;
		Object SEMI22_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleSubtreeStream stream_block_list=new RewriteRuleSubtreeStream(adaptor,"rule block_list");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// Tiger.g:225:5: ( FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI -> ^( Identifier ( param_list )? block_list ) )
			// Tiger.g:225:7: FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI
			{
			FUNCTION14=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funct_declaration_tail1248);  
			stream_FUNCTION.add(FUNCTION14);

			Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_funct_declaration_tail1250);  
			stream_Identifier.add(Identifier15);

			LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funct_declaration_tail1252);  
			stream_LPAREN.add(LPAREN16);

			pushFollow(FOLLOW_param_list_in_funct_declaration_tail1254);
			param_list17=param_list();
			state._fsp--;

			stream_param_list.add(param_list17.getTree());
			RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funct_declaration_tail1256);  
			stream_RPAREN.add(RPAREN18);


			    	Type rt = new Type("void");
			    	if (st.lookupCurrentScope((Identifier15!=null?Identifier15.getText():null)) == null) {
				    	ArrayList<Type> curr = new ArrayList<>();
				    	for (HashMap<String, Type> map : (param_list17!=null?((TigerParser.param_list_return)param_list17).pl:null)) {
				    		for (String s : map.keySet()) {
				    			curr.add(map.get(s));
				    		}
				    	}
				   		st.insert((Identifier15!=null?Identifier15.getText():null), new Function(rt, curr));
			    	} else {
			    		System.out.println("Function name has already been defined. Line: " + Identifier15.getLine());
			    	}
			    
			BEGIN19=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_funct_declaration_tail1268);  
			stream_BEGIN.add(BEGIN19);


					st.initializeScope();
				    for (HashMap<String, Type> map : (param_list17!=null?((TigerParser.param_list_return)param_list17).pl:null)) {
				    	for (String s : map.keySet()) {
				    		Type curr = map.get(s);
				    		if (st.lookupCurrentScope(s) == null) {
				    			st.insert(s, curr);
				    		} else {
				    			System.out.println("Paramter has already been defined. Line: " + Identifier15.getLine());
				   			}
				    	}
				    }
				
			pushFollow(FOLLOW_block_list_in_funct_declaration_tail1277);
			block_list20=block_list();
			state._fsp--;

			stream_block_list.add(block_list20.getTree());

					if ((block_list20!=null?((TigerParser.block_list_return)block_list20).ifreturn:false)) {
						System.out.println("There should be no return statement");
					}
				
			END21=(Token)match(input,END,FOLLOW_END_in_funct_declaration_tail1286);  
			stream_END.add(END21);


			    	st.finalizeScope();
			    
			SEMI22=(Token)match(input,SEMI,FOLLOW_SEMI_in_funct_declaration_tail1298);  
			stream_SEMI.add(SEMI22);

			// AST REWRITE
			// elements: block_list, Identifier, param_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 265:5: -> ^( Identifier ( param_list )? block_list )
			{
				// Tiger.g:265:8: ^( Identifier ( param_list )? block_list )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_Identifier.nextNode(), root_1);
				// Tiger.g:265:21: ( param_list )?
				if ( stream_param_list.hasNext() ) {
					adaptor.addChild(root_1, stream_param_list.nextTree());
				}
				stream_param_list.reset();

				adaptor.addChild(root_1, stream_block_list.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funct_declaration_tail"


	public static class funct_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funct_declaration"
	// Tiger.g:268:1: funct_declaration : funct_ret_type FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI -> ^( Identifier funct_ret_type ( param_list )? block_list ) ;
	public final TigerParser.funct_declaration_return funct_declaration() throws RecognitionException {
		TigerParser.funct_declaration_return retval = new TigerParser.funct_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION24=null;
		Token Identifier25=null;
		Token LPAREN26=null;
		Token RPAREN28=null;
		Token BEGIN29=null;
		Token END31=null;
		Token SEMI32=null;
		ParserRuleReturnScope funct_ret_type23 =null;
		ParserRuleReturnScope param_list27 =null;
		ParserRuleReturnScope block_list30 =null;

		Object FUNCTION24_tree=null;
		Object Identifier25_tree=null;
		Object LPAREN26_tree=null;
		Object RPAREN28_tree=null;
		Object BEGIN29_tree=null;
		Object END31_tree=null;
		Object SEMI32_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleSubtreeStream stream_funct_ret_type=new RewriteRuleSubtreeStream(adaptor,"rule funct_ret_type");
		RewriteRuleSubtreeStream stream_block_list=new RewriteRuleSubtreeStream(adaptor,"rule block_list");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// Tiger.g:269:2: ( funct_ret_type FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI -> ^( Identifier funct_ret_type ( param_list )? block_list ) )
			// Tiger.g:269:4: funct_ret_type FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI
			{
			Type rt = null;
			pushFollow(FOLLOW_funct_ret_type_in_funct_declaration1329);
			funct_ret_type23=funct_ret_type();
			state._fsp--;

			stream_funct_ret_type.add(funct_ret_type23.getTree());
			FUNCTION24=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funct_declaration1331);  
			stream_FUNCTION.add(FUNCTION24);

			Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_funct_declaration1333);  
			stream_Identifier.add(Identifier25);

			LPAREN26=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funct_declaration1335);  
			stream_LPAREN.add(LPAREN26);

			pushFollow(FOLLOW_param_list_in_funct_declaration1337);
			param_list27=param_list();
			state._fsp--;

			stream_param_list.add(param_list27.getTree());
			RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funct_declaration1339);  
			stream_RPAREN.add(RPAREN28);


				    if ((funct_ret_type23!=null?((TigerParser.funct_ret_type_return)funct_ret_type23).retType:null).equals("int") ||
				    	(funct_ret_type23!=null?((TigerParser.funct_ret_type_return)funct_ret_type23).retType:null).equals("fixedpt")) {
				        rt = new Type((funct_ret_type23!=null?((TigerParser.funct_ret_type_return)funct_ret_type23).retType:null));
				    } else {
			            if (st.lookup((funct_ret_type23!=null?((TigerParser.funct_ret_type_return)funct_ret_type23).retType:null)) != null) {
			            	if (st.lookup((funct_ret_type23!=null?((TigerParser.funct_ret_type_return)funct_ret_type23).retType:null)).getTypeName().equals("definedtype")) {
			            		rt = st.lookup((funct_ret_type23!=null?((TigerParser.funct_ret_type_return)funct_ret_type23).retType:null));
			            	} else {
			               		System.out.println("Illegal function return type. Line: " + Identifier25.getLine());
			            	}
			            } else {
			                System.out.println("Illegal function return type. Line: " + Identifier25.getLine());
			            }
				    }
				    if (st.lookupCurrentScope((Identifier25!=null?Identifier25.getText():null)) == null) {
				    	ArrayList<Type> curr = new ArrayList<>();
				    	for (HashMap<String, Type> map : (param_list27!=null?((TigerParser.param_list_return)param_list27).pl:null)) {
				    		for (String s : map.keySet()) {
				    			curr.add(map.get(s));
				    		}
				    	}
				   		st.insert((Identifier25!=null?Identifier25.getText():null), new Function(rt, curr));
				   	} else {
				   		System.out.println("Function name has already been defined. Line: " + Identifier25.getLine());
				   	}
				
			BEGIN29=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_funct_declaration1346);  
			stream_BEGIN.add(BEGIN29);


					st.initializeScope();
				    for (HashMap<String, Type> map : (param_list27!=null?((TigerParser.param_list_return)param_list27).pl:null)) {
				    	for (String s : map.keySet()) {
				    		Type curr = map.get(s);
				    		if (st.lookupCurrentScope(s) == null) {
				    			st.insert(s, curr);
				    		} else {
				    			System.out.println("Paramter has already been defined. Line: " + Identifier25.getLine());
				   			}
				    	}
				    }
				
			pushFollow(FOLLOW_block_list_in_funct_declaration1353);
			block_list30=block_list();
			state._fsp--;

			stream_block_list.add(block_list30.getTree());

					
					if ((block_list30!=null?((TigerParser.block_list_return)block_list30).ifreturn:false)) {
						if (!((block_list30!=null?((TigerParser.block_list_return)block_list30).rt:null).equals(rt))) {
							System.out.println("Unmatched return type");
						}
					} else {
						System.out.println("Missing return statement");
					}
				
			END31=(Token)match(input,END,FOLLOW_END_in_funct_declaration1358);  
			stream_END.add(END31);

			st.finalizeScope();
			SEMI32=(Token)match(input,SEMI,FOLLOW_SEMI_in_funct_declaration1362);  
			stream_SEMI.add(SEMI32);

			// AST REWRITE
			// elements: block_list, Identifier, funct_ret_type, param_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 322:2: -> ^( Identifier funct_ret_type ( param_list )? block_list )
			{
				// Tiger.g:322:5: ^( Identifier funct_ret_type ( param_list )? block_list )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_Identifier.nextNode(), root_1);
				adaptor.addChild(root_1, stream_funct_ret_type.nextTree());
				// Tiger.g:322:33: ( param_list )?
				if ( stream_param_list.hasNext() ) {
					adaptor.addChild(root_1, stream_param_list.nextTree());
				}
				stream_param_list.reset();

				adaptor.addChild(root_1, stream_block_list.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funct_declaration"


	public static class main_function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_function"
	// Tiger.g:325:1: main_function : MAIN ^ LPAREN ! RPAREN ! BEGIN ! block_list END ! SEMI !;
	public final TigerParser.main_function_return main_function() throws RecognitionException {
		TigerParser.main_function_return retval = new TigerParser.main_function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MAIN33=null;
		Token LPAREN34=null;
		Token RPAREN35=null;
		Token BEGIN36=null;
		Token END38=null;
		Token SEMI39=null;
		ParserRuleReturnScope block_list37 =null;

		Object MAIN33_tree=null;
		Object LPAREN34_tree=null;
		Object RPAREN35_tree=null;
		Object BEGIN36_tree=null;
		Object END38_tree=null;
		Object SEMI39_tree=null;

		try {
			// Tiger.g:326:5: ( MAIN ^ LPAREN ! RPAREN ! BEGIN ! block_list END ! SEMI !)
			// Tiger.g:326:9: MAIN ^ LPAREN ! RPAREN ! BEGIN ! block_list END ! SEMI !
			{
			root_0 = (Object)adaptor.nil();


			MAIN33=(Token)match(input,MAIN,FOLLOW_MAIN_in_main_function1393); 
			MAIN33_tree = (Object)adaptor.create(MAIN33);
			root_0 = (Object)adaptor.becomeRoot(MAIN33_tree, root_0);

			LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_main_function1396); 
			RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_main_function1399); 
			BEGIN36=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_main_function1402); 
			pushFollow(FOLLOW_block_list_in_main_function1405);
			block_list37=block_list();
			state._fsp--;

			adaptor.addChild(root_0, block_list37.getTree());

			END38=(Token)match(input,END,FOLLOW_END_in_main_function1407); 
			SEMI39=(Token)match(input,SEMI,FOLLOW_SEMI_in_main_function1410); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_function"


	public static class param_list_return extends ParserRuleReturnScope {
		public ArrayList<HashMap<String, Type>> pl;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param_list"
	// Tiger.g:329:1: param_list returns [ArrayList<HashMap<String, Type>> pl] : (pr1= param ( COMMA pr2= param )* )? -> ^( PARAM_LIST ( param )* ) ;
	public final TigerParser.param_list_return param_list() throws RecognitionException {
		TigerParser.param_list_return retval = new TigerParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA40=null;
		ParserRuleReturnScope pr1 =null;
		ParserRuleReturnScope pr2 =null;

		Object COMMA40_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			// Tiger.g:330:5: ( (pr1= param ( COMMA pr2= param )* )? -> ^( PARAM_LIST ( param )* ) )
			// Tiger.g:331:5: (pr1= param ( COMMA pr2= param )* )?
			{
			retval.pl = new ArrayList<>();
			// Tiger.g:332:5: (pr1= param ( COMMA pr2= param )* )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Tiger.g:332:6: pr1= param ( COMMA pr2= param )*
					{
					pushFollow(FOLLOW_param_in_param_list1450);
					pr1=param();
					state._fsp--;

					stream_param.add(pr1.getTree());
					retval.pl.add((pr1!=null?((TigerParser.param_return)pr1).map:null));
					// Tiger.g:332:38: ( COMMA pr2= param )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Tiger.g:332:39: COMMA pr2= param
							{
							COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_list1454);  
							stream_COMMA.add(COMMA40);

							pushFollow(FOLLOW_param_in_param_list1460);
							pr2=param();
							state._fsp--;

							stream_param.add(pr2.getTree());
							retval.pl.add((pr2!=null?((TigerParser.param_return)pr2).map:null));
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: param
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 332:82: -> ^( PARAM_LIST ( param )* )
			{
				// Tiger.g:332:85: ^( PARAM_LIST ( param )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);
				// Tiger.g:332:98: ( param )*
				while ( stream_param.hasNext() ) {
					adaptor.addChild(root_1, stream_param.nextTree());
				}
				stream_param.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param_list"


	public static class param_return extends ParserRuleReturnScope {
		public HashMap<String, Type> map;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param"
	// Tiger.g:335:1: param returns [HashMap<String, Type> map] : Identifier COLON ^ type_id ;
	public final TigerParser.param_return param() throws RecognitionException {
		TigerParser.param_return retval = new TigerParser.param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier41=null;
		Token COLON42=null;
		ParserRuleReturnScope type_id43 =null;

		Object Identifier41_tree=null;
		Object COLON42_tree=null;

		try {
			// Tiger.g:336:5: ( Identifier COLON ^ type_id )
			// Tiger.g:336:9: Identifier COLON ^ type_id
			{
			root_0 = (Object)adaptor.nil();


			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_param1498); 
			Identifier41_tree = (Object)adaptor.create(Identifier41);
			adaptor.addChild(root_0, Identifier41_tree);

			COLON42=(Token)match(input,COLON,FOLLOW_COLON_in_param1500); 
			COLON42_tree = (Object)adaptor.create(COLON42);
			root_0 = (Object)adaptor.becomeRoot(COLON42_tree, root_0);

			pushFollow(FOLLOW_type_id_in_param1503);
			type_id43=type_id();
			state._fsp--;

			adaptor.addChild(root_0, type_id43.getTree());


			    	retval.map = new HashMap<>();
			    	Type curr = null;
			    	if (!((type_id43!=null?((TigerParser.type_id_return)type_id43).txt:null).equals("int")) && !((type_id43!=null?((TigerParser.type_id_return)type_id43).txt:null).equals("fixedpt"))) {
			    		if (st.lookup((type_id43!=null?((TigerParser.type_id_return)type_id43).txt:null)) != null) {
			    			if (st.lookup((type_id43!=null?((TigerParser.type_id_return)type_id43).txt:null)).getTypeName().equals("definedtype")) {
			    				curr = st.lookup((type_id43!=null?((TigerParser.type_id_return)type_id43).txt:null)).getCopy();
			    			} else {
			    				throw new IllegalArgumentException("Illegal parameter type.");
			    			}
			    		} else {
			    			throw new IllegalArgumentException("Illegal parameter type.");
			    		}
			    	} else {
			    		curr = new Type((type_id43!=null?((TigerParser.type_id_return)type_id43).txt:null));
			    	}
			    	curr.setIsVar(true);
			    	retval.map.put((Identifier41!=null?Identifier41.getText():null), curr);
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param"


	public static class block_list_return extends ParserRuleReturnScope {
		public Type rt;
		public boolean ifreturn;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block_list"
	// Tiger.g:358:1: block_list returns [Type rt, boolean ifreturn] : ( block )+ ;
	public final TigerParser.block_list_return block_list() throws RecognitionException {
		TigerParser.block_list_return retval = new TigerParser.block_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block44 =null;


		try {
			// Tiger.g:359:5: ( ( block )+ )
			// Tiger.g:359:9: ( block )+
			{
			root_0 = (Object)adaptor.nil();


			// Tiger.g:359:9: ( block )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==BEGIN) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Tiger.g:359:10: block
					{
					pushFollow(FOLLOW_block_in_block_list1533);
					block44=block();
					state._fsp--;

					adaptor.addChild(root_0, block44.getTree());


					    	if (retval.ifreturn) {
					    		System.out.println("Return is not at the end of a function");
					    	}
					    	retval.rt = (block44!=null?((TigerParser.block_return)block44).rt:null);	
					    	retval.ifreturn = (block44!=null?((TigerParser.block_return)block44).ifreturn:false);
					    
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block_list"


	public static class block_return extends ParserRuleReturnScope {
		public Type rt;
		public boolean ifreturn;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// Tiger.g:371:1: block returns [Type rt, boolean ifreturn] : BEGIN type_declaration_list var_declaration_list stat_seq END SEMI -> ^( BLOCK type_declaration_list var_declaration_list stat_seq ) ;
	public final TigerParser.block_return block() throws RecognitionException {
		TigerParser.block_return retval = new TigerParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BEGIN45=null;
		Token END49=null;
		Token SEMI50=null;
		ParserRuleReturnScope type_declaration_list46 =null;
		ParserRuleReturnScope var_declaration_list47 =null;
		ParserRuleReturnScope stat_seq48 =null;

		Object BEGIN45_tree=null;
		Object END49_tree=null;
		Object SEMI50_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_var_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule var_declaration_list");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_type_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_list");

		try {
			// Tiger.g:372:5: ( BEGIN type_declaration_list var_declaration_list stat_seq END SEMI -> ^( BLOCK type_declaration_list var_declaration_list stat_seq ) )
			// Tiger.g:372:9: BEGIN type_declaration_list var_declaration_list stat_seq END SEMI
			{
			BEGIN45=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block1570);  
			stream_BEGIN.add(BEGIN45);

			st.initializeScope();
			pushFollow(FOLLOW_type_declaration_list_in_block1574);
			type_declaration_list46=type_declaration_list();
			state._fsp--;

			stream_type_declaration_list.add(type_declaration_list46.getTree());
			pushFollow(FOLLOW_var_declaration_list_in_block1576);
			var_declaration_list47=var_declaration_list();
			state._fsp--;

			stream_var_declaration_list.add(var_declaration_list47.getTree());
			pushFollow(FOLLOW_stat_seq_in_block1578);
			stat_seq48=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq48.getTree());

			    	retval.rt = (stat_seq48!=null?((TigerParser.stat_seq_return)stat_seq48).rt:null);
			    	retval.ifreturn = (stat_seq48!=null?((TigerParser.stat_seq_return)stat_seq48).ifreturn:false);
			    
			END49=(Token)match(input,END,FOLLOW_END_in_block1586);  
			stream_END.add(END49);

			st.finalizeScope();
			SEMI50=(Token)match(input,SEMI,FOLLOW_SEMI_in_block1589);  
			stream_SEMI.add(SEMI50);

			// AST REWRITE
			// elements: var_declaration_list, stat_seq, type_declaration_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 377:6: -> ^( BLOCK type_declaration_list var_declaration_list stat_seq )
			{
				// Tiger.g:377:9: ^( BLOCK type_declaration_list var_declaration_list stat_seq )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				adaptor.addChild(root_1, stream_type_declaration_list.nextTree());
				adaptor.addChild(root_1, stream_var_declaration_list.nextTree());
				adaptor.addChild(root_1, stream_stat_seq.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class type_declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_declaration_list"
	// Tiger.g:380:1: type_declaration_list : ( type_declaration )* -> ^( TYPE_DECL_LIST ( type_declaration )* ) ;
	public final TigerParser.type_declaration_list_return type_declaration_list() throws RecognitionException {
		TigerParser.type_declaration_list_return retval = new TigerParser.type_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration51 =null;

		RewriteRuleSubtreeStream stream_type_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration");

		try {
			// Tiger.g:381:5: ( ( type_declaration )* -> ^( TYPE_DECL_LIST ( type_declaration )* ) )
			// Tiger.g:381:9: ( type_declaration )*
			{
			// Tiger.g:381:9: ( type_declaration )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==TYPE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Tiger.g:381:9: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_type_declaration_list1625);
					type_declaration51=type_declaration();
					state._fsp--;

					stream_type_declaration.add(type_declaration51.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			// AST REWRITE
			// elements: type_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 381:27: -> ^( TYPE_DECL_LIST ( type_declaration )* )
			{
				// Tiger.g:381:30: ^( TYPE_DECL_LIST ( type_declaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_DECL_LIST, "TYPE_DECL_LIST"), root_1);
				// Tiger.g:381:47: ( type_declaration )*
				while ( stream_type_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_type_declaration.nextTree());
				}
				stream_type_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_declaration_list"


	public static class var_declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_declaration_list"
	// Tiger.g:384:1: var_declaration_list : ( var_declaration )* -> ^( VAR_DECL_LIST ( var_declaration )* ) ;
	public final TigerParser.var_declaration_list_return var_declaration_list() throws RecognitionException {
		TigerParser.var_declaration_list_return retval = new TigerParser.var_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_declaration52 =null;

		RewriteRuleSubtreeStream stream_var_declaration=new RewriteRuleSubtreeStream(adaptor,"rule var_declaration");

		try {
			// Tiger.g:385:5: ( ( var_declaration )* -> ^( VAR_DECL_LIST ( var_declaration )* ) )
			// Tiger.g:385:9: ( var_declaration )*
			{
			// Tiger.g:385:9: ( var_declaration )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==VAR) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Tiger.g:385:9: var_declaration
					{
					pushFollow(FOLLOW_var_declaration_in_var_declaration_list1658);
					var_declaration52=var_declaration();
					state._fsp--;

					stream_var_declaration.add(var_declaration52.getTree());
					}
					break;

				default :
					break loop8;
				}
			}

			// AST REWRITE
			// elements: var_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 385:26: -> ^( VAR_DECL_LIST ( var_declaration )* )
			{
				// Tiger.g:385:29: ^( VAR_DECL_LIST ( var_declaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECL_LIST, "VAR_DECL_LIST"), root_1);
				// Tiger.g:385:45: ( var_declaration )*
				while ( stream_var_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_var_declaration.nextTree());
				}
				stream_var_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_declaration_list"


	public static class type_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_declaration"
	// Tiger.g:388:1: type_declaration : TYPE Identifier EQ type SEMI -> ^( TYPE_DECL Identifier EQ type ) ;
	public final TigerParser.type_declaration_return type_declaration() throws RecognitionException {
		TigerParser.type_declaration_return retval = new TigerParser.type_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPE53=null;
		Token Identifier54=null;
		Token EQ55=null;
		Token SEMI57=null;
		ParserRuleReturnScope type56 =null;

		Object TYPE53_tree=null;
		Object Identifier54_tree=null;
		Object EQ55_tree=null;
		Object SEMI57_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Tiger.g:389:5: ( TYPE Identifier EQ type SEMI -> ^( TYPE_DECL Identifier EQ type ) )
			// Tiger.g:389:7: TYPE Identifier EQ type SEMI
			{
			TYPE53=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_declaration1689);  
			stream_TYPE.add(TYPE53);

			Identifier54=(Token)match(input,Identifier,FOLLOW_Identifier_in_type_declaration1691);  
			stream_Identifier.add(Identifier54);

			EQ55=(Token)match(input,EQ,FOLLOW_EQ_in_type_declaration1693);  
			stream_EQ.add(EQ55);

			pushFollow(FOLLOW_type_in_type_declaration1695);
			type56=type();
			state._fsp--;

			stream_type.add(type56.getTree());
			SEMI57=(Token)match(input,SEMI,FOLLOW_SEMI_in_type_declaration1697);  
			stream_SEMI.add(SEMI57);


			    	if (st.lookupCurrentScope((Identifier54!=null?Identifier54.getText():null)) == null) {
			    		Type dt = null;
			    		if ((type56!=null?((TigerParser.type_return)type56).isBase:0) == 1) {
			    			if ((type56!=null?((TigerParser.type_return)type56).txt:null).equals("int")) {
			    				dt = new DefinedType(new Type("int"));
			    			} else {
			    				dt = new DefinedType(new Type("fixedpt"));
			    			}
			    		} else {
			    			Type bt = null;
			    			if ((type56!=null?((TigerParser.type_return)type56).txt:null).equals("int")) {
			    				bt = new Type("int");
			    			} else {
			    				bt = new Type("fixedpt");
			    			}
			    			if ((type56!=null?((TigerParser.type_return)type56).is2D:0) == 0) {
			    				dt = new DefinedType(new Array("oneDarray", bt, (type56!=null?((TigerParser.type_return)type56).w:0)));
			    			} else {
			    				dt = new DefinedType(new Array("twoDarray", bt, (type56!=null?((TigerParser.type_return)type56).w:0), (type56!=null?((TigerParser.type_return)type56).h:0), true));
			    			}
			    		}
			    		dt.setIdentifier((Identifier54!=null?Identifier54.getText():null));
			    		st.insert((Identifier54!=null?Identifier54.getText():null), dt);
			    	} else {
			    		throw new IllegalArgumentException("Type name has already been defined.");
			    	}
			    
			// AST REWRITE
			// elements: Identifier, EQ, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 418:6: -> ^( TYPE_DECL Identifier EQ type )
			{
				// Tiger.g:418:9: ^( TYPE_DECL Identifier EQ type )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_DECL, "TYPE_DECL"), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_EQ.nextNode());
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_declaration"


	public static class type_return extends ParserRuleReturnScope {
		public int isBase;
		public String txt;
		public int w;
		public int h;
		public int is2D;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Tiger.g:421:1: type returns [int isBase, String txt, int w, int h, int is2D] : (t1= base_type | ARRAY ^ LBRACK ! IntegerLiteral RBRACK ! arr_brack OF t2= base_type );
	public final TigerParser.type_return type() throws RecognitionException {
		TigerParser.type_return retval = new TigerParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ARRAY58=null;
		Token LBRACK59=null;
		Token IntegerLiteral60=null;
		Token RBRACK61=null;
		Token OF63=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;
		ParserRuleReturnScope arr_brack62 =null;

		Object ARRAY58_tree=null;
		Object LBRACK59_tree=null;
		Object IntegerLiteral60_tree=null;
		Object RBRACK61_tree=null;
		Object OF63_tree=null;

		try {
			// Tiger.g:422:5: (t1= base_type | ARRAY ^ LBRACK ! IntegerLiteral RBRACK ! arr_brack OF t2= base_type )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FIXEDPT||LA9_0==INT) ) {
				alt9=1;
			}
			else if ( (LA9_0==ARRAY) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// Tiger.g:422:9: t1= base_type
					{
					root_0 = (Object)adaptor.nil();


					retval.w = -1; retval.h = -1; retval.txt = ""; retval.is2D = -1;
					pushFollow(FOLLOW_base_type_in_type1752);
					t1=base_type();
					state._fsp--;

					adaptor.addChild(root_0, t1.getTree());

					retval.isBase = 1; retval.txt = (t1!=null?((TigerParser.base_type_return)t1).txt:null);
					}
					break;
				case 2 :
					// Tiger.g:424:9: ARRAY ^ LBRACK ! IntegerLiteral RBRACK ! arr_brack OF t2= base_type
					{
					root_0 = (Object)adaptor.nil();


					ARRAY58=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type1764); 
					ARRAY58_tree = (Object)adaptor.create(ARRAY58);
					root_0 = (Object)adaptor.becomeRoot(ARRAY58_tree, root_0);

					LBRACK59=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_type1767); 
					IntegerLiteral60=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_type1770); 
					IntegerLiteral60_tree = (Object)adaptor.create(IntegerLiteral60);
					adaptor.addChild(root_0, IntegerLiteral60_tree);

					RBRACK61=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_type1772); 
					pushFollow(FOLLOW_arr_brack_in_type1775);
					arr_brack62=arr_brack();
					state._fsp--;

					adaptor.addChild(root_0, arr_brack62.getTree());

					OF63=(Token)match(input,OF,FOLLOW_OF_in_type1777); 
					OF63_tree = (Object)adaptor.create(OF63);
					adaptor.addChild(root_0, OF63_tree);

					pushFollow(FOLLOW_base_type_in_type1783);
					t2=base_type();
					state._fsp--;

					adaptor.addChild(root_0, t2.getTree());


					    	retval.is2D = (arr_brack62!=null?((TigerParser.arr_brack_return)arr_brack62).is2D:0);
					    	retval.isBase = 0;
					    	retval.txt = (t2!=null?((TigerParser.base_type_return)t2).txt:null);
					    	if ((arr_brack62!=null?((TigerParser.arr_brack_return)arr_brack62).is2D:0) == 0) {
					    		retval.w = Integer.parseInt((IntegerLiteral60!=null?IntegerLiteral60.getText():null));
					    	} else {
					    		retval.w = Integer.parseInt((IntegerLiteral60!=null?IntegerLiteral60.getText():null));
					    		retval.h = (arr_brack62!=null?((TigerParser.arr_brack_return)arr_brack62).h:0);
					    	}
					    
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class arr_brack_return extends ParserRuleReturnScope {
		public int is2D;
		public int h;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arr_brack"
	// Tiger.g:438:1: arr_brack returns [int is2D, int h] : ( ( LBRACK ! IntegerLiteral RBRACK !) |);
	public final TigerParser.arr_brack_return arr_brack() throws RecognitionException {
		TigerParser.arr_brack_return retval = new TigerParser.arr_brack_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK64=null;
		Token IntegerLiteral65=null;
		Token RBRACK66=null;

		Object LBRACK64_tree=null;
		Object IntegerLiteral65_tree=null;
		Object RBRACK66_tree=null;

		try {
			// Tiger.g:439:5: ( ( LBRACK ! IntegerLiteral RBRACK !) |)
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==LBRACK) ) {
				alt10=1;
			}
			else if ( (LA10_0==OF) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// Tiger.g:439:6: ( LBRACK ! IntegerLiteral RBRACK !)
					{
					root_0 = (Object)adaptor.nil();


					retval.h = -1;
					// Tiger.g:440:5: ( LBRACK ! IntegerLiteral RBRACK !)
					// Tiger.g:440:6: LBRACK ! IntegerLiteral RBRACK !
					{
					LBRACK64=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arr_brack1816); 
					IntegerLiteral65=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_arr_brack1819); 
					IntegerLiteral65_tree = (Object)adaptor.create(IntegerLiteral65);
					adaptor.addChild(root_0, IntegerLiteral65_tree);

					RBRACK66=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_arr_brack1821); 
					}


					    	retval.is2D = 1;
					    	retval.h = Integer.parseInt((IntegerLiteral65!=null?IntegerLiteral65.getText():null));
					    
					}
					break;
				case 2 :
					// Tiger.g:445:7: 
					{
					root_0 = (Object)adaptor.nil();


					retval.is2D = 0;
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arr_brack"


	public static class type_id_return extends ParserRuleReturnScope {
		public String txt;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_id"
	// Tiger.g:448:1: type_id returns [String txt] : ( base_type | Identifier );
	public final TigerParser.type_id_return type_id() throws RecognitionException {
		TigerParser.type_id_return retval = new TigerParser.type_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier68=null;
		ParserRuleReturnScope base_type67 =null;

		Object Identifier68_tree=null;

		try {
			// Tiger.g:449:5: ( base_type | Identifier )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==FIXEDPT||LA11_0==INT) ) {
				alt11=1;
			}
			else if ( (LA11_0==Identifier) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// Tiger.g:449:9: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type_id1860);
					base_type67=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type67.getTree());

					retval.txt = (base_type67!=null?((TigerParser.base_type_return)base_type67).txt:null);
					}
					break;
				case 2 :
					// Tiger.g:450:9: Identifier
					{
					root_0 = (Object)adaptor.nil();


					Identifier68=(Token)match(input,Identifier,FOLLOW_Identifier_in_type_id1872); 
					Identifier68_tree = (Object)adaptor.create(Identifier68);
					adaptor.addChild(root_0, Identifier68_tree);

					retval.txt = (Identifier68!=null?Identifier68.getText():null);
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_id"


	public static class base_type_return extends ParserRuleReturnScope {
		public String txt;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "base_type"
	// Tiger.g:453:1: base_type returns [String txt] : ( INT | FIXEDPT );
	public final TigerParser.base_type_return base_type() throws RecognitionException {
		TigerParser.base_type_return retval = new TigerParser.base_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT69=null;
		Token FIXEDPT70=null;

		Object INT69_tree=null;
		Object FIXEDPT70_tree=null;

		try {
			// Tiger.g:454:5: ( INT | FIXEDPT )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==INT) ) {
				alt12=1;
			}
			else if ( (LA12_0==FIXEDPT) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// Tiger.g:454:9: INT
					{
					root_0 = (Object)adaptor.nil();


					INT69=(Token)match(input,INT,FOLLOW_INT_in_base_type1897); 
					INT69_tree = (Object)adaptor.create(INT69);
					adaptor.addChild(root_0, INT69_tree);

					retval.txt = "int";
					}
					break;
				case 2 :
					// Tiger.g:455:9: FIXEDPT
					{
					root_0 = (Object)adaptor.nil();


					FIXEDPT70=(Token)match(input,FIXEDPT,FOLLOW_FIXEDPT_in_base_type1909); 
					FIXEDPT70_tree = (Object)adaptor.create(FIXEDPT70);
					adaptor.addChild(root_0, FIXEDPT70_tree);

					retval.txt = "fixedpt";
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "base_type"


	public static class var_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_declaration"
	// Tiger.g:458:1: var_declaration : id_list COLON type_id optional_init SEMI -> ^( VAR_DECL id_list type_id ( optional_init )? ) ;
	public final TigerParser.var_declaration_return var_declaration() throws RecognitionException {
		TigerParser.var_declaration_return retval = new TigerParser.var_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COLON72=null;
		Token SEMI75=null;
		ParserRuleReturnScope id_list71 =null;
		ParserRuleReturnScope type_id73 =null;
		ParserRuleReturnScope optional_init74 =null;

		Object COLON72_tree=null;
		Object SEMI75_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_optional_init=new RewriteRuleSubtreeStream(adaptor,"rule optional_init");

		try {
			// Tiger.g:459:5: ( id_list COLON type_id optional_init SEMI -> ^( VAR_DECL id_list type_id ( optional_init )? ) )
			// Tiger.g:459:9: id_list COLON type_id optional_init SEMI
			{
			pushFollow(FOLLOW_id_list_in_var_declaration1930);
			id_list71=id_list();
			state._fsp--;

			stream_id_list.add(id_list71.getTree());
			COLON72=(Token)match(input,COLON,FOLLOW_COLON_in_var_declaration1932);  
			stream_COLON.add(COLON72);

			pushFollow(FOLLOW_type_id_in_var_declaration1934);
			type_id73=type_id();
			state._fsp--;

			stream_type_id.add(type_id73.getTree());
			   
			            Type curr = null;
			            if ((type_id73!=null?((TigerParser.type_id_return)type_id73).txt:null).equals("int")) {
			                curr = new Type("int");
			            } else if ((type_id73!=null?((TigerParser.type_id_return)type_id73).txt:null).equals("fixedpt")) {
			                curr = new Type("fixedpt");
			            } else {
			                if (st.lookup((type_id73!=null?((TigerParser.type_id_return)type_id73).txt:null)) != null) {
			                    if (st.lookup((type_id73!=null?((TigerParser.type_id_return)type_id73).txt:null)).getTypeName().equals("definedtype")
			                    	&& st.lookup((type_id73!=null?((TigerParser.type_id_return)type_id73).txt:null)).getIsVar() == false) {
			                        curr = st.lookup((type_id73!=null?((TigerParser.type_id_return)type_id73).txt:null)).getCopy();
			                    } else {
			                    	throw new IllegalArgumentException("Illegal variable type.");
			                    }
			                } else {
			                	throw new IllegalArgumentException("Illegal variable type.");
			                }
			            }
			            curr.setIsVar(true);
			            for (String s : (id_list71!=null?((TigerParser.id_list_return)id_list71).idlist:null)) {
			                if (st.lookupCurrentScope(s) == null) {
			                    st.insert(s, curr);
			                } else {
								throw new IllegalArgumentException("Variable name has already been defined.");
			                }
			            }
			        
			pushFollow(FOLLOW_optional_init_in_var_declaration1954);
			optional_init74=optional_init();
			state._fsp--;

			stream_optional_init.add(optional_init74.getTree());
			SEMI75=(Token)match(input,SEMI,FOLLOW_SEMI_in_var_declaration1956);  
			stream_SEMI.add(SEMI75);

			// AST REWRITE
			// elements: optional_init, type_id, id_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 487:28: -> ^( VAR_DECL id_list type_id ( optional_init )? )
			{
				// Tiger.g:487:31: ^( VAR_DECL id_list type_id ( optional_init )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
				adaptor.addChild(root_1, stream_id_list.nextTree());
				adaptor.addChild(root_1, stream_type_id.nextTree());
				// Tiger.g:487:58: ( optional_init )?
				if ( stream_optional_init.hasNext() ) {
					adaptor.addChild(root_1, stream_optional_init.nextTree());
				}
				stream_optional_init.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_declaration"


	public static class id_list_return extends ParserRuleReturnScope {
		public ArrayList<String> idlist;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "id_list"
	// Tiger.g:490:1: id_list returns [ArrayList<String> idlist] : VAR (id1= Identifier ) ( COMMA (id2= Identifier ) )* -> ^( VAR ( Identifier )+ ) ;
	public final TigerParser.id_list_return id_list() throws RecognitionException {
		TigerParser.id_list_return retval = new TigerParser.id_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token id1=null;
		Token id2=null;
		Token VAR76=null;
		Token COMMA77=null;

		Object id1_tree=null;
		Object id2_tree=null;
		Object VAR76_tree=null;
		Object COMMA77_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");

		try {
			// Tiger.g:491:5: ( VAR (id1= Identifier ) ( COMMA (id2= Identifier ) )* -> ^( VAR ( Identifier )+ ) )
			// Tiger.g:491:9: VAR (id1= Identifier ) ( COMMA (id2= Identifier ) )*
			{
			retval.idlist = new ArrayList<>();
			VAR76=(Token)match(input,VAR,FOLLOW_VAR_in_id_list2002);  
			stream_VAR.add(VAR76);

			// Tiger.g:492:13: (id1= Identifier )
			// Tiger.g:492:14: id1= Identifier
			{
			id1=(Token)match(input,Identifier,FOLLOW_Identifier_in_id_list2009);  
			stream_Identifier.add(id1);

			retval.idlist.add((id1!=null?id1.getText():null));
			}

			// Tiger.g:492:58: ( COMMA (id2= Identifier ) )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Tiger.g:492:59: COMMA (id2= Identifier )
					{
					COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_id_list2015);  
					stream_COMMA.add(COMMA77);

					// Tiger.g:492:65: (id2= Identifier )
					// Tiger.g:492:66: id2= Identifier
					{
					id2=(Token)match(input,Identifier,FOLLOW_Identifier_in_id_list2022);  
					stream_Identifier.add(id2);

					retval.idlist.add((id2!=null?id2.getText():null));
					}

					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: VAR, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 492:111: -> ^( VAR ( Identifier )+ )
			{
				// Tiger.g:492:114: ^( VAR ( Identifier )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "id_list"


	public static class optional_init_return extends ParserRuleReturnScope {
		public boolean isInt;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optional_init"
	// Tiger.g:495:1: optional_init returns [boolean isInt] : ( ASSIGN ^ constant |);
	public final TigerParser.optional_init_return optional_init() throws RecognitionException {
		TigerParser.optional_init_return retval = new TigerParser.optional_init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN78=null;
		ParserRuleReturnScope constant79 =null;

		Object ASSIGN78_tree=null;

		try {
			// Tiger.g:496:5: ( ASSIGN ^ constant |)
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ASSIGN) ) {
				alt14=1;
			}
			else if ( (LA14_0==SEMI) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// Tiger.g:496:9: ASSIGN ^ constant
					{
					root_0 = (Object)adaptor.nil();


					ASSIGN78=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_init2058); 
					ASSIGN78_tree = (Object)adaptor.create(ASSIGN78);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN78_tree, root_0);

					pushFollow(FOLLOW_constant_in_optional_init2061);
					constant79=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant79.getTree());

					retval.isInt = (constant79!=null?((TigerParser.constant_return)constant79).isInt:false);
					}
					break;
				case 2 :
					// Tiger.g:498:5: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optional_init"


	public static class stat_seq_return extends ParserRuleReturnScope {
		public Type rt;
		public boolean ifreturn;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat_seq"
	// Tiger.g:500:1: stat_seq returns [Type rt, boolean ifreturn] : ( stat )+ -> ^( STAT_SEQ ( stat )+ ) ;
	public final TigerParser.stat_seq_return stat_seq() throws RecognitionException {
		TigerParser.stat_seq_return retval = new TigerParser.stat_seq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat80 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// Tiger.g:501:5: ( ( stat )+ -> ^( STAT_SEQ ( stat )+ ) )
			// Tiger.g:501:7: ( stat )+
			{
			retval.rt = null;
			    retval.ifreturn =false;
			// Tiger.g:503:5: ( stat )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==BEGIN||LA15_0==BREAK||LA15_0==FOR||LA15_0==IF||LA15_0==Identifier||LA15_0==RETURN||LA15_0==WHILE) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// Tiger.g:503:6: stat
					{
					pushFollow(FOLLOW_stat_in_stat_seq2098);
					stat80=stat();
					state._fsp--;

					stream_stat.add(stat80.getTree());
						
					    	if (retval.ifreturn) {
					    		System.out.println("Return is not at the end of a function");
					    	}
					    	retval.rt = (stat80!=null?((TigerParser.stat_return)stat80).rt:null);
					    	if (retval.rt == null) {
					    		retval.ifreturn = false;
					    	} else {
					    		retval.ifreturn = true;
					    	}
					    
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			// AST REWRITE
			// elements: stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 514:9: -> ^( STAT_SEQ ( stat )+ )
			{
				// Tiger.g:514:12: ^( STAT_SEQ ( stat )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STAT_SEQ, "STAT_SEQ"), root_1);
				if ( !(stream_stat.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_stat.hasNext() ) {
					adaptor.addChild(root_1, stream_stat.nextTree());
				}
				stream_stat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat_seq"


	public static class stat_return extends ParserRuleReturnScope {
		public Type rt;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// Tiger.g:517:1: stat returns [Type rt] : ( if_else_expr | WHILE ^ while_condition DO ! stat_seq ENDDO ! SEMI !| FOR ^ for_expr DO ! stat_seq ENDDO ! SEMI !| Identifier ^ ( assign_stmt | argument_list ) SEMI !| BREAK SEMI !| RETURN ^ expr SEMI !| block );
	public final TigerParser.stat_return stat() throws RecognitionException {
		TigerParser.stat_return retval = new TigerParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE82=null;
		Token DO84=null;
		Token ENDDO86=null;
		Token SEMI87=null;
		Token FOR88=null;
		Token DO90=null;
		Token ENDDO92=null;
		Token SEMI93=null;
		Token Identifier94=null;
		Token SEMI97=null;
		Token BREAK98=null;
		Token SEMI99=null;
		Token RETURN100=null;
		Token SEMI102=null;
		ParserRuleReturnScope if_else_expr81 =null;
		ParserRuleReturnScope while_condition83 =null;
		ParserRuleReturnScope stat_seq85 =null;
		ParserRuleReturnScope for_expr89 =null;
		ParserRuleReturnScope stat_seq91 =null;
		ParserRuleReturnScope assign_stmt95 =null;
		ParserRuleReturnScope argument_list96 =null;
		ParserRuleReturnScope expr101 =null;
		ParserRuleReturnScope block103 =null;

		Object WHILE82_tree=null;
		Object DO84_tree=null;
		Object ENDDO86_tree=null;
		Object SEMI87_tree=null;
		Object FOR88_tree=null;
		Object DO90_tree=null;
		Object ENDDO92_tree=null;
		Object SEMI93_tree=null;
		Object Identifier94_tree=null;
		Object SEMI97_tree=null;
		Object BREAK98_tree=null;
		Object SEMI99_tree=null;
		Object RETURN100_tree=null;
		Object SEMI102_tree=null;

		try {
			// Tiger.g:518:5: ( if_else_expr | WHILE ^ while_condition DO ! stat_seq ENDDO ! SEMI !| FOR ^ for_expr DO ! stat_seq ENDDO ! SEMI !| Identifier ^ ( assign_stmt | argument_list ) SEMI !| BREAK SEMI !| RETURN ^ expr SEMI !| block )
			int alt17=7;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt17=1;
				}
				break;
			case WHILE:
				{
				alt17=2;
				}
				break;
			case FOR:
				{
				alt17=3;
				}
				break;
			case Identifier:
				{
				alt17=4;
				}
				break;
			case BREAK:
				{
				alt17=5;
				}
				break;
			case RETURN:
				{
				alt17=6;
				}
				break;
			case BEGIN:
				{
				alt17=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// Tiger.g:518:7: if_else_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_else_expr_in_stat2136);
					if_else_expr81=if_else_expr();
					state._fsp--;

					adaptor.addChild(root_0, if_else_expr81.getTree());

					}
					break;
				case 2 :
					// Tiger.g:519:9: WHILE ^ while_condition DO ! stat_seq ENDDO ! SEMI !
					{
					root_0 = (Object)adaptor.nil();


					WHILE82=(Token)match(input,WHILE,FOLLOW_WHILE_in_stat2146); 
					WHILE82_tree = (Object)adaptor.create(WHILE82);
					root_0 = (Object)adaptor.becomeRoot(WHILE82_tree, root_0);

					pushFollow(FOLLOW_while_condition_in_stat2149);
					while_condition83=while_condition();
					state._fsp--;

					adaptor.addChild(root_0, while_condition83.getTree());

					DO84=(Token)match(input,DO,FOLLOW_DO_in_stat2151); 
					pushFollow(FOLLOW_stat_seq_in_stat2154);
					stat_seq85=stat_seq();
					state._fsp--;

					adaptor.addChild(root_0, stat_seq85.getTree());

					ENDDO86=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat2156); 
					SEMI87=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat2159); 
					}
					break;
				case 3 :
					// Tiger.g:520:9: FOR ^ for_expr DO ! stat_seq ENDDO ! SEMI !
					{
					root_0 = (Object)adaptor.nil();


					FOR88=(Token)match(input,FOR,FOLLOW_FOR_in_stat2170); 
					FOR88_tree = (Object)adaptor.create(FOR88);
					root_0 = (Object)adaptor.becomeRoot(FOR88_tree, root_0);

					pushFollow(FOLLOW_for_expr_in_stat2173);
					for_expr89=for_expr();
					state._fsp--;

					adaptor.addChild(root_0, for_expr89.getTree());

					DO90=(Token)match(input,DO,FOLLOW_DO_in_stat2175); 
					pushFollow(FOLLOW_stat_seq_in_stat2178);
					stat_seq91=stat_seq();
					state._fsp--;

					adaptor.addChild(root_0, stat_seq91.getTree());

					ENDDO92=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat2180); 
					SEMI93=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat2183); 
					}
					break;
				case 4 :
					// Tiger.g:521:7: Identifier ^ ( assign_stmt | argument_list ) SEMI !
					{
					root_0 = (Object)adaptor.nil();


					Identifier94=(Token)match(input,Identifier,FOLLOW_Identifier_in_stat2192); 
					Identifier94_tree = (Object)adaptor.create(Identifier94);
					root_0 = (Object)adaptor.becomeRoot(Identifier94_tree, root_0);

					// Tiger.g:521:19: ( assign_stmt | argument_list )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==AND||LA16_0==ASSIGN||LA16_0==COMMA||(LA16_0 >= DIV && LA16_0 <= DO)||LA16_0==EQ||(LA16_0 >= GREATER && LA16_0 <= GREATEREQ)||(LA16_0 >= LBRACK && LA16_0 <= LESSEREQ)||(LA16_0 >= MINUS && LA16_0 <= NEQ)||LA16_0==OR||LA16_0==PLUS||(LA16_0 >= RPAREN && LA16_0 <= SEMI)||LA16_0==THEN) ) {
						alt16=1;
					}
					else if ( (LA16_0==LPAREN) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// Tiger.g:521:20: assign_stmt
							{
							pushFollow(FOLLOW_assign_stmt_in_stat2196);
							assign_stmt95=assign_stmt();
							state._fsp--;

							adaptor.addChild(root_0, assign_stmt95.getTree());


							    	Type curr = null;
							    	if (st.lookup((Identifier94!=null?Identifier94.getText():null)) == null) {
							    		throw new IllegalArgumentException("Undefined variable.");
							    	} else {
							    		if ((assign_stmt95!=null?((TigerParser.assign_stmt_return)assign_stmt95).is1D:false) && (assign_stmt95!=null?((TigerParser.assign_stmt_return)assign_stmt95).is2D:false)) {
							    			if (!(st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("definedtype")
							    				&& ((DefinedType) st.lookup((Identifier94!=null?Identifier94.getText():null))).getBaseType().getTypeName().equals("twoDarray")
							    				&& st.lookup((Identifier94!=null?Identifier94.getText():null)).getIsVar() == true)) {
							    				throw new IllegalArgumentException("Illegal variable type.");
							    			} else {
							    				curr = ((DefinedType) st.lookup((Identifier94!=null?Identifier94.getText():null))).getBaseType().getBaseType();
							    			}
							    		} else if ((assign_stmt95!=null?((TigerParser.assign_stmt_return)assign_stmt95).is1D:false)) {
							    			if (!(st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("definedtype")
							    				&& st.lookup((Identifier94!=null?Identifier94.getText():null)).getBaseType().getTypeName().equals("oneDarray")
							    				&& st.lookup((Identifier94!=null?Identifier94.getText():null)).getIsVar() == true)) {
							    				throw new IllegalArgumentException("Illegal variable type.");
							    			} else {
							    				curr = ((DefinedType) st.lookup((Identifier94!=null?Identifier94.getText():null))).getBaseType().getBaseType();
							    			}
							    		} else {
							    			if (!(st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("int")
							    				|| st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("fixedpt")
							    				|| (st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("definedtype")
							    				&& ((DefinedType) st.lookup((Identifier94!=null?Identifier94.getText():null))).getBaseType().getTypeName().equals("int")
							    				&& st.lookup((Identifier94!=null?Identifier94.getText():null)).getIsVar() == true)
							    				|| (st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("definedtype")
							    				&& ((DefinedType) st.lookup((Identifier94!=null?Identifier94.getText():null))).getBaseType().getTypeName().equals("fixedpt")
							    				&& st.lookup((Identifier94!=null?Identifier94.getText():null)).getIsVar() == true)
							    				|| (st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("definedtype")
							    				&& ((DefinedType) st.lookup((Identifier94!=null?Identifier94.getText():null))).getBaseType().getTypeName().equals("twoDarray")
							   					&& st.lookup((Identifier94!=null?Identifier94.getText():null)).getIsVar() == true)
							    				|| (st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("definedtype")
							    				&& ((DefinedType) st.lookup((Identifier94!=null?Identifier94.getText():null))).getBaseType().getTypeName().equals("oneDarray")
							    				&& st.lookup((Identifier94!=null?Identifier94.getText():null)).getIsVar() == true))) {
							    				throw new IllegalArgumentException("Illegal variable type."); 
							   				} else if ((st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("definedtype")
							    				&& ((DefinedType) st.lookup((Identifier94!=null?Identifier94.getText():null))).getBaseType().getTypeName().equals("int")
							    				&& st.lookup((Identifier94!=null?Identifier94.getText():null)).getIsVar() == true)
							    				|| (st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("definedtype")
							   					&& ((DefinedType) st.lookup((Identifier94!=null?Identifier94.getText():null))).getBaseType().getTypeName().equals("fixedpt")
							   					&& st.lookup((Identifier94!=null?Identifier94.getText():null)).getIsVar() == true)) {
							   					curr = st.lookup((Identifier94!=null?Identifier94.getText():null));
							    			} else if (st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("int")) {
							    				curr = new Type("int");
							    			} else if (st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("fixedpt")) {
							    				curr = new Type("fixedpt");
							   				} else {
							   					curr = st.lookup((Identifier94!=null?Identifier94.getText():null));
							    			}
							    		}
							    	}
							    	if (!curr.equals((assign_stmt95!=null?((TigerParser.assign_stmt_return)assign_stmt95).atype:null))
							    		&& !(curr.getTypeName().equals("fixedpt") && (assign_stmt95!=null?((TigerParser.assign_stmt_return)assign_stmt95).atype:null).getTypeName().equals("int"))) {
										throw new IllegalArgumentException("Type conflict.");
							    	}
							    
							}
							break;
						case 2 :
							// Tiger.g:579:8: argument_list
							{
							pushFollow(FOLLOW_argument_list_in_stat2205);
							argument_list96=argument_list();
							state._fsp--;

							adaptor.addChild(root_0, argument_list96.getTree());


							    	if (st.lookup((Identifier94!=null?Identifier94.getText():null)) == null) {
							    		String name = (Identifier94!=null?Identifier94.getText():null);
							    		if (!(name.equals("printi") || name.equals("printf") || name.equals("readi") || name.equals("readf"))) {
							    			throw new IllegalArgumentException("Undefined function.");
							    		}
							    	} else {
							    		if (!st.lookup((Identifier94!=null?Identifier94.getText():null)).getTypeName().equals("function")) {
							    			throw new IllegalArgumentException("Undefined function.");
							    		} else {
							    			if ((argument_list96!=null?((TigerParser.argument_list_return)argument_list96).pm:null).size() != ((Function) st.lookup((Identifier94!=null?Identifier94.getText():null))).getParamList().size()) {
							    				throw new IllegalArgumentException("Number of parameters doesn't match.");
							    			} else {
							    				for (int i = 0; i < (argument_list96!=null?((TigerParser.argument_list_return)argument_list96).pm:null).size(); i++) {
							    					if (!((Function) st.lookup((Identifier94!=null?Identifier94.getText():null))).getParamList().get(i).equals((argument_list96!=null?((TigerParser.argument_list_return)argument_list96).pm:null).get(i))) {
							    						throw new IllegalArgumentException("Type conflict.");
							    					}
							    				}
							    			}
							    		}
							    	}
							    
							}
							break;

					}

					SEMI97=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat2214); 
					}
					break;
				case 5 :
					// Tiger.g:602:9: BREAK SEMI !
					{
					root_0 = (Object)adaptor.nil();


					BREAK98=(Token)match(input,BREAK,FOLLOW_BREAK_in_stat2225); 
					BREAK98_tree = (Object)adaptor.create(BREAK98);
					adaptor.addChild(root_0, BREAK98_tree);

					SEMI99=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat2227); 
					}
					break;
				case 6 :
					// Tiger.g:603:9: RETURN ^ expr SEMI !
					{
					root_0 = (Object)adaptor.nil();


					RETURN100=(Token)match(input,RETURN,FOLLOW_RETURN_in_stat2238); 
					RETURN100_tree = (Object)adaptor.create(RETURN100);
					root_0 = (Object)adaptor.becomeRoot(RETURN100_tree, root_0);

					pushFollow(FOLLOW_expr_in_stat2241);
					expr101=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr101.getTree());


					    	if ((expr101!=null?((TigerParser.expr_return)expr101).iscomp:false)) {
					    		throw new IllegalArgumentException("Illegal Expression");
					    	} else {
					    		retval.rt = (expr101!=null?((TigerParser.expr_return)expr101).atype:null);
					    	}
					    
					SEMI102=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat2250); 
					}
					break;
				case 7 :
					// Tiger.g:611:9: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat2261);
					block103=block();
					state._fsp--;

					adaptor.addChild(root_0, block103.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class for_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_expr"
	// Tiger.g:614:1: for_expr : Identifier ASSIGN index_expr TO index_expr -> ^( Identifier index_expr TO index_expr ) ;
	public final TigerParser.for_expr_return for_expr() throws RecognitionException {
		TigerParser.for_expr_return retval = new TigerParser.for_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier104=null;
		Token ASSIGN105=null;
		Token TO107=null;
		ParserRuleReturnScope index_expr106 =null;
		ParserRuleReturnScope index_expr108 =null;

		Object Identifier104_tree=null;
		Object ASSIGN105_tree=null;
		Object TO107_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// Tiger.g:615:6: ( Identifier ASSIGN index_expr TO index_expr -> ^( Identifier index_expr TO index_expr ) )
			// Tiger.g:615:8: Identifier ASSIGN index_expr TO index_expr
			{
			Identifier104=(Token)match(input,Identifier,FOLLOW_Identifier_in_for_expr2283);  
			stream_Identifier.add(Identifier104);

			ASSIGN105=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_for_expr2285);  
			stream_ASSIGN.add(ASSIGN105);

			pushFollow(FOLLOW_index_expr_in_for_expr2287);
			index_expr106=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr106.getTree());
			TO107=(Token)match(input,TO,FOLLOW_TO_in_for_expr2289);  
			stream_TO.add(TO107);

			pushFollow(FOLLOW_index_expr_in_for_expr2291);
			index_expr108=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr108.getTree());

			    			if (st.lookup((Identifier104!=null?Identifier104.getText():null)) != null) {
			    				if (!st.lookup((Identifier104!=null?Identifier104.getText():null)).getTypeName().equals("int")) {
			    					throw new IllegalArgumentException("Illegal variable type.");
			    				}
			    			} else {
			    				throw new IllegalArgumentException("Undefined variable.");
			    			}
			    		
			// AST REWRITE
			// elements: index_expr, Identifier, index_expr, TO
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 625:7: -> ^( Identifier index_expr TO index_expr )
			{
				// Tiger.g:625:10: ^( Identifier index_expr TO index_expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_Identifier.nextNode(), root_1);
				adaptor.addChild(root_1, stream_index_expr.nextTree());
				adaptor.addChild(root_1, stream_TO.nextNode());
				adaptor.addChild(root_1, stream_index_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_expr"


	public static class while_condition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while_condition"
	// Tiger.g:628:1: while_condition : expr -> ^( W_CONDITION expr ) ;
	public final TigerParser.while_condition_return while_condition() throws RecognitionException {
		TigerParser.while_condition_return retval = new TigerParser.while_condition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr109 =null;

		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Tiger.g:629:2: ( expr -> ^( W_CONDITION expr ) )
			// Tiger.g:629:4: expr
			{
			pushFollow(FOLLOW_expr_in_while_condition2337);
			expr109=expr();
			state._fsp--;

			stream_expr.add(expr109.getTree());

					if (!(expr109!=null?((TigerParser.expr_return)expr109).iscomp:false)) {
						throw new IllegalArgumentException("The expression does not return a boolean.");
					}
				
			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 635:3: -> ^( W_CONDITION expr )
			{
				// Tiger.g:635:6: ^( W_CONDITION expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(W_CONDITION, "W_CONDITION"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while_condition"


	public static class argument_list_return extends ParserRuleReturnScope {
		public ArrayList<Type> pm;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "argument_list"
	// Tiger.g:638:1: argument_list returns [ArrayList<Type> pm] : LPAREN expr_list RPAREN -> ^( FUNCT_ARGUMENT_LIST ( expr_list )? ) ;
	public final TigerParser.argument_list_return argument_list() throws RecognitionException {
		TigerParser.argument_list_return retval = new TigerParser.argument_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN110=null;
		Token RPAREN112=null;
		ParserRuleReturnScope expr_list111 =null;

		Object LPAREN110_tree=null;
		Object RPAREN112_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");

		try {
			// Tiger.g:639:2: ( LPAREN expr_list RPAREN -> ^( FUNCT_ARGUMENT_LIST ( expr_list )? ) )
			// Tiger.g:639:4: LPAREN expr_list RPAREN
			{
			LPAREN110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argument_list2367);  
			stream_LPAREN.add(LPAREN110);

			pushFollow(FOLLOW_expr_list_in_argument_list2369);
			expr_list111=expr_list();
			state._fsp--;

			stream_expr_list.add(expr_list111.getTree());
			retval.pm = (expr_list111!=null?((TigerParser.expr_list_return)expr_list111).pm:null);
			RPAREN112=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argument_list2373);  
			stream_RPAREN.add(RPAREN112);

			// AST REWRITE
			// elements: expr_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 639:51: -> ^( FUNCT_ARGUMENT_LIST ( expr_list )? )
			{
				// Tiger.g:639:54: ^( FUNCT_ARGUMENT_LIST ( expr_list )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCT_ARGUMENT_LIST, "FUNCT_ARGUMENT_LIST"), root_1);
				// Tiger.g:639:76: ( expr_list )?
				if ( stream_expr_list.hasNext() ) {
					adaptor.addChild(root_1, stream_expr_list.nextTree());
				}
				stream_expr_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "argument_list"


	public static class assign_stmt_return extends ParserRuleReturnScope {
		public boolean is1D;
		public boolean is2D;
		public Type atype;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign_stmt"
	// Tiger.g:642:1: assign_stmt returns [boolean is1D, boolean is2D, Type atype] : value_tail assign_stmt_tail -> ^( ASSIGN_STMT ( value_tail )? assign_stmt_tail ) ;
	public final TigerParser.assign_stmt_return assign_stmt() throws RecognitionException {
		TigerParser.assign_stmt_return retval = new TigerParser.assign_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope value_tail113 =null;
		ParserRuleReturnScope assign_stmt_tail114 =null;

		RewriteRuleSubtreeStream stream_assign_stmt_tail=new RewriteRuleSubtreeStream(adaptor,"rule assign_stmt_tail");
		RewriteRuleSubtreeStream stream_value_tail=new RewriteRuleSubtreeStream(adaptor,"rule value_tail");

		try {
			// Tiger.g:643:2: ( value_tail assign_stmt_tail -> ^( ASSIGN_STMT ( value_tail )? assign_stmt_tail ) )
			// Tiger.g:643:4: value_tail assign_stmt_tail
			{
			pushFollow(FOLLOW_value_tail_in_assign_stmt2398);
			value_tail113=value_tail();
			state._fsp--;

			stream_value_tail.add(value_tail113.getTree());
			pushFollow(FOLLOW_assign_stmt_tail_in_assign_stmt2400);
			assign_stmt_tail114=assign_stmt_tail();
			state._fsp--;

			stream_assign_stmt_tail.add(assign_stmt_tail114.getTree());

					retval.is1D = (value_tail113!=null?((TigerParser.value_tail_return)value_tail113).is1D:false);
					retval.is2D = (value_tail113!=null?((TigerParser.value_tail_return)value_tail113).is2D:false);
					retval.atype = (assign_stmt_tail114!=null?((TigerParser.assign_stmt_tail_return)assign_stmt_tail114).atype:null);
				
			// AST REWRITE
			// elements: value_tail, assign_stmt_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 648:4: -> ^( ASSIGN_STMT ( value_tail )? assign_stmt_tail )
			{
				// Tiger.g:648:7: ^( ASSIGN_STMT ( value_tail )? assign_stmt_tail )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_STMT, "ASSIGN_STMT"), root_1);
				// Tiger.g:648:21: ( value_tail )?
				if ( stream_value_tail.hasNext() ) {
					adaptor.addChild(root_1, stream_value_tail.nextTree());
				}
				stream_value_tail.reset();

				adaptor.addChild(root_1, stream_assign_stmt_tail.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign_stmt"


	public static class assign_stmt_tail_return extends ParserRuleReturnScope {
		public Type atype;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign_stmt_tail"
	// Tiger.g:651:1: assign_stmt_tail returns [Type atype] : ASSIGN expr_or_list ;
	public final TigerParser.assign_stmt_tail_return assign_stmt_tail() throws RecognitionException {
		TigerParser.assign_stmt_tail_return retval = new TigerParser.assign_stmt_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN115=null;
		ParserRuleReturnScope expr_or_list116 =null;

		Object ASSIGN115_tree=null;

		try {
			// Tiger.g:652:2: ( ASSIGN expr_or_list )
			// Tiger.g:652:4: ASSIGN expr_or_list
			{
			root_0 = (Object)adaptor.nil();


			ASSIGN115=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_stmt_tail2429); 
			ASSIGN115_tree = (Object)adaptor.create(ASSIGN115);
			adaptor.addChild(root_0, ASSIGN115_tree);

			pushFollow(FOLLOW_expr_or_list_in_assign_stmt_tail2431);
			expr_or_list116=expr_or_list();
			state._fsp--;

			adaptor.addChild(root_0, expr_or_list116.getTree());


					retval.atype = (expr_or_list116!=null?((TigerParser.expr_or_list_return)expr_or_list116).atype:null);
				
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign_stmt_tail"


	public static class expr_or_list_return extends ParserRuleReturnScope {
		public Type atype;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_or_list"
	// Tiger.g:658:1: expr_or_list returns [Type atype] : ( (myid= IntegerLiteral !|myid= FixedPointLiteral !) expr_tail1[$myid, false] ( ( AND ^| OR ^) expr_lev3 )* |myid= Identifier ! exprtest[$myid, true] | extail ( ( AND ^| OR ^) expr_lev3 )* );
	public final TigerParser.expr_or_list_return expr_or_list() throws RecognitionException {
		TigerParser.expr_or_list_return retval = new TigerParser.expr_or_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token myid=null;
		Token AND118=null;
		Token OR119=null;
		Token AND123=null;
		Token OR124=null;
		ParserRuleReturnScope expr_tail1117 =null;
		ParserRuleReturnScope expr_lev3120 =null;
		ParserRuleReturnScope exprtest121 =null;
		ParserRuleReturnScope extail122 =null;
		ParserRuleReturnScope expr_lev3125 =null;

		Object myid_tree=null;
		Object AND118_tree=null;
		Object OR119_tree=null;
		Object AND123_tree=null;
		Object OR124_tree=null;

		try {
			// Tiger.g:659:5: ( (myid= IntegerLiteral !|myid= FixedPointLiteral !) expr_tail1[$myid, false] ( ( AND ^| OR ^) expr_lev3 )* |myid= Identifier ! exprtest[$myid, true] | extail ( ( AND ^| OR ^) expr_lev3 )* )
			int alt23=3;
			switch ( input.LA(1) ) {
			case FixedPointLiteral:
			case IntegerLiteral:
				{
				alt23=1;
				}
				break;
			case Identifier:
				{
				alt23=2;
				}
				break;
			case LPAREN:
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// Tiger.g:659:7: (myid= IntegerLiteral !|myid= FixedPointLiteral !) expr_tail1[$myid, false] ( ( AND ^| OR ^) expr_lev3 )*
					{
					root_0 = (Object)adaptor.nil();


					// Tiger.g:659:7: (myid= IntegerLiteral !|myid= FixedPointLiteral !)
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==IntegerLiteral) ) {
						alt18=1;
					}
					else if ( (LA18_0==FixedPointLiteral) ) {
						alt18=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// Tiger.g:659:8: myid= IntegerLiteral !
							{
							myid=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_expr_or_list2459); 
							retval.atype = new Type("int");
							}
							break;
						case 2 :
							// Tiger.g:659:61: myid= FixedPointLiteral !
							{
							myid=(Token)match(input,FixedPointLiteral,FOLLOW_FixedPointLiteral_in_expr_or_list2470); 
							retval.atype = new Type("fixedpt");
							}
							break;

					}

					pushFollow(FOLLOW_expr_tail1_in_expr_or_list2480);
					expr_tail1117=expr_tail1(myid, false);
					state._fsp--;

					adaptor.addChild(root_0, expr_tail1117.getTree());


					    	if ((expr_tail1117!=null?((TigerParser.expr_tail1_return)expr_tail1117).atype:null) != null) {
					    		if ((expr_tail1117!=null?((TigerParser.expr_tail1_return)expr_tail1117).atype:null).getTypeName().equals("definedtype")) {
					    			throw new IllegalArgumentException("Type conflict.");
					    		} else {
					    			if (!retval.atype.getTypeName().equals("fixedpt")) {
					    				if ((expr_tail1117!=null?((TigerParser.expr_tail1_return)expr_tail1117).atype:null).getTypeName().equals("fixedpt")) {
					    					retval.atype = new Type("fixedpt");
					    				}
					   				}
					   			}
							}    
					    
					// Tiger.g:673:7: ( ( AND ^| OR ^) expr_lev3 )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==AND||LA20_0==OR) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// Tiger.g:673:8: ( AND ^| OR ^) expr_lev3
							{
							// Tiger.g:673:8: ( AND ^| OR ^)
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==AND) ) {
								alt19=1;
							}
							else if ( (LA19_0==OR) ) {
								alt19=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 19, 0, input);
								throw nvae;
							}

							switch (alt19) {
								case 1 :
									// Tiger.g:673:9: AND ^
									{
									AND118=(Token)match(input,AND,FOLLOW_AND_in_expr_or_list2491); 
									AND118_tree = (Object)adaptor.create(AND118);
									root_0 = (Object)adaptor.becomeRoot(AND118_tree, root_0);

									}
									break;
								case 2 :
									// Tiger.g:673:16: OR ^
									{
									OR119=(Token)match(input,OR,FOLLOW_OR_in_expr_or_list2496); 
									OR119_tree = (Object)adaptor.create(OR119);
									root_0 = (Object)adaptor.becomeRoot(OR119_tree, root_0);

									}
									break;

							}

							pushFollow(FOLLOW_expr_lev3_in_expr_or_list2500);
							expr_lev3120=expr_lev3();
							state._fsp--;

							adaptor.addChild(root_0, expr_lev3120.getTree());

							}
							break;

						default :
							break loop20;
						}
					}

					}
					break;
				case 2 :
					// Tiger.g:674:7: myid= Identifier ! exprtest[$myid, true]
					{
					root_0 = (Object)adaptor.nil();


					myid=(Token)match(input,Identifier,FOLLOW_Identifier_in_expr_or_list2514); 
					pushFollow(FOLLOW_exprtest_in_expr_or_list2517);
					exprtest121=exprtest(myid, true);
					state._fsp--;

					adaptor.addChild(root_0, exprtest121.getTree());


					    	if ((exprtest121!=null?((TigerParser.exprtest_return)exprtest121).isfc:false)) {
					    		if (st.lookup((myid!=null?myid.getText():null)) == null) {
					    			String name = (myid!=null?myid.getText():null);
					    			if (!(name.equals("printi") || name.equals("printf") || name.equals("readi") || name.equals("readf"))) {
					    				throw new IllegalArgumentException("Undefined function.");
					    			} else {
					    				if (name.equals("printi") || name.equals("printf")) {
					    					retval.atype = new Type("void");
					    				} else if (name.equals("readi")) {
					    					retval.atype = new Type("int");
					    				} else {
					    					retval.atype = new Type("fixedpt");
					    				}
					    			}
					    		} else {
					    			if (!st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("function")) {
					    				throw new IllegalArgumentException("Undefined function.");
					    			} else {
					    				Function curr = (Function) st.lookup((myid!=null?myid.getText():null));
					    				retval.atype = curr.getReturnType();
					    				if ((exprtest121!=null?((TigerParser.exprtest_return)exprtest121).pm:null).size() != ((Function) st.lookup((myid!=null?myid.getText():null))).getParamList().size()) {
					    					throw new IllegalArgumentException("Number of parameters doesn't match.");
					    				} else {
					    					for (int i = 0; i < (exprtest121!=null?((TigerParser.exprtest_return)exprtest121).pm:null).size(); i++) {
					    						if (!((Function) st.lookup((myid!=null?myid.getText():null))).getParamList().get(i).equals((exprtest121!=null?((TigerParser.exprtest_return)exprtest121).pm:null).get(i))) {
					    							throw new IllegalArgumentException("Type conflict.");
					    						}
					    					}
					    				}
					    			}
					    		}
					    	} else {
					    		Type curr = null;
					    		if (st.lookup((myid!=null?myid.getText():null)) == null) {
					    			throw new IllegalArgumentException("Undefined variable.");
					    		} else {
					    			if ((exprtest121!=null?((TigerParser.exprtest_return)exprtest121).is1D:false) && (exprtest121!=null?((TigerParser.exprtest_return)exprtest121).is2D:false)) {
					    				if (!(st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("definedtype")
					    					&& ((DefinedType) st.lookup((myid!=null?myid.getText():null))).getBaseType().getTypeName().equals("twoDarray")
					    					&& st.lookup((myid!=null?myid.getText():null)).getIsVar() == true)) {
					    					throw new IllegalArgumentException("Illegal variable type.");
					    				} else {
					    					curr = ((DefinedType) st.lookup((myid!=null?myid.getText():null))).getBaseType().getBaseType();
					    				}
					    			} else if ((exprtest121!=null?((TigerParser.exprtest_return)exprtest121).is1D:false)) {
					    				if (!(st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("definedtype")
					    					&& st.lookup((myid!=null?myid.getText():null)).getBaseType().getTypeName().equals("oneDarray")
					    					&& st.lookup((myid!=null?myid.getText():null)).getIsVar() == true)) {
					    					throw new IllegalArgumentException("Illegal variable type.");
					    				} else {
					    					curr = ((DefinedType) st.lookup((myid!=null?myid.getText():null))).getBaseType().getBaseType();
					    				}
					    			} else {
						 	   			if (!(st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("int")
					    					|| st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("fixedpt")
					    					|| (st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("definedtype")
					    					&& ((DefinedType) st.lookup((myid!=null?myid.getText():null))).getBaseType().getTypeName().equals("int")
					    					&& st.lookup((myid!=null?myid.getText():null)).getIsVar() == true)
					    					|| (st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("definedtype")
					    					&& ((DefinedType) st.lookup((myid!=null?myid.getText():null))).getBaseType().getTypeName().equals("fixedpt")
					    					&& st.lookup((myid!=null?myid.getText():null)).getIsVar() == true)
					    					|| (st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("definedtype")
					    					&& ((DefinedType) st.lookup((myid!=null?myid.getText():null))).getBaseType().getTypeName().equals("twoDarray")
					   						&& st.lookup((myid!=null?myid.getText():null)).getIsVar() == true)
					    					|| (st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("definedtype")
					    					&& ((DefinedType) st.lookup((myid!=null?myid.getText():null))).getBaseType().getTypeName().equals("oneDarray")
					    					&& st.lookup((myid!=null?myid.getText():null)).getIsVar() == true))) {
					    					throw new IllegalArgumentException("Illegal variable type."); 
					   					} else if ((st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("definedtype")
					    					&& ((DefinedType) st.lookup((myid!=null?myid.getText():null))).getBaseType().getTypeName().equals("int")
					    					&& st.lookup((myid!=null?myid.getText():null)).getIsVar() == true)
					    					|| (st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("definedtype")
					   						&& ((DefinedType) st.lookup((myid!=null?myid.getText():null))).getBaseType().getTypeName().equals("fixedpt")
					   						&& st.lookup((myid!=null?myid.getText():null)).getIsVar() == true)) {
					   						curr = st.lookup((myid!=null?myid.getText():null));
					    				} else if (st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("int")) {
					    					curr = new Type("int");
					    				} else if (st.lookup((myid!=null?myid.getText():null)).getTypeName().equals("fixedpt")) {
					    					curr = new Type("fixedpt");
					   					} else {
					   						curr = st.lookup((myid!=null?myid.getText():null));
					    				}
					    			}
					    		}
					    		retval.atype = curr;
					    		if ((exprtest121!=null?((TigerParser.exprtest_return)exprtest121).atype:null) != null) {
									if (retval.atype.getTypeName().equals("int") || retval.atype.getTypeName().equals("fixedpt")) {
					    				if ((exprtest121!=null?((TigerParser.exprtest_return)exprtest121).atype:null).getTypeName().equals("definedtype")) {
					    					throw new IllegalArgumentException("Type conflict.");
					    				} else {
					    					if (!retval.atype.getTypeName().equals("fixedpt")) {
					    						if ((exprtest121!=null?((TigerParser.exprtest_return)exprtest121).atype:null).getTypeName().equals("fixedpt")) {
					    							retval.atype = new Type("fixedpt");
					    						}
					    					}
					    				}
					    			} else {
					    				if (!((exprtest121!=null?((TigerParser.exprtest_return)exprtest121).atype:null).getTypeName().equals("definedtype"))) {
					    					throw new IllegalArgumentException("Type conflict.");
					    				} else {
					    					if (!((exprtest121!=null?((TigerParser.exprtest_return)exprtest121).atype:null).getIdentifier().equals(retval.atype.getIdentifier()))) {
					 		   					throw new IllegalArgumentException("Type conflict.");
						    				} 
					    				}
					    			}
								}
					    	}
					    
					}
					break;
				case 3 :
					// Tiger.g:784:7: extail ( ( AND ^| OR ^) expr_lev3 )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_extail_in_expr_or_list2532);
					extail122=extail();
					state._fsp--;

					adaptor.addChild(root_0, extail122.getTree());

					retval.atype = (extail122!=null?((TigerParser.extail_return)extail122).atype:null);
					// Tiger.g:784:40: ( ( AND ^| OR ^) expr_lev3 )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==AND||LA22_0==OR) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// Tiger.g:784:41: ( AND ^| OR ^) expr_lev3
							{
							// Tiger.g:784:41: ( AND ^| OR ^)
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==AND) ) {
								alt21=1;
							}
							else if ( (LA21_0==OR) ) {
								alt21=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 21, 0, input);
								throw nvae;
							}

							switch (alt21) {
								case 1 :
									// Tiger.g:784:42: AND ^
									{
									AND123=(Token)match(input,AND,FOLLOW_AND_in_expr_or_list2538); 
									AND123_tree = (Object)adaptor.create(AND123);
									root_0 = (Object)adaptor.becomeRoot(AND123_tree, root_0);

									}
									break;
								case 2 :
									// Tiger.g:784:49: OR ^
									{
									OR124=(Token)match(input,OR,FOLLOW_OR_in_expr_or_list2543); 
									OR124_tree = (Object)adaptor.create(OR124);
									root_0 = (Object)adaptor.becomeRoot(OR124_tree, root_0);

									}
									break;

							}

							pushFollow(FOLLOW_expr_lev3_in_expr_or_list2547);
							expr_lev3125=expr_lev3();
							state._fsp--;

							adaptor.addChild(root_0, expr_lev3125.getTree());


							    	System.out.println("Illegal expression.");
							    
							}
							break;

						default :
							break loop22;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_or_list"


	public static class exprtest_return extends ParserRuleReturnScope {
		public boolean isfc;
		public boolean is1D;
		public boolean is2D;
		public ArrayList<Type> pm;
		public Type atype;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprtest"
	// Tiger.g:790:1: exprtest[Token myid, boolean isarray] returns [boolean isfc, boolean is1D, boolean is2D, ArrayList<Type> pm, Type atype] : ( expr_tail1[$myid, $isarray] ( ( AND ^| OR ^) expr_lev3 )* | argument_list -> ^( argument_list ) );
	public final TigerParser.exprtest_return exprtest(Token myid, boolean isarray) throws RecognitionException {
		TigerParser.exprtest_return retval = new TigerParser.exprtest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND127=null;
		Token OR128=null;
		ParserRuleReturnScope expr_tail1126 =null;
		ParserRuleReturnScope expr_lev3129 =null;
		ParserRuleReturnScope argument_list130 =null;

		Object AND127_tree=null;
		Object OR128_tree=null;
		RewriteRuleSubtreeStream stream_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_list");

		try {
			// Tiger.g:791:2: ( expr_tail1[$myid, $isarray] ( ( AND ^| OR ^) expr_lev3 )* | argument_list -> ^( argument_list ) )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==AND||LA26_0==ASSIGN||LA26_0==COMMA||(LA26_0 >= DIV && LA26_0 <= DO)||LA26_0==EQ||(LA26_0 >= GREATER && LA26_0 <= GREATEREQ)||(LA26_0 >= LBRACK && LA26_0 <= LESSEREQ)||(LA26_0 >= MINUS && LA26_0 <= NEQ)||LA26_0==OR||LA26_0==PLUS||(LA26_0 >= RPAREN && LA26_0 <= SEMI)||LA26_0==THEN) ) {
				alt26=1;
			}
			else if ( (LA26_0==LPAREN) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// Tiger.g:791:4: expr_tail1[$myid, $isarray] ( ( AND ^| OR ^) expr_lev3 )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_tail1_in_exprtest2575);
					expr_tail1126=expr_tail1(myid, isarray);
					state._fsp--;

					adaptor.addChild(root_0, expr_tail1126.getTree());


							retval.isfc = false;
							retval.pm = null;
							retval.atype = (expr_tail1126!=null?((TigerParser.expr_tail1_return)expr_tail1126).atype:null);
							retval.is1D = (expr_tail1126!=null?((TigerParser.expr_tail1_return)expr_tail1126).is1D:false);
							retval.is2D = (expr_tail1126!=null?((TigerParser.expr_tail1_return)expr_tail1126).is2D:false);
						
					// Tiger.g:799:2: ( ( AND ^| OR ^) expr_lev3 )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==AND||LA25_0==OR) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// Tiger.g:799:3: ( AND ^| OR ^) expr_lev3
							{
							// Tiger.g:799:3: ( AND ^| OR ^)
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==AND) ) {
								alt24=1;
							}
							else if ( (LA24_0==OR) ) {
								alt24=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 24, 0, input);
								throw nvae;
							}

							switch (alt24) {
								case 1 :
									// Tiger.g:799:4: AND ^
									{
									AND127=(Token)match(input,AND,FOLLOW_AND_in_exprtest2585); 
									AND127_tree = (Object)adaptor.create(AND127);
									root_0 = (Object)adaptor.becomeRoot(AND127_tree, root_0);

									}
									break;
								case 2 :
									// Tiger.g:799:11: OR ^
									{
									OR128=(Token)match(input,OR,FOLLOW_OR_in_exprtest2590); 
									OR128_tree = (Object)adaptor.create(OR128);
									root_0 = (Object)adaptor.becomeRoot(OR128_tree, root_0);

									}
									break;

							}

							pushFollow(FOLLOW_expr_lev3_in_exprtest2594);
							expr_lev3129=expr_lev3();
							state._fsp--;

							adaptor.addChild(root_0, expr_lev3129.getTree());


									System.out.println("Illegal expression.");
								
							}
							break;

						default :
							break loop25;
						}
					}

					}
					break;
				case 2 :
					// Tiger.g:803:4: argument_list
					{
					pushFollow(FOLLOW_argument_list_in_exprtest2604);
					argument_list130=argument_list();
					state._fsp--;

					stream_argument_list.add(argument_list130.getTree());

							retval.isfc = true;
							retval.pm = (argument_list130!=null?((TigerParser.argument_list_return)argument_list130).pm:null);
							retval.atype = null;
						
					// AST REWRITE
					// elements: argument_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 808:4: -> ^( argument_list )
					{
						// Tiger.g:808:7: ^( argument_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(myid, root_1);
						adaptor.addChild(root_1, stream_argument_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprtest"


	public static class expr_tail1_return extends ParserRuleReturnScope {
		public Type atype;
		public boolean is1D;
		public boolean is2D;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_tail1"
	// Tiger.g:811:1: expr_tail1[Token myid, boolean isarray] returns [Type atype, boolean is1D, boolean is2D] : expr_tail2[$myid, $isarray] ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 )* ;
	public final TigerParser.expr_tail1_return expr_tail1(Token myid, boolean isarray) throws RecognitionException {
		TigerParser.expr_tail1_return retval = new TigerParser.expr_tail1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ132=null;
		Token NEQ133=null;
		Token LESSER134=null;
		Token LESSEREQ135=null;
		Token GREATER136=null;
		Token GREATEREQ137=null;
		ParserRuleReturnScope expr_tail2131 =null;
		ParserRuleReturnScope expr_lev2138 =null;

		Object EQ132_tree=null;
		Object NEQ133_tree=null;
		Object LESSER134_tree=null;
		Object LESSEREQ135_tree=null;
		Object GREATER136_tree=null;
		Object GREATEREQ137_tree=null;

		try {
			// Tiger.g:812:2: ( expr_tail2[$myid, $isarray] ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 )* )
			// Tiger.g:812:4: expr_tail2[$myid, $isarray] ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_tail2_in_expr_tail12633);
			expr_tail2131=expr_tail2(myid, isarray);
			state._fsp--;

			adaptor.addChild(root_0, expr_tail2131.getTree());


					retval.atype = (expr_tail2131!=null?((TigerParser.expr_tail2_return)expr_tail2131).atype:null);
					retval.is1D = (expr_tail2131!=null?((TigerParser.expr_tail2_return)expr_tail2131).is1D:false);
					retval.is2D = (expr_tail2131!=null?((TigerParser.expr_tail2_return)expr_tail2131).is2D:false);
				
			// Tiger.g:818:2: ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==EQ||(LA28_0 >= GREATER && LA28_0 <= GREATEREQ)||(LA28_0 >= LESSER && LA28_0 <= LESSEREQ)||LA28_0==NEQ) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Tiger.g:818:3: ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2
					{
					// Tiger.g:818:3: ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^)
					int alt27=6;
					switch ( input.LA(1) ) {
					case EQ:
						{
						alt27=1;
						}
						break;
					case NEQ:
						{
						alt27=2;
						}
						break;
					case LESSER:
						{
						alt27=3;
						}
						break;
					case LESSEREQ:
						{
						alt27=4;
						}
						break;
					case GREATER:
						{
						alt27=5;
						}
						break;
					case GREATEREQ:
						{
						alt27=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}
					switch (alt27) {
						case 1 :
							// Tiger.g:818:4: EQ ^
							{
							EQ132=(Token)match(input,EQ,FOLLOW_EQ_in_expr_tail12643); 
							EQ132_tree = (Object)adaptor.create(EQ132);
							root_0 = (Object)adaptor.becomeRoot(EQ132_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:818:8: NEQ ^
							{
							NEQ133=(Token)match(input,NEQ,FOLLOW_NEQ_in_expr_tail12646); 
							NEQ133_tree = (Object)adaptor.create(NEQ133);
							root_0 = (Object)adaptor.becomeRoot(NEQ133_tree, root_0);

							}
							break;
						case 3 :
							// Tiger.g:818:13: LESSER ^
							{
							LESSER134=(Token)match(input,LESSER,FOLLOW_LESSER_in_expr_tail12649); 
							LESSER134_tree = (Object)adaptor.create(LESSER134);
							root_0 = (Object)adaptor.becomeRoot(LESSER134_tree, root_0);

							}
							break;
						case 4 :
							// Tiger.g:818:21: LESSEREQ ^
							{
							LESSEREQ135=(Token)match(input,LESSEREQ,FOLLOW_LESSEREQ_in_expr_tail12652); 
							LESSEREQ135_tree = (Object)adaptor.create(LESSEREQ135);
							root_0 = (Object)adaptor.becomeRoot(LESSEREQ135_tree, root_0);

							}
							break;
						case 5 :
							// Tiger.g:818:31: GREATER ^
							{
							GREATER136=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_tail12655); 
							GREATER136_tree = (Object)adaptor.create(GREATER136);
							root_0 = (Object)adaptor.becomeRoot(GREATER136_tree, root_0);

							}
							break;
						case 6 :
							// Tiger.g:818:40: GREATEREQ ^
							{
							GREATEREQ137=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_tail12658); 
							GREATEREQ137_tree = (Object)adaptor.create(GREATEREQ137);
							root_0 = (Object)adaptor.becomeRoot(GREATEREQ137_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_lev2_in_expr_tail12662);
					expr_lev2138=expr_lev2();
					state._fsp--;

					adaptor.addChild(root_0, expr_lev2138.getTree());


							System.out.println("Illegal expression.");
						
					}
					break;

				default :
					break loop28;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_tail1"


	public static class expr_tail2_return extends ParserRuleReturnScope {
		public Type atype;
		public boolean is1D;
		public boolean is2D;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_tail2"
	// Tiger.g:824:1: expr_tail2[Token myid, boolean isarray] returns [Type atype, boolean is1D, boolean is2D] : el1= expr_tail3[$myid, $isarray] ( ( PLUS ^| MINUS ^) el2= expr_lev1 )* ;
	public final TigerParser.expr_tail2_return expr_tail2(Token myid, boolean isarray) throws RecognitionException {
		TigerParser.expr_tail2_return retval = new TigerParser.expr_tail2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS139=null;
		Token MINUS140=null;
		ParserRuleReturnScope el1 =null;
		ParserRuleReturnScope el2 =null;

		Object PLUS139_tree=null;
		Object MINUS140_tree=null;

		try {
			// Tiger.g:825:2: (el1= expr_tail3[$myid, $isarray] ( ( PLUS ^| MINUS ^) el2= expr_lev1 )* )
			// Tiger.g:825:4: el1= expr_tail3[$myid, $isarray] ( ( PLUS ^| MINUS ^) el2= expr_lev1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_tail3_in_expr_tail22689);
			el1=expr_tail3(myid, isarray);
			state._fsp--;

			adaptor.addChild(root_0, el1.getTree());

			 
					retval.atype = (el1!=null?((TigerParser.expr_tail3_return)el1).atype:null);	
					retval.is1D = (el1!=null?((TigerParser.expr_tail3_return)el1).is1D:false);
					retval.is2D = (el1!=null?((TigerParser.expr_tail3_return)el1).is2D:false);
				
			// Tiger.g:830:3: ( ( PLUS ^| MINUS ^) el2= expr_lev1 )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==MINUS||LA30_0==PLUS) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// Tiger.g:830:4: ( PLUS ^| MINUS ^) el2= expr_lev1
					{
					// Tiger.g:830:4: ( PLUS ^| MINUS ^)
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==PLUS) ) {
						alt29=1;
					}
					else if ( (LA29_0==MINUS) ) {
						alt29=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// Tiger.g:830:5: PLUS ^
							{
							PLUS139=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_tail22696); 
							PLUS139_tree = (Object)adaptor.create(PLUS139);
							root_0 = (Object)adaptor.becomeRoot(PLUS139_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:830:11: MINUS ^
							{
							MINUS140=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_tail22699); 
							MINUS140_tree = (Object)adaptor.create(MINUS140);
							root_0 = (Object)adaptor.becomeRoot(MINUS140_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_lev1_in_expr_tail22707);
					el2=expr_lev1();
					state._fsp--;

					adaptor.addChild(root_0, el2.getTree());


					    	if ((el2!=null?((TigerParser.expr_lev1_return)el2).iscomp:false)) {
					    		throw new IllegalArgumentException("Illegal Expression.");
					    	} else {
								if (retval.atype == null) {
									retval.atype = (el2!=null?((TigerParser.expr_lev1_return)el2).atype:null);
								} else {
									if (retval.atype.getTypeName().equals("int") || retval.atype.getTypeName().equals("fixedpt")) {
					    				if ((el2!=null?((TigerParser.expr_lev1_return)el2).atype:null).getTypeName().equals("definedtype")) {
					    					throw new IllegalArgumentException("Type conflict.");
					    				} else {
					    					if (!retval.atype.getTypeName().equals("fixedpt")) {
					    						if ((el2!=null?((TigerParser.expr_lev1_return)el2).atype:null).getTypeName().equals("fixedpt")) {
					    							retval.atype = new Type("fixedpt");
					    						}
					    					}
					    				}
					    			} else {
					    				if (!((el2!=null?((TigerParser.expr_lev1_return)el2).atype:null).getTypeName().equals("definedtype"))) {
					    					throw new IllegalArgumentException("Type conflict.");
					    				} else {
					    					if (!((el2!=null?((TigerParser.expr_lev1_return)el2).atype:null).getIdentifier().equals(retval.atype.getIdentifier()))) {
					 		   					throw new IllegalArgumentException("Type conflict.");
						    				} 
					    				}
					    			}
								}
							}
					    
					}
					break;

				default :
					break loop30;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_tail2"


	public static class expr_tail3_return extends ParserRuleReturnScope {
		public Type atype;
		public boolean is1D;
		public boolean is2D;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_tail3"
	// Tiger.g:862:1: expr_tail3[Token myid, boolean isarray] returns [Type atype, boolean is1D, boolean is2D] : maderule[$myid] ( ({...}? value_tail ) ( ( MULT ^| DIV ^) pe1= primary_expression )* | ( ( MULT ^| DIV ^) pe2= primary_expression )* ) ;
	public final TigerParser.expr_tail3_return expr_tail3(Token myid, boolean isarray) throws RecognitionException {
		TigerParser.expr_tail3_return retval = new TigerParser.expr_tail3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT143=null;
		Token DIV144=null;
		Token MULT145=null;
		Token DIV146=null;
		ParserRuleReturnScope pe1 =null;
		ParserRuleReturnScope pe2 =null;
		ParserRuleReturnScope maderule141 =null;
		ParserRuleReturnScope value_tail142 =null;

		Object MULT143_tree=null;
		Object DIV144_tree=null;
		Object MULT145_tree=null;
		Object DIV146_tree=null;

		try {
			// Tiger.g:863:2: ( maderule[$myid] ( ({...}? value_tail ) ( ( MULT ^| DIV ^) pe1= primary_expression )* | ( ( MULT ^| DIV ^) pe2= primary_expression )* ) )
			// Tiger.g:863:4: maderule[$myid] ( ({...}? value_tail ) ( ( MULT ^| DIV ^) pe1= primary_expression )* | ( ( MULT ^| DIV ^) pe2= primary_expression )* )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_maderule_in_expr_tail32729);
			maderule141=maderule(myid);
			state._fsp--;

			adaptor.addChild(root_0, maderule141.getTree());

			// Tiger.g:863:20: ( ({...}? value_tail ) ( ( MULT ^| DIV ^) pe1= primary_expression )* | ( ( MULT ^| DIV ^) pe2= primary_expression )* )
			int alt35=2;
			switch ( input.LA(1) ) {
			case LBRACK:
				{
				alt35=1;
				}
				break;
			case MULT:
				{
				int LA35_2 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case DIV:
				{
				int LA35_3 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case PLUS:
				{
				int LA35_4 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case MINUS:
				{
				int LA35_5 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case EQ:
				{
				int LA35_6 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case NEQ:
				{
				int LA35_7 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case LESSER:
				{
				int LA35_8 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case LESSEREQ:
				{
				int LA35_9 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case GREATER:
				{
				int LA35_10 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case GREATEREQ:
				{
				int LA35_11 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case AND:
				{
				int LA35_12 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case OR:
				{
				int LA35_13 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			case SEMI:
				{
				int LA35_14 = input.LA(2);
				if ( ((isarray)) ) {
					alt35=1;
				}
				else if ( (true) ) {
					alt35=2;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// Tiger.g:863:21: ({...}? value_tail ) ( ( MULT ^| DIV ^) pe1= primary_expression )*
					{
					// Tiger.g:863:21: ({...}? value_tail )
					// Tiger.g:863:22: {...}? value_tail
					{
					if ( !((isarray)) ) {
						throw new FailedPredicateException(input, "expr_tail3", "$isarray");
					}
					pushFollow(FOLLOW_value_tail_in_expr_tail32736);
					value_tail142=value_tail();
					state._fsp--;

					adaptor.addChild(root_0, value_tail142.getTree());


							retval.is1D = (value_tail142!=null?((TigerParser.value_tail_return)value_tail142).is1D:false);
							retval.is2D = (value_tail142!=null?((TigerParser.value_tail_return)value_tail142).is2D:false);
						
					}

					// Tiger.g:867:5: ( ( MULT ^| DIV ^) pe1= primary_expression )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==DIV||LA32_0==MULT) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// Tiger.g:867:6: ( MULT ^| DIV ^) pe1= primary_expression
							{
							// Tiger.g:867:6: ( MULT ^| DIV ^)
							int alt31=2;
							int LA31_0 = input.LA(1);
							if ( (LA31_0==MULT) ) {
								alt31=1;
							}
							else if ( (LA31_0==DIV) ) {
								alt31=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 31, 0, input);
								throw nvae;
							}

							switch (alt31) {
								case 1 :
									// Tiger.g:867:7: MULT ^
									{
									MULT143=(Token)match(input,MULT,FOLLOW_MULT_in_expr_tail32744); 
									MULT143_tree = (Object)adaptor.create(MULT143);
									root_0 = (Object)adaptor.becomeRoot(MULT143_tree, root_0);

									}
									break;
								case 2 :
									// Tiger.g:867:13: DIV ^
									{
									DIV144=(Token)match(input,DIV,FOLLOW_DIV_in_expr_tail32747); 
									DIV144_tree = (Object)adaptor.create(DIV144);
									root_0 = (Object)adaptor.becomeRoot(DIV144_tree, root_0);

									}
									break;

							}

							pushFollow(FOLLOW_primary_expression_in_expr_tail32755);
							pe1=primary_expression();
							state._fsp--;

							adaptor.addChild(root_0, pe1.getTree());


									if ((pe1!=null?((TigerParser.primary_expression_return)pe1).iscomp:false)) {
										throw new IllegalArgumentException("Illegal expression.");
									} else {
										if (retval.atype == null) {
											retval.atype = (pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null);
										} else {
											if (retval.atype.getTypeName().equals("int") || retval.atype.getTypeName().equals("fixedpt")) {
							    				if ((pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getTypeName().equals("definedtype")) {
							    					throw new IllegalArgumentException("Type conflict.");
							    				} else {
							    					if (!retval.atype.getTypeName().equals("fixedpt")) {
							    						if ((pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getTypeName().equals("fixedpt")) {
							    							retval.atype = new Type("fixedpt");
							    						}
							    					}
							    				}
							    			} else {
							    				if (!((pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getTypeName().equals("definedtype"))) {
							    					throw new IllegalArgumentException("Type conflict.");
							    				} else {
							    					if (!((pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getIdentifier().equals(retval.atype.getIdentifier()))) {
							 		   					throw new IllegalArgumentException("Type conflict.");
								    				} 
							    				}
							    			}
										}
									}
								
							}
							break;

						default :
							break loop32;
						}
					}

					}
					break;
				case 2 :
					// Tiger.g:897:4: ( ( MULT ^| DIV ^) pe2= primary_expression )*
					{
					// Tiger.g:897:4: ( ( MULT ^| DIV ^) pe2= primary_expression )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==DIV||LA34_0==MULT) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// Tiger.g:897:5: ( MULT ^| DIV ^) pe2= primary_expression
							{
							// Tiger.g:897:5: ( MULT ^| DIV ^)
							int alt33=2;
							int LA33_0 = input.LA(1);
							if ( (LA33_0==MULT) ) {
								alt33=1;
							}
							else if ( (LA33_0==DIV) ) {
								alt33=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 33, 0, input);
								throw nvae;
							}

							switch (alt33) {
								case 1 :
									// Tiger.g:897:6: MULT ^
									{
									MULT145=(Token)match(input,MULT,FOLLOW_MULT_in_expr_tail32767); 
									MULT145_tree = (Object)adaptor.create(MULT145);
									root_0 = (Object)adaptor.becomeRoot(MULT145_tree, root_0);

									}
									break;
								case 2 :
									// Tiger.g:897:12: DIV ^
									{
									DIV146=(Token)match(input,DIV,FOLLOW_DIV_in_expr_tail32770); 
									DIV146_tree = (Object)adaptor.create(DIV146);
									root_0 = (Object)adaptor.becomeRoot(DIV146_tree, root_0);

									}
									break;

							}

							pushFollow(FOLLOW_primary_expression_in_expr_tail32778);
							pe2=primary_expression();
							state._fsp--;

							adaptor.addChild(root_0, pe2.getTree());


									if ((pe2!=null?((TigerParser.primary_expression_return)pe2).iscomp:false)) {
										throw new IllegalArgumentException("Illegal expression.");
									} else {
										if (retval.atype == null) {
											retval.atype = (pe2!=null?((TigerParser.primary_expression_return)pe2).atype:null);
										} else {
											if (retval.atype.getTypeName().equals("int") || retval.atype.getTypeName().equals("fixedpt")) {
							    				if ((pe2!=null?((TigerParser.primary_expression_return)pe2).atype:null).getTypeName().equals("definedtype")) {
							    					throw new IllegalArgumentException("Type conflict.");
							    				} else {
							    					if (!retval.atype.getTypeName().equals("fixedpt")) {
							    						if ((pe2!=null?((TigerParser.primary_expression_return)pe2).atype:null).getTypeName().equals("fixedpt")) {
							    							retval.atype = new Type("fixedpt");
							    						}
							    					}
							    				}
							    			} else {
							    				if (!((pe2!=null?((TigerParser.primary_expression_return)pe2).atype:null).getTypeName().equals("definedtype"))) {
							    					throw new IllegalArgumentException("Type conflict.");
							    				} else {
							    					if (!((pe2!=null?((TigerParser.primary_expression_return)pe2).atype:null).getIdentifier().equals(retval.atype.getIdentifier()))) {
							 		   					throw new IllegalArgumentException("Type conflict.");
								    				} 
							    				}
							    			}
										}
									}
								
							}
							break;

						default :
							break loop34;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_tail3"


	public static class maderule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "maderule"
	// Tiger.g:929:1: maderule[Token myid] : -> ^() ;
	public final TigerParser.maderule_return maderule(Token myid) throws RecognitionException {
		TigerParser.maderule_return retval = new TigerParser.maderule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		try {
			// Tiger.g:930:2: ( -> ^() )
			// Tiger.g:930:5: 
			{
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 930:5: -> ^()
			{
				// Tiger.g:930:8: ^()
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(myid, root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "maderule"


	public static class extail_return extends ParserRuleReturnScope {
		public Type atype;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extail"
	// Tiger.g:933:1: extail returns [Type atype] : extail1 ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 )* ;
	public final TigerParser.extail_return extail() throws RecognitionException {
		TigerParser.extail_return retval = new TigerParser.extail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ148=null;
		Token NEQ149=null;
		Token LESSER150=null;
		Token LESSEREQ151=null;
		Token GREATER152=null;
		Token GREATEREQ153=null;
		ParserRuleReturnScope extail1147 =null;
		ParserRuleReturnScope expr_lev2154 =null;

		Object EQ148_tree=null;
		Object NEQ149_tree=null;
		Object LESSER150_tree=null;
		Object LESSEREQ151_tree=null;
		Object GREATER152_tree=null;
		Object GREATEREQ153_tree=null;

		try {
			// Tiger.g:934:2: ( extail1 ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 )* )
			// Tiger.g:934:4: extail1 ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_extail1_in_extail2818);
			extail1147=extail1();
			state._fsp--;

			adaptor.addChild(root_0, extail1147.getTree());


					retval.atype = (extail1147!=null?((TigerParser.extail1_return)extail1147).atype:null);
				
			// Tiger.g:937:3: ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==EQ||(LA37_0 >= GREATER && LA37_0 <= GREATEREQ)||(LA37_0 >= LESSER && LA37_0 <= LESSEREQ)||LA37_0==NEQ) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// Tiger.g:937:4: ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2
					{
					// Tiger.g:937:4: ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^)
					int alt36=6;
					switch ( input.LA(1) ) {
					case EQ:
						{
						alt36=1;
						}
						break;
					case NEQ:
						{
						alt36=2;
						}
						break;
					case LESSER:
						{
						alt36=3;
						}
						break;
					case LESSEREQ:
						{
						alt36=4;
						}
						break;
					case GREATER:
						{
						alt36=5;
						}
						break;
					case GREATEREQ:
						{
						alt36=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						throw nvae;
					}
					switch (alt36) {
						case 1 :
							// Tiger.g:937:5: EQ ^
							{
							EQ148=(Token)match(input,EQ,FOLLOW_EQ_in_extail2824); 
							EQ148_tree = (Object)adaptor.create(EQ148);
							root_0 = (Object)adaptor.becomeRoot(EQ148_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:937:9: NEQ ^
							{
							NEQ149=(Token)match(input,NEQ,FOLLOW_NEQ_in_extail2827); 
							NEQ149_tree = (Object)adaptor.create(NEQ149);
							root_0 = (Object)adaptor.becomeRoot(NEQ149_tree, root_0);

							}
							break;
						case 3 :
							// Tiger.g:937:14: LESSER ^
							{
							LESSER150=(Token)match(input,LESSER,FOLLOW_LESSER_in_extail2830); 
							LESSER150_tree = (Object)adaptor.create(LESSER150);
							root_0 = (Object)adaptor.becomeRoot(LESSER150_tree, root_0);

							}
							break;
						case 4 :
							// Tiger.g:937:22: LESSEREQ ^
							{
							LESSEREQ151=(Token)match(input,LESSEREQ,FOLLOW_LESSEREQ_in_extail2833); 
							LESSEREQ151_tree = (Object)adaptor.create(LESSEREQ151);
							root_0 = (Object)adaptor.becomeRoot(LESSEREQ151_tree, root_0);

							}
							break;
						case 5 :
							// Tiger.g:937:32: GREATER ^
							{
							GREATER152=(Token)match(input,GREATER,FOLLOW_GREATER_in_extail2836); 
							GREATER152_tree = (Object)adaptor.create(GREATER152);
							root_0 = (Object)adaptor.becomeRoot(GREATER152_tree, root_0);

							}
							break;
						case 6 :
							// Tiger.g:937:41: GREATEREQ ^
							{
							GREATEREQ153=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_extail2839); 
							GREATEREQ153_tree = (Object)adaptor.create(GREATEREQ153);
							root_0 = (Object)adaptor.becomeRoot(GREATEREQ153_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_lev2_in_extail2843);
					expr_lev2154=expr_lev2();
					state._fsp--;

					adaptor.addChild(root_0, expr_lev2154.getTree());


							System.out.println("Illegal expression.");
						
					}
					break;

				default :
					break loop37;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extail"


	public static class extail1_return extends ParserRuleReturnScope {
		public Type atype;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extail1"
	// Tiger.g:943:1: extail1 returns [Type atype] : extail2 ( ( PLUS ^| MINUS ^) el1= expr_lev1 )* ;
	public final TigerParser.extail1_return extail1() throws RecognitionException {
		TigerParser.extail1_return retval = new TigerParser.extail1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS156=null;
		Token MINUS157=null;
		ParserRuleReturnScope el1 =null;
		ParserRuleReturnScope extail2155 =null;

		Object PLUS156_tree=null;
		Object MINUS157_tree=null;

		try {
			// Tiger.g:944:2: ( extail2 ( ( PLUS ^| MINUS ^) el1= expr_lev1 )* )
			// Tiger.g:944:4: extail2 ( ( PLUS ^| MINUS ^) el1= expr_lev1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_extail2_in_extail12863);
			extail2155=extail2();
			state._fsp--;

			adaptor.addChild(root_0, extail2155.getTree());


					retval.atype = (extail2155!=null?((TigerParser.extail2_return)extail2155).atype:null);
				
			// Tiger.g:947:3: ( ( PLUS ^| MINUS ^) el1= expr_lev1 )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==MINUS||LA39_0==PLUS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// Tiger.g:947:4: ( PLUS ^| MINUS ^) el1= expr_lev1
					{
					// Tiger.g:947:4: ( PLUS ^| MINUS ^)
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==PLUS) ) {
						alt38=1;
					}
					else if ( (LA38_0==MINUS) ) {
						alt38=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}

					switch (alt38) {
						case 1 :
							// Tiger.g:947:5: PLUS ^
							{
							PLUS156=(Token)match(input,PLUS,FOLLOW_PLUS_in_extail12869); 
							PLUS156_tree = (Object)adaptor.create(PLUS156);
							root_0 = (Object)adaptor.becomeRoot(PLUS156_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:947:11: MINUS ^
							{
							MINUS157=(Token)match(input,MINUS,FOLLOW_MINUS_in_extail12872); 
							MINUS157_tree = (Object)adaptor.create(MINUS157);
							root_0 = (Object)adaptor.becomeRoot(MINUS157_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_lev1_in_extail12880);
					el1=expr_lev1();
					state._fsp--;

					adaptor.addChild(root_0, el1.getTree());


							if ((el1!=null?((TigerParser.expr_lev1_return)el1).iscomp:false)) {
								throw new IllegalArgumentException("Illegal expression.");
							} else {
								if (retval.atype == null) {
									retval.atype = (el1!=null?((TigerParser.expr_lev1_return)el1).atype:null);
								} else {
									if (retval.atype.getTypeName().equals("int") || retval.atype.getTypeName().equals("fixedpt")) {
					    				if ((el1!=null?((TigerParser.expr_lev1_return)el1).atype:null).getTypeName().equals("definedtype")) {
					    					throw new IllegalArgumentException("Type conflict.");
					    				} else {
					    					if (!retval.atype.getTypeName().equals("fixedpt")) {
					    						if ((el1!=null?((TigerParser.expr_lev1_return)el1).atype:null).getTypeName().equals("fixedpt")) {
					    							retval.atype = new Type("fixedpt");
					    						}
					    					}
					    				}
					    			} else {
					    				if (!((el1!=null?((TigerParser.expr_lev1_return)el1).atype:null).getTypeName().equals("definedtype"))) {
					    					throw new IllegalArgumentException("Type conflict.");
					    				} else {
					    					if (!((el1!=null?((TigerParser.expr_lev1_return)el1).atype:null).getIdentifier().equals(retval.atype.getIdentifier()))) {
					 		   					throw new IllegalArgumentException("Type conflict.");
						    				} 
					    				}
					    			}
								}
							}
						
					}
					break;

				default :
					break loop39;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extail1"


	public static class extail2_return extends ParserRuleReturnScope {
		public Type atype;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extail2"
	// Tiger.g:979:1: extail2 returns [Type atype] : LPAREN ! expr RPAREN ! ( ( MULT ^| DIV ^) pe1= primary_expression )* ;
	public final TigerParser.extail2_return extail2() throws RecognitionException {
		TigerParser.extail2_return retval = new TigerParser.extail2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN158=null;
		Token RPAREN160=null;
		Token MULT161=null;
		Token DIV162=null;
		ParserRuleReturnScope pe1 =null;
		ParserRuleReturnScope expr159 =null;

		Object LPAREN158_tree=null;
		Object RPAREN160_tree=null;
		Object MULT161_tree=null;
		Object DIV162_tree=null;

		try {
			// Tiger.g:980:2: ( LPAREN ! expr RPAREN ! ( ( MULT ^| DIV ^) pe1= primary_expression )* )
			// Tiger.g:980:4: LPAREN ! expr RPAREN ! ( ( MULT ^| DIV ^) pe1= primary_expression )*
			{
			root_0 = (Object)adaptor.nil();


			LPAREN158=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_extail22900); 
			pushFollow(FOLLOW_expr_in_extail22903);
			expr159=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr159.getTree());


					if ((expr159!=null?((TigerParser.expr_return)expr159).iscomp:false)) {
						throw new IllegalArgumentException("Illegal Expression");
					} else {
						retval.atype = (expr159!=null?((TigerParser.expr_return)expr159).atype:null);
					}
				
			RPAREN160=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_extail22909); 
			// Tiger.g:988:10: ( ( MULT ^| DIV ^) pe1= primary_expression )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==DIV||LA41_0==MULT) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// Tiger.g:988:11: ( MULT ^| DIV ^) pe1= primary_expression
					{
					// Tiger.g:988:11: ( MULT ^| DIV ^)
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==MULT) ) {
						alt40=1;
					}
					else if ( (LA40_0==DIV) ) {
						alt40=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						throw nvae;
					}

					switch (alt40) {
						case 1 :
							// Tiger.g:988:12: MULT ^
							{
							MULT161=(Token)match(input,MULT,FOLLOW_MULT_in_extail22914); 
							MULT161_tree = (Object)adaptor.create(MULT161);
							root_0 = (Object)adaptor.becomeRoot(MULT161_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:988:18: DIV ^
							{
							DIV162=(Token)match(input,DIV,FOLLOW_DIV_in_extail22917); 
							DIV162_tree = (Object)adaptor.create(DIV162);
							root_0 = (Object)adaptor.becomeRoot(DIV162_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_primary_expression_in_extail22925);
					pe1=primary_expression();
					state._fsp--;

					adaptor.addChild(root_0, pe1.getTree());


							if ((pe1!=null?((TigerParser.primary_expression_return)pe1).iscomp:false)) {
								throw new IllegalArgumentException("Illegal expression.");
							} else {
								if (retval.atype == null) {
									retval.atype = (pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null);
								} else {
									if (retval.atype.getTypeName().equals("int") || retval.atype.getTypeName().equals("fixedpt")) {
					    				if ((pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getTypeName().equals("definedtype")) {
					    					throw new IllegalArgumentException("Type conflict.");
					    				} else {
					    					if (!retval.atype.getTypeName().equals("fixedpt")) {
					    						if ((pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getTypeName().equals("fixedpt")) {
					    							retval.atype = new Type("fixedpt");
					    						}
					    					}
					    				}
					    			} else {
					    				if (!((pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getTypeName().equals("definedtype"))) {
					    					throw new IllegalArgumentException("Type conflict.");
					    				} else {
					    					if (!((pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getIdentifier().equals(retval.atype.getIdentifier()))) {
					 		   					throw new IllegalArgumentException("Type conflict.");
						    				} 
					    				}
					    			}
								}
							}
						
					}
					break;

				default :
					break loop41;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extail2"


	public static class if_else_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_else_expr"
	// Tiger.g:1020:1: if_else_expr : if_stat then_stat else_expr ENDIF SEMI -> ^( IF_ELSE_EXPR if_stat then_stat ( else_expr )? ) ;
	public final TigerParser.if_else_expr_return if_else_expr() throws RecognitionException {
		TigerParser.if_else_expr_return retval = new TigerParser.if_else_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ENDIF166=null;
		Token SEMI167=null;
		ParserRuleReturnScope if_stat163 =null;
		ParserRuleReturnScope then_stat164 =null;
		ParserRuleReturnScope else_expr165 =null;

		Object ENDIF166_tree=null;
		Object SEMI167_tree=null;
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleSubtreeStream stream_then_stat=new RewriteRuleSubtreeStream(adaptor,"rule then_stat");
		RewriteRuleSubtreeStream stream_else_expr=new RewriteRuleSubtreeStream(adaptor,"rule else_expr");
		RewriteRuleSubtreeStream stream_if_stat=new RewriteRuleSubtreeStream(adaptor,"rule if_stat");

		try {
			// Tiger.g:1021:5: ( if_stat then_stat else_expr ENDIF SEMI -> ^( IF_ELSE_EXPR if_stat then_stat ( else_expr )? ) )
			// Tiger.g:1021:7: if_stat then_stat else_expr ENDIF SEMI
			{
			pushFollow(FOLLOW_if_stat_in_if_else_expr2944);
			if_stat163=if_stat();
			state._fsp--;

			stream_if_stat.add(if_stat163.getTree());
			pushFollow(FOLLOW_then_stat_in_if_else_expr2946);
			then_stat164=then_stat();
			state._fsp--;

			stream_then_stat.add(then_stat164.getTree());
			pushFollow(FOLLOW_else_expr_in_if_else_expr2948);
			else_expr165=else_expr();
			state._fsp--;

			stream_else_expr.add(else_expr165.getTree());
			ENDIF166=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_else_expr2950);  
			stream_ENDIF.add(ENDIF166);

			SEMI167=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_else_expr2952);  
			stream_SEMI.add(SEMI167);

			// AST REWRITE
			// elements: if_stat, else_expr, then_stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 1021:45: -> ^( IF_ELSE_EXPR if_stat then_stat ( else_expr )? )
			{
				// Tiger.g:1021:48: ^( IF_ELSE_EXPR if_stat then_stat ( else_expr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_ELSE_EXPR, "IF_ELSE_EXPR"), root_1);
				adaptor.addChild(root_1, stream_if_stat.nextTree());
				adaptor.addChild(root_1, stream_then_stat.nextTree());
				// Tiger.g:1021:81: ( else_expr )?
				if ( stream_else_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_else_expr.nextTree());
				}
				stream_else_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_else_expr"


	public static class if_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_stat"
	// Tiger.g:1024:1: if_stat : IF ^ expr ;
	public final TigerParser.if_stat_return if_stat() throws RecognitionException {
		TigerParser.if_stat_return retval = new TigerParser.if_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF168=null;
		ParserRuleReturnScope expr169 =null;

		Object IF168_tree=null;

		try {
			// Tiger.g:1025:2: ( IF ^ expr )
			// Tiger.g:1025:4: IF ^ expr
			{
			root_0 = (Object)adaptor.nil();


			IF168=(Token)match(input,IF,FOLLOW_IF_in_if_stat2982); 
			IF168_tree = (Object)adaptor.create(IF168);
			root_0 = (Object)adaptor.becomeRoot(IF168_tree, root_0);

			pushFollow(FOLLOW_expr_in_if_stat2985);
			expr169=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr169.getTree());


						if (!(expr169!=null?((TigerParser.expr_return)expr169).iscomp:false)) {
							throw new IllegalArgumentException("The expression does not return a boolean.");
						}
					
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_stat"


	public static class then_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "then_stat"
	// Tiger.g:1033:1: then_stat : THEN ^ stat_seq ;
	public final TigerParser.then_stat_return then_stat() throws RecognitionException {
		TigerParser.then_stat_return retval = new TigerParser.then_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token THEN170=null;
		ParserRuleReturnScope stat_seq171 =null;

		Object THEN170_tree=null;

		try {
			// Tiger.g:1034:2: ( THEN ^ stat_seq )
			// Tiger.g:1034:4: THEN ^ stat_seq
			{
			root_0 = (Object)adaptor.nil();


			THEN170=(Token)match(input,THEN,FOLLOW_THEN_in_then_stat3001); 
			THEN170_tree = (Object)adaptor.create(THEN170);
			root_0 = (Object)adaptor.becomeRoot(THEN170_tree, root_0);

			pushFollow(FOLLOW_stat_seq_in_then_stat3004);
			stat_seq171=stat_seq();
			state._fsp--;

			adaptor.addChild(root_0, stat_seq171.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "then_stat"


	public static class else_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "else_expr"
	// Tiger.g:1037:1: else_expr : ( ELSE ^ stat_seq )? ;
	public final TigerParser.else_expr_return else_expr() throws RecognitionException {
		TigerParser.else_expr_return retval = new TigerParser.else_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE172=null;
		ParserRuleReturnScope stat_seq173 =null;

		Object ELSE172_tree=null;

		try {
			// Tiger.g:1038:5: ( ( ELSE ^ stat_seq )? )
			// Tiger.g:1038:7: ( ELSE ^ stat_seq )?
			{
			root_0 = (Object)adaptor.nil();


			// Tiger.g:1038:7: ( ELSE ^ stat_seq )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==ELSE) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// Tiger.g:1038:8: ELSE ^ stat_seq
					{
					ELSE172=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_expr3024); 
					ELSE172_tree = (Object)adaptor.create(ELSE172);
					root_0 = (Object)adaptor.becomeRoot(ELSE172_tree, root_0);

					pushFollow(FOLLOW_stat_seq_in_else_expr3027);
					stat_seq173=stat_seq();
					state._fsp--;

					adaptor.addChild(root_0, stat_seq173.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "else_expr"


	public static class opt_prefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "opt_prefix"
	// Tiger.g:1041:1: opt_prefix : ( value ASSIGN )? ;
	public final TigerParser.opt_prefix_return opt_prefix() throws RecognitionException {
		TigerParser.opt_prefix_return retval = new TigerParser.opt_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN175=null;
		ParserRuleReturnScope value174 =null;

		Object ASSIGN175_tree=null;

		try {
			// Tiger.g:1042:5: ( ( value ASSIGN )? )
			// Tiger.g:1042:9: ( value ASSIGN )?
			{
			root_0 = (Object)adaptor.nil();


			// Tiger.g:1042:9: ( value ASSIGN )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Identifier) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Tiger.g:1042:10: value ASSIGN
					{
					pushFollow(FOLLOW_value_in_opt_prefix3050);
					value174=value();
					state._fsp--;

					adaptor.addChild(root_0, value174.getTree());

					ASSIGN175=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_opt_prefix3052); 
					ASSIGN175_tree = (Object)adaptor.create(ASSIGN175);
					adaptor.addChild(root_0, ASSIGN175_tree);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "opt_prefix"


	public static class expr_return extends ParserRuleReturnScope {
		public Type atype;
		public boolean iscomp;
		public boolean isaggregate;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Tiger.g:1045:1: expr returns [Type atype, boolean iscomp, boolean isaggregate] : (com1= expr_lev3 ) ( ( AND ^| OR ^) (com2= expr_lev3 ) )* ;
	public final TigerParser.expr_return expr() throws RecognitionException {
		TigerParser.expr_return retval = new TigerParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND176=null;
		Token OR177=null;
		ParserRuleReturnScope com1 =null;
		ParserRuleReturnScope com2 =null;

		Object AND176_tree=null;
		Object OR177_tree=null;

		try {
			// Tiger.g:1046:5: ( (com1= expr_lev3 ) ( ( AND ^| OR ^) (com2= expr_lev3 ) )* )
			// Tiger.g:1046:9: (com1= expr_lev3 ) ( ( AND ^| OR ^) (com2= expr_lev3 ) )*
			{
			root_0 = (Object)adaptor.nil();


			retval.atype = null;
			// Tiger.g:1047:6: (com1= expr_lev3 )
			// Tiger.g:1047:7: com1= expr_lev3
			{
			pushFollow(FOLLOW_expr_lev3_in_expr3089);
			com1=expr_lev3();
			state._fsp--;

			adaptor.addChild(root_0, com1.getTree());


			    		if((com1!=null?((TigerParser.expr_lev3_return)com1).numofcom:0) > 1) {
			    			throw new IllegalArgumentException("Illegal expression.");
			    		} else if ((com1!=null?((TigerParser.expr_lev3_return)com1).numofcom:0) == 0) {
			    			retval.iscomp = (com1!=null?((TigerParser.expr_lev3_return)com1).iscomp:false);
			    			retval.atype = (com1!=null?((TigerParser.expr_lev3_return)com1).atype:null);
			    		} else {
			    			retval.iscomp = true;
			    			retval.atype = null;
			    		}
			    	
			}

			// Tiger.g:1059:6: ( ( AND ^| OR ^) (com2= expr_lev3 ) )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==AND||LA45_0==OR) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// Tiger.g:1059:7: ( AND ^| OR ^) (com2= expr_lev3 )
					{
					// Tiger.g:1059:7: ( AND ^| OR ^)
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==AND) ) {
						alt44=1;
					}
					else if ( (LA44_0==OR) ) {
						alt44=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						throw nvae;
					}

					switch (alt44) {
						case 1 :
							// Tiger.g:1059:8: AND ^
							{
							AND176=(Token)match(input,AND,FOLLOW_AND_in_expr3106); 
							AND176_tree = (Object)adaptor.create(AND176);
							root_0 = (Object)adaptor.becomeRoot(AND176_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:1059:15: OR ^
							{
							OR177=(Token)match(input,OR,FOLLOW_OR_in_expr3111); 
							OR177_tree = (Object)adaptor.create(OR177);
							root_0 = (Object)adaptor.becomeRoot(OR177_tree, root_0);

							}
							break;

					}

					// Tiger.g:1059:20: (com2= expr_lev3 )
					// Tiger.g:1059:21: com2= expr_lev3
					{
					pushFollow(FOLLOW_expr_lev3_in_expr3120);
					com2=expr_lev3();
					state._fsp--;

					adaptor.addChild(root_0, com2.getTree());


					    		if ((com2!=null?((TigerParser.expr_lev3_return)com2).numofcom:0) == 0 && (com1!=null?((TigerParser.expr_lev3_return)com1).numofcom:0) == 0) {
					    			if (!((com1!=null?((TigerParser.expr_lev3_return)com1).iscomp:false) && (com2!=null?((TigerParser.expr_lev3_return)com2).iscomp:false))) {
					    				throw new IllegalArgumentException("Illegal expression.");
					    			} else {
					    				retval.iscomp = true;
					    				retval.atype = null;
					    			}
					    		} else if ((com2!=null?((TigerParser.expr_lev3_return)com2).numofcom:0) == 1 && (com1!=null?((TigerParser.expr_lev3_return)com1).numofcom:0) == 1) {
					    			retval.iscomp = true;
					    			retval.atype = null;
					    		} else {
					    			throw new IllegalArgumentException("Illegal expression.");
					    		}
					    	
					}

					}
					break;

				default :
					break loop45;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class expr_lev3_return extends ParserRuleReturnScope {
		public Type atype;
		public int numofcom;
		public boolean isaggregate;
		public boolean iscomp;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_lev3"
	// Tiger.g:1077:1: expr_lev3 returns [Type atype, int numofcom, boolean isaggregate, boolean iscomp] : el1= expr_lev2 ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) el2= expr_lev2 )* ;
	public final TigerParser.expr_lev3_return expr_lev3() throws RecognitionException {
		TigerParser.expr_lev3_return retval = new TigerParser.expr_lev3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ178=null;
		Token NEQ179=null;
		Token LESSER180=null;
		Token LESSEREQ181=null;
		Token GREATER182=null;
		Token GREATEREQ183=null;
		ParserRuleReturnScope el1 =null;
		ParserRuleReturnScope el2 =null;

		Object EQ178_tree=null;
		Object NEQ179_tree=null;
		Object LESSER180_tree=null;
		Object LESSEREQ181_tree=null;
		Object GREATER182_tree=null;
		Object GREATEREQ183_tree=null;

		try {
			// Tiger.g:1078:5: (el1= expr_lev2 ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) el2= expr_lev2 )* )
			// Tiger.g:1078:9: el1= expr_lev2 ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) el2= expr_lev2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_lev2_in_expr_lev33158);
			el1=expr_lev2();
			state._fsp--;

			adaptor.addChild(root_0, el1.getTree());


			    	retval.numofcom = 0;
			    	retval.iscomp = (el1!=null?((TigerParser.expr_lev2_return)el1).iscomp:false);
			    	if ((el1!=null?((TigerParser.expr_lev2_return)el1).iscomp:false)) {
			    		retval.atype = null;
			    	} else {
			    		retval.atype = (el1!=null?((TigerParser.expr_lev2_return)el1).atype:null);
			    		retval.isaggregate = (el1!=null?((TigerParser.expr_lev2_return)el1).isaggregate:false);
			    	}
			    
			// Tiger.g:1089:5: ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) el2= expr_lev2 )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==EQ||(LA47_0 >= GREATER && LA47_0 <= GREATEREQ)||(LA47_0 >= LESSER && LA47_0 <= LESSEREQ)||LA47_0==NEQ) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// Tiger.g:1089:6: ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) el2= expr_lev2
					{
					// Tiger.g:1089:6: ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^)
					int alt46=6;
					switch ( input.LA(1) ) {
					case EQ:
						{
						alt46=1;
						}
						break;
					case NEQ:
						{
						alt46=2;
						}
						break;
					case LESSER:
						{
						alt46=3;
						}
						break;
					case LESSEREQ:
						{
						alt46=4;
						}
						break;
					case GREATER:
						{
						alt46=5;
						}
						break;
					case GREATEREQ:
						{
						alt46=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 46, 0, input);
						throw nvae;
					}
					switch (alt46) {
						case 1 :
							// Tiger.g:1089:7: EQ ^
							{
							EQ178=(Token)match(input,EQ,FOLLOW_EQ_in_expr_lev33172); 
							EQ178_tree = (Object)adaptor.create(EQ178);
							root_0 = (Object)adaptor.becomeRoot(EQ178_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:1089:11: NEQ ^
							{
							NEQ179=(Token)match(input,NEQ,FOLLOW_NEQ_in_expr_lev33175); 
							NEQ179_tree = (Object)adaptor.create(NEQ179);
							root_0 = (Object)adaptor.becomeRoot(NEQ179_tree, root_0);

							}
							break;
						case 3 :
							// Tiger.g:1089:16: LESSER ^
							{
							LESSER180=(Token)match(input,LESSER,FOLLOW_LESSER_in_expr_lev33178); 
							LESSER180_tree = (Object)adaptor.create(LESSER180);
							root_0 = (Object)adaptor.becomeRoot(LESSER180_tree, root_0);

							}
							break;
						case 4 :
							// Tiger.g:1089:24: LESSEREQ ^
							{
							LESSEREQ181=(Token)match(input,LESSEREQ,FOLLOW_LESSEREQ_in_expr_lev33181); 
							LESSEREQ181_tree = (Object)adaptor.create(LESSEREQ181);
							root_0 = (Object)adaptor.becomeRoot(LESSEREQ181_tree, root_0);

							}
							break;
						case 5 :
							// Tiger.g:1089:34: GREATER ^
							{
							GREATER182=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_lev33184); 
							GREATER182_tree = (Object)adaptor.create(GREATER182);
							root_0 = (Object)adaptor.becomeRoot(GREATER182_tree, root_0);

							}
							break;
						case 6 :
							// Tiger.g:1089:43: GREATEREQ ^
							{
							GREATEREQ183=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_lev33187); 
							GREATEREQ183_tree = (Object)adaptor.create(GREATEREQ183);
							root_0 = (Object)adaptor.becomeRoot(GREATEREQ183_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_lev2_in_expr_lev33195);
					el2=expr_lev2();
					state._fsp--;

					adaptor.addChild(root_0, el2.getTree());


					    	if ((el1!=null?((TigerParser.expr_lev2_return)el1).iscomp:false) || (el2!=null?((TigerParser.expr_lev2_return)el2).iscomp:false)) {
					    		throw new IllegalArgumentException("Illegal Expression.");
					    	}
					    	retval.numofcom++;
					    	if ((el1!=null?((TigerParser.expr_lev2_return)el1).atype:null).getTypeName().equals("int") || (el1!=null?((TigerParser.expr_lev2_return)el1).atype:null).getTypeName().equals("fixedpt")) {
					    		if ((el2!=null?((TigerParser.expr_lev2_return)el2).atype:null).getTypeName().equals("definedtype")) {
					    			throw new IllegalArgumentException("Type conflict.");
					    		} else {
					    			if (!retval.atype.getTypeName().equals("fixedpt")) {
					    				if ((el2!=null?((TigerParser.expr_lev2_return)el2).atype:null).getTypeName().equals("fixedpt")) {
					    					retval.atype = new Type("fixedpt");
					    				}
					    			}
					    		}
					    	} else {
					    		if (!((el2!=null?((TigerParser.expr_lev2_return)el2).atype:null).getTypeName().equals("definedtype"))) {
					    			throw new IllegalArgumentException("Type conflict.");
					    		} else {
					    			if (!((el2!=null?((TigerParser.expr_lev2_return)el2).atype:null).getIdentifier().equals((el1!=null?((TigerParser.expr_lev2_return)el1).atype:null).getIdentifier()))) {
					 		   			throw new IllegalArgumentException("Type conflict.");
						    		} else if ((el1!=null?((TigerParser.expr_lev2_return)el1).isaggregate:false) || (el2!=null?((TigerParser.expr_lev2_return)el2).isaggregate:false)) {
					    				throw new IllegalArgumentException("Aggregate is not allowed.");
					    			}
					    		}
					    	}
					    
					}
					break;

				default :
					break loop47;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_lev3"


	public static class expr_lev2_return extends ParserRuleReturnScope {
		public Type atype;
		public boolean isaggregate;
		public boolean iscomp;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_lev2"
	// Tiger.g:1119:1: expr_lev2 returns [Type atype, boolean isaggregate, boolean iscomp] : el1= expr_lev1 ( ( PLUS ^| MINUS ^) el2= expr_lev1 )* ;
	public final TigerParser.expr_lev2_return expr_lev2() throws RecognitionException {
		TigerParser.expr_lev2_return retval = new TigerParser.expr_lev2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS184=null;
		Token MINUS185=null;
		ParserRuleReturnScope el1 =null;
		ParserRuleReturnScope el2 =null;

		Object PLUS184_tree=null;
		Object MINUS185_tree=null;

		try {
			// Tiger.g:1120:5: (el1= expr_lev1 ( ( PLUS ^| MINUS ^) el2= expr_lev1 )* )
			// Tiger.g:1120:9: el1= expr_lev1 ( ( PLUS ^| MINUS ^) el2= expr_lev1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_lev1_in_expr_lev23230);
			el1=expr_lev1();
			state._fsp--;

			adaptor.addChild(root_0, el1.getTree());


			    	retval.iscomp = (el1!=null?((TigerParser.expr_lev1_return)el1).iscomp:false);
			    	if ((el1!=null?((TigerParser.expr_lev1_return)el1).iscomp:false)) {
			    		retval.atype = null;
			    	} else {
			    		retval.atype = (el1!=null?((TigerParser.expr_lev1_return)el1).atype:null);
			    		retval.isaggregate = (el1!=null?((TigerParser.expr_lev1_return)el1).isaggregate:false);
			    	}
			    
			// Tiger.g:1130:5: ( ( PLUS ^| MINUS ^) el2= expr_lev1 )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==MINUS||LA49_0==PLUS) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// Tiger.g:1130:6: ( PLUS ^| MINUS ^) el2= expr_lev1
					{
					// Tiger.g:1130:6: ( PLUS ^| MINUS ^)
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==PLUS) ) {
						alt48=1;
					}
					else if ( (LA48_0==MINUS) ) {
						alt48=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}

					switch (alt48) {
						case 1 :
							// Tiger.g:1130:7: PLUS ^
							{
							PLUS184=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_lev23244); 
							PLUS184_tree = (Object)adaptor.create(PLUS184);
							root_0 = (Object)adaptor.becomeRoot(PLUS184_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:1130:13: MINUS ^
							{
							MINUS185=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_lev23247); 
							MINUS185_tree = (Object)adaptor.create(MINUS185);
							root_0 = (Object)adaptor.becomeRoot(MINUS185_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_lev1_in_expr_lev23255);
					el2=expr_lev1();
					state._fsp--;

					adaptor.addChild(root_0, el2.getTree());


					    	if ((el1!=null?((TigerParser.expr_lev1_return)el1).iscomp:false) || (el2!=null?((TigerParser.expr_lev1_return)el2).iscomp:false)) {
					    		throw new IllegalArgumentException("Illegal Expression.");
					    	}
					    	if ((el1!=null?((TigerParser.expr_lev1_return)el1).atype:null).getTypeName().equals("int") || (el1!=null?((TigerParser.expr_lev1_return)el1).atype:null).getTypeName().equals("fixedpt")) {
					    		if ((el2!=null?((TigerParser.expr_lev1_return)el2).atype:null).getTypeName().equals("definedtype")) {
					    			throw new IllegalArgumentException("Type conflict.");
					    		} else {
					    			if (!retval.atype.getTypeName().equals("fixedpt")) {
					    				if ((el2!=null?((TigerParser.expr_lev1_return)el2).atype:null).getTypeName().equals("fixedpt")) {
					    					retval.atype = new Type("fixedpt");
					    				}
					    			}
					    		}
					    	} else {
					    		if (!((el2!=null?((TigerParser.expr_lev1_return)el2).atype:null).getTypeName().equals("definedtype"))) {
					    			throw new IllegalArgumentException("Type conflict.");
					    		} else {
					    			if (!((el2!=null?((TigerParser.expr_lev1_return)el2).atype:null).getIdentifier().equals((el1!=null?((TigerParser.expr_lev1_return)el1).atype:null).getIdentifier()))) {
					 		   			throw new IllegalArgumentException("Type conflict.");
						    		} else if ((el1!=null?((TigerParser.expr_lev1_return)el1).isaggregate:false) || (el2!=null?((TigerParser.expr_lev1_return)el2).isaggregate:false)) {
					    				throw new IllegalArgumentException("Aggregate is not allowed.");
					    			}
					    		}
					    	}
					    
					}
					break;

				default :
					break loop49;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_lev2"


	public static class expr_lev1_return extends ParserRuleReturnScope {
		public Type atype;
		public boolean isaggregate;
		public boolean iscomp;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_lev1"
	// Tiger.g:1159:1: expr_lev1 returns [Type atype, boolean isaggregate, boolean iscomp] : pe1= primary_expression ( ( MULT ^| DIV ^) pe2= primary_expression )* ;
	public final TigerParser.expr_lev1_return expr_lev1() throws RecognitionException {
		TigerParser.expr_lev1_return retval = new TigerParser.expr_lev1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT186=null;
		Token DIV187=null;
		ParserRuleReturnScope pe1 =null;
		ParserRuleReturnScope pe2 =null;

		Object MULT186_tree=null;
		Object DIV187_tree=null;

		try {
			// Tiger.g:1160:5: (pe1= primary_expression ( ( MULT ^| DIV ^) pe2= primary_expression )* )
			// Tiger.g:1160:9: pe1= primary_expression ( ( MULT ^| DIV ^) pe2= primary_expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_primary_expression_in_expr_lev13291);
			pe1=primary_expression();
			state._fsp--;

			adaptor.addChild(root_0, pe1.getTree());


			    	retval.iscomp = (pe1!=null?((TigerParser.primary_expression_return)pe1).iscomp:false);
			    	if ((pe1!=null?((TigerParser.primary_expression_return)pe1).iscomp:false)) {
			    		retval.atype = null;
			    	} else {
			    		retval.atype = (pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null);
			    		retval.isaggregate = (pe1!=null?((TigerParser.primary_expression_return)pe1).isaggregate:false);
			    	}
			    
			// Tiger.g:1170:5: ( ( MULT ^| DIV ^) pe2= primary_expression )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==DIV||LA51_0==MULT) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// Tiger.g:1170:6: ( MULT ^| DIV ^) pe2= primary_expression
					{
					// Tiger.g:1170:6: ( MULT ^| DIV ^)
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==MULT) ) {
						alt50=1;
					}
					else if ( (LA50_0==DIV) ) {
						alt50=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}

					switch (alt50) {
						case 1 :
							// Tiger.g:1170:7: MULT ^
							{
							MULT186=(Token)match(input,MULT,FOLLOW_MULT_in_expr_lev13305); 
							MULT186_tree = (Object)adaptor.create(MULT186);
							root_0 = (Object)adaptor.becomeRoot(MULT186_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:1170:13: DIV ^
							{
							DIV187=(Token)match(input,DIV,FOLLOW_DIV_in_expr_lev13308); 
							DIV187_tree = (Object)adaptor.create(DIV187);
							root_0 = (Object)adaptor.becomeRoot(DIV187_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_primary_expression_in_expr_lev13316);
					pe2=primary_expression();
					state._fsp--;

					adaptor.addChild(root_0, pe2.getTree());


					    	if ((pe1!=null?((TigerParser.primary_expression_return)pe1).iscomp:false) || (pe2!=null?((TigerParser.primary_expression_return)pe2).iscomp:false)) {
					    		throw new IllegalArgumentException("Illegal Expression.");
					    	}
					    	if ((pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getTypeName().equals("int") || (pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getTypeName().equals("fixedpt")) {
					    		if ((pe2!=null?((TigerParser.primary_expression_return)pe2).atype:null).getTypeName().equals("definedtype")) {
					    			throw new IllegalArgumentException("Type conflict.");
					    		} else {
					    			if (!retval.atype.getTypeName().equals("fixedpt")) {
					    				if ((pe2!=null?((TigerParser.primary_expression_return)pe2).atype:null).getTypeName().equals("fixedpt")) {
					    					retval.atype = new Type("fixedpt");
					    				}
					    			}
					    		}
					    	} else {
					    		if (!((pe2!=null?((TigerParser.primary_expression_return)pe2).atype:null).getTypeName().equals("definedtype"))) {
					    			throw new IllegalArgumentException("Type conflict.");
					    		} else {
					    			if (!((pe2!=null?((TigerParser.primary_expression_return)pe2).atype:null).getIdentifier().equals((pe1!=null?((TigerParser.primary_expression_return)pe1).atype:null).getIdentifier()))) {
					    				throw new IllegalArgumentException("Type conflict.");
					    			} else if ((pe1!=null?((TigerParser.primary_expression_return)pe1).isaggregate:false) || (pe2!=null?((TigerParser.primary_expression_return)pe2).isaggregate:false)) {
					    				throw new IllegalArgumentException("Aggregate is not allowed.");
					    			}
					    		}
					    	}
					    
					}
					break;

				default :
					break loop51;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_lev1"


	public static class primary_expression_return extends ParserRuleReturnScope {
		public Type atype;
		public boolean iscomp;
		public boolean isaggregate;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary_expression"
	// Tiger.g:1199:1: primary_expression returns [Type atype, boolean iscomp, boolean isaggregate] : ( constant | value | LPAREN ! expr RPAREN !);
	public final TigerParser.primary_expression_return primary_expression() throws RecognitionException {
		TigerParser.primary_expression_return retval = new TigerParser.primary_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN190=null;
		Token RPAREN192=null;
		ParserRuleReturnScope constant188 =null;
		ParserRuleReturnScope value189 =null;
		ParserRuleReturnScope expr191 =null;

		Object LPAREN190_tree=null;
		Object RPAREN192_tree=null;

		try {
			// Tiger.g:1200:5: ( constant | value | LPAREN ! expr RPAREN !)
			int alt52=3;
			switch ( input.LA(1) ) {
			case FixedPointLiteral:
			case IntegerLiteral:
				{
				alt52=1;
				}
				break;
			case Identifier:
				{
				alt52=2;
				}
				break;
			case LPAREN:
				{
				alt52=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// Tiger.g:1201:5: constant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_in_primary_expression3349);
					constant188=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant188.getTree());


					    	if ((constant188!=null?((TigerParser.constant_return)constant188).isInt:false)) {
					    		retval.atype = new Type("int");
					    	} else {
					    		retval.atype = new Type("fixedpt");
					    	}
					    
					}
					break;
				case 2 :
					// Tiger.g:1209:9: value
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_value_in_primary_expression3365);
					value189=value();
					state._fsp--;

					adaptor.addChild(root_0, value189.getTree());


					    	retval.atype = (value189!=null?((TigerParser.value_return)value189).atype:null);
					    	retval.isaggregate = (value189!=null?((TigerParser.value_return)value189).isaggregate:false);
					    
					}
					break;
				case 3 :
					// Tiger.g:1214:9: LPAREN ! expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN190=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary_expression3381); 
					pushFollow(FOLLOW_expr_in_primary_expression3384);
					expr191=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr191.getTree());

					RPAREN192=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary_expression3386); 

					    	retval.iscomp = (expr191!=null?((TigerParser.expr_return)expr191).iscomp:false);
					    	if ((expr191!=null?((TigerParser.expr_return)expr191).iscomp:false)) {
					    		retval.atype = null;
					    	} else {
					    		retval.atype = (expr191!=null?((TigerParser.expr_return)expr191).atype:null);
					    	}
					    
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary_expression"


	public static class mult_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mult_expr"
	// Tiger.g:1225:1: mult_expr : ( ( MULT ^| DIV ^) primary_expression mult_expr )? ;
	public final TigerParser.mult_expr_return mult_expr() throws RecognitionException {
		TigerParser.mult_expr_return retval = new TigerParser.mult_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT193=null;
		Token DIV194=null;
		ParserRuleReturnScope primary_expression195 =null;
		ParserRuleReturnScope mult_expr196 =null;

		Object MULT193_tree=null;
		Object DIV194_tree=null;

		try {
			// Tiger.g:1226:5: ( ( ( MULT ^| DIV ^) primary_expression mult_expr )? )
			// Tiger.g:1226:9: ( ( MULT ^| DIV ^) primary_expression mult_expr )?
			{
			root_0 = (Object)adaptor.nil();


			// Tiger.g:1226:9: ( ( MULT ^| DIV ^) primary_expression mult_expr )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==DIV||LA54_0==MULT) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// Tiger.g:1226:10: ( MULT ^| DIV ^) primary_expression mult_expr
					{
					// Tiger.g:1226:10: ( MULT ^| DIV ^)
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==MULT) ) {
						alt53=1;
					}
					else if ( (LA53_0==DIV) ) {
						alt53=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// Tiger.g:1226:11: MULT ^
							{
							MULT193=(Token)match(input,MULT,FOLLOW_MULT_in_mult_expr3414); 
							MULT193_tree = (Object)adaptor.create(MULT193);
							root_0 = (Object)adaptor.becomeRoot(MULT193_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:1226:17: DIV ^
							{
							DIV194=(Token)match(input,DIV,FOLLOW_DIV_in_mult_expr3417); 
							DIV194_tree = (Object)adaptor.create(DIV194);
							root_0 = (Object)adaptor.becomeRoot(DIV194_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_primary_expression_in_mult_expr3421);
					primary_expression195=primary_expression();
					state._fsp--;

					adaptor.addChild(root_0, primary_expression195.getTree());

					pushFollow(FOLLOW_mult_expr_in_mult_expr3423);
					mult_expr196=mult_expr();
					state._fsp--;

					adaptor.addChild(root_0, mult_expr196.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mult_expr"


	public static class addtion_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addtion_expr"
	// Tiger.g:1229:1: addtion_expr : ( ( PLUS ^| MINUS ^) expr_lev1 addtion_expr )? ;
	public final TigerParser.addtion_expr_return addtion_expr() throws RecognitionException {
		TigerParser.addtion_expr_return retval = new TigerParser.addtion_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS197=null;
		Token MINUS198=null;
		ParserRuleReturnScope expr_lev1199 =null;
		ParserRuleReturnScope addtion_expr200 =null;

		Object PLUS197_tree=null;
		Object MINUS198_tree=null;

		try {
			// Tiger.g:1230:5: ( ( ( PLUS ^| MINUS ^) expr_lev1 addtion_expr )? )
			// Tiger.g:1230:9: ( ( PLUS ^| MINUS ^) expr_lev1 addtion_expr )?
			{
			root_0 = (Object)adaptor.nil();


			// Tiger.g:1230:9: ( ( PLUS ^| MINUS ^) expr_lev1 addtion_expr )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==MINUS||LA56_0==PLUS) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// Tiger.g:1230:10: ( PLUS ^| MINUS ^) expr_lev1 addtion_expr
					{
					// Tiger.g:1230:10: ( PLUS ^| MINUS ^)
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==PLUS) ) {
						alt55=1;
					}
					else if ( (LA55_0==MINUS) ) {
						alt55=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 55, 0, input);
						throw nvae;
					}

					switch (alt55) {
						case 1 :
							// Tiger.g:1230:11: PLUS ^
							{
							PLUS197=(Token)match(input,PLUS,FOLLOW_PLUS_in_addtion_expr3446); 
							PLUS197_tree = (Object)adaptor.create(PLUS197);
							root_0 = (Object)adaptor.becomeRoot(PLUS197_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:1230:17: MINUS ^
							{
							MINUS198=(Token)match(input,MINUS,FOLLOW_MINUS_in_addtion_expr3449); 
							MINUS198_tree = (Object)adaptor.create(MINUS198);
							root_0 = (Object)adaptor.becomeRoot(MINUS198_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_lev1_in_addtion_expr3453);
					expr_lev1199=expr_lev1();
					state._fsp--;

					adaptor.addChild(root_0, expr_lev1199.getTree());

					pushFollow(FOLLOW_addtion_expr_in_addtion_expr3455);
					addtion_expr200=addtion_expr();
					state._fsp--;

					adaptor.addChild(root_0, addtion_expr200.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addtion_expr"


	public static class comparative_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparative_expr"
	// Tiger.g:1233:1: comparative_expr : ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 comparative_expr )? ;
	public final TigerParser.comparative_expr_return comparative_expr() throws RecognitionException {
		TigerParser.comparative_expr_return retval = new TigerParser.comparative_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ201=null;
		Token NEQ202=null;
		Token LESSER203=null;
		Token LESSEREQ204=null;
		Token GREATER205=null;
		Token GREATEREQ206=null;
		ParserRuleReturnScope expr_lev2207 =null;
		ParserRuleReturnScope comparative_expr208 =null;

		Object EQ201_tree=null;
		Object NEQ202_tree=null;
		Object LESSER203_tree=null;
		Object LESSEREQ204_tree=null;
		Object GREATER205_tree=null;
		Object GREATEREQ206_tree=null;

		try {
			// Tiger.g:1234:5: ( ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 comparative_expr )? )
			// Tiger.g:1234:9: ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 comparative_expr )?
			{
			root_0 = (Object)adaptor.nil();


			// Tiger.g:1234:9: ( ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 comparative_expr )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==EQ||(LA58_0 >= GREATER && LA58_0 <= GREATEREQ)||(LA58_0 >= LESSER && LA58_0 <= LESSEREQ)||LA58_0==NEQ) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// Tiger.g:1234:10: ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^) expr_lev2 comparative_expr
					{
					// Tiger.g:1234:10: ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^)
					int alt57=6;
					switch ( input.LA(1) ) {
					case EQ:
						{
						alt57=1;
						}
						break;
					case NEQ:
						{
						alt57=2;
						}
						break;
					case LESSER:
						{
						alt57=3;
						}
						break;
					case LESSEREQ:
						{
						alt57=4;
						}
						break;
					case GREATER:
						{
						alt57=5;
						}
						break;
					case GREATEREQ:
						{
						alt57=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 57, 0, input);
						throw nvae;
					}
					switch (alt57) {
						case 1 :
							// Tiger.g:1234:11: EQ ^
							{
							EQ201=(Token)match(input,EQ,FOLLOW_EQ_in_comparative_expr3478); 
							EQ201_tree = (Object)adaptor.create(EQ201);
							root_0 = (Object)adaptor.becomeRoot(EQ201_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:1234:15: NEQ ^
							{
							NEQ202=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparative_expr3481); 
							NEQ202_tree = (Object)adaptor.create(NEQ202);
							root_0 = (Object)adaptor.becomeRoot(NEQ202_tree, root_0);

							}
							break;
						case 3 :
							// Tiger.g:1234:20: LESSER ^
							{
							LESSER203=(Token)match(input,LESSER,FOLLOW_LESSER_in_comparative_expr3484); 
							LESSER203_tree = (Object)adaptor.create(LESSER203);
							root_0 = (Object)adaptor.becomeRoot(LESSER203_tree, root_0);

							}
							break;
						case 4 :
							// Tiger.g:1234:28: LESSEREQ ^
							{
							LESSEREQ204=(Token)match(input,LESSEREQ,FOLLOW_LESSEREQ_in_comparative_expr3487); 
							LESSEREQ204_tree = (Object)adaptor.create(LESSEREQ204);
							root_0 = (Object)adaptor.becomeRoot(LESSEREQ204_tree, root_0);

							}
							break;
						case 5 :
							// Tiger.g:1234:38: GREATER ^
							{
							GREATER205=(Token)match(input,GREATER,FOLLOW_GREATER_in_comparative_expr3490); 
							GREATER205_tree = (Object)adaptor.create(GREATER205);
							root_0 = (Object)adaptor.becomeRoot(GREATER205_tree, root_0);

							}
							break;
						case 6 :
							// Tiger.g:1234:47: GREATEREQ ^
							{
							GREATEREQ206=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_comparative_expr3493); 
							GREATEREQ206_tree = (Object)adaptor.create(GREATEREQ206);
							root_0 = (Object)adaptor.becomeRoot(GREATEREQ206_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_lev2_in_comparative_expr3497);
					expr_lev2207=expr_lev2();
					state._fsp--;

					adaptor.addChild(root_0, expr_lev2207.getTree());

					pushFollow(FOLLOW_comparative_expr_in_comparative_expr3499);
					comparative_expr208=comparative_expr();
					state._fsp--;

					adaptor.addChild(root_0, comparative_expr208.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparative_expr"


	public static class logic_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_expr"
	// Tiger.g:1237:1: logic_expr : ( ( AND ^| OR ^) expr_lev3 logic_expr )? ;
	public final TigerParser.logic_expr_return logic_expr() throws RecognitionException {
		TigerParser.logic_expr_return retval = new TigerParser.logic_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND209=null;
		Token OR210=null;
		ParserRuleReturnScope expr_lev3211 =null;
		ParserRuleReturnScope logic_expr212 =null;

		Object AND209_tree=null;
		Object OR210_tree=null;

		try {
			// Tiger.g:1238:5: ( ( ( AND ^| OR ^) expr_lev3 logic_expr )? )
			// Tiger.g:1238:9: ( ( AND ^| OR ^) expr_lev3 logic_expr )?
			{
			root_0 = (Object)adaptor.nil();


			// Tiger.g:1238:9: ( ( AND ^| OR ^) expr_lev3 logic_expr )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==AND||LA60_0==OR) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// Tiger.g:1238:10: ( AND ^| OR ^) expr_lev3 logic_expr
					{
					// Tiger.g:1238:10: ( AND ^| OR ^)
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==AND) ) {
						alt59=1;
					}
					else if ( (LA59_0==OR) ) {
						alt59=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 59, 0, input);
						throw nvae;
					}

					switch (alt59) {
						case 1 :
							// Tiger.g:1238:11: AND ^
							{
							AND209=(Token)match(input,AND,FOLLOW_AND_in_logic_expr3522); 
							AND209_tree = (Object)adaptor.create(AND209);
							root_0 = (Object)adaptor.becomeRoot(AND209_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:1238:18: OR ^
							{
							OR210=(Token)match(input,OR,FOLLOW_OR_in_logic_expr3527); 
							OR210_tree = (Object)adaptor.create(OR210);
							root_0 = (Object)adaptor.becomeRoot(OR210_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_lev3_in_logic_expr3531);
					expr_lev3211=expr_lev3();
					state._fsp--;

					adaptor.addChild(root_0, expr_lev3211.getTree());

					pushFollow(FOLLOW_logic_expr_in_logic_expr3533);
					logic_expr212=logic_expr();
					state._fsp--;

					adaptor.addChild(root_0, logic_expr212.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logic_expr"


	public static class constant_return extends ParserRuleReturnScope {
		public boolean isInt;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// Tiger.g:1241:1: constant returns [boolean isInt] : ( IntegerLiteral | FixedPointLiteral );
	public final TigerParser.constant_return constant() throws RecognitionException {
		TigerParser.constant_return retval = new TigerParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IntegerLiteral213=null;
		Token FixedPointLiteral214=null;

		Object IntegerLiteral213_tree=null;
		Object FixedPointLiteral214_tree=null;

		try {
			// Tiger.g:1242:5: ( IntegerLiteral | FixedPointLiteral )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==IntegerLiteral) ) {
				alt61=1;
			}
			else if ( (LA61_0==FixedPointLiteral) ) {
				alt61=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// Tiger.g:1242:9: IntegerLiteral
					{
					root_0 = (Object)adaptor.nil();


					IntegerLiteral213=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_constant3558); 
					IntegerLiteral213_tree = (Object)adaptor.create(IntegerLiteral213);
					adaptor.addChild(root_0, IntegerLiteral213_tree);

					retval.isInt = true;
					}
					break;
				case 2 :
					// Tiger.g:1243:9: FixedPointLiteral
					{
					root_0 = (Object)adaptor.nil();


					FixedPointLiteral214=(Token)match(input,FixedPointLiteral,FOLLOW_FixedPointLiteral_in_constant3570); 
					FixedPointLiteral214_tree = (Object)adaptor.create(FixedPointLiteral214);
					adaptor.addChild(root_0, FixedPointLiteral214_tree);

					retval.isInt = false;
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class logical_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logical_operator"
	// Tiger.g:1248:1: logical_operator : ( paren_operator | and_or_operator );
	public final TigerParser.logical_operator_return logical_operator() throws RecognitionException {
		TigerParser.logical_operator_return retval = new TigerParser.logical_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope paren_operator215 =null;
		ParserRuleReturnScope and_or_operator216 =null;


		try {
			// Tiger.g:1249:5: ( paren_operator | and_or_operator )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==LPAREN||LA62_0==RPAREN) ) {
				alt62=1;
			}
			else if ( (LA62_0==AND||LA62_0==OR) ) {
				alt62=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// Tiger.g:1249:9: paren_operator
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_paren_operator_in_logical_operator3594);
					paren_operator215=paren_operator();
					state._fsp--;

					adaptor.addChild(root_0, paren_operator215.getTree());

					}
					break;
				case 2 :
					// Tiger.g:1250:9: and_or_operator
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_and_or_operator_in_logical_operator3604);
					and_or_operator216=and_or_operator();
					state._fsp--;

					adaptor.addChild(root_0, and_or_operator216.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_operator"


	public static class paren_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paren_operator"
	// Tiger.g:1254:1: paren_operator : ( LPAREN !| RPAREN !);
	public final TigerParser.paren_operator_return paren_operator() throws RecognitionException {
		TigerParser.paren_operator_return retval = new TigerParser.paren_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN217=null;
		Token RPAREN218=null;

		Object LPAREN217_tree=null;
		Object RPAREN218_tree=null;

		try {
			// Tiger.g:1255:5: ( LPAREN !| RPAREN !)
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==LPAREN) ) {
				alt63=1;
			}
			else if ( (LA63_0==RPAREN) ) {
				alt63=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// Tiger.g:1255:9: LPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN217=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_paren_operator3624); 
					}
					break;
				case 2 :
					// Tiger.g:1256:9: RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					RPAREN218=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_paren_operator3635); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paren_operator"


	public static class mult_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mult_operator"
	// Tiger.g:1260:1: mult_operator : ( MULT ^| DIV ^);
	public final TigerParser.mult_operator_return mult_operator() throws RecognitionException {
		TigerParser.mult_operator_return retval = new TigerParser.mult_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT219=null;
		Token DIV220=null;

		Object MULT219_tree=null;
		Object DIV220_tree=null;

		try {
			// Tiger.g:1261:5: ( MULT ^| DIV ^)
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==MULT) ) {
				alt64=1;
			}
			else if ( (LA64_0==DIV) ) {
				alt64=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// Tiger.g:1261:9: MULT ^
					{
					root_0 = (Object)adaptor.nil();


					MULT219=(Token)match(input,MULT,FOLLOW_MULT_in_mult_operator3656); 
					MULT219_tree = (Object)adaptor.create(MULT219);
					root_0 = (Object)adaptor.becomeRoot(MULT219_tree, root_0);

					}
					break;
				case 2 :
					// Tiger.g:1262:9: DIV ^
					{
					root_0 = (Object)adaptor.nil();


					DIV220=(Token)match(input,DIV,FOLLOW_DIV_in_mult_operator3667); 
					DIV220_tree = (Object)adaptor.create(DIV220);
					root_0 = (Object)adaptor.becomeRoot(DIV220_tree, root_0);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mult_operator"


	public static class addition_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addition_operator"
	// Tiger.g:1266:1: addition_operator : ( PLUS ^| MINUS ^);
	public final TigerParser.addition_operator_return addition_operator() throws RecognitionException {
		TigerParser.addition_operator_return retval = new TigerParser.addition_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS221=null;
		Token MINUS222=null;

		Object PLUS221_tree=null;
		Object MINUS222_tree=null;

		try {
			// Tiger.g:1267:5: ( PLUS ^| MINUS ^)
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==PLUS) ) {
				alt65=1;
			}
			else if ( (LA65_0==MINUS) ) {
				alt65=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// Tiger.g:1267:9: PLUS ^
					{
					root_0 = (Object)adaptor.nil();


					PLUS221=(Token)match(input,PLUS,FOLLOW_PLUS_in_addition_operator3688); 
					PLUS221_tree = (Object)adaptor.create(PLUS221);
					root_0 = (Object)adaptor.becomeRoot(PLUS221_tree, root_0);

					}
					break;
				case 2 :
					// Tiger.g:1268:9: MINUS ^
					{
					root_0 = (Object)adaptor.nil();


					MINUS222=(Token)match(input,MINUS,FOLLOW_MINUS_in_addition_operator3699); 
					MINUS222_tree = (Object)adaptor.create(MINUS222);
					root_0 = (Object)adaptor.becomeRoot(MINUS222_tree, root_0);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addition_operator"


	public static class comparative_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparative_operator"
	// Tiger.g:1272:1: comparative_operator : ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^);
	public final TigerParser.comparative_operator_return comparative_operator() throws RecognitionException {
		TigerParser.comparative_operator_return retval = new TigerParser.comparative_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ223=null;
		Token NEQ224=null;
		Token LESSER225=null;
		Token LESSEREQ226=null;
		Token GREATER227=null;
		Token GREATEREQ228=null;

		Object EQ223_tree=null;
		Object NEQ224_tree=null;
		Object LESSER225_tree=null;
		Object LESSEREQ226_tree=null;
		Object GREATER227_tree=null;
		Object GREATEREQ228_tree=null;

		try {
			// Tiger.g:1273:5: ( EQ ^| NEQ ^| LESSER ^| LESSEREQ ^| GREATER ^| GREATEREQ ^)
			int alt66=6;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt66=1;
				}
				break;
			case NEQ:
				{
				alt66=2;
				}
				break;
			case LESSER:
				{
				alt66=3;
				}
				break;
			case LESSEREQ:
				{
				alt66=4;
				}
				break;
			case GREATER:
				{
				alt66=5;
				}
				break;
			case GREATEREQ:
				{
				alt66=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// Tiger.g:1273:9: EQ ^
					{
					root_0 = (Object)adaptor.nil();


					EQ223=(Token)match(input,EQ,FOLLOW_EQ_in_comparative_operator3720); 
					EQ223_tree = (Object)adaptor.create(EQ223);
					root_0 = (Object)adaptor.becomeRoot(EQ223_tree, root_0);

					}
					break;
				case 2 :
					// Tiger.g:1274:9: NEQ ^
					{
					root_0 = (Object)adaptor.nil();


					NEQ224=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparative_operator3731); 
					NEQ224_tree = (Object)adaptor.create(NEQ224);
					root_0 = (Object)adaptor.becomeRoot(NEQ224_tree, root_0);

					}
					break;
				case 3 :
					// Tiger.g:1275:9: LESSER ^
					{
					root_0 = (Object)adaptor.nil();


					LESSER225=(Token)match(input,LESSER,FOLLOW_LESSER_in_comparative_operator3742); 
					LESSER225_tree = (Object)adaptor.create(LESSER225);
					root_0 = (Object)adaptor.becomeRoot(LESSER225_tree, root_0);

					}
					break;
				case 4 :
					// Tiger.g:1276:9: LESSEREQ ^
					{
					root_0 = (Object)adaptor.nil();


					LESSEREQ226=(Token)match(input,LESSEREQ,FOLLOW_LESSEREQ_in_comparative_operator3753); 
					LESSEREQ226_tree = (Object)adaptor.create(LESSEREQ226);
					root_0 = (Object)adaptor.becomeRoot(LESSEREQ226_tree, root_0);

					}
					break;
				case 5 :
					// Tiger.g:1277:9: GREATER ^
					{
					root_0 = (Object)adaptor.nil();


					GREATER227=(Token)match(input,GREATER,FOLLOW_GREATER_in_comparative_operator3764); 
					GREATER227_tree = (Object)adaptor.create(GREATER227);
					root_0 = (Object)adaptor.becomeRoot(GREATER227_tree, root_0);

					}
					break;
				case 6 :
					// Tiger.g:1278:9: GREATEREQ ^
					{
					root_0 = (Object)adaptor.nil();


					GREATEREQ228=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_comparative_operator3775); 
					GREATEREQ228_tree = (Object)adaptor.create(GREATEREQ228);
					root_0 = (Object)adaptor.becomeRoot(GREATEREQ228_tree, root_0);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparative_operator"


	public static class and_or_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "and_or_operator"
	// Tiger.g:1282:1: and_or_operator : ( AND ^| OR ^);
	public final TigerParser.and_or_operator_return and_or_operator() throws RecognitionException {
		TigerParser.and_or_operator_return retval = new TigerParser.and_or_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND229=null;
		Token OR230=null;

		Object AND229_tree=null;
		Object OR230_tree=null;

		try {
			// Tiger.g:1283:5: ( AND ^| OR ^)
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==AND) ) {
				alt67=1;
			}
			else if ( (LA67_0==OR) ) {
				alt67=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// Tiger.g:1283:9: AND ^
					{
					root_0 = (Object)adaptor.nil();


					AND229=(Token)match(input,AND,FOLLOW_AND_in_and_or_operator3796); 
					AND229_tree = (Object)adaptor.create(AND229);
					root_0 = (Object)adaptor.becomeRoot(AND229_tree, root_0);

					}
					break;
				case 2 :
					// Tiger.g:1284:9: OR ^
					{
					root_0 = (Object)adaptor.nil();


					OR230=(Token)match(input,OR,FOLLOW_OR_in_and_or_operator3807); 
					OR230_tree = (Object)adaptor.create(OR230);
					root_0 = (Object)adaptor.becomeRoot(OR230_tree, root_0);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "and_or_operator"


	public static class binary_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binary_operator"
	// Tiger.g:1287:1: binary_operator : ( addition_operator | mult_operator | comparative_operator | and_or_operator );
	public final TigerParser.binary_operator_return binary_operator() throws RecognitionException {
		TigerParser.binary_operator_return retval = new TigerParser.binary_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope addition_operator231 =null;
		ParserRuleReturnScope mult_operator232 =null;
		ParserRuleReturnScope comparative_operator233 =null;
		ParserRuleReturnScope and_or_operator234 =null;


		try {
			// Tiger.g:1288:5: ( addition_operator | mult_operator | comparative_operator | and_or_operator )
			int alt68=4;
			switch ( input.LA(1) ) {
			case MINUS:
			case PLUS:
				{
				alt68=1;
				}
				break;
			case DIV:
			case MULT:
				{
				alt68=2;
				}
				break;
			case EQ:
			case GREATER:
			case GREATEREQ:
			case LESSER:
			case LESSEREQ:
			case NEQ:
				{
				alt68=3;
				}
				break;
			case AND:
			case OR:
				{
				alt68=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}
			switch (alt68) {
				case 1 :
					// Tiger.g:1288:9: addition_operator
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_addition_operator_in_binary_operator3827);
					addition_operator231=addition_operator();
					state._fsp--;

					adaptor.addChild(root_0, addition_operator231.getTree());

					}
					break;
				case 2 :
					// Tiger.g:1289:9: mult_operator
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_mult_operator_in_binary_operator3837);
					mult_operator232=mult_operator();
					state._fsp--;

					adaptor.addChild(root_0, mult_operator232.getTree());

					}
					break;
				case 3 :
					// Tiger.g:1290:9: comparative_operator
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_comparative_operator_in_binary_operator3847);
					comparative_operator233=comparative_operator();
					state._fsp--;

					adaptor.addChild(root_0, comparative_operator233.getTree());

					}
					break;
				case 4 :
					// Tiger.g:1291:9: and_or_operator
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_and_or_operator_in_binary_operator3857);
					and_or_operator234=and_or_operator();
					state._fsp--;

					adaptor.addChild(root_0, and_or_operator234.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binary_operator"


	public static class expr_list_return extends ParserRuleReturnScope {
		public ArrayList<Type> pm;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// Tiger.g:1294:1: expr_list returns [ArrayList<Type> pm] : ( expr expr_list_tail )? ;
	public final TigerParser.expr_list_return expr_list() throws RecognitionException {
		TigerParser.expr_list_return retval = new TigerParser.expr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr235 =null;
		ParserRuleReturnScope expr_list_tail236 =null;


		try {
			// Tiger.g:1295:5: ( ( expr expr_list_tail )? )
			// Tiger.g:1295:7: ( expr expr_list_tail )?
			{
			root_0 = (Object)adaptor.nil();


			retval.pm = new ArrayList<>();
			// Tiger.g:1296:5: ( expr expr_list_tail )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==FixedPointLiteral||(LA69_0 >= Identifier && LA69_0 <= IntegerLiteral)||LA69_0==LPAREN) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// Tiger.g:1296:6: expr expr_list_tail
					{
					pushFollow(FOLLOW_expr_in_expr_list3885);
					expr235=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr235.getTree());

					pushFollow(FOLLOW_expr_list_tail_in_expr_list3887);
					expr_list_tail236=expr_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, expr_list_tail236.getTree());


					    	if ((expr235!=null?((TigerParser.expr_return)expr235).iscomp:false)) {
					    		throw new IllegalArgumentException("Illegal expression for passing in values.");
					    	}
					    	retval.pm.add((expr235!=null?((TigerParser.expr_return)expr235).atype:null));
					    	retval.pm.addAll((expr_list_tail236!=null?((TigerParser.expr_list_tail_return)expr_list_tail236).pm:null));
					    
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_list"


	public static class expr_list_tail_return extends ParserRuleReturnScope {
		public ArrayList<Type> pm;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_list_tail"
	// Tiger.g:1306:1: expr_list_tail returns [ArrayList<Type> pm] : ( COMMA expr )* ;
	public final TigerParser.expr_list_tail_return expr_list_tail() throws RecognitionException {
		TigerParser.expr_list_tail_return retval = new TigerParser.expr_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA237=null;
		ParserRuleReturnScope expr238 =null;

		Object COMMA237_tree=null;

		try {
			// Tiger.g:1307:5: ( ( COMMA expr )* )
			// Tiger.g:1307:9: ( COMMA expr )*
			{
			root_0 = (Object)adaptor.nil();


			retval.pm = new ArrayList<>();
			// Tiger.g:1308:6: ( COMMA expr )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==COMMA) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// Tiger.g:1308:7: COMMA expr
					{
					COMMA237=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail3928); 
					COMMA237_tree = (Object)adaptor.create(COMMA237);
					adaptor.addChild(root_0, COMMA237_tree);

					pushFollow(FOLLOW_expr_in_expr_list_tail3930);
					expr238=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr238.getTree());


					    		if ((expr238!=null?((TigerParser.expr_return)expr238).iscomp:false)) {
					    			throw new IllegalArgumentException("Illegal expression for passing in values.");
					    		}
					    		retval.pm.add((expr238!=null?((TigerParser.expr_return)expr238).atype:null));
					    	
					}
					break;

				default :
					break loop70;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_list_tail"


	public static class value_return extends ParserRuleReturnScope {
		public Type atype;
		public boolean isaggregate;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value"
	// Tiger.g:1317:1: value returns [Type atype, boolean isaggregate] : Identifier ^ value_tail ;
	public final TigerParser.value_return value() throws RecognitionException {
		TigerParser.value_return retval = new TigerParser.value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier239=null;
		ParserRuleReturnScope value_tail240 =null;

		Object Identifier239_tree=null;

		try {
			// Tiger.g:1318:5: ( Identifier ^ value_tail )
			// Tiger.g:1318:9: Identifier ^ value_tail
			{
			root_0 = (Object)adaptor.nil();


			Identifier239=(Token)match(input,Identifier,FOLLOW_Identifier_in_value3962); 
			Identifier239_tree = (Object)adaptor.create(Identifier239);
			root_0 = (Object)adaptor.becomeRoot(Identifier239_tree, root_0);

			pushFollow(FOLLOW_value_tail_in_value3965);
			value_tail240=value_tail();
			state._fsp--;

			adaptor.addChild(root_0, value_tail240.getTree());


			    		retval.isaggregate = false;
			    		retval.atype = null;
			    		if (st.lookup((Identifier239!=null?Identifier239.getText():null)) == null) {
			    			throw new IllegalArgumentException("Undefined variable.");
			    		} else {
			    			if ((value_tail240!=null?((TigerParser.value_tail_return)value_tail240).is1D:false) && (value_tail240!=null?((TigerParser.value_tail_return)value_tail240).is2D:false)) {
			    				if (!(st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("definedtype")
			    					&& ((DefinedType) st.lookup((Identifier239!=null?Identifier239.getText():null))).getBaseType().getTypeName().equals("twoDarray")
			    					&& st.lookup((Identifier239!=null?Identifier239.getText():null)).getIsVar() == true)) {
			    					throw new IllegalArgumentException("Illegal variable type.");
			    				} else {
			    					retval.atype = ((DefinedType) st.lookup((Identifier239!=null?Identifier239.getText():null))).getBaseType().getBaseType();
			    				}
			    			} else if ((value_tail240!=null?((TigerParser.value_tail_return)value_tail240).is1D:false)) {
			    				if (!(st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("definedtype")
			    					&& st.lookup((Identifier239!=null?Identifier239.getText():null)).getBaseType().getTypeName().equals("oneDarray")
			    					&& st.lookup((Identifier239!=null?Identifier239.getText():null)).getIsVar() == true)) {
			    					throw new IllegalArgumentException("Illegal variable type.");
			    				} else {
			    					retval.atype = ((DefinedType) st.lookup((Identifier239!=null?Identifier239.getText():null))).getBaseType().getBaseType();
			    				}
			    			} else {
			    				if (!(st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("int")
			    					|| st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("fixedpt")
			    					|| (st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("definedtype")
			    					&& ((DefinedType) st.lookup((Identifier239!=null?Identifier239.getText():null))).getBaseType().getTypeName().equals("int")
			    					&& st.lookup((Identifier239!=null?Identifier239.getText():null)).getIsVar() == true)
			    					|| (st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("definedtype")
			    					&& ((DefinedType) st.lookup((Identifier239!=null?Identifier239.getText():null))).getBaseType().getTypeName().equals("fixedpt")
			    					&& st.lookup((Identifier239!=null?Identifier239.getText():null)).getIsVar() == true)
			    					|| (st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("definedtype")
			    					&& ((DefinedType) st.lookup((Identifier239!=null?Identifier239.getText():null))).getBaseType().getTypeName().equals("twoDarray")
			    					&& st.lookup((Identifier239!=null?Identifier239.getText():null)).getIsVar() == true)
			    					|| (st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("definedtype")
			    					&& ((DefinedType) st.lookup((Identifier239!=null?Identifier239.getText():null))).getBaseType().getTypeName().equals("oneDarray")
			    					&& st.lookup((Identifier239!=null?Identifier239.getText():null)).getIsVar() == true))) {
			    					throw new IllegalArgumentException("Illegal variable type."); 
			    				} else if ((st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("definedtype")
			    					&& ((DefinedType) st.lookup((Identifier239!=null?Identifier239.getText():null))).getBaseType().getTypeName().equals("int")
			    					&& st.lookup((Identifier239!=null?Identifier239.getText():null)).getIsVar() == true)
			    					|| (st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("definedtype")
			    					&& ((DefinedType) st.lookup((Identifier239!=null?Identifier239.getText():null))).getBaseType().getTypeName().equals("fixedpt")
			    					&& st.lookup((Identifier239!=null?Identifier239.getText():null)).getIsVar() == true)) {
			    					retval.atype = st.lookup((Identifier239!=null?Identifier239.getText():null));
			    				} else if (st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("int")) {
			    					retval.atype = new Type("int");
			    				} else if (st.lookup((Identifier239!=null?Identifier239.getText():null)).getTypeName().equals("fixedpt")) {
			    					retval.atype = new Type("fixedpt");
			    				} else {
			    					retval.atype = st.lookup((Identifier239!=null?Identifier239.getText():null));
			    					retval.isaggregate = true;
			    				}
			    			}
			    		}
			    	
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class value_tail_return extends ParserRuleReturnScope {
		public boolean is1D;
		public boolean is2D;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value_tail"
	// Tiger.g:1377:1: value_tail returns [boolean is1D, boolean is2D] : ( LBRACK index_expr RBRACK value_tail_tail )? -> ( ^( INDEX1 index_expr ( value_tail_tail )? ) )? ;
	public final TigerParser.value_tail_return value_tail() throws RecognitionException {
		TigerParser.value_tail_return retval = new TigerParser.value_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK241=null;
		Token RBRACK243=null;
		ParserRuleReturnScope index_expr242 =null;
		ParserRuleReturnScope value_tail_tail244 =null;

		Object LBRACK241_tree=null;
		Object RBRACK243_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_value_tail_tail=new RewriteRuleSubtreeStream(adaptor,"rule value_tail_tail");

		try {
			// Tiger.g:1378:5: ( ( LBRACK index_expr RBRACK value_tail_tail )? -> ( ^( INDEX1 index_expr ( value_tail_tail )? ) )? )
			// Tiger.g:1378:9: ( LBRACK index_expr RBRACK value_tail_tail )?
			{
			retval.is1D = false;
			    	 retval.is2D = false;
			// Tiger.g:1380:6: ( LBRACK index_expr RBRACK value_tail_tail )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==LBRACK) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// Tiger.g:1380:7: LBRACK index_expr RBRACK value_tail_tail
					{
					LBRACK241=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_value_tail4003);  
					stream_LBRACK.add(LBRACK241);

					pushFollow(FOLLOW_index_expr_in_value_tail4005);
					index_expr242=index_expr();
					state._fsp--;

					stream_index_expr.add(index_expr242.getTree());
					RBRACK243=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_value_tail4007);  
					stream_RBRACK.add(RBRACK243);

					pushFollow(FOLLOW_value_tail_tail_in_value_tail4009);
					value_tail_tail244=value_tail_tail();
					state._fsp--;

					stream_value_tail_tail.add(value_tail_tail244.getTree());

					    		retval.is1D = true;
					    		retval.is2D = (value_tail_tail244!=null?((TigerParser.value_tail_tail_return)value_tail_tail244).is2D:false);
					    	
					}
					break;

			}

			// AST REWRITE
			// elements: index_expr, value_tail_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 1385:9: -> ( ^( INDEX1 index_expr ( value_tail_tail )? ) )?
			{
				// Tiger.g:1385:12: ( ^( INDEX1 index_expr ( value_tail_tail )? ) )?
				if ( stream_index_expr.hasNext()||stream_value_tail_tail.hasNext() ) {
					// Tiger.g:1385:12: ^( INDEX1 index_expr ( value_tail_tail )? )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEX1, "INDEX1"), root_1);
					adaptor.addChild(root_1, stream_index_expr.nextTree());
					// Tiger.g:1385:32: ( value_tail_tail )?
					if ( stream_value_tail_tail.hasNext() ) {
						adaptor.addChild(root_1, stream_value_tail_tail.nextTree());
					}
					stream_value_tail_tail.reset();

					adaptor.addChild(root_0, root_1);
					}

				}
				stream_index_expr.reset();
				stream_value_tail_tail.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value_tail"


	public static class value_tail_tail_return extends ParserRuleReturnScope {
		public boolean is2D;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value_tail_tail"
	// Tiger.g:1388:1: value_tail_tail returns [boolean is2D] : ( LBRACK index_expr RBRACK )? -> ( ^( INDEX2 index_expr ) )? ;
	public final TigerParser.value_tail_tail_return value_tail_tail() throws RecognitionException {
		TigerParser.value_tail_tail_return retval = new TigerParser.value_tail_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK245=null;
		Token RBRACK247=null;
		ParserRuleReturnScope index_expr246 =null;

		Object LBRACK245_tree=null;
		Object RBRACK247_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// Tiger.g:1389:5: ( ( LBRACK index_expr RBRACK )? -> ( ^( INDEX2 index_expr ) )? )
			// Tiger.g:1389:7: ( LBRACK index_expr RBRACK )?
			{
			 retval.is2D = false; 
			// Tiger.g:1390:6: ( LBRACK index_expr RBRACK )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==LBRACK) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// Tiger.g:1390:7: LBRACK index_expr RBRACK
					{
					LBRACK245=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_value_tail_tail4069);  
					stream_LBRACK.add(LBRACK245);

					pushFollow(FOLLOW_index_expr_in_value_tail_tail4071);
					index_expr246=index_expr();
					state._fsp--;

					stream_index_expr.add(index_expr246.getTree());
					RBRACK247=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_value_tail_tail4073);  
					stream_RBRACK.add(RBRACK247);


					    		retval.is2D = true;
					    	
					}
					break;

			}

			// AST REWRITE
			// elements: index_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 1393:10: -> ( ^( INDEX2 index_expr ) )?
			{
				// Tiger.g:1393:13: ( ^( INDEX2 index_expr ) )?
				if ( stream_index_expr.hasNext() ) {
					// Tiger.g:1393:13: ^( INDEX2 index_expr )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEX2, "INDEX2"), root_1);
					adaptor.addChild(root_1, stream_index_expr.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_index_expr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value_tail_tail"


	public static class index_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr"
	// Tiger.g:1396:1: index_expr : index_expr_lev1 ( ( PLUS ^| MINUS ^) index_expr_lev1 )* ;
	public final TigerParser.index_expr_return index_expr() throws RecognitionException {
		TigerParser.index_expr_return retval = new TigerParser.index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS249=null;
		Token MINUS250=null;
		ParserRuleReturnScope index_expr_lev1248 =null;
		ParserRuleReturnScope index_expr_lev1251 =null;

		Object PLUS249_tree=null;
		Object MINUS250_tree=null;

		try {
			// Tiger.g:1397:5: ( index_expr_lev1 ( ( PLUS ^| MINUS ^) index_expr_lev1 )* )
			// Tiger.g:1397:7: index_expr_lev1 ( ( PLUS ^| MINUS ^) index_expr_lev1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_index_expr_lev1_in_index_expr4108);
			index_expr_lev1248=index_expr_lev1();
			state._fsp--;

			adaptor.addChild(root_0, index_expr_lev1248.getTree());

			// Tiger.g:1397:23: ( ( PLUS ^| MINUS ^) index_expr_lev1 )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==MINUS||LA74_0==PLUS) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// Tiger.g:1397:24: ( PLUS ^| MINUS ^) index_expr_lev1
					{
					// Tiger.g:1397:24: ( PLUS ^| MINUS ^)
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==PLUS) ) {
						alt73=1;
					}
					else if ( (LA73_0==MINUS) ) {
						alt73=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 73, 0, input);
						throw nvae;
					}

					switch (alt73) {
						case 1 :
							// Tiger.g:1397:25: PLUS ^
							{
							PLUS249=(Token)match(input,PLUS,FOLLOW_PLUS_in_index_expr4112); 
							PLUS249_tree = (Object)adaptor.create(PLUS249);
							root_0 = (Object)adaptor.becomeRoot(PLUS249_tree, root_0);

							}
							break;
						case 2 :
							// Tiger.g:1397:33: MINUS ^
							{
							MINUS250=(Token)match(input,MINUS,FOLLOW_MINUS_in_index_expr4117); 
							MINUS250_tree = (Object)adaptor.create(MINUS250);
							root_0 = (Object)adaptor.becomeRoot(MINUS250_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_index_expr_lev1_in_index_expr4121);
					index_expr_lev1251=index_expr_lev1();
					state._fsp--;

					adaptor.addChild(root_0, index_expr_lev1251.getTree());

					}
					break;

				default :
					break loop74;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "index_expr"


	public static class index_expr_lev1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr_lev1"
	// Tiger.g:1400:1: index_expr_lev1 : primary_index_expr ( MULT ^ primary_index_expr )* ;
	public final TigerParser.index_expr_lev1_return index_expr_lev1() throws RecognitionException {
		TigerParser.index_expr_lev1_return retval = new TigerParser.index_expr_lev1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT253=null;
		ParserRuleReturnScope primary_index_expr252 =null;
		ParserRuleReturnScope primary_index_expr254 =null;

		Object MULT253_tree=null;

		try {
			// Tiger.g:1401:5: ( primary_index_expr ( MULT ^ primary_index_expr )* )
			// Tiger.g:1401:7: primary_index_expr ( MULT ^ primary_index_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_primary_index_expr_in_index_expr_lev14144);
			primary_index_expr252=primary_index_expr();
			state._fsp--;

			adaptor.addChild(root_0, primary_index_expr252.getTree());

			// Tiger.g:1401:26: ( MULT ^ primary_index_expr )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==MULT) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// Tiger.g:1401:27: MULT ^ primary_index_expr
					{
					MULT253=(Token)match(input,MULT,FOLLOW_MULT_in_index_expr_lev14147); 
					MULT253_tree = (Object)adaptor.create(MULT253);
					root_0 = (Object)adaptor.becomeRoot(MULT253_tree, root_0);

					pushFollow(FOLLOW_primary_index_expr_in_index_expr_lev14150);
					primary_index_expr254=primary_index_expr();
					state._fsp--;

					adaptor.addChild(root_0, primary_index_expr254.getTree());

					}
					break;

				default :
					break loop75;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "index_expr_lev1"


	public static class primary_index_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary_index_expr"
	// Tiger.g:1404:1: primary_index_expr : ( IntegerLiteral | ( Identifier ) );
	public final TigerParser.primary_index_expr_return primary_index_expr() throws RecognitionException {
		TigerParser.primary_index_expr_return retval = new TigerParser.primary_index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IntegerLiteral255=null;
		Token Identifier256=null;

		Object IntegerLiteral255_tree=null;
		Object Identifier256_tree=null;

		try {
			// Tiger.g:1405:5: ( IntegerLiteral | ( Identifier ) )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==IntegerLiteral) ) {
				alt76=1;
			}
			else if ( (LA76_0==Identifier) ) {
				alt76=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// Tiger.g:1405:7: IntegerLiteral
					{
					root_0 = (Object)adaptor.nil();


					IntegerLiteral255=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_primary_index_expr4176); 
					IntegerLiteral255_tree = (Object)adaptor.create(IntegerLiteral255);
					adaptor.addChild(root_0, IntegerLiteral255_tree);

					}
					break;
				case 2 :
					// Tiger.g:1406:9: ( Identifier )
					{
					root_0 = (Object)adaptor.nil();


					// Tiger.g:1406:9: ( Identifier )
					// Tiger.g:1406:10: Identifier
					{
					Identifier256=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary_index_expr4187); 
					Identifier256_tree = (Object)adaptor.create(Identifier256);
					adaptor.addChild(root_0, Identifier256_tree);


					    	if (st.lookup((Identifier256!=null?Identifier256.getText():null)) != null) {
					    		if (!st.lookup((Identifier256!=null?Identifier256.getText():null)).getTypeName().equals("int")) {
					    			throw new IllegalArgumentException("Illegal variable type.");
					    		}
					    	} else {
					    		throw new IllegalArgumentException("Undefined variable.");
					    	}
					    
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary_index_expr"

	// Delegated rules



	public static final BitSet FOLLOW_type_declaration_list_in_program142 = new BitSet(new long[]{0x0000003000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_funct_list_in_program144 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_main_function_in_program146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_declaration_list_in_funct_list1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_declaration_in_funct_declaration_list1155 = new BitSet(new long[]{0x0000003000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_funct_declaration_list_in_funct_declaration_list1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_funct_declaration_list1165 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_funct_declaration_tail_in_funct_declaration_list1169 = new BitSet(new long[]{0x0000003000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_funct_declaration_list_in_funct_declaration_list1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alltype_in_funct_ret_type1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_alltype1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_alltype1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIXEDPT_in_alltype1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_funct_declaration_tail1248 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_Identifier_in_funct_declaration_tail1250 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_funct_declaration_tail1252 = new BitSet(new long[]{0x0200002000000000L});
	public static final BitSet FOLLOW_param_list_in_funct_declaration_tail1254 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_funct_declaration_tail1256 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BEGIN_in_funct_declaration_tail1268 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_block_list_in_funct_declaration_tail1277 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_END_in_funct_declaration_tail1286 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_funct_declaration_tail1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_ret_type_in_funct_declaration1329 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_FUNCTION_in_funct_declaration1331 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_Identifier_in_funct_declaration1333 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_funct_declaration1335 = new BitSet(new long[]{0x0200002000000000L});
	public static final BitSet FOLLOW_param_list_in_funct_declaration1337 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_funct_declaration1339 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BEGIN_in_funct_declaration1346 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_block_list_in_funct_declaration1353 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_END_in_funct_declaration1358 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_funct_declaration1362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_main_function1393 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_main_function1396 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_main_function1399 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BEGIN_in_main_function1402 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_block_list_in_main_function1405 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_END_in_main_function1407 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_main_function1410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list1450 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_param_list1454 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_param_in_param_list1460 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Identifier_in_param1498 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_COLON_in_param1500 = new BitSet(new long[]{0x0000003000800000L});
	public static final BitSet FOLLOW_type_id_in_param1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list1533 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_BEGIN_in_block1570 = new BitSet(new long[]{0x4080002101000500L,0x0000000000000022L});
	public static final BitSet FOLLOW_type_declaration_list_in_block1574 = new BitSet(new long[]{0x0080002101000500L,0x0000000000000022L});
	public static final BitSet FOLLOW_var_declaration_list_in_block1576 = new BitSet(new long[]{0x0080002101000500L,0x0000000000000020L});
	public static final BitSet FOLLOW_stat_seq_in_block1578 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_END_in_block1586 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_block1589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_type_declaration_list1625 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_var_declaration_list1658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration1689 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_Identifier_in_type_declaration1691 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration1693 = new BitSet(new long[]{0x0000001000800020L});
	public static final BitSet FOLLOW_type_in_type_declaration1695 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration1697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type1752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type1764 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LBRACK_in_type1767 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_IntegerLiteral_in_type1770 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_type1772 = new BitSet(new long[]{0x0004008000000000L});
	public static final BitSet FOLLOW_arr_brack_in_type1775 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OF_in_type1777 = new BitSet(new long[]{0x0000001000800000L});
	public static final BitSet FOLLOW_base_type_in_type1783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_arr_brack1816 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_IntegerLiteral_in_arr_brack1819 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_arr_brack1821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id1860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_type_id1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_base_type1897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIXEDPT_in_base_type1909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_list_in_var_declaration1930 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_COLON_in_var_declaration1932 = new BitSet(new long[]{0x0000003000800000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration1934 = new BitSet(new long[]{0x0400000000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration1954 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration1956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_id_list2002 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_Identifier_in_id_list2009 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_id_list2015 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_Identifier_in_id_list2022 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_init2058 = new BitSet(new long[]{0x0000004020000000L});
	public static final BitSet FOLLOW_constant_in_optional_init2061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_seq2098 = new BitSet(new long[]{0x0080002101000502L,0x0000000000000020L});
	public static final BitSet FOLLOW_if_else_expr_in_stat2136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stat2146 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_while_condition_in_stat2149 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_stat2151 = new BitSet(new long[]{0x0080002101000500L,0x0000000000000020L});
	public static final BitSet FOLLOW_stat_seq_in_stat2154 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ENDDO_in_stat2156 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat2159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_stat2170 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_for_expr_in_stat2173 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_stat2175 = new BitSet(new long[]{0x0080002101000500L,0x0000000000000020L});
	public static final BitSet FOLLOW_stat_seq_in_stat2178 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ENDDO_in_stat2180 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat2183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_stat2192 = new BitSet(new long[]{0x0000088000000040L});
	public static final BitSet FOLLOW_assign_stmt_in_stat2196 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_argument_list_in_stat2205 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat2214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_stat2225 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat2227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_stat2238 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_in_stat2241 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat2250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat2261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_for_expr2283 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_for_expr2285 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_index_expr_in_for_expr2287 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TO_in_for_expr2289 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_index_expr_in_for_expr2291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_while_condition2337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_argument_list2367 = new BitSet(new long[]{0x0200086020000000L});
	public static final BitSet FOLLOW_expr_list_in_argument_list2369 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_argument_list2373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_tail_in_assign_stmt2398 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_assign_stmt_tail_in_assign_stmt2400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assign_stmt_tail2429 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_or_list_in_assign_stmt_tail2431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IntegerLiteral_in_expr_or_list2459 = new BitSet(new long[]{0x0000808000004000L});
	public static final BitSet FOLLOW_FixedPointLiteral_in_expr_or_list2470 = new BitSet(new long[]{0x0000808000004000L});
	public static final BitSet FOLLOW_expr_tail1_in_expr_or_list2480 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_AND_in_expr_or_list2491 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_OR_in_expr_or_list2496 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev3_in_expr_or_list2500 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_Identifier_in_expr_or_list2514 = new BitSet(new long[]{0x0000888000004000L});
	public static final BitSet FOLLOW_exprtest_in_expr_or_list2517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_extail_in_expr_or_list2532 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_AND_in_expr_or_list2538 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_OR_in_expr_or_list2543 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev3_in_expr_or_list2547 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_expr_tail1_in_exprtest2575 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_AND_in_exprtest2585 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_OR_in_exprtest2590 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev3_in_exprtest2594 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_argument_list_in_exprtest2604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_tail2_in_expr_tail12633 = new BitSet(new long[]{0x00010300C0400002L});
	public static final BitSet FOLLOW_EQ_in_expr_tail12643 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_NEQ_in_expr_tail12646 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_LESSER_in_expr_tail12649 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_LESSEREQ_in_expr_tail12652 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_GREATER_in_expr_tail12655 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_tail12658 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev2_in_expr_tail12662 = new BitSet(new long[]{0x00010300C0400002L});
	public static final BitSet FOLLOW_expr_tail3_in_expr_tail22689 = new BitSet(new long[]{0x0020400000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_tail22696 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_MINUS_in_expr_tail22699 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev1_in_expr_tail22707 = new BitSet(new long[]{0x0020400000000002L});
	public static final BitSet FOLLOW_maderule_in_expr_tail32729 = new BitSet(new long[]{0x0000808000004000L});
	public static final BitSet FOLLOW_value_tail_in_expr_tail32736 = new BitSet(new long[]{0x0000800000004002L});
	public static final BitSet FOLLOW_MULT_in_expr_tail32744 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_DIV_in_expr_tail32747 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_primary_expression_in_expr_tail32755 = new BitSet(new long[]{0x0000800000004002L});
	public static final BitSet FOLLOW_MULT_in_expr_tail32767 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_DIV_in_expr_tail32770 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_primary_expression_in_expr_tail32778 = new BitSet(new long[]{0x0000800000004002L});
	public static final BitSet FOLLOW_extail1_in_extail2818 = new BitSet(new long[]{0x00010300C0400002L});
	public static final BitSet FOLLOW_EQ_in_extail2824 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_NEQ_in_extail2827 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_LESSER_in_extail2830 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_LESSEREQ_in_extail2833 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_GREATER_in_extail2836 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_GREATEREQ_in_extail2839 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev2_in_extail2843 = new BitSet(new long[]{0x00010300C0400002L});
	public static final BitSet FOLLOW_extail2_in_extail12863 = new BitSet(new long[]{0x0020400000000002L});
	public static final BitSet FOLLOW_PLUS_in_extail12869 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_MINUS_in_extail12872 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev1_in_extail12880 = new BitSet(new long[]{0x0020400000000002L});
	public static final BitSet FOLLOW_LPAREN_in_extail22900 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_in_extail22903 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_extail22909 = new BitSet(new long[]{0x0000800000004002L});
	public static final BitSet FOLLOW_MULT_in_extail22914 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_DIV_in_extail22917 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_primary_expression_in_extail22925 = new BitSet(new long[]{0x0000800000004002L});
	public static final BitSet FOLLOW_if_stat_in_if_else_expr2944 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_then_stat_in_if_else_expr2946 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_else_expr_in_if_else_expr2948 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ENDIF_in_if_else_expr2950 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_else_expr2952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stat2982 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_in_if_stat2985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THEN_in_then_stat3001 = new BitSet(new long[]{0x0080002101000500L,0x0000000000000020L});
	public static final BitSet FOLLOW_stat_seq_in_then_stat3004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_expr3024 = new BitSet(new long[]{0x0080002101000500L,0x0000000000000020L});
	public static final BitSet FOLLOW_stat_seq_in_else_expr3027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_opt_prefix3050 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_opt_prefix3052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_lev3_in_expr3089 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_AND_in_expr3106 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_OR_in_expr3111 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev3_in_expr3120 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_expr_lev2_in_expr_lev33158 = new BitSet(new long[]{0x00010300C0400002L});
	public static final BitSet FOLLOW_EQ_in_expr_lev33172 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_NEQ_in_expr_lev33175 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_LESSER_in_expr_lev33178 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_LESSEREQ_in_expr_lev33181 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_GREATER_in_expr_lev33184 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_lev33187 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev2_in_expr_lev33195 = new BitSet(new long[]{0x00010300C0400002L});
	public static final BitSet FOLLOW_expr_lev1_in_expr_lev23230 = new BitSet(new long[]{0x0020400000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_lev23244 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_MINUS_in_expr_lev23247 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev1_in_expr_lev23255 = new BitSet(new long[]{0x0020400000000002L});
	public static final BitSet FOLLOW_primary_expression_in_expr_lev13291 = new BitSet(new long[]{0x0000800000004002L});
	public static final BitSet FOLLOW_MULT_in_expr_lev13305 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_DIV_in_expr_lev13308 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_primary_expression_in_expr_lev13316 = new BitSet(new long[]{0x0000800000004002L});
	public static final BitSet FOLLOW_constant_in_primary_expression3349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primary_expression3365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primary_expression3381 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_in_primary_expression3384 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primary_expression3386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_mult_expr3414 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_DIV_in_mult_expr3417 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_primary_expression_in_mult_expr3421 = new BitSet(new long[]{0x0000800000004000L});
	public static final BitSet FOLLOW_mult_expr_in_mult_expr3423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_addtion_expr3446 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_MINUS_in_addtion_expr3449 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev1_in_addtion_expr3453 = new BitSet(new long[]{0x0020400000000000L});
	public static final BitSet FOLLOW_addtion_expr_in_addtion_expr3455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_comparative_expr3478 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_NEQ_in_comparative_expr3481 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_LESSER_in_comparative_expr3484 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_LESSEREQ_in_comparative_expr3487 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_GREATER_in_comparative_expr3490 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_GREATEREQ_in_comparative_expr3493 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev2_in_comparative_expr3497 = new BitSet(new long[]{0x00010300C0400000L});
	public static final BitSet FOLLOW_comparative_expr_in_comparative_expr3499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_logic_expr3522 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_OR_in_logic_expr3527 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_lev3_in_logic_expr3531 = new BitSet(new long[]{0x0008000000000010L});
	public static final BitSet FOLLOW_logic_expr_in_logic_expr3533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IntegerLiteral_in_constant3558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FixedPointLiteral_in_constant3570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paren_operator_in_logical_operator3594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_operator_in_logical_operator3604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_paren_operator3624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_paren_operator3635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_mult_operator3656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIV_in_mult_operator3667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_addition_operator3688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_addition_operator3699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_comparative_operator3720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_comparative_operator3731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSER_in_comparative_operator3742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSEREQ_in_comparative_operator3753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_comparative_operator3764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATEREQ_in_comparative_operator3775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_and_or_operator3796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_and_or_operator3807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addition_operator_in_binary_operator3827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_operator_in_binary_operator3837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparative_operator_in_binary_operator3847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_operator_in_binary_operator3857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_list3885 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list3887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail3928 = new BitSet(new long[]{0x0000086020000000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail3930 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Identifier_in_value3962 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_value_tail_in_value3965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_value_tail4003 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_index_expr_in_value_tail4005 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_value_tail4007 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_value_tail_tail_in_value_tail4009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_value_tail_tail4069 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_index_expr_in_value_tail_tail4071 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_value_tail_tail4073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_lev1_in_index_expr4108 = new BitSet(new long[]{0x0020400000000002L});
	public static final BitSet FOLLOW_PLUS_in_index_expr4112 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_MINUS_in_index_expr4117 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_index_expr_lev1_in_index_expr4121 = new BitSet(new long[]{0x0020400000000002L});
	public static final BitSet FOLLOW_primary_index_expr_in_index_expr_lev14144 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_MULT_in_index_expr_lev14147 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_primary_index_expr_in_index_expr_lev14150 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_IntegerLiteral_in_primary_index_expr4176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primary_index_expr4187 = new BitSet(new long[]{0x0000000000000002L});
}
