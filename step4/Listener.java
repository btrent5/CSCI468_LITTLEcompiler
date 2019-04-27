import java.util.ArrayList;

/**
 * This class extends the BaseListener to implement a subset of the methods.
 *
 * @Author Michael Pollard, Ethan Malo, Marie Morin, Trent Baker
 */
public class Listener extends little_grammarBaseListener {
    private SymbolTable s; // the current table
    private ArrayList<SymbolTable> tableList;
    private ArrayList<IRNode> IRNodes;
    private Boolean inDecl = true;
    private String declType = "";
    private int scopeNum = 1;

    public Listener(ArrayList<IRNode> IRNodes) {
        tableList = new ArrayList<SymbolTable>();
        this.IRNodes = IRNodes;
    }

    public ArrayList<SymbolTable> getSymbolTables() {
        return tableList;
    }

    @Override
    public void enterProgram(little_grammarParser.ProgramContext ctx) {
        this.s = new SymbolTable("GLOBAL");
        this.tableList.add(s);
    }

    @Override
    public void enterString_decl(little_grammarParser.String_declContext ctx) {
        this.inDecl = true;
        this.s.add(ctx.id().getText(), "STRING", ctx.str().getText());
    }

    @Override
    public void exitString_decl(little_grammarParser.String_declContext ctx) {
        this.inDecl = false;
    }

    @Override
    public void enterVar_decl(little_grammarParser.Var_declContext ctx) {
        this.inDecl = true;
    }

    @Override
    public void exitVar_decl(little_grammarParser.Var_declContext ctx) {
        this.inDecl = false;
    }

    @Override
    public void enterVar_type(little_grammarParser.Var_typeContext ctx) {
        if (ctx != null) {
            this.declType = ctx.getText();
        }
    }

    @Override
    public void enterId_list(little_grammarParser.Id_listContext ctx) {
        if (this.inDecl) {
            this.s.add(ctx.id().getText(), this.declType, "");
        }
    }

    @Override
    public void enterId_tail(little_grammarParser.Id_tailContext ctx) {
        if (this.inDecl && ctx.id() != null) {
            this.s.add(ctx.id().getText(), this.declType, "");
        }
    }

    @Override
    public void enterParam_decl(little_grammarParser.Param_declContext ctx) {
        this.s.add(ctx.id().getText(), ctx.var_type().getText(), "");
    }

    @Override
    public void enterFunc_decl(little_grammarParser.Func_declContext ctx) {
        if (ctx.any_type() != null) {
            this.s = new SymbolTable(ctx.id().getText());
            this.tableList.add(this.s);
        }
    }

    @Override
    public void enterIf_stmt(little_grammarParser.If_stmtContext ctx) {

        if (ctx.cond() != null) {
            this.s = new SymbolTable("BLOCK " + scopeNum++);
            this.tableList.add(this.s);
        }
    }

    @Override
    public void enterElse_part(little_grammarParser.Else_partContext ctx) {

        if (ctx.decl() != null) {
            this.s = new SymbolTable("BLOCK " + scopeNum++);
            this.tableList.add(this.s);
        }
    }

    @Override
    public void enterWhile_stmt(little_grammarParser.While_stmtContext ctx) {

        if (ctx.cond() != null) {
            this.s = new SymbolTable("BLOCK " + scopeNum++);
            this.tableList.add(this.s);
        }
    }
}