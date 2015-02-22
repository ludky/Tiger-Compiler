// $ANTLR 3.5.2 Tiger.g 2015-02-22 04:45:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TigerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int AND=4;
	public static final int ARRAY=5;
	public static final int ASSIGN=6;
	public static final int BEGIN=7;
	public static final int BREAK=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int Comment=11;
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
	public static final int LPAREN=34;
	public static final int Letter=35;
	public static final int MAIN=36;
	public static final int MINUS=37;
	public static final int MULT=38;
	public static final int NEQ=39;
	public static final int NatrualNumber=40;
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

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:7:7: ( '[' )
			// Tiger.g:7:9: '['
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:8:7: ( ']' )
			// Tiger.g:8:9: ']'
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
	// $ANTLR end "T__56"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:26:13: ( 'function' )
			// Tiger.g:26:17: 'function'
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
			// Tiger.g:27:13: ( 'begin' )
			// Tiger.g:27:17: 'begin'
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
			// Tiger.g:28:13: ( 'end' )
			// Tiger.g:28:17: 'end'
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
			// Tiger.g:29:13: ( 'void' )
			// Tiger.g:29:17: 'void'
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
			// Tiger.g:30:13: ( 'main' )
			// Tiger.g:30:17: 'main'
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
			// Tiger.g:31:13: ( 'type' )
			// Tiger.g:31:17: 'type'
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
			// Tiger.g:32:13: ( 'array' )
			// Tiger.g:32:17: 'array'
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
			// Tiger.g:33:13: ( 'of' )
			// Tiger.g:33:17: 'of'
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
			// Tiger.g:34:13: ( 'int' )
			// Tiger.g:34:17: 'int'
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
			// Tiger.g:35:13: ( 'fixedpt' )
			// Tiger.g:35:17: 'fixedpt'
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
			// Tiger.g:36:13: ( 'var' )
			// Tiger.g:36:17: 'var'
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
			// Tiger.g:37:13: ( 'if' )
			// Tiger.g:37:17: 'if'
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
			// Tiger.g:38:13: ( 'then' )
			// Tiger.g:38:17: 'then'
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
			// Tiger.g:39:13: ( 'endif' )
			// Tiger.g:39:17: 'endif'
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
			// Tiger.g:40:13: ( 'else' )
			// Tiger.g:40:17: 'else'
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
			// Tiger.g:41:13: ( 'while' )
			// Tiger.g:41:17: 'while'
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
			// Tiger.g:42:13: ( 'do' )
			// Tiger.g:42:17: 'do'
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
			// Tiger.g:43:13: ( 'enddo' )
			// Tiger.g:43:17: 'enddo'
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
			// Tiger.g:44:13: ( 'for' )
			// Tiger.g:44:17: 'for'
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
			// Tiger.g:45:13: ( 'to' )
			// Tiger.g:45:17: 'to'
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
			// Tiger.g:46:13: ( 'break' )
			// Tiger.g:46:17: 'break'
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
			// Tiger.g:47:13: ( 'return' )
			// Tiger.g:47:17: 'return'
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
			// Tiger.g:50:13: ( ',' )
			// Tiger.g:50:17: ','
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
			// Tiger.g:51:13: ( ':' )
			// Tiger.g:51:17: ':'
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
			// Tiger.g:52:13: ( ';' )
			// Tiger.g:52:17: ';'
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
			// Tiger.g:53:13: ( '(' )
			// Tiger.g:53:17: '('
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
			// Tiger.g:54:13: ( ')' )
			// Tiger.g:54:17: ')'
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
			// Tiger.g:55:13: ( '{' )
			// Tiger.g:55:17: '{'
			{
			match('{'); 
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
			// Tiger.g:56:13: ( '}' )
			// Tiger.g:56:17: '}'
			{
			match('}'); 
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
			// Tiger.g:57:13: ( '+' )
			// Tiger.g:57:17: '+'
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
			// Tiger.g:58:13: ( '-' )
			// Tiger.g:58:17: '-'
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
			// Tiger.g:59:13: ( '*' )
			// Tiger.g:59:17: '*'
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
			// Tiger.g:60:13: ( '/' )
			// Tiger.g:60:17: '/'
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
			// Tiger.g:61:13: ( '=' )
			// Tiger.g:61:17: '='
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
			// Tiger.g:62:13: ( '<>' )
			// Tiger.g:62:17: '<>'
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
			// Tiger.g:63:13: ( '<' )
			// Tiger.g:63:17: '<'
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
			// Tiger.g:64:13: ( '<=' )
			// Tiger.g:64:17: '<='
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
			// Tiger.g:65:13: ( '>' )
			// Tiger.g:65:17: '>'
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
			// Tiger.g:66:14: ( '>=' )
			// Tiger.g:66:18: '>='
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
			// Tiger.g:67:13: ( '&' )
			// Tiger.g:67:17: '&'
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
			// Tiger.g:68:13: ( '|' )
			// Tiger.g:68:17: '|'
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
			// Tiger.g:69:13: ( ':=' )
			// Tiger.g:69:17: ':='
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

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:74:5: ( Letter ( Letter | Digit | '_' )* )
			// Tiger.g:74:9: Letter ( Letter | Digit | '_' )*
			{
			mLetter(); 

			// Tiger.g:74:16: ( Letter | Digit | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
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
					break loop1;
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

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// Tiger.g:80:5: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) )
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
			// Tiger.g:85:5: ( ( '0' .. '9' ) )
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
			// Tiger.g:89:5: ( ( '0' .. '9' )+ )
			// Tiger.g:89:9: ( '0' .. '9' )+
			{
			// Tiger.g:89:9: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
			int _type = NaturalNumber;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:92:5: ( ( '1' .. '9' ) )
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NaturalNumber"

	// $ANTLR start "IntegerLiteral"
	public final void mIntegerLiteral() throws RecognitionException {
		try {
			int _type = IntegerLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:96:5: ( '0' | NaturalNumber ( Digit )* )
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
					// Tiger.g:96:9: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// Tiger.g:96:15: NaturalNumber ( Digit )*
					{
					mNaturalNumber(); 

					// Tiger.g:96:29: ( Digit )*
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

	// $ANTLR start "NatrualNumber"
	public final void mNatrualNumber() throws RecognitionException {
		try {
			// Tiger.g:102:5: ( ( '1' .. '9' ) )
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
	// $ANTLR end "NatrualNumber"

	// $ANTLR start "FixedPointLiteral"
	public final void mFixedPointLiteral() throws RecognitionException {
		try {
			int _type = FixedPointLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:105:5: ( ( IntegerLiteral '.' Digit | Digit Digit | Digit Digit Digit ) )
			// Tiger.g:105:9: ( IntegerLiteral '.' Digit | Digit Digit | Digit Digit Digit )
			{
			// Tiger.g:105:9: ( IntegerLiteral '.' Digit | Digit Digit | Digit Digit Digit )
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
					// Tiger.g:105:10: IntegerLiteral '.' Digit
					{
					mIntegerLiteral(); 

					match('.'); 
					mDigit(); 

					}
					break;
				case 2 :
					// Tiger.g:105:37: Digit Digit
					{
					mDigit(); 

					mDigit(); 

					}
					break;
				case 3 :
					// Tiger.g:105:51: Digit Digit Digit
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

	// $ANTLR start "Comment"
	public final void mComment() throws RecognitionException {
		try {
			int _type = Comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Tiger.g:110:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// Tiger.g:110:9: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// Tiger.g:110:14: ( options {greedy=false; } : . )*
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
					// Tiger.g:110:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comment"

	@Override
	public void mTokens() throws RecognitionException {
		// Tiger.g:1:8: ( T__55 | T__56 | FUNCTION | BEGIN | END | VOID | MAIN | TYPE | ARRAY | OF | INT | FIXEDPT | VAR | IF | THEN | ENDIF | ELSE | WHILE | DO | ENDDO | FOR | TO | BREAK | RETURN | COMMA | COLON | SEMI | LPAREN | RPAREN | LBRACK | RBRACK | PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ | AND | OR | ASSIGN | Identifier | NaturalNumber | IntegerLiteral | FixedPointLiteral | Comment )
		int alt7=49;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// Tiger.g:1:10: T__55
				{
				mT__55(); 

				}
				break;
			case 2 :
				// Tiger.g:1:16: T__56
				{
				mT__56(); 

				}
				break;
			case 3 :
				// Tiger.g:1:22: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 4 :
				// Tiger.g:1:31: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 5 :
				// Tiger.g:1:37: END
				{
				mEND(); 

				}
				break;
			case 6 :
				// Tiger.g:1:41: VOID
				{
				mVOID(); 

				}
				break;
			case 7 :
				// Tiger.g:1:46: MAIN
				{
				mMAIN(); 

				}
				break;
			case 8 :
				// Tiger.g:1:51: TYPE
				{
				mTYPE(); 

				}
				break;
			case 9 :
				// Tiger.g:1:56: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 10 :
				// Tiger.g:1:62: OF
				{
				mOF(); 

				}
				break;
			case 11 :
				// Tiger.g:1:65: INT
				{
				mINT(); 

				}
				break;
			case 12 :
				// Tiger.g:1:69: FIXEDPT
				{
				mFIXEDPT(); 

				}
				break;
			case 13 :
				// Tiger.g:1:77: VAR
				{
				mVAR(); 

				}
				break;
			case 14 :
				// Tiger.g:1:81: IF
				{
				mIF(); 

				}
				break;
			case 15 :
				// Tiger.g:1:84: THEN
				{
				mTHEN(); 

				}
				break;
			case 16 :
				// Tiger.g:1:89: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 17 :
				// Tiger.g:1:95: ELSE
				{
				mELSE(); 

				}
				break;
			case 18 :
				// Tiger.g:1:100: WHILE
				{
				mWHILE(); 

				}
				break;
			case 19 :
				// Tiger.g:1:106: DO
				{
				mDO(); 

				}
				break;
			case 20 :
				// Tiger.g:1:109: ENDDO
				{
				mENDDO(); 

				}
				break;
			case 21 :
				// Tiger.g:1:115: FOR
				{
				mFOR(); 

				}
				break;
			case 22 :
				// Tiger.g:1:119: TO
				{
				mTO(); 

				}
				break;
			case 23 :
				// Tiger.g:1:122: BREAK
				{
				mBREAK(); 

				}
				break;
			case 24 :
				// Tiger.g:1:128: RETURN
				{
				mRETURN(); 

				}
				break;
			case 25 :
				// Tiger.g:1:135: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 26 :
				// Tiger.g:1:141: COLON
				{
				mCOLON(); 

				}
				break;
			case 27 :
				// Tiger.g:1:147: SEMI
				{
				mSEMI(); 

				}
				break;
			case 28 :
				// Tiger.g:1:152: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 29 :
				// Tiger.g:1:159: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 30 :
				// Tiger.g:1:166: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 31 :
				// Tiger.g:1:173: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 32 :
				// Tiger.g:1:180: PLUS
				{
				mPLUS(); 

				}
				break;
			case 33 :
				// Tiger.g:1:185: MINUS
				{
				mMINUS(); 

				}
				break;
			case 34 :
				// Tiger.g:1:191: MULT
				{
				mMULT(); 

				}
				break;
			case 35 :
				// Tiger.g:1:196: DIV
				{
				mDIV(); 

				}
				break;
			case 36 :
				// Tiger.g:1:200: EQ
				{
				mEQ(); 

				}
				break;
			case 37 :
				// Tiger.g:1:203: NEQ
				{
				mNEQ(); 

				}
				break;
			case 38 :
				// Tiger.g:1:207: LESSER
				{
				mLESSER(); 

				}
				break;
			case 39 :
				// Tiger.g:1:214: LESSEREQ
				{
				mLESSEREQ(); 

				}
				break;
			case 40 :
				// Tiger.g:1:223: GREATER
				{
				mGREATER(); 

				}
				break;
			case 41 :
				// Tiger.g:1:231: GREATEREQ
				{
				mGREATEREQ(); 

				}
				break;
			case 42 :
				// Tiger.g:1:241: AND
				{
				mAND(); 

				}
				break;
			case 43 :
				// Tiger.g:1:245: OR
				{
				mOR(); 

				}
				break;
			case 44 :
				// Tiger.g:1:248: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 45 :
				// Tiger.g:1:255: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 46 :
				// Tiger.g:1:266: NaturalNumber
				{
				mNaturalNumber(); 

				}
				break;
			case 47 :
				// Tiger.g:1:280: IntegerLiteral
				{
				mIntegerLiteral(); 

				}
				break;
			case 48 :
				// Tiger.g:1:295: FixedPointLiteral
				{
				mFixedPointLiteral(); 

				}
				break;
			case 49 :
				// Tiger.g:1:313: Comment
				{
				mComment(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\3\uffff\14\37\1\uffff\1\67\10\uffff\1\71\1\uffff\1\74\1\76\3\uffff\1"+
		"\77\1\102\14\37\1\117\1\37\1\121\1\37\1\123\1\37\1\125\1\37\12\uffff\1"+
		"\102\2\uffff\2\37\1\132\2\37\1\137\2\37\1\142\3\37\1\uffff\1\37\1\uffff"+
		"\1\147\1\uffff\1\37\1\uffff\1\37\1\102\2\37\1\uffff\4\37\1\uffff\1\161"+
		"\1\162\1\uffff\1\163\1\164\1\165\1\37\1\uffff\2\37\1\102\2\37\1\173\1"+
		"\174\1\175\1\176\5\uffff\1\177\1\u0080\3\37\6\uffff\1\u0084\1\37\1\u0086"+
		"\1\uffff\1\u0087\2\uffff";
	static final String DFA7_eofS =
		"\u0088\uffff";
	static final String DFA7_minS =
		"\1\46\2\uffff\1\151\1\145\1\154\2\141\1\150\1\162\2\146\1\150\1\157\1"+
		"\145\1\uffff\1\75\10\uffff\1\52\1\uffff\2\75\3\uffff\2\56\1\156\1\170"+
		"\1\162\1\147\1\145\1\144\1\163\1\151\1\162\1\151\1\160\1\145\1\60\1\162"+
		"\1\60\1\164\1\60\1\151\1\60\1\164\12\uffff\1\56\2\uffff\1\143\1\145\1"+
		"\60\1\151\1\141\1\60\1\145\1\144\1\60\1\156\1\145\1\156\1\uffff\1\141"+
		"\1\uffff\1\60\1\uffff\1\154\1\uffff\1\165\1\56\1\164\1\144\1\uffff\1\156"+
		"\1\153\1\146\1\157\1\uffff\2\60\1\uffff\3\60\1\171\1\uffff\1\145\1\162"+
		"\1\56\1\151\1\160\4\60\5\uffff\2\60\1\156\1\157\1\164\6\uffff\1\60\1\156"+
		"\1\60\1\uffff\1\60\2\uffff";
	static final String DFA7_maxS =
		"\1\175\2\uffff\1\165\1\162\1\156\1\157\1\141\1\171\1\162\1\146\1\156\1"+
		"\150\1\157\1\145\1\uffff\1\75\10\uffff\1\52\1\uffff\1\76\1\75\3\uffff"+
		"\2\71\1\156\1\170\1\162\1\147\1\145\1\144\1\163\1\151\1\162\1\151\1\160"+
		"\1\145\1\172\1\162\1\172\1\164\1\172\1\151\1\172\1\164\12\uffff\1\71\2"+
		"\uffff\1\143\1\145\1\172\1\151\1\141\1\172\1\145\1\144\1\172\1\156\1\145"+
		"\1\156\1\uffff\1\141\1\uffff\1\172\1\uffff\1\154\1\uffff\1\165\1\71\1"+
		"\164\1\144\1\uffff\1\156\1\153\1\146\1\157\1\uffff\2\172\1\uffff\3\172"+
		"\1\171\1\uffff\1\145\1\162\1\71\1\151\1\160\4\172\5\uffff\2\172\1\156"+
		"\1\157\1\164\6\uffff\1\172\1\156\1\172\1\uffff\1\172\2\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\14\uffff\1\31\1\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1"+
		"\41\1\42\1\uffff\1\44\2\uffff\1\52\1\53\1\55\26\uffff\1\54\1\32\1\61\1"+
		"\43\1\45\1\47\1\46\1\51\1\50\1\56\1\uffff\1\60\1\57\14\uffff\1\26\1\uffff"+
		"\1\12\1\uffff\1\16\1\uffff\1\23\4\uffff\1\25\4\uffff\1\5\2\uffff\1\15"+
		"\4\uffff\1\13\11\uffff\1\21\1\6\1\7\1\10\1\17\5\uffff\1\4\1\27\1\20\1"+
		"\24\1\11\1\22\3\uffff\1\30\1\uffff\1\14\1\3";
	static final String DFA7_specialS =
		"\u0088\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\35\1\uffff\1\22\1\23\1\30\1\26\1\17\1\27\1\uffff\1\31\1\41\11\40\1"+
			"\20\1\21\1\33\1\32\1\34\2\uffff\32\37\1\1\1\uffff\1\2\3\uffff\1\11\1"+
			"\4\1\37\1\15\1\5\1\3\2\37\1\13\3\37\1\7\1\37\1\12\2\37\1\16\1\37\1\10"+
			"\1\37\1\6\1\14\3\37\1\24\1\36\1\25",
			"",
			"",
			"\1\43\5\uffff\1\44\5\uffff\1\42",
			"\1\45\14\uffff\1\46",
			"\1\50\1\uffff\1\47",
			"\1\52\15\uffff\1\51",
			"\1\53",
			"\1\55\6\uffff\1\56\11\uffff\1\54",
			"\1\57",
			"\1\60",
			"\1\62\7\uffff\1\61",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"\1\66",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\70",
			"",
			"\1\73\1\72",
			"\1\75",
			"",
			"",
			"",
			"\1\101\1\uffff\12\100",
			"\1\101\1\uffff\12\101",
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
			"\1\116",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\120",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\122",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\124",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\126",
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
			"\1\101\1\uffff\12\127",
			"",
			"",
			"\1\130",
			"\1\131",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\133",
			"\1\134",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\3\37\1\136\4\37\1\135\21\37",
			"\1\140",
			"\1\141",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\143",
			"\1\144",
			"\1\145",
			"",
			"\1\146",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\150",
			"",
			"\1\151",
			"\1\101\1\uffff\12\152",
			"\1\153",
			"\1\154",
			"",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\166",
			"",
			"\1\167",
			"\1\170",
			"\1\101\1\uffff\12\152",
			"\1\171",
			"\1\172",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u0085",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__55 | T__56 | FUNCTION | BEGIN | END | VOID | MAIN | TYPE | ARRAY | OF | INT | FIXEDPT | VAR | IF | THEN | ENDIF | ELSE | WHILE | DO | ENDDO | FOR | TO | BREAK | RETURN | COMMA | COLON | SEMI | LPAREN | RPAREN | LBRACK | RBRACK | PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ | AND | OR | ASSIGN | Identifier | NaturalNumber | IntegerLiteral | FixedPointLiteral | Comment );";
		}
	}

}
