import java.util.ArrayList;

class TinyGenerator {

	public TinyGenerator(ArrayList<IRNode> input) {
		StringBuilder output = new StringBuilder();
		for (IRNode current : input) {
			switch (current.getOperator()) {
			case "ADDI":
				output.append("addi\n");
				break;
			case "ADDR":
				output.append("addr\n");
				break;
			case "CMPI":
				output.append("cmpi\n");
				break;
			case "CMPR":
				output.append("cmpr\n");
				break;
			case "DECI":
				output.append("deci\n");
				break;
			case "DIVI":
				output.append("divi\n");
				break;
			case "DIVR":
				output.append("divr\n");
				break;
			case "EMPTYLINE":
				output.append("emptyline\n");
				break;
			case "ENDOFPROGRAM":
				output.append("endofprogram\n");
				break;
			case "INCI":
				output.append("inci\n");
				break;
			case "JEQ":
				output.append("jeq\n");
				break;
			case "JGE":
				output.append("jge\n");
				break;
			case "JGT":
				output.append("jgt\n");
				break;
			case "JLE":
				output.append("jle\n");
				break;
			case "JLT":
				output.append("jlt\n");
				break;
			case "JMP":
				output.append("jmp\n");
				break;
			case "JNE":
				output.append("jne\n");
				break;
			case "JSR":
				output.append("jsr\n");
				break;
			case "LABEL":
				output.append("label\n");
				break;
			case "LINK":
				output.append("link\n");
				break;
			case "MOVE":
				output.append("move\n");
				break;
			case "MULI":
				output.append("muli\n");
				break;
			case "MULR":
				output.append("mulr\n");
				break;
			case "POP":
				output.append("pop\n");
				break;
			case "PUSH":
				output.append("push\n");
				break;
			case "RET":
				output.append("ret\n");
				break;
			case "STR":
				output.append("str\n");
				break;
			case "SUBI":
				output.append("subi\n");
				break;
			case "SUBR":
				output.append("subr\n");
				break;
			case "SYS":
				output.append("sys\n");
				break;
			case "UNKNOWN":
				output.append("unknown\n");
				break;
			case "UNLNK":
				output.append("unlnk\n");
				break;
			case "VAR":
				output.append("var\n");
				break;
			}
		}
		System.out.println(output);
	}
}