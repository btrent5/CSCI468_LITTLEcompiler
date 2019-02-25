import org.antlr.v4.runtime.*;
public class Driver 
{
    public static void main( String[] args) throws Exception 
    {	
        // Create needed instances.
        little_grammarLexer lex = new little_grammarLexer(CharStreams.fromFileName(args[0]));
        CommonTokenStream tok = new CommonTokenStream(lex);
        litte_grammarParser par = new little_grammarParser(tokens);


        // Determine and print out result.
        String result = par.getNumberOfSyntaxErrors() > 0 ? "Not Accepted" : "Accepted";
        System.out.println(result);

    }
}