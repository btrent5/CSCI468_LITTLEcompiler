import java.util.ArrayList;

class TinyGenerator {
	private int varCount = 0;

	public TinyGenerator(ArrayList<IRNode> input) {
		StringBuilder output = new StringBuilder();
		for (IRNode current : input) {
			// still need to prepend all var names maybe make part of convertRegString?? tbd
			switch (current.getOperator()) {
			case "ADDI":
				output.append("move " + convertRegString(current.getReg1()) + " " + convertRegString(current.getReg3())
						+ "\n");
				output.append("addi " + convertRegString(current.getReg2()) + " " + convertRegString(current.getReg3())
						+ "\n");
				break;
			case "ADDR":
				break;
			case "CMPI":
				break;
			case "CMPR":
				break;
			case "DECI":
				break;
			case "DIVI":
				break;
			case "DIVR":
				break;
			case "EMPTYLINE":
				break;
			case "ENDOFPROGRAM":
				break;
			case "GEI":
				output.append("cmpi " + current.getReg1() + " " + convertRegString(current.getReg2()) + "\n");
				output.append("jge " + current.getReg3() + "\n");
				break;
			case "INCI":
				break;
			case "JEQ":
				break;
			case "JGE":
				break;
			case "JGT":
				break;
			case "JLE":
				break;
			case "JLT":
				break;
			case "JUMP":
				output.append("jmp " + current.getReg1() + "\n");
				break;
			case "JNE":
				break;
			case "JSR":
				break;
			case "LABEL":
				output.append("label " + current.getReg1() + "\n");
				break;
			case "LINK":
				break;
			case "MOVE":
				break;
			case "MULI":
				break;
			case "MULR":
				break;
			case "POP":
				break;
			case "PUSH":
				break;
			case "RET":
				output.append("sys halt");
				break;
			case "STOREI":
				output.append("move " + convertRegString(current.getReg1()) + " " + convertRegString(current.getReg2())
						+ "\n");
				break;
			case "SUBI":
				output.append("move " + convertRegString(current.getReg1()) + " " + convertRegString(current.getReg3())
						+ "\n");
				output.append("subi " + convertRegString(current.getReg2()) + " " + convertRegString(current.getReg3())
						+ "\n");
				break;
			case "SUBR":
				break;
			case "SYS":
				break;
			case "UNKNOWN":
				break;
			case "UNLNK":
				break;
			case "VAR":
				break;
			case "WRITEI":
				output.append("sys writei " + current.getReg1() + "\n");
				// ;WRITEI num
				// sys writei num
				break;
			}
		}
		System.out.println(output);
	}

	/*
	 * takes an input and if it matches on /\$T[0-9]+/g then it is converted to the
	 * form as shown in the test outputs
	 */
	private String convertRegString(String input) {
		if (input.matches("\\$T[0-9]+")) {
			try {
				int temp = Integer.parseInt(input.substring(2, 3)) ;
				return "r" + (temp - 1);
			} catch (Exception e) {
				return "FAILED TO PARSE INT FROM: " + input + "\n";
			}
		} else {
			return input;
		}
	}
}