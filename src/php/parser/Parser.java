/*
 * $Id$
 * 
 * Author: Konstantin Nekrasov
 * Created: Feb 8, 2012
 */

package php.parser;

import java.io.Reader;

import php.parser.antlr.OutTheCodeFilter;
import php.parser.antlr.ParsingState;
import php.parser.antlr.PhpLexer;
import php.parser.antlr.PhpOutTheCodeLexer;
import php.parser.antlr.PhpParser;
import php.parser.antlr.ast.MarkedASTFactory;
import antlr.ASTFactory;
import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.TokenStreamSelector;
import antlr.collections.AST;

/**
 * Utility class that encapsulates the logic of parser correct invocation
 * (setting up filters, lexers etc).
 * 
 * @author knekrasov
 * 
 */
public class Parser {
	private ASTFactory astFactory;
	
	public Parser() {
		astFactory = new MarkedASTFactory();
	}

	public AST parse(Reader input) throws RecognitionException,
			TokenStreamException {
		ParsingState parserState = new ParsingState();
		TokenStreamSelector selector = parserState.getSelector();

		PhpOutTheCodeLexer outTheCodeLexer = new PhpOutTheCodeLexer(input);
		PhpLexer codeLexer = new PhpLexer(outTheCodeLexer.getInputState());

		outTheCodeLexer.setParserState(parserState);
		codeLexer.setParserState(parserState);

		selector.addInputStream(codeLexer, "codelexer");
		selector.addInputStream(outTheCodeLexer, "outthecode");
		selector.select("outthecode");

		OutTheCodeFilter filter = new OutTheCodeFilter(selector);
		PhpParser parser = new PhpParser(filter);
		parser.setASTFactory(getAstFactory());
		parser.setParserState(parserState);

		parser.program();
		return parser.getAST();
	}

	public Class<? extends ASTFactory> getAstFactoryClass() {
		return astFactory.getClass();
	}

	public void setAstFactoryClass(Class<? extends ASTFactory> astFactoryClass) throws InstantiationException, IllegalAccessException {
		this.astFactory = astFactoryClass.newInstance();
	}
	
	private ASTFactory getAstFactory() {
		return astFactory;
	}
}
