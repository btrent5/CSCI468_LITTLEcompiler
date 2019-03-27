/**
 * This class extends the BaseListener to implement a subset of the methods.
 *
 * @Author Michael Pollard, Ethan Malo, Marie Morin, Trent Baker
 */
public class Listener extends little_grammarBaseListener {
    SymbolTable s = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return this.s;
    }

    @Override
    public void enterFunc_decl(little_grammarParser.Func_declContext ctx) {
        //operate on symbol table here
    }

    @Override
    public void exitFunc_decl(little_grammarParser.Func_declContext ctx) {
        //operate on symbol table here
    }

    //additional rules and/or helper methods here...
}