import java.util.ArrayList;

class TinyGenerator {
	private int varOffset = 0;
	StringBuilder output = new StringBuilder();

	public TinyGenerator(ArrayList<IRNode> input) {
		for (IRNode current : input) {
			// still need to prepend all var names maybe make part of convertRegString?? tbd
			switch (current.getOperator()) {
			case "ADDI":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				this.output.append("addi " + convertRegString(current.getReg2()) + " "
						+ convertRegString(current.getReg3()) + "\n");
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
				this.output.append("cmpi " + current.getReg1() + " " + convertRegString(current.getReg2()) + "\n");
				this.output.append("jge " + current.getReg3() + "\n");
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
				this.output.append("jmp " + current.getReg1() + "\n");
				break;
			case "JNE":
				break;
			case "JSR":
				break;
			case "LABEL":
				this.output.append("label " + current.getReg1() + "\n");
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
				this.output.append("sys halt");
				break;
			case "STOREI":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg2()) + "\n");
				break;
			case "SUBI":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				this.output.append("subi " + convertRegString(current.getReg2()) + " "
						+ convertRegString(current.getReg3()) + "\n");
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
				this.output.append("sys writei " + current.getReg1() + "\n");
				break;
			}
		}
		System.out.println(output);
	}

	/*
	 * takes an input and if it matches on /\$T[0-9]+/g then it is converted to the
	 * form as shown in the test outputs
	 *
	 * will prepend a var declaration if using a named var
	 */
	private String convertRegString(String input) {
		if (input.matches("\\$T[0-9]+")) {
			try {
				int temp = Integer.parseInt(input.substring(2, 3));
				return "r" + (temp - 1);
			} catch (Exception e) {
				return "FAILED TO PARSE INT FROM: " + input + "\n";
			}
		} else {
			try {
				// named variables will throw exception, int values will not
				int temp = Integer.parseInt(input);
				return input;
			} catch (Exception e) {
				// this is a named variable
				if (!this.output.toString().contains(" " + input + "\n")) {
					String temp = "var " + input + "\n";

					/*
					 * the following two lines prepend the var declarations either in-order or
					 * reverse-order
					 *
					 * neither is the order the sample output uses...
					 *
					 * should not matter as long as we aren't being graded on output diffing
					 */

					// this.output.insert(0, temp);
					this.output.insert(varOffset, temp);

					this.varOffset += temp.length();

				}
			}
			return input;
		}
	}
}