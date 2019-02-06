// Generated from little_grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class little_grammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, INTLITERAL=2, FLOATLITERAL=3, STRINGLITERAL=4, COMMENT=5, 
		KEYWORD=6, OPERATOR=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", 
		"KEYWORD", "OPERATOR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", 
		"KEYWORD", "OPERATOR", "WS"
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


	public little_grammarLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\3\6\3\34\n\3\r\3\16\3\35\3\4\7\4!\n\4\f\4\16"+
		"\4$\13\4\3\4\3\4\6\4(\n\4\r\4\16\4)\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u009f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00ab\n\b\3\t\6\t\u00ae\n\t\r\t\16\t\u00af\3\t\3\t\4/:\2\n\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\b\3\2C|\4\2\62;C|\3\2\62;\6\2,-//\61"+
		"\61??\6\2*+..=>@@\4\2\13\f\"\"\2\u00cf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3"+
		"\23\3\2\2\2\5\33\3\2\2\2\7\"\3\2\2\2\t+\3\2\2\2\13\64\3\2\2\2\r\u009e"+
		"\3\2\2\2\17\u00aa\3\2\2\2\21\u00ad\3\2\2\2\23\27\t\2\2\2\24\26\t\3\2\2"+
		"\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\4\3\2\2\2"+
		"\31\27\3\2\2\2\32\34\t\4\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2"+
		"\35\36\3\2\2\2\36\6\3\2\2\2\37!\t\4\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2"+
		"\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%\'\7\60\2\2&(\t\4\2\2\'&\3\2\2\2()"+
		"\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\b\3\2\2\2+/\7$\2\2,.\13\2\2\2-,\3\2\2\2"+
		".\61\3\2\2\2/\60\3\2\2\2/-\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7$"+
		"\2\2\63\n\3\2\2\2\64\65\7/\2\2\65\66\7/\2\2\66:\3\2\2\2\679\13\2\2\28"+
		"\67\3\2\2\29<\3\2\2\2:;\3\2\2\2:8\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\f\2"+
		"\2>?\3\2\2\2?@\b\6\2\2@\f\3\2\2\2AB\7R\2\2BC\7T\2\2CD\7Q\2\2DE\7I\2\2"+
		"EF\7T\2\2FG\7C\2\2G\u009f\7O\2\2HI\7D\2\2IJ\7G\2\2JK\7I\2\2KL\7K\2\2L"+
		"\u009f\7P\2\2MN\7G\2\2NO\7P\2\2O\u009f\7F\2\2PQ\7H\2\2QR\7W\2\2RS\7P\2"+
		"\2ST\7E\2\2TU\7V\2\2UV\7K\2\2VW\7Q\2\2W\u009f\7P\2\2XY\7T\2\2YZ\7G\2\2"+
		"Z[\7C\2\2[\u009f\7F\2\2\\]\7Y\2\2]^\7T\2\2^_\7K\2\2_`\7V\2\2`\u009f\7"+
		"G\2\2ab\7K\2\2b\u009f\7H\2\2cd\7G\2\2de\7N\2\2ef\7U\2\2f\u009f\7G\2\2"+
		"gh\7G\2\2hi\7P\2\2ij\7F\2\2jk\7K\2\2k\u009f\7H\2\2lm\7Y\2\2mn\7J\2\2n"+
		"o\7K\2\2op\7N\2\2p\u009f\7G\2\2qr\7G\2\2rs\7P\2\2st\7F\2\2tu\7Y\2\2uv"+
		"\7J\2\2vw\7K\2\2wx\7N\2\2x\u009f\7G\2\2yz\7E\2\2z{\7Q\2\2{|\7P\2\2|}\7"+
		"V\2\2}~\7K\2\2~\177\7P\2\2\177\u0080\7W\2\2\u0080\u009f\7G\2\2\u0081\u0082"+
		"\7D\2\2\u0082\u0083\7T\2\2\u0083\u0084\7G\2\2\u0084\u0085\7C\2\2\u0085"+
		"\u009f\7M\2\2\u0086\u0087\7T\2\2\u0087\u0088\7G\2\2\u0088\u0089\7V\2\2"+
		"\u0089\u008a\7W\2\2\u008a\u008b\7T\2\2\u008b\u009f\7P\2\2\u008c\u008d"+
		"\7K\2\2\u008d\u008e\7P\2\2\u008e\u009f\7V\2\2\u008f\u0090\7X\2\2\u0090"+
		"\u0091\7Q\2\2\u0091\u0092\7K\2\2\u0092\u009f\7F\2\2\u0093\u0094\7U\2\2"+
		"\u0094\u0095\7V\2\2\u0095\u0096\7T\2\2\u0096\u0097\7K\2\2\u0097\u0098"+
		"\7P\2\2\u0098\u009f\7I\2\2\u0099\u009a\7H\2\2\u009a\u009b\7N\2\2\u009b"+
		"\u009c\7Q\2\2\u009c\u009d\7C\2\2\u009d\u009f\7V\2\2\u009eA\3\2\2\2\u009e"+
		"H\3\2\2\2\u009eM\3\2\2\2\u009eP\3\2\2\2\u009eX\3\2\2\2\u009e\\\3\2\2\2"+
		"\u009ea\3\2\2\2\u009ec\3\2\2\2\u009eg\3\2\2\2\u009el\3\2\2\2\u009eq\3"+
		"\2\2\2\u009ey\3\2\2\2\u009e\u0081\3\2\2\2\u009e\u0086\3\2\2\2\u009e\u008c"+
		"\3\2\2\2\u009e\u008f\3\2\2\2\u009e\u0093\3\2\2\2\u009e\u0099\3\2\2\2\u009f"+
		"\16\3\2\2\2\u00a0\u00a1\7<\2\2\u00a1\u00ab\7?\2\2\u00a2\u00ab\t\5\2\2"+
		"\u00a3\u00a4\7#\2\2\u00a4\u00ab\7?\2\2\u00a5\u00ab\t\6\2\2\u00a6\u00a7"+
		"\7>\2\2\u00a7\u00ab\7?\2\2\u00a8\u00a9\7@\2\2\u00a9\u00ab\7?\2\2\u00aa"+
		"\u00a0\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa\u00a5\3\2"+
		"\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\20\3\2\2\2\u00ac\u00ae"+
		"\t\7\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\t\2\2\u00b2\22\3\2\2"+
		"\2\r\2\25\27\35\")/:\u009e\u00aa\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}