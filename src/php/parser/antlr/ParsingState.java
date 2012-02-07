/*
 * $Id$
 * 
 * Copyright $Date$.
 * Author: Konstantin Nekrasov
 */

package php.parser.antlr;

import java.util.ArrayList;
import java.util.List;

import antlr.Token;
import antlr.TokenStreamSelector;

public class ParsingState {
	private final TokenStreamSelector selector = new TokenStreamSelector();
	private final List<Token> filteredTokens = new ArrayList<Token>();

	public TokenStreamSelector getSelector() {
		return selector;
	}

	public List<Token> getFilteredTokens() {
		return filteredTokens;
	}
}
