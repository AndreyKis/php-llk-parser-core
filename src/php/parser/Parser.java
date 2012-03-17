/*
 * $Id$
 * 
 * Author: Konstantin Nekrasov
 * Created: Feb 8, 2012
 */

package php.parser;

import java.io.Reader;

import php.parser.antlr.MarkedAST;
import php.parser.antlr.OutTheCodeFilter;
import php.parser.antlr.ParsingState;
import php.parser.antlr.PhpLexer;
import php.parser.antlr.PhpOutTheCodeLexer;
import php.parser.antlr.PhpParser;
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

	public static AST parse(Reader input) throws RecognitionException,
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
		parser.setParserState(parserState);
		parser.getASTFactory().setASTNodeClass(MarkedAST.class);

		parser.program();
		return parser.getAST();
	}
}
