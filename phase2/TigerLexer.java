// $ANTLR 3.5.2 Tiger.g 2015-03-29 22:29:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TigerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TigerLexer() {} 
	public TigerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TigerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Tiger.g"; }

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:118:13: ( 'function' )
			// Tiger.g:118:17: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:119:13: ( 'begin' )
			// Tiger.g:119:17: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEGIN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:120:13: ( 'end' )
			// Tiger.g:120:17: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:121:13: ( 'void' )
			// Tiger.g:121:17: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:122:13: ( 'main' )
			// Tiger.g:122:17: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:123:13: ( 'type' )
			// Tiger.g:123:17: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "ARRAY"
	public final void mARRAY() throws RecognitionException {
		try {
			int _type = ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:124:13: ( 'array' )
			// Tiger.g:124:17: 'array'
			{
			match("array"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY"

	// $ANTLR start "OF"
	public final void mOF() throws RecognitionException {
		try {
			int _type = OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:125:13: ( 'of' )
			// Tiger.g:125:17: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:126:13: ( 'int' )
			// Tiger.g:126:17: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FIXEDPT"
	public final void mFIXEDPT() throws RecognitionException {
		try {
			int _type = FIXEDPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:127:13: ( 'fixedpt' )
			// Tiger.g:127:17: 'fixedpt'
			{
			match("fixedpt"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIXEDPT"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:128:13: ( 'var' )
			// Tiger.g:128:17: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:129:13: ( 'if' )
			// Tiger.g:129:17: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:130:13: ( 'then' )
			// Tiger.g:130:17: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ENDIF"
	public final void mENDIF() throws RecognitionException {
		try {
			int _type = ENDIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:131:13: ( 'endif' )
			// Tiger.g:131:17: 'endif'
			{
			match("endif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDIF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:132:13: ( 'else' )
			// Tiger.g:132:17: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:133:13: ( 'while' )
			// Tiger.g:133:17: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:134:13: ( 'do' )
			// Tiger.g:134:17: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ENDDO"
	public final void mENDDO() throws RecognitionException {
		try {
			int _type = ENDDO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:135:13: ( 'enddo' )
			// Tiger.g:135:17: 'enddo'
			{
			match("enddo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDDO"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:136:13: ( 'for' )
			// Tiger.g:136:17: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "TO"
	public final void mTO() throws RecognitionException {
		try {
			int _type = TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:137:13: ( 'to' )
			// Tiger.g:137:17: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TO"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:138:13: ( 'break' )
			// Tiger.g:138:17: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:139:13: ( 'return' )
			// Tiger.g:139:17: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:142:13: ( ',' )
			// Tiger.g:142:17: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:143:13: ( ':' )
			// Tiger.g:143:17: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:144:13: ( ';' )
			// Tiger.g:144:17: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:145:13: ( '(' )
			// Tiger.g:145:17: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:146:13: ( ')' )
			// Tiger.g:146:17: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:147:13: ( '[' )
			// Tiger.g:147:17: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACK"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:148:13: ( ']' )
			// Tiger.g:148:17: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACK"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:149:13: ( '+' )
			// Tiger.g:149:17: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:150:13: ( '-' )
			// Tiger.g:150:17: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:151:13: ( '*' )
			// Tiger.g:151:17: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:152:13: ( '/' )
			// Tiger.g:152:17: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:153:13: ( '=' )
			// Tiger.g:153:17: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:154:13: ( '<>' )
			// Tiger.g:154:17: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "LESSER"
	public final void mLESSER() throws RecognitionException {
		try {
			int _type = LESSER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:155:13: ( '<' )
			// Tiger.g:155:17: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSER"

	// $ANTLR start "LESSEREQ"
	public final void mLESSEREQ() throws RecognitionException {
		try {
			int _type = LESSEREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:156:13: ( '<=' )
			// Tiger.g:156:17: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSEREQ"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:157:13: ( '>' )
			// Tiger.g:157:17: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER"

	// $ANTLR start "GREATEREQ"
	public final void mGREATEREQ() throws RecognitionException {
		try {
			int _type = GREATEREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:158:14: ( '>=' )
			// Tiger.g:158:18: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATEREQ"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:159:13: ( '&' )
			// Tiger.g:159:17: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:160:13: ( '|' )
			// Tiger.g:160:17: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:161:13: ( ':=' )
			// Tiger.g:161:17: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// Tiger.g:167:5: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) )
			// Tiger.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// Tiger.g:172:5: ( ( '0' .. '9' ) )
			// Tiger.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Digits"
	public final void mDigits() throws RecognitionException {
		try {
			// Tiger.g:176:5: ( ( '0' .. '9' )+ )
			// Tiger.g:176:9: ( '0' .. '9' )+
			{
			// Tiger.g:176:9: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Tiger.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digits"

	// $ANTLR start "NaturalNumber"
	public final void mNaturalNumber() throws RecognitionException {
		try {
			// Tiger.g:180:5: ( ( '1' .. '9' ) )
			// Tiger.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NaturalNumber"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:183:5: ( Letter ( Letter | Digit | '_' )* )
			// Tiger.g:183:9: Letter ( Letter | Digit | '_' )*
			{
			mLetter(); 

			// Tiger.g:183:16: ( Letter | Digit | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Tiger.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "IntegerLiteral"
	public final void mIntegerLiteral() throws RecognitionException {
		try {
			int _type = IntegerLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:187:5: ( '0' | NaturalNumber ( Digit )* )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='0') ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Tiger.g:187:9: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// Tiger.g:187:15: NaturalNumber ( Digit )*
					{
					mNaturalNumber(); 

					// Tiger.g:187:29: ( Digit )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// Tiger.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegerLiteral"

	// $ANTLR start "FixedPointLiteral"
	public final void mFixedPointLiteral() throws RecognitionException {
		try {
			int _type = FixedPointLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:191:5: ( ( IntegerLiteral '.' Digit | Digit Digit | Digit Digit Digit ) )
			// Tiger.g:191:9: ( IntegerLiteral '.' Digit | Digit Digit | Digit Digit Digit )
			{
			// Tiger.g:191:9: ( IntegerLiteral '.' Digit | Digit Digit | Digit Digit Digit )
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='.') ) {
					alt5=1;
				}
				else if ( ((LA5_1 >= '0' && LA5_1 <= '9')) ) {
					int LA5_4 = input.LA(3);
					if ( ((LA5_4 >= '0' && LA5_4 <= '9')) ) {
						alt5=3;
					}

					else {
						alt5=2;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {
				int LA5_2 = input.LA(2);
				if ( ((LA5_2 >= '0' && LA5_2 <= '9')) ) {
					switch ( input.LA(3) ) {
					case '.':
						{
						alt5=1;
						}
						break;
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					case '9':
						{
						int LA5_8 = input.LA(4);
						if ( (LA5_8=='.'||(LA5_8 >= '0' && LA5_8 <= '9')) ) {
							alt5=1;
						}

						else {
							alt5=3;
						}

						}
						break;
					default:
						alt5=2;
					}
				}
				else if ( (LA5_2=='.') ) {
					alt5=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// Tiger.g:191:10: IntegerLiteral '.' Digit
					{
					mIntegerLiteral(); 

					match('.'); 
					mDigit(); 

					}
					break;
				case 2 :
					// Tiger.g:191:37: Digit Digit
					{
					mDigit(); 

					mDigit(); 

					}
					break;
				case 3 :
					// Tiger.g:191:51: Digit Digit Digit
					{
					mDigit(); 

					mDigit(); 

					mDigit(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FixedPointLiteral"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:195:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// Tiger.g:195:9: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// Tiger.g:195:14: ( options {greedy=false; } : . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Tiger.g:195:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:199:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// Tiger.g:199:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// Tiger.g:199:12: (~ ( '\\n' | '\\r' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Tiger.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			// Tiger.g:199:26: ( '\\r' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\r') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Tiger.g:199:26: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:203:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )+ )
			// Tiger.g:203:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )+
			{
			// Tiger.g:203:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||(LA9_0 >= '\f' && LA9_0 <= '\r')||LA9_0==' ') ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Tiger.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// Tiger.g:1:8: ( FUNCTION | BEGIN | END | VOID | MAIN | TYPE | ARRAY | OF | INT | FIXEDPT | VAR | IF | THEN | ENDIF | ELSE | WHILE | DO | ENDDO | FOR | TO | BREAK | RETURN | COMMA | COLON | SEMI | LPAREN | RPAREN | LBRACK | RBRACK | PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ | AND | OR | ASSIGN | Identifier | IntegerLiteral | FixedPointLiteral | COMMENT | LINE_COMMENT | WS )
		int alt10=48;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// Tiger.g:1:10: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 2 :
				// Tiger.g:1:19: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 3 :
				// Tiger.g:1:25: END
				{
				mEND(); 

				}
				break;
			case 4 :
				// Tiger.g:1:29: VOID
				{
				mVOID(); 

				}
				break;
			case 5 :
				// Tiger.g:1:34: MAIN
				{
				mMAIN(); 

				}
				break;
			case 6 :
				// Tiger.g:1:39: TYPE
				{
				mTYPE(); 

				}
				break;
			case 7 :
				// Tiger.g:1:44: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 8 :
				// Tiger.g:1:50: OF
				{
				mOF(); 

				}
				break;
			case 9 :
				// Tiger.g:1:53: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// Tiger.g:1:57: FIXEDPT
				{
				mFIXEDPT(); 

				}
				break;
			case 11 :
				// Tiger.g:1:65: VAR
				{
				mVAR(); 

				}
				break;
			case 12 :
				// Tiger.g:1:69: IF
				{
				mIF(); 

				}
				break;
			case 13 :
				// Tiger.g:1:72: THEN
				{
				mTHEN(); 

				}
				break;
			case 14 :
				// Tiger.g:1:77: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 15 :
				// Tiger.g:1:83: ELSE
				{
				mELSE(); 

				}
				break;
			case 16 :
				// Tiger.g:1:88: WHILE
				{
				mWHILE(); 

				}
				break;
			case 17 :
				// Tiger.g:1:94: DO
				{
				mDO(); 

				}
				break;
			case 18 :
				// Tiger.g:1:97: ENDDO
				{
				mENDDO(); 

				}
				break;
			case 19 :
				// Tiger.g:1:103: FOR
				{
				mFOR(); 

				}
				break;
			case 20 :
				// Tiger.g:1:107: TO
				{
				mTO(); 

				}
				break;
			case 21 :
				// Tiger.g:1:110: BREAK
				{
				mBREAK(); 

				}
				break;
			case 22 :
				// Tiger.g:1:116: RETURN
				{
				mRETURN(); 

				}
				break;
			case 23 :
				// Tiger.g:1:123: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 24 :
				// Tiger.g:1:129: COLON
				{
				mCOLON(); 

				}
				break;
			case 25 :
				// Tiger.g:1:135: SEMI
				{
				mSEMI(); 

				}
				break;
			case 26 :
				// Tiger.g:1:140: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 27 :
				// Tiger.g:1:147: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 28 :
				// Tiger.g:1:154: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 29 :
				// Tiger.g:1:161: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 30 :
				// Tiger.g:1:168: PLUS
				{
				mPLUS(); 

				}
				break;
			case 31 :
				// Tiger.g:1:173: MINUS
				{
				mMINUS(); 

				}
				break;
			case 32 :
				// Tiger.g:1:179: MULT
				{
				mMULT(); 

				}
				break;
			case 33 :
				// Tiger.g:1:184: DIV
				{
				mDIV(); 

				}
				break;
			case 34 :
				// Tiger.g:1:188: EQ
				{
				mEQ(); 

				}
				break;
			case 35 :
				// Tiger.g:1:191: NEQ
				{
				mNEQ(); 

				}
				break;
			case 36 :
				// Tiger.g:1:195: LESSER
				{
				mLESSER(); 

				}
				break;
			case 37 :
				// Tiger.g:1:202: LESSEREQ
				{
				mLESSEREQ(); 

				}
				break;
			case 38 :
				// Tiger.g:1:211: GREATER
				{
				mGREATER(); 

				}
				break;
			case 39 :
				// Tiger.g:1:219: GREATEREQ
				{
				mGREATEREQ(); 

				}
				break;
			case 40 :
				// Tiger.g:1:229: AND
				{
				mAND(); 

				}
				break;
			case 41 :
				// Tiger.g:1:233: OR
				{
				mOR(); 

				}
				break;
			case 42 :
				// Tiger.g:1:236: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 43 :
				// Tiger.g:1:243: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 44 :
				// Tiger.g:1:254: IntegerLiteral
				{
				mIntegerLiteral(); 

				}
				break;
			case 45 :
				// Tiger.g:1:269: FixedPointLiteral
				{
				mFixedPointLiteral(); 

				}
				break;
			case 46 :
				// Tiger.g:1:287: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 47 :
				// Tiger.g:1:295: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 48 :
				// Tiger.g:1:308: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\1\uffff\14\35\1\uffff\1\66\10\uffff\1\71\1\uffff\1\74\1\76\3\uffff\2"+
		"\77\1\uffff\14\35\1\116\1\35\1\120\1\35\1\122\1\35\1\124\1\35\14\uffff"+
		"\1\77\2\35\1\131\2\35\1\136\2\35\1\141\3\35\1\uffff\1\35\1\uffff\1\146"+
		"\1\uffff\1\35\1\uffff\1\35\1\77\2\35\1\uffff\4\35\1\uffff\1\160\1\161"+
		"\1\uffff\1\162\1\163\1\164\1\35\1\uffff\2\35\1\77\2\35\1\172\1\173\1\174"+
		"\1\175\5\uffff\1\176\1\177\3\35\6\uffff\1\u0083\1\35\1\u0085\1\uffff\1"+
		"\u0086\2\uffff";
	static final String DFA10_eofS =
		"\u0087\uffff";
	static final String DFA10_minS =
		"\1\11\1\151\1\145\1\154\2\141\1\150\1\162\2\146\1\150\1\157\1\145\1\uffff"+
		"\1\75\10\uffff\1\52\1\uffff\2\75\3\uffff\2\56\1\uffff\1\156\1\170\1\162"+
		"\1\147\1\145\1\144\1\163\1\151\1\162\1\151\1\160\1\145\1\60\1\162\1\60"+
		"\1\164\1\60\1\151\1\60\1\164\14\uffff\1\56\1\143\1\145\1\60\1\151\1\141"+
		"\1\60\1\145\1\144\1\60\1\156\1\145\1\156\1\uffff\1\141\1\uffff\1\60\1"+
		"\uffff\1\154\1\uffff\1\165\1\56\1\164\1\144\1\uffff\1\156\1\153\1\146"+
		"\1\157\1\uffff\2\60\1\uffff\3\60\1\171\1\uffff\1\145\1\162\1\56\1\151"+
		"\1\160\4\60\5\uffff\2\60\1\156\1\157\1\164\6\uffff\1\60\1\156\1\60\1\uffff"+
		"\1\60\2\uffff";
	static final String DFA10_maxS =
		"\1\174\1\165\1\162\1\156\1\157\1\141\1\171\1\162\1\146\1\156\1\150\1\157"+
		"\1\145\1\uffff\1\75\10\uffff\1\57\1\uffff\1\76\1\75\3\uffff\2\71\1\uffff"+
		"\1\156\1\170\1\162\1\147\1\145\1\144\1\163\1\151\1\162\1\151\1\160\1\145"+
		"\1\172\1\162\1\172\1\164\1\172\1\151\1\172\1\164\14\uffff\1\71\1\143\1"+
		"\145\1\172\1\151\1\141\1\172\1\145\1\144\1\172\1\156\1\145\1\156\1\uffff"+
		"\1\141\1\uffff\1\172\1\uffff\1\154\1\uffff\1\165\1\71\1\164\1\144\1\uffff"+
		"\1\156\1\153\1\146\1\157\1\uffff\2\172\1\uffff\3\172\1\171\1\uffff\1\145"+
		"\1\162\1\71\1\151\1\160\4\172\5\uffff\2\172\1\156\1\157\1\164\6\uffff"+
		"\1\172\1\156\1\172\1\uffff\1\172\2\uffff";
	static final String DFA10_acceptS =
		"\15\uffff\1\27\1\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\uffff"+
		"\1\42\2\uffff\1\50\1\51\1\53\2\uffff\1\60\24\uffff\1\52\1\30\1\56\1\57"+
		"\1\41\1\43\1\45\1\44\1\47\1\46\1\54\1\55\15\uffff\1\24\1\uffff\1\10\1"+
		"\uffff\1\14\1\uffff\1\21\4\uffff\1\23\4\uffff\1\3\2\uffff\1\13\4\uffff"+
		"\1\11\11\uffff\1\17\1\4\1\5\1\6\1\15\5\uffff\1\2\1\25\1\16\1\22\1\7\1"+
		"\20\3\uffff\1\26\1\uffff\1\12\1\1";
	static final String DFA10_specialS =
		"\u0087\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\40\1\uffff\2\40\22\uffff\1\40\5\uffff\1\33\1\uffff\1\20\1\21\1\26"+
			"\1\24\1\15\1\25\1\uffff\1\27\1\36\11\37\1\16\1\17\1\31\1\30\1\32\2\uffff"+
			"\32\35\1\22\1\uffff\1\23\3\uffff\1\7\1\2\1\35\1\13\1\3\1\1\2\35\1\11"+
			"\3\35\1\5\1\35\1\10\2\35\1\14\1\35\1\6\1\35\1\4\1\12\3\35\1\uffff\1\34",
			"\1\42\5\uffff\1\43\5\uffff\1\41",
			"\1\44\14\uffff\1\45",
			"\1\47\1\uffff\1\46",
			"\1\51\15\uffff\1\50",
			"\1\52",
			"\1\54\6\uffff\1\55\11\uffff\1\53",
			"\1\56",
			"\1\57",
			"\1\61\7\uffff\1\60",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"\1\65",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\67\4\uffff\1\70",
			"",
			"\1\73\1\72",
			"\1\75",
			"",
			"",
			"",
			"\1\100\1\uffff\12\100",
			"\1\100\1\uffff\12\101",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\117",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\121",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\123",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\125",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\100\1\uffff\12\126",
			"\1\127",
			"\1\130",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\132",
			"\1\133",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\3\35\1\135\4\35\1\134\21\35",
			"\1\137",
			"\1\140",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\142",
			"\1\143",
			"\1\144",
			"",
			"\1\145",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\147",
			"",
			"\1\150",
			"\1\100\1\uffff\12\151",
			"\1\152",
			"\1\153",
			"",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\165",
			"",
			"\1\166",
			"\1\167",
			"\1\100\1\uffff\12\151",
			"\1\170",
			"\1\171",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\u0084",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( FUNCTION | BEGIN | END | VOID | MAIN | TYPE | ARRAY | OF | INT | FIXEDPT | VAR | IF | THEN | ENDIF | ELSE | WHILE | DO | ENDDO | FOR | TO | BREAK | RETURN | COMMA | COLON | SEMI | LPAREN | RPAREN | LBRACK | RBRACK | PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ | AND | OR | ASSIGN | Identifier | IntegerLiteral | FixedPointLiteral | COMMENT | LINE_COMMENT | WS );";
		}
	}

}
