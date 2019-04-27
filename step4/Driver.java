import java.util.ArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * This class runs the input files with the generated antlr components to create
 * and then print out the SymbolTable.
 *
 * @Author Michael Pollard, Ethan Malo, Marie Morin, Trent Baker
 */
public class Driver {
    public static void main(String[] args) throws Exception {
        ArrayList<IRNode> IRNodes = new ArrayList<IRNode>();
        little_grammarParser parser = new little_grammarParser(
                new CommonTokenStream(new little_grammarLexer(
                    CharStreams.fromFileName(args[0]))));

        Listener listener = new Listener(IRNodes);
        new ParseTreeWalker().walk(listener, parser.program());
        for (SymbolTable s : listener.getSymbolTables()) {
            if (!s.isValid()) {
                System.out.println("DECLARATION ERROR n");
                return;
            }
        }

        TinyGenerator generator = new TinyGenerator(IRNodes);

        // for (SymbolTable s : listener.getSymbolTables()) {
        //     s.prettyPrint();
        // }
    }

}