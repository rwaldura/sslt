package org.waldura.xslt; 

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 */
@SuppressWarnings("CheckReturnValue")
public class StylesheetCustomListener extends StylesheetBaseListener 
{
	public static final Map<String, String> DEFAULT_ATTRIBUTE = Map.of(
		"template", "select",
		"value-of", "select",
		"if", "test",
		"when", "test"
	);
	
    public static Map<String, String> adapt(List<StylesheetParser.ParameterContext> params) 
	{
        // return params.stream().collect(Collectors.toMap(
        //     param -> param.name().toString(),
        //     param -> param.value().toString() // getText() instead??
        // ));
		Map<String, String> result = new HashMap<String, String>(params.size());
		for (StylesheetParser.ParameterContext param : params) {
			result.put(param.name().ID().toString(), param.value().toString());
		}
		return Collections.unmodifiableMap(result);
    }	
	
	private Writer w;

	public StylesheetCustomListener() {}
		
	public StylesheetCustomListener(Writer w)
	{
		this.w = w;
	}
		
	public StylesheetCustomListener setWriter(Writer w)
	{
		this.w = w;
		return this;
	}
	
	public Writer getWriter()
	{
		return this.w;
	}
	
	private StylesheetCustomListener writeAppend(String s)
	{
		try {
			w.append(s);
			return this;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private StylesheetCustomListener openElement(StylesheetParser.NameContext ctx, List<StylesheetParser.ParameterContext> params, boolean alsoCloseElement)
	{
		return openElement(ctx.ID().toString(), params, alsoCloseElement);
	}

	private StylesheetCustomListener openElement(StylesheetParser.NameContext ctx, Map<String, String> attributes, boolean alsoCloseElement)
	{
		return openElement(ctx.ID().toString(), attributes, alsoCloseElement);
	}

	private StylesheetCustomListener openElement(String elementName, List<StylesheetParser.ParameterContext> params, boolean alsoCloseElement)
	{
		return openElement(elementName, adapt(params), alsoCloseElement);
	}

	private StylesheetCustomListener openElement(String elementName, Map<String, String> attributes, boolean alsoCloseElement)
	{
		try {
			w.append("<xsl:").append(elementName);
			for (Map.Entry<String, String> attr : attributes.entrySet()) {
				w.append(" ")
				 .append(attr.getKey()) // attribute name
				 .append("=\"")
				 .append(attr.getValue()) // attribute value
				 .append("\"");
			}
			if (alsoCloseElement) {
				w.append(" /");
			}
			w.append(">\n");		
			return this;		
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private StylesheetCustomListener closeElement(StylesheetParser.NameContext ctx)
	{ 
		return closeElement(ctx.ID().toString());
	}	

	private StylesheetCustomListener closeElement(String elementName)
	{
		try {
			w.append("</xsl:").append(elementName).append(">\n");			
			return this;		
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}	
	
	@Override public void enterStylesheet(StylesheetParser.StylesheetContext ctx) 
	{ 
		try {
			w.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
			openElement(
				"stylesheet", 
				Map.of("version", "1.0", "xmlns:xsl", "http://www.w3.org/1999/XSL/Transform"),
				false);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override public void exitStylesheet(StylesheetParser.StylesheetContext ctx) 
	{
		closeElement("stylesheet");
	}

	@Override public void enterMulti_parameter_definition(StylesheetParser.Multi_parameter_definitionContext ctx) 
	{ 
		openElement(ctx.name(), ctx.parameter(), false);
	}

	@Override public void enterDefault_parameter_definition(StylesheetParser.Default_parameter_definitionContext ctx) 
	{
		openElement(
			ctx.name(), 
			Collections.singletonMap(
				defaultAttributeForElement(ctx.name()), 
				ctx.value().toString()), // @todo this is not right: produces "[51 39 30]" 
			false);
	}

	private String defaultAttributeForElement(StylesheetParser.NameContext ctx)
	{
		String result = "_undefined_default_attribute_";
		String elementName = ctx.ID().toString().toLowerCase();
		if (DEFAULT_ATTRIBUTE.containsKey(elementName))
			result = DEFAULT_ATTRIBUTE.get(elementName); 
		return result;
	}
	
	@Override public void exitMulti_parameter_definition(StylesheetParser.Multi_parameter_definitionContext ctx)
	{ 
		closeElement(ctx.name());
	}

	@Override public void exitDefault_parameter_definition(StylesheetParser.Default_parameter_definitionContext ctx)
	{ 
		closeElement(ctx.name());
	}
	
	@Override public void enterMulti_parameter_function(StylesheetParser.Multi_parameter_functionContext ctx)
	{
		openElement(
			ctx.name(), 
			ctx.parameter(),
			ctx.function_body() == null /* close element if no body follows */);		
	}	

	@Override public void enterDefault_parameter_function(StylesheetParser.Default_parameter_functionContext ctx)
	{
		openElement(
			ctx.name(), 
			Collections.singletonMap(
				defaultAttributeForElement(ctx.name()), 
				ctx.value().toString()), // @todo not correct: "[51 39 30]"
			ctx.function_body() == null /* close element if no body follows */);
	}
		
	@Override public void exitMulti_parameter_function(StylesheetParser.Multi_parameter_functionContext ctx)
	{
		if (ctx.function_body() != null)
			closeElement(ctx.name());
	}
		
	@Override public void exitDefault_parameter_function(StylesheetParser.Default_parameter_functionContext ctx)
	{
		if (ctx.function_body() != null)
			closeElement(ctx.name());
	}

	@Override public void enterStatement(StylesheetParser.StatementContext ctx) 
	{
		if (ctx.VERBATIM() != null) {
			String verbatim = ctx.VERBATIM().toString();
			if (verbatim.length() >= 2) {
				// drop first and last characters
				writeAppend(verbatim.substring(1, verbatim.length() - 1));
			}
		}
	}

	@Override public void exitStatement(StylesheetParser.StatementContext ctx) 
	{ 
		;
	}
}
