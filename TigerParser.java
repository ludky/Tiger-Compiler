// $ANTLR 3.5.2 Tiger.g 2015-02-22 22:47:58

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
	@Override public String getGrammarFileName() { return "Tiger.g"; }



	// $ANTLR start "program"
	// Tiger.g:8:1: program : type_declaration_list funct_declaration_list main_function ;
	public final void program() throws RecognitionException {
		try {
			// Tiger.g:9:5: ( type_declaration_list funct_declaration_list main_function )
			// Tiger.g:9:7: type_declaration_list funct_declaration_list main_function
			{
			pushFollow(FOLLOW_type_declaration_list_in_program41);
			type_declaration_list();
			state._fsp--;

			pushFollow(FOLLOW_funct_declaration_list_in_program43);
			funct_declaration_list();
			state._fsp--;

			pushFollow(FOLLOW_main_function_in_program45);
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
	// Tiger.g:100:1: funct_declaration_list : ( type_id funct_declaration_tail funct_declaration_list | VOID ( funct_declaration_tail funct_declaration_list )? );
	public final void funct_declaration_list() throws RecognitionException {
		try {
			// Tiger.g:101:5: ( type_id funct_declaration_tail funct_declaration_list | VOID ( funct_declaration_tail funct_declaration_list )? )
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
					// Tiger.g:101:7: type_id funct_declaration_tail funct_declaration_list
					{
					pushFollow(FOLLOW_type_id_in_funct_declaration_list1034);
					type_id();
					state._fsp--;

					pushFollow(FOLLOW_funct_declaration_tail_in_funct_declaration_list1036);
					funct_declaration_tail();
					state._fsp--;

					pushFollow(FOLLOW_funct_declaration_list_in_funct_declaration_list1038);
					funct_declaration_list();
					state._fsp--;

					}
					break;
				case 2 :
					// Tiger.g:102:7: VOID ( funct_declaration_tail funct_declaration_list )?
					{
					match(input,VOID,FOLLOW_VOID_in_funct_declaration_list1046); 
					// Tiger.g:102:12: ( funct_declaration_tail funct_declaration_list )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==FUNCTION) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// Tiger.g:102:13: funct_declaration_tail funct_declaration_list
							{
							pushFollow(FOLLOW_funct_declaration_tail_in_funct_declaration_list1049);
							funct_declaration_tail();
							state._fsp--;

							pushFollow(FOLLOW_funct_declaration_list_in_funct_declaration_list1051);
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
	// Tiger.g:105:1: funct_declaration_tail : FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI ;
	public final void funct_declaration_tail() throws RecognitionException {
		try {
			// Tiger.g:106:5: ( FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI )
			// Tiger.g:106:7: FUNCTION Identifier LPAREN param_list RPAREN BEGIN block_list END SEMI
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_funct_declaration_tail1078); 
			match(input,Identifier,FOLLOW_Identifier_in_funct_declaration_tail1080); 
			match(input,LPAREN,FOLLOW_LPAREN_in_funct_declaration_tail1082); 
			pushFollow(FOLLOW_param_list_in_funct_declaration_tail1084);
			param_list();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_funct_declaration_tail1086); 
			match(input,BEGIN,FOLLOW_BEGIN_in_funct_declaration_tail1088); 
			pushFollow(FOLLOW_block_list_in_funct_declaration_tail1090);
			block_list();
			state._fsp--;

			match(input,END,FOLLOW_END_in_funct_declaration_tail1092); 
			match(input,SEMI,FOLLOW_SEMI_in_funct_declaration_tail1094); 
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
	// Tiger.g:109:1: main_function : MAIN LPAREN RPAREN BEGIN block_list END SEMI ;
	public final void main_function() throws RecognitionException {
		try {
			// Tiger.g:110:5: ( MAIN LPAREN RPAREN BEGIN block_list END SEMI )
			// Tiger.g:110:9: MAIN LPAREN RPAREN BEGIN block_list END SEMI
			{
			match(input,MAIN,FOLLOW_MAIN_in_main_function1113); 
			match(input,LPAREN,FOLLOW_LPAREN_in_main_function1115); 
			match(input,RPAREN,FOLLOW_RPAREN_in_main_function1117); 
			match(input,BEGIN,FOLLOW_BEGIN_in_main_function1119); 
			pushFollow(FOLLOW_block_list_in_main_function1121);
			block_list();
			state._fsp--;

			match(input,END,FOLLOW_END_in_main_function1123); 
			match(input,SEMI,FOLLOW_SEMI_in_main_function1125); 
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
	// Tiger.g:113:1: param_list : ( param param_list_tail )? ;
	public final void param_list() throws RecognitionException {
		try {
			// Tiger.g:114:5: ( ( param param_list_tail )? )
			// Tiger.g:114:9: ( param param_list_tail )?
			{
			// Tiger.g:114:9: ( param param_list_tail )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==Identifier) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Tiger.g:114:10: param param_list_tail
					{
					pushFollow(FOLLOW_param_in_param_list1145);
					param();
					state._fsp--;

					pushFollow(FOLLOW_param_list_tail_in_param_list1147);
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
	// Tiger.g:117:1: param_list_tail : ( COMMA param param_list_tail )? ;
	public final void param_list_tail() throws RecognitionException {
		try {
			// Tiger.g:118:5: ( ( COMMA param param_list_tail )? )
			// Tiger.g:118:9: ( COMMA param param_list_tail )?
			{
			// Tiger.g:118:9: ( COMMA param param_list_tail )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==COMMA) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Tiger.g:118:10: COMMA param param_list_tail
					{
					match(input,COMMA,FOLLOW_COMMA_in_param_list_tail1169); 
					pushFollow(FOLLOW_param_in_param_list_tail1171);
					param();
					state._fsp--;

					pushFollow(FOLLOW_param_list_tail_in_param_list_tail1173);
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
	// Tiger.g:121:1: param : Identifier COLON type_id ;
	public final void param() throws RecognitionException {
		try {
			// Tiger.g:122:5: ( Identifier COLON type_id )
			// Tiger.g:122:9: Identifier COLON type_id
			{
			match(input,Identifier,FOLLOW_Identifier_in_param1194); 
			match(input,COLON,FOLLOW_COLON_in_param1196); 
			pushFollow(FOLLOW_type_id_in_param1198);
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
	// Tiger.g:125:1: block_list : block block_tail ;
	public final void block_list() throws RecognitionException {
		try {
			// Tiger.g:126:5: ( block block_tail )
			// Tiger.g:126:9: block block_tail
			{
			pushFollow(FOLLOW_block_in_block_list1217);
			block();
			state._fsp--;

			pushFollow(FOLLOW_block_tail_in_block_list1219);
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
	// Tiger.g:129:1: block_tail : ( block block_tail )? ;
	public final void block_tail() throws RecognitionException {
		try {
			// Tiger.g:130:5: ( ( block block_tail )? )
			// Tiger.g:130:9: ( block block_tail )?
			{
			// Tiger.g:130:9: ( block block_tail )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==BEGIN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Tiger.g:130:10: block block_tail
					{
					pushFollow(FOLLOW_block_in_block_tail1239);
					block();
					state._fsp--;

					pushFollow(FOLLOW_block_tail_in_block_tail1241);
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
	// Tiger.g:135:1: block : BEGIN declaration_segment stat_seq END SEMI ;
	public final void block() throws RecognitionException {
		try {
			// Tiger.g:136:5: ( BEGIN declaration_segment stat_seq END SEMI )
			// Tiger.g:136:9: BEGIN declaration_segment stat_seq END SEMI
			{
			match(input,BEGIN,FOLLOW_BEGIN_in_block1264); 
			pushFollow(FOLLOW_declaration_segment_in_block1266);
			declaration_segment();
			state._fsp--;

			pushFollow(FOLLOW_stat_seq_in_block1268);
			stat_seq();
			state._fsp--;

			match(input,END,FOLLOW_END_in_block1270); 
			match(input,SEMI,FOLLOW_SEMI_in_block1272); 
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
	// Tiger.g:139:1: declaration_segment : type_declaration_list var_declaration_list ;
	public final void declaration_segment() throws RecognitionException {
		try {
			// Tiger.g:140:5: ( type_declaration_list var_declaration_list )
			// Tiger.g:140:9: type_declaration_list var_declaration_list
			{
			pushFollow(FOLLOW_type_declaration_list_in_declaration_segment1291);
			type_declaration_list();
			state._fsp--;

			pushFollow(FOLLOW_var_declaration_list_in_declaration_segment1293);
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
	// Tiger.g:143:1: type_declaration_list : ( type_declaration type_declaration_list )? ;
	public final void type_declaration_list() throws RecognitionException {
		try {
			// Tiger.g:144:5: ( ( type_declaration type_declaration_list )? )
			// Tiger.g:144:9: ( type_declaration type_declaration_list )?
			{
			// Tiger.g:144:9: ( type_declaration type_declaration_list )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TYPE) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Tiger.g:144:10: type_declaration type_declaration_list
					{
					pushFollow(FOLLOW_type_declaration_in_type_declaration_list1313);
					type_declaration();
					state._fsp--;

					pushFollow(FOLLOW_type_declaration_list_in_type_declaration_list1315);
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
	// Tiger.g:147:1: var_declaration_list : ( var_declaration var_declaration_list )? ;
	public final void var_declaration_list() throws RecognitionException {
		try {
			// Tiger.g:148:5: ( ( var_declaration var_declaration_list )? )
			// Tiger.g:148:9: ( var_declaration var_declaration_list )?
			{
			// Tiger.g:148:9: ( var_declaration var_declaration_list )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VAR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Tiger.g:148:10: var_declaration var_declaration_list
					{
					pushFollow(FOLLOW_var_declaration_in_var_declaration_list1337);
					var_declaration();
					state._fsp--;

					pushFollow(FOLLOW_var_declaration_list_in_var_declaration_list1339);
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
	// Tiger.g:151:1: type_declaration : TYPE Identifier EQ type SEMI ;
	public final void type_declaration() throws RecognitionException {
		try {
			// Tiger.g:152:5: ( TYPE Identifier EQ type SEMI )
			// Tiger.g:152:7: TYPE Identifier EQ type SEMI
			{
			match(input,TYPE,FOLLOW_TYPE_in_type_declaration1358); 
			match(input,Identifier,FOLLOW_Identifier_in_type_declaration1360); 
			match(input,EQ,FOLLOW_EQ_in_type_declaration1362); 
			pushFollow(FOLLOW_type_in_type_declaration1364);
			type();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_type_declaration1366); 
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
	// Tiger.g:155:1: type : ( base_type | ARRAY LBRACK IntegerLiteral RBRACK arr_brack OF base_type );
	public final void type() throws RecognitionException {
		try {
			// Tiger.g:156:5: ( base_type | ARRAY LBRACK IntegerLiteral RBRACK arr_brack OF base_type )
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
					// Tiger.g:156:9: base_type
					{
					pushFollow(FOLLOW_base_type_in_type1385);
					base_type();
					state._fsp--;

					}
					break;
				case 2 :
					// Tiger.g:157:9: ARRAY LBRACK IntegerLiteral RBRACK arr_brack OF base_type
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_type1395); 
					match(input,LBRACK,FOLLOW_LBRACK_in_type1397); 
					match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_type1399); 
					match(input,RBRACK,FOLLOW_RBRACK_in_type1401); 
					pushFollow(FOLLOW_arr_brack_in_type1403);
					arr_brack();
					state._fsp--;

					match(input,OF,FOLLOW_OF_in_type1405); 
					pushFollow(FOLLOW_base_type_in_type1407);
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
	// Tiger.g:160:1: arr_brack : ( LBRACK IntegerLiteral RBRACK )? ;
	public final void arr_brack() throws RecognitionException {
		try {
			// Tiger.g:161:5: ( ( LBRACK IntegerLiteral RBRACK )? )
			// Tiger.g:161:7: ( LBRACK IntegerLiteral RBRACK )?
			{
			// Tiger.g:161:7: ( LBRACK IntegerLiteral RBRACK )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==LBRACK) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Tiger.g:161:8: LBRACK IntegerLiteral RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_arr_brack1425); 
					match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_arr_brack1427); 
					match(input,RBRACK,FOLLOW_RBRACK_in_arr_brack1429); 
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
	// Tiger.g:164:1: type_id : ( base_type | Identifier );
	public final void type_id() throws RecognitionException {
		try {
			// Tiger.g:165:5: ( base_type | Identifier )
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
					// Tiger.g:165:9: base_type
					{
					pushFollow(FOLLOW_base_type_in_type_id1450);
					base_type();
					state._fsp--;

					}
					break;
				case 2 :
					// Tiger.g:166:9: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_type_id1460); 
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
	// Tiger.g:169:1: base_type : ( INT | FIXEDPT );
	public final void base_type() throws RecognitionException {
		try {
			// Tiger.g:170:5: ( INT | FIXEDPT )
			// Tiger.g:
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
	// Tiger.g:174:1: var_declaration : VAR id_list COLON type_id optional_init SEMI ;
	public final void var_declaration() throws RecognitionException {
		try {
			// Tiger.g:175:5: ( VAR id_list COLON type_id optional_init SEMI )
			// Tiger.g:175:9: VAR id_list COLON type_id optional_init SEMI
			{
			match(input,VAR,FOLLOW_VAR_in_var_declaration1508); 
			pushFollow(FOLLOW_id_list_in_var_declaration1510);
			id_list();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_var_declaration1512); 
			pushFollow(FOLLOW_type_id_in_var_declaration1514);
			type_id();
			state._fsp--;

			pushFollow(FOLLOW_optional_init_in_var_declaration1516);
			optional_init();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_var_declaration1518); 
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
	// Tiger.g:178:1: id_list : Identifier id_list_tail ;
	public final void id_list() throws RecognitionException {
		try {
			// Tiger.g:179:5: ( Identifier id_list_tail )
			// Tiger.g:179:9: Identifier id_list_tail
			{
			match(input,Identifier,FOLLOW_Identifier_in_id_list1537); 
			pushFollow(FOLLOW_id_list_tail_in_id_list1539);
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
	// Tiger.g:182:1: id_list_tail : ( COMMA id_list )? ;
	public final void id_list_tail() throws RecognitionException {
		try {
			// Tiger.g:183:5: ( ( COMMA id_list )? )
			// Tiger.g:183:7: ( COMMA id_list )?
			{
			// Tiger.g:183:7: ( COMMA id_list )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==COMMA) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Tiger.g:183:8: COMMA id_list
					{
					match(input,COMMA,FOLLOW_COMMA_in_id_list_tail1561); 
					pushFollow(FOLLOW_id_list_in_id_list_tail1563);
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
	// Tiger.g:187:1: optional_init : ( ASSIGN constant )? ;
	public final void optional_init() throws RecognitionException {
		try {
			// Tiger.g:188:5: ( ( ASSIGN constant )? )
			// Tiger.g:188:9: ( ASSIGN constant )?
			{
			// Tiger.g:188:9: ( ASSIGN constant )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ASSIGN) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Tiger.g:188:10: ASSIGN constant
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_init1590); 
					pushFollow(FOLLOW_constant_in_optional_init1592);
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
	// Tiger.g:191:1: stat_seq : stat ( stat_seq )? ;
	public final void stat_seq() throws RecognitionException {
		try {
			// Tiger.g:192:5: ( stat ( stat_seq )? )
			// Tiger.g:192:7: stat ( stat_seq )?
			{
			pushFollow(FOLLOW_stat_in_stat_seq1611);
			stat();
			state._fsp--;

			// Tiger.g:192:12: ( stat_seq )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= BEGIN && LA13_0 <= BREAK)||LA13_0==FOR||LA13_0==IF||LA13_0==Identifier||LA13_0==RETURN||LA13_0==WHILE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// Tiger.g:192:13: stat_seq
					{
					pushFollow(FOLLOW_stat_seq_in_stat_seq1614);
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
	// Tiger.g:195:1: stat : ( if_else_expr | WHILE expr DO stat_seq ENDDO SEMI | FOR Identifier ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI | Identifier ( value_tail ASSIGN expr_or_list | LPAREN expr_list RPAREN ) SEMI | BREAK SEMI | RETURN expr SEMI | block );
	public final void stat() throws RecognitionException {
		try {
			// Tiger.g:196:5: ( if_else_expr | WHILE expr DO stat_seq ENDDO SEMI | FOR Identifier ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI | Identifier ( value_tail ASSIGN expr_or_list | LPAREN expr_list RPAREN ) SEMI | BREAK SEMI | RETURN expr SEMI | block )
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
					// Tiger.g:196:7: if_else_expr
					{
					pushFollow(FOLLOW_if_else_expr_in_stat1633);
					if_else_expr();
					state._fsp--;

					}
					break;
				case 2 :
					// Tiger.g:197:9: WHILE expr DO stat_seq ENDDO SEMI
					{
					match(input,WHILE,FOLLOW_WHILE_in_stat1643); 
					pushFollow(FOLLOW_expr_in_stat1645);
					expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_stat1647); 
					pushFollow(FOLLOW_stat_seq_in_stat1649);
					stat_seq();
					state._fsp--;

					match(input,ENDDO,FOLLOW_ENDDO_in_stat1651); 
					match(input,SEMI,FOLLOW_SEMI_in_stat1653); 
					}
					break;
				case 3 :
					// Tiger.g:198:9: FOR Identifier ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI
					{
					match(input,FOR,FOLLOW_FOR_in_stat1663); 
					match(input,Identifier,FOLLOW_Identifier_in_stat1665); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_stat1667); 
					pushFollow(FOLLOW_index_expr_in_stat1669);
					index_expr();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_stat1671); 
					pushFollow(FOLLOW_index_expr_in_stat1673);
					index_expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_stat1675); 
					pushFollow(FOLLOW_stat_seq_in_stat1677);
					stat_seq();
					state._fsp--;

					match(input,ENDDO,FOLLOW_ENDDO_in_stat1679); 
					match(input,SEMI,FOLLOW_SEMI_in_stat1681); 
					}
					break;
				case 4 :
					// Tiger.g:199:7: Identifier ( value_tail ASSIGN expr_or_list | LPAREN expr_list RPAREN ) SEMI
					{
					match(input,Identifier,FOLLOW_Identifier_in_stat1689); 
					// Tiger.g:199:18: ( value_tail ASSIGN expr_or_list | LPAREN expr_list RPAREN )
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
							// Tiger.g:199:19: value_tail ASSIGN expr_or_list
							{
							pushFollow(FOLLOW_value_tail_in_stat1692);
							value_tail();
							state._fsp--;

							match(input,ASSIGN,FOLLOW_ASSIGN_in_stat1694); 
							pushFollow(FOLLOW_expr_or_list_in_stat1696);
							expr_or_list();
							state._fsp--;

							}
							break;
						case 2 :
							// Tiger.g:199:52: LPAREN expr_list RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_stat1700); 
							pushFollow(FOLLOW_expr_list_in_stat1702);
							expr_list();
							state._fsp--;

							match(input,RPAREN,FOLLOW_RPAREN_in_stat1704); 
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_stat1707); 
					}
					break;
				case 5 :
					// Tiger.g:200:9: BREAK SEMI
					{
					match(input,BREAK,FOLLOW_BREAK_in_stat1717); 
					match(input,SEMI,FOLLOW_SEMI_in_stat1719); 
					}
					break;
				case 6 :
					// Tiger.g:201:9: RETURN expr SEMI
					{
					match(input,RETURN,FOLLOW_RETURN_in_stat1729); 
					pushFollow(FOLLOW_expr_in_stat1731);
					expr();
					state._fsp--;

					match(input,SEMI,FOLLOW_SEMI_in_stat1733); 
					}
					break;
				case 7 :
					// Tiger.g:202:9: block
					{
					pushFollow(FOLLOW_block_in_stat1743);
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
	// Tiger.g:205:1: expr_or_list : ( constant expr_tail | Identifier ( value_tail expr_tail | LPAREN expr_list RPAREN ) | LPAREN expr RPAREN expr_tail );
	public final void expr_or_list() throws RecognitionException {
		try {
			// Tiger.g:206:5: ( constant expr_tail | Identifier ( value_tail expr_tail | LPAREN expr_list RPAREN ) | LPAREN expr RPAREN expr_tail )
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
					// Tiger.g:206:7: constant expr_tail
					{
					pushFollow(FOLLOW_constant_in_expr_or_list1766);
					constant();
					state._fsp--;

					pushFollow(FOLLOW_expr_tail_in_expr_or_list1768);
					expr_tail();
					state._fsp--;

					}
					break;
				case 2 :
					// Tiger.g:207:7: Identifier ( value_tail expr_tail | LPAREN expr_list RPAREN )
					{
					match(input,Identifier,FOLLOW_Identifier_in_expr_or_list1776); 
					// Tiger.g:207:18: ( value_tail expr_tail | LPAREN expr_list RPAREN )
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
							// Tiger.g:207:19: value_tail expr_tail
							{
							pushFollow(FOLLOW_value_tail_in_expr_or_list1779);
							value_tail();
							state._fsp--;

							pushFollow(FOLLOW_expr_tail_in_expr_or_list1781);
							expr_tail();
							state._fsp--;

							}
							break;
						case 2 :
							// Tiger.g:207:42: LPAREN expr_list RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_expr_or_list1785); 
							pushFollow(FOLLOW_expr_list_in_expr_or_list1787);
							expr_list();
							state._fsp--;

							match(input,RPAREN,FOLLOW_RPAREN_in_expr_or_list1789); 
							}
							break;

					}

					}
					break;
				case 3 :
					// Tiger.g:208:7: LPAREN expr RPAREN expr_tail
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_expr_or_list1798); 
					pushFollow(FOLLOW_expr_in_expr_or_list1800);
					expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_expr_or_list1802); 
					pushFollow(FOLLOW_expr_tail_in_expr_or_list1804);
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
	// Tiger.g:211:1: expr_tail : mult_expr addtion_expr comparative_expr logic_expr ;
	public final void expr_tail() throws RecognitionException {
		try {
			// Tiger.g:212:2: ( mult_expr addtion_expr comparative_expr logic_expr )
			// Tiger.g:212:4: mult_expr addtion_expr comparative_expr logic_expr
			{
			pushFollow(FOLLOW_mult_expr_in_expr_tail1822);
			mult_expr();
			state._fsp--;

			pushFollow(FOLLOW_addtion_expr_in_expr_tail1824);
			addtion_expr();
			state._fsp--;

			pushFollow(FOLLOW_comparative_expr_in_expr_tail1826);
			comparative_expr();
			state._fsp--;

			pushFollow(FOLLOW_logic_expr_in_expr_tail1828);
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
	// Tiger.g:215:1: if_else_expr : IF expr THEN stat_seq else_expr ENDIF SEMI ;
	public final void if_else_expr() throws RecognitionException {
		try {
			// Tiger.g:216:5: ( IF expr THEN stat_seq else_expr ENDIF SEMI )
			// Tiger.g:216:7: IF expr THEN stat_seq else_expr ENDIF SEMI
			{
			match(input,IF,FOLLOW_IF_in_if_else_expr1846); 
			pushFollow(FOLLOW_expr_in_if_else_expr1848);
			expr();
			state._fsp--;

			match(input,THEN,FOLLOW_THEN_in_if_else_expr1850); 
			pushFollow(FOLLOW_stat_seq_in_if_else_expr1852);
			stat_seq();
			state._fsp--;

			pushFollow(FOLLOW_else_expr_in_if_else_expr1854);
			else_expr();
			state._fsp--;

			match(input,ENDIF,FOLLOW_ENDIF_in_if_else_expr1856); 
			match(input,SEMI,FOLLOW_SEMI_in_if_else_expr1858); 
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
	// Tiger.g:219:1: else_expr : ( ELSE stat_seq )? ;
	public final void else_expr() throws RecognitionException {
		try {
			// Tiger.g:220:5: ( ( ELSE stat_seq )? )
			// Tiger.g:220:7: ( ELSE stat_seq )?
			{
			// Tiger.g:220:7: ( ELSE stat_seq )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ELSE) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Tiger.g:220:8: ELSE stat_seq
					{
					match(input,ELSE,FOLLOW_ELSE_in_else_expr1884); 
					pushFollow(FOLLOW_stat_seq_in_else_expr1886);
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
	// Tiger.g:223:1: opt_prefix : ( value ASSIGN )? ;
	public final void opt_prefix() throws RecognitionException {
		try {
			// Tiger.g:224:5: ( ( value ASSIGN )? )
			// Tiger.g:224:9: ( value ASSIGN )?
			{
			// Tiger.g:224:9: ( value ASSIGN )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==Identifier) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Tiger.g:224:10: value ASSIGN
					{
					pushFollow(FOLLOW_value_in_opt_prefix1909);
					value();
					state._fsp--;

					match(input,ASSIGN,FOLLOW_ASSIGN_in_opt_prefix1911); 
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
	// Tiger.g:227:1: expr : expr_lev3 logic_expr ;
	public final void expr() throws RecognitionException {
		try {
			// Tiger.g:228:5: ( expr_lev3 logic_expr )
			// Tiger.g:228:9: expr_lev3 logic_expr
			{
			pushFollow(FOLLOW_expr_lev3_in_expr1932);
			expr_lev3();
			state._fsp--;

			pushFollow(FOLLOW_logic_expr_in_expr1934);
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
	// Tiger.g:231:1: expr_lev3 : expr_lev2 comparative_expr ;
	public final void expr_lev3() throws RecognitionException {
		try {
			// Tiger.g:232:5: ( expr_lev2 comparative_expr )
			// Tiger.g:232:9: expr_lev2 comparative_expr
			{
			pushFollow(FOLLOW_expr_lev2_in_expr_lev31954);
			expr_lev2();
			state._fsp--;

			pushFollow(FOLLOW_comparative_expr_in_expr_lev31956);
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
	// Tiger.g:235:1: expr_lev2 : expr_lev1 addtion_expr ;
	public final void expr_lev2() throws RecognitionException {
		try {
			// Tiger.g:236:5: ( expr_lev1 addtion_expr )
			// Tiger.g:236:9: expr_lev1 addtion_expr
			{
			pushFollow(FOLLOW_expr_lev1_in_expr_lev21975);
			expr_lev1();
			state._fsp--;

			pushFollow(FOLLOW_addtion_expr_in_expr_lev21977);
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
	// Tiger.g:239:1: expr_lev1 : primary_expression mult_expr ;
	public final void expr_lev1() throws RecognitionException {
		try {
			// Tiger.g:240:5: ( primary_expression mult_expr )
			// Tiger.g:240:9: primary_expression mult_expr
			{
			pushFollow(FOLLOW_primary_expression_in_expr_lev11996);
			primary_expression();
			state._fsp--;

			pushFollow(FOLLOW_mult_expr_in_expr_lev11998);
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
	// Tiger.g:243:1: primary_expression : ( constant | value | LPAREN expr RPAREN );
	public final void primary_expression() throws RecognitionException {
		try {
			// Tiger.g:244:5: ( constant | value | LPAREN expr RPAREN )
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
					// Tiger.g:244:9: constant
					{
					pushFollow(FOLLOW_constant_in_primary_expression2017);
					constant();
					state._fsp--;

					}
					break;
				case 2 :
					// Tiger.g:245:9: value
					{
					pushFollow(FOLLOW_value_in_primary_expression2027);
					value();
					state._fsp--;

					}
					break;
				case 3 :
					// Tiger.g:246:9: LPAREN expr RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primary_expression2037); 
					pushFollow(FOLLOW_expr_in_primary_expression2039);
					expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_primary_expression2041); 
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
	// Tiger.g:249:1: mult_expr : ( mult_operator primary_expression mult_expr )? ;
	public final void mult_expr() throws RecognitionException {
		try {
			// Tiger.g:250:5: ( ( mult_operator primary_expression mult_expr )? )
			// Tiger.g:250:9: ( mult_operator primary_expression mult_expr )?
			{
			// Tiger.g:250:9: ( mult_operator primary_expression mult_expr )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==DIV||LA21_0==MULT) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// Tiger.g:250:10: mult_operator primary_expression mult_expr
					{
					pushFollow(FOLLOW_mult_operator_in_mult_expr2061);
					mult_operator();
					state._fsp--;

					pushFollow(FOLLOW_primary_expression_in_mult_expr2063);
					primary_expression();
					state._fsp--;

					pushFollow(FOLLOW_mult_expr_in_mult_expr2065);
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
	// Tiger.g:253:1: addtion_expr : ( addition_operator expr_lev1 addtion_expr )? ;
	public final void addtion_expr() throws RecognitionException {
		try {
			// Tiger.g:254:5: ( ( addition_operator expr_lev1 addtion_expr )? )
			// Tiger.g:254:9: ( addition_operator expr_lev1 addtion_expr )?
			{
			// Tiger.g:254:9: ( addition_operator expr_lev1 addtion_expr )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==MINUS||LA22_0==PLUS) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// Tiger.g:254:10: addition_operator expr_lev1 addtion_expr
					{
					pushFollow(FOLLOW_addition_operator_in_addtion_expr2087);
					addition_operator();
					state._fsp--;

					pushFollow(FOLLOW_expr_lev1_in_addtion_expr2089);
					expr_lev1();
					state._fsp--;

					pushFollow(FOLLOW_addtion_expr_in_addtion_expr2091);
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
	// Tiger.g:257:1: comparative_expr : ( comparative_operator expr_lev2 comparative_expr )? ;
	public final void comparative_expr() throws RecognitionException {
		try {
			// Tiger.g:258:5: ( ( comparative_operator expr_lev2 comparative_expr )? )
			// Tiger.g:258:9: ( comparative_operator expr_lev2 comparative_expr )?
			{
			// Tiger.g:258:9: ( comparative_operator expr_lev2 comparative_expr )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==EQ||(LA23_0 >= GREATER && LA23_0 <= GREATEREQ)||(LA23_0 >= LESSER && LA23_0 <= LESSEREQ)||LA23_0==NEQ) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Tiger.g:258:10: comparative_operator expr_lev2 comparative_expr
					{
					pushFollow(FOLLOW_comparative_operator_in_comparative_expr2113);
					comparative_operator();
					state._fsp--;

					pushFollow(FOLLOW_expr_lev2_in_comparative_expr2115);
					expr_lev2();
					state._fsp--;

					pushFollow(FOLLOW_comparative_expr_in_comparative_expr2117);
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
	// Tiger.g:261:1: logic_expr : ( and_or_operator expr_lev3 logic_expr )? ;
	public final void logic_expr() throws RecognitionException {
		try {
			// Tiger.g:262:5: ( ( and_or_operator expr_lev3 logic_expr )? )
			// Tiger.g:262:9: ( and_or_operator expr_lev3 logic_expr )?
			{
			// Tiger.g:262:9: ( and_or_operator expr_lev3 logic_expr )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==AND||LA24_0==OR) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Tiger.g:262:10: and_or_operator expr_lev3 logic_expr
					{
					pushFollow(FOLLOW_and_or_operator_in_logic_expr2139);
					and_or_operator();
					state._fsp--;

					pushFollow(FOLLOW_expr_lev3_in_logic_expr2141);
					expr_lev3();
					state._fsp--;

					pushFollow(FOLLOW_logic_expr_in_logic_expr2143);
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
	// Tiger.g:265:1: constant : ( IntegerLiteral | FixedPointLiteral );
	public final void constant() throws RecognitionException {
		try {
			// Tiger.g:266:5: ( IntegerLiteral | FixedPointLiteral )
			// Tiger.g:
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
	// Tiger.g:272:1: logical_operator : ( paren_operator | and_or_operator );
	public final void logical_operator() throws RecognitionException {
		try {
			// Tiger.g:273:5: ( paren_operator | and_or_operator )
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
					// Tiger.g:273:9: paren_operator
					{
					pushFollow(FOLLOW_paren_operator_in_logical_operator2196);
					paren_operator();
					state._fsp--;

					}
					break;
				case 2 :
					// Tiger.g:274:9: and_or_operator
					{
					pushFollow(FOLLOW_and_or_operator_in_logical_operator2206);
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
	// Tiger.g:278:1: paren_operator : ( LPAREN | RPAREN );
	public final void paren_operator() throws RecognitionException {
		try {
			// Tiger.g:279:5: ( LPAREN | RPAREN )
			// Tiger.g:
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
	// Tiger.g:284:1: mult_operator : ( MULT | DIV );
	public final void mult_operator() throws RecognitionException {
		try {
			// Tiger.g:285:5: ( MULT | DIV )
			// Tiger.g:
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
	// Tiger.g:290:1: addition_operator : ( PLUS | MINUS );
	public final void addition_operator() throws RecognitionException {
		try {
			// Tiger.g:291:5: ( PLUS | MINUS )
			// Tiger.g:
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
	// Tiger.g:296:1: comparative_operator : ( EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ );
	public final void comparative_operator() throws RecognitionException {
		try {
			// Tiger.g:297:5: ( EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ )
			// Tiger.g:
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
	// Tiger.g:306:1: and_or_operator : ( AND | OR );
	public final void and_or_operator() throws RecognitionException {
		try {
			// Tiger.g:307:5: ( AND | OR )
			// Tiger.g:
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
	// Tiger.g:311:1: binary_operator : ( addition_operator | mult_operator | comparative_operator | and_or_operator );
	public final void binary_operator() throws RecognitionException {
		try {
			// Tiger.g:312:5: ( addition_operator | mult_operator | comparative_operator | and_or_operator )
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
					// Tiger.g:312:9: addition_operator
					{
					pushFollow(FOLLOW_addition_operator_in_binary_operator2415);
					addition_operator();
					state._fsp--;

					}
					break;
				case 2 :
					// Tiger.g:313:9: mult_operator
					{
					pushFollow(FOLLOW_mult_operator_in_binary_operator2425);
					mult_operator();
					state._fsp--;

					}
					break;
				case 3 :
					// Tiger.g:314:9: comparative_operator
					{
					pushFollow(FOLLOW_comparative_operator_in_binary_operator2435);
					comparative_operator();
					state._fsp--;

					}
					break;
				case 4 :
					// Tiger.g:315:9: and_or_operator
					{
					pushFollow(FOLLOW_and_or_operator_in_binary_operator2445);
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
	// Tiger.g:318:1: expr_list : ( expr expr_list_tail )? ;
	public final void expr_list() throws RecognitionException {
		try {
			// Tiger.g:319:5: ( ( expr expr_list_tail )? )
			// Tiger.g:319:9: ( expr expr_list_tail )?
			{
			// Tiger.g:319:9: ( expr expr_list_tail )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==FixedPointLiteral||(LA27_0 >= Identifier && LA27_0 <= IntegerLiteral)||LA27_0==LPAREN) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// Tiger.g:319:10: expr expr_list_tail
					{
					pushFollow(FOLLOW_expr_in_expr_list2465);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_list_tail_in_expr_list2467);
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
	// Tiger.g:322:1: expr_list_tail : ( COMMA expr expr_list_tail )? ;
	public final void expr_list_tail() throws RecognitionException {
		try {
			// Tiger.g:323:5: ( ( COMMA expr expr_list_tail )? )
			// Tiger.g:323:9: ( COMMA expr expr_list_tail )?
			{
			// Tiger.g:323:9: ( COMMA expr expr_list_tail )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==COMMA) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Tiger.g:323:10: COMMA expr expr_list_tail
					{
					match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail2489); 
					pushFollow(FOLLOW_expr_in_expr_list_tail2491);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail2493);
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
	// Tiger.g:326:1: value : Identifier value_tail ;
	public final void value() throws RecognitionException {
		try {
			// Tiger.g:327:5: ( Identifier value_tail )
			// Tiger.g:327:9: Identifier value_tail
			{
			match(input,Identifier,FOLLOW_Identifier_in_value2514); 
			pushFollow(FOLLOW_value_tail_in_value2516);
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
	// Tiger.g:330:1: value_tail : ( LBRACK index_expr RBRACK value_tail_tail )? ;
	public final void value_tail() throws RecognitionException {
		try {
			// Tiger.g:331:5: ( ( LBRACK index_expr RBRACK value_tail_tail )? )
			// Tiger.g:331:9: ( LBRACK index_expr RBRACK value_tail_tail )?
			{
			// Tiger.g:331:9: ( LBRACK index_expr RBRACK value_tail_tail )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==LBRACK) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// Tiger.g:331:10: LBRACK index_expr RBRACK value_tail_tail
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_value_tail2536); 
					pushFollow(FOLLOW_index_expr_in_value_tail2538);
					index_expr();
					state._fsp--;

					match(input,RBRACK,FOLLOW_RBRACK_in_value_tail2540); 
					pushFollow(FOLLOW_value_tail_tail_in_value_tail2542);
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
	// Tiger.g:334:1: value_tail_tail : ( LBRACK index_expr RBRACK )? ;
	public final void value_tail_tail() throws RecognitionException {
		try {
			// Tiger.g:335:5: ( ( LBRACK index_expr RBRACK )? )
			// Tiger.g:335:7: ( LBRACK index_expr RBRACK )?
			{
			// Tiger.g:335:7: ( LBRACK index_expr RBRACK )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==LBRACK) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// Tiger.g:335:8: LBRACK index_expr RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_value_tail_tail2566); 
					pushFollow(FOLLOW_index_expr_in_value_tail_tail2568);
					index_expr();
					state._fsp--;

					match(input,RBRACK,FOLLOW_RBRACK_in_value_tail_tail2570); 
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
	// Tiger.g:338:1: index_expr : index_expr_lev1 index_add_expr ;
	public final void index_expr() throws RecognitionException {
		try {
			// Tiger.g:339:5: ( index_expr_lev1 index_add_expr )
			// Tiger.g:339:7: index_expr_lev1 index_add_expr
			{
			pushFollow(FOLLOW_index_expr_lev1_in_index_expr2589);
			index_expr_lev1();
			state._fsp--;

			pushFollow(FOLLOW_index_add_expr_in_index_expr2591);
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
	// Tiger.g:342:1: index_expr_lev1 : primary_index_expr index_mult_expr ;
	public final void index_expr_lev1() throws RecognitionException {
		try {
			// Tiger.g:343:5: ( primary_index_expr index_mult_expr )
			// Tiger.g:343:7: primary_index_expr index_mult_expr
			{
			pushFollow(FOLLOW_primary_index_expr_in_index_expr_lev12612);
			primary_index_expr();
			state._fsp--;

			pushFollow(FOLLOW_index_mult_expr_in_index_expr_lev12614);
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
	// Tiger.g:346:1: primary_index_expr : ( IntegerLiteral | Identifier );
	public final void primary_index_expr() throws RecognitionException {
		try {
			// Tiger.g:347:5: ( IntegerLiteral | Identifier )
			// Tiger.g:
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
	// Tiger.g:351:1: index_mult_expr : ( index_mult_opr primary_index_expr index_mult_expr )? ;
	public final void index_mult_expr() throws RecognitionException {
		try {
			// Tiger.g:352:5: ( ( index_mult_opr primary_index_expr index_mult_expr )? )
			// Tiger.g:352:7: ( index_mult_opr primary_index_expr index_mult_expr )?
			{
			// Tiger.g:352:7: ( index_mult_opr primary_index_expr index_mult_expr )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==MULT) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Tiger.g:352:8: index_mult_opr primary_index_expr index_mult_expr
					{
					pushFollow(FOLLOW_index_mult_opr_in_index_mult_expr2666);
					index_mult_opr();
					state._fsp--;

					pushFollow(FOLLOW_primary_index_expr_in_index_mult_expr2668);
					primary_index_expr();
					state._fsp--;

					pushFollow(FOLLOW_index_mult_expr_in_index_mult_expr2670);
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
	// Tiger.g:355:1: index_mult_opr : MULT ;
	public final void index_mult_opr() throws RecognitionException {
		try {
			// Tiger.g:356:5: ( MULT )
			// Tiger.g:356:7: MULT
			{
			match(input,MULT,FOLLOW_MULT_in_index_mult_opr2693); 
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
	// Tiger.g:359:1: index_add_expr : ( index_add_opr index_expr_lev1 index_add_expr )? ;
	public final void index_add_expr() throws RecognitionException {
		try {
			// Tiger.g:360:5: ( ( index_add_opr index_expr_lev1 index_add_expr )? )
			// Tiger.g:360:7: ( index_add_opr index_expr_lev1 index_add_expr )?
			{
			// Tiger.g:360:7: ( index_add_opr index_expr_lev1 index_add_expr )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==MINUS||LA32_0==PLUS) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// Tiger.g:360:8: index_add_opr index_expr_lev1 index_add_expr
					{
					pushFollow(FOLLOW_index_add_opr_in_index_add_expr2715);
					index_add_opr();
					state._fsp--;

					pushFollow(FOLLOW_index_expr_lev1_in_index_add_expr2717);
					index_expr_lev1();
					state._fsp--;

					pushFollow(FOLLOW_index_add_expr_in_index_add_expr2719);
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
	// Tiger.g:363:1: index_add_opr : ( PLUS | MINUS );
	public final void index_add_opr() throws RecognitionException {
		try {
			// Tiger.g:364:5: ( PLUS | MINUS )
			// Tiger.g:
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



	public static final BitSet FOLLOW_type_declaration_list_in_program41 = new BitSet(new long[]{0x0020000030200000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_program43 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_main_function_in_program45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_funct_declaration_list1034 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_funct_declaration_tail_in_funct_declaration_list1036 = new BitSet(new long[]{0x0020000030200000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_funct_declaration_list1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_funct_declaration_list1046 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_funct_declaration_tail_in_funct_declaration_list1049 = new BitSet(new long[]{0x0020000030200000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_funct_declaration_list1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_funct_declaration_tail1078 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_funct_declaration_tail1080 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_funct_declaration_tail1082 = new BitSet(new long[]{0x0000800020000000L});
	public static final BitSet FOLLOW_param_list_in_funct_declaration_tail1084 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_funct_declaration_tail1086 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_funct_declaration_tail1088 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_funct_declaration_tail1090 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_END_in_funct_declaration_tail1092 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_funct_declaration_tail1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_main_function1113 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_main_function1115 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_main_function1117 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_main_function1119 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_main_function1121 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_END_in_main_function1123 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_main_function1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list1145 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_param_list_tail1169 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_param_in_param_list_tail1171 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list_tail1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_param1194 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_in_param1196 = new BitSet(new long[]{0x0000000030200000L});
	public static final BitSet FOLLOW_type_id_in_param1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list1217 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_list1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_tail1239 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_tail1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block1264 = new BitSet(new long[]{0x0018000000000000L});
	public static final BitSet FOLLOW_declaration_segment_in_block1266 = new BitSet(new long[]{0x0040400028400180L});
	public static final BitSet FOLLOW_stat_seq_in_block1268 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_END_in_block1270 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_block1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_list_in_declaration_segment1291 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_declaration_segment1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_type_declaration_list1313 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_type_declaration_list_in_type_declaration_list1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_var_declaration_list1337 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_var_declaration_list1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration1358 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_type_declaration1360 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration1362 = new BitSet(new long[]{0x0000000010200020L});
	public static final BitSet FOLLOW_type_in_type_declaration1364 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type1395 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LBRACK_in_type1397 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IntegerLiteral_in_type1399 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RBRACK_in_type1401 = new BitSet(new long[]{0x0000040080000000L});
	public static final BitSet FOLLOW_arr_brack_in_type1403 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_OF_in_type1405 = new BitSet(new long[]{0x0000000010200000L});
	public static final BitSet FOLLOW_base_type_in_type1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_arr_brack1425 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IntegerLiteral_in_arr_brack1427 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RBRACK_in_arr_brack1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id1450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_type_id1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration1508 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration1510 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_in_var_declaration1512 = new BitSet(new long[]{0x0000000030200000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration1514 = new BitSet(new long[]{0x0001000000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration1516 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration1518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_id_list1537 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list1539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_id_list_tail1561 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_id_list_in_id_list_tail1563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_init1590 = new BitSet(new long[]{0x0000000041000000L});
	public static final BitSet FOLLOW_constant_in_optional_init1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_seq1611 = new BitSet(new long[]{0x0040400028400182L});
	public static final BitSet FOLLOW_stat_seq_in_stat_seq1614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_else_expr_in_stat1633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stat1643 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_stat1645 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DO_in_stat1647 = new BitSet(new long[]{0x0040400028400180L});
	public static final BitSet FOLLOW_stat_seq_in_stat1649 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDDO_in_stat1651 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_stat1663 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_stat1665 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat1667 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_index_expr_in_stat1669 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_TO_in_stat1671 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_index_expr_in_stat1673 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DO_in_stat1675 = new BitSet(new long[]{0x0040400028400180L});
	public static final BitSet FOLLOW_stat_seq_in_stat1677 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDDO_in_stat1679 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_stat1689 = new BitSet(new long[]{0x0000000880000040L});
	public static final BitSet FOLLOW_value_tail_in_stat1692 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat1694 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_or_list_in_stat1696 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_stat1700 = new BitSet(new long[]{0x0000800861000000L});
	public static final BitSet FOLLOW_expr_list_in_stat1702 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_stat1704 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_stat1717 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_stat1729 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_stat1731 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat1743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr_or_list1766 = new BitSet(new long[]{0x000019C306101010L});
	public static final BitSet FOLLOW_expr_tail_in_expr_or_list1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_expr_or_list1776 = new BitSet(new long[]{0x000019CB86101010L});
	public static final BitSet FOLLOW_value_tail_in_expr_or_list1779 = new BitSet(new long[]{0x000019C306101010L});
	public static final BitSet FOLLOW_expr_tail_in_expr_or_list1781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_or_list1785 = new BitSet(new long[]{0x0000800861000000L});
	public static final BitSet FOLLOW_expr_list_in_expr_or_list1787 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_or_list1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_or_list1798 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_expr_or_list1800 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_or_list1802 = new BitSet(new long[]{0x000019C306101010L});
	public static final BitSet FOLLOW_expr_tail_in_expr_or_list1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_expr_in_expr_tail1822 = new BitSet(new long[]{0x0000194306100010L});
	public static final BitSet FOLLOW_addtion_expr_in_expr_tail1824 = new BitSet(new long[]{0x0000090306100010L});
	public static final BitSet FOLLOW_comparative_expr_in_expr_tail1826 = new BitSet(new long[]{0x0000080000000010L});
	public static final BitSet FOLLOW_logic_expr_in_expr_tail1828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_else_expr1846 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_if_else_expr1848 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_THEN_in_if_else_expr1850 = new BitSet(new long[]{0x0040400028400180L});
	public static final BitSet FOLLOW_stat_seq_in_if_else_expr1852 = new BitSet(new long[]{0x0000000000090000L});
	public static final BitSet FOLLOW_else_expr_in_if_else_expr1854 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ENDIF_in_if_else_expr1856 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_else_expr1858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_expr1884 = new BitSet(new long[]{0x0040400028400180L});
	public static final BitSet FOLLOW_stat_seq_in_else_expr1886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_opt_prefix1909 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_opt_prefix1911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_lev3_in_expr1932 = new BitSet(new long[]{0x0000080000000010L});
	public static final BitSet FOLLOW_logic_expr_in_expr1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_lev2_in_expr_lev31954 = new BitSet(new long[]{0x0000010306100000L});
	public static final BitSet FOLLOW_comparative_expr_in_expr_lev31956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_lev1_in_expr_lev21975 = new BitSet(new long[]{0x0000104000000000L});
	public static final BitSet FOLLOW_addtion_expr_in_expr_lev21977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_expr_lev11996 = new BitSet(new long[]{0x0000008000001000L});
	public static final BitSet FOLLOW_mult_expr_in_expr_lev11998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression2017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primary_expression2027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primary_expression2037 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_primary_expression2039 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primary_expression2041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_operator_in_mult_expr2061 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_primary_expression_in_mult_expr2063 = new BitSet(new long[]{0x0000008000001000L});
	public static final BitSet FOLLOW_mult_expr_in_mult_expr2065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addition_operator_in_addtion_expr2087 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_lev1_in_addtion_expr2089 = new BitSet(new long[]{0x0000104000000000L});
	public static final BitSet FOLLOW_addtion_expr_in_addtion_expr2091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparative_operator_in_comparative_expr2113 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_lev2_in_comparative_expr2115 = new BitSet(new long[]{0x0000010306100000L});
	public static final BitSet FOLLOW_comparative_expr_in_comparative_expr2117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_operator_in_logic_expr2139 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_lev3_in_logic_expr2141 = new BitSet(new long[]{0x0000080000000010L});
	public static final BitSet FOLLOW_logic_expr_in_logic_expr2143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paren_operator_in_logical_operator2196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_operator_in_logical_operator2206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addition_operator_in_binary_operator2415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_operator_in_binary_operator2425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparative_operator_in_binary_operator2435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_operator_in_binary_operator2445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_list2465 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list2467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail2489 = new BitSet(new long[]{0x0000000861000000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail2491 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail2493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_value2514 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_value_tail_in_value2516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_value_tail2536 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_index_expr_in_value_tail2538 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RBRACK_in_value_tail2540 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_value_tail_tail_in_value_tail2542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_value_tail_tail2566 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_index_expr_in_value_tail_tail2568 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RBRACK_in_value_tail_tail2570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_lev1_in_index_expr2589 = new BitSet(new long[]{0x0000104000000000L});
	public static final BitSet FOLLOW_index_add_expr_in_index_expr2591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_index_expr_in_index_expr_lev12612 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_index_mult_expr_in_index_expr_lev12614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_mult_opr_in_index_mult_expr2666 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_primary_index_expr_in_index_mult_expr2668 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_index_mult_expr_in_index_mult_expr2670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_index_mult_opr2693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_add_opr_in_index_add_expr2715 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_index_expr_lev1_in_index_add_expr2717 = new BitSet(new long[]{0x0000104000000000L});
	public static final BitSet FOLLOW_index_add_expr_in_index_add_expr2719 = new BitSet(new long[]{0x0000000000000002L});
}
