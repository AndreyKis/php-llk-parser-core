/*
 * $Id$
 * 
 * Author: Konstantin Nekrasov
 * Created: Mar 16, 2012
 */

package php.parser.util.console;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

import php.parser.Parser;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.TokenStreamSelector;
import antlr.collections.AST;

/**
 * Provides console interface to the parser library. Expected to be used in the
 * test purposes.
 * 
 * @author knekrasov
 * 
 */
public class Main {
	public static TokenStreamSelector selector = new TokenStreamSelector();

	static void printTree(AST root, int depth) {
		if (root != null) {
			for (int i = 0; i < depth; ++i) {
				System.out.print("  ");
			}
			System.out.println(root.getText() + " :" + root.getLine() + ":"
					+ root.getColumn());

			printTree(root.getFirstChild(), depth + 1);
			printTree(root.getNextSibling(), depth);
		}
	}

	private Task parseArguments(String[] args) {
		Task task = new Task();
		for (int i = 0; i < args.length; ++i) {
			String arg = args[i];
			if (!arg.startsWith("-")) {
				task.setFileName(args[i]);
			} else {
				if (arg.equals("--verbose")) {
					task.setVerbose(true);
				} else if (arg.equals("--print-ast")) {
					task.setPrintAST(true);
				} else if (arg.equals("--help")) {

				}
			}
		}
		if (task.getFileName() == null) {
			task.setShowHelp(true);
		}
		return task;
	}

	private BufferedReader getInputStream(Task task)
			throws FileNotFoundException {
		if (task.getFileName() != null) {
			return new BufferedReader(new FileReader(task.getFileName()));
		}
		return new BufferedReader(new InputStreamReader(System.in));
	}

	public boolean executeTask(Task task) {
		boolean result = false;
		try {
			if (task.isShowHelp()) {
				printHelpInfo();
				return true;
			}

			if (task.isVerbose()) {
				System.out.println(task.getFileName());
			}
			
			Parser parser = new Parser();
			AST root = parser.parse(getInputStream(task));
			if (task.isPrintAST()) {
				printTree(root, 0);
			}
			result = true;
		} catch (RecognitionException e) {
			System.err.println("Parse error at [" + e.getLine() + ":"
					+ e.getColumn() + "]: " + e.getMessage());
		} catch (TokenStreamException e) {
			System.err.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.err.println("The given file " + task.getFileName()
					+ " is not readable or doesn't exist.");
		}

		if (task.isVerbose()) {
			System.out.println("	Parse result: " + (result ? "OK" : "FAILED"));
		}

		return result;
	}

	private void printHelpInfo() {
		System.out.println();
		System.out.println("  PHP 5.2 parser functionality test program");
		System.out.println("  Version: " + Main.class.getPackage().getImplementationVersion());
		System.out
				.println("  Usage: java -jar php-llk-parser.jar [options] <php filename to test>");
		System.out.println();
		System.out.println("    Availaible options:");
		System.out
				.println("	--print-ast		Prints the abstract syntactic tree for the given file");
		System.out
				.println("	--verbose		Reports additional info on the process result");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main mainInstance = new Main();
		Task task = mainInstance.parseArguments(args);
		boolean ok = mainInstance.executeTask(task);
		if (ok) {
			System.exit(0);
		} else {
			System.exit(1);
		}
	}

}
