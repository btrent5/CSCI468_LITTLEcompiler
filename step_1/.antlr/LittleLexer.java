// Generated from /home/michael/Documents/school/senior2/compilers/CSCI468_LITTLEcompiler/step_1/little_grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LittleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTLITERAL=1, FLOATLITERAL=2, STRINGLITERAL=3, COMMENT=4, KEYWORD=5, OPERATOR=6, 
		WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", "KEYWORD", "OPERATOR", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", "KEYWORD", 
		"OPERATOR", "WS"
	};
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


	public LittleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "little_grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u00a8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\23\n\2\r\2"+
		"\16\2\24\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\6\3\37\n\3\r\3\16\3 "+
		"\3\4\3\4\7\4%\n\4\f\4\16\4(\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\60\n\5\f"+
		"\5\16\5\63\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a0\n\7\3\b\6\b\u00a3\n\b\r\b\16"+
		"\b\u00a4\3\b\3\b\4&\61\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\6\3\2\62"+
		";\6\2,-//\61\61??\6\2*+..=>@@\4\2\13\f\"\"\2\u00c3\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\22"+
		"\3\2\2\2\5\31\3\2\2\2\7\"\3\2\2\2\t+\3\2\2\2\13\u0093\3\2\2\2\r\u009f"+
		"\3\2\2\2\17\u00a2\3\2\2\2\21\23\t\2\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24"+
		"\22\3\2\2\2\24\25\3\2\2\2\25\4\3\2\2\2\26\30\t\2\2\2\27\26\3\2\2\2\30"+
		"\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34"+
		"\36\7\60\2\2\35\37\t\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2"+
		"\2\2!\6\3\2\2\2\"&\7$\2\2#%\13\2\2\2$#\3\2\2\2%(\3\2\2\2&\'\3\2\2\2&$"+
		"\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7$\2\2*\b\3\2\2\2+,\7/\2\2,-\7/\2\2-\61"+
		"\3\2\2\2.\60\13\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61\62\3\2\2\2\61/\3\2\2"+
		"\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\f\2\2\65\n\3\2\2\2\66\67\7R\2\2"+
		"\678\7T\2\289\7Q\2\29:\7I\2\2:;\7T\2\2;<\7C\2\2<\u0094\7O\2\2=>\7D\2\2"+
		">?\7G\2\2?@\7I\2\2@A\7K\2\2A\u0094\7P\2\2BC\7G\2\2CD\7P\2\2D\u0094\7F"+
		"\2\2EF\7H\2\2FG\7W\2\2GH\7P\2\2HI\7E\2\2IJ\7V\2\2JK\7K\2\2KL\7Q\2\2L\u0094"+
		"\7P\2\2MN\7T\2\2NO\7G\2\2OP\7C\2\2P\u0094\7F\2\2QR\7Y\2\2RS\7T\2\2ST\7"+
		"K\2\2TU\7V\2\2U\u0094\7G\2\2VW\7K\2\2W\u0094\7H\2\2XY\7G\2\2YZ\7N\2\2"+
		"Z[\7U\2\2[\u0094\7G\2\2\\]\7G\2\2]^\7P\2\2^_\7F\2\2_`\7K\2\2`\u0094\7"+
		"H\2\2ab\7Y\2\2bc\7J\2\2cd\7K\2\2de\7N\2\2e\u0094\7G\2\2fg\7G\2\2gh\7P"+
		"\2\2hi\7F\2\2ij\7Y\2\2jk\7J\2\2kl\7K\2\2lm\7N\2\2m\u0094\7G\2\2no\7E\2"+
		"\2op\7Q\2\2pq\7P\2\2qr\7V\2\2rs\7K\2\2st\7P\2\2tu\7W\2\2u\u0094\7G\2\2"+
		"vw\7D\2\2wx\7T\2\2xy\7G\2\2yz\7C\2\2z\u0094\7M\2\2{|\7T\2\2|}\7G\2\2}"+
		"~\7V\2\2~\177\7W\2\2\177\u0080\7T\2\2\u0080\u0094\7P\2\2\u0081\u0082\7"+
		"K\2\2\u0082\u0083\7P\2\2\u0083\u0094\7V\2\2\u0084\u0085\7X\2\2\u0085\u0086"+
		"\7Q\2\2\u0086\u0087\7K\2\2\u0087\u0094\7F\2\2\u0088\u0089\7U\2\2\u0089"+
		"\u008a\7V\2\2\u008a\u008b\7T\2\2\u008b\u008c\7K\2\2\u008c\u008d\7P\2\2"+
		"\u008d\u0094\7I\2\2\u008e\u008f\7H\2\2\u008f\u0090\7N\2\2\u0090\u0091"+
		"\7Q\2\2\u0091\u0092\7C\2\2\u0092\u0094\7V\2\2\u0093\66\3\2\2\2\u0093="+
		"\3\2\2\2\u0093B\3\2\2\2\u0093E\3\2\2\2\u0093M\3\2\2\2\u0093Q\3\2\2\2\u0093"+
		"V\3\2\2\2\u0093X\3\2\2\2\u0093\\\3\2\2\2\u0093a\3\2\2\2\u0093f\3\2\2\2"+
		"\u0093n\3\2\2\2\u0093v\3\2\2\2\u0093{\3\2\2\2\u0093\u0081\3\2\2\2\u0093"+
		"\u0084\3\2\2\2\u0093\u0088\3\2\2\2\u0093\u008e\3\2\2\2\u0094\f\3\2\2\2"+
		"\u0095\u0096\7<\2\2\u0096\u00a0\7?\2\2\u0097\u00a0\t\3\2\2\u0098\u0099"+
		"\7#\2\2\u0099\u00a0\7?\2\2\u009a\u00a0\t\4\2\2\u009b\u009c\7>\2\2\u009c"+
		"\u00a0\7?\2\2\u009d\u009e\7@\2\2\u009e\u00a0\7?\2\2\u009f\u0095\3\2\2"+
		"\2\u009f\u0097\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009b"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\16\3\2\2\2\u00a1\u00a3\t\5\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\b\2\2\u00a7\20\3\2\2\2\13\2\24"+
		"\31 &\61\u0093\u009f\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}