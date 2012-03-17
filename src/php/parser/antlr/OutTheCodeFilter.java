/*
 * $Id$
 * 
 * Author: Konstantin Nekrasov
 */
package php.parser.antlr;

import java.util.BitSet;

import antlr.Token;
import antlr.TokenStream;
import antlr.TokenStreamException;

public class OutTheCodeFilter implements TokenStream {

	@Override
	public Token nextToken() throws TokenStreamException {

		Token token = input.nextToken();
		while (skipTokenTypes.get(token.getType())
				&& token.getType() != PhpLexer.EOF) {
			notifySkipped(token);
			token = input.nextToken();
		}
		//System.out.println("Filter: " + token.getText() + "(" + token.getType() + ")");
		return token;
	}

	protected TokenStream input;
	protected BitSet skipTokenTypes = new BitSet();

	protected void notifySkipped(Token token) {

	}

	/** Stream to read tokens from */
	public OutTheCodeFilter(TokenStream in) {
		input = in;
		skipTokenTypes.set(PhpOutTheCodeLexerTokenTypes.PHP_START);
		skipTokenTypes.set(PhpOutTheCodeLexerTokenTypes.TEXT);
		skipTokenTypes.set(PhpOutTheCodeLexerTokenTypes.PHP_END);
	}
}
