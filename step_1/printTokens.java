import org.antlr.v4.runtime.*;
public class printTokens 
{
    public static void main( String[] args) throws Exception 
    {	
        little_grammarLexer lex = new little_grammarLexer(CharStreams.fromFileName(args[0]));
        for (Token tok = lex.nextToken(); tok.getType() != tok.EOF; tok = lex.nextToken()) {
            System.out.println("Token Type: " + lex.getVocabulary().getSymbolicName(tok.getType()));
            System.out.println("Value: " + tok.getText());
        }
    }
}