// Generated from Stylesheet.g4 by ANTLR 4.13.2

    package org.waldura.xslt; 

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StylesheetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VERBATIM=1, SINGLE_STRING=2, DOUBLE_STRING=3, COLON=4, COMMA=5, EQUAL=6, 
		LPAREN=7, RPAREN=8, LBRACE=9, RBRACE=10, INT=11, DECIMAL=12, ID=13, WS=14, 
		LINE_COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VERBATIM", "SINGLE_STRING", "DOUBLE_STRING", "COLON", "COMMA", "EQUAL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "INT", "DECIMAL", "ID", "WS", 
			"LINE_COMMENT"
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


	public StylesheetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stylesheet.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000f|\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001*\b\u0001\u000b\u0001"+
		"\f\u0001+\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002"+
		"2\b\u0002\u000b\u0002\f\u00023\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0003\nG\b\n\u0001\n\u0004\nJ\b\n\u000b\n\f\nK\u0001\u000b\u0003\u000b"+
		"O\b\u000b\u0001\u000b\u0005\u000bR\b\u000b\n\u000b\f\u000bU\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000bY\b\u000b\u000b\u000b\f\u000bZ\u0001\f\u0001"+
		"\f\u0005\f_\b\f\n\f\f\fb\t\f\u0001\r\u0004\re\b\r\u000b\r\f\rf\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000en\b\u000e\u0001"+
		"\u000e\u0005\u000eq\b\u000e\n\u000e\f\u000et\t\u000e\u0001\u000e\u0003"+
		"\u000ew\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u0001\u0000\b\u0001\u0000\u00bb\u00bb\u0001\u0000\'"+
		"\'\u0001\u0000\"\"\u0001\u000009\u0003\u0000AZ__az\u0005\u0000--09AZ_"+
		"_az\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\r\u0088\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000"+
		"\u0005/\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t9\u0001"+
		"\u0000\u0000\u0000\u000b;\u0001\u0000\u0000\u0000\r=\u0001\u0000\u0000"+
		"\u0000\u000f?\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013"+
		"C\u0001\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017N\u0001"+
		"\u0000\u0000\u0000\u0019\\\u0001\u0000\u0000\u0000\u001bd\u0001\u0000"+
		"\u0000\u0000\u001dm\u0001\u0000\u0000\u0000\u001f!\u0005\u00ab\u0000\u0000"+
		" \"\b\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%&\u0005\u00bb\u0000\u0000&\u0002\u0001\u0000\u0000\u0000"+
		"\')\u0005\'\u0000\u0000(*\b\u0001\u0000\u0000)(\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-.\u0005\'\u0000\u0000.\u0004\u0001\u0000"+
		"\u0000\u0000/1\u0005\"\u0000\u000002\b\u0002\u0000\u000010\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0005\"\u0000\u00006\u0006"+
		"\u0001\u0000\u0000\u000078\u0005:\u0000\u00008\b\u0001\u0000\u0000\u0000"+
		"9:\u0005,\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005=\u0000\u0000"+
		"<\f\u0001\u0000\u0000\u0000=>\u0005(\u0000\u0000>\u000e\u0001\u0000\u0000"+
		"\u0000?@\u0005)\u0000\u0000@\u0010\u0001\u0000\u0000\u0000AB\u0005{\u0000"+
		"\u0000B\u0012\u0001\u0000\u0000\u0000CD\u0005}\u0000\u0000D\u0014\u0001"+
		"\u0000\u0000\u0000EG\u0005-\u0000\u0000FE\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HJ\u0007\u0003\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000L\u0016\u0001\u0000\u0000\u0000MO\u0005"+
		"-\u0000\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OS\u0001"+
		"\u0000\u0000\u0000PR\u0007\u0003\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0005.\u0000"+
		"\u0000WY\u0007\u0003\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0018"+
		"\u0001\u0000\u0000\u0000\\`\u0007\u0004\u0000\u0000]_\u0007\u0005\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000a\u001a\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000ce\u0007\u0006\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0006\r\u0000\u0000i\u001c\u0001"+
		"\u0000\u0000\u0000jk\u0005/\u0000\u0000kn\u0005/\u0000\u0000ln\u0005#"+
		"\u0000\u0000mj\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000nr\u0001"+
		"\u0000\u0000\u0000oq\b\u0007\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uw\u0005\r\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0005\n\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0006\u000e\u0000"+
		"\u0000{\u001e\u0001\u0000\u0000\u0000\u000e\u0000#+3FKNSZ`fmrv\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}