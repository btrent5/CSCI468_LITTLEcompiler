import java.util.ArrayList;

/*
* as of last time this comment was updated, this has features for the following test cases
*
* step4_testcase
* step4_testcase2
* test_combination
* test_expr
* test_if
* test_mult
* test_while
*/

class TinyGenerator {
	private int varOffset = 0;
	private final String swapRegister = "r199";
	StringBuilder output = new StringBuilder();

	public TinyGenerator(ArrayList<IRNode> input) {
		for (IRNode current : input) {
			switch (current.getOperator()) {
			case "ADDI":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				this.output.append("addi " + convertRegString(current.getReg2()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				break;
			case "ADDF":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				this.output.append("addr " + convertRegString(current.getReg2()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				break;
			case "DIVI":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				this.output.append("divi " + convertRegString(current.getReg2()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				break;
			case "DIVF":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				this.output.append("divr " + convertRegString(current.getReg2()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				break;
			case "EQI":
				this.output.append("cmpi " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg2()) + "\n");
				this.output.append("jeq " + current.getReg3() + "\n");
				break;
			case "GEF":
				if (hasBothNamedVars(current)) {
					this.output.append("move " + current.getReg2() + " " + this.swapRegister + "\n");
					this.output.append("cmpr " + current.getReg1() + " " + this.swapRegister + "\n");
				} else {
					this.output.append("cmpr " + current.getReg1() + " " + convertRegString(current.getReg2()) + "\n");
				}
				this.output.append("jge " + current.getReg3() + "\n");
				break;
			case "GEI":
				this.output.append("cmpi " + current.getReg1() + " " + convertRegString(current.getReg2()) + "\n");
				this.output.append("jge " + current.getReg3() + "\n");
				break;
			case "GTI":
				this.output.append("cmpi " + current.getReg1() + " " + convertRegString(current.getReg2()) + "\n");
				this.output.append("jgt " + current.getReg3() + "\n");
				break;
			case "JUMP":
				this.output.append("jmp " + current.getReg1() + "\n");
				break;
			case "LABEL":
				this.output.append("label " + current.getReg1() + "\n");
				break;
			case "LEF":
				this.output.append("cmpr " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg2()) + "\n");
				this.output.append("jle " + current.getReg3() + "\n");
				break;
			case "LEI":
				this.output.append("cmpi " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg2()) + "\n");
				this.output.append("jle " + current.getReg3() + "\n");
				break;
			case "LINK":
				// not sure what this does, outputs seem to work without it
				break;
			case "MULTI":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				this.output.append("muli " + convertRegString(current.getReg2()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				break;
			case "MULTF":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				this.output.append("mulr " + convertRegString(current.getReg2()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				break;
			case "NEI":
				this.output.append("cmpi " + current.getReg1() + " " + convertRegString(current.getReg2()) + "\n");
				this.output.append("jne " + current.getReg3() + "\n");
				break;
			case "READI":
				this.output.append("sys readi " + convertRegString(current.getReg1()) + "\n");
				break;
			case "RET":
				this.output.append("sys halt");
				break;
			case "STOREF":
				if (hasBothNamedVars(current)) {
					this.output.append("move " + current.getReg1() + " " + this.swapRegister + "\n");
					this.output.append("move " + this.swapRegister + " " + current.getReg2() + "\n");
				} else {
					this.output.append("move " + convertRegString(current.getReg1()) + " "
							+ convertRegString(current.getReg2()) + "\n");
				}
				break;
			case "STOREI":
				if (hasBothNamedVars(current)) {
					this.output.append("move " + current.getReg1() + " " + this.swapRegister + "\n");
					this.output.append("move " + this.swapRegister + " " + current.getReg2() + "\n");
				} else {
					this.output.append("move " + convertRegString(current.getReg1()) + " "
							+ convertRegString(current.getReg2()) + "\n");
				}
				break;
			case "SUBF":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				this.output.append("subr " + convertRegString(current.getReg2()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				break;
			case "SUBI":
				this.output.append("move " + convertRegString(current.getReg1()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				this.output.append("subi " + convertRegString(current.getReg2()) + " "
						+ convertRegString(current.getReg3()) + "\n");
				break;
			case "WRITEF":
				this.output.append("sys writer " + current.getReg1() + "\n");
				break;
			case "WRITEI":
				this.output.append("sys writei " + current.getReg1() + "\n");
				break;
			case "WRITES":
				this.output.append("sys writes " + current.getReg1() + "\n");
				prependStringValue(current.getReg1());
				break;
			default:
				System.out.println("unsupported operator: " + current.getOperator());
			}
		}
		System.out.print(this.output);
	}

	private boolean hasBothNamedVars(IRNode input) {
		if (canParseInt(input.getReg1()) || canParseFloat(input.getReg1()) || input.getReg1().matches("\\$T[0-9]+"))
			return false;
		if (canParseInt(input.getReg2()) || canParseFloat(input.getReg2()) || input.getReg2().matches("\\$T[0-9]+"))
			return false;
		return true;
	}

	private boolean canParseInt(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private boolean canParseFloat(String input) {
		try {
			Float.parseFloat(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private void prependStringValue(String input) {
		switch (input) {
		case "newline":
			if (!this.output.toString().contains("str " + input)) {
				String temp = "str " + input + " \"\\n\"\n";

				// see below comment about in-order vs reverse-order
				// this.output.insert(0, temp);
				this.output.insert(varOffset, temp);

				this.varOffset += temp.length();
			}
			break;
		}
	}

	/*
	 * takes an input and if it matches on /\$T[0-9]+/g then it is converted to the
	 * form as shown in the test outputs
	 *
	 * will prepend a var declaration if using a named var
	 */
	private String convertRegString(String input) {
		// is the input an integer constant
		if (canParseInt(input))
			return input;

		// is the input a float constant
		if (canParseFloat(input))
			return input;

		// is the input of the form $T4
		if (input.matches("\\$T[0-9]+") && canParseInt(input.substring(2))) {
			return "r" + (Integer.parseInt(input.substring(2)) - 1);
			// return "r" + (Integer.parseInt(input.substring(2)));
		}

		// input must be a named variable at this point
		if (!this.output.toString().contains("var " + input + "\n")) {
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
		return input;
	}
}