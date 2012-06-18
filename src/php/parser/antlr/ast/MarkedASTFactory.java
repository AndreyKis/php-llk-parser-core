/*
 * $Id$
 * 
 * Author: Konstantin Nekrasov
 * Created: Feb 8, 2012
 */
package php.parser.antlr.ast;

import antlr.ASTFactory;

public class MarkedASTFactory extends ASTFactory {

	public MarkedASTFactory() {
		super();
		setASTNodeClass(MarkedAST.class);
	}
}
