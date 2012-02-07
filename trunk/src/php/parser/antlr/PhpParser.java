// $ANTLR 2.7.7 (2006-11-01): "php.g" -> "PhpParser.java"$

package php.parser.antlr;

import php.parser.antlr.ParsingState;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.collections.AST;
import java.util.Hashtable;
import antlr.ASTFactory;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;

public class PhpParser extends antlr.LLkParser       implements PhpParserTokenTypes
 {

  private ParsingState state;

  public void setParserState(ParsingState state) {
    this.state = state;
  }
  private boolean metAbstractModifier;
  private boolean metMMBR;

protected PhpParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public PhpParser(TokenBuffer tokenBuf) {
  this(tokenBuf,2);
}

protected PhpParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public PhpParser(TokenStream lexer) {
  this(lexer,2);
}

public PhpParser(ParserSharedInputState state) {
  super(state,2);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

	public final void program() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST program_AST = null;
		
		try {      // for error handling
			{
			_loop3:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					statement();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop3;
				}
				
			} while (true);
			}
			AST tmp1_AST = null;
			tmp1_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp1_AST);
			match(Token.EOF_TYPE);
			program_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_1);
			} else {
			  throw ex;
			}
		}
		returnAST = program_AST;
	}
	
	public final void statement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST statement_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_if:
			{
				ifStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_switch:
			{
				switchStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_while:
			case COLON:
			{
				whileStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_do:
			{
				doWhileStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_for:
			{
				forStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_foreach:
			{
				foreachStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_echo:
			{
				echoStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_break:
			{
				breakStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_continue:
			{
				continueStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_return:
			{
				returnStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_die:
			{
				dieStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_exit:
			{
				exitStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_goto:
			{
				gotoStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_declare:
			{
				declareStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_throw:
			{
				throwStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_define:
			{
				defineStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_global:
			{
				globalStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_static:
			{
				staticStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_try:
			{
				tryCatchStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case SEMI:
			{
				emptyStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			default:
				if ((_tokenSet_2.member(LA(1))) && (_tokenSet_3.member(LA(2)))) {
					declaration();
					astFactory.addASTChild(currentAST, returnAST);
					statement_AST = (AST)currentAST.root;
				}
				else if ((LA(1)==LCURLY) && (_tokenSet_4.member(LA(2)))) {
					block();
					astFactory.addASTChild(currentAST, returnAST);
					statement_AST = (AST)currentAST.root;
				}
				else if ((_tokenSet_5.member(LA(1))) && (_tokenSet_6.member(LA(2)))) {
					expression(true, true);
					astFactory.addASTChild(currentAST, returnAST);
					AST tmp2_AST = null;
					tmp2_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp2_AST);
					match(SEMI);
					statement_AST = (AST)currentAST.root;
				}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = statement_AST;
	}
	
	public final void declaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST declaration_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_function:
			{
				functionDeclaration();
				astFactory.addASTChild(currentAST, returnAST);
				declaration_AST = (AST)currentAST.root;
				break;
			}
			case IDENT:
			{
				labelDeclaration();
				astFactory.addASTChild(currentAST, returnAST);
				declaration_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_abstract:
			case LITERAL_class:
			{
				classDeclaration();
				astFactory.addASTChild(currentAST, returnAST);
				declaration_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_interface:
			{
				interfaceDeclaration();
				astFactory.addASTChild(currentAST, returnAST);
				declaration_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = declaration_AST;
	}
	
	public final void functionDeclaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionDeclaration_AST = null;
		AST fh_AST = null;
		AST b_AST = null;
		
		try {      // for error handling
			functionHeader();
			fh_AST = (AST)returnAST;
			functionBody();
			b_AST = (AST)returnAST;
			if ( inputState.guessing==0 ) {
				functionDeclaration_AST = (AST)currentAST.root;
				functionDeclaration_AST = (AST)astFactory.make( (new ASTArray(2)).add(fh_AST).add(b_AST));
				currentAST.root = functionDeclaration_AST;
				currentAST.child = functionDeclaration_AST!=null &&functionDeclaration_AST.getFirstChild()!=null ?
					functionDeclaration_AST.getFirstChild() : functionDeclaration_AST;
				currentAST.advanceChildToEnd();
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_8);
			} else {
			  throw ex;
			}
		}
		returnAST = functionDeclaration_AST;
	}
	
	public final void labelDeclaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST labelDeclaration_AST = null;
		
		try {      // for error handling
			AST tmp3_AST = null;
			tmp3_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp3_AST);
			match(IDENT);
			AST tmp4_AST = null;
			tmp4_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp4_AST);
			match(COLON);
			if ( inputState.guessing==0 ) {
				tmp4_AST.setType(LABEL);
			}
			labelDeclaration_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = labelDeclaration_AST;
	}
	
	public final void classDeclaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST classDeclaration_AST = null;
		
		try {      // for error handling
			classModifier();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp5_AST = null;
			tmp5_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp5_AST);
			match(LITERAL_class);
			className();
			astFactory.addASTChild(currentAST, returnAST);
			{
			switch ( LA(1)) {
			case LITERAL_extends:
			{
				{
				extendsList();
				astFactory.addASTChild(currentAST, returnAST);
				{
				switch ( LA(1)) {
				case LITERAL_implements:
				{
					implementsList();
					astFactory.addASTChild(currentAST, returnAST);
					break;
				}
				case LCURLY:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				}
				break;
			}
			case LITERAL_implements:
			{
				{
				implementsList();
				astFactory.addASTChild(currentAST, returnAST);
				{
				switch ( LA(1)) {
				case LITERAL_extends:
				{
					extendsList();
					astFactory.addASTChild(currentAST, returnAST);
					break;
				}
				case LCURLY:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				}
				break;
			}
			case LCURLY:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			classBody();
			astFactory.addASTChild(currentAST, returnAST);
			classDeclaration_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = classDeclaration_AST;
	}
	
	public final void interfaceDeclaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST interfaceDeclaration_AST = null;
		
		try {      // for error handling
			AST tmp6_AST = null;
			tmp6_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp6_AST);
			match(LITERAL_interface);
			className();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop136:
			do {
				switch ( LA(1)) {
				case LITERAL_implements:
				{
					implementsList();
					astFactory.addASTChild(currentAST, returnAST);
					break;
				}
				case LITERAL_extends:
				{
					extendsMultiList();
					astFactory.addASTChild(currentAST, returnAST);
					break;
				}
				default:
				{
					break _loop136;
				}
				}
			} while (true);
			}
			interfaceBody();
			astFactory.addASTChild(currentAST, returnAST);
			interfaceDeclaration_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = interfaceDeclaration_AST;
	}
	
	public final void ifStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST ifStatement_AST = null;
		
		try {      // for error handling
			AST tmp7_AST = null;
			tmp7_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp7_AST);
			match(LITERAL_if);
			AST tmp8_AST = null;
			tmp8_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp8_AST);
			match(LPAREN);
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp9_AST = null;
			tmp9_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp9_AST);
			match(RPAREN);
			{
			boolean synPredMatched14 = false;
			if (((LA(1)==COLON) && (_tokenSet_9.member(LA(2))))) {
				int _m14 = mark();
				synPredMatched14 = true;
				inputState.guessing++;
				try {
					{
					match(COLON);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched14 = false;
				}
				rewind(_m14);
inputState.guessing--;
			}
			if ( synPredMatched14 ) {
				{
				colonStatementList();
				astFactory.addASTChild(currentAST, returnAST);
				{
				_loop17:
				do {
					if ((LA(1)==LITERAL_elseif)) {
						elseifColonStatement();
						astFactory.addASTChild(currentAST, returnAST);
					}
					else {
						break _loop17;
					}
					
				} while (true);
				}
				{
				switch ( LA(1)) {
				case LITERAL_else:
				{
					elseColonStatement();
					astFactory.addASTChild(currentAST, returnAST);
					break;
				}
				case LITERAL_endif:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				AST tmp10_AST = null;
				tmp10_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp10_AST);
				match(LITERAL_endif);
				AST tmp11_AST = null;
				tmp11_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp11_AST);
				match(SEMI);
				}
			}
			else if ((_tokenSet_0.member(LA(1))) && (_tokenSet_10.member(LA(2)))) {
				{
				statement();
				astFactory.addASTChild(currentAST, returnAST);
				{
				_loop21:
				do {
					if ((LA(1)==LITERAL_elseif) && (LA(2)==LPAREN)) {
						elseifStatement();
						astFactory.addASTChild(currentAST, returnAST);
					}
					else {
						break _loop21;
					}
					
				} while (true);
				}
				{
				if ((LA(1)==LITERAL_else) && (_tokenSet_0.member(LA(2)))) {
					elseStatement();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else if ((_tokenSet_7.member(LA(1))) && (_tokenSet_11.member(LA(2)))) {
				}
				else {
					throw new NoViableAltException(LT(1), getFilename());
				}
				
				}
				}
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			ifStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = ifStatement_AST;
	}
	
	public final void switchStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST switchStatement_AST = null;
		
		try {      // for error handling
			AST tmp12_AST = null;
			tmp12_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp12_AST);
			match(LITERAL_switch);
			AST tmp13_AST = null;
			tmp13_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp13_AST);
			match(LPAREN);
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp14_AST = null;
			tmp14_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp14_AST);
			match(RPAREN);
			switchBody();
			astFactory.addASTChild(currentAST, returnAST);
			switchStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = switchStatement_AST;
	}
	
	public final void whileStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST whileStatement_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_while:
			{
				AST tmp15_AST = null;
				tmp15_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp15_AST);
				match(LITERAL_while);
				AST tmp16_AST = null;
				tmp16_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp16_AST);
				match(LPAREN);
				expression(true, true);
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp17_AST = null;
				tmp17_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp17_AST);
				match(RPAREN);
				{
				statement();
				astFactory.addASTChild(currentAST, returnAST);
				}
				whileStatement_AST = (AST)currentAST.root;
				break;
			}
			case COLON:
			{
				{
				colonStatementList();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp18_AST = null;
				tmp18_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp18_AST);
				match(LITERAL_endwhile);
				AST tmp19_AST = null;
				tmp19_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp19_AST);
				match(SEMI);
				}
				whileStatement_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = whileStatement_AST;
	}
	
	public final void doWhileStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST doWhileStatement_AST = null;
		
		try {      // for error handling
			AST tmp20_AST = null;
			tmp20_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp20_AST);
			match(LITERAL_do);
			statement();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp21_AST = null;
			tmp21_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp21_AST);
			match(LITERAL_while);
			AST tmp22_AST = null;
			tmp22_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp22_AST);
			match(LPAREN);
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp23_AST = null;
			tmp23_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp23_AST);
			match(RPAREN);
			doWhileStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = doWhileStatement_AST;
	}
	
	public final void forStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST forStatement_AST = null;
		
		try {      // for error handling
			AST tmp24_AST = null;
			tmp24_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp24_AST);
			match(LITERAL_for);
			AST tmp25_AST = null;
			tmp25_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp25_AST);
			match(LPAREN);
			{
			switch ( LA(1)) {
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_list:
			case DOG:
			case PLUS:
			case MINUS:
			case BAND:
			case INC:
			case DEC:
			case LPAREN:
			case LCURLY:
			case LNOT:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case BNOT:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				expression(true, true);
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case SEMI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			AST tmp26_AST = null;
			tmp26_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp26_AST);
			match(SEMI);
			{
			switch ( LA(1)) {
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_list:
			case DOG:
			case PLUS:
			case MINUS:
			case BAND:
			case INC:
			case DEC:
			case LPAREN:
			case LCURLY:
			case LNOT:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case BNOT:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				expression(true, true);
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case SEMI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			AST tmp27_AST = null;
			tmp27_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp27_AST);
			match(SEMI);
			{
			switch ( LA(1)) {
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_list:
			case DOG:
			case PLUS:
			case MINUS:
			case BAND:
			case INC:
			case DEC:
			case LPAREN:
			case LCURLY:
			case LNOT:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case BNOT:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				expression(true, true);
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case RPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			AST tmp28_AST = null;
			tmp28_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp28_AST);
			match(RPAREN);
			{
			boolean synPredMatched93 = false;
			if (((LA(1)==COLON) && (_tokenSet_12.member(LA(2))))) {
				int _m93 = mark();
				synPredMatched93 = true;
				inputState.guessing++;
				try {
					{
					match(COLON);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched93 = false;
				}
				rewind(_m93);
inputState.guessing--;
			}
			if ( synPredMatched93 ) {
				{
				colonStatementList();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp29_AST = null;
				tmp29_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp29_AST);
				match(LITERAL_endfor);
				AST tmp30_AST = null;
				tmp30_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp30_AST);
				match(SEMI);
				}
			}
			else if ((_tokenSet_0.member(LA(1))) && (_tokenSet_10.member(LA(2)))) {
				statement();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			forStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = forStatement_AST;
	}
	
	public final void foreachStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST foreachStatement_AST = null;
		
		try {      // for error handling
			AST tmp31_AST = null;
			tmp31_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp31_AST);
			match(LITERAL_foreach);
			AST tmp32_AST = null;
			tmp32_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp32_AST);
			match(LPAREN);
			foreachCondition();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp33_AST = null;
			tmp33_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp33_AST);
			match(RPAREN);
			{
			boolean synPredMatched98 = false;
			if (((LA(1)==COLON) && (_tokenSet_13.member(LA(2))))) {
				int _m98 = mark();
				synPredMatched98 = true;
				inputState.guessing++;
				try {
					{
					match(COLON);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched98 = false;
				}
				rewind(_m98);
inputState.guessing--;
			}
			if ( synPredMatched98 ) {
				{
				colonStatementList();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp34_AST = null;
				tmp34_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp34_AST);
				match(LITERAL_endforeach);
				AST tmp35_AST = null;
				tmp35_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp35_AST);
				match(SEMI);
				}
			}
			else if ((_tokenSet_0.member(LA(1))) && (_tokenSet_10.member(LA(2)))) {
				statement();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			foreachStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = foreachStatement_AST;
	}
	
	public final void echoStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST echoStatement_AST = null;
		
		try {      // for error handling
			AST tmp36_AST = null;
			tmp36_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp36_AST);
			match(LITERAL_echo);
			{
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			}
			AST tmp37_AST = null;
			tmp37_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp37_AST);
			match(SEMI);
			echoStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = echoStatement_AST;
	}
	
	public final void breakStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST breakStatement_AST = null;
		
		try {      // for error handling
			AST tmp38_AST = null;
			tmp38_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp38_AST);
			match(LITERAL_break);
			{
			switch ( LA(1)) {
			case NUMBER:
			{
				AST tmp39_AST = null;
				tmp39_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp39_AST);
				match(NUMBER);
				break;
			}
			case SEMI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			AST tmp40_AST = null;
			tmp40_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp40_AST);
			match(SEMI);
			breakStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = breakStatement_AST;
	}
	
	public final void continueStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST continueStatement_AST = null;
		
		try {      // for error handling
			AST tmp41_AST = null;
			tmp41_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp41_AST);
			match(LITERAL_continue);
			{
			switch ( LA(1)) {
			case NUMBER:
			{
				AST tmp42_AST = null;
				tmp42_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp42_AST);
				match(NUMBER);
				break;
			}
			case SEMI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			AST tmp43_AST = null;
			tmp43_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp43_AST);
			match(SEMI);
			continueStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = continueStatement_AST;
	}
	
	public final void returnStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST returnStatement_AST = null;
		
		try {      // for error handling
			AST tmp44_AST = null;
			tmp44_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp44_AST);
			match(LITERAL_return);
			{
			switch ( LA(1)) {
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_list:
			case DOG:
			case PLUS:
			case MINUS:
			case BAND:
			case INC:
			case DEC:
			case LPAREN:
			case LCURLY:
			case LNOT:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case BNOT:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				expression(true, true);
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case SEMI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			AST tmp45_AST = null;
			tmp45_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp45_AST);
			match(SEMI);
			returnStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = returnStatement_AST;
	}
	
	public final void dieStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST dieStatement_AST = null;
		
		try {      // for error handling
			AST tmp46_AST = null;
			tmp46_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp46_AST);
			match(LITERAL_die);
			AST tmp47_AST = null;
			tmp47_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp47_AST);
			match(LPAREN);
			{
			switch ( LA(1)) {
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_list:
			case DOG:
			case PLUS:
			case MINUS:
			case BAND:
			case INC:
			case DEC:
			case LPAREN:
			case LCURLY:
			case LNOT:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case BNOT:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				expression(true, true);
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case RPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			AST tmp48_AST = null;
			tmp48_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp48_AST);
			match(RPAREN);
			AST tmp49_AST = null;
			tmp49_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp49_AST);
			match(SEMI);
			dieStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = dieStatement_AST;
	}
	
	public final void exitStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exitStatement_AST = null;
		
		try {      // for error handling
			AST tmp50_AST = null;
			tmp50_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp50_AST);
			match(LITERAL_exit);
			{
			if ((LA(1)==LPAREN) && (LA(2)==RPAREN)) {
				AST tmp51_AST = null;
				tmp51_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp51_AST);
				match(LPAREN);
				AST tmp52_AST = null;
				tmp52_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp52_AST);
				match(RPAREN);
			}
			else if ((_tokenSet_7.member(LA(1))) && (_tokenSet_11.member(LA(2)))) {
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			exitStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = exitStatement_AST;
	}
	
	public final void gotoStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST gotoStatement_AST = null;
		
		try {      // for error handling
			AST tmp53_AST = null;
			tmp53_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp53_AST);
			match(LITERAL_goto);
			AST tmp54_AST = null;
			tmp54_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp54_AST);
			match(IDENT);
			AST tmp55_AST = null;
			tmp55_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp55_AST);
			match(SEMI);
			gotoStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = gotoStatement_AST;
	}
	
	public final void declareStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST declareStatement_AST = null;
		
		try {      // for error handling
			AST tmp56_AST = null;
			tmp56_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp56_AST);
			match(LITERAL_declare);
			AST tmp57_AST = null;
			tmp57_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp57_AST);
			match(LPAREN);
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp58_AST = null;
			tmp58_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp58_AST);
			match(RPAREN);
			statement();
			astFactory.addASTChild(currentAST, returnAST);
			declareStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = declareStatement_AST;
	}
	
	public final void throwStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST throwStatement_AST = null;
		
		try {      // for error handling
			AST tmp59_AST = null;
			tmp59_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp59_AST);
			match(LITERAL_throw);
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp60_AST = null;
			tmp60_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp60_AST);
			match(SEMI);
			throwStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = throwStatement_AST;
	}
	
	public final void defineStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST defineStatement_AST = null;
		
		try {      // for error handling
			AST tmp61_AST = null;
			tmp61_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp61_AST);
			match(LITERAL_define);
			AST tmp62_AST = null;
			tmp62_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp62_AST);
			match(LPAREN);
			expression(true, false);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp63_AST = null;
			tmp63_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp63_AST);
			match(COMMA);
			expression(true, false);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp64_AST = null;
			tmp64_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp64_AST);
			match(RPAREN);
			AST tmp65_AST = null;
			tmp65_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp65_AST);
			match(SEMI);
			defineStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = defineStatement_AST;
	}
	
	public final void globalStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST globalStatement_AST = null;
		
		try {      // for error handling
			AST tmp66_AST = null;
			tmp66_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp66_AST);
			match(LITERAL_global);
			identifier();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop34:
			do {
				if ((LA(1)==COMMA)) {
					AST tmp67_AST = null;
					tmp67_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp67_AST);
					match(COMMA);
					identifier();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop34;
				}
				
			} while (true);
			}
			AST tmp68_AST = null;
			tmp68_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp68_AST);
			match(SEMI);
			globalStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = globalStatement_AST;
	}
	
	public final void staticStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST staticStatement_AST = null;
		
		try {      // for error handling
			AST tmp69_AST = null;
			tmp69_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp69_AST);
			match(LITERAL_static);
			staticVarDefinition();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop37:
			do {
				if ((LA(1)==COMMA)) {
					AST tmp70_AST = null;
					tmp70_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp70_AST);
					match(COMMA);
					staticVarDefinition();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop37;
				}
				
			} while (true);
			}
			AST tmp71_AST = null;
			tmp71_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp71_AST);
			match(SEMI);
			staticStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = staticStatement_AST;
	}
	
	public final void tryCatchStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST tryCatchStatement_AST = null;
		
		try {      // for error handling
			AST tmp72_AST = null;
			tmp72_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp72_AST);
			match(LITERAL_try);
			block();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop71:
			do {
				if ((LA(1)==LITERAL_catch)) {
					catchBlock();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop71;
				}
				
			} while (true);
			}
			{
			switch ( LA(1)) {
			case LITERAL_finally:
			{
				finallyBlock();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case EOF:
			case LITERAL_abstract:
			case LITERAL_while:
			case LITERAL_do:
			case LITERAL_for:
			case LITERAL_function:
			case LITERAL_switch:
			case LITERAL_case:
			case LITERAL_default:
			case LITERAL_if:
			case LITERAL_else:
			case LITERAL_elseif:
			case LITERAL_foreach:
			case LITERAL_goto:
			case LITERAL_throw:
			case LITERAL_return:
			case LITERAL_try:
			case LITERAL_break:
			case LITERAL_continue:
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_class:
			case LITERAL_static:
			case LITERAL_interface:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_define:
			case LITERAL_echo:
			case LITERAL_die:
			case LITERAL_exit:
			case LITERAL_endwhile:
			case LITERAL_endif:
			case LITERAL_endfor:
			case LITERAL_endforeach:
			case LITERAL_declare:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_global:
			case LITERAL_list:
			case DOG:
			case PLUS:
			case MINUS:
			case BAND:
			case INC:
			case DEC:
			case LPAREN:
			case LCURLY:
			case RCURLY:
			case SEMI:
			case COLON:
			case LNOT:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case BNOT:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			tryCatchStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = tryCatchStatement_AST;
	}
	
	public final void emptyStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST emptyStatement_AST = null;
		
		try {      // for error handling
			AST tmp73_AST = null;
			tmp73_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp73_AST);
			match(SEMI);
			emptyStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = emptyStatement_AST;
	}
	
	public final void block() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST block_AST = null;
		
		try {      // for error handling
			AST tmp74_AST = null;
			tmp74_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp74_AST);
			match(LCURLY);
			if ( inputState.guessing==0 ) {
				tmp74_AST.setType(SLIST);
			}
			{
			_loop10:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					statement();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop10;
				}
				
			} while (true);
			}
			AST tmp75_AST = null;
			tmp75_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp75_AST);
			match(RCURLY);
			block_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_14);
			} else {
			  throw ex;
			}
		}
		returnAST = block_AST;
	}
	
	public final void expression(
		boolean imagNode, boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST expression_AST = null;
		
		try {      // for error handling
			{
			if (((_tokenSet_5.member(LA(1))) && (_tokenSet_15.member(LA(2))))&&(allowComma)) {
				logicalOrExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				{
				_loop180:
				do {
					if ((LA(1)==COMMA) && (_tokenSet_5.member(LA(2)))) {
						AST tmp76_AST = null;
						tmp76_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp76_AST);
						match(COMMA);
						logicalOrExpression(allowComma);
						astFactory.addASTChild(currentAST, returnAST);
					}
					else {
						break _loop180;
					}
					
				} while (true);
				}
			}
			else if ((_tokenSet_5.member(LA(1))) && (_tokenSet_15.member(LA(2)))) {
				logicalOrExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			if ( inputState.guessing==0 ) {
				expression_AST = (AST)currentAST.root;
				
				if(imagNode) {
				expression_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(EXPR,"EXPR")).add(expression_AST));
				}
				
				currentAST.root = expression_AST;
				currentAST.child = expression_AST!=null &&expression_AST.getFirstChild()!=null ?
					expression_AST.getFirstChild() : expression_AST;
				currentAST.advanceChildToEnd();
			}
			expression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = expression_AST;
	}
	
	public final void colonStatementList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST colonStatementList_AST = null;
		Token  cln = null;
		AST cln_AST = null;
		
		try {      // for error handling
			cln = LT(1);
			cln_AST = astFactory.create(cln);
			astFactory.makeASTRoot(currentAST, cln_AST);
			match(COLON);
			if ( inputState.guessing==0 ) {
				cln_AST.setType(COLON_SLIST);
			}
			{
			_loop29:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					statement();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop29;
				}
				
			} while (true);
			}
			colonStatementList_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_17);
			} else {
			  throw ex;
			}
		}
		returnAST = colonStatementList_AST;
	}
	
	public final void elseifColonStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elseifColonStatement_AST = null;
		
		try {      // for error handling
			AST tmp77_AST = null;
			tmp77_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp77_AST);
			match(LITERAL_elseif);
			AST tmp78_AST = null;
			tmp78_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp78_AST);
			match(LPAREN);
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp79_AST = null;
			tmp79_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp79_AST);
			match(RPAREN);
			colonStatementList();
			astFactory.addASTChild(currentAST, returnAST);
			elseifColonStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = elseifColonStatement_AST;
	}
	
	public final void elseColonStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elseColonStatement_AST = null;
		
		try {      // for error handling
			AST tmp80_AST = null;
			tmp80_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp80_AST);
			match(LITERAL_else);
			colonStatementList();
			astFactory.addASTChild(currentAST, returnAST);
			elseColonStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_19);
			} else {
			  throw ex;
			}
		}
		returnAST = elseColonStatement_AST;
	}
	
	public final void elseifStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elseifStatement_AST = null;
		
		try {      // for error handling
			AST tmp81_AST = null;
			tmp81_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp81_AST);
			match(LITERAL_elseif);
			AST tmp82_AST = null;
			tmp82_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp82_AST);
			match(LPAREN);
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp83_AST = null;
			tmp83_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp83_AST);
			match(RPAREN);
			statement();
			astFactory.addASTChild(currentAST, returnAST);
			elseifStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = elseifStatement_AST;
	}
	
	public final void elseStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elseStatement_AST = null;
		
		try {      // for error handling
			AST tmp84_AST = null;
			tmp84_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp84_AST);
			match(LITERAL_else);
			statement();
			astFactory.addASTChild(currentAST, returnAST);
			elseStatement_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = elseStatement_AST;
	}
	
	public final void switchBody() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST switchBody_AST = null;
		
		boolean defaultIsMet = false;
		
		
		try {      // for error handling
			AST tmp85_AST = null;
			tmp85_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp85_AST);
			match(LCURLY);
			{
			_loop42:
			do {
				if ((LA(1)==LITERAL_case)) {
					caseOption();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else if (((LA(1)==LITERAL_default))&&(!defaultIsMet)) {
					defaultOption();
					astFactory.addASTChild(currentAST, returnAST);
					if ( inputState.guessing==0 ) {
						
						defaultIsMet = true;
						
					}
				}
				else {
					break _loop42;
				}
				
			} while (true);
			}
			AST tmp86_AST = null;
			tmp86_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp86_AST);
			match(RCURLY);
			switchBody_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = switchBody_AST;
	}
	
	public final void identifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST identifier_AST = null;
		AST id_AST = null;
		
		try {      // for error handling
			scopeResolutionExpression();
			id_AST = (AST)returnAST;
			if ( inputState.guessing==0 ) {
				identifier_AST = (AST)currentAST.root;
				identifier_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(IDENTIFIER,"IDENTIFIER")).add(id_AST));
				currentAST.root = identifier_AST;
				currentAST.child = identifier_AST!=null &&identifier_AST.getFirstChild()!=null ?
					identifier_AST.getFirstChild() : identifier_AST;
				currentAST.advanceChildToEnd();
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_20);
			} else {
			  throw ex;
			}
		}
		returnAST = identifier_AST;
	}
	
	public final void staticVarDefinition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST staticVarDefinition_AST = null;
		
		try {      // for error handling
			identifier();
			astFactory.addASTChild(currentAST, returnAST);
			{
			switch ( LA(1)) {
			case ASSIGN:
			{
				AST tmp87_AST = null;
				tmp87_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp87_AST);
				match(ASSIGN);
				expression(true, false);
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case COMMA:
			case SEMI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			staticVarDefinition_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_21);
			} else {
			  throw ex;
			}
		}
		returnAST = staticVarDefinition_AST;
	}
	
	public final void caseOption() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST caseOption_AST = null;
		
		try {      // for error handling
			AST tmp88_AST = null;
			tmp88_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp88_AST);
			match(LITERAL_case);
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			{
			switch ( LA(1)) {
			case COLON:
			{
				AST tmp89_AST = null;
				tmp89_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp89_AST);
				match(COLON);
				break;
			}
			case SEMI:
			{
				AST tmp90_AST = null;
				tmp90_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp90_AST);
				match(SEMI);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			_loop46:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					statement();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop46;
				}
				
			} while (true);
			}
			caseOption_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_22);
			} else {
			  throw ex;
			}
		}
		returnAST = caseOption_AST;
	}
	
	public final void defaultOption() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST defaultOption_AST = null;
		
		try {      // for error handling
			AST tmp91_AST = null;
			tmp91_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp91_AST);
			match(LITERAL_default);
			{
			switch ( LA(1)) {
			case COLON:
			{
				AST tmp92_AST = null;
				tmp92_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp92_AST);
				match(COLON);
				break;
			}
			case SEMI:
			{
				AST tmp93_AST = null;
				tmp93_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp93_AST);
				match(SEMI);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			_loop50:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					statement();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop50;
				}
				
			} while (true);
			}
			defaultOption_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_22);
			} else {
			  throw ex;
			}
		}
		returnAST = defaultOption_AST;
	}
	
	public final void requireStatementExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST requireStatementExpression_AST = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_require:
			{
				AST tmp94_AST = null;
				tmp94_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp94_AST);
				match(LITERAL_require);
				break;
			}
			case LITERAL_require_once:
			{
				AST tmp95_AST = null;
				tmp95_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp95_AST);
				match(LITERAL_require_once);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			}
			requireStatementExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = requireStatementExpression_AST;
	}
	
	public final void includeStatementExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST includeStatementExpression_AST = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_include:
			{
				AST tmp96_AST = null;
				tmp96_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp96_AST);
				match(LITERAL_include);
				break;
			}
			case LITERAL_include_once:
			{
				AST tmp97_AST = null;
				tmp97_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp97_AST);
				match(LITERAL_include_once);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			expression(true, true);
			astFactory.addASTChild(currentAST, returnAST);
			}
			includeStatementExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = includeStatementExpression_AST;
	}
	
	public final void catchBlock() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST catchBlock_AST = null;
		
		try {      // for error handling
			AST tmp98_AST = null;
			tmp98_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp98_AST);
			match(LITERAL_catch);
			AST tmp99_AST = null;
			tmp99_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp99_AST);
			match(LPAREN);
			paramListElement();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp100_AST = null;
			tmp100_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp100_AST);
			match(RPAREN);
			block();
			astFactory.addASTChild(currentAST, returnAST);
			catchBlock_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_14);
			} else {
			  throw ex;
			}
		}
		returnAST = catchBlock_AST;
	}
	
	public final void finallyBlock() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST finallyBlock_AST = null;
		
		try {      // for error handling
			AST tmp101_AST = null;
			tmp101_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp101_AST);
			match(LITERAL_finally);
			block();
			astFactory.addASTChild(currentAST, returnAST);
			finallyBlock_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = finallyBlock_AST;
	}
	
	public final void paramListElement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST paramListElement_AST = null;
		AST id_AST = null;
		
		try {      // for error handling
			functionParameter();
			id_AST = (AST)returnAST;
			if ( inputState.guessing==0 ) {
				paramListElement_AST = (AST)currentAST.root;
				paramListElement_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(PARAMETER_DEF,"PARAMETER_DEF")).add(id_AST)) ;
				currentAST.root = paramListElement_AST;
				currentAST.child = paramListElement_AST!=null &&paramListElement_AST.getFirstChild()!=null ?
					paramListElement_AST.getFirstChild() : paramListElement_AST;
				currentAST.advanceChildToEnd();
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_23);
			} else {
			  throw ex;
			}
		}
		returnAST = paramListElement_AST;
	}
	
	public final void listStatementExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST listStatementExpression_AST = null;
		
		try {      // for error handling
			AST tmp102_AST = null;
			tmp102_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp102_AST);
			match(LITERAL_list);
			listParameters();
			astFactory.addASTChild(currentAST, returnAST);
			listInitializer();
			astFactory.addASTChild(currentAST, returnAST);
			listStatementExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = listStatementExpression_AST;
	}
	
	public final void listParameters() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST listParameters_AST = null;
		
		try {      // for error handling
			AST tmp103_AST = null;
			tmp103_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp103_AST);
			match(LPAREN);
			{
			switch ( LA(1)) {
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_list:
			case DOG:
			case PLUS:
			case MINUS:
			case BAND:
			case INC:
			case DEC:
			case LPAREN:
			case LCURLY:
			case LNOT:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case BNOT:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				expression(true, false);
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case RPAREN:
			case COMMA:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			_loop80:
			do {
				if ((LA(1)==COMMA)) {
					AST tmp104_AST = null;
					tmp104_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp104_AST);
					match(COMMA);
					{
					switch ( LA(1)) {
					case LITERAL_new:
					case LITERAL_clone:
					case LITERAL_require:
					case LITERAL_require_once:
					case LITERAL_include:
					case LITERAL_include_once:
					case LITERAL_self:
					case LITERAL_parent:
					case LITERAL_list:
					case DOG:
					case PLUS:
					case MINUS:
					case BAND:
					case INC:
					case DEC:
					case LPAREN:
					case LCURLY:
					case LNOT:
					case IDENT:
					case VARIABLE:
					case COMPOUND_VAR_START:
					case HEREDOC:
					case STRING:
					case NUMBER:
					case BNOT:
					case LITERAL_true:
					case LITERAL_false:
					case LITERAL_null:
					case LITERAL_array:
					{
						expression(true, false);
						astFactory.addASTChild(currentAST, returnAST);
						break;
					}
					case RPAREN:
					case COMMA:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
				}
				else {
					break _loop80;
				}
				
			} while (true);
			}
			AST tmp105_AST = null;
			tmp105_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp105_AST);
			match(RPAREN);
			listParameters_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_24);
			} else {
			  throw ex;
			}
		}
		returnAST = listParameters_AST;
	}
	
	public final void listInitializer() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST listInitializer_AST = null;
		
		try {      // for error handling
			AST tmp106_AST = null;
			tmp106_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp106_AST);
			match(ASSIGN);
			expression(true, false);
			astFactory.addASTChild(currentAST, returnAST);
			listInitializer_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = listInitializer_AST;
	}
	
	public final void foreachCondition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST foreachCondition_AST = null;
		AST exp_AST = null;
		Token  las = null;
		AST las_AST = null;
		AST exp2_AST = null;
		Token  assoc = null;
		AST assoc_AST = null;
		AST exp3_AST = null;
		
		try {      // for error handling
			expression(true, true);
			exp_AST = (AST)returnAST;
			las = LT(1);
			las_AST = astFactory.create(las);
			match(LITERAL_as);
			expression(true, true);
			exp2_AST = (AST)returnAST;
			{
			switch ( LA(1)) {
			case RPAREN:
			{
				if ( inputState.guessing==0 ) {
					foreachCondition_AST = (AST)currentAST.root;
					foreachCondition_AST = (AST)astFactory.make( (new ASTArray(3)).add(las_AST).add(exp_AST).add(exp2_AST)) ;
					currentAST.root = foreachCondition_AST;
					currentAST.child = foreachCondition_AST!=null &&foreachCondition_AST.getFirstChild()!=null ?
						foreachCondition_AST.getFirstChild() : foreachCondition_AST;
					currentAST.advanceChildToEnd();
				}
				break;
			}
			case ASSOCIATE:
			{
				{
				assoc = LT(1);
				assoc_AST = astFactory.create(assoc);
				match(ASSOCIATE);
				expression(true, true);
				exp3_AST = (AST)returnAST;
				if ( inputState.guessing==0 ) {
					foreachCondition_AST = (AST)currentAST.root;
					foreachCondition_AST = (AST)astFactory.make( (new ASTArray(3)).add(las_AST).add(exp_AST).add((AST)astFactory.make( (new ASTArray(3)).add(assoc_AST).add(exp2_AST).add(exp3_AST)))) ;
					currentAST.root = foreachCondition_AST;
					currentAST.child = foreachCondition_AST!=null &&foreachCondition_AST.getFirstChild()!=null ?
						foreachCondition_AST.getFirstChild() : foreachCondition_AST;
					currentAST.advanceChildToEnd();
				}
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_25);
			} else {
			  throw ex;
			}
		}
		returnAST = foreachCondition_AST;
	}
	
	public final void functionHeader() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionHeader_AST = null;
		Token  fname = null;
		AST fname_AST = null;
		AST pl_AST = null;
		
		try {      // for error handling
			AST tmp107_AST = null;
			tmp107_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp107_AST);
			match(LITERAL_function);
			{
			switch ( LA(1)) {
			case BAND:
			{
				AST tmp108_AST = null;
				tmp108_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp108_AST);
				match(BAND);
				if ( inputState.guessing==0 ) {
					tmp108_AST.setType(REFERENCE);
				}
				break;
			}
			case IDENT:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			fname = LT(1);
			fname_AST = astFactory.create(fname);
			astFactory.addASTChild(currentAST, fname_AST);
			match(IDENT);
			AST tmp109_AST = null;
			tmp109_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp109_AST);
			match(LPAREN);
			{
			switch ( LA(1)) {
			case LITERAL_self:
			case LITERAL_parent:
			case BAND:
			case LCURLY:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case LITERAL_array:
			case LITERAL_int:
			case LITERAL_float:
			case LITERAL_double:
			case LITERAL_object:
			case LITERAL_string:
			case LITERAL_bool:
			case LITERAL_boolean:
			case LITERAL_resource:
			{
				paramList();
				pl_AST = (AST)returnAST;
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case RPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			AST tmp110_AST = null;
			tmp110_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp110_AST);
			match(RPAREN);
			functionHeader_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_26);
			} else {
			  throw ex;
			}
		}
		returnAST = functionHeader_AST;
	}
	
	public final void functionBody() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionBody_AST = null;
		Token  lc = null;
		AST lc_AST = null;
		
		try {      // for error handling
			lc = LT(1);
			lc_AST = astFactory.create(lc);
			astFactory.makeASTRoot(currentAST, lc_AST);
			match(LCURLY);
			if ( inputState.guessing==0 ) {
				lc.setType(FUNCTION_BODY) ;
			}
			{
			_loop113:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					statement();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop113;
				}
				
			} while (true);
			}
			AST tmp111_AST = null;
			tmp111_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp111_AST);
			match(RCURLY);
			functionBody_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_8);
			} else {
			  throw ex;
			}
		}
		returnAST = functionBody_AST;
	}
	
	public final void paramList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST paramList_AST = null;
		
		try {      // for error handling
			paramListElement();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop116:
			do {
				if ((LA(1)==COMMA)) {
					AST tmp112_AST = null;
					tmp112_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp112_AST);
					match(COMMA);
					paramListElement();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop116;
				}
				
			} while (true);
			}
			paramList_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_25);
			} else {
			  throw ex;
			}
		}
		returnAST = paramList_AST;
	}
	
	public final void functionParameter() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionParameter_AST = null;
		
		try {      // for error handling
			{
			boolean synPredMatched125 = false;
			if (((_tokenSet_27.member(LA(1))) && (_tokenSet_28.member(LA(2))))) {
				int _m125 = mark();
				synPredMatched125 = true;
				inputState.guessing++;
				try {
					{
					typeName();
					identifier();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched125 = false;
				}
				rewind(_m125);
inputState.guessing--;
			}
			if ( synPredMatched125 ) {
				{
				typeName();
				astFactory.addASTChild(currentAST, returnAST);
				identifier();
				astFactory.addASTChild(currentAST, returnAST);
				}
			}
			else {
				boolean synPredMatched128 = false;
				if (((_tokenSet_27.member(LA(1))) && (LA(2)==BAND||LA(2)==DOUBLECOLON))) {
					int _m128 = mark();
					synPredMatched128 = true;
					inputState.guessing++;
					try {
						{
						typeName();
						match(BAND);
						identifier();
						}
					}
					catch (RecognitionException pe) {
						synPredMatched128 = false;
					}
					rewind(_m128);
inputState.guessing--;
				}
				if ( synPredMatched128 ) {
					{
					typeName();
					astFactory.addASTChild(currentAST, returnAST);
					AST tmp113_AST = null;
					tmp113_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp113_AST);
					match(BAND);
					if ( inputState.guessing==0 ) {
						tmp113_AST.setType(REFERENCE);
					}
					identifier();
					astFactory.addASTChild(currentAST, returnAST);
					}
				}
				else {
					boolean synPredMatched131 = false;
					if (((LA(1)==BAND))) {
						int _m131 = mark();
						synPredMatched131 = true;
						inputState.guessing++;
						try {
							{
							match(BAND);
							identifier();
							}
						}
						catch (RecognitionException pe) {
							synPredMatched131 = false;
						}
						rewind(_m131);
inputState.guessing--;
					}
					if ( synPredMatched131 ) {
						{
						AST tmp114_AST = null;
						tmp114_AST = astFactory.create(LT(1));
						astFactory.addASTChild(currentAST, tmp114_AST);
						match(BAND);
						if ( inputState.guessing==0 ) {
							tmp114_AST.setType(REFERENCE);
						}
						identifier();
						astFactory.addASTChild(currentAST, returnAST);
						}
					}
					else if ((_tokenSet_29.member(LA(1))) && (_tokenSet_30.member(LA(2)))) {
						identifier();
						astFactory.addASTChild(currentAST, returnAST);
					}
					else {
						throw new NoViableAltException(LT(1), getFilename());
					}
					}}
					}
					{
					switch ( LA(1)) {
					case ASSIGN:
					{
						AST tmp115_AST = null;
						tmp115_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp115_AST);
						match(ASSIGN);
						expression(true, false);
						astFactory.addASTChild(currentAST, returnAST);
						break;
					}
					case RPAREN:
					case COMMA:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					functionParameter_AST = (AST)currentAST.root;
				}
				catch (RecognitionException ex) {
					if (inputState.guessing==0) {
						reportError(ex);
						recover(ex,_tokenSet_23);
					} else {
					  throw ex;
					}
				}
				returnAST = functionParameter_AST;
			}
			
	public final void expressionList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST expressionList_AST = null;
		
		try {      // for error handling
			{
			expression(true, false);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop121:
			do {
				if ((LA(1)==COMMA)) {
					AST tmp116_AST = null;
					tmp116_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp116_AST);
					match(COMMA);
					expression(true, false);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop121;
				}
				
			} while (true);
			}
			}
			if ( inputState.guessing==0 ) {
				expressionList_AST = (AST)currentAST.root;
				expressionList_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ELIST,"ELIST")).add(expressionList_AST));
				currentAST.root = expressionList_AST;
				currentAST.child = expressionList_AST!=null &&expressionList_AST.getFirstChild()!=null ?
					expressionList_AST.getFirstChild() : expressionList_AST;
				currentAST.advanceChildToEnd();
			}
			expressionList_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_25);
			} else {
			  throw ex;
			}
		}
		returnAST = expressionList_AST;
	}
	
	public final void typeName() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST typeName_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_int:
			{
				AST tmp117_AST = null;
				tmp117_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp117_AST);
				match(LITERAL_int);
				typeName_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_float:
			{
				AST tmp118_AST = null;
				tmp118_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp118_AST);
				match(LITERAL_float);
				typeName_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_double:
			{
				AST tmp119_AST = null;
				tmp119_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp119_AST);
				match(LITERAL_double);
				typeName_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_object:
			{
				AST tmp120_AST = null;
				tmp120_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp120_AST);
				match(LITERAL_object);
				typeName_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_string:
			{
				AST tmp121_AST = null;
				tmp121_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp121_AST);
				match(LITERAL_string);
				typeName_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_array:
			{
				AST tmp122_AST = null;
				tmp122_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp122_AST);
				match(LITERAL_array);
				typeName_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_bool:
			{
				AST tmp123_AST = null;
				tmp123_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp123_AST);
				match(LITERAL_bool);
				typeName_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_boolean:
			{
				AST tmp124_AST = null;
				tmp124_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp124_AST);
				match(LITERAL_boolean);
				typeName_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_resource:
			{
				AST tmp125_AST = null;
				tmp125_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp125_AST);
				match(LITERAL_resource);
				typeName_AST = (AST)currentAST.root;
				break;
			}
			case IDENT:
			{
				typeIdentifier();
				astFactory.addASTChild(currentAST, returnAST);
				typeName_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_31);
			} else {
			  throw ex;
			}
		}
		returnAST = typeName_AST;
	}
	
	public final void className() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST className_AST = null;
		
		try {      // for error handling
			AST tmp126_AST = null;
			tmp126_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp126_AST);
			match(IDENT);
			className_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_32);
			} else {
			  throw ex;
			}
		}
		returnAST = className_AST;
	}
	
	public final void implementsList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST implementsList_AST = null;
		
		try {      // for error handling
			AST tmp127_AST = null;
			tmp127_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp127_AST);
			match(LITERAL_implements);
			className();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop155:
			do {
				if ((LA(1)==COMMA)) {
					AST tmp128_AST = null;
					tmp128_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp128_AST);
					match(COMMA);
					className();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop155;
				}
				
			} while (true);
			}
			implementsList_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_33);
			} else {
			  throw ex;
			}
		}
		returnAST = implementsList_AST;
	}
	
	public final void extendsMultiList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST extendsMultiList_AST = null;
		
		try {      // for error handling
			AST tmp129_AST = null;
			tmp129_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp129_AST);
			match(LITERAL_extends);
			className();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop152:
			do {
				if ((LA(1)==COMMA)) {
					AST tmp130_AST = null;
					tmp130_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp130_AST);
					match(COMMA);
					className();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop152;
				}
				
			} while (true);
			}
			extendsMultiList_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_33);
			} else {
			  throw ex;
			}
		}
		returnAST = extendsMultiList_AST;
	}
	
	public final void interfaceBody() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST interfaceBody_AST = null;
		
		try {      // for error handling
			AST tmp131_AST = null;
			tmp131_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp131_AST);
			match(LCURLY);
			if ( inputState.guessing==0 ) {
				tmp131_AST.setType(CLASS_BODY);
			}
			{
			_loop139:
			do {
				if ((_tokenSet_34.member(LA(1)))) {
					interfaceMemberDefinition();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop139;
				}
				
			} while (true);
			}
			AST tmp132_AST = null;
			tmp132_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp132_AST);
			match(RCURLY);
			interfaceBody_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = interfaceBody_AST;
	}
	
	public final void interfaceMemberDefinition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST interfaceMemberDefinition_AST = null;
		
		try {      // for error handling
			memberModifiers();
			astFactory.addASTChild(currentAST, returnAST);
			functionHeader();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp133_AST = null;
			tmp133_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp133_AST);
			match(SEMI);
			if ( inputState.guessing==0 ) {
				interfaceMemberDefinition_AST = (AST)currentAST.root;
				interfaceMemberDefinition_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(MEMBER_DEF,"")).add(interfaceMemberDefinition_AST)) ;
				currentAST.root = interfaceMemberDefinition_AST;
				currentAST.child = interfaceMemberDefinition_AST!=null &&interfaceMemberDefinition_AST.getFirstChild()!=null ?
					interfaceMemberDefinition_AST.getFirstChild() : interfaceMemberDefinition_AST;
				currentAST.advanceChildToEnd();
			}
			interfaceMemberDefinition_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_35);
			} else {
			  throw ex;
			}
		}
		returnAST = interfaceMemberDefinition_AST;
	}
	
	public final void memberModifiers() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST memberModifiers_AST = null;
		
		try {      // for error handling
			{
			_loop176:
			do {
				switch ( LA(1)) {
				case LITERAL_abstract:
				{
					AST tmp134_AST = null;
					tmp134_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp134_AST);
					match(LITERAL_abstract);
					if ( inputState.guessing==0 ) {
						metAbstractModifier = true;
					}
					break;
				}
				case LITERAL_final:
				{
					AST tmp135_AST = null;
					tmp135_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp135_AST);
					match(LITERAL_final);
					break;
				}
				case LITERAL_public:
				{
					AST tmp136_AST = null;
					tmp136_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp136_AST);
					match(LITERAL_public);
					break;
				}
				case LITERAL_protected:
				{
					AST tmp137_AST = null;
					tmp137_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp137_AST);
					match(LITERAL_protected);
					break;
				}
				case LITERAL_private:
				{
					AST tmp138_AST = null;
					tmp138_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp138_AST);
					match(LITERAL_private);
					break;
				}
				case LITERAL_static:
				{
					AST tmp139_AST = null;
					tmp139_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp139_AST);
					match(LITERAL_static);
					break;
				}
				case LITERAL_const:
				{
					AST tmp140_AST = null;
					tmp140_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp140_AST);
					match(LITERAL_const);
					break;
				}
				default:
				{
					break _loop176;
				}
				}
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				memberModifiers_AST = (AST)currentAST.root;
				memberModifiers_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(MODIFIERS,"")).add(memberModifiers_AST));
				currentAST.root = memberModifiers_AST;
				currentAST.child = memberModifiers_AST!=null &&memberModifiers_AST.getFirstChild()!=null ?
					memberModifiers_AST.getFirstChild() : memberModifiers_AST;
				currentAST.advanceChildToEnd();
			}
			memberModifiers_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_36);
			} else {
			  throw ex;
			}
		}
		returnAST = memberModifiers_AST;
	}
	
	public final void classModifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST classModifier_AST = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_abstract:
			{
				AST tmp141_AST = null;
				tmp141_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp141_AST);
				match(LITERAL_abstract);
				break;
			}
			case LITERAL_class:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				classModifier_AST = (AST)currentAST.root;
				classModifier_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(MODIFIERS,"")).add(classModifier_AST)) ;
				currentAST.root = classModifier_AST;
				currentAST.child = classModifier_AST!=null &&classModifier_AST.getFirstChild()!=null ?
					classModifier_AST.getFirstChild() : classModifier_AST;
				currentAST.advanceChildToEnd();
			}
			classModifier_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_37);
			} else {
			  throw ex;
			}
		}
		returnAST = classModifier_AST;
	}
	
	public final void extendsList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST extendsList_AST = null;
		
		try {      // for error handling
			AST tmp142_AST = null;
			tmp142_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp142_AST);
			match(LITERAL_extends);
			className();
			astFactory.addASTChild(currentAST, returnAST);
			extendsList_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_38);
			} else {
			  throw ex;
			}
		}
		returnAST = extendsList_AST;
	}
	
	public final void classBody() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST classBody_AST = null;
		
		try {      // for error handling
			AST tmp143_AST = null;
			tmp143_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp143_AST);
			match(LCURLY);
			if ( inputState.guessing==0 ) {
				tmp143_AST.setType(CLASS_BODY);
			}
			{
			_loop159:
			do {
				if ((_tokenSet_39.member(LA(1)))) {
					memberDefinition();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop159;
				}
				
			} while (true);
			}
			AST tmp144_AST = null;
			tmp144_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp144_AST);
			match(RCURLY);
			classBody_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = classBody_AST;
	}
	
	public final void memberDefinition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST memberDefinition_AST = null;
		
		metAbstractModifier = false;
		
		
		try {      // for error handling
			memberModifiers();
			astFactory.addASTChild(currentAST, returnAST);
			{
			switch ( LA(1)) {
			case LITERAL_function:
			{
				{
				if (((LA(1)==LITERAL_function) && (LA(2)==BAND||LA(2)==IDENT))&&(!metAbstractModifier)) {
					functionDeclaration();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else if ((LA(1)==LITERAL_function) && (LA(2)==BAND||LA(2)==IDENT)) {
					{
					functionHeader();
					astFactory.addASTChild(currentAST, returnAST);
					AST tmp145_AST = null;
					tmp145_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp145_AST);
					match(SEMI);
					}
				}
				else {
					throw new NoViableAltException(LT(1), getFilename());
				}
				
				}
				break;
			}
			case LITERAL_var:
			case LITERAL_self:
			case LITERAL_parent:
			case LCURLY:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			{
				{
				memberDataDefinition();
				astFactory.addASTChild(currentAST, returnAST);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				memberDefinition_AST = (AST)currentAST.root;
				memberDefinition_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(MEMBER_DEF,"")).add(memberDefinition_AST)) ;
				currentAST.root = memberDefinition_AST;
				currentAST.child = memberDefinition_AST!=null &&memberDefinition_AST.getFirstChild()!=null ?
					memberDefinition_AST.getFirstChild() : memberDefinition_AST;
				currentAST.advanceChildToEnd();
			}
			memberDefinition_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_40);
			} else {
			  throw ex;
			}
		}
		returnAST = memberDefinition_AST;
	}
	
	public final void memberDataDefinition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST memberDataDefinition_AST = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_var:
			{
				AST tmp146_AST = null;
				tmp146_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp146_AST);
				match(LITERAL_var);
				break;
			}
			case LITERAL_self:
			case LITERAL_parent:
			case LCURLY:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			memberDataItems();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp147_AST = null;
			tmp147_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp147_AST);
			match(SEMI);
			memberDataDefinition_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_40);
			} else {
			  throw ex;
			}
		}
		returnAST = memberDataDefinition_AST;
	}
	
	public final void memberDataItems() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST memberDataItems_AST = null;
		
		try {      // for error handling
			memberDataItem();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop171:
			do {
				if ((LA(1)==COMMA)) {
					AST tmp148_AST = null;
					tmp148_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp148_AST);
					match(COMMA);
					memberDataItem();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop171;
				}
				
			} while (true);
			}
			memberDataItems_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_41);
			} else {
			  throw ex;
			}
		}
		returnAST = memberDataItems_AST;
	}
	
	public final void memberDataItem() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST memberDataItem_AST = null;
		
		try {      // for error handling
			identifier();
			astFactory.addASTChild(currentAST, returnAST);
			{
			switch ( LA(1)) {
			case ASSIGN:
			{
				AST tmp149_AST = null;
				tmp149_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp149_AST);
				match(ASSIGN);
				expression(true, false);
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case COMMA:
			case SEMI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			memberDataItem_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_21);
			} else {
			  throw ex;
			}
		}
		returnAST = memberDataItem_AST;
	}
	
	public final void logicalOrExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST logicalOrExpression_AST = null;
		
		try {      // for error handling
			logicalXorExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop183:
			do {
				if ((LA(1)==LITERAL_or) && (_tokenSet_5.member(LA(2)))) {
					AST tmp150_AST = null;
					tmp150_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp150_AST);
					match(LITERAL_or);
					logicalXorExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop183;
				}
				
			} while (true);
			}
			logicalOrExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = logicalOrExpression_AST;
	}
	
	public final void logicalXorExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST logicalXorExpression_AST = null;
		
		try {      // for error handling
			logicalAndExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop186:
			do {
				if ((LA(1)==LITERAL_xor) && (_tokenSet_5.member(LA(2)))) {
					AST tmp151_AST = null;
					tmp151_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp151_AST);
					match(LITERAL_xor);
					logicalAndExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop186;
				}
				
			} while (true);
			}
			logicalXorExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = logicalXorExpression_AST;
	}
	
	public final void logicalAndExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST logicalAndExpression_AST = null;
		
		try {      // for error handling
			assignmentExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop189:
			do {
				if ((LA(1)==LITERAL_and) && (_tokenSet_5.member(LA(2)))) {
					AST tmp152_AST = null;
					tmp152_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp152_AST);
					match(LITERAL_and);
					assignmentExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop189;
				}
				
			} while (true);
			}
			logicalAndExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = logicalAndExpression_AST;
	}
	
	public final void assignmentExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST assignmentExpression_AST = null;
		
		try {      // for error handling
			ternaryExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			if ((_tokenSet_42.member(LA(1))) && (_tokenSet_5.member(LA(2)))) {
				{
				switch ( LA(1)) {
				case ASSIGN:
				{
					AST tmp153_AST = null;
					tmp153_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp153_AST);
					match(ASSIGN);
					break;
				}
				case PLUS_ASS:
				{
					AST tmp154_AST = null;
					tmp154_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp154_AST);
					match(PLUS_ASS);
					break;
				}
				case MINUS_ASS:
				{
					AST tmp155_AST = null;
					tmp155_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp155_AST);
					match(MINUS_ASS);
					break;
				}
				case MULT_ASS:
				{
					AST tmp156_AST = null;
					tmp156_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp156_AST);
					match(MULT_ASS);
					break;
				}
				case AND_ASS:
				{
					AST tmp157_AST = null;
					tmp157_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp157_AST);
					match(AND_ASS);
					break;
				}
				case DIV_ASS:
				{
					AST tmp158_AST = null;
					tmp158_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp158_AST);
					match(DIV_ASS);
					break;
				}
				case MOD_ASS:
				{
					AST tmp159_AST = null;
					tmp159_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp159_AST);
					match(MOD_ASS);
					break;
				}
				case SHR_ASS:
				{
					AST tmp160_AST = null;
					tmp160_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp160_AST);
					match(SHR_ASS);
					break;
				}
				case SHL_ASS:
				{
					AST tmp161_AST = null;
					tmp161_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp161_AST);
					match(SHL_ASS);
					break;
				}
				case BAND_ASS:
				{
					AST tmp162_AST = null;
					tmp162_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp162_AST);
					match(BAND_ASS);
					break;
				}
				case XOR_ASS:
				{
					AST tmp163_AST = null;
					tmp163_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp163_AST);
					match(XOR_ASS);
					break;
				}
				case BOR_ASS:
				{
					AST tmp164_AST = null;
					tmp164_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp164_AST);
					match(BOR_ASS);
					break;
				}
				case OR_ASS:
				{
					AST tmp165_AST = null;
					tmp165_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp165_AST);
					match(OR_ASS);
					break;
				}
				case DOT_ASS:
				{
					AST tmp166_AST = null;
					tmp166_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp166_AST);
					match(DOT_ASS);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				expression(true, allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else if ((_tokenSet_16.member(LA(1))) && (_tokenSet_43.member(LA(2)))) {
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			assignmentExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = assignmentExpression_AST;
	}
	
	public final void ternaryExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST ternaryExpression_AST = null;
		
		try {      // for error handling
			propertyAccessExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			if ((LA(1)==QUESTION) && (_tokenSet_5.member(LA(2)))) {
				AST tmp167_AST = null;
				tmp167_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp167_AST);
				match(QUESTION);
				ternaryExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp168_AST = null;
				tmp168_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp168_AST);
				match(COLON);
				ternaryExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else if ((_tokenSet_16.member(LA(1))) && (_tokenSet_43.member(LA(2)))) {
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			ternaryExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = ternaryExpression_AST;
	}
	
	public final void propertyAccessExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST propertyAccessExpression_AST = null;
		
		try {      // for error handling
			booleanOrExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop197:
			do {
				if ((LA(1)==MMBR) && (_tokenSet_5.member(LA(2)))) {
					AST tmp169_AST = null;
					tmp169_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp169_AST);
					match(MMBR);
					if ( inputState.guessing==0 ) {
						metMMBR = true;
					}
					booleanOrExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
					if ( inputState.guessing==0 ) {
						metMMBR = false;
					}
				}
				else {
					break _loop197;
				}
				
			} while (true);
			}
			propertyAccessExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = propertyAccessExpression_AST;
	}
	
	public final void booleanOrExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST booleanOrExpression_AST = null;
		
		try {      // for error handling
			booleanAndExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop200:
			do {
				if ((LA(1)==LOR) && (_tokenSet_5.member(LA(2)))) {
					AST tmp170_AST = null;
					tmp170_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp170_AST);
					match(LOR);
					booleanAndExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop200;
				}
				
			} while (true);
			}
			booleanOrExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = booleanOrExpression_AST;
	}
	
	public final void booleanAndExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST booleanAndExpression_AST = null;
		
		try {      // for error handling
			bitwiseOrExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop203:
			do {
				if ((LA(1)==LAND) && (_tokenSet_5.member(LA(2)))) {
					AST tmp171_AST = null;
					tmp171_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp171_AST);
					match(LAND);
					bitwiseOrExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop203;
				}
				
			} while (true);
			}
			booleanAndExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = booleanAndExpression_AST;
	}
	
	public final void bitwiseOrExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST bitwiseOrExpression_AST = null;
		
		try {      // for error handling
			bitwiseXorExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop206:
			do {
				if ((LA(1)==BOR) && (_tokenSet_5.member(LA(2)))) {
					AST tmp172_AST = null;
					tmp172_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp172_AST);
					match(BOR);
					bitwiseXorExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop206;
				}
				
			} while (true);
			}
			bitwiseOrExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = bitwiseOrExpression_AST;
	}
	
	public final void bitwiseXorExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST bitwiseXorExpression_AST = null;
		
		try {      // for error handling
			bitwiseAndExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop209:
			do {
				if ((LA(1)==BXOR) && (_tokenSet_5.member(LA(2)))) {
					AST tmp173_AST = null;
					tmp173_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp173_AST);
					match(BXOR);
					bitwiseAndExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop209;
				}
				
			} while (true);
			}
			bitwiseXorExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = bitwiseXorExpression_AST;
	}
	
	public final void bitwiseAndExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST bitwiseAndExpression_AST = null;
		
		try {      // for error handling
			equalityExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop212:
			do {
				if ((LA(1)==BAND) && (_tokenSet_5.member(LA(2)))) {
					AST tmp174_AST = null;
					tmp174_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp174_AST);
					match(BAND);
					equalityExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop212;
				}
				
			} while (true);
			}
			bitwiseAndExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = bitwiseAndExpression_AST;
	}
	
	public final void equalityExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST equalityExpression_AST = null;
		
		try {      // for error handling
			compareExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop216:
			do {
				if ((_tokenSet_44.member(LA(1))) && (_tokenSet_5.member(LA(2)))) {
					{
					switch ( LA(1)) {
					case NE:
					{
						AST tmp175_AST = null;
						tmp175_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp175_AST);
						match(NE);
						break;
					}
					case EQUAL:
					{
						AST tmp176_AST = null;
						tmp176_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp176_AST);
						match(EQUAL);
						break;
					}
					case IDENTICAL:
					{
						AST tmp177_AST = null;
						tmp177_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp177_AST);
						match(IDENTICAL);
						break;
					}
					case NONIDENT:
					{
						AST tmp178_AST = null;
						tmp178_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp178_AST);
						match(NONIDENT);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					compareExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop216;
				}
				
			} while (true);
			}
			equalityExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = equalityExpression_AST;
	}
	
	public final void compareExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST compareExpression_AST = null;
		
		try {      // for error handling
			shiftExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop220:
			do {
				if (((LA(1) >= LESS && LA(1) <= GE)) && (_tokenSet_5.member(LA(2)))) {
					{
					switch ( LA(1)) {
					case LE:
					{
						AST tmp179_AST = null;
						tmp179_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp179_AST);
						match(LE);
						break;
					}
					case LESS:
					{
						AST tmp180_AST = null;
						tmp180_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp180_AST);
						match(LESS);
						break;
					}
					case GE:
					{
						AST tmp181_AST = null;
						tmp181_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp181_AST);
						match(GE);
						break;
					}
					case GREATER:
					{
						AST tmp182_AST = null;
						tmp182_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp182_AST);
						match(GREATER);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					shiftExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop220;
				}
				
			} while (true);
			}
			compareExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = compareExpression_AST;
	}
	
	public final void shiftExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST shiftExpression_AST = null;
		
		try {      // for error handling
			sumExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop224:
			do {
				if ((LA(1)==SHL||LA(1)==SHR) && (_tokenSet_5.member(LA(2)))) {
					{
					switch ( LA(1)) {
					case SHL:
					{
						AST tmp183_AST = null;
						tmp183_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp183_AST);
						match(SHL);
						break;
					}
					case SHR:
					{
						AST tmp184_AST = null;
						tmp184_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp184_AST);
						match(SHR);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					sumExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop224;
				}
				
			} while (true);
			}
			shiftExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = shiftExpression_AST;
	}
	
	public final void sumExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST sumExpression_AST = null;
		
		try {      // for error handling
			multiplExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop228:
			do {
				if ((LA(1)==PLUS||LA(1)==MINUS||LA(1)==DOT) && (_tokenSet_5.member(LA(2)))) {
					{
					switch ( LA(1)) {
					case PLUS:
					{
						AST tmp185_AST = null;
						tmp185_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp185_AST);
						match(PLUS);
						break;
					}
					case MINUS:
					{
						AST tmp186_AST = null;
						tmp186_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp186_AST);
						match(MINUS);
						break;
					}
					case DOT:
					{
						AST tmp187_AST = null;
						tmp187_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp187_AST);
						match(DOT);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					multiplExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop228;
				}
				
			} while (true);
			}
			sumExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = sumExpression_AST;
	}
	
	public final void multiplExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST multiplExpression_AST = null;
		
		try {      // for error handling
			logicalNotExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop232:
			do {
				if (((LA(1) >= ASTERISK && LA(1) <= MOD)) && (_tokenSet_5.member(LA(2)))) {
					{
					switch ( LA(1)) {
					case ASTERISK:
					{
						AST tmp188_AST = null;
						tmp188_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp188_AST);
						match(ASTERISK);
						break;
					}
					case SLASH:
					{
						AST tmp189_AST = null;
						tmp189_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp189_AST);
						match(SLASH);
						break;
					}
					case MOD:
					{
						AST tmp190_AST = null;
						tmp190_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp190_AST);
						match(MOD);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					logicalNotExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop232;
				}
				
			} while (true);
			}
			multiplExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = multiplExpression_AST;
	}
	
	public final void logicalNotExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST logicalNotExpression_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LNOT:
			{
				{
				AST tmp191_AST = null;
				tmp191_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp191_AST);
				match(LNOT);
				logicalNotExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				}
				logicalNotExpression_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_list:
			case DOG:
			case PLUS:
			case MINUS:
			case BAND:
			case INC:
			case DEC:
			case LPAREN:
			case LCURLY:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case BNOT:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				{
				instanceofExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				}
				logicalNotExpression_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = logicalNotExpression_AST;
	}
	
	public final void instanceofExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST instanceofExpression_AST = null;
		
		try {      // for error handling
			typeCastExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop239:
			do {
				if ((LA(1)==LITERAL_instanceof) && (_tokenSet_45.member(LA(2)))) {
					{
					AST tmp192_AST = null;
					tmp192_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp192_AST);
					match(LITERAL_instanceof);
					}
					typeCastExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop239;
				}
				
			} while (true);
			}
			instanceofExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = instanceofExpression_AST;
	}
	
	public final void typeCastExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST typeCastExpression_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case BNOT:
			{
				{
				AST tmp193_AST = null;
				tmp193_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp193_AST);
				match(BNOT);
				typeCastExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				}
				typeCastExpression_AST = (AST)currentAST.root;
				break;
			}
			case MINUS:
			{
				{
				AST tmp194_AST = null;
				tmp194_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp194_AST);
				match(MINUS);
				if ( inputState.guessing==0 ) {
					tmp194_AST.setType(UNARY_MINUS);
				}
				typeCastExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				}
				typeCastExpression_AST = (AST)currentAST.root;
				break;
			}
			case PLUS:
			{
				{
				AST tmp195_AST = null;
				tmp195_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp195_AST);
				match(PLUS);
				if ( inputState.guessing==0 ) {
					tmp195_AST.setType(UNARY_PLUS);
				}
				typeCastExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				}
				typeCastExpression_AST = (AST)currentAST.root;
				break;
			}
			case DOG:
			{
				{
				AST tmp196_AST = null;
				tmp196_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp196_AST);
				match(DOG);
				typeCastExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				}
				typeCastExpression_AST = (AST)currentAST.root;
				break;
			}
			default:
				boolean synPredMatched242 = false;
				if (((LA(1)==LPAREN) && (_tokenSet_27.member(LA(2))))) {
					int _m242 = mark();
					synPredMatched242 = true;
					inputState.guessing++;
					try {
						{
						match(LPAREN);
						typeName();
						match(RPAREN);
						}
					}
					catch (RecognitionException pe) {
						synPredMatched242 = false;
					}
					rewind(_m242);
inputState.guessing--;
				}
				if ( synPredMatched242 ) {
					{
					AST tmp197_AST = null;
					tmp197_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp197_AST);
					match(LPAREN);
					typeName();
					astFactory.addASTChild(currentAST, returnAST);
					AST tmp198_AST = null;
					tmp198_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp198_AST);
					match(RPAREN);
					if ( inputState.guessing==0 ) {
						tmp197_AST.setType(TYPE_CAST) ;
					}
					typeCastExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
					}
					typeCastExpression_AST = (AST)currentAST.root;
				}
				else if ((_tokenSet_46.member(LA(1))) && (_tokenSet_47.member(LA(2)))) {
					incrementExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
					typeCastExpression_AST = (AST)currentAST.root;
				}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = typeCastExpression_AST;
	}
	
	public final void incrementExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST incrementExpression_AST = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case INC:
			{
				AST tmp199_AST = null;
				tmp199_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp199_AST);
				match(INC);
				break;
			}
			case DEC:
			{
				AST tmp200_AST = null;
				tmp200_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp200_AST);
				match(DEC);
				break;
			}
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_list:
			case BAND:
			case LPAREN:
			case LCURLY:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			functionCallExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			{
			_loop254:
			do {
				if ((LA(1)==INC) && (_tokenSet_16.member(LA(2)))) {
					{
					AST tmp201_AST = null;
					tmp201_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp201_AST);
					match(INC);
					if ( inputState.guessing==0 ) {
						tmp201_AST.setType(POST_INC);
					}
					}
				}
				else if ((LA(1)==DEC) && (_tokenSet_16.member(LA(2)))) {
					{
					AST tmp202_AST = null;
					tmp202_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp202_AST);
					match(DEC);
					if ( inputState.guessing==0 ) {
						tmp202_AST.setType(POST_DEC);
					}
					}
				}
				else {
					break _loop254;
				}
				
			} while (true);
			}
			}
			incrementExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = incrementExpression_AST;
	}
	
	public final void functionCallExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionCallExpression_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_list:
			{
				listStatementExpression();
				astFactory.addASTChild(currentAST, returnAST);
				functionCallExpression_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_require:
			case LITERAL_require_once:
			{
				requireStatementExpression();
				astFactory.addASTChild(currentAST, returnAST);
				functionCallExpression_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_include:
			case LITERAL_include_once:
			{
				includeStatementExpression();
				astFactory.addASTChild(currentAST, returnAST);
				functionCallExpression_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_self:
			case LITERAL_parent:
			case BAND:
			case LPAREN:
			case LCURLY:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				{
				arrayAccessExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				{
				_loop259:
				do {
					if ((LA(1)==LPAREN)) {
						AST tmp203_AST = null;
						tmp203_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp203_AST);
						match(LPAREN);
						if ( inputState.guessing==0 ) {
							tmp203_AST.setType(FUNC_CALL);
						}
						{
						switch ( LA(1)) {
						case LITERAL_new:
						case LITERAL_clone:
						case LITERAL_require:
						case LITERAL_require_once:
						case LITERAL_include:
						case LITERAL_include_once:
						case LITERAL_self:
						case LITERAL_parent:
						case LITERAL_list:
						case DOG:
						case PLUS:
						case MINUS:
						case BAND:
						case INC:
						case DEC:
						case LPAREN:
						case LCURLY:
						case LNOT:
						case IDENT:
						case VARIABLE:
						case COMPOUND_VAR_START:
						case HEREDOC:
						case STRING:
						case NUMBER:
						case BNOT:
						case LITERAL_true:
						case LITERAL_false:
						case LITERAL_null:
						case LITERAL_array:
						{
							expressionList();
							astFactory.addASTChild(currentAST, returnAST);
							break;
						}
						case RPAREN:
						{
							break;
						}
						default:
						{
							throw new NoViableAltException(LT(1), getFilename());
						}
						}
						}
						AST tmp204_AST = null;
						tmp204_AST = astFactory.create(LT(1));
						astFactory.addASTChild(currentAST, tmp204_AST);
						match(RPAREN);
					}
					else {
						break _loop259;
					}
					
				} while (true);
				}
				}
				functionCallExpression_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		returnAST = functionCallExpression_AST;
	}
	
	public final void arrayAccessExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST arrayAccessExpression_AST = null;
		
		try {      // for error handling
			newExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop267:
			do {
				boolean synPredMatched263 = false;
				if (((LA(1)==LBRACK) && (_tokenSet_5.member(LA(2))))) {
					int _m263 = mark();
					synPredMatched263 = true;
					inputState.guessing++;
					try {
						{
						match(LBRACK);
						expression(true, allowComma);
						match(RBRACK);
						}
					}
					catch (RecognitionException pe) {
						synPredMatched263 = false;
					}
					rewind(_m263);
inputState.guessing--;
				}
				if ( synPredMatched263 ) {
					{
					AST tmp205_AST = null;
					tmp205_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp205_AST);
					match(LBRACK);
					if ( inputState.guessing==0 ) {
						tmp205_AST.setType(INDEX_OP);
					}
					expression(true, allowComma);
					astFactory.addASTChild(currentAST, returnAST);
					AST tmp206_AST = null;
					tmp206_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp206_AST);
					match(RBRACK);
					}
				}
				else if ((LA(1)==LBRACK) && (LA(2)==RBRACK)) {
					{
					AST tmp207_AST = null;
					tmp207_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp207_AST);
					match(LBRACK);
					AST tmp208_AST = null;
					tmp208_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp208_AST);
					match(RBRACK);
					}
				}
				else if ((LA(1)==LCURLY)) {
					{
					AST tmp209_AST = null;
					tmp209_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp209_AST);
					match(LCURLY);
					if ( inputState.guessing==0 ) {
						tmp209_AST.setType(CHAR_ACCESS);
					}
					expression(true, false);
					astFactory.addASTChild(currentAST, returnAST);
					AST tmp210_AST = null;
					tmp210_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp210_AST);
					match(RCURLY);
					}
				}
				else {
					break _loop267;
				}
				
			} while (true);
			}
			arrayAccessExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_48);
			} else {
			  throw ex;
			}
		}
		returnAST = arrayAccessExpression_AST;
	}
	
	public final void newExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST newExpression_AST = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_new:
			{
				AST tmp211_AST = null;
				tmp211_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp211_AST);
				match(LITERAL_new);
				break;
			}
			case LITERAL_clone:
			{
				AST tmp212_AST = null;
				tmp212_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp212_AST);
				match(LITERAL_clone);
				break;
			}
			case LITERAL_self:
			case LITERAL_parent:
			case BAND:
			case LPAREN:
			case LCURLY:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			referenceExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			newExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_20);
			} else {
			  throw ex;
			}
		}
		returnAST = newExpression_AST;
	}
	
	public final void referenceExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST referenceExpression_AST = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case BAND:
			{
				AST tmp213_AST = null;
				tmp213_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp213_AST);
				match(BAND);
				if ( inputState.guessing==0 ) {
					tmp213_AST.setType(REFERENCE);
				}
				break;
			}
			case LITERAL_self:
			case LITERAL_parent:
			case LPAREN:
			case LCURLY:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			basicExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			referenceExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_20);
			} else {
			  throw ex;
			}
		}
		returnAST = referenceExpression_AST;
	}
	
	public final void basicExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST basicExpression_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_true:
			{
				AST tmp214_AST = null;
				tmp214_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp214_AST);
				match(LITERAL_true);
				basicExpression_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_false:
			{
				AST tmp215_AST = null;
				tmp215_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp215_AST);
				match(LITERAL_false);
				basicExpression_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_null:
			{
				AST tmp216_AST = null;
				tmp216_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp216_AST);
				match(LITERAL_null);
				basicExpression_AST = (AST)currentAST.root;
				break;
			}
			case NUMBER:
			{
				{
				AST tmp217_AST = null;
				tmp217_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp217_AST);
				match(NUMBER);
				}
				basicExpression_AST = (AST)currentAST.root;
				break;
			}
			case STRING:
			{
				{
				AST tmp218_AST = null;
				tmp218_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp218_AST);
				match(STRING);
				}
				basicExpression_AST = (AST)currentAST.root;
				break;
			}
			case HEREDOC:
			{
				{
				AST tmp219_AST = null;
				tmp219_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp219_AST);
				match(HEREDOC);
				}
				basicExpression_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_array:
			{
				arrayDefinition();
				astFactory.addASTChild(currentAST, returnAST);
				basicExpression_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_self:
			case LITERAL_parent:
			case LCURLY:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			{
				identifier();
				astFactory.addASTChild(currentAST, returnAST);
				basicExpression_AST = (AST)currentAST.root;
				break;
			}
			case LPAREN:
			{
				{
				AST tmp220_AST = null;
				tmp220_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp220_AST);
				match(LPAREN);
				expression(false, allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp221_AST = null;
				tmp221_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp221_AST);
				match(RPAREN);
				}
				basicExpression_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_20);
			} else {
			  throw ex;
			}
		}
		returnAST = basicExpression_AST;
	}
	
	public final void arrayDefinition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST arrayDefinition_AST = null;
		
		try {      // for error handling
			AST tmp222_AST = null;
			tmp222_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp222_AST);
			match(LITERAL_array);
			AST tmp223_AST = null;
			tmp223_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp223_AST);
			match(LPAREN);
			arrayItemList();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp224_AST = null;
			tmp224_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp224_AST);
			match(RPAREN);
			arrayDefinition_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_20);
			} else {
			  throw ex;
			}
		}
		returnAST = arrayDefinition_AST;
	}
	
	public final void scopeResolutionExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST scopeResolutionExpression_AST = null;
		
		try {      // for error handling
			{
			baseIdentifier();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop281:
			do {
				if ((LA(1)==DOUBLECOLON)) {
					AST tmp225_AST = null;
					tmp225_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp225_AST);
					match(DOUBLECOLON);
					baseIdentifier();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop281;
				}
				
			} while (true);
			}
			}
			scopeResolutionExpression_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_20);
			} else {
			  throw ex;
			}
		}
		returnAST = scopeResolutionExpression_AST;
	}
	
	public final void baseIdentifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST baseIdentifier_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_parent:
			{
				AST tmp226_AST = null;
				tmp226_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp226_AST);
				match(LITERAL_parent);
				baseIdentifier_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_self:
			{
				AST tmp227_AST = null;
				tmp227_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp227_AST);
				match(LITERAL_self);
				baseIdentifier_AST = (AST)currentAST.root;
				break;
			}
			case IDENT:
			{
				AST tmp228_AST = null;
				tmp228_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp228_AST);
				match(IDENT);
				baseIdentifier_AST = (AST)currentAST.root;
				break;
			}
			case VARIABLE:
			{
				AST tmp229_AST = null;
				tmp229_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp229_AST);
				match(VARIABLE);
				baseIdentifier_AST = (AST)currentAST.root;
				break;
			}
			case LCURLY:
			case COMPOUND_VAR_START:
			{
				compositeIdentifier();
				astFactory.addASTChild(currentAST, returnAST);
				baseIdentifier_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_49);
			} else {
			  throw ex;
			}
		}
		returnAST = baseIdentifier_AST;
	}
	
	public final void compositeIdentifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST compositeIdentifier_AST = null;
		
		try {      // for error handling
			{
			if ((LA(1)==COMPOUND_VAR_START)) {
				AST tmp230_AST = null;
				tmp230_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp230_AST);
				match(COMPOUND_VAR_START);
			}
			else if (((LA(1)==LCURLY))&&(metMMBR)) {
				AST tmp231_AST = null;
				tmp231_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp231_AST);
				match(LCURLY);
				if ( inputState.guessing==0 ) {
					tmp231_AST.setType(INDIRECT_VAR_ID);
				}
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			expression(false, true);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp232_AST = null;
			tmp232_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp232_AST);
			match(RCURLY);
			compositeIdentifier_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_49);
			} else {
			  throw ex;
			}
		}
		returnAST = compositeIdentifier_AST;
	}
	
	public final void arrayItemList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST arrayItemList_AST = null;
		
		try {      // for error handling
			arrayItem();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop286:
			do {
				if ((LA(1)==COMMA)) {
					AST tmp233_AST = null;
					tmp233_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp233_AST);
					match(COMMA);
					arrayItem();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop286;
				}
				
			} while (true);
			}
			arrayItemList_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_25);
			} else {
			  throw ex;
			}
		}
		returnAST = arrayItemList_AST;
	}
	
	public final void arrayItem() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST arrayItem_AST = null;
		AST exp_AST = null;
		Token  assoc = null;
		AST assoc_AST = null;
		AST exp2_AST = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_list:
			case DOG:
			case PLUS:
			case MINUS:
			case BAND:
			case INC:
			case DEC:
			case LPAREN:
			case LCURLY:
			case LNOT:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case BNOT:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_array:
			{
				expression(true, false);
				exp_AST = (AST)returnAST;
				{
				switch ( LA(1)) {
				case ASSOCIATE:
				{
					{
					assoc = LT(1);
					assoc_AST = astFactory.create(assoc);
					match(ASSOCIATE);
					expression(true, false);
					exp2_AST = (AST)returnAST;
					if ( inputState.guessing==0 ) {
						arrayItem_AST = (AST)currentAST.root;
						arrayItem_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ARRAY_ELEM,"ARRAY_ELEM")).add((AST)astFactory.make( (new ASTArray(3)).add(assoc_AST).add(exp_AST).add(exp2_AST))));
						
						currentAST.root = arrayItem_AST;
						currentAST.child = arrayItem_AST!=null &&arrayItem_AST.getFirstChild()!=null ?
							arrayItem_AST.getFirstChild() : arrayItem_AST;
						currentAST.advanceChildToEnd();
					}
					}
					break;
				}
				case RPAREN:
				case COMMA:
				{
					if ( inputState.guessing==0 ) {
						arrayItem_AST = (AST)currentAST.root;
						arrayItem_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ARRAY_ELEM,"ARRAY_ELEM")).add(exp_AST));
						
						currentAST.root = arrayItem_AST;
						currentAST.child = arrayItem_AST!=null &&arrayItem_AST.getFirstChild()!=null ?
							arrayItem_AST.getFirstChild() : arrayItem_AST;
						currentAST.advanceChildToEnd();
					}
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				break;
			}
			case RPAREN:
			case COMMA:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_23);
			} else {
			  throw ex;
			}
		}
		returnAST = arrayItem_AST;
	}
	
	public final void typeIdentifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST typeIdentifier_AST = null;
		
		try {      // for error handling
			AST tmp234_AST = null;
			tmp234_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp234_AST);
			match(IDENT);
			{
			_loop296:
			do {
				if ((LA(1)==DOUBLECOLON)) {
					AST tmp235_AST = null;
					tmp235_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp235_AST);
					match(DOUBLECOLON);
					AST tmp236_AST = null;
					tmp236_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp236_AST);
					match(IDENT);
				}
				else {
					break _loop296;
				}
				
			} while (true);
			}
			typeIdentifier_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_31);
			} else {
			  throw ex;
			}
		}
		returnAST = typeIdentifier_AST;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"\"abstract\"",
		"\"while\"",
		"\"do\"",
		"\"for\"",
		"\"function\"",
		"\"switch\"",
		"\"case\"",
		"\"default\"",
		"\"if\"",
		"\"else\"",
		"\"elseif\"",
		"\"foreach\"",
		"\"goto\"",
		"\"throw\"",
		"\"return\"",
		"\"try\"",
		"\"catch\"",
		"\"break\"",
		"\"continue\"",
		"\"finally\"",
		"\"print\"",
		"\"new\"",
		"\"clone\"",
		"\"void\"",
		"\"class\"",
		"\"public\"",
		"\"use\"",
		"\"namespace\"",
		"\"protected\"",
		"\"private\"",
		"\"final\"",
		"\"const\"",
		"\"static\"",
		"\"interface\"",
		"\"implements\"",
		"\"extends\"",
		"\"require\"",
		"\"require_once\"",
		"\"include\"",
		"\"include_once\"",
		"\"define\"",
		"\"echo\"",
		"\"die\"",
		"\"exit\"",
		"\"endwhile\"",
		"\"endif\"",
		"\"endfor\"",
		"\"endforeach\"",
		"\"endswitch\"",
		"\"and\"",
		"\"or\"",
		"\"xor\"",
		"\"as\"",
		"\"instanceof\"",
		"\"var\"",
		"\"declare\"",
		"\"self\"",
		"\"parent\"",
		"\"global\"",
		"\"list\"",
		"DOG",
		"IDENTICAL",
		"EQUAL",
		"LESS",
		"GREATER",
		"LE",
		"GE",
		"NONIDENT",
		"NE",
		"PLUS_ASS",
		"MINUS_ASS",
		"MULT_ASS",
		"AND_ASS",
		"OR_ASS",
		"XOR_ASS",
		"DIV_ASS",
		"SHL_ASS",
		"SHR_ASS",
		"DOT_ASS",
		"MOD_ASS",
		"PLUS",
		"MINUS",
		"ASTERISK",
		"SLASH",
		"MOD",
		"LAND",
		"BAND",
		"INC",
		"DEC",
		"DOT",
		"MMBR",
		"DOUBLECOLON",
		"SHL",
		"SHR",
		"ASSIGN",
		"LOR",
		"BOR",
		"BXOR",
		"BW_NOT",
		"QUESTION",
		"LPAREN",
		"RPAREN",
		"LCURLY",
		"RCURLY",
		"LBRACK",
		"RBRACK",
		"COMMA",
		"SEMI",
		"COLON",
		"ASSOCIATE",
		"LNOT",
		"LETTER",
		"DIGIT",
		"DIGIT_NOZERO",
		"ESCAPE",
		"BUCK",
		"IDENT",
		"VARIABLE",
		"VAR_START",
		"COMPOUND_VAR_START",
		"HEREDOC",
		"DOUBLE_SLASH",
		"SHARP",
		"SL_COMMENT",
		"SL_SHARP_COMMENT",
		"ML_COMMENT",
		"NEWLINE",
		"SPACE",
		"TAB",
		"BSLASH",
		"STRING",
		"PHP_START",
		"PHP_END",
		"EXPONENT",
		"NUMBER",
		"PARAMETERS",
		"PARAMETER_DEF",
		"ELIST",
		"EXPR",
		"FUNCTION_DEF",
		"FUNCTION_BODY",
		"FOR_INIT",
		"FOR_CONDITION",
		"FOR_ITERATOR",
		"COLON_SLIST",
		"LABEL",
		"TYPE_CAST",
		"CLASS_BODY",
		"MODIFIERS",
		"MEMBER_DEF",
		"FUNC_CALL",
		"TYPE",
		"VARIABLE_DEF",
		"CASE_GROUP",
		"SLIST",
		"POST_INC",
		"POST_DEC",
		"ARRAY_DECLARATOR",
		"ARRAY_INIT",
		"ARRAY_ELEM",
		"ARRAY_INDEX",
		"UNARY_PLUS",
		"UNARY_MINUS",
		"REFERENCE",
		"IDENTIFIER",
		"INDEX_OP",
		"CHAR_ACCESS",
		"INDIRECT_VAR_ID",
		"CONST_ID",
		"VAR_ID",
		"BAND_ASS",
		"BOR_ASS",
		"BNOT",
		"\"true\"",
		"\"false\"",
		"\"null\"",
		"\"array\"",
		"\"int\"",
		"\"float\"",
		"\"double\"",
		"\"object\"",
		"\"string\"",
		"\"bool\"",
		"\"boolean\"",
		"\"resource\""
	};
	
	protected void buildTokenTypeASTClassMap() {
		tokenTypeToASTClassMap=null;
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { -576180170303499280L, 1947108649427009537L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 2L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 137707389200L, 72057594037927936L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 268435456L, 72339069081747456L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { -576180170303499280L, 1947117445520031745L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { -5764591030259154944L, 1946686436961943553L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { -5557425447400112128L, 1946915959541334015L, 2305772640469517376L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { -571958045652811790L, 1947117445520031745L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { -283727604539719694L, 1947117445520031745L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { -575617220350053392L, 1947108649427009537L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { -364792462793768974L, 1947206230611066879L, 2305772640469517376L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { -76562021671239694L, 1947206230611066879L, 2305772640469517376L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = { -575054270396656656L, 1947108649427009537L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {
		long[] data = { -573928370489814032L, 1947108649427009537L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {
		long[] data = { -571958045643374606L, 1947117445520031745L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {
		long[] data = { -5485367853362184192L, 1947806563959832575L, 2305772640469517376L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	private static final long[] mk_tokenSet_16() {
		long[] data = { 279223176896970752L, 1102533137268734L, 211106232532992L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
	private static final long[] mk_tokenSet_17() {
		long[] data = { 4222124650684416L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
	private static final long[] mk_tokenSet_18() {
		long[] data = { 562949953445888L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	private static final long[] mk_tokenSet_19() {
		long[] data = { 562949953421312L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
	private static final long[] mk_tokenSet_20() {
		long[] data = { 279223176896970752L, 1125622881452030L, 211106232532992L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_20 = new BitSet(mk_tokenSet_20());
	private static final long[] mk_tokenSet_21() {
		long[] data = { 0L, 211106232532992L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_21 = new BitSet(mk_tokenSet_21());
	private static final long[] mk_tokenSet_22() {
		long[] data = { 3072L, 8796093022208L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_22 = new BitSet(mk_tokenSet_22());
	private static final long[] mk_tokenSet_23() {
		long[] data = { 0L, 72567767433216L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_23 = new BitSet(mk_tokenSet_23());
	private static final long[] mk_tokenSet_24() {
		long[] data = { 0L, 17179869184L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_24 = new BitSet(mk_tokenSet_24());
	private static final long[] mk_tokenSet_25() {
		long[] data = { 0L, 2199023255552L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_25 = new BitSet(mk_tokenSet_25());
	private static final long[] mk_tokenSet_26() {
		long[] data = { 0L, 145135534866432L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_26 = new BitSet(mk_tokenSet_26());
	private static final long[] mk_tokenSet_27() {
		long[] data = { 0L, 72057594037927936L, 2301339409586323456L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_27 = new BitSet(mk_tokenSet_27());
	private static final long[] mk_tokenSet_28() {
		long[] data = { 3458764513820540928L, 792637934611202048L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_28 = new BitSet(mk_tokenSet_28());
	private static final long[] mk_tokenSet_29() {
		long[] data = { 3458764513820540928L, 792637932463718400L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_29 = new BitSet(mk_tokenSet_29());
	private static final long[] mk_tokenSet_30() {
		long[] data = { -5764591030259154944L, 1946759024056729601L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_30 = new BitSet(mk_tokenSet_30());
	private static final long[] mk_tokenSet_31() {
		long[] data = { 3458764513820540928L, 792640131554082816L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_31 = new BitSet(mk_tokenSet_31());
	private static final long[] mk_tokenSet_32() {
		long[] data = { 824633720832L, 74766790688768L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_32 = new BitSet(mk_tokenSet_32());
	private static final long[] mk_tokenSet_33() {
		long[] data = { 824633720832L, 4398046511104L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_33 = new BitSet(mk_tokenSet_33());
	private static final long[] mk_tokenSet_34() {
		long[] data = { 133680857360L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_34 = new BitSet(mk_tokenSet_34());
	private static final long[] mk_tokenSet_35() {
		long[] data = { 133680857360L, 8796093022208L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_35 = new BitSet(mk_tokenSet_35());
	private static final long[] mk_tokenSet_36() {
		long[] data = { 3746994889972252928L, 792637932463718400L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_36 = new BitSet(mk_tokenSet_36());
	private static final long[] mk_tokenSet_37() {
		long[] data = { 268435456L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_37 = new BitSet(mk_tokenSet_37());
	private static final long[] mk_tokenSet_38() {
		long[] data = { 274877906944L, 4398046511104L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_38 = new BitSet(mk_tokenSet_38());
	private static final long[] mk_tokenSet_39() {
		long[] data = { 3746995023653110032L, 792637932463718400L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_39 = new BitSet(mk_tokenSet_39());
	private static final long[] mk_tokenSet_40() {
		long[] data = { 3746995023653110032L, 792646728556740608L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_40 = new BitSet(mk_tokenSet_40());
	private static final long[] mk_tokenSet_41() {
		long[] data = { 0L, 140737488355328L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_41 = new BitSet(mk_tokenSet_41());
	private static final long[] mk_tokenSet_42() {
		long[] data = { 0L, 17180917248L, 211106232532992L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_42 = new BitSet(mk_tokenSet_42());
	private static final long[] mk_tokenSet_43() {
		long[] data = { -4504427642748942L, 1947806563959832575L, 2305772640469517376L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_43 = new BitSet(mk_tokenSet_43());
	private static final long[] mk_tokenSet_44() {
		long[] data = { 0L, 390L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_44 = new BitSet(mk_tokenSet_44());
	private static final long[] mk_tokenSet_45() {
		long[] data = { -5764591030259154944L, 1945560537055100929L, 8725724278031424L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_45 = new BitSet(mk_tokenSet_45());
	private static final long[] mk_tokenSet_46() {
		long[] data = { -5764591030259154944L, 1945560537051955200L, 8444249301320768L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_46 = new BitSet(mk_tokenSet_46());
	private static final long[] mk_tokenSet_47() {
		long[] data = { -5485367853362184192L, 1947806563959832575L, 8936830510564416L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_47 = new BitSet(mk_tokenSet_47());
	private static final long[] mk_tokenSet_48() {
		long[] data = { 279223176896970752L, 1103632648896510L, 211106232532992L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_48 = new BitSet(mk_tokenSet_48());
	private static final long[] mk_tokenSet_49() {
		long[] data = { 279223176896970752L, 1125625028935678L, 211106232532992L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_49 = new BitSet(mk_tokenSet_49());
	
	}
