// $ANTLR 2.7.7 (2006-11-01): "phpLexer.g" -> "PhpLexer.java"$

package php.parser.antlr;

import java.io.InputStream;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.TokenStreamRecognitionException;
import antlr.CharStreamException;
import antlr.CharStreamIOException;
import antlr.ANTLRException;
import java.io.Reader;
import java.util.Hashtable;
import antlr.CharScanner;
import antlr.InputBuffer;
import antlr.ByteBuffer;
import antlr.CharBuffer;
import antlr.Token;
import antlr.CommonToken;
import antlr.RecognitionException;
import antlr.NoViableAltForCharException;
import antlr.MismatchedCharException;
import antlr.TokenStream;
import antlr.ANTLRHashString;
import antlr.LexerSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.SemanticException;

public class PhpLexer extends antlr.CharScanner implements PhpTokenTypes, TokenStream
 {

  private ParsingState state;
  public void setParserState(ParsingState state) {
    this.state = state;
  }
public PhpLexer(InputStream in) {
	this(new ByteBuffer(in));
}
public PhpLexer(Reader in) {
	this(new CharBuffer(in));
}
public PhpLexer(InputBuffer ib) {
	this(new LexerSharedInputState(ib));
}
public PhpLexer(LexerSharedInputState state) {
	super(state);
	caseSensitiveLiterals = false;
	setCaseSensitive(true);
	literals = new Hashtable();
	literals.put(new ANTLRHashString("public", this), new Integer(39));
	literals.put(new ANTLRHashString("list", this), new Integer(75));
	literals.put(new ANTLRHashString("clone", this), new Integer(36));
	literals.put(new ANTLRHashString("namespace", this), new Integer(41));
	literals.put(new ANTLRHashString("case", this), new Integer(10));
	literals.put(new ANTLRHashString("break", this), new Integer(21));
	literals.put(new ANTLRHashString("while", this), new Integer(5));
	literals.put(new ANTLRHashString("new", this), new Integer(35));
	literals.put(new ANTLRHashString("endif", this), new Integer(61));
	literals.put(new ANTLRHashString("object", this), new Integer(29));
	literals.put(new ANTLRHashString("instanceof", this), new Integer(69));
	literals.put(new ANTLRHashString("implements", this), new Integer(48));
	literals.put(new ANTLRHashString("endswitch", this), new Integer(64));
	literals.put(new ANTLRHashString("print", this), new Integer(34));
	literals.put(new ANTLRHashString("and", this), new Integer(65));
	literals.put(new ANTLRHashString("const", this), new Integer(45));
	literals.put(new ANTLRHashString("float", this), new Integer(27));
	literals.put(new ANTLRHashString("return", this), new Integer(18));
	literals.put(new ANTLRHashString("foreach", this), new Integer(15));
	literals.put(new ANTLRHashString("throw", this), new Integer(17));
	literals.put(new ANTLRHashString("var", this), new Integer(70));
	literals.put(new ANTLRHashString("require_once", this), new Integer(51));
	literals.put(new ANTLRHashString("protected", this), new Integer(42));
	literals.put(new ANTLRHashString("die", this), new Integer(58));
	literals.put(new ANTLRHashString("class", this), new Integer(38));
	literals.put(new ANTLRHashString("exit", this), new Integer(59));
	literals.put(new ANTLRHashString("do", this), new Integer(6));
	literals.put(new ANTLRHashString("endfor", this), new Integer(62));
	literals.put(new ANTLRHashString("function", this), new Integer(8));
	literals.put(new ANTLRHashString("include", this), new Integer(52));
	literals.put(new ANTLRHashString("elseif", this), new Integer(14));
	literals.put(new ANTLRHashString("global", this), new Integer(74));
	literals.put(new ANTLRHashString("interface", this), new Integer(47));
	literals.put(new ANTLRHashString("array", this), new Integer(33));
	literals.put(new ANTLRHashString("final", this), new Integer(44));
	literals.put(new ANTLRHashString("or", this), new Integer(66));
	literals.put(new ANTLRHashString("if", this), new Integer(12));
	literals.put(new ANTLRHashString("double", this), new Integer(26));
	literals.put(new ANTLRHashString("as", this), new Integer(68));
	literals.put(new ANTLRHashString("xor", this), new Integer(67));
	literals.put(new ANTLRHashString("catch", this), new Integer(20));
	literals.put(new ANTLRHashString("try", this), new Integer(19));
	literals.put(new ANTLRHashString("require", this), new Integer(50));
	literals.put(new ANTLRHashString("goto", this), new Integer(16));
	literals.put(new ANTLRHashString("declare", this), new Integer(71));
	literals.put(new ANTLRHashString("int", this), new Integer(24));
	literals.put(new ANTLRHashString("for", this), new Integer(7));
	literals.put(new ANTLRHashString("extends", this), new Integer(49));
	literals.put(new ANTLRHashString("boolean", this), new Integer(31));
	literals.put(new ANTLRHashString("private", this), new Integer(43));
	literals.put(new ANTLRHashString("define", this), new Integer(54));
	literals.put(new ANTLRHashString("string", this), new Integer(28));
	literals.put(new ANTLRHashString("default", this), new Integer(11));
	literals.put(new ANTLRHashString("echo", this), new Integer(57));
	literals.put(new ANTLRHashString("false", this), new Integer(56));
	literals.put(new ANTLRHashString("static", this), new Integer(46));
	literals.put(new ANTLRHashString("abstract", this), new Integer(4));
	literals.put(new ANTLRHashString("continue", this), new Integer(22));
	literals.put(new ANTLRHashString("include_once", this), new Integer(53));
	literals.put(new ANTLRHashString("bool", this), new Integer(30));
	literals.put(new ANTLRHashString("finally", this), new Integer(23));
	literals.put(new ANTLRHashString("else", this), new Integer(13));
	literals.put(new ANTLRHashString("self", this), new Integer(72));
	literals.put(new ANTLRHashString("endwhile", this), new Integer(60));
	literals.put(new ANTLRHashString("void", this), new Integer(37));
	literals.put(new ANTLRHashString("parent", this), new Integer(73));
	literals.put(new ANTLRHashString("switch", this), new Integer(9));
	literals.put(new ANTLRHashString("true", this), new Integer(55));
	literals.put(new ANTLRHashString("use", this), new Integer(40));
	literals.put(new ANTLRHashString("long", this), new Integer(25));
	literals.put(new ANTLRHashString("endforeach", this), new Integer(63));
	literals.put(new ANTLRHashString("resource", this), new Integer(32));
}

public Token nextToken() throws TokenStreamException {
	Token theRetToken=null;
tryAgain:
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		resetText();
		try {   // for char stream error handling
			try {   // for lexical error handling
				switch ( LA(1)) {
				case '@':
				{
					mDOG(true);
					theRetToken=_returnToken;
					break;
				}
				case '~':
				{
					mBW_NOT(true);
					theRetToken=_returnToken;
					break;
				}
				case '(':
				{
					mLPAREN(true);
					theRetToken=_returnToken;
					break;
				}
				case ')':
				{
					mRPAREN(true);
					theRetToken=_returnToken;
					break;
				}
				case '{':
				{
					mLCURLY(true);
					theRetToken=_returnToken;
					break;
				}
				case '}':
				{
					mRCURLY(true);
					theRetToken=_returnToken;
					break;
				}
				case '[':
				{
					mLBRACK(true);
					theRetToken=_returnToken;
					break;
				}
				case ']':
				{
					mRBRACK(true);
					theRetToken=_returnToken;
					break;
				}
				case ',':
				{
					mCOMMA(true);
					theRetToken=_returnToken;
					break;
				}
				case ';':
				{
					mSEMI(true);
					theRetToken=_returnToken;
					break;
				}
				case '$':
				{
					mVARIABLE(true);
					theRetToken=_returnToken;
					break;
				}
				case '#':
				{
					mSL_SHARP_COMMENT(true);
					theRetToken=_returnToken;
					break;
				}
				case '\n':  case '\r':
				{
					mNEWLINE(true);
					theRetToken=_returnToken;
					break;
				}
				case ' ':
				{
					mSPACE(true);
					theRetToken=_returnToken;
					break;
				}
				case '\t':
				{
					mTAB(true);
					theRetToken=_returnToken;
					break;
				}
				case '\\':
				{
					mBSLASH(true);
					theRetToken=_returnToken;
					break;
				}
				case '`':
				{
					mEXEC_STRING(true);
					theRetToken=_returnToken;
					break;
				}
				case '"':  case '\'':
				{
					mSTRING(true);
					theRetToken=_returnToken;
					break;
				}
				default:
					if (((LA(1)=='=') && (LA(2)=='=') && (LA(3)=='='))&&(LA(3) == '=')) {
						mIDENTICAL(true);
						theRetToken=_returnToken;
					}
					else if (((LA(1)=='!') && (LA(2)=='=') && (LA(3)=='='))&&(LA(3) == '=')) {
						mNONIDENT(true);
						theRetToken=_returnToken;
					}
					else if (((LA(1)=='<') && (LA(2)=='<') && (LA(3)=='='))&&(LA(3) == '=')) {
						mSHL_ASS(true);
						theRetToken=_returnToken;
					}
					else if (((LA(1)=='>') && (LA(2)=='>') && (LA(3)=='='))&&(LA(3) == '=')) {
						mSHR_ASS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='<') && (LA(2)=='<') && (LA(3)=='<')) {
						mHEREDOC(true);
						theRetToken=_returnToken;
					}
					else if (((LA(1)=='=') && (LA(2)=='=') && (true))&&(LA(3) != '=')) {
						mEQUAL(true);
						theRetToken=_returnToken;
					}
					else if (((LA(1)=='<') && (LA(2)=='=') && (true))&&(LA(2) == '=')) {
						mLE(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='>') && (LA(2)=='=')) {
						mGE(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='!'||LA(1)=='<') && (LA(2)=='='||LA(2)=='>') && (true)) {
						mNE(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='+') && (LA(2)=='=')) {
						mPLUS_ASS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (LA(2)=='=')) {
						mMINUS_ASS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='*') && (LA(2)=='=')) {
						mMULT_ASS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='&') && (LA(2)=='=')) {
						mAND_ASS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='|') && (LA(2)=='=')) {
						mOR_ASS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='^') && (LA(2)=='=')) {
						mXOR_ASS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='/') && (LA(2)=='=')) {
						mDIV_ASS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='.') && (LA(2)=='=')) {
						mDOT_ASS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='%') && (LA(2)=='=')) {
						mMOD_ASS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='&') && (LA(2)=='&')) {
						mLAND(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='+') && (LA(2)=='+')) {
						mINC(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (LA(2)=='-')) {
						mDEC(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (LA(2)=='>')) {
						mMMBR(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)==':') && (LA(2)==':')) {
						mDOUBLECOLON(true);
						theRetToken=_returnToken;
					}
					else if (((LA(1)=='<') && (LA(2)=='<') && (true))&&(LA(3) != '<')) {
						mSHL(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='>') && (LA(2)=='>') && (true)) {
						mSHR(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='|') && (LA(2)=='|')) {
						mLOR(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='=') && (LA(2)=='>')) {
						mASSOCIATE(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='/') && (LA(2)=='/')) {
						mSL_COMMENT(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='/') && (LA(2)=='*')) {
						mML_COMMENT(true);
						theRetToken=_returnToken;
					}
					else if (((LA(1)=='<') && (LA(2)=='?'))&&(LA(3) != '=')) {
						mPHP_START(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='?') && (LA(2)=='>')) {
						mPHP_END(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='<') && (true)) {
						mLESS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='>') && (true)) {
						mGREATER(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='+') && (true)) {
						mPLUS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (true)) {
						mMINUS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='*') && (true)) {
						mASTERISK(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='/') && (true)) {
						mSLASH(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='%') && (true)) {
						mMOD(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='&') && (true)) {
						mBAND(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='=') && (true)) {
						mASSIGN(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='|') && (true)) {
						mBOR(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='^') && (true)) {
						mBXOR(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='?') && (true)) {
						mQUESTION(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)==':') && (true)) {
						mCOLON(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='!') && (true)) {
						mLNOT(true);
						theRetToken=_returnToken;
					}
					else if ((_tokenSet_0.member(LA(1)))) {
						mIDENT(true);
						theRetToken=_returnToken;
					}
					else if ((_tokenSet_1.member(LA(1))) && (true)) {
						mNUMBER(true);
						theRetToken=_returnToken;
					}
				else {
					if (LA(1)==EOF_CHAR) {uponEOF(); _returnToken = makeToken(Token.EOF_TYPE);}
				else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}
				}
				if ( _returnToken==null ) continue tryAgain; // found SKIP token
				_ttype = _returnToken.getType();
				_ttype = testLiteralsTable(_ttype);
				_returnToken.setType(_ttype);
				return _returnToken;
			}
			catch (RecognitionException e) {
				throw new TokenStreamRecognitionException(e);
			}
		}
		catch (CharStreamException cse) {
			if ( cse instanceof CharStreamIOException ) {
				throw new TokenStreamIOException(((CharStreamIOException)cse).io);
			}
			else {
				throw new TokenStreamException(cse.getMessage());
			}
		}
	}
}

	public final void mDOG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DOG;
		int _saveIndex;
		
		match("@");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIDENTICAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IDENTICAL;
		int _saveIndex;
		
		if (!(LA(3) == '='))
		  throw new SemanticException("LA(3) == '='");
		match("===");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEQUAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EQUAL;
		int _saveIndex;
		
		if (!(LA(3) != '='))
		  throw new SemanticException("LA(3) != '='");
		match("==");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLESS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LESS;
		int _saveIndex;
		
		match("<");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mGREATER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = GREATER;
		int _saveIndex;
		
		match(">");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LE;
		int _saveIndex;
		
		if (!(LA(2) == '='))
		  throw new SemanticException("LA(2) == '='");
		match("<=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mGE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = GE;
		int _saveIndex;
		
		match(">=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNONIDENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NONIDENT;
		int _saveIndex;
		
		if (!(LA(3) == '='))
		  throw new SemanticException("LA(3) == '='");
		match("!==");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NE;
		int _saveIndex;
		
		switch ( LA(1)) {
		case '!':
		{
			match("!=");
			break;
		}
		case '<':
		{
			{
			if (!(LA(1) == '<' && LA(2) == '>'))
			  throw new SemanticException("LA(1) == '<' && LA(2) == '>'");
			match("<>");
			}
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPLUS_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PLUS_ASS;
		int _saveIndex;
		
		match("+=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMINUS_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MINUS_ASS;
		int _saveIndex;
		
		match("-=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMULT_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MULT_ASS;
		int _saveIndex;
		
		match("*=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAND_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AND_ASS;
		int _saveIndex;
		
		match("&=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOR_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OR_ASS;
		int _saveIndex;
		
		match("|=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mXOR_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = XOR_ASS;
		int _saveIndex;
		
		match("^=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDIV_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIV_ASS;
		int _saveIndex;
		
		match("/=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSHL_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SHL_ASS;
		int _saveIndex;
		
		if (!(LA(3) == '='))
		  throw new SemanticException("LA(3) == '='");
		match("<<=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSHR_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SHR_ASS;
		int _saveIndex;
		
		if (!(LA(3) == '='))
		  throw new SemanticException("LA(3) == '='");
		match(">>=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDOT_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DOT_ASS;
		int _saveIndex;
		
		match(".=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMOD_ASS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MOD_ASS;
		int _saveIndex;
		
		match("%=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPLUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PLUS;
		int _saveIndex;
		
		match("+");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMINUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MINUS;
		int _saveIndex;
		
		match("-");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mASTERISK(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ASTERISK;
		int _saveIndex;
		
		match("*");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSLASH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SLASH;
		int _saveIndex;
		
		match("/");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMOD(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MOD;
		int _saveIndex;
		
		match("%");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLAND(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LAND;
		int _saveIndex;
		
		match("&&");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mBAND(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BAND;
		int _saveIndex;
		
		match("&");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mINC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INC;
		int _saveIndex;
		
		match("++");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDEC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DEC;
		int _saveIndex;
		
		match("--");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMMBR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MMBR;
		int _saveIndex;
		
		match("->");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDOUBLECOLON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DOUBLECOLON;
		int _saveIndex;
		
		match("::");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSHL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SHL;
		int _saveIndex;
		
		if (!(LA(3) != '<'))
		  throw new SemanticException("LA(3) != '<'");
		match("<<");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSHR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SHR;
		int _saveIndex;
		
		match(">>");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mASSIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ASSIGN;
		int _saveIndex;
		
		match("=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LOR;
		int _saveIndex;
		
		match("||");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mBOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BOR;
		int _saveIndex;
		
		match("|");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mBXOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BXOR;
		int _saveIndex;
		
		match("^");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mBW_NOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BW_NOT;
		int _saveIndex;
		
		match("~");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mQUESTION(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = QUESTION;
		int _saveIndex;
		
		match("?");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLPAREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LPAREN;
		int _saveIndex;
		
		match("(");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRPAREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RPAREN;
		int _saveIndex;
		
		match(")");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLCURLY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LCURLY;
		int _saveIndex;
		
		match("{");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRCURLY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RCURLY;
		int _saveIndex;
		
		match("}");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLBRACK(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LBRACK;
		int _saveIndex;
		
		match("[");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRBRACK(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RBRACK;
		int _saveIndex;
		
		match("]");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCOMMA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COMMA;
		int _saveIndex;
		
		match(",");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSEMI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SEMI;
		int _saveIndex;
		
		match(";");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCOLON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COLON;
		int _saveIndex;
		
		match(":");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mASSOCIATE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ASSOCIATE;
		int _saveIndex;
		
		match("=>");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLNOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LNOT;
		int _saveIndex;
		
		match("!");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mLETTER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LETTER;
		int _saveIndex;
		
		switch ( LA(1)) {
		case 'A':  case 'B':  case 'C':  case 'D':
		case 'E':  case 'F':  case 'G':  case 'H':
		case 'I':  case 'J':  case 'K':  case 'L':
		case 'M':  case 'N':  case 'O':  case 'P':
		case 'Q':  case 'R':  case 'S':  case 'T':
		case 'U':  case 'V':  case 'W':  case 'X':
		case 'Y':  case 'Z':
		{
			{
			matchRange('A','Z');
			}
			break;
		}
		case 'a':  case 'b':  case 'c':  case 'd':
		case 'e':  case 'f':  case 'g':  case 'h':
		case 'i':  case 'j':  case 'k':  case 'l':
		case 'm':  case 'n':  case 'o':  case 'p':
		case 'q':  case 'r':  case 's':  case 't':
		case 'u':  case 'v':  case 'w':  case 'x':
		case 'y':  case 'z':
		{
			{
			matchRange('a','z');
			}
			break;
		}
		case '_':
		{
			{
			match('_');
			}
			break;
		}
		default:
			if (((LA(1) >= '\u007f' && LA(1) <= '\u00ff'))) {
				{
				matchRange('\u007f','\u00ff');
				}
			}
		else {
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mDIGIT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIGIT;
		int _saveIndex;
		
		matchRange('0','9');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mDIGIT_NOZERO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIGIT_NOZERO;
		int _saveIndex;
		
		matchRange('1','9');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mESCAPE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ESCAPE;
		int _saveIndex;
		
		match('\\');
		matchNot(EOF_CHAR);
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mBUCK(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BUCK;
		int _saveIndex;
		
		match("$");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mDOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DOT;
		int _saveIndex;
		
		match(".");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIDENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IDENT;
		int _saveIndex;
		
		{
		mLETTER(false);
		{
		_loop65:
		do {
			if ((_tokenSet_0.member(LA(1)))) {
				mLETTER(false);
			}
			else if (((LA(1) >= '0' && LA(1) <= '9'))) {
				mDIGIT(false);
			}
			else {
				break _loop65;
			}
			
		} while (true);
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mVARIABLE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = VARIABLE;
		int _saveIndex;
		
		boolean synPredMatched68 = false;
		if (((LA(1)=='$') && (LA(2)=='$'||LA(2)=='{') && (true))) {
			int _m68 = mark();
			synPredMatched68 = true;
			inputState.guessing++;
			try {
				{
				mCOMPOUND_VAR_START(false);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched68 = false;
			}
			rewind(_m68);
inputState.guessing--;
		}
		if ( synPredMatched68 ) {
			{
			mCOMPOUND_VAR_START(false);
			if ( inputState.guessing==0 ) {
				_ttype = COMPOUND_VAR_START;
			}
			}
		}
		else if ((LA(1)=='$') && (_tokenSet_2.member(LA(2))) && (true)) {
			{
			mVAR_START(false);
			mIDENT(false);
			}
		}
		else {
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mCOMPOUND_VAR_START(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COMPOUND_VAR_START;
		int _saveIndex;
		
		{
		int _cnt76=0;
		_loop76:
		do {
			if ((LA(1)=='$')) {
				mBUCK(false);
			}
			else {
				if ( _cnt76>=1 ) { break _loop76; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			
			_cnt76++;
		} while (true);
		}
		match("{");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mVAR_START(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = VAR_START;
		int _saveIndex;
		
		{
		int _cnt73=0;
		_loop73:
		do {
			if ((LA(1)=='$')) {
				mBUCK(false);
			}
			else {
				if ( _cnt73>=1 ) { break _loop73; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			
			_cnt73++;
		} while (true);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mHEREDOC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = HEREDOC;
		int _saveIndex;
		
		StringBuilder quoteString = new StringBuilder();
		
		
		match("<<<");
		if ( inputState.guessing==0 ) {
			
			char c = LA(1);
			while (c == ' ' || c == '\t') {
			consume();
			c = LA(1);
			}
			
			while (c != '\n' && c != '\r' && c != EOF) {
			if (!Character.isLetterOrDigit(c) && c != '_') {
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			
			quoteString.append(c);
			consume();
			c = LA(1);
			}
			
				  if ((LA(1)=='\r') && (LA(2)=='\n')) {
			match('\r');
			match('\n');
			newline();
			}
			else if (LA(1) == '\r') {
			match('\r');
			newline();
			}
			else if (LA(1) == '\n') {
			match('\n');
			newline();
			}
			c = LA(1);
			scanHeredoc:
			while (c != EOF) {
			int ndx = 0;
			c = LA(1);
			
			while (ndx < quoteString.length() && quoteString.charAt(ndx) == c) {
			consume();
			ndx += 1;
			c = LA(1);
			
			if (ndx == quoteString.length()) {
			char c2 = LA(2);
			if (!Character.isLetterOrDigit(c2) && c2 != '_') {
			break scanHeredoc; //Finish!
			}
			}
			}
			
			while (LA(1) != EOF) {
			if ((LA(1)=='\r') && (LA(2)=='\n')) {
			match('\r');
			match('\n');
			newline();
			break;
			}
			else if (LA(1) == '\r') {
			match('\r');
			newline();
			break;
			}
			else if (LA(1) == '\n') {
			match('\n');
			newline();
			break;
			}
			else {
			consume();
			}
			}
			
			
			}
			
			if (LA(1) == EOF) {
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mDOUBLE_SLASH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DOUBLE_SLASH;
		int _saveIndex;
		
		if (!(LA(2) == '/'))
		  throw new SemanticException("LA(2) == '/'");
		match("//");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mSHARP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SHARP;
		int _saveIndex;
		
		match('#');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSL_COMMENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SL_COMMENT;
		int _saveIndex;
		
		mDOUBLE_SLASH(false);
		{
		_loop83:
		do {
			if (((LA(1)=='?'))&&(LA(2) != '>')) {
				match('?');
			}
			else if ((_tokenSet_3.member(LA(1)))) {
				{
				match(_tokenSet_3);
				}
			}
			else {
				break _loop83;
			}
			
		} while (true);
		}
		{
		switch ( LA(1)) {
		case '\n':
		{
			match('\n');
			break;
		}
		case '\r':
		{
			match('\r');
			{
			if ((LA(1)=='\n')) {
				match('\n');
			}
			else {
			}
			
			}
			break;
		}
		default:
			{
			}
		}
		}
		if ( inputState.guessing==0 ) {
			
			if (LA(1) != '?') {
			newline();
			}
			_ttype = Token.SKIP;
			
			
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSL_SHARP_COMMENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SL_SHARP_COMMENT;
		int _saveIndex;
		
		mSHARP(false);
		{
		_loop89:
		do {
			if (((LA(1)=='?'))&&(LA(2) != '>')) {
				match('?');
			}
			else if ((_tokenSet_3.member(LA(1)))) {
				{
				match(_tokenSet_3);
				}
			}
			else {
				break _loop89;
			}
			
		} while (true);
		}
		{
		switch ( LA(1)) {
		case '\n':
		{
			match('\n');
			break;
		}
		case '\r':
		{
			match('\r');
			{
			if ((LA(1)=='\n')) {
				match('\n');
			}
			else {
			}
			
			}
			break;
		}
		default:
			{
			}
		}
		}
		if ( inputState.guessing==0 ) {
			
			if (LA(1) != '?') {
			newline();
			}
			_ttype = Token.SKIP;
			
			
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mML_COMMENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ML_COMMENT;
		int _saveIndex;
		
		match("/*");
		{
		_loop95:
		do {
			if (((LA(1)=='*') && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && ((LA(3) >= '\u0000' && LA(3) <= '\ufffe')))&&( LA(2)!='/' )) {
				match('*');
			}
			else if ((LA(1)=='\r') && (LA(2)=='\n') && ((LA(3) >= '\u0000' && LA(3) <= '\ufffe'))) {
				match('\r');
				match('\n');
				if ( inputState.guessing==0 ) {
					_ttype = Token.SKIP; newline();
				}
			}
			else if ((LA(1)=='\r') && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && ((LA(3) >= '\u0000' && LA(3) <= '\ufffe'))) {
				match('\r');
				if ( inputState.guessing==0 ) {
					_ttype = Token.SKIP; newline();
				}
			}
			else if ((LA(1)=='\n')) {
				match('\n');
				if ( inputState.guessing==0 ) {
					_ttype = Token.SKIP; newline();
				}
			}
			else if ((_tokenSet_4.member(LA(1)))) {
				{
				match(_tokenSet_4);
				}
			}
			else {
				break _loop95;
			}
			
		} while (true);
		}
		match("*/");
		if ( inputState.guessing==0 ) {
			_ttype = Token.SKIP;
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNEWLINE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NEWLINE;
		int _saveIndex;
		
		{
		switch ( LA(1)) {
		case '\r':
		{
			match('\r');
			break;
		}
		case '\n':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		match('\n');
		if ( inputState.guessing==0 ) {
			newline(); _ttype = Token.SKIP;
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSPACE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SPACE;
		int _saveIndex;
		
		match(' ');
		if ( inputState.guessing==0 ) {
			_ttype = Token.SKIP;
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTAB(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = TAB;
		int _saveIndex;
		
		match('\t');
		if ( inputState.guessing==0 ) {
			_ttype = Token.SKIP;
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mBSLASH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BSLASH;
		int _saveIndex;
		
		match('\\');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEXEC_STRING(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EXEC_STRING;
		int _saveIndex;
		
		{
		match('`');
		{
		_loop107:
		do {
			if ((((LA(1) >= '\u0000' && LA(1) <= '\ufffe')) && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')))&&( LA(1) != '`')) {
				{
				if ((LA(1)=='\\') && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && ((LA(3) >= '\u0000' && LA(3) <= '\ufffe'))) {
					{
					mESCAPE(false);
					}
				}
				else if ((LA(1)=='\r') && (LA(2)=='\n') && ((LA(3) >= '\u0000' && LA(3) <= '\ufffe'))) {
					match('\r');
					match('\n');
					if ( inputState.guessing==0 ) {
						newline();
					}
				}
				else if ((LA(1)=='\r') && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && (true)) {
					match('\r');
					if ( inputState.guessing==0 ) {
						newline();
					}
				}
				else if ((_tokenSet_5.member(LA(1))) && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && (true)) {
					{
					match(_tokenSet_5);
					}
				}
				else if ((LA(1)=='\n')) {
					match('\n');
					if ( inputState.guessing==0 ) {
						newline();
					}
				}
				else {
					throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
				}
				
				}
			}
			else {
				break _loop107;
			}
			
		} while (true);
		}
		match('`');
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSTRING(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STRING;
		int _saveIndex;
		
		switch ( LA(1)) {
		case '\'':
		{
			{
			match('\'');
			{
			_loop114:
			do {
				if ((((LA(1) >= '\u0000' && LA(1) <= '\ufffe')) && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')))&&( LA(1) != '\'')) {
					{
					if ((LA(1)=='\\') && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && ((LA(3) >= '\u0000' && LA(3) <= '\ufffe'))) {
						{
						mESCAPE(false);
						}
					}
					else if ((LA(1)=='\r') && (LA(2)=='\n') && ((LA(3) >= '\u0000' && LA(3) <= '\ufffe'))) {
						match('\r');
						match('\n');
						if ( inputState.guessing==0 ) {
							newline();
						}
					}
					else if ((LA(1)=='\r') && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && (true)) {
						match('\r');
						if ( inputState.guessing==0 ) {
							newline();
						}
					}
					else if ((_tokenSet_5.member(LA(1))) && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && (true)) {
						{
						match(_tokenSet_5);
						}
					}
					else if ((LA(1)=='\n')) {
						match('\n');
						if ( inputState.guessing==0 ) {
							newline();
						}
					}
					else {
						throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
					}
					
					}
				}
				else {
					break _loop114;
				}
				
			} while (true);
			}
			match('\'');
			}
			break;
		}
		case '"':
		{
			{
			match('"');
			{
			_loop120:
			do {
				if ((((LA(1) >= '\u0000' && LA(1) <= '\ufffe')) && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')))&&( LA(1) != '"')) {
					{
					if ((LA(1)=='\\') && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && ((LA(3) >= '\u0000' && LA(3) <= '\ufffe'))) {
						{
						mESCAPE(false);
						}
					}
					else if ((LA(1)=='\r') && (LA(2)=='\n') && ((LA(3) >= '\u0000' && LA(3) <= '\ufffe'))) {
						match('\r');
						match('\n');
						if ( inputState.guessing==0 ) {
							newline();
						}
					}
					else if ((LA(1)=='\r') && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && (true)) {
						match('\r');
						if ( inputState.guessing==0 ) {
							newline();
						}
					}
					else if ((_tokenSet_5.member(LA(1))) && ((LA(2) >= '\u0000' && LA(2) <= '\ufffe')) && (true)) {
						{
						match(_tokenSet_5);
						}
					}
					else if ((LA(1)=='\n')) {
						match('\n');
						if ( inputState.guessing==0 ) {
							newline();
						}
					}
					else {
						throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
					}
					
					}
				}
				else {
					break _loop120;
				}
				
			} while (true);
			}
			match('"');
			}
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPHP_START(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PHP_START;
		int _saveIndex;
		
		if (!(LA(3) != '='))
		  throw new SemanticException("LA(3) != '='");
		match("<?");
		{
		if ((LA(1)=='P'||LA(1)=='p')) {
			{
			switch ( LA(1)) {
			case 'p':
			{
				match('p');
				break;
			}
			case 'P':
			{
				match('P');
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 'h':
			{
				match('h');
				break;
			}
			case 'H':
			{
				match('H');
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 'p':
			{
				match('p');
				break;
			}
			case 'P':
			{
				match('P');
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
		}
		else {
		}
		
		}
		if ( inputState.guessing==0 ) {
			_ttype = Token.SKIP;
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPHP_END(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PHP_END;
		int _saveIndex;
		
		match("?>");
		if ( inputState.guessing==0 ) {
			
			_ttype = SEMI; //I love this language...
			state.getSelector().pop();
			
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mEXPONENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EXPONENT;
		int _saveIndex;
		
		{
		switch ( LA(1)) {
		case 'e':
		{
			match('e');
			break;
		}
		case 'E':
		{
			match('E');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		switch ( LA(1)) {
		case '+':
		{
			match('+');
			break;
		}
		case '-':
		{
			match('-');
			break;
		}
		case '0':  case '1':  case '2':  case '3':
		case '4':  case '5':  case '6':  case '7':
		case '8':  case '9':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		int _cnt131=0;
		_loop131:
		do {
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				matchRange('0','9');
			}
			else {
				if ( _cnt131>=1 ) { break _loop131; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			
			_cnt131++;
		} while (true);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNUMBER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NUMBER;
		int _saveIndex;
		
		switch ( LA(1)) {
		case '0':
		{
			{
			match('0');
			{
			switch ( LA(1)) {
			case 'X':  case 'x':
			{
				{
				{
				switch ( LA(1)) {
				case 'x':
				{
					match('x');
					break;
				}
				case 'X':
				{
					match('X');
					break;
				}
				default:
				{
					throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
				}
				}
				}
				{
				int _cnt140=0;
				_loop140:
				do {
					switch ( LA(1)) {
					case '0':  case '1':  case '2':  case '3':
					case '4':  case '5':  case '6':  case '7':
					case '8':  case '9':
					{
						{
						mDIGIT(false);
						}
						break;
					}
					case 'A':  case 'B':  case 'C':  case 'D':
					case 'E':  case 'F':  case 'a':  case 'b':
					case 'c':  case 'd':  case 'e':  case 'f':
					{
						{
						switch ( LA(1)) {
						case 'A':  case 'B':  case 'C':  case 'D':
						case 'E':  case 'F':
						{
							matchRange('A','F');
							break;
						}
						case 'a':  case 'b':  case 'c':  case 'd':
						case 'e':  case 'f':
						{
							matchRange('a','f');
							break;
						}
						default:
						{
							throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
						}
						}
						}
						break;
					}
					default:
					{
						if ( _cnt140>=1 ) { break _loop140; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
					}
					}
					_cnt140++;
				} while (true);
				}
				}
				break;
			}
			case '.':
			{
				{
				mDOT(false);
				{
				_loop143:
				do {
					if (((LA(1) >= '0' && LA(1) <= '9'))) {
						mDIGIT(false);
					}
					else {
						break _loop143;
					}
					
				} while (true);
				}
				{
				if ((LA(1)=='E'||LA(1)=='e')) {
					mEXPONENT(false);
				}
				else {
				}
				
				}
				}
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			{
				{
				{
				int _cnt147=0;
				_loop147:
				do {
					if (((LA(1) >= '0' && LA(1) <= '7'))) {
						matchRange('0','7');
					}
					else {
						if ( _cnt147>=1 ) { break _loop147; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
					}
					
					_cnt147++;
				} while (true);
				}
				}
				break;
			}
			default:
				{
				}
			}
			}
			}
			break;
		}
		case '1':  case '2':  case '3':  case '4':
		case '5':  case '6':  case '7':  case '8':
		case '9':
		{
			{
			mDIGIT_NOZERO(false);
			{
			_loop150:
			do {
				if (((LA(1) >= '0' && LA(1) <= '9'))) {
					mDIGIT(false);
				}
				else {
					break _loop150;
				}
				
			} while (true);
			}
			{
			if ((LA(1)=='.')) {
				mDOT(false);
				{
				_loop153:
				do {
					if (((LA(1) >= '0' && LA(1) <= '9'))) {
						mDIGIT(false);
					}
					else {
						break _loop153;
					}
					
				} while (true);
				}
			}
			else {
			}
			
			}
			{
			if ((LA(1)=='E'||LA(1)=='e')) {
				mEXPONENT(false);
			}
			else {
			}
			
			}
			}
			break;
		}
		case '.':
		{
			{
			mDOT(false);
			if ( inputState.guessing==0 ) {
				_ttype = DOT;
			}
			{
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				{
				int _cnt158=0;
				_loop158:
				do {
					if (((LA(1) >= '0' && LA(1) <= '9'))) {
						mDIGIT(false);
					}
					else {
						if ( _cnt158>=1 ) { break _loop158; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
					}
					
					_cnt158++;
				} while (true);
				}
				{
				if ((LA(1)=='E'||LA(1)=='e')) {
					mEXPONENT(false);
				}
				else {
				}
				
				}
				if ( inputState.guessing==0 ) {
					_ttype = NUMBER;
				}
			}
			else {
			}
			
			}
			}
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	
	private static final long[] mk_tokenSet_0() {
		long[] data = new long[1025];
		data[1]=-8646911290859585538L;
		for (int i = 2; i<=3; i++) { data[i]=-1L; }
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = new long[1025];
		data[0]=288019269919178752L;
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = new long[1025];
		data[0]=68719476736L;
		data[1]=-8646911290859585538L;
		for (int i = 2; i<=3; i++) { data[i]=-1L; }
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = new long[2048];
		data[0]=9223372036854766591L;
		for (int i = 1; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = new long[2048];
		data[0]=-4398046520321L;
		for (int i = 1; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = new long[2048];
		data[0]=-9217L;
		for (int i = 1; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	
	}
