import java.util.ArrayList;
import java.util.Stack;

/**
 * This class creates the SymbolTable.
 * 
 * @Author Michael Pollard, Ethan Malo, Marie Morin, Trent Baker
 */
public class SymbolTable {
    private Stack<Scope> scopeStack = new Stack<Scope>();
    private ArrayList<Scope> scopeList = new ArrayList<Scope>();

    public SymbolTable() {
        Scope global = new Scope("GLOBAL");
        scopeStack.push(global);
        scopeList.add(global);
    }

    public void addScope(String name) {
        Scope scope = new Scope(name);
        scopeStack.push(scope);
        scopeList.add(scope);
    }

    public void addSymbol(String name, String type, String value) {
        Symbol symbol = new Symbol(name, type, value);
    }

    private static class Scope {
        private String name;

        public Scope(String name) {
            this.name = name;
        }

        private ArrayList<Scope> scopes = new ArrayList<Scope>();
        private ArrayList<Symbol> symbols = new ArrayList<Symbol>();
    }

    private static class Symbol {
        private String name;
        private String type;
        private String value;

        public Symbol(String name, String type, String value) {
            this.name = name;
            this.type = type;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public String  getValue() {
            return value;
        }
    }
}