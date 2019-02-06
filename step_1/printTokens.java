import org.antlr.v4.runtime.*;
public class printTokens 
{
    public static void main( String[] args) throws Exception 
    {	
        little_grammarLexer lex = new little_grammarLexer(CharStreams.fromFileName(args[0]));
        Vocabulary voc = lex.getVocabulary();
        for (Token tok = lex.nextToken(); tok.getType() != tok.EOF; tok = lex.nextToken()) {
            System.out.println("Token Type: " + voc.getSymbolicName(tok.getType()));
            System.out.println("Value: " + tok.getText());
        }
    }
}