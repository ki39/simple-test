// Generated from /Users/yushe/Code/simpletest/src/main/java/com/shomis/simpletest/antlr4/Hello.g4 by ANTLR 4.8
package com.shomis.simpletest.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(HelloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(HelloParser.RContext ctx);
}