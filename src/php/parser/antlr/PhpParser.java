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
		returnAST = program_AST;
	}
	
	public final void statement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST statement_AST = null;
		
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
			if ((LA(1)==LITERAL_print) && (_tokenSet_1.member(LA(2)))) {
				printStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==LITERAL_return) && (_tokenSet_2.member(LA(2)))) {
				returnStatement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_3.member(LA(1))) && (_tokenSet_4.member(LA(2)))) {
				declaration();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==LCURLY) && (_tokenSet_5.member(LA(2)))) {
				block();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_1.member(LA(1))) && (_tokenSet_6.member(LA(2)))) {
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
		returnAST = statement_AST;
	}
	
	public final void declaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST declaration_AST = null;
		
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
		case LITERAL_final:
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
		returnAST = declaration_AST;
	}
	
	public final void functionDeclaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionDeclaration_AST = null;
		AST fh_AST = null;
		AST b_AST = null;
		
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
		returnAST = functionDeclaration_AST;
	}
	
	public final void labelDeclaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST labelDeclaration_AST = null;
		
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
		returnAST = labelDeclaration_AST;
	}
	
	public final void classDeclaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST classDeclaration_AST = null;
		
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
		returnAST = classDeclaration_AST;
	}
	
	public final void interfaceDeclaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST interfaceDeclaration_AST = null;
		
		AST tmp6_AST = null;
		tmp6_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp6_AST);
		match(LITERAL_interface);
		className();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop139:
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
				break _loop139;
			}
			}
		} while (true);
		}
		interfaceBody();
		astFactory.addASTChild(currentAST, returnAST);
		interfaceDeclaration_AST = (AST)currentAST.root;
		returnAST = interfaceDeclaration_AST;
	}
	
	public final void ifStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST ifStatement_AST = null;
		
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
		if (((LA(1)==COLON) && (_tokenSet_7.member(LA(2))))) {
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
		else if ((_tokenSet_0.member(LA(1))) && (_tokenSet_8.member(LA(2)))) {
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
			else if ((_tokenSet_9.member(LA(1))) && (_tokenSet_10.member(LA(2)))) {
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
		returnAST = ifStatement_AST;
	}
	
	public final void switchStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST switchStatement_AST = null;
		
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
		returnAST = switchStatement_AST;
	}
	
	public final void whileStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST whileStatement_AST = null;
		
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
		returnAST = whileStatement_AST;
	}
	
	public final void doWhileStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST doWhileStatement_AST = null;
		
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
		returnAST = doWhileStatement_AST;
	}
	
	public final void forStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST forStatement_AST = null;
		
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
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_new:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_require:
		case LITERAL_require_once:
		case LITERAL_include:
		case LITERAL_include_once:
		case LITERAL_define:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_die:
		case LITERAL_exit:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
		case DOG:
		case PLUS:
		case MINUS:
		case BAND:
		case INC:
		case DEC:
		case BW_NOT:
		case LPAREN:
		case LCURLY:
		case LNOT:
		case IDENT:
		case VARIABLE:
		case COMPOUND_VAR_START:
		case HEREDOC:
		case STRING:
		case NUMBER:
		case LITERAL_null:
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
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_new:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_require:
		case LITERAL_require_once:
		case LITERAL_include:
		case LITERAL_include_once:
		case LITERAL_define:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_die:
		case LITERAL_exit:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
		case DOG:
		case PLUS:
		case MINUS:
		case BAND:
		case INC:
		case DEC:
		case BW_NOT:
		case LPAREN:
		case LCURLY:
		case LNOT:
		case IDENT:
		case VARIABLE:
		case COMPOUND_VAR_START:
		case HEREDOC:
		case STRING:
		case NUMBER:
		case LITERAL_null:
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
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_new:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_require:
		case LITERAL_require_once:
		case LITERAL_include:
		case LITERAL_include_once:
		case LITERAL_define:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_die:
		case LITERAL_exit:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
		case DOG:
		case PLUS:
		case MINUS:
		case BAND:
		case INC:
		case DEC:
		case BW_NOT:
		case LPAREN:
		case LCURLY:
		case LNOT:
		case IDENT:
		case VARIABLE:
		case COMPOUND_VAR_START:
		case HEREDOC:
		case STRING:
		case NUMBER:
		case LITERAL_null:
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
		boolean synPredMatched94 = false;
		if (((LA(1)==COLON) && (_tokenSet_11.member(LA(2))))) {
			int _m94 = mark();
			synPredMatched94 = true;
			inputState.guessing++;
			try {
				{
				match(COLON);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched94 = false;
			}
			rewind(_m94);
inputState.guessing--;
		}
		if ( synPredMatched94 ) {
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
		else if ((_tokenSet_0.member(LA(1))) && (_tokenSet_8.member(LA(2)))) {
			statement();
			astFactory.addASTChild(currentAST, returnAST);
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		forStatement_AST = (AST)currentAST.root;
		returnAST = forStatement_AST;
	}
	
	public final void foreachStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST foreachStatement_AST = null;
		
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
		boolean synPredMatched99 = false;
		if (((LA(1)==COLON) && (_tokenSet_12.member(LA(2))))) {
			int _m99 = mark();
			synPredMatched99 = true;
			inputState.guessing++;
			try {
				{
				match(COLON);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched99 = false;
			}
			rewind(_m99);
inputState.guessing--;
		}
		if ( synPredMatched99 ) {
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
		else if ((_tokenSet_0.member(LA(1))) && (_tokenSet_8.member(LA(2)))) {
			statement();
			astFactory.addASTChild(currentAST, returnAST);
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		foreachStatement_AST = (AST)currentAST.root;
		returnAST = foreachStatement_AST;
	}
	
	public final void echoStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST echoStatement_AST = null;
		
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
		returnAST = echoStatement_AST;
	}
	
	public final void printStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST printStatement_AST = null;
		
		AST tmp38_AST = null;
		tmp38_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp38_AST);
		match(LITERAL_print);
		{
		expression(true, false);
		astFactory.addASTChild(currentAST, returnAST);
		}
		AST tmp39_AST = null;
		tmp39_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp39_AST);
		match(SEMI);
		printStatement_AST = (AST)currentAST.root;
		returnAST = printStatement_AST;
	}
	
	public final void breakStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST breakStatement_AST = null;
		
		AST tmp40_AST = null;
		tmp40_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp40_AST);
		match(LITERAL_break);
		{
		switch ( LA(1)) {
		case NUMBER:
		{
			AST tmp41_AST = null;
			tmp41_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp41_AST);
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
		AST tmp42_AST = null;
		tmp42_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp42_AST);
		match(SEMI);
		breakStatement_AST = (AST)currentAST.root;
		returnAST = breakStatement_AST;
	}
	
	public final void continueStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST continueStatement_AST = null;
		
		AST tmp43_AST = null;
		tmp43_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp43_AST);
		match(LITERAL_continue);
		{
		switch ( LA(1)) {
		case NUMBER:
		{
			AST tmp44_AST = null;
			tmp44_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp44_AST);
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
		AST tmp45_AST = null;
		tmp45_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp45_AST);
		match(SEMI);
		continueStatement_AST = (AST)currentAST.root;
		returnAST = continueStatement_AST;
	}
	
	public final void returnStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST returnStatement_AST = null;
		
		AST tmp46_AST = null;
		tmp46_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp46_AST);
		match(LITERAL_return);
		{
		switch ( LA(1)) {
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_new:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_require:
		case LITERAL_require_once:
		case LITERAL_include:
		case LITERAL_include_once:
		case LITERAL_define:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_die:
		case LITERAL_exit:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
		case DOG:
		case PLUS:
		case MINUS:
		case BAND:
		case INC:
		case DEC:
		case BW_NOT:
		case LPAREN:
		case LCURLY:
		case LNOT:
		case IDENT:
		case VARIABLE:
		case COMPOUND_VAR_START:
		case HEREDOC:
		case STRING:
		case NUMBER:
		case LITERAL_null:
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
		AST tmp47_AST = null;
		tmp47_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp47_AST);
		match(SEMI);
		returnStatement_AST = (AST)currentAST.root;
		returnAST = returnStatement_AST;
	}
	
	public final void gotoStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST gotoStatement_AST = null;
		
		AST tmp48_AST = null;
		tmp48_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp48_AST);
		match(LITERAL_goto);
		AST tmp49_AST = null;
		tmp49_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp49_AST);
		match(IDENT);
		AST tmp50_AST = null;
		tmp50_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp50_AST);
		match(SEMI);
		gotoStatement_AST = (AST)currentAST.root;
		returnAST = gotoStatement_AST;
	}
	
	public final void declareStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST declareStatement_AST = null;
		
		AST tmp51_AST = null;
		tmp51_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp51_AST);
		match(LITERAL_declare);
		AST tmp52_AST = null;
		tmp52_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp52_AST);
		match(LPAREN);
		expression(true, true);
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp53_AST = null;
		tmp53_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp53_AST);
		match(RPAREN);
		statement();
		astFactory.addASTChild(currentAST, returnAST);
		declareStatement_AST = (AST)currentAST.root;
		returnAST = declareStatement_AST;
	}
	
	public final void throwStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST throwStatement_AST = null;
		
		AST tmp54_AST = null;
		tmp54_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp54_AST);
		match(LITERAL_throw);
		expression(true, true);
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp55_AST = null;
		tmp55_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp55_AST);
		match(SEMI);
		throwStatement_AST = (AST)currentAST.root;
		returnAST = throwStatement_AST;
	}
	
	public final void globalStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST globalStatement_AST = null;
		
		AST tmp56_AST = null;
		tmp56_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp56_AST);
		match(LITERAL_global);
		identifier();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop34:
		do {
			if ((LA(1)==COMMA)) {
				AST tmp57_AST = null;
				tmp57_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp57_AST);
				match(COMMA);
				identifier();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop34;
			}
			
		} while (true);
		}
		AST tmp58_AST = null;
		tmp58_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp58_AST);
		match(SEMI);
		globalStatement_AST = (AST)currentAST.root;
		returnAST = globalStatement_AST;
	}
	
	public final void staticStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST staticStatement_AST = null;
		
		AST tmp59_AST = null;
		tmp59_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp59_AST);
		match(LITERAL_static);
		staticVarDefinition();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop37:
		do {
			if ((LA(1)==COMMA)) {
				AST tmp60_AST = null;
				tmp60_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp60_AST);
				match(COMMA);
				staticVarDefinition();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop37;
			}
			
		} while (true);
		}
		AST tmp61_AST = null;
		tmp61_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp61_AST);
		match(SEMI);
		staticStatement_AST = (AST)currentAST.root;
		returnAST = staticStatement_AST;
	}
	
	public final void tryCatchStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST tryCatchStatement_AST = null;
		
		AST tmp62_AST = null;
		tmp62_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp62_AST);
		match(LITERAL_try);
		block();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop72:
		do {
			if ((LA(1)==LITERAL_catch)) {
				catchBlock();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop72;
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
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_new:
		case LITERAL_clone:
		case LITERAL_class:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_static:
		case LITERAL_interface:
		case LITERAL_require:
		case LITERAL_require_once:
		case LITERAL_include:
		case LITERAL_include_once:
		case LITERAL_define:
		case LITERAL_true:
		case LITERAL_false:
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
		case BW_NOT:
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
		case LITERAL_null:
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
		returnAST = tryCatchStatement_AST;
	}
	
	public final void emptyStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST emptyStatement_AST = null;
		
		AST tmp63_AST = null;
		tmp63_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp63_AST);
		match(SEMI);
		emptyStatement_AST = (AST)currentAST.root;
		returnAST = emptyStatement_AST;
	}
	
	public final void block() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST block_AST = null;
		
		AST tmp64_AST = null;
		tmp64_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp64_AST);
		match(LCURLY);
		if ( inputState.guessing==0 ) {
			tmp64_AST.setType(SLIST);
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
		AST tmp65_AST = null;
		tmp65_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp65_AST);
		match(RCURLY);
		block_AST = (AST)currentAST.root;
		returnAST = block_AST;
	}
	
	public final void expression(
		boolean imagNode, boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST expression_AST = null;
		
		{
		if (((_tokenSet_1.member(LA(1))) && (_tokenSet_13.member(LA(2))))&&(allowComma)) {
			logicalOrExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop185:
			do {
				if ((LA(1)==COMMA) && (_tokenSet_1.member(LA(2)))) {
					AST tmp66_AST = null;
					tmp66_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp66_AST);
					match(COMMA);
					logicalOrExpression(allowComma);
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop185;
				}
				
			} while (true);
			}
		}
		else if ((_tokenSet_1.member(LA(1))) && (_tokenSet_13.member(LA(2)))) {
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
		returnAST = expression_AST;
	}
	
	public final void colonStatementList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST colonStatementList_AST = null;
		Token  cln = null;
		AST cln_AST = null;
		
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
		returnAST = colonStatementList_AST;
	}
	
	public final void elseifColonStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elseifColonStatement_AST = null;
		
		AST tmp67_AST = null;
		tmp67_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp67_AST);
		match(LITERAL_elseif);
		AST tmp68_AST = null;
		tmp68_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp68_AST);
		match(LPAREN);
		expression(true, true);
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp69_AST = null;
		tmp69_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp69_AST);
		match(RPAREN);
		colonStatementList();
		astFactory.addASTChild(currentAST, returnAST);
		elseifColonStatement_AST = (AST)currentAST.root;
		returnAST = elseifColonStatement_AST;
	}
	
	public final void elseColonStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elseColonStatement_AST = null;
		
		AST tmp70_AST = null;
		tmp70_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp70_AST);
		match(LITERAL_else);
		colonStatementList();
		astFactory.addASTChild(currentAST, returnAST);
		elseColonStatement_AST = (AST)currentAST.root;
		returnAST = elseColonStatement_AST;
	}
	
	public final void elseifStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elseifStatement_AST = null;
		
		AST tmp71_AST = null;
		tmp71_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp71_AST);
		match(LITERAL_elseif);
		AST tmp72_AST = null;
		tmp72_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp72_AST);
		match(LPAREN);
		expression(true, true);
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp73_AST = null;
		tmp73_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp73_AST);
		match(RPAREN);
		statement();
		astFactory.addASTChild(currentAST, returnAST);
		elseifStatement_AST = (AST)currentAST.root;
		returnAST = elseifStatement_AST;
	}
	
	public final void elseStatement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elseStatement_AST = null;
		
		AST tmp74_AST = null;
		tmp74_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp74_AST);
		match(LITERAL_else);
		statement();
		astFactory.addASTChild(currentAST, returnAST);
		elseStatement_AST = (AST)currentAST.root;
		returnAST = elseStatement_AST;
	}
	
	public final void switchBody() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST switchBody_AST = null;
		
		boolean defaultIsMet = false;
		
		
		AST tmp75_AST = null;
		tmp75_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp75_AST);
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
		AST tmp76_AST = null;
		tmp76_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp76_AST);
		match(RCURLY);
		switchBody_AST = (AST)currentAST.root;
		returnAST = switchBody_AST;
	}
	
	public final void defineStatementExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST defineStatementExpression_AST = null;
		
		AST tmp77_AST = null;
		tmp77_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp77_AST);
		match(LITERAL_define);
		AST tmp78_AST = null;
		tmp78_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp78_AST);
		match(LPAREN);
		expression(true, false);
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp79_AST = null;
		tmp79_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp79_AST);
		match(COMMA);
		expression(true, false);
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp80_AST = null;
		tmp80_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp80_AST);
		match(RPAREN);
		defineStatementExpression_AST = (AST)currentAST.root;
		returnAST = defineStatementExpression_AST;
	}
	
	public final void identifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST identifier_AST = null;
		AST id_AST = null;
		
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
		returnAST = identifier_AST;
	}
	
	public final void staticVarDefinition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST staticVarDefinition_AST = null;
		
		identifier();
		astFactory.addASTChild(currentAST, returnAST);
		{
		switch ( LA(1)) {
		case ASSIGN:
		{
			AST tmp81_AST = null;
			tmp81_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp81_AST);
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
		returnAST = staticVarDefinition_AST;
	}
	
	public final void caseOption() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST caseOption_AST = null;
		
		AST tmp82_AST = null;
		tmp82_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp82_AST);
		match(LITERAL_case);
		expression(true, true);
		astFactory.addASTChild(currentAST, returnAST);
		{
		switch ( LA(1)) {
		case COLON:
		{
			AST tmp83_AST = null;
			tmp83_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp83_AST);
			match(COLON);
			break;
		}
		case SEMI:
		{
			AST tmp84_AST = null;
			tmp84_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp84_AST);
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
			if (((_tokenSet_0.member(LA(1))) && (_tokenSet_14.member(LA(2))))&&(LA(1) != LITERAL_default)) {
				statement();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop46;
			}
			
		} while (true);
		}
		caseOption_AST = (AST)currentAST.root;
		returnAST = caseOption_AST;
	}
	
	public final void defaultOption() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST defaultOption_AST = null;
		
		AST tmp85_AST = null;
		tmp85_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp85_AST);
		match(LITERAL_default);
		{
		switch ( LA(1)) {
		case COLON:
		{
			AST tmp86_AST = null;
			tmp86_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp86_AST);
			match(COLON);
			break;
		}
		case SEMI:
		{
			AST tmp87_AST = null;
			tmp87_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp87_AST);
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
			if ((_tokenSet_0.member(LA(1))) && (_tokenSet_14.member(LA(2)))) {
				statement();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop50;
			}
			
		} while (true);
		}
		defaultOption_AST = (AST)currentAST.root;
		returnAST = defaultOption_AST;
	}
	
	public final void requireStatementExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST requireStatementExpression_AST = null;
		
		{
		switch ( LA(1)) {
		case LITERAL_require:
		{
			AST tmp88_AST = null;
			tmp88_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp88_AST);
			match(LITERAL_require);
			break;
		}
		case LITERAL_require_once:
		{
			AST tmp89_AST = null;
			tmp89_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp89_AST);
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
		returnAST = requireStatementExpression_AST;
	}
	
	public final void includeStatementExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST includeStatementExpression_AST = null;
		
		{
		switch ( LA(1)) {
		case LITERAL_include:
		{
			AST tmp90_AST = null;
			tmp90_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp90_AST);
			match(LITERAL_include);
			break;
		}
		case LITERAL_include_once:
		{
			AST tmp91_AST = null;
			tmp91_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp91_AST);
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
		returnAST = includeStatementExpression_AST;
	}
	
	public final void dieStatementExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST dieStatementExpression_AST = null;
		
		AST tmp92_AST = null;
		tmp92_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp92_AST);
		match(LITERAL_die);
		AST tmp93_AST = null;
		tmp93_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp93_AST);
		match(LPAREN);
		{
		switch ( LA(1)) {
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_new:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_require:
		case LITERAL_require_once:
		case LITERAL_include:
		case LITERAL_include_once:
		case LITERAL_define:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_die:
		case LITERAL_exit:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
		case DOG:
		case PLUS:
		case MINUS:
		case BAND:
		case INC:
		case DEC:
		case BW_NOT:
		case LPAREN:
		case LCURLY:
		case LNOT:
		case IDENT:
		case VARIABLE:
		case COMPOUND_VAR_START:
		case HEREDOC:
		case STRING:
		case NUMBER:
		case LITERAL_null:
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
		AST tmp94_AST = null;
		tmp94_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp94_AST);
		match(RPAREN);
		dieStatementExpression_AST = (AST)currentAST.root;
		returnAST = dieStatementExpression_AST;
	}
	
	public final void exitStatementExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exitStatementExpression_AST = null;
		
		AST tmp95_AST = null;
		tmp95_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp95_AST);
		match(LITERAL_exit);
		{
		switch ( LA(1)) {
		case LPAREN:
		{
			AST tmp96_AST = null;
			tmp96_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp96_AST);
			match(LPAREN);
			{
			switch ( LA(1)) {
			case LITERAL_abstract:
			case LITERAL_function:
			case LITERAL_default:
			case LITERAL_return:
			case LITERAL_int:
			case LITERAL_double:
			case LITERAL_float:
			case LITERAL_string:
			case LITERAL_object:
			case LITERAL_bool:
			case LITERAL_boolean:
			case LITERAL_resource:
			case LITERAL_array:
			case LITERAL_print:
			case LITERAL_new:
			case LITERAL_clone:
			case LITERAL_public:
			case LITERAL_namespace:
			case LITERAL_protected:
			case LITERAL_private:
			case LITERAL_final:
			case LITERAL_require:
			case LITERAL_require_once:
			case LITERAL_include:
			case LITERAL_include_once:
			case LITERAL_define:
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_die:
			case LITERAL_exit:
			case LITERAL_self:
			case LITERAL_parent:
			case LITERAL_list:
			case DOG:
			case PLUS:
			case MINUS:
			case BAND:
			case INC:
			case DEC:
			case BW_NOT:
			case LPAREN:
			case LCURLY:
			case LNOT:
			case IDENT:
			case VARIABLE:
			case COMPOUND_VAR_START:
			case HEREDOC:
			case STRING:
			case NUMBER:
			case LITERAL_null:
			{
				expression(false, true);
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
			AST tmp97_AST = null;
			tmp97_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp97_AST);
			match(RPAREN);
			break;
		}
		case LITERAL_and:
		case LITERAL_or:
		case LITERAL_xor:
		case LITERAL_as:
		case LITERAL_instanceof:
		case IDENTICAL:
		case EQUAL:
		case LESS:
		case GREATER:
		case LE:
		case GE:
		case NONIDENT:
		case NE:
		case PLUS_ASS:
		case MINUS_ASS:
		case MULT_ASS:
		case AND_ASS:
		case OR_ASS:
		case XOR_ASS:
		case DIV_ASS:
		case SHL_ASS:
		case SHR_ASS:
		case DOT_ASS:
		case MOD_ASS:
		case PLUS:
		case MINUS:
		case ASTERISK:
		case SLASH:
		case MOD:
		case LAND:
		case BAND:
		case INC:
		case DEC:
		case MMBR:
		case SHL:
		case SHR:
		case ASSIGN:
		case LOR:
		case BOR:
		case BXOR:
		case QUESTION:
		case RPAREN:
		case RCURLY:
		case RBRACK:
		case COMMA:
		case SEMI:
		case COLON:
		case ASSOCIATE:
		case DOT:
		case BAND_ASS:
		case BOR_ASS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		exitStatementExpression_AST = (AST)currentAST.root;
		returnAST = exitStatementExpression_AST;
	}
	
	public final void catchBlock() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST catchBlock_AST = null;
		
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
		returnAST = catchBlock_AST;
	}
	
	public final void finallyBlock() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST finallyBlock_AST = null;
		
		AST tmp101_AST = null;
		tmp101_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp101_AST);
		match(LITERAL_finally);
		block();
		astFactory.addASTChild(currentAST, returnAST);
		finallyBlock_AST = (AST)currentAST.root;
		returnAST = finallyBlock_AST;
	}
	
	public final void paramListElement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST paramListElement_AST = null;
		AST id_AST = null;
		
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
		returnAST = paramListElement_AST;
	}
	
	public final void listStatementExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST listStatementExpression_AST = null;
		
		AST tmp102_AST = null;
		tmp102_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp102_AST);
		match(LITERAL_list);
		listParameters();
		astFactory.addASTChild(currentAST, returnAST);
		listInitializer();
		astFactory.addASTChild(currentAST, returnAST);
		listStatementExpression_AST = (AST)currentAST.root;
		returnAST = listStatementExpression_AST;
	}
	
	public final void listParameters() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST listParameters_AST = null;
		
		AST tmp103_AST = null;
		tmp103_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp103_AST);
		match(LPAREN);
		{
		switch ( LA(1)) {
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_new:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_require:
		case LITERAL_require_once:
		case LITERAL_include:
		case LITERAL_include_once:
		case LITERAL_define:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_die:
		case LITERAL_exit:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
		case DOG:
		case PLUS:
		case MINUS:
		case BAND:
		case INC:
		case DEC:
		case BW_NOT:
		case LPAREN:
		case LCURLY:
		case LNOT:
		case IDENT:
		case VARIABLE:
		case COMPOUND_VAR_START:
		case HEREDOC:
		case STRING:
		case NUMBER:
		case LITERAL_null:
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
		_loop81:
		do {
			if ((LA(1)==COMMA)) {
				AST tmp104_AST = null;
				tmp104_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp104_AST);
				match(COMMA);
				{
				switch ( LA(1)) {
				case LITERAL_abstract:
				case LITERAL_function:
				case LITERAL_default:
				case LITERAL_return:
				case LITERAL_int:
				case LITERAL_double:
				case LITERAL_float:
				case LITERAL_string:
				case LITERAL_object:
				case LITERAL_bool:
				case LITERAL_boolean:
				case LITERAL_resource:
				case LITERAL_array:
				case LITERAL_print:
				case LITERAL_new:
				case LITERAL_clone:
				case LITERAL_public:
				case LITERAL_namespace:
				case LITERAL_protected:
				case LITERAL_private:
				case LITERAL_final:
				case LITERAL_require:
				case LITERAL_require_once:
				case LITERAL_include:
				case LITERAL_include_once:
				case LITERAL_define:
				case LITERAL_true:
				case LITERAL_false:
				case LITERAL_die:
				case LITERAL_exit:
				case LITERAL_self:
				case LITERAL_parent:
				case LITERAL_list:
				case DOG:
				case PLUS:
				case MINUS:
				case BAND:
				case INC:
				case DEC:
				case BW_NOT:
				case LPAREN:
				case LCURLY:
				case LNOT:
				case IDENT:
				case VARIABLE:
				case COMPOUND_VAR_START:
				case HEREDOC:
				case STRING:
				case NUMBER:
				case LITERAL_null:
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
				break _loop81;
			}
			
		} while (true);
		}
		AST tmp105_AST = null;
		tmp105_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp105_AST);
		match(RPAREN);
		listParameters_AST = (AST)currentAST.root;
		returnAST = listParameters_AST;
	}
	
	public final void listInitializer() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST listInitializer_AST = null;
		
		AST tmp106_AST = null;
		tmp106_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp106_AST);
		match(ASSIGN);
		expression(true, false);
		astFactory.addASTChild(currentAST, returnAST);
		listInitializer_AST = (AST)currentAST.root;
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
		returnAST = foreachCondition_AST;
	}
	
	public final void functionHeader() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionHeader_AST = null;
		AST fname_AST = null;
		AST pl_AST = null;
		
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
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_print:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
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
		baseIdentifier();
		fname_AST = (AST)returnAST;
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp109_AST = null;
		tmp109_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp109_AST);
		match(LPAREN);
		{
		switch ( LA(1)) {
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
		case BAND:
		case LCURLY:
		case IDENT:
		case VARIABLE:
		case COMPOUND_VAR_START:
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
		returnAST = functionHeader_AST;
	}
	
	public final void functionBody() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionBody_AST = null;
		Token  lc = null;
		AST lc_AST = null;
		
		lc = LT(1);
		lc_AST = astFactory.create(lc);
		astFactory.makeASTRoot(currentAST, lc_AST);
		match(LCURLY);
		if ( inputState.guessing==0 ) {
			lc.setType(FUNCTION_BODY) ;
		}
		{
		_loop116:
		do {
			if ((_tokenSet_0.member(LA(1)))) {
				statement();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop116;
			}
			
		} while (true);
		}
		AST tmp111_AST = null;
		tmp111_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp111_AST);
		match(RCURLY);
		functionBody_AST = (AST)currentAST.root;
		returnAST = functionBody_AST;
	}
	
	public final void baseIdentifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST baseIdentifier_AST = null;
		
		switch ( LA(1)) {
		case LITERAL_parent:
		{
			AST tmp112_AST = null;
			tmp112_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp112_AST);
			match(LITERAL_parent);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_self:
		{
			AST tmp113_AST = null;
			tmp113_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp113_AST);
			match(LITERAL_self);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_boolean:
		{
			AST tmp114_AST = null;
			tmp114_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp114_AST);
			match(LITERAL_boolean);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_resource:
		{
			AST tmp115_AST = null;
			tmp115_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp115_AST);
			match(LITERAL_resource);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_string:
		{
			AST tmp116_AST = null;
			tmp116_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp116_AST);
			match(LITERAL_string);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_bool:
		{
			AST tmp117_AST = null;
			tmp117_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp117_AST);
			match(LITERAL_bool);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_double:
		{
			AST tmp118_AST = null;
			tmp118_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp118_AST);
			match(LITERAL_double);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_final:
		{
			AST tmp119_AST = null;
			tmp119_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp119_AST);
			match(LITERAL_final);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_float:
		{
			AST tmp120_AST = null;
			tmp120_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp120_AST);
			match(LITERAL_float);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_int:
		{
			AST tmp121_AST = null;
			tmp121_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp121_AST);
			match(LITERAL_int);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_function:
		{
			AST tmp122_AST = null;
			tmp122_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp122_AST);
			match(LITERAL_function);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_abstract:
		{
			AST tmp123_AST = null;
			tmp123_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp123_AST);
			match(LITERAL_abstract);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_public:
		{
			AST tmp124_AST = null;
			tmp124_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp124_AST);
			match(LITERAL_public);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_private:
		{
			AST tmp125_AST = null;
			tmp125_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp125_AST);
			match(LITERAL_private);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_protected:
		{
			AST tmp126_AST = null;
			tmp126_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp126_AST);
			match(LITERAL_protected);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_print:
		{
			AST tmp127_AST = null;
			tmp127_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp127_AST);
			match(LITERAL_print);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_clone:
		{
			AST tmp128_AST = null;
			tmp128_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp128_AST);
			match(LITERAL_clone);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_list:
		{
			AST tmp129_AST = null;
			tmp129_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp129_AST);
			match(LITERAL_list);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_return:
		{
			AST tmp130_AST = null;
			tmp130_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp130_AST);
			match(LITERAL_return);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_object:
		{
			AST tmp131_AST = null;
			tmp131_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp131_AST);
			match(LITERAL_object);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_default:
		{
			AST tmp132_AST = null;
			tmp132_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp132_AST);
			match(LITERAL_default);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_namespace:
		{
			AST tmp133_AST = null;
			tmp133_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp133_AST);
			match(LITERAL_namespace);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case IDENT:
		{
			AST tmp134_AST = null;
			tmp134_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp134_AST);
			match(IDENT);
			baseIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case VARIABLE:
		{
			AST tmp135_AST = null;
			tmp135_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp135_AST);
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
		returnAST = baseIdentifier_AST;
	}
	
	public final void paramList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST paramList_AST = null;
		
		paramListElement();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop119:
		do {
			if ((LA(1)==COMMA)) {
				AST tmp136_AST = null;
				tmp136_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp136_AST);
				match(COMMA);
				paramListElement();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop119;
			}
			
		} while (true);
		}
		paramList_AST = (AST)currentAST.root;
		returnAST = paramList_AST;
	}
	
	public final void functionParameter() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionParameter_AST = null;
		
		{
		boolean synPredMatched128 = false;
		if (((_tokenSet_15.member(LA(1))) && (_tokenSet_16.member(LA(2))))) {
			int _m128 = mark();
			synPredMatched128 = true;
			inputState.guessing++;
			try {
				{
				typeName();
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
			identifier();
			astFactory.addASTChild(currentAST, returnAST);
			}
		}
		else {
			boolean synPredMatched131 = false;
			if (((_tokenSet_15.member(LA(1))) && (LA(2)==BAND||LA(2)==DOUBLECOLON))) {
				int _m131 = mark();
				synPredMatched131 = true;
				inputState.guessing++;
				try {
					{
					typeName();
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
				typeName();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp137_AST = null;
				tmp137_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp137_AST);
				match(BAND);
				if ( inputState.guessing==0 ) {
					tmp137_AST.setType(REFERENCE);
				}
				identifier();
				astFactory.addASTChild(currentAST, returnAST);
				}
			}
			else {
				boolean synPredMatched134 = false;
				if (((LA(1)==BAND))) {
					int _m134 = mark();
					synPredMatched134 = true;
					inputState.guessing++;
					try {
						{
						match(BAND);
						identifier();
						}
					}
					catch (RecognitionException pe) {
						synPredMatched134 = false;
					}
					rewind(_m134);
inputState.guessing--;
				}
				if ( synPredMatched134 ) {
					{
					AST tmp138_AST = null;
					tmp138_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp138_AST);
					match(BAND);
					if ( inputState.guessing==0 ) {
						tmp138_AST.setType(REFERENCE);
					}
					identifier();
					astFactory.addASTChild(currentAST, returnAST);
					}
				}
				else if ((_tokenSet_17.member(LA(1))) && (_tokenSet_18.member(LA(2)))) {
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
					AST tmp139_AST = null;
					tmp139_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp139_AST);
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
				returnAST = functionParameter_AST;
			}
			
	public final void expressionList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST expressionList_AST = null;
		
		{
		expression(true, false);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop124:
		do {
			if ((LA(1)==COMMA)) {
				AST tmp140_AST = null;
				tmp140_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp140_AST);
				match(COMMA);
				expression(true, false);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop124;
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
		returnAST = expressionList_AST;
	}
	
	public final void typeName() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST typeName_AST = null;
		
		switch ( LA(1)) {
		case LITERAL_int:
		{
			AST tmp141_AST = null;
			tmp141_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp141_AST);
			match(LITERAL_int);
			typeName_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_float:
		{
			AST tmp142_AST = null;
			tmp142_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp142_AST);
			match(LITERAL_float);
			typeName_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_double:
		{
			AST tmp143_AST = null;
			tmp143_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp143_AST);
			match(LITERAL_double);
			typeName_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_object:
		{
			AST tmp144_AST = null;
			tmp144_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp144_AST);
			match(LITERAL_object);
			typeName_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_string:
		{
			AST tmp145_AST = null;
			tmp145_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp145_AST);
			match(LITERAL_string);
			typeName_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_array:
		{
			AST tmp146_AST = null;
			tmp146_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp146_AST);
			match(LITERAL_array);
			typeName_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_bool:
		{
			AST tmp147_AST = null;
			tmp147_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp147_AST);
			match(LITERAL_bool);
			typeName_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_boolean:
		{
			AST tmp148_AST = null;
			tmp148_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp148_AST);
			match(LITERAL_boolean);
			typeName_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_resource:
		{
			AST tmp149_AST = null;
			tmp149_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp149_AST);
			match(LITERAL_resource);
			typeName_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_self:
		{
			AST tmp150_AST = null;
			tmp150_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp150_AST);
			match(LITERAL_self);
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
		returnAST = typeName_AST;
	}
	
	public final void className() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST className_AST = null;
		
		AST tmp151_AST = null;
		tmp151_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp151_AST);
		match(IDENT);
		className_AST = (AST)currentAST.root;
		returnAST = className_AST;
	}
	
	public final void implementsList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST implementsList_AST = null;
		
		AST tmp152_AST = null;
		tmp152_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp152_AST);
		match(LITERAL_implements);
		className();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop160:
		do {
			if ((LA(1)==COMMA)) {
				AST tmp153_AST = null;
				tmp153_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp153_AST);
				match(COMMA);
				className();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop160;
			}
			
		} while (true);
		}
		implementsList_AST = (AST)currentAST.root;
		returnAST = implementsList_AST;
	}
	
	public final void extendsMultiList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST extendsMultiList_AST = null;
		
		AST tmp154_AST = null;
		tmp154_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp154_AST);
		match(LITERAL_extends);
		className();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop157:
		do {
			if ((LA(1)==COMMA)) {
				AST tmp155_AST = null;
				tmp155_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp155_AST);
				match(COMMA);
				className();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop157;
			}
			
		} while (true);
		}
		extendsMultiList_AST = (AST)currentAST.root;
		returnAST = extendsMultiList_AST;
	}
	
	public final void interfaceBody() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST interfaceBody_AST = null;
		
		AST tmp156_AST = null;
		tmp156_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp156_AST);
		match(LCURLY);
		if ( inputState.guessing==0 ) {
			tmp156_AST.setType(CLASS_BODY);
		}
		{
		_loop142:
		do {
			if ((_tokenSet_19.member(LA(1)))) {
				interfaceMemberDefinition();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop142;
			}
			
		} while (true);
		}
		AST tmp157_AST = null;
		tmp157_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp157_AST);
		match(RCURLY);
		interfaceBody_AST = (AST)currentAST.root;
		returnAST = interfaceBody_AST;
	}
	
	public final void interfaceMemberDefinition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST interfaceMemberDefinition_AST = null;
		
		memberModifiers();
		astFactory.addASTChild(currentAST, returnAST);
		{
		if ((LA(1)==LITERAL_function) && (_tokenSet_20.member(LA(2)))) {
			functionHeader();
			astFactory.addASTChild(currentAST, returnAST);
		}
		else if ((_tokenSet_17.member(LA(1))) && (_tokenSet_21.member(LA(2)))) {
			memberDataItems();
			astFactory.addASTChild(currentAST, returnAST);
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		AST tmp158_AST = null;
		tmp158_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp158_AST);
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
		returnAST = interfaceMemberDefinition_AST;
	}
	
	public final void memberModifiers() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST memberModifiers_AST = null;
		
		{
		_loop181:
		do {
			switch ( LA(1)) {
			case LITERAL_static:
			{
				AST tmp159_AST = null;
				tmp159_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp159_AST);
				match(LITERAL_static);
				break;
			}
			case LITERAL_const:
			{
				AST tmp160_AST = null;
				tmp160_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp160_AST);
				match(LITERAL_const);
				break;
			}
			default:
				if ((LA(1)==LITERAL_abstract) && (_tokenSet_22.member(LA(2)))) {
					AST tmp161_AST = null;
					tmp161_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp161_AST);
					match(LITERAL_abstract);
					if ( inputState.guessing==0 ) {
						metAbstractModifier = true;
					}
				}
				else if ((LA(1)==LITERAL_final) && (_tokenSet_22.member(LA(2)))) {
					AST tmp162_AST = null;
					tmp162_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp162_AST);
					match(LITERAL_final);
				}
				else if ((LA(1)==LITERAL_public) && (_tokenSet_22.member(LA(2)))) {
					AST tmp163_AST = null;
					tmp163_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp163_AST);
					match(LITERAL_public);
				}
				else if ((LA(1)==LITERAL_protected) && (_tokenSet_22.member(LA(2)))) {
					AST tmp164_AST = null;
					tmp164_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp164_AST);
					match(LITERAL_protected);
				}
				else if ((LA(1)==LITERAL_private) && (_tokenSet_22.member(LA(2)))) {
					AST tmp165_AST = null;
					tmp165_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp165_AST);
					match(LITERAL_private);
				}
			else {
				break _loop181;
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
		returnAST = memberModifiers_AST;
	}
	
	public final void memberDataItems() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST memberDataItems_AST = null;
		
		memberDataItem();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop176:
		do {
			if ((LA(1)==COMMA)) {
				AST tmp166_AST = null;
				tmp166_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp166_AST);
				match(COMMA);
				memberDataItem();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop176;
			}
			
		} while (true);
		}
		memberDataItems_AST = (AST)currentAST.root;
		returnAST = memberDataItems_AST;
	}
	
	public final void classModifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST classModifier_AST = null;
		
		{
		_loop153:
		do {
			switch ( LA(1)) {
			case LITERAL_abstract:
			{
				AST tmp167_AST = null;
				tmp167_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp167_AST);
				match(LITERAL_abstract);
				break;
			}
			case LITERAL_final:
			{
				AST tmp168_AST = null;
				tmp168_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp168_AST);
				match(LITERAL_final);
				break;
			}
			default:
			{
				break _loop153;
			}
			}
		} while (true);
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
		returnAST = classModifier_AST;
	}
	
	public final void extendsList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST extendsList_AST = null;
		
		AST tmp169_AST = null;
		tmp169_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp169_AST);
		match(LITERAL_extends);
		className();
		astFactory.addASTChild(currentAST, returnAST);
		extendsList_AST = (AST)currentAST.root;
		returnAST = extendsList_AST;
	}
	
	public final void classBody() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST classBody_AST = null;
		
		AST tmp170_AST = null;
		tmp170_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp170_AST);
		match(LCURLY);
		if ( inputState.guessing==0 ) {
			tmp170_AST.setType(CLASS_BODY);
		}
		{
		_loop164:
		do {
			if ((_tokenSet_22.member(LA(1)))) {
				memberDefinition();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop164;
			}
			
		} while (true);
		}
		AST tmp171_AST = null;
		tmp171_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp171_AST);
		match(RCURLY);
		classBody_AST = (AST)currentAST.root;
		returnAST = classBody_AST;
	}
	
	public final void memberDefinition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST memberDefinition_AST = null;
		
		metAbstractModifier = false;
		
		
		memberModifiers();
		astFactory.addASTChild(currentAST, returnAST);
		{
		boolean synPredMatched168 = false;
		if (((LA(1)==LITERAL_function) && (_tokenSet_20.member(LA(2))))) {
			int _m168 = mark();
			synPredMatched168 = true;
			inputState.guessing++;
			try {
				{
				match(LITERAL_function);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched168 = false;
			}
			rewind(_m168);
inputState.guessing--;
		}
		if ( synPredMatched168 ) {
			{
			if (((LA(1)==LITERAL_function) && (_tokenSet_20.member(LA(2))))&&(!metAbstractModifier)) {
				functionDeclaration();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else if ((LA(1)==LITERAL_function) && (_tokenSet_20.member(LA(2)))) {
				{
				functionHeader();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp172_AST = null;
				tmp172_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp172_AST);
				match(SEMI);
				}
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
		}
		else if ((_tokenSet_23.member(LA(1))) && (_tokenSet_21.member(LA(2)))) {
			{
			memberDataDefinition();
			astFactory.addASTChild(currentAST, returnAST);
			}
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
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
		returnAST = memberDefinition_AST;
	}
	
	public final void memberDataDefinition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST memberDataDefinition_AST = null;
		
		{
		switch ( LA(1)) {
		case LITERAL_var:
		{
			AST tmp173_AST = null;
			tmp173_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp173_AST);
			match(LITERAL_var);
			break;
		}
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_print:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
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
		AST tmp174_AST = null;
		tmp174_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp174_AST);
		match(SEMI);
		memberDataDefinition_AST = (AST)currentAST.root;
		returnAST = memberDataDefinition_AST;
	}
	
	public final void memberDataItem() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST memberDataItem_AST = null;
		
		identifier();
		astFactory.addASTChild(currentAST, returnAST);
		{
		switch ( LA(1)) {
		case ASSIGN:
		{
			AST tmp175_AST = null;
			tmp175_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp175_AST);
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
		returnAST = memberDataItem_AST;
	}
	
	public final void logicalOrExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST logicalOrExpression_AST = null;
		
		logicalXorExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop188:
		do {
			if ((LA(1)==LITERAL_or) && (_tokenSet_1.member(LA(2)))) {
				AST tmp176_AST = null;
				tmp176_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp176_AST);
				match(LITERAL_or);
				logicalXorExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop188;
			}
			
		} while (true);
		}
		logicalOrExpression_AST = (AST)currentAST.root;
		returnAST = logicalOrExpression_AST;
	}
	
	public final void logicalXorExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST logicalXorExpression_AST = null;
		
		logicalAndExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop191:
		do {
			if ((LA(1)==LITERAL_xor) && (_tokenSet_1.member(LA(2)))) {
				AST tmp177_AST = null;
				tmp177_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp177_AST);
				match(LITERAL_xor);
				logicalAndExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop191;
			}
			
		} while (true);
		}
		logicalXorExpression_AST = (AST)currentAST.root;
		returnAST = logicalXorExpression_AST;
	}
	
	public final void logicalAndExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST logicalAndExpression_AST = null;
		
		ternaryExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop194:
		do {
			if ((LA(1)==LITERAL_and) && (_tokenSet_1.member(LA(2)))) {
				AST tmp178_AST = null;
				tmp178_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp178_AST);
				match(LITERAL_and);
				ternaryExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop194;
			}
			
		} while (true);
		}
		logicalAndExpression_AST = (AST)currentAST.root;
		returnAST = logicalAndExpression_AST;
	}
	
	public final void ternaryExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST ternaryExpression_AST = null;
		
		assignmentExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		if ((LA(1)==QUESTION) && (_tokenSet_1.member(LA(2)))) {
			AST tmp179_AST = null;
			tmp179_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp179_AST);
			match(QUESTION);
			expression(true, allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp180_AST = null;
			tmp180_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp180_AST);
			match(COLON);
			expression(true, allowComma);
			astFactory.addASTChild(currentAST, returnAST);
		}
		else if ((_tokenSet_24.member(LA(1))) && (_tokenSet_25.member(LA(2)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		ternaryExpression_AST = (AST)currentAST.root;
		returnAST = ternaryExpression_AST;
	}
	
	public final void assignmentExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST assignmentExpression_AST = null;
		
		booleanOrExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop200:
		do {
			if ((_tokenSet_26.member(LA(1))) && (_tokenSet_1.member(LA(2)))) {
				{
				switch ( LA(1)) {
				case ASSIGN:
				{
					AST tmp181_AST = null;
					tmp181_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp181_AST);
					match(ASSIGN);
					break;
				}
				case PLUS_ASS:
				{
					AST tmp182_AST = null;
					tmp182_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp182_AST);
					match(PLUS_ASS);
					break;
				}
				case MINUS_ASS:
				{
					AST tmp183_AST = null;
					tmp183_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp183_AST);
					match(MINUS_ASS);
					break;
				}
				case MULT_ASS:
				{
					AST tmp184_AST = null;
					tmp184_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp184_AST);
					match(MULT_ASS);
					break;
				}
				case AND_ASS:
				{
					AST tmp185_AST = null;
					tmp185_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp185_AST);
					match(AND_ASS);
					break;
				}
				case DIV_ASS:
				{
					AST tmp186_AST = null;
					tmp186_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp186_AST);
					match(DIV_ASS);
					break;
				}
				case MOD_ASS:
				{
					AST tmp187_AST = null;
					tmp187_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp187_AST);
					match(MOD_ASS);
					break;
				}
				case SHR_ASS:
				{
					AST tmp188_AST = null;
					tmp188_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp188_AST);
					match(SHR_ASS);
					break;
				}
				case SHL_ASS:
				{
					AST tmp189_AST = null;
					tmp189_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp189_AST);
					match(SHL_ASS);
					break;
				}
				case BAND_ASS:
				{
					AST tmp190_AST = null;
					tmp190_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp190_AST);
					match(BAND_ASS);
					break;
				}
				case XOR_ASS:
				{
					AST tmp191_AST = null;
					tmp191_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp191_AST);
					match(XOR_ASS);
					break;
				}
				case BOR_ASS:
				{
					AST tmp192_AST = null;
					tmp192_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp192_AST);
					match(BOR_ASS);
					break;
				}
				case OR_ASS:
				{
					AST tmp193_AST = null;
					tmp193_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp193_AST);
					match(OR_ASS);
					break;
				}
				case DOT_ASS:
				{
					AST tmp194_AST = null;
					tmp194_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp194_AST);
					match(DOT_ASS);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				booleanOrExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop200;
			}
			
		} while (true);
		}
		assignmentExpression_AST = (AST)currentAST.root;
		returnAST = assignmentExpression_AST;
	}
	
	public final void booleanOrExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST booleanOrExpression_AST = null;
		
		booleanAndExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop203:
		do {
			if ((LA(1)==LOR) && (_tokenSet_1.member(LA(2)))) {
				AST tmp195_AST = null;
				tmp195_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp195_AST);
				match(LOR);
				booleanAndExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop203;
			}
			
		} while (true);
		}
		booleanOrExpression_AST = (AST)currentAST.root;
		returnAST = booleanOrExpression_AST;
	}
	
	public final void booleanAndExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST booleanAndExpression_AST = null;
		
		bitwiseOrExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop206:
		do {
			if ((LA(1)==LAND) && (_tokenSet_1.member(LA(2)))) {
				AST tmp196_AST = null;
				tmp196_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp196_AST);
				match(LAND);
				bitwiseOrExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop206;
			}
			
		} while (true);
		}
		booleanAndExpression_AST = (AST)currentAST.root;
		returnAST = booleanAndExpression_AST;
	}
	
	public final void bitwiseOrExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST bitwiseOrExpression_AST = null;
		
		bitwiseXorExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop209:
		do {
			if ((LA(1)==BOR) && (_tokenSet_1.member(LA(2)))) {
				AST tmp197_AST = null;
				tmp197_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp197_AST);
				match(BOR);
				bitwiseXorExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop209;
			}
			
		} while (true);
		}
		bitwiseOrExpression_AST = (AST)currentAST.root;
		returnAST = bitwiseOrExpression_AST;
	}
	
	public final void bitwiseXorExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST bitwiseXorExpression_AST = null;
		
		bitwiseAndExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop212:
		do {
			if ((LA(1)==BXOR) && (_tokenSet_1.member(LA(2)))) {
				AST tmp198_AST = null;
				tmp198_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp198_AST);
				match(BXOR);
				bitwiseAndExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop212;
			}
			
		} while (true);
		}
		bitwiseXorExpression_AST = (AST)currentAST.root;
		returnAST = bitwiseXorExpression_AST;
	}
	
	public final void bitwiseAndExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST bitwiseAndExpression_AST = null;
		
		equalityExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop215:
		do {
			if ((LA(1)==BAND) && (_tokenSet_1.member(LA(2)))) {
				AST tmp199_AST = null;
				tmp199_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp199_AST);
				match(BAND);
				equalityExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop215;
			}
			
		} while (true);
		}
		bitwiseAndExpression_AST = (AST)currentAST.root;
		returnAST = bitwiseAndExpression_AST;
	}
	
	public final void equalityExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST equalityExpression_AST = null;
		
		compareExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop219:
		do {
			if ((_tokenSet_27.member(LA(1))) && (_tokenSet_1.member(LA(2)))) {
				{
				switch ( LA(1)) {
				case NE:
				{
					AST tmp200_AST = null;
					tmp200_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp200_AST);
					match(NE);
					break;
				}
				case EQUAL:
				{
					AST tmp201_AST = null;
					tmp201_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp201_AST);
					match(EQUAL);
					break;
				}
				case IDENTICAL:
				{
					AST tmp202_AST = null;
					tmp202_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp202_AST);
					match(IDENTICAL);
					break;
				}
				case NONIDENT:
				{
					AST tmp203_AST = null;
					tmp203_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp203_AST);
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
				break _loop219;
			}
			
		} while (true);
		}
		equalityExpression_AST = (AST)currentAST.root;
		returnAST = equalityExpression_AST;
	}
	
	public final void compareExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST compareExpression_AST = null;
		
		shiftExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop223:
		do {
			if (((LA(1) >= LESS && LA(1) <= GE)) && (_tokenSet_1.member(LA(2)))) {
				{
				switch ( LA(1)) {
				case LE:
				{
					AST tmp204_AST = null;
					tmp204_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp204_AST);
					match(LE);
					break;
				}
				case LESS:
				{
					AST tmp205_AST = null;
					tmp205_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp205_AST);
					match(LESS);
					break;
				}
				case GE:
				{
					AST tmp206_AST = null;
					tmp206_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp206_AST);
					match(GE);
					break;
				}
				case GREATER:
				{
					AST tmp207_AST = null;
					tmp207_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp207_AST);
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
				break _loop223;
			}
			
		} while (true);
		}
		compareExpression_AST = (AST)currentAST.root;
		returnAST = compareExpression_AST;
	}
	
	public final void shiftExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST shiftExpression_AST = null;
		
		sumExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop227:
		do {
			if ((LA(1)==SHL||LA(1)==SHR) && (_tokenSet_1.member(LA(2)))) {
				{
				switch ( LA(1)) {
				case SHL:
				{
					AST tmp208_AST = null;
					tmp208_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp208_AST);
					match(SHL);
					break;
				}
				case SHR:
				{
					AST tmp209_AST = null;
					tmp209_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp209_AST);
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
				break _loop227;
			}
			
		} while (true);
		}
		shiftExpression_AST = (AST)currentAST.root;
		returnAST = shiftExpression_AST;
	}
	
	public final void sumExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST sumExpression_AST = null;
		
		multiplExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop231:
		do {
			if ((LA(1)==PLUS||LA(1)==MINUS||LA(1)==DOT) && (_tokenSet_1.member(LA(2)))) {
				{
				switch ( LA(1)) {
				case PLUS:
				{
					AST tmp210_AST = null;
					tmp210_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp210_AST);
					match(PLUS);
					break;
				}
				case MINUS:
				{
					AST tmp211_AST = null;
					tmp211_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp211_AST);
					match(MINUS);
					break;
				}
				case DOT:
				{
					AST tmp212_AST = null;
					tmp212_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp212_AST);
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
				break _loop231;
			}
			
		} while (true);
		}
		sumExpression_AST = (AST)currentAST.root;
		returnAST = sumExpression_AST;
	}
	
	public final void multiplExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST multiplExpression_AST = null;
		
		instanceofExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop235:
		do {
			if (((LA(1) >= ASTERISK && LA(1) <= MOD)) && (_tokenSet_1.member(LA(2)))) {
				{
				switch ( LA(1)) {
				case ASTERISK:
				{
					AST tmp213_AST = null;
					tmp213_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp213_AST);
					match(ASTERISK);
					break;
				}
				case SLASH:
				{
					AST tmp214_AST = null;
					tmp214_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp214_AST);
					match(SLASH);
					break;
				}
				case MOD:
				{
					AST tmp215_AST = null;
					tmp215_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp215_AST);
					match(MOD);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				instanceofExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop235;
			}
			
		} while (true);
		}
		multiplExpression_AST = (AST)currentAST.root;
		returnAST = multiplExpression_AST;
	}
	
	public final void instanceofExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST instanceofExpression_AST = null;
		
		propertyAccessExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop239:
		do {
			if ((LA(1)==LITERAL_instanceof) && (_tokenSet_1.member(LA(2)))) {
				{
				AST tmp216_AST = null;
				tmp216_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp216_AST);
				match(LITERAL_instanceof);
				}
				propertyAccessExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop239;
			}
			
		} while (true);
		}
		instanceofExpression_AST = (AST)currentAST.root;
		returnAST = instanceofExpression_AST;
	}
	
	public final void propertyAccessExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST propertyAccessExpression_AST = null;
		
		typeCastExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop242:
		do {
			if ((LA(1)==MMBR) && (_tokenSet_1.member(LA(2)))) {
				AST tmp217_AST = null;
				tmp217_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp217_AST);
				match(MMBR);
				typeCastExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop242;
			}
			
		} while (true);
		}
		propertyAccessExpression_AST = (AST)currentAST.root;
		returnAST = propertyAccessExpression_AST;
	}
	
	public final void typeCastExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST typeCastExpression_AST = null;
		
		switch ( LA(1)) {
		case LNOT:
		{
			{
			AST tmp218_AST = null;
			tmp218_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp218_AST);
			match(LNOT);
			typeCastExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			}
			typeCastExpression_AST = (AST)currentAST.root;
			break;
		}
		case DOG:
		{
			{
			AST tmp219_AST = null;
			tmp219_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp219_AST);
			match(DOG);
			typeCastExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			}
			typeCastExpression_AST = (AST)currentAST.root;
			break;
		}
		case BW_NOT:
		{
			{
			AST tmp220_AST = null;
			tmp220_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp220_AST);
			match(BW_NOT);
			typeCastExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			}
			typeCastExpression_AST = (AST)currentAST.root;
			break;
		}
		case MINUS:
		{
			{
			AST tmp221_AST = null;
			tmp221_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp221_AST);
			match(MINUS);
			if ( inputState.guessing==0 ) {
				tmp221_AST.setType(UNARY_MINUS);
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
			AST tmp222_AST = null;
			tmp222_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp222_AST);
			match(PLUS);
			if ( inputState.guessing==0 ) {
				tmp222_AST.setType(UNARY_PLUS);
			}
			typeCastExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			}
			typeCastExpression_AST = (AST)currentAST.root;
			break;
		}
		default:
			boolean synPredMatched245 = false;
			if (((LA(1)==LPAREN) && (_tokenSet_15.member(LA(2))))) {
				int _m245 = mark();
				synPredMatched245 = true;
				inputState.guessing++;
				try {
					{
					match(LPAREN);
					typeName();
					match(RPAREN);
					expression(false, false);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched245 = false;
				}
				rewind(_m245);
inputState.guessing--;
			}
			if ( synPredMatched245 ) {
				{
				AST tmp223_AST = null;
				tmp223_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp223_AST);
				match(LPAREN);
				typeName();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp224_AST = null;
				tmp224_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp224_AST);
				match(RPAREN);
				if ( inputState.guessing==0 ) {
					tmp223_AST.setType(TYPE_CAST) ;
				}
				typeCastExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				}
				typeCastExpression_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_28.member(LA(1))) && (_tokenSet_13.member(LA(2)))) {
				incrementExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				typeCastExpression_AST = (AST)currentAST.root;
			}
		else {
			throw new NoViableAltException(LT(1), getFilename());
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
		
		{
		switch ( LA(1)) {
		case INC:
		{
			AST tmp225_AST = null;
			tmp225_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp225_AST);
			match(INC);
			break;
		}
		case DEC:
		{
			AST tmp226_AST = null;
			tmp226_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp226_AST);
			match(DEC);
			break;
		}
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_new:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_require:
		case LITERAL_require_once:
		case LITERAL_include:
		case LITERAL_include_once:
		case LITERAL_define:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_die:
		case LITERAL_exit:
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
		case LITERAL_null:
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
		_loop258:
		do {
			if ((LA(1)==INC) && (_tokenSet_24.member(LA(2)))) {
				{
				AST tmp227_AST = null;
				tmp227_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp227_AST);
				match(INC);
				if ( inputState.guessing==0 ) {
					tmp227_AST.setType(POST_INC);
				}
				}
			}
			else if ((LA(1)==DEC) && (_tokenSet_24.member(LA(2)))) {
				{
				AST tmp228_AST = null;
				tmp228_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp228_AST);
				match(DEC);
				if ( inputState.guessing==0 ) {
					tmp228_AST.setType(POST_DEC);
				}
				}
			}
			else {
				break _loop258;
			}
			
		} while (true);
		}
		}
		incrementExpression_AST = (AST)currentAST.root;
		returnAST = incrementExpression_AST;
	}
	
	public final void functionCallExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionCallExpression_AST = null;
		
		switch ( LA(1)) {
		case LITERAL_exit:
		{
			exitStatementExpression();
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
		case LITERAL_die:
		{
			dieStatementExpression();
			astFactory.addASTChild(currentAST, returnAST);
			functionCallExpression_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_define:
		{
			defineStatementExpression();
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
		default:
			if ((LA(1)==LITERAL_list) && (LA(2)==LPAREN)) {
				listStatementExpression();
				astFactory.addASTChild(currentAST, returnAST);
				functionCallExpression_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_29.member(LA(1))) && (_tokenSet_13.member(LA(2)))) {
				{
				arrayAccessExpression(allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				{
				_loop263:
				do {
					if ((LA(1)==LPAREN)) {
						AST tmp229_AST = null;
						tmp229_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp229_AST);
						match(LPAREN);
						if ( inputState.guessing==0 ) {
							tmp229_AST.setType(FUNC_CALL);
						}
						{
						switch ( LA(1)) {
						case LITERAL_abstract:
						case LITERAL_function:
						case LITERAL_default:
						case LITERAL_return:
						case LITERAL_int:
						case LITERAL_double:
						case LITERAL_float:
						case LITERAL_string:
						case LITERAL_object:
						case LITERAL_bool:
						case LITERAL_boolean:
						case LITERAL_resource:
						case LITERAL_array:
						case LITERAL_print:
						case LITERAL_new:
						case LITERAL_clone:
						case LITERAL_public:
						case LITERAL_namespace:
						case LITERAL_protected:
						case LITERAL_private:
						case LITERAL_final:
						case LITERAL_require:
						case LITERAL_require_once:
						case LITERAL_include:
						case LITERAL_include_once:
						case LITERAL_define:
						case LITERAL_true:
						case LITERAL_false:
						case LITERAL_die:
						case LITERAL_exit:
						case LITERAL_self:
						case LITERAL_parent:
						case LITERAL_list:
						case DOG:
						case PLUS:
						case MINUS:
						case BAND:
						case INC:
						case DEC:
						case BW_NOT:
						case LPAREN:
						case LCURLY:
						case LNOT:
						case IDENT:
						case VARIABLE:
						case COMPOUND_VAR_START:
						case HEREDOC:
						case STRING:
						case NUMBER:
						case LITERAL_null:
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
						AST tmp230_AST = null;
						tmp230_AST = astFactory.create(LT(1));
						astFactory.addASTChild(currentAST, tmp230_AST);
						match(RPAREN);
					}
					else {
						break _loop263;
					}
					
				} while (true);
				}
				}
				functionCallExpression_AST = (AST)currentAST.root;
			}
		else {
			throw new NoViableAltException(LT(1), getFilename());
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
		
		referenceExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop271:
		do {
			boolean synPredMatched267 = false;
			if (((LA(1)==LBRACK) && (_tokenSet_1.member(LA(2))))) {
				int _m267 = mark();
				synPredMatched267 = true;
				inputState.guessing++;
				try {
					{
					match(LBRACK);
					expression(true, allowComma);
					match(RBRACK);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched267 = false;
				}
				rewind(_m267);
inputState.guessing--;
			}
			if ( synPredMatched267 ) {
				{
				AST tmp231_AST = null;
				tmp231_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp231_AST);
				match(LBRACK);
				if ( inputState.guessing==0 ) {
					tmp231_AST.setType(INDEX_OP);
				}
				expression(true, allowComma);
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp232_AST = null;
				tmp232_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp232_AST);
				match(RBRACK);
				}
			}
			else if ((LA(1)==LBRACK) && (LA(2)==RBRACK)) {
				{
				AST tmp233_AST = null;
				tmp233_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp233_AST);
				match(LBRACK);
				AST tmp234_AST = null;
				tmp234_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp234_AST);
				match(RBRACK);
				}
			}
			else if ((LA(1)==LCURLY)) {
				{
				AST tmp235_AST = null;
				tmp235_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp235_AST);
				match(LCURLY);
				if ( inputState.guessing==0 ) {
					tmp235_AST.setType(CHAR_ACCESS);
				}
				expression(true, false);
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp236_AST = null;
				tmp236_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp236_AST);
				match(RCURLY);
				}
			}
			else {
				break _loop271;
			}
			
		} while (true);
		}
		arrayAccessExpression_AST = (AST)currentAST.root;
		returnAST = arrayAccessExpression_AST;
	}
	
	public final void referenceExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST referenceExpression_AST = null;
		
		{
		switch ( LA(1)) {
		case BAND:
		{
			AST tmp237_AST = null;
			tmp237_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp237_AST);
			match(BAND);
			if ( inputState.guessing==0 ) {
				tmp237_AST.setType(REFERENCE);
			}
			break;
		}
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_new:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
		case LPAREN:
		case LCURLY:
		case IDENT:
		case VARIABLE:
		case COMPOUND_VAR_START:
		case HEREDOC:
		case STRING:
		case NUMBER:
		case LITERAL_null:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		newExpression(allowComma);
		astFactory.addASTChild(currentAST, returnAST);
		referenceExpression_AST = (AST)currentAST.root;
		returnAST = referenceExpression_AST;
	}
	
	public final void newExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST newExpression_AST = null;
		
		boolean synPredMatched276 = false;
		if (((LA(1)==LITERAL_clone) && (_tokenSet_30.member(LA(2))))) {
			int _m276 = mark();
			synPredMatched276 = true;
			inputState.guessing++;
			try {
				{
				match(LITERAL_clone);
				basicExpression(allowComma);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched276 = false;
			}
			rewind(_m276);
inputState.guessing--;
		}
		if ( synPredMatched276 ) {
			{
			AST tmp238_AST = null;
			tmp238_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp238_AST);
			match(LITERAL_clone);
			basicExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			}
			newExpression_AST = (AST)currentAST.root;
		}
		else if ((LA(1)==LITERAL_new)) {
			{
			AST tmp239_AST = null;
			tmp239_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp239_AST);
			match(LITERAL_new);
			basicExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			}
			newExpression_AST = (AST)currentAST.root;
		}
		else if ((_tokenSet_30.member(LA(1))) && (_tokenSet_13.member(LA(2)))) {
			{
			basicExpression(allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			}
			newExpression_AST = (AST)currentAST.root;
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		returnAST = newExpression_AST;
	}
	
	public final void basicExpression(
		boolean allowComma
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST basicExpression_AST = null;
		
		switch ( LA(1)) {
		case LITERAL_true:
		{
			{
			AST tmp240_AST = null;
			tmp240_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp240_AST);
			match(LITERAL_true);
			}
			basicExpression_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_false:
		{
			{
			AST tmp241_AST = null;
			tmp241_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp241_AST);
			match(LITERAL_false);
			}
			basicExpression_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_null:
		{
			{
			AST tmp242_AST = null;
			tmp242_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp242_AST);
			match(LITERAL_null);
			}
			basicExpression_AST = (AST)currentAST.root;
			break;
		}
		case NUMBER:
		{
			{
			AST tmp243_AST = null;
			tmp243_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp243_AST);
			match(NUMBER);
			}
			basicExpression_AST = (AST)currentAST.root;
			break;
		}
		case STRING:
		{
			{
			AST tmp244_AST = null;
			tmp244_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp244_AST);
			match(STRING);
			}
			basicExpression_AST = (AST)currentAST.root;
			break;
		}
		case HEREDOC:
		{
			{
			AST tmp245_AST = null;
			tmp245_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp245_AST);
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
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_print:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
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
			AST tmp246_AST = null;
			tmp246_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp246_AST);
			match(LPAREN);
			expression(false, allowComma);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp247_AST = null;
			tmp247_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp247_AST);
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
		returnAST = basicExpression_AST;
	}
	
	public final void arrayDefinition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST arrayDefinition_AST = null;
		
		AST tmp248_AST = null;
		tmp248_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp248_AST);
		match(LITERAL_array);
		AST tmp249_AST = null;
		tmp249_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp249_AST);
		match(LPAREN);
		arrayItemList();
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp250_AST = null;
		tmp250_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp250_AST);
		match(RPAREN);
		arrayDefinition_AST = (AST)currentAST.root;
		returnAST = arrayDefinition_AST;
	}
	
	public final void scopeResolutionExpression() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST scopeResolutionExpression_AST = null;
		
		{
		baseIdentifier();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop292:
		do {
			if ((LA(1)==DOUBLECOLON)) {
				AST tmp251_AST = null;
				tmp251_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp251_AST);
				match(DOUBLECOLON);
				baseIdentifier();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop292;
			}
			
		} while (true);
		}
		}
		scopeResolutionExpression_AST = (AST)currentAST.root;
		returnAST = scopeResolutionExpression_AST;
	}
	
	public final void compositeIdentifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST compositeIdentifier_AST = null;
		
		switch ( LA(1)) {
		case LCURLY:
		{
			{
			AST tmp252_AST = null;
			tmp252_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp252_AST);
			match(LCURLY);
			if ( inputState.guessing==0 ) {
				tmp252_AST.setType(INDIRECT_VAR_ID);
			}
			expression(false, true);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp253_AST = null;
			tmp253_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp253_AST);
			match(RCURLY);
			}
			compositeIdentifier_AST = (AST)currentAST.root;
			break;
		}
		case COMPOUND_VAR_START:
		{
			{
			AST tmp254_AST = null;
			tmp254_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp254_AST);
			match(COMPOUND_VAR_START);
			expression(false, true);
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp255_AST = null;
			tmp255_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp255_AST);
			match(RCURLY);
			}
			compositeIdentifier_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = compositeIdentifier_AST;
	}
	
	public final void arrayItemList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST arrayItemList_AST = null;
		
		arrayItem();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop297:
		do {
			if ((LA(1)==COMMA)) {
				AST tmp256_AST = null;
				tmp256_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp256_AST);
				match(COMMA);
				arrayItem();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop297;
			}
			
		} while (true);
		}
		arrayItemList_AST = (AST)currentAST.root;
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
		
		{
		switch ( LA(1)) {
		case LITERAL_abstract:
		case LITERAL_function:
		case LITERAL_default:
		case LITERAL_return:
		case LITERAL_int:
		case LITERAL_double:
		case LITERAL_float:
		case LITERAL_string:
		case LITERAL_object:
		case LITERAL_bool:
		case LITERAL_boolean:
		case LITERAL_resource:
		case LITERAL_array:
		case LITERAL_print:
		case LITERAL_new:
		case LITERAL_clone:
		case LITERAL_public:
		case LITERAL_namespace:
		case LITERAL_protected:
		case LITERAL_private:
		case LITERAL_final:
		case LITERAL_require:
		case LITERAL_require_once:
		case LITERAL_include:
		case LITERAL_include_once:
		case LITERAL_define:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_die:
		case LITERAL_exit:
		case LITERAL_self:
		case LITERAL_parent:
		case LITERAL_list:
		case DOG:
		case PLUS:
		case MINUS:
		case BAND:
		case INC:
		case DEC:
		case BW_NOT:
		case LPAREN:
		case LCURLY:
		case LNOT:
		case IDENT:
		case VARIABLE:
		case COMPOUND_VAR_START:
		case HEREDOC:
		case STRING:
		case NUMBER:
		case LITERAL_null:
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
		returnAST = arrayItem_AST;
	}
	
	public final void typeIdentifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST typeIdentifier_AST = null;
		
		AST tmp257_AST = null;
		tmp257_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp257_AST);
		match(IDENT);
		{
		_loop310:
		do {
			if ((LA(1)==DOUBLECOLON)) {
				AST tmp258_AST = null;
				tmp258_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp258_AST);
				match(DOUBLECOLON);
				AST tmp259_AST = null;
				tmp259_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp259_AST);
				match(IDENT);
			}
			else {
				break _loop310;
			}
			
		} while (true);
		}
		typeIdentifier_AST = (AST)currentAST.root;
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
		"\"int\"",
		"\"long\"",
		"\"double\"",
		"\"float\"",
		"\"string\"",
		"\"object\"",
		"\"bool\"",
		"\"boolean\"",
		"\"resource\"",
		"\"array\"",
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
		"\"true\"",
		"\"false\"",
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
		"DOT",
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
		"LITERAL_null"
	};
	
	protected void buildTokenTypeASTClassMap() {
		tokenTypeToASTClassMap=null;
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 1152040658311027696L, 3182358023720935296L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 1007714089117681936L, 2317666895265798912L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 1007714089117681936L, 2605897271417510656L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 158604552306960L, 0L, 16L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 33904421767440L, 585468226436074240L, 176L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 1152040658311027696L, 3200372422230417280L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 1007714089117681936L, 2787728169342335790L, 2017612633066439096L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 3457883667524746224L, 3182358023720935296L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { -880846295793678L, 3382203320155242414L, 2017612633066439096L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { -880846295793678L, 3200372422230417280L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { -845661914267662L, 3382203320155242478L, 2017612633066439096L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { 5763726676738415600L, 3182358023720935296L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = { -8071331378543748112L, 3182358023720935296L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {
		long[] data = { 1007714089117681936L, 4611686018427386686L, 2017612633066439096L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {
		long[] data = { 2304962162917875696L, 3382203320155242414L, 2017612633066439096L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {
		long[] data = { 17129537536L, 256L, 16L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	private static final long[] mk_tokenSet_16() {
		long[] data = { 33629543860496L, 9011597301254912L, 176L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
	private static final long[] mk_tokenSet_17() {
		long[] data = { 33629543860496L, 9007199254743808L, 176L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
	private static final long[] mk_tokenSet_18() {
		long[] data = { 1007714089117681936L, 2466325265387625216L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	private static final long[] mk_tokenSet_19() {
		long[] data = { 139182660126992L, 9007199254743808L, 176L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
	private static final long[] mk_tokenSet_20() {
		long[] data = { 33629543860496L, 9007474132650752L, 176L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_20 = new BitSet(mk_tokenSet_20());
	private static final long[] mk_tokenSet_21() {
		long[] data = { 1007714089117681936L, 2750052041911966464L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_21 = new BitSet(mk_tokenSet_21());
	private static final long[] mk_tokenSet_22() {
		long[] data = { 139182660126992L, 9007199254743872L, 176L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_22 = new BitSet(mk_tokenSet_22());
	private static final long[] mk_tokenSet_23() {
		long[] data = { 33629543860496L, 9007199254743872L, 176L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_23 = new BitSet(mk_tokenSet_23());
	private static final long[] mk_tokenSet_24() {
		long[] data = { 0L, 2257987865126363198L, 864691128455135240L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_24 = new BitSet(mk_tokenSet_24());
	private static final long[] mk_tokenSet_25() {
		long[] data = { -845661923704846L, 4611686018427387902L, 2017612633066439096L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_25 = new BitSet(mk_tokenSet_25());
	private static final long[] mk_tokenSet_26() {
		long[] data = { 0L, 35188664958976L, 864691128455135232L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_26 = new BitSet(mk_tokenSet_26());
	private static final long[] mk_tokenSet_27() {
		long[] data = { 0L, 1597440L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_27 = new BitSet(mk_tokenSet_27());
	private static final long[] mk_tokenSet_28() {
		long[] data = { 1007714089117681936L, 11260923213777664L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_28 = new BitSet(mk_tokenSet_28());
	private static final long[] mk_tokenSet_29() {
		long[] data = { 108120063550425360L, 11259273946336000L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_29 = new BitSet(mk_tokenSet_29());
	private static final long[] mk_tokenSet_30() {
		long[] data = { 108120029190686992L, 11258999068429056L, 1152921504611303856L, 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_30 = new BitSet(mk_tokenSet_30());
	
	}
