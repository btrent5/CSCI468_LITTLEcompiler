class tinyGenerator {

	public tinyGenerator() {
		switch (operator) {
		case "ADDI":
			output.append("addi");
			break;
		case "ADDR":
			output.append("addr");
			break;
		case "CMPI":
			output.append("cmpi");
			break;
		case "CMPR":
			output.append("cmpr");
			break;
		case "DECI":
			output.append("deci");
			break;
		case "DIVI":
			output.append("divi");
			break;
		case "DIVR":
			output.append("divr");
			break;
		case "EMPTYLINE":
			output.append("emptyline");
			break;
		case "ENDOFPROGRAM":
			output.append("endofprogram");
			break;
		case "INCI":
			output.append("inci");
			break;
		case "JEQ":
			output.append("jeq");
			break;
		case "JGE":
			output.append("jge");
			break;
		case "JGT":
			output.append("jgt");
			break;
		case "JLE":
			output.append("jle");
			break;
		case "JLT":
			output.append("jlt");
			break;
		case "JMP":
			output.append("jmp");
			break;
		case "JNE":
			output.append("jne");
			break;
		case "JSR":
			output.append("jsr");
			break;
		case "LABEL":
			output.append("label");
			break;
		case "LINK":
			output.append("link");
			break;
		case "MOVE":
			output.append("move");
			break;
		case "MULI":
			output.append("muli");
			break;
		case "MULR":
			output.append("mulr");
			break;
		case "POP":
			output.append("pop");
			break;
		case "PUSH":
			output.append("push");
			break;
		case "RET":
			output.append("ret");
			break;
		case "STR":
			output.append("str");
			break;
		case "SUBI":
			output.append("subi");
			break;
		case "SUBR":
			output.append("subr");
			break;
		case "SYS":
			output.append("sys");
			break;
		case "UNKNOWN":
			output.append("unknown");
			break;
		case "UNLNK":
			output.append("unlnk");
			break;
		case "VAR":
			output.append("var");
			break;
		}
	}
}