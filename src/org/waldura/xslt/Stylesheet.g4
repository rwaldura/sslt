grammar Stylesheet; // for XSLT 1.0

@header {
    package org.waldura.xslt; 
}

stylesheet: 
    definition+ EOF;

definition: 
    multi_parameter_definition
	| default_parameter_definition;

multi_parameter_definition:
	name parameter+ function_body;
	
default_parameter_definition:
    name value function_body;
    
parameter: name COLON value;
name: ID;
value: number | string;

statement: 
    function_statement
    | assignment
    | VERBATIM;
    
function_statement: 
    multi_parameter_function
	| default_parameter_function;

multi_parameter_function:
	name parameter* function_body?;
	
default_parameter_function:
    name value function_body?;

function_body: 
    LBRACE statement* RBRACE;

assignment:
    name EQUAL value;
    
// --------------------------------
// Lexical rules
string: SINGLEQ_STRING | DOUBLEQ_STRING;
number: INT | DECIMAL;

// «guillemets»
VERBATIM: '\u00AB' ~('\u00BB')+ '\u00BB';

SINGLEQ_STRING: '\'' ~('\'')+ '\'';
DOUBLEQ_STRING: '"' ~('"')+ '"';

COLON : ':' ;
COMMA : ',' ;
EQUAL : '=' ;

LPAREN: '(' ;
RPAREN: ')' ;

LBRACE: '{' ;
RBRACE: '}' ;

INT: '-'? [0-9]+ ;
DECIMAL: '-'? [0-9]* '.' [0-9]+ ;
ID: [a-zA-Z_][-a-zA-Z_0-9]* ;
WS: [ \t\n\r\f]+ -> skip ;

// comments
LINE_COMMENT: ('//' | '#') ~( '\n'|'\r' )* '\r'? '\n' -> skip;
