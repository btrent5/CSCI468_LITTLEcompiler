import java.util.ArrayList;
import java.util.Stack;

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
    private Stack<String> exprStack = new Stack<>();
    int regNum = 1;
    int labelNum = 1;

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
        for(String var_name : ctx.id_list().getText().split(",")) {
            IRNodes.add(new IRNode("VAR", var_name));
        }
        this.inDecl = false;
    }

    @Override
    public void enterVar_type(little_grammarParser.Var_typeContext ctx) {
        if (ctx != null) {
            this.declType = ctx.getText();
        }
    }

    @Override public void exitAssign_expr(little_grammarParser.Assign_exprContext ctx) {
        IRNodes.add(new IRNode("STORE" + checkType(), exprStack.pop(), "$T" + regNum));
        IRNodes.add(new IRNode("STORE" + checkType(),"$T" + regNum, ctx.id().getText()));
        regNum++;
    }

    @Override public void exitCond(little_grammarParser.CondContext ctx) {
        String operation = "";
        switch(ctx.compop().getText()) {
            case ">":
                operation = "LE";
                break;
            case ">=":
                operation = "LT";
                break;
            case "<":
                operation = "GE";
                break;
            case "<=":
                operation = "GT";
                break;
            case "!=":
                operation = "EQ";
                break;
            case "=":
                operation = "NE";
                break;
        }
        operation += checkType();
        IRNodes.add(new IRNode(operation, exprStack.pop(), exprStack.pop(), "label" + labelNum));
        labelNum++;
    }

    @Override
    public void exitAddop(little_grammarParser.AddopContext ctx) { 
        exprStack.push(ctx.getText()); //ctx.getText is + or -
    }

    @Override
    public void exitMulop(little_grammarParser.MulopContext ctx) { 
        exprStack.push(ctx.getText()); //ctx.getText is * or /
    }

    @Override public void exitWrite_stmt(little_grammarParser.Write_stmtContext ctx) {
        
        for(String write_var : ctx.id_list().getText().split(",")) {
            IRNodes.add(new IRNode("WRITE" + checkType(), write_var));
        }
    }

    @Override //dif between this and exitFactor?
    public void exitPrimary(little_grammarParser.PrimaryContext ctx) {
        exprStack.push(ctx.getText());
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
            IRNodes.add(new IRNode("LABEL", ctx.id().getText()));
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
    public void exitIf_stmt(little_grammarParser.If_stmtContext ctx) {
        IRNodes.add(new IRNode("LABEL", "label" + labelNum));
        labelNum++;
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

    @Override
    public void exitProgram(little_grammarParser.ProgramContext ctx) {
        IRNodes.add(new IRNode("RET"));
    }

    public String checkType() {
        switch(this.declType) {
            case "INT":
                return "I";
            case "FLOAT":
                return "F";
            case "STRING":
                return "S";
            default:
                System.out.println("Unknown declType " + this.declType);
                return "";
        }
    }
}