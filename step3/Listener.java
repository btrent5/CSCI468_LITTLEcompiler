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
        s.addScope(ctx.getText());
    }

    @Override
    public void exitFunc_decl(little_grammarParser.Func_declContext ctx) {
        //pop off scop stack?
    }

    @Override 
    public void enterString_decl(little_grammarParser.String_declContext ctx) {

    }

    @Override 
    public void exitString_decl(little_grammarParser.String_declContext ctx) {

    }


}