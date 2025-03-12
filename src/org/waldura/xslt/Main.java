/*
  export CLASSPATH=./build:~/lib/antlr-4.13.2-complete.jar
  javac -d build src/** /*.java && 
  	java org.waldura.xslt.Main test/2.sxsl /dev/stdout | 
  		xmllint --format -
 */
package org.waldura.xslt;

import java.io.*;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

public class Main
{
	public void run(CharStream input, Writer output) throws IOException
	{
		StylesheetLexer lexer = new StylesheetLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		StylesheetParser parser = new StylesheetParser(tokens);
		StylesheetParser.StylesheetContext tree = parser.stylesheet(); // parse 

		StylesheetListener listener = new StylesheetCustomListener(output);
		ParseTreeWalker.DEFAULT.walk(listener, tree); // initiate walk of tree with listener in use of default walker	
		
		// input.close(); not supported
		output.close();
	}
	
	/**
	 * Two filenames are expected as parameters: input, and output. 
	 */
	public static void main(String[] args) throws Exception
	{
		new Main().run(CharStreams.fromFileName(args[0]), new BufferedWriter(new FileWriter(args[1])));
	}
}
