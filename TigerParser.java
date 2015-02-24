// $ANTLR 3.5.1 E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g 2015-02-23 19:41:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TigerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ASSIGN", "BEGIN", 
		"BREAK", "COLON", "COMMA", "COMMENT", "DIV", "DO", "Digit", "Digits", 
		"ELSE", "END", "ENDDO", "ENDIF", "EQ", "FIXEDPT", "FOR", "FUNCTION", "FixedPointLiteral", 
		"GREATER", "GREATEREQ", "IF", "INT", "Identifier", "IntegerLiteral", "LBRACK", 
		"LESSER", "LESSEREQ", "LINE_COMMENT", "LPAREN", "Letter", "MAIN", "MINUS", 
		"MULT", "NEQ", "NaturalNumber", "OF", "OR", "PLUS", "RBRACK", "RETURN", 
		"RPAREN", "SEMI", "THEN", "TO", "TYPE", "VAR", "VOID", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ARRAY=5;
	public static final int ASSIGN=6;
	public static final int BEGIN=7;
	public static final int BREAK=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int DIV=12;
	public static final int DO=13;
	public static final int Digit=14;
	public static final int Digits=15;
	public static final int ELSE=16;
	public static final int END=17;
	public static final int ENDDO=18;
	public static final int ENDIF=19;
	public static final int EQ=20;
	public static final int FIXEDPT=21;
	public static final int FOR=22;
	public static final int FUNCTION=23;
	public static final int FixedPointLiteral=24;
	public static final int GREATER=25;
	public static final int GREATEREQ=26;
	public static final int IF=27;
	public static final int INT=28;
	public static final int Identifier=29;
	public static final int IntegerLiteral=30;
	public static final int LBRACK=31;
	public static final int LESSER=32;
	public static final int LESSEREQ=33;
	public static final int LINE_COMMENT=34;
	public static final int LPAREN=35;
	public static final int Letter=36;
	public static final int MAIN=37;
	public static final int MINUS=38;
	public static final int MULT=39;
	public static final int NEQ=40;
	public static final int NaturalNumber=41;
	public static final int OF=42;
	public static final int OR=43;
	public static final int PLUS=44;
	public static final int RBRACK=45;
	public static final int RETURN=46;
	public static final int RPAREN=47;
	public static final int SEMI=48;
	public static final int THEN=49;
	public static final int TO=50;
	public static final int TYPE=51;
	public static final int VAR=52;
	public static final int VOID=53;
	public static final int WHILE=54;
	public static final int WS=55;

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

	@Override public String[] getTokenNames() { return TigerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g"; }


			    public void displayRecognitionError(String[] tokenNames,
			                                        RecognitionException e) {
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
			        if (num == 0) {
			        	line = input[linenum - 2];
			        	finalmessage = line;
			        } else {
			            line = input[linenum - 1];
			            finalmessage = line.substring(0, num + 1);
			        }
			        
			        System.out.println(hdr + " " + msg + ". prefix of error : " + finalmessage);
			    }



	// $ANTLR start "program"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:62:1: program : type_declaration_list funct_declaration_list main_function ;
	public final void program() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:63:5: ( type_declaration_list funct_declaration_list main_function )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:63:7: type_declaration_list funct_declaration_list main_function
			{
			pushFollow(FOLLOW_type_declaration_list_in_program47);
			type_declaration_list();
			state._fsp--;

			pushFollow(FOLLOW_funct_declaration_list_in_program49);
			funct_declaration_list();
			state._fsp--;

			pushFollow(FOLLOW_main_function_in_program51);
			main_function();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "funct_declaration_list"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:154:1: funct_declaration_list : ( type_id funct_declaration_tail funct_declaration_list | VOID ( funct_declaration_tail funct_declaration_list )? );
	public final void funct_declaration_list() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:155:5: ( type_id funct_declaration_tail funct_declaration_list | VOID ( funct_declaration_tail funct_declaration_list )? )
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
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:155:7: type_id funct_declaration_tail funct_declaration_list
					{
					pushFollow(FOLLOW_type_id_in_funct_declaration_list1040);
					type_id();
					state._fsp--;

					pushFollow(FOLLOW_funct_declaration_tail_in_funct_declaration_list1042);
					funct_declaration_tail();
					state._fsp--;

					pushFollow(FOLLOW_funct_declaration_list_in_funct_declaration_list1044);
					funct_declaration_list();
					state._fsp--;

					}
					break;
				case 2 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:156:7: VOID ( funct_declaration_tail funct_declaration_list )?
					{
					match(input,VOID,FOLLOW_VOID_in_funct_declaration_list1052); 
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:156:12: ( funct_declaration_tail funct_declaration_list )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==FUNCTION) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:156:13: funct_declaration_tail funct_declaration_list
							{
							pushFollow(FOLLOW_funct_declaration_tail_in_funct_declaration_list1055);
							funct_declaration_tail();
							state._fsp--;

							pushFollow(FOLLOW_funct_declaration_list_in_funct_declaration_list1057);
							funct_declaration_list();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funct_declaration_list"



	// $ANTLR start "funct_declaration_tail"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:159:1: funct_declaration_tail : FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI ;
	public final void funct_declaration_tail() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:160:5: ( FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:160:7: FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_funct_declaration_tail1084); 
			match(input,Identifier,FOLLOW_Identifier_in_funct_declaration_tail1086); 
			match(input,LPAREN,FOLLOW_LPAREN_in_funct_declaration_tail1088); 
			pushFollow(FOLLOW_param_list_in_funct_declaration_tail1090);
			param_list();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_funct_declaration_tail1092); 
			match(input,BEGIN,FOLLOW_BEGIN_in_funct_declaration_tail1094); 
			pushFollow(FOLLOW_block_list_in_funct_declaration_tail1096);
			block_list();
			state._fsp--;

			match(input,END,FOLLOW_END_in_funct_declaration_tail1098); 
			match(input,SEMI,FOLLOW_SEMI_in_funct_declaration_tail1100); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funct_declaration_tail"



	// $ANTLR start "main_function"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:163:1: main_function : MAIN LPAREN RPAREN BEGIN block_list END SEMI ;
	public final void main_function() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:164:5: ( MAIN LPAREN RPAREN BEGIN block_list END SEMI )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:164:9: MAIN LPAREN RPAREN BEGIN block_list END SEMI
			{
			match(input,MAIN,FOLLOW_MAIN_in_main_function1119); 
			match(input,LPAREN,FOLLOW_LPAREN_in_main_function1121); 
			match(input,RPAREN,FOLLOW_RPAREN_in_main_function1123); 
			match(input,BEGIN,FOLLOW_BEGIN_in_main_function1125); 
			pushFollow(FOLLOW_block_list_in_main_function1127);
			block_list();
			state._fsp--;

			match(input,END,FOLLOW_END_in_main_function1129); 
			match(input,SEMI,FOLLOW_SEMI_in_main_function1131); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "main_function"



	// $ANTLR start "param_list"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:167:1: param_list : ( param param_list_tail )? ;
	public final void param_list() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:168:5: ( ( param param_list_tail )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:168:9: ( param param_list_tail )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:168:9: ( param param_list_tail )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==Identifier) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:168:10: param param_list_tail
					{
					pushFollow(FOLLOW_param_in_param_list1151);
					param();
					state._fsp--;

					pushFollow(FOLLOW_param_list_tail_in_param_list1153);
					param_list_tail();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "param_list"



	// $ANTLR start "param_list_tail"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:171:1: param_list_tail : ( COMMA param param_list_tail )? ;
	public final void param_list_tail() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:172:5: ( ( COMMA param param_list_tail )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:172:9: ( COMMA param param_list_tail )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:172:9: ( COMMA param param_list_tail )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==COMMA) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:172:10: COMMA param param_list_tail
					{
					match(input,COMMA,FOLLOW_COMMA_in_param_list_tail1175); 
					pushFollow(FOLLOW_param_in_param_list_tail1177);
					param();
					state._fsp--;

					pushFollow(FOLLOW_param_list_tail_in_param_list_tail1179);
					param_list_tail();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "param_list_tail"



	// $ANTLR start "param"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:175:1: param : Identifier COLON type_id ;
	public final void param() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:176:5: ( Identifier COLON type_id )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:176:9: Identifier COLON type_id
			{
			match(input,Identifier,FOLLOW_Identifier_in_param1200); 
			match(input,COLON,FOLLOW_COLON_in_param1202); 
			pushFollow(FOLLOW_type_id_in_param1204);
			type_id();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "param"



	// $ANTLR start "block_list"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:179:1: block_list : block block_tail ;
	public final void block_list() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:180:5: ( block block_tail )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:180:9: block block_tail
			{
			pushFollow(FOLLOW_block_in_block_list1223);
			block();
			state._fsp--;

			pushFollow(FOLLOW_block_tail_in_block_list1225);
			block_tail();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_list"



	// $ANTLR start "block_tail"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:183:1: block_tail : ( block block_tail )? ;
	public final void block_tail() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:184:5: ( ( block block_tail )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:184:9: ( block block_tail )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:184:9: ( block block_tail )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==BEGIN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:184:10: block block_tail
					{
					pushFollow(FOLLOW_block_in_block_tail1245);
					block();
					state._fsp--;

					pushFollow(FOLLOW_block_tail_in_block_tail1247);
					block_tail();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_tail"



	// $ANTLR start "block"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:189:1: block : BEGIN declaration_segment stat_seq END SEMI ;
	public final void block() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:190:5: ( BEGIN declaration_segment stat_seq END SEMI )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:190:9: BEGIN declaration_segment stat_seq END SEMI
			{
			match(input,BEGIN,FOLLOW_BEGIN_in_block1270); 
			pushFollow(FOLLOW_declaration_segment_in_block1272);
			declaration_segment();
			state._fsp--;

			pushFollow(FOLLOW_stat_seq_in_block1274);
			stat_seq();
			state._fsp--;

			match(input,END,FOLLOW_END_in_block1276); 
			match(input,SEMI,FOLLOW_SEMI_in_block1278); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block"



	// $ANTLR start "declaration_segment"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:193:1: declaration_segment : type_declaration_list var_declaration_list ;
	public final void declaration_segment() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:194:5: ( type_declaration_list var_declaration_list )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:194:9: type_declaration_list var_declaration_list
			{
			pushFollow(FOLLOW_type_declaration_list_in_declaration_segment1297);
			type_declaration_list();
			state._fsp--;

			pushFollow(FOLLOW_var_declaration_list_in_declaration_segment1299);
			var_declaration_list();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration_segment"



	// $ANTLR start "type_declaration_list"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:197:1: type_declaration_list : ( type_declaration type_declaration_list )? ;
	public final void type_declaration_list() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:198:5: ( ( type_declaration type_declaration_list )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:198:9: ( type_declaration type_declaration_list )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:198:9: ( type_declaration type_declaration_list )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TYPE) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:198:10: type_declaration type_declaration_list
					{
					pushFollow(FOLLOW_type_declaration_in_type_declaration_list1319);
					type_declaration();
					state._fsp--;

					pushFollow(FOLLOW_type_declaration_list_in_type_declaration_list1321);
					type_declaration_list();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_declaration_list"



	// $ANTLR start "var_declaration_list"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:201:1: var_declaration_list : ( var_declaration var_declaration_list )? ;
	public final void var_declaration_list() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:202:5: ( ( var_declaration var_declaration_list )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:202:9: ( var_declaration var_declaration_list )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:202:9: ( var_declaration var_declaration_list )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VAR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:202:10: var_declaration var_declaration_list
					{
					pushFollow(FOLLOW_var_declaration_in_var_declaration_list1343);
					var_declaration();
					state._fsp--;

					pushFollow(FOLLOW_var_declaration_list_in_var_declaration_list1345);
					var_declaration_list();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "var_declaration_list"



	// $ANTLR start "type_declaration"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:205:1: type_declaration : TYPE Identifier EQ type SEMI ;
	public final void type_declaration() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:206:5: ( TYPE Identifier EQ type SEMI )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:206:7: TYPE Identifier EQ type SEMI
			{
			match(input,TYPE,FOLLOW_TYPE_in_type_declaration1364); 
			match(input,Identifier,FOLLOW_Identifier_in_type_declaration1366); 
			match(input,EQ,FOLLOW_EQ_in_type_declaration1368); 
			pushFollow(FOLLOW_type_in_type_declaration1370);
			type();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_type_declaration1372); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_declaration"



	// $ANTLR start "type"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:209:1: type : ( base_type | ARRAY LBRACK IntegerLiteral RBRACK arr_brack OF base_type );
	public final void type() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:210:5: ( base_type | ARRAY LBRACK IntegerLiteral RBRACK arr_brack OF base_type )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==FIXEDPT||LA8_0==INT) ) {
				alt8=1;
			}
			else if ( (LA8_0==ARRAY) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:210:9: base_type
					{
					pushFollow(FOLLOW_base_type_in_type1391);
					base_type();
					state._fsp--;

					}
					break;
				case 2 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:211:9: ARRAY LBRACK IntegerLiteral RBRACK arr_brack OF base_type
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_type1401); 
					match(input,LBRACK,FOLLOW_LBRACK_in_type1403); 
					match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_type1405); 
					match(input,RBRACK,FOLLOW_RBRACK_in_type1407); 
					pushFollow(FOLLOW_arr_brack_in_type1409);
					arr_brack();
					state._fsp--;

					match(input,OF,FOLLOW_OF_in_type1411); 
					pushFollow(FOLLOW_base_type_in_type1413);
					base_type();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "arr_brack"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:214:1: arr_brack : ( LBRACK IntegerLiteral RBRACK )? ;
	public final void arr_brack() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:215:5: ( ( LBRACK IntegerLiteral RBRACK )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:215:7: ( LBRACK IntegerLiteral RBRACK )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:215:7: ( LBRACK IntegerLiteral RBRACK )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==LBRACK) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:215:8: LBRACK IntegerLiteral RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_arr_brack1431); 
					match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_arr_brack1433); 
					match(input,RBRACK,FOLLOW_RBRACK_in_arr_brack1435); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arr_brack"



	// $ANTLR start "type_id"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:218:1: type_id : ( base_type | Identifier );
	public final void type_id() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:219:5: ( base_type | Identifier )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==FIXEDPT||LA10_0==INT) ) {
				alt10=1;
			}
			else if ( (LA10_0==Identifier) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:219:9: base_type
					{
					pushFollow(FOLLOW_base_type_in_type_id1456);
					base_type();
					state._fsp--;

					}
					break;
				case 2 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:220:9: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_type_id1466); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_id"



	// $ANTLR start "base_type"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:223:1: base_type : ( INT | FIXEDPT );
	public final void base_type() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:224:5: ( INT | FIXEDPT )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:
			{
			if ( input.LA(1)==FIXEDPT||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "base_type"



	// $ANTLR start "var_declaration"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:228:1: var_declaration : VAR id_list COLON type_id optional_init SEMI ;
	public final void var_declaration() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:229:5: ( VAR id_list COLON type_id optional_init SEMI )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:229:9: VAR id_list COLON type_id optional_init SEMI
			{
			match(input,VAR,FOLLOW_VAR_in_var_declaration1514); 
			pushFollow(FOLLOW_id_list_in_var_declaration1516);
			id_list();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_var_declaration1518); 
			pushFollow(FOLLOW_type_id_in_var_declaration1520);
			type_id();
			state._fsp--;

			pushFollow(FOLLOW_optional_init_in_var_declaration1522);
			optional_init();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_var_declaration1524); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "var_declaration"



	// $ANTLR start "id_list"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:232:1: id_list : Identifier id_list_tail ;
	public final void id_list() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:233:5: ( Identifier id_list_tail )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:233:9: Identifier id_list_tail
			{
			match(input,Identifier,FOLLOW_Identifier_in_id_list1543); 
			pushFollow(FOLLOW_id_list_tail_in_id_list1545);
			id_list_tail();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "id_list"



	// $ANTLR start "id_list_tail"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:236:1: id_list_tail : ( COMMA id_list )? ;
	public final void id_list_tail() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:237:5: ( ( COMMA id_list )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:237:7: ( COMMA id_list )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:237:7: ( COMMA id_list )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==COMMA) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:237:8: COMMA id_list
					{
					match(input,COMMA,FOLLOW_COMMA_in_id_list_tail1567); 
					pushFollow(FOLLOW_id_list_in_id_list_tail1569);
					id_list();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "id_list_tail"



	// $ANTLR start "optional_init"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:241:1: optional_init : ( ASSIGN constant )? ;
	public final void optional_init() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:242:5: ( ( ASSIGN constant )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:242:9: ( ASSIGN constant )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:242:9: ( ASSIGN constant )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ASSIGN) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:242:10: ASSIGN constant
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_init1596); 
					pushFollow(FOLLOW_constant_in_optional_init1598);
					constant();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "optional_init"



	// $ANTLR start "stat_seq"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:245:1: stat_seq : stat ( stat_seq )? ;
	public final void stat_seq() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:246:5: ( stat ( stat_seq )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:246:7: stat ( stat_seq )?
			{
			pushFollow(FOLLOW_stat_in_stat_seq1617);
			stat();
			state._fsp--;

			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:246:12: ( stat_seq )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= BEGIN && LA13_0 <= BREAK)||LA13_0==FOR||LA13_0==IF||LA13_0==Identifier||LA13_0==RETURN||LA13_0==WHILE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:246:13: stat_seq
					{
					pushFollow(FOLLOW_stat_seq_in_stat_seq1620);
					stat_seq();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stat_seq"



	// $ANTLR start "stat"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:249:1: stat : ( if_else_expr | WHILE expr DO stat_seq ENDDO SEMI | FOR Identifier ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI | Identifier ( value_tail ASSIGN expr_or_list | LPAREN expr_list RPAREN ) SEMI | BREAK SEMI | RETURN expr SEMI | block );
	public final void stat() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:250:5: ( if_else_expr | WHILE expr DO stat_seq ENDDO SEMI | FOR Identifier ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI | Identifier ( value_tail ASSIGN expr_or_list | LPAREN expr_list RPAREN ) SEMI | BREAK SEMI | RETURN expr SEMI | block )
			int alt15=7;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt15=1;
				}
				break;
			case WHILE:
				{
				alt15=2;
				}
				break;
			case FOR:
				{
				alt15=3;
				}
				break;
			case Identifier:
				{
				alt15=4;
				}
				break;
			case BREAK:
				{
				alt15=5;
				}
				break;
			case RETURN:
				{
				alt15=6;
				}
				break;
			case BEGIN:
				{
				alt15=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:250:7: if_else_expr
					{
					pushFollow(FOLLOW_if_else_expr_in_stat1639);
					if_else_expr();
					state._fsp--;

					}
					break;
				case 2 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:251:9: WHILE expr DO stat_seq ENDDO SEMI
					{
					match(input,WHILE,FOLLOW_WHILE_in_stat1649); 
					pushFollow(FOLLOW_expr_in_stat1651);
					expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_stat1653); 
					pushFollow(FOLLOW_stat_seq_in_stat1655);
					stat_seq();
					state._fsp--;

					match(input,ENDDO,FOLLOW_ENDDO_in_stat1657); 
					match(input,SEMI,FOLLOW_SEMI_in_stat1659); 
					}
					break;
				case 3 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:252:9: FOR Identifier ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI
					{
					match(input,FOR,FOLLOW_FOR_in_stat1669); 
					match(input,Identifier,FOLLOW_Identifier_in_stat1671); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_stat1673); 
					pushFollow(FOLLOW_index_expr_in_stat1675);
					index_expr();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_stat1677); 
					pushFollow(FOLLOW_index_expr_in_stat1679);
					index_expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_stat1681); 
					pushFollow(FOLLOW_stat_seq_in_stat1683);
					stat_seq();
					state._fsp--;

					match(input,ENDDO,FOLLOW_ENDDO_in_stat1685); 
					match(input,SEMI,FOLLOW_SEMI_in_stat1687); 
					}
					break;
				case 4 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:253:7: Identifier ( value_tail ASSIGN expr_or_list | LPAREN expr_list RPAREN ) SEMI
					{
					match(input,Identifier,FOLLOW_Identifier_in_stat1695); 
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:253:18: ( value_tail ASSIGN expr_or_list | LPAREN expr_list RPAREN )
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==AND||LA14_0==ASSIGN||LA14_0==COMMA||(LA14_0 >= DIV && LA14_0 <= DO)||LA14_0==EQ||(LA14_0 >= GREATER && LA14_0 <= GREATEREQ)||(LA14_0 >= LBRACK && LA14_0 <= LESSEREQ)||(LA14_0 >= MINUS && LA14_0 <= NEQ)||(LA14_0 >= OR && LA14_0 <= PLUS)||(LA14_0 >= RPAREN && LA14_0 <= THEN)) ) {
						alt14=1;
					}
					else if ( (LA14_0==LPAREN) ) {
						alt14=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:253:19: value_tail ASSIGN expr_or_list
							{
							pushFollow(FOLLOW_value_tail_in_stat1698);
							value_tail();
							state._fsp--;

							match(input,ASSIGN,FOLLOW_ASSIGN_in_stat1700); 
							pushFollow(FOLLOW_expr_or_list_in_stat1702);
							expr_or_list();
							state._fsp--;

							}
							break;
						case 2 :
							// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:253:52: LPAREN expr_list RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_stat1706); 
							pushFollow(FOLLOW_expr_list_in_stat1708);
							expr_list();
							state._fsp--;

							match(input,RPAREN,FOLLOW_RPAREN_in_stat1710); 
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_stat1713); 
					}
					break;
				case 5 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:254:9: BREAK SEMI
					{
					match(input,BREAK,FOLLOW_BREAK_in_stat1723); 
					match(input,SEMI,FOLLOW_SEMI_in_stat1725); 
					}
					break;
				case 6 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:255:9: RETURN expr SEMI
					{
					match(input,RETURN,FOLLOW_RETURN_in_stat1735); 
					pushFollow(FOLLOW_expr_in_stat1737);
					expr();
					state._fsp--;

					match(input,SEMI,FOLLOW_SEMI_in_stat1739); 
					}
					break;
				case 7 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:256:9: block
					{
					pushFollow(FOLLOW_block_in_stat1749);
					block();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stat"



	// $ANTLR start "expr_or_list"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:259:1: expr_or_list : ( constant expr_tail | Identifier ( value_tail expr_tail | LPAREN expr_list RPAREN ) | LPAREN expr RPAREN expr_tail );
	public final void expr_or_list() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:260:5: ( constant expr_tail | Identifier ( value_tail expr_tail | LPAREN expr_list RPAREN ) | LPAREN expr RPAREN expr_tail )
			int alt17=3;
			switch ( input.LA(1) ) {
			case FixedPointLiteral:
			case IntegerLiteral:
				{
				alt17=1;
				}
				break;
			case Identifier:
				{
				alt17=2;
				}
				break;
			case LPAREN:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:260:7: constant expr_tail
					{
					pushFollow(FOLLOW_constant_in_expr_or_list1772);
					constant();
					state._fsp--;

					pushFollow(FOLLOW_expr_tail_in_expr_or_list1774);
					expr_tail();
					state._fsp--;

					}
					break;
				case 2 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:261:7: Identifier ( value_tail expr_tail | LPAREN expr_list RPAREN )
					{
					match(input,Identifier,FOLLOW_Identifier_in_expr_or_list1782); 
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:261:18: ( value_tail expr_tail | LPAREN expr_list RPAREN )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==AND||LA16_0==ASSIGN||LA16_0==COMMA||(LA16_0 >= DIV && LA16_0 <= DO)||LA16_0==EQ||(LA16_0 >= GREATER && LA16_0 <= GREATEREQ)||(LA16_0 >= LBRACK && LA16_0 <= LESSEREQ)||(LA16_0 >= MINUS && LA16_0 <= NEQ)||(LA16_0 >= OR && LA16_0 <= PLUS)||(LA16_0 >= RPAREN && LA16_0 <= THEN)) ) {
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
							// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:261:19: value_tail expr_tail
							{
							pushFollow(FOLLOW_value_tail_in_expr_or_list1785);
							value_tail();
							state._fsp--;

							pushFollow(FOLLOW_expr_tail_in_expr_or_list1787);
							expr_tail();
							state._fsp--;

							}
							break;
						case 2 :
							// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:261:42: LPAREN expr_list RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_expr_or_list1791); 
							pushFollow(FOLLOW_expr_list_in_expr_or_list1793);
							expr_list();
							state._fsp--;

							match(input,RPAREN,FOLLOW_RPAREN_in_expr_or_list1795); 
							}
							break;

					}

					}
					break;
				case 3 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:262:7: LPAREN expr RPAREN expr_tail
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_expr_or_list1804); 
					pushFollow(FOLLOW_expr_in_expr_or_list1806);
					expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_expr_or_list1808); 
					pushFollow(FOLLOW_expr_tail_in_expr_or_list1810);
					expr_tail();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_or_list"



	// $ANTLR start "expr_tail"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:265:1: expr_tail : mult_expr addtion_expr comparative_expr logic_expr ;
	public final void expr_tail() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:266:2: ( mult_expr addtion_expr comparative_expr logic_expr )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:266:4: mult_expr addtion_expr comparative_expr logic_expr
			{
			pushFollow(FOLLOW_mult_expr_in_expr_tail1828);
			mult_expr();
			state._fsp--;

			pushFollow(FOLLOW_addtion_expr_in_expr_tail1830);
			addtion_expr();
			state._fsp--;

			pushFollow(FOLLOW_comparative_expr_in_expr_tail1832);
			comparative_expr();
			state._fsp--;

			pushFollow(FOLLOW_logic_expr_in_expr_tail1834);
			logic_expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_tail"



	// $ANTLR start "if_else_expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:269:1: if_else_expr : IF expr THEN stat_seq else_expr ENDIF SEMI ;
	public final void if_else_expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:270:5: ( IF expr THEN stat_seq else_expr ENDIF SEMI )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:270:7: IF expr THEN stat_seq else_expr ENDIF SEMI
			{
			match(input,IF,FOLLOW_IF_in_if_else_expr1852); 
			pushFollow(FOLLOW_expr_in_if_else_expr1854);
			expr();
			state._fsp--;

			match(input,THEN,FOLLOW_THEN_in_if_else_expr1856); 
			pushFollow(FOLLOW_stat_seq_in_if_else_expr1858);
			stat_seq();
			state._fsp--;

			pushFollow(FOLLOW_else_expr_in_if_else_expr1860);
			else_expr();
			state._fsp--;

			match(input,ENDIF,FOLLOW_ENDIF_in_if_else_expr1862); 
			match(input,SEMI,FOLLOW_SEMI_in_if_else_expr1864); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_else_expr"



	// $ANTLR start "else_expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:273:1: else_expr : ( ELSE stat_seq )? ;
	public final void else_expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:274:5: ( ( ELSE stat_seq )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:274:7: ( ELSE stat_seq )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:274:7: ( ELSE stat_seq )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ELSE) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:274:8: ELSE stat_seq
					{
					match(input,ELSE,FOLLOW_ELSE_in_else_expr1890); 
					pushFollow(FOLLOW_stat_seq_in_else_expr1892);
					stat_seq();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "else_expr"



	// $ANTLR start "opt_prefix"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:277:1: opt_prefix : ( value ASSIGN )? ;
	public final void opt_prefix() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:278:5: ( ( value ASSIGN )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:278:9: ( value ASSIGN )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:278:9: ( value ASSIGN )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==Identifier) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:278:10: value ASSIGN
					{
					pushFollow(FOLLOW_value_in_opt_prefix1915);
					value();
					state._fsp--;

					match(input,ASSIGN,FOLLOW_ASSIGN_in_opt_prefix1917); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "opt_prefix"



	// $ANTLR start "expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:281:1: expr : expr_lev3 logic_expr ;
	public final void expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:282:5: ( expr_lev3 logic_expr )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:282:9: expr_lev3 logic_expr
			{
			pushFollow(FOLLOW_expr_lev3_in_expr1938);
			expr_lev3();
			state._fsp--;

			pushFollow(FOLLOW_logic_expr_in_expr1940);
			logic_expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "expr_lev3"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:285:1: expr_lev3 : expr_lev2 comparative_expr ;
	public final void expr_lev3() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:286:5: ( expr_lev2 comparative_expr )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:286:9: expr_lev2 comparative_expr
			{
			pushFollow(FOLLOW_expr_lev2_in_expr_lev31960);
			expr_lev2();
			state._fsp--;

			pushFollow(FOLLOW_comparative_expr_in_expr_lev31962);
			comparative_expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_lev3"



	// $ANTLR start "expr_lev2"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:289:1: expr_lev2 : expr_lev1 addtion_expr ;
	public final void expr_lev2() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:290:5: ( expr_lev1 addtion_expr )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:290:9: expr_lev1 addtion_expr
			{
			pushFollow(FOLLOW_expr_lev1_in_expr_lev21981);
			expr_lev1();
			state._fsp--;

			pushFollow(FOLLOW_addtion_expr_in_expr_lev21983);
			addtion_expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_lev2"



	// $ANTLR start "expr_lev1"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:293:1: expr_lev1 : primary_expression mult_expr ;
	public final void expr_lev1() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:294:5: ( primary_expression mult_expr )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:294:9: primary_expression mult_expr
			{
			pushFollow(FOLLOW_primary_expression_in_expr_lev12002);
			primary_expression();
			state._fsp--;

			pushFollow(FOLLOW_mult_expr_in_expr_lev12004);
			mult_expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_lev1"



	// $ANTLR start "primary_expression"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:297:1: primary_expression : ( constant | value | LPAREN expr RPAREN );
	public final void primary_expression() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:298:5: ( constant | value | LPAREN expr RPAREN )
			int alt20=3;
			switch ( input.LA(1) ) {
			case FixedPointLiteral:
			case IntegerLiteral:
				{
				alt20=1;
				}
				break;
			case Identifier:
				{
				alt20=2;
				}
				break;
			case LPAREN:
				{
				alt20=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:298:9: constant
					{
					pushFollow(FOLLOW_constant_in_primary_expression2023);
					constant();
					state._fsp--;

					}
					break;
				case 2 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:299:9: value
					{
					pushFollow(FOLLOW_value_in_primary_expression2033);
					value();
					state._fsp--;

					}
					break;
				case 3 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:300:9: LPAREN expr RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primary_expression2043); 
					pushFollow(FOLLOW_expr_in_primary_expression2045);
					expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_primary_expression2047); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primary_expression"



	// $ANTLR start "mult_expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:303:1: mult_expr : ( mult_operator primary_expression mult_expr )? ;
	public final void mult_expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:304:5: ( ( mult_operator primary_expression mult_expr )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:304:9: ( mult_operator primary_expression mult_expr )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:304:9: ( mult_operator primary_expression mult_expr )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==DIV||LA21_0==MULT) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:304:10: mult_operator primary_expression mult_expr
					{
					pushFollow(FOLLOW_mult_operator_in_mult_expr2067);
					mult_operator();
					state._fsp--;

					pushFollow(FOLLOW_primary_expression_in_mult_expr2069);
					primary_expression();
					state._fsp--;

					pushFollow(FOLLOW_mult_expr_in_mult_expr2071);
					mult_expr();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mult_expr"



	// $ANTLR start "addtion_expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:307:1: addtion_expr : ( addition_operator expr_lev1 addtion_expr )? ;
	public final void addtion_expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:308:5: ( ( addition_operator expr_lev1 addtion_expr )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:308:9: ( addition_operator expr_lev1 addtion_expr )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:308:9: ( addition_operator expr_lev1 addtion_expr )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==MINUS||LA22_0==PLUS) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:308:10: addition_operator expr_lev1 addtion_expr
					{
					pushFollow(FOLLOW_addition_operator_in_addtion_expr2093);
					addition_operator();
					state._fsp--;

					pushFollow(FOLLOW_expr_lev1_in_addtion_expr2095);
					expr_lev1();
					state._fsp--;

					pushFollow(FOLLOW_addtion_expr_in_addtion_expr2097);
					addtion_expr();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "addtion_expr"



	// $ANTLR start "comparative_expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:311:1: comparative_expr : ( comparative_operator expr_lev2 comparative_expr )? ;
	public final void comparative_expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:312:5: ( ( comparative_operator expr_lev2 comparative_expr )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:312:9: ( comparative_operator expr_lev2 comparative_expr )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:312:9: ( comparative_operator expr_lev2 comparative_expr )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==EQ||(LA23_0 >= GREATER && LA23_0 <= GREATEREQ)||(LA23_0 >= LESSER && LA23_0 <= LESSEREQ)||LA23_0==NEQ) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:312:10: comparative_operator expr_lev2 comparative_expr
					{
					pushFollow(FOLLOW_comparative_operator_in_comparative_expr2119);
					comparative_operator();
					state._fsp--;

					pushFollow(FOLLOW_expr_lev2_in_comparative_expr2121);
					expr_lev2();
					state._fsp--;

					pushFollow(FOLLOW_comparative_expr_in_comparative_expr2123);
					comparative_expr();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comparative_expr"



	// $ANTLR start "logic_expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:315:1: logic_expr : ( and_or_operator expr_lev3 logic_expr )? ;
	public final void logic_expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:316:5: ( ( and_or_operator expr_lev3 logic_expr )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:316:9: ( and_or_operator expr_lev3 logic_expr )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:316:9: ( and_or_operator expr_lev3 logic_expr )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==AND||LA24_0==OR) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:316:10: and_or_operator expr_lev3 logic_expr
					{
					pushFollow(FOLLOW_and_or_operator_in_logic_expr2145);
					and_or_operator();
					state._fsp--;

					pushFollow(FOLLOW_expr_lev3_in_logic_expr2147);
					expr_lev3();
					state._fsp--;

					pushFollow(FOLLOW_logic_expr_in_logic_expr2149);
					logic_expr();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "logic_expr"



	// $ANTLR start "constant"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:319:1: constant : ( IntegerLiteral | FixedPointLiteral );
	public final void constant() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:320:5: ( IntegerLiteral | FixedPointLiteral )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:
			{
			if ( input.LA(1)==FixedPointLiteral||input.LA(1)==IntegerLiteral ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constant"



	// $ANTLR start "logical_operator"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:326:1: logical_operator : ( paren_operator | and_or_operator );
	public final void logical_operator() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:327:5: ( paren_operator | and_or_operator )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==LPAREN||LA25_0==RPAREN) ) {
				alt25=1;
			}
			else if ( (LA25_0==AND||LA25_0==OR) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:327:9: paren_operator
					{
					pushFollow(FOLLOW_paren_operator_in_logical_operator2202);
					paren_operator();
					state._fsp--;

					}
					break;
				case 2 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:328:9: and_or_operator
					{
					pushFollow(FOLLOW_and_or_operator_in_logical_operator2212);
					and_or_operator();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "logical_operator"



	// $ANTLR start "paren_operator"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:332:1: paren_operator : ( LPAREN | RPAREN );
	public final void paren_operator() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:333:5: ( LPAREN | RPAREN )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:
			{
			if ( input.LA(1)==LPAREN||input.LA(1)==RPAREN ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paren_operator"



	// $ANTLR start "mult_operator"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:338:1: mult_operator : ( MULT | DIV );
	public final void mult_operator() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:339:5: ( MULT | DIV )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:
			{
			if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mult_operator"



	// $ANTLR start "addition_operator"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:344:1: addition_operator : ( PLUS | MINUS );
	public final void addition_operator() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:345:5: ( PLUS | MINUS )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:
			{
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "addition_operator"



	// $ANTLR start "comparative_operator"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:350:1: comparative_operator : ( EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ );
	public final void comparative_operator() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:351:5: ( EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:
			{
			if ( input.LA(1)==EQ||(input.LA(1) >= GREATER && input.LA(1) <= GREATEREQ)||(input.LA(1) >= LESSER && input.LA(1) <= LESSEREQ)||input.LA(1)==NEQ ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comparative_operator"



	// $ANTLR start "and_or_operator"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:360:1: and_or_operator : ( AND | OR );
	public final void and_or_operator() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:361:5: ( AND | OR )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:
			{
			if ( input.LA(1)==AND||input.LA(1)==OR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "and_or_operator"



	// $ANTLR start "binary_operator"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:365:1: binary_operator : ( addition_operator | mult_operator | comparative_operator | and_or_operator );
	public final void binary_operator() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:366:5: ( addition_operator | mult_operator | comparative_operator | and_or_operator )
			int alt26=4;
			switch ( input.LA(1) ) {
			case MINUS:
			case PLUS:
				{
				alt26=1;
				}
				break;
			case DIV:
			case MULT:
				{
				alt26=2;
				}
				break;
			case EQ:
			case GREATER:
			case GREATEREQ:
			case LESSER:
			case LESSEREQ:
			case NEQ:
				{
				alt26=3;
				}
				break;
			case AND:
			case OR:
				{
				alt26=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:366:9: addition_operator
					{
					pushFollow(FOLLOW_addition_operator_in_binary_operator2421);
					addition_operator();
					state._fsp--;

					}
					break;
				case 2 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:367:9: mult_operator
					{
					pushFollow(FOLLOW_mult_operator_in_binary_operator2431);
					mult_operator();
					state._fsp--;

					}
					break;
				case 3 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:368:9: comparative_operator
					{
					pushFollow(FOLLOW_comparative_operator_in_binary_operator2441);
					comparative_operator();
					state._fsp--;

					}
					break;
				case 4 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:369:9: and_or_operator
					{
					pushFollow(FOLLOW_and_or_operator_in_binary_operator2451);
					and_or_operator();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "binary_operator"



	// $ANTLR start "expr_list"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:372:1: expr_list : ( expr expr_list_tail )? ;
	public final void expr_list() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:373:5: ( ( expr expr_list_tail )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:373:9: ( expr expr_list_tail )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:373:9: ( expr expr_list_tail )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==FixedPointLiteral||(LA27_0 >= Identifier && LA27_0 <= IntegerLiteral)||LA27_0==LPAREN) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:373:10: expr expr_list_tail
					{
					pushFollow(FOLLOW_expr_in_expr_list2471);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_list_tail_in_expr_list2473);
					expr_list_tail();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_list"



	// $ANTLR start "expr_list_tail"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:376:1: expr_list_tail : ( COMMA expr expr_list_tail )? ;
	public final void expr_list_tail() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:377:5: ( ( COMMA expr expr_list_tail )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:377:9: ( COMMA expr expr_list_tail )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:377:9: ( COMMA expr expr_list_tail )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==COMMA) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:377:10: COMMA expr expr_list_tail
					{
					match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail2495); 
					pushFollow(FOLLOW_expr_in_expr_list_tail2497);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail2499);
					expr_list_tail();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_list_tail"



	// $ANTLR start "value"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:380:1: value : Identifier value_tail ;
	public final void value() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:381:5: ( Identifier value_tail )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:381:9: Identifier value_tail
			{
			match(input,Identifier,FOLLOW_Identifier_in_value2520); 
			pushFollow(FOLLOW_value_tail_in_value2522);
			value_tail();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "value"



	// $ANTLR start "value_tail"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:384:1: value_tail : ( LBRACK index_expr RBRACK value_tail_tail )? ;
	public final void value_tail() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:385:5: ( ( LBRACK index_expr RBRACK value_tail_tail )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:385:9: ( LBRACK index_expr RBRACK value_tail_tail )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:385:9: ( LBRACK index_expr RBRACK value_tail_tail )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==LBRACK) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:385:10: LBRACK index_expr RBRACK value_tail_tail
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_value_tail2542); 
					pushFollow(FOLLOW_index_expr_in_value_tail2544);
					index_expr();
					state._fsp--;

					match(input,RBRACK,FOLLOW_RBRACK_in_value_tail2546); 
					pushFollow(FOLLOW_value_tail_tail_in_value_tail2548);
					value_tail_tail();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "value_tail"



	// $ANTLR start "value_tail_tail"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:388:1: value_tail_tail : ( LBRACK index_expr RBRACK )? ;
	public final void value_tail_tail() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:389:5: ( ( LBRACK index_expr RBRACK )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:389:7: ( LBRACK index_expr RBRACK )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:389:7: ( LBRACK index_expr RBRACK )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==LBRACK) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:389:8: LBRACK index_expr RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_value_tail_tail2572); 
					pushFollow(FOLLOW_index_expr_in_value_tail_tail2574);
					index_expr();
					state._fsp--;

					match(input,RBRACK,FOLLOW_RBRACK_in_value_tail_tail2576); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "value_tail_tail"



	// $ANTLR start "index_expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:392:1: index_expr : index_expr_lev1 index_add_expr ;
	public final void index_expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:393:5: ( index_expr_lev1 index_add_expr )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:393:7: index_expr_lev1 index_add_expr
			{
			pushFollow(FOLLOW_index_expr_lev1_in_index_expr2595);
			index_expr_lev1();
			state._fsp--;

			pushFollow(FOLLOW_index_add_expr_in_index_expr2597);
			index_add_expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_expr"



	// $ANTLR start "index_expr_lev1"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:396:1: index_expr_lev1 : primary_index_expr index_mult_expr ;
	public final void index_expr_lev1() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:397:5: ( primary_index_expr index_mult_expr )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:397:7: primary_index_expr index_mult_expr
			{
			pushFollow(FOLLOW_primary_index_expr_in_index_expr_lev12618);
			primary_index_expr();
			state._fsp--;

			pushFollow(FOLLOW_index_mult_expr_in_index_expr_lev12620);
			index_mult_expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_expr_lev1"



	// $ANTLR start "primary_index_expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:400:1: primary_index_expr : ( IntegerLiteral | Identifier );
	public final void primary_index_expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:401:5: ( IntegerLiteral | Identifier )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:
			{
			if ( (input.LA(1) >= Identifier && input.LA(1) <= IntegerLiteral) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primary_index_expr"



	// $ANTLR start "index_mult_expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:405:1: index_mult_expr : ( index_mult_opr primary_index_expr index_mult_expr )? ;
	public final void index_mult_expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:406:5: ( ( index_mult_opr primary_index_expr index_mult_expr )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:406:7: ( index_mult_opr primary_index_expr index_mult_expr )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:406:7: ( index_mult_opr primary_index_expr index_mult_expr )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==MULT) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:406:8: index_mult_opr primary_index_expr index_mult_expr
					{
					pushFollow(FOLLOW_index_mult_opr_in_index_mult_expr2672);
					index_mult_opr();
					state._fsp--;

					pushFollow(FOLLOW_primary_index_expr_in_index_mult_expr2674);
					primary_index_expr();
					state._fsp--;

					pushFollow(FOLLOW_index_mult_expr_in_index_mult_expr2676);
					index_mult_expr();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_mult_expr"



	// $ANTLR start "index_mult_opr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:409:1: index_mult_opr : MULT ;
	public final void index_mult_opr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:410:5: ( MULT )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:410:7: MULT
			{
			match(input,MULT,FOLLOW_MULT_in_index_mult_opr2699); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_mult_opr"



	// $ANTLR start "index_add_expr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:413:1: index_add_expr : ( index_add_opr index_expr_lev1 index_add_expr )? ;
	public final void index_add_expr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:414:5: ( ( index_add_opr index_expr_lev1 index_add_expr )? )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:414:7: ( index_add_opr index_expr_lev1 index_add_expr )?
			{
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:414:7: ( index_add_opr index_expr_lev1 index_add_expr )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==MINUS||LA32_0==PLUS) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:414:8: index_add_opr index_expr_lev1 index_add_expr
					{
					pushFollow(FOLLOW_index_add_opr_in_index_add_expr2721);
					index_add_opr();
					state._fsp--;

					pushFollow(FOLLOW_index_expr_lev1_in_index_add_expr2723);
					index_expr_lev1();
					state._fsp--;

					pushFollow(FOLLOW_index_add_expr_in_index_add_expr2725);
					index_add_expr();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_add_expr"



	// $ANTLR start "index_add_opr"
	// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:417:1: index_add_opr : ( PLUS | MINUS );
	public final void index_add_opr() throws RecognitionException {
		try {
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:418:5: ( PLUS | MINUS )
			// E:\\CS4240_SPR15-master\\CS4240_SPR15-master\\Tiger.g:
			{
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_add_opr"

	// Delegated rules



	public static final BitSet FOLLOW_type_declaration_list_in_program47 = new BitSet(new long[]{0x0020000030200000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_program49 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_main_function_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_funct_declaration_list1040 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_funct_declaration_tail_in_funct_declaration_list1042 = new BitSet(new long[]{0x0020000030200000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_funct_declaration_list1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_funct_declaration_list1052 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_funct_declaration_tail_in_funct_declaration_list1055 = new BitSet(new long[]{0x0020000030200000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_funct_declaration_list1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_funct_declaration_tail1084 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_funct_declaration_tail1086 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_funct_declaration_tail1088 = new BitSet(new long[]{0x0000800020000000L});
	public static final BitSet FOLLOW_param_list_in_funct_declaration_tail1090 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_funct_declaration_tail1092 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_funct_declaration_tail1094 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_funct_declaration_tail1096 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_END_in_funct_declaration_tail1098 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_funct_declaration_tail1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_main_function1119 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_main_function1121 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_main_function1123 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_main_function1125 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_main_function1127 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_END_in_main_function1129 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_main_function1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list1151 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_param_list_tail1175 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_param_in_param_list_tail1177 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list_tail1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_param1200 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_in_param1202 = new BitSet(new long[]{0x0000000030200000L});
	public static final BitSet FOLLOW_type_id_in_param1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list1223 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_list1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_tail1245 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_tail1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block1270 = new BitSet(new long[]{0x0018000000000000L});
	public static final BitSet FOLLOW_declaration_segment_in_block1272 = new BitSet(new long[]{0x0040400028400180L});
	public static final BitSet FOLLOW_stat_seq_in_block1274 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_END_in_block1276 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_block1278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_list_in_declaration_segment1297 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_declaration_segment1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_type_declaration_list1319 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_type_declaration_list_in_type_declaration_list1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_var_declaration_list1343 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_var_declaration_list1345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration1364 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_type_declaration1366 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration1368 = new BitSet(new long[]{0x0000000010200020L});
	public static final BitSet FOLLOW_type_in_type_declaration1370 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type1391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type1401 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LBRACK_in_type1403 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IntegerLiteral_in_type1405 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RBRACK_in_type1407 = new BitSet(new long[]{0x0000040080000000L});
	public static final BitSet FOLLOW_arr_brack_in_type1409 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_OF_in_type1411 = new BitSet(new long[]{0x0000000010200000L});
	public static final BitSet FOLLOW_base_type_in_type1413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_arr_brack1431 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IntegerLiteral_in_arr_brack1433 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RBRACK_in_arr_brack1435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_type_id1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration1514 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration1516 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_in_var_declaration1518 = new BitSet(new long[]{0x0000000030200000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration1520 = new BitSet(new long[]{0x0001000000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration1522 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_id_list1543 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_id_list_tail1567 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_id_list_in_id_list_tail1569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_init1596 = new BitSet(new long[]{0x0000000041000000L});
	public static final BitSet FOLLOW_constant_in_optional_init1598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_seq1617 = new BitSet(new long[]{0x0040400028400182L});
	public static final BitSet FOLLOW_stat_seq_in_stat_seq1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_else_expr_in_stat1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stat1649 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_stat1651 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DO_in_stat1653 = new BitSet(new long[]{0x0040400028400180L});
	public static final BitSet FOLLOW_stat_seq_in_stat1655 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDDO_in_stat1657 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_stat1669 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_stat1671 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat1673 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_index_expr_in_stat1675 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_TO_in_stat1677 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_index_expr_in_stat1679 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DO_in_stat1681 = new BitSet(new long[]{0x0040400028400180L});
	public static final BitSet FOLLOW_stat_seq_in_stat1683 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDDO_in_stat1685 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_stat1695 = new BitSet(new long[]{0x0000000880000040L});
	public static final BitSet FOLLOW_value_tail_in_stat1698 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat1700 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_or_list_in_stat1702 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_stat1706 = new BitSet(new long[]{0x0000800861000000L});
	public static final BitSet FOLLOW_expr_list_in_stat1708 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_stat1710 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_stat1723 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_stat1735 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_stat1737 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat1749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr_or_list1772 = new BitSet(new long[]{0x000019C306101010L});
	public static final BitSet FOLLOW_expr_tail_in_expr_or_list1774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_expr_or_list1782 = new BitSet(new long[]{0x000019CB86101010L});
	public static final BitSet FOLLOW_value_tail_in_expr_or_list1785 = new BitSet(new long[]{0x000019C306101010L});
	public static final BitSet FOLLOW_expr_tail_in_expr_or_list1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_or_list1791 = new BitSet(new long[]{0x0000800861000000L});
	public static final BitSet FOLLOW_expr_list_in_expr_or_list1793 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_or_list1795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_or_list1804 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_expr_or_list1806 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_or_list1808 = new BitSet(new long[]{0x000019C306101010L});
	public static final BitSet FOLLOW_expr_tail_in_expr_or_list1810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_expr_in_expr_tail1828 = new BitSet(new long[]{0x0000194306100010L});
	public static final BitSet FOLLOW_addtion_expr_in_expr_tail1830 = new BitSet(new long[]{0x0000090306100010L});
	public static final BitSet FOLLOW_comparative_expr_in_expr_tail1832 = new BitSet(new long[]{0x0000080000000010L});
	public static final BitSet FOLLOW_logic_expr_in_expr_tail1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_else_expr1852 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_if_else_expr1854 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_THEN_in_if_else_expr1856 = new BitSet(new long[]{0x0040400028400180L});
	public static final BitSet FOLLOW_stat_seq_in_if_else_expr1858 = new BitSet(new long[]{0x0000000000090000L});
	public static final BitSet FOLLOW_else_expr_in_if_else_expr1860 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ENDIF_in_if_else_expr1862 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_else_expr1864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_expr1890 = new BitSet(new long[]{0x0040400028400180L});
	public static final BitSet FOLLOW_stat_seq_in_else_expr1892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_opt_prefix1915 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_opt_prefix1917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_lev3_in_expr1938 = new BitSet(new long[]{0x0000080000000010L});
	public static final BitSet FOLLOW_logic_expr_in_expr1940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_lev2_in_expr_lev31960 = new BitSet(new long[]{0x0000010306100000L});
	public static final BitSet FOLLOW_comparative_expr_in_expr_lev31962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_lev1_in_expr_lev21981 = new BitSet(new long[]{0x0000104000000000L});
	public static final BitSet FOLLOW_addtion_expr_in_expr_lev21983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_expr_lev12002 = new BitSet(new long[]{0x0000008000001000L});
	public static final BitSet FOLLOW_mult_expr_in_expr_lev12004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression2023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primary_expression2033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primary_expression2043 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_primary_expression2045 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primary_expression2047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_operator_in_mult_expr2067 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_primary_expression_in_mult_expr2069 = new BitSet(new long[]{0x0000008000001000L});
	public static final BitSet FOLLOW_mult_expr_in_mult_expr2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addition_operator_in_addtion_expr2093 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_lev1_in_addtion_expr2095 = new BitSet(new long[]{0x0000104000000000L});
	public static final BitSet FOLLOW_addtion_expr_in_addtion_expr2097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparative_operator_in_comparative_expr2119 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_lev2_in_comparative_expr2121 = new BitSet(new long[]{0x0000010306100000L});
	public static final BitSet FOLLOW_comparative_expr_in_comparative_expr2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_operator_in_logic_expr2145 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_lev3_in_logic_expr2147 = new BitSet(new long[]{0x0000080000000010L});
	public static final BitSet FOLLOW_logic_expr_in_logic_expr2149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paren_operator_in_logical_operator2202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_operator_in_logical_operator2212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addition_operator_in_binary_operator2421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_operator_in_binary_operator2431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparative_operator_in_binary_operator2441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_operator_in_binary_operator2451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_list2471 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list2473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail2495 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail2497 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail2499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_value2520 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_value_tail_in_value2522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_value_tail2542 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_index_expr_in_value_tail2544 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RBRACK_in_value_tail2546 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_value_tail_tail_in_value_tail2548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_value_tail_tail2572 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_index_expr_in_value_tail_tail2574 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RBRACK_in_value_tail_tail2576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_lev1_in_index_expr2595 = new BitSet(new long[]{0x0000104000000000L});
	public static final BitSet FOLLOW_index_add_expr_in_index_expr2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_index_expr_in_index_expr_lev12618 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_index_mult_expr_in_index_expr_lev12620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_mult_opr_in_index_mult_expr2672 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_primary_index_expr_in_index_mult_expr2674 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_index_mult_expr_in_index_mult_expr2676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_index_mult_opr2699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_add_opr_in_index_add_expr2721 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_index_expr_lev1_in_index_add_expr2723 = new BitSet(new long[]{0x0000104000000000L});
	public static final BitSet FOLLOW_index_add_expr_in_index_add_expr2725 = new BitSet(new long[]{0x0000000000000002L});
}
