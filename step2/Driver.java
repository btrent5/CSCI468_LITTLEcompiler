import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Driver {
    public static void main( String[] args) throws Exception {
        little_grammarLexer lex = new little_grammarLexer(CharStreams.fromFileName(args[0]));
        little_grammarParser par = new little_grammarParser(new CommonTokenStream(lex));
        new ParseTreeWalker().walk(new little_grammarBaseListener(), par.program());
        String result = par.getNumberOfSyntaxErrors() > 0 ? "Not accepted" : "Accepted";
        System.out.println(result);
    }
}