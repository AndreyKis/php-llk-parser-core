/*
 * $Id: Parser.java 10 2012-03-11 19:38:25Z const.nekrasoff@gmail.com $
 * 
 * Author: Konstantin Nekrasov
 * Created: Mar 16, 2012
 */

package php.parser.util.console;

public class Task {
	private String fileName;
	private boolean isVerbose;
	private boolean printAST;
	private boolean showHelp;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean isVerbose() {
		return isVerbose;
	}

	public void setVerbose(boolean isVerbose) {
		this.isVerbose = isVerbose;
	}

	public boolean isPrintAST() {
		return printAST;
	}

	public void setPrintAST(boolean printAST) {
		this.printAST = printAST;
	}

	public void setShowHelp(boolean showHelp) {
		this.showHelp = showHelp;
	}

	public boolean isShowHelp() {
		return showHelp;
	}
}
