// $ANTLR 2.7.7 (2006-11-01): "phpOutTheCode.g" -> "PhpOutTheCodeLexer.java"$

  package php.parser.antlr;
  import php.parser.antlr.ParsingState;

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

public class PhpOutTheCodeLexer extends antlr.CharScanner implements PhpOutTheCodeLexerTokenTypes, TokenStream
 {

  private ParsingState state;

  public void setParserState(ParsingState state) {
    this.state = state;
  }
public PhpOutTheCodeLexer(InputStream in) {
	this(new ByteBuffer(in));
}
public PhpOutTheCodeLexer(Reader in) {
	this(new CharBuffer(in));
}
public PhpOutTheCodeLexer(InputBuffer ib) {
	this(new LexerSharedInputState(ib));
}
public PhpOutTheCodeLexer(LexerSharedInputState state) {
	super(state);
	caseSensitiveLiterals = true;
	setCaseSensitive(true);
	literals = new Hashtable();
	literals.put(new ANTLRHashString("public", this), new Integer(29));
	literals.put(new ANTLRHashString("list", this), new Integer(63));
	literals.put(new ANTLRHashString("clone", this), new Integer(26));
	literals.put(new ANTLRHashString("namespace", this), new Integer(31));
	literals.put(new ANTLRHashString("case", this), new Integer(10));
	literals.put(new ANTLRHashString("break", this), new Integer(21));
	literals.put(new ANTLRHashString("while", this), new Integer(5));
	literals.put(new ANTLRHashString("new", this), new Integer(25));
	literals.put(new ANTLRHashString("endif", this), new Integer(49));
	literals.put(new ANTLRHashString("instanceof", this), new Integer(57));
	literals.put(new ANTLRHashString("implements", this), new Integer(38));
	literals.put(new ANTLRHashString("endswitch", this), new Integer(52));
	literals.put(new ANTLRHashString("print", this), new Integer(24));
	literals.put(new ANTLRHashString("and", this), new Integer(53));
	literals.put(new ANTLRHashString("const", this), new Integer(35));
	literals.put(new ANTLRHashString("return", this), new Integer(18));
	literals.put(new ANTLRHashString("foreach", this), new Integer(15));
	literals.put(new ANTLRHashString("throw", this), new Integer(17));
	literals.put(new ANTLRHashString("var", this), new Integer(58));
	literals.put(new ANTLRHashString("require_once", this), new Integer(41));
	literals.put(new ANTLRHashString("protected", this), new Integer(32));
	literals.put(new ANTLRHashString("die", this), new Integer(46));
	literals.put(new ANTLRHashString("class", this), new Integer(28));
	literals.put(new ANTLRHashString("exit", this), new Integer(47));
	literals.put(new ANTLRHashString("do", this), new Integer(6));
	literals.put(new ANTLRHashString("endfor", this), new Integer(50));
	literals.put(new ANTLRHashString("function", this), new Integer(8));
	literals.put(new ANTLRHashString("include", this), new Integer(42));
	literals.put(new ANTLRHashString("elseif", this), new Integer(14));
	literals.put(new ANTLRHashString("global", this), new Integer(62));
	literals.put(new ANTLRHashString("interface", this), new Integer(37));
	literals.put(new ANTLRHashString("final", this), new Integer(34));
	literals.put(new ANTLRHashString("or", this), new Integer(54));
	literals.put(new ANTLRHashString("if", this), new Integer(12));
	literals.put(new ANTLRHashString("as", this), new Integer(56));
	literals.put(new ANTLRHashString("xor", this), new Integer(55));
	literals.put(new ANTLRHashString("catch", this), new Integer(20));
	literals.put(new ANTLRHashString("try", this), new Integer(19));
	literals.put(new ANTLRHashString("require", this), new Integer(40));
	literals.put(new ANTLRHashString("goto", this), new Integer(16));
	literals.put(new ANTLRHashString("declare", this), new Integer(59));
	literals.put(new ANTLRHashString("for", this), new Integer(7));
	literals.put(new ANTLRHashString("extends", this), new Integer(39));
	literals.put(new ANTLRHashString("private", this), new Integer(33));
	literals.put(new ANTLRHashString("define", this), new Integer(44));
	literals.put(new ANTLRHashString("default", this), new Integer(11));
	literals.put(new ANTLRHashString("echo", this), new Integer(45));
	literals.put(new ANTLRHashString("static", this), new Integer(36));
	literals.put(new ANTLRHashString("abstract", this), new Integer(4));
	literals.put(new ANTLRHashString("continue", this), new Integer(22));
	literals.put(new ANTLRHashString("include_once", this), new Integer(43));
	literals.put(new ANTLRHashString("finally", this), new Integer(23));
	literals.put(new ANTLRHashString("else", this), new Integer(13));
	literals.put(new ANTLRHashString("self", this), new Integer(60));
	literals.put(new ANTLRHashString("endwhile", this), new Integer(48));
	literals.put(new ANTLRHashString("void", this), new Integer(27));
	literals.put(new ANTLRHashString("parent", this), new Integer(61));
	literals.put(new ANTLRHashString("switch", this), new Integer(9));
	literals.put(new ANTLRHashString("use", this), new Integer(30));
	literals.put(new ANTLRHashString("endforeach", this), new Integer(51));
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
				if ((LA(1)=='<') && (LA(2)=='?') && (LA(3)=='=')) {
					mPHP_ECHO(true);
					theRetToken=_returnToken;
				}
				else if (((LA(1)=='<') && (LA(2)=='?') && (true))&&(LA(3) != '=')) {
					mSTART_CODE(true);
					theRetToken=_returnToken;
				}
				else {
					mTEXT(true);
					theRetToken=_returnToken;
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

	public final void mPHP_ECHO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PHP_ECHO;
		int _saveIndex;
		
		match("<?=");
		
		state.getSelector().push("codelexer");
		_ttype = LITERAL_echo;
		
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSTART_CODE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = START_CODE;
		int _saveIndex;
		
		if (!(LA(3) != '='))
		  throw new SemanticException("LA(3) != '='");
		match("<?");
		{
		if ((LA(1)=='p')) {
			match("php");
		}
		else {
		}
		
		}
		
		state.getSelector().push("codelexer");
		_ttype = PHP_START;
		
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mANY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ANY;
		int _saveIndex;
		
		if (!(!(LA(1) == '<' && LA(2) == '?')))
		  throw new SemanticException("!(LA(1) == '<' && LA(2) == '?')");
		{
		if ((LA(1)=='\r') && (LA(2)=='\n')) {
			match('\r');
			match('\n');
			newline();
		}
		else if ((LA(1)=='\r') && (true)) {
			match('\r');
			newline();
		}
		else if ((LA(1)=='\n')) {
			match('\n');
			newline();
		}
		else if ((_tokenSet_0.member(LA(1)))) {
			{
			{
			match(_tokenSet_0);
			}
			}
		}
		else {
		}
		
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTEXT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = TEXT;
		int _saveIndex;
		
		{
		{
		_loop13:
		do {
			if ((((LA(1) >= '\u0000' && LA(1) <= '\ufffe')) && (true) && (true))&&(!(LA(1) == '<' && LA(2) == '?'))) {
				{
				if ((LA(1)=='\r') && (LA(2)=='\n') && (true)) {
					match('\r');
					match('\n');
					newline();
				}
				else if ((LA(1)=='\r') && (true) && (true)) {
					match('\r');
					newline();
				}
				else if ((LA(1)=='\n') && (true) && (true)) {
					match('\n');
					newline();
				}
				else if ((LA(1)=='<') && (true) && (true)) {
					match('<');
				}
				else if (((LA(1) >= '\u0000' && LA(1) <= '\ufffe')) && (true) && (true)) {
					{
					matchNot(EOF_CHAR);
					}
				}
				else {
					throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
				}
				
				}
			}
			else {
				break _loop13;
			}
			
		} while (true);
		}
		}
		
		if (new String(text.getBuffer(),_begin,text.length()-_begin).isEmpty() && LA(1) == EOF_CHAR) {
		_ttype = EOF;
		}
		
		{
		if ((LA(1)=='<')) {
			mSTART_CODE(false);
		}
		else {
		}
		
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	
	private static final long[] mk_tokenSet_0() {
		long[] data = new long[2048];
		data[0]=-9217L;
		for (int i = 1; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	
	}
