import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class creates the SymbolTable.
 *
 * @Author Michael Pollard, Ethan Malo, Marie Morin, Trent Baker
 */
public class SymbolTable {

    private String scope;
    public ArrayList<Symbol> symbols;

    public SymbolTable(String scopeName) {
        this.scope = scopeName;
        this.symbols = new ArrayList<Symbol>();
    }

    public SymbolTable() {
        this.scope = "placeholder";
        this.symbols = new ArrayList<Symbol>();
    }

    public void add(String name, String type, String value) {
        this.symbols.add(new Symbol(name, type, value));
    }

    public void prettyPrint() {
        System.out.println("Symbol table " + this.scope);
        for (Symbol sym : this.symbols) {
            System.out.print("name " + sym.getName() + " type " + sym.getType());
            if (sym.getValue() != "") {
                System.out.print(" value " + sym.getValue());
            }
            System.out.println();
        }
    }

    public boolean isValid() {
        ArrayList<String> dupes = new ArrayList<String>();

        for (Symbol sym : this.symbols) {
            if (dupes.contains(sym.getName())) {
                return false;
            } else {
                dupes.add(sym.getName());
            }
        }
        return true;
    }
}