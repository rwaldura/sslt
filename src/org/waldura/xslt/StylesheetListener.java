// Generated from Stylesheet.g4 by ANTLR 4.13.2

    package org.waldura.xslt; 

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StylesheetParser}.
 */
public interface StylesheetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(StylesheetParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(StylesheetParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(StylesheetParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(StylesheetParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#multi_parameter_definition}.
	 * @param ctx the parse tree
	 */
	void enterMulti_parameter_definition(StylesheetParser.Multi_parameter_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#multi_parameter_definition}.
	 * @param ctx the parse tree
	 */
	void exitMulti_parameter_definition(StylesheetParser.Multi_parameter_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#default_parameter_definition}.
	 * @param ctx the parse tree
	 */
	void enterDefault_parameter_definition(StylesheetParser.Default_parameter_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#default_parameter_definition}.
	 * @param ctx the parse tree
	 */
	void exitDefault_parameter_definition(StylesheetParser.Default_parameter_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(StylesheetParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(StylesheetParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(StylesheetParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(StylesheetParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(StylesheetParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(StylesheetParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StylesheetParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StylesheetParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(StylesheetParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(StylesheetParser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#multi_parameter_function}.
	 * @param ctx the parse tree
	 */
	void enterMulti_parameter_function(StylesheetParser.Multi_parameter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#multi_parameter_function}.
	 * @param ctx the parse tree
	 */
	void exitMulti_parameter_function(StylesheetParser.Multi_parameter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#default_parameter_function}.
	 * @param ctx the parse tree
	 */
	void enterDefault_parameter_function(StylesheetParser.Default_parameter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#default_parameter_function}.
	 * @param ctx the parse tree
	 */
	void exitDefault_parameter_function(StylesheetParser.Default_parameter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(StylesheetParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(StylesheetParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(StylesheetParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(StylesheetParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(StylesheetParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(StylesheetParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesheetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(StylesheetParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesheetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(StylesheetParser.NumberContext ctx);
}