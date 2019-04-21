
/* class for IRNode object */
public class IRNode {
    private String operator, reg1, reg2, reg3;
    public IRNode(String operator, String reg1, String reg2, String reg3) {
        this.operator = operator;
        this.reg1 = reg1;
        this.reg2 = reg2;
        this.reg3 = reg3;
    }

    public String getOperator() {
        return this.op;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public String getReg1() {
        return this.reg1;
    }
    public void setReg1(String reg1) {
        this.reg1 = reg1;
    }
    public String getReg2() {
        return this.reg2;
    }
    public void setReg2(String reg2) {
        this.reg2 = reg2;
    }
    public String getReg3() {
        return this.reg3;
    }
    public void setReg3(String reg3) {
        this.reg3 = reg3;
    }
}