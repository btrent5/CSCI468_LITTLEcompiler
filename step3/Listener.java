/**
 * This class extends the BaseListener to implement a subset of the methods.
 *
 * @Author Michael Pollard, Ethan Malo, Marie Morin, Trent Baker
 */
public class Listener extends little_grammarBaseListener {
    private SymbolTable s;
    private Boolean inDecl = true;
    private String declType = "";

    public Listener() {
        this.s = new SymbolTable();
    }

    public SymbolTable getSymbolTable() {
        return this.s;
    }

    @Override
    public void enterProgram(little_grammarParser.ProgramContext ctx) {
    }

    @Override
    public void enterVar_type(little_grammarParser.Var_typeContext ctx) {
        System.out.println("enterVar_type");
        if (ctx != null) {
            this.declType = ctx.getText();
        }
    }

    @Override
    public void enterId_list(little_grammarParser.Id_listContext ctx) {
        System.out.println("enterID_list");
        if (ctx.id() != null && this.inDecl) {
            this.s.add(ctx.id().getText(), this.declType, "");
        }
    }
}