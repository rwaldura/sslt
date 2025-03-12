// Generated from Stylesheet.g4 by ANTLR 4.13.2

    package org.waldura.xslt; 

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StylesheetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VERBATIM=1, SINGLE_STRING=2, DOUBLE_STRING=3, COLON=4, COMMA=5, EQUAL=6, 
		LPAREN=7, RPAREN=8, LBRACE=9, RBRACE=10, INT=11, DECIMAL=12, ID=13, WS=14, 
		LINE_COMMENT=15;
	public static final int
		RULE_stylesheet = 0, RULE_definition = 1, RULE_multi_parameter_definition = 2, 
		RULE_default_parameter_definition = 3, RULE_parameter = 4, RULE_name = 5, 
		RULE_value = 6, RULE_statement = 7, RULE_function_statement = 8, RULE_multi_parameter_function = 9, 
		RULE_default_parameter_function = 10, RULE_function_body = 11, RULE_assignment = 12, 
		RULE_string = 13, RULE_number = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "definition", "multi_parameter_definition", "default_parameter_definition", 
			"parameter", "name", "value", "statement", "function_statement", "multi_parameter_function", 
			"default_parameter_function", "function_body", "assignment", "string", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "':'", "','", "'='", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VERBATIM", "SINGLE_STRING", "DOUBLE_STRING", "COLON", "COMMA", 
			"EQUAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "INT", "DECIMAL", "ID", 
			"WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Stylesheet.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StylesheetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StylesheetParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitStylesheet(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(30);
				definition();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public Multi_parameter_definitionContext multi_parameter_definition() {
			return getRuleContext(Multi_parameter_definitionContext.class,0);
		}
		public Default_parameter_definitionContext default_parameter_definition() {
			return getRuleContext(Default_parameter_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				multi_parameter_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				default_parameter_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multi_parameter_definitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Multi_parameter_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_parameter_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterMulti_parameter_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitMulti_parameter_definition(this);
		}
	}

	public final Multi_parameter_definitionContext multi_parameter_definition() throws RecognitionException {
		Multi_parameter_definitionContext _localctx = new Multi_parameter_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multi_parameter_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			name();
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				parameter();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(48);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_parameter_definitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Default_parameter_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_parameter_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterDefault_parameter_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitDefault_parameter_definition(this);
		}
	}

	public final Default_parameter_definitionContext default_parameter_definition() throws RecognitionException {
		Default_parameter_definitionContext _localctx = new Default_parameter_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_default_parameter_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			name();
			setState(51);
			value();
			setState(52);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StylesheetParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			name();
			setState(55);
			match(COLON);
			setState(56);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StylesheetParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				number();
				}
				break;
			case SINGLE_STRING:
			case DOUBLE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Function_statementContext function_statement() {
			return getRuleContext(Function_statementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode VERBATIM() { return getToken(StylesheetParser.VERBATIM, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				function_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(VERBATIM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_statementContext extends ParserRuleContext {
		public Multi_parameter_functionContext multi_parameter_function() {
			return getRuleContext(Multi_parameter_functionContext.class,0);
		}
		public Default_parameter_functionContext default_parameter_function() {
			return getRuleContext(Default_parameter_functionContext.class,0);
		}
		public Function_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterFunction_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitFunction_statement(this);
		}
	}

	public final Function_statementContext function_statement() throws RecognitionException {
		Function_statementContext _localctx = new Function_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_statement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				multi_parameter_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				default_parameter_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multi_parameter_functionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Multi_parameter_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_parameter_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterMulti_parameter_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitMulti_parameter_function(this);
		}
	}

	public final Multi_parameter_functionContext multi_parameter_function() throws RecognitionException {
		Multi_parameter_functionContext _localctx = new Multi_parameter_functionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multi_parameter_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			name();
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					parameter();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(80);
				function_body();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_parameter_functionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Default_parameter_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_parameter_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterDefault_parameter_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitDefault_parameter_function(this);
		}
	}

	public final Default_parameter_functionContext default_parameter_function() throws RecognitionException {
		Default_parameter_functionContext _localctx = new Default_parameter_functionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_default_parameter_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			name();
			setState(84);
			value();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(85);
				function_body();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(StylesheetParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StylesheetParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitFunction_body(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LBRACE);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERBATIM || _la==ID) {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(StylesheetParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			name();
			setState(98);
			match(EQUAL);
			setState(99);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode SINGLE_STRING() { return getToken(StylesheetParser.SINGLE_STRING, 0); }
		public TerminalNode DOUBLE_STRING() { return getToken(StylesheetParser.DOUBLE_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_STRING || _la==DOUBLE_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(StylesheetParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(StylesheetParser.DECIMAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesheetListener ) ((StylesheetListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000fj\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002\u0001\u0002\u0004\u0002"+
		"-\b\u0002\u000b\u0002\f\u0002.\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006?\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007D\b\u0007\u0001"+
		"\b\u0001\b\u0003\bH\b\b\u0001\t\u0001\t\u0005\tL\b\t\n\t\f\tO\t\t\u0001"+
		"\t\u0003\tR\b\t\u0001\n\u0001\n\u0001\n\u0003\nW\b\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000b[\b\u000b\n\u000b\f\u000b^\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0001\u0000\u0002"+
		"\u0003\u0001\u0000\u000b\fe\u0000!\u0001\u0000\u0000\u0000\u0002(\u0001"+
		"\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000"+
		"\u0000\b6\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f>\u0001"+
		"\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000\u0010G\u0001\u0000\u0000"+
		"\u0000\u0012I\u0001\u0000\u0000\u0000\u0014S\u0001\u0000\u0000\u0000\u0016"+
		"X\u0001\u0000\u0000\u0000\u0018a\u0001\u0000\u0000\u0000\u001ae\u0001"+
		"\u0000\u0000\u0000\u001cg\u0001\u0000\u0000\u0000\u001e \u0003\u0002\u0001"+
		"\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!"+
		"\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0001"+
		"\u0001\u0000\u0000\u0000&)\u0003\u0004\u0002\u0000\')\u0003\u0006\u0003"+
		"\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001"+
		"\u0000\u0000\u0000*,\u0003\n\u0005\u0000+-\u0003\b\u0004\u0000,+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0003\u0016\u000b"+
		"\u00001\u0005\u0001\u0000\u0000\u000023\u0003\n\u0005\u000034\u0003\f"+
		"\u0006\u000045\u0003\u0016\u000b\u00005\u0007\u0001\u0000\u0000\u0000"+
		"67\u0003\n\u0005\u000078\u0005\u0004\u0000\u000089\u0003\f\u0006\u0000"+
		"9\t\u0001\u0000\u0000\u0000:;\u0005\r\u0000\u0000;\u000b\u0001\u0000\u0000"+
		"\u0000<?\u0003\u001c\u000e\u0000=?\u0003\u001a\r\u0000><\u0001\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?\r\u0001\u0000\u0000\u0000@D\u0003\u0010"+
		"\b\u0000AD\u0003\u0018\f\u0000BD\u0005\u0001\u0000\u0000C@\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u000f"+
		"\u0001\u0000\u0000\u0000EH\u0003\u0012\t\u0000FH\u0003\u0014\n\u0000G"+
		"E\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0011\u0001\u0000"+
		"\u0000\u0000IM\u0003\n\u0005\u0000JL\u0003\b\u0004\u0000KJ\u0001\u0000"+
		"\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"PR\u0003\u0016\u000b\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000R\u0013\u0001\u0000\u0000\u0000ST\u0003\n\u0005\u0000TV\u0003\f"+
		"\u0006\u0000UW\u0003\u0016\u000b\u0000VU\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000W\u0015\u0001\u0000\u0000\u0000X\\\u0005\t\u0000\u0000"+
		"Y[\u0003\u000e\u0007\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\n\u0000\u0000`\u0017\u0001"+
		"\u0000\u0000\u0000ab\u0003\n\u0005\u0000bc\u0005\u0006\u0000\u0000cd\u0003"+
		"\f\u0006\u0000d\u0019\u0001\u0000\u0000\u0000ef\u0007\u0000\u0000\u0000"+
		"f\u001b\u0001\u0000\u0000\u0000gh\u0007\u0001\u0000\u0000h\u001d\u0001"+
		"\u0000\u0000\u0000\n!(.>CGMQV\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}