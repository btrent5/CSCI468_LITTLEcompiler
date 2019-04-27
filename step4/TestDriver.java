import java.util.ArrayList;

public class TestDriver {
	public static void main(String[] args) {
		// building from sample IR
		TinyGenerator testGen = new TinyGenerator(test_while());
	}

	static private ArrayList<IRNode> step4_testcase() {
		ArrayList<IRNode> test = new ArrayList<IRNode>();

		test.add(new IRNode("LABEL", "main"));
		test.add(new IRNode("LINK"));
		test.add(new IRNode("STOREI", "0", "$T1"));
		test.add(new IRNode("STOREI", "$T1", "i"));
		test.add(new IRNode("STOREI", "0", "$T2"));
		test.add(new IRNode("STOREI", "$T2", "a"));
		test.add(new IRNode("STOREI", "0", "$T3"));
		test.add(new IRNode("STOREI", "$T3", "b"));
		test.add(new IRNode("LABEL", "label1"));
		test.add(new IRNode("STOREI", "10", "$T4"));
		test.add(new IRNode("EQI", "i", "$T4", "label2"));
		test.add(new IRNode("READI", "p"));
		test.add(new IRNode("STOREI", "10", "$T5"));
		test.add(new IRNode("LEI", "p", "$T5", "label3"));
		test.add(new IRNode("STOREI", "1", "$T6"));
		test.add(new IRNode("ADDI", "a", "$T6", "$T7"));
		test.add(new IRNode("STOREI", "$T7", "a"));
		test.add(new IRNode("JUMP", "label4"));
		test.add(new IRNode("LABEL", "label3"));
		test.add(new IRNode("STOREI", "1", "$T8"));
		test.add(new IRNode("ADDI", "b", "$T8", "$T9"));
		test.add(new IRNode("STOREI", "$T9", "b"));
		test.add(new IRNode("LABEL", "label4"));
		test.add(new IRNode("STOREI", "1", "$T10"));
		test.add(new IRNode("ADDI", "i", "$T10", "$T11"));
		test.add(new IRNode("STOREI", "$T11", "i"));
		test.add(new IRNode("JUMP", "label1"));
		test.add(new IRNode("LABEL", "label2"));
		test.add(new IRNode("WRITEI", "a"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("WRITEI", "b"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("RET"));
		return test;
	}

	static private ArrayList<IRNode> step4_testcase2() {
		ArrayList<IRNode> test = new ArrayList<IRNode>();

		test.add(new IRNode("LABEL", "main"));
		test.add(new IRNode("LINK"));
		test.add(new IRNode("STOREI", "1", "$T1"));
		test.add(new IRNode("STOREI", "$T1", "a"));
		test.add(new IRNode("STOREI", "1", "$T2"));
		test.add(new IRNode("STOREI", "$T2", "b"));
		test.add(new IRNode("LABEL", "label1"));
		test.add(new IRNode("STOREI", "80", "$T3"));
		test.add(new IRNode("GTI", "a", "$T3", "label2"));
		test.add(new IRNode("STOREI", "1", "$T4"));
		test.add(new IRNode("NEI", "b", "$T4", "label3"));
		test.add(new IRNode("STOREI", "1", "$T5"));
		test.add(new IRNode("MULTI", "$T5", "a", "$T6"));
		test.add(new IRNode("STOREI", "$T6", "g"));
		test.add(new IRNode("WRITEI", "g"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("LABEL", "label3"));
		test.add(new IRNode("STOREI", "2", "$T7"));
		test.add(new IRNode("NEI", "b", "$T7", "label4"));
		test.add(new IRNode("STOREI", "2", "$T8"));
		test.add(new IRNode("MULTI", "$T8", "a", "$T9"));
		test.add(new IRNode("STOREI", "$T9", "p"));
		test.add(new IRNode("WRITEI", "p"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("LABEL", "label4"));
		test.add(new IRNode("STOREI", "3", "$T10"));
		test.add(new IRNode("NEI", "b", "$T10", "label5"));
		test.add(new IRNode("STOREI", "3", "$T11"));
		test.add(new IRNode("MULTI", "$T11", "a", "$T12"));
		test.add(new IRNode("STOREI", "$T12", "k"));
		test.add(new IRNode("WRITEI", "k"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("JUMP", "label6"));
		test.add(new IRNode("LABEL", "label5"));
		test.add(new IRNode("STOREI", "4", "$T13"));
		test.add(new IRNode("MULTI", "$T13", "a", "$T14"));
		test.add(new IRNode("STOREI", "$T14", "u"));
		test.add(new IRNode("WRITEI", "u"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("LABEL", "label6"));
		test.add(new IRNode("STOREI", "1", "$T15"));
		test.add(new IRNode("ADDI", "b", "$T15", "$T16"));
		test.add(new IRNode("STOREI", "$T16", "b"));
		test.add(new IRNode("STOREI", "20", "$T17"));
		test.add(new IRNode("ADDI", "a", "$T17", "$T18"));
		test.add(new IRNode("STOREI", "$T18", "a"));
		test.add(new IRNode("JUMP", "label1"));
		test.add(new IRNode("LABEL", "label2"));
		test.add(new IRNode("RET"));

		return test;
	}

	static private ArrayList<IRNode> test_adv() {
		ArrayList<IRNode> test = new ArrayList<IRNode>();

		test.add(new IRNode("LABEL", "main"));
		test.add(new IRNode("LINK"));
		test.add(new IRNode("STOREF", "0.0001", "$T1"));
		test.add(new IRNode("STOREF", "$T1", "tolerance"));
		test.add(new IRNode("STOREF", "7.0", "$T2"));
		test.add(new IRNode("STOREF", "$T2", "num"));
		test.add(new IRNode("STOREF", "num", "approx"));
		test.add(new IRNode("STOREI", "0", "$T3"));
		test.add(new IRNode("STOREI", "$T3", "count"));
		test.add(new IRNode("STOREF", "0.0", "$T4"));
		test.add(new IRNode("STOREF", "$T4", "diff"));
		test.add(new IRNode("STOREI", "0", "$T5"));
		test.add(new IRNode("STOREI", "$T5", "enough"));
		test.add(new IRNode("LABEL", "label1"));
		test.add(new IRNode("STOREI", "1", "$T6"));
		test.add(new IRNode("EQI", "enough", "$T6", "label2"));
		test.add(new IRNode("STOREI", "1", "$T7"));
		test.add(new IRNode("ADDI", "count", "$T7", "$T8"));
		test.add(new IRNode("STOREI", "$T8", "count"));
		test.add(new IRNode("STOREF", "0.5", "$T9"));
		test.add(new IRNode("DIVF", "num", "approx", "$T10"));
		test.add(new IRNode("ADDF", "approx", "$T10", "$T11"));
		test.add(new IRNode("MULTF", "$T9", "$T11", "$T12"));
		test.add(new IRNode("STOREF", "$T12", "newapprox"));
		test.add(new IRNode("SUBF", "approx", "newapprox", "$T13"));
		test.add(new IRNode("STOREF", "$T13", "diff"));
		test.add(new IRNode("STOREF", "0.0", "$T14"));
		test.add(new IRNode("LEF", "diff", "$T14", "label3"));
		test.add(new IRNode("GEF", "diff", "tolerance", "label4"));
		test.add(new IRNode("STOREI", "1", "$T15"));
		test.add(new IRNode("STOREI", "$T15", "enough"));
		test.add(new IRNode("LABEL", "label4"));
		test.add(new IRNode("JUMP", "label5"));
		test.add(new IRNode("LABEL", "label3"));
		test.add(new IRNode("STOREF", "0.0", "$T16"));
		test.add(new IRNode("SUBF", "$T16", "tolerance", "$T17"));
		test.add(new IRNode("LEF", "diff", "$T17", "label6"));
		test.add(new IRNode("STOREI", "1", "$T18"));
		test.add(new IRNode("STOREI", "$T18", "enough"));
		test.add(new IRNode("LABEL", "label6"));
		test.add(new IRNode("LABEL", "label5"));
		test.add(new IRNode("STOREF", "newapprox", "approx"));
		test.add(new IRNode("JUMP", "label1"));
		test.add(new IRNode("LABEL", "label2"));
		test.add(new IRNode("WRITEF", "approx"));
		test.add(new IRNode("WRITEI", "count"));
		test.add(new IRNode("RET"));

		return test;
	}

	static private ArrayList<IRNode> test_combination() {
		ArrayList<IRNode> test = new ArrayList<IRNode>();

		test.add(new IRNode("LABEL", "main"));
		test.add(new IRNode("LINK"));
		test.add(new IRNode("STOREI", "20", "$T1"));
		test.add(new IRNode("STOREI", "$T1", "a"));
		test.add(new IRNode("STOREI", "30", "$T2"));
		test.add(new IRNode("STOREI", "$T2", "b"));
		test.add(new IRNode("STOREI", "40", "$T3"));
		test.add(new IRNode("STOREI", "$T3", "c"));
		test.add(new IRNode("MULTI", "a", "b", "$T4"));
		test.add(new IRNode("MULTI", "a", "b", "$T5"));
		test.add(new IRNode("ADDI", "$T5", "c", "$T6"));
		test.add(new IRNode("DIVI", "$T6", "a", "$T7"));
		test.add(new IRNode("STOREI", "20", "$T8"));
		test.add(new IRNode("ADDI", "c", "$T4", "$T9"));
		test.add(new IRNode("ADDI", "$T9", "$T7", "$T10"));
		test.add(new IRNode("ADDI", "$T10", "$T8", "$T11"));
		test.add(new IRNode("STOREI", "$T11", "c"));
		test.add(new IRNode("MULTI", "b", "b", "$T12"));
		test.add(new IRNode("ADDI", "$T12", "a", "$T13"));
		test.add(new IRNode("STOREI", "$T13", "b"));
		test.add(new IRNode("MULTI", "b", "a", "$T14"));
		test.add(new IRNode("DIVI", "$T14", "a", "$T15"));
		test.add(new IRNode("STOREI", "$T15", "a"));
		test.add(new IRNode("WRITEI", "c"));
		test.add(new IRNode("WRITEI", "b"));
		test.add(new IRNode("WRITEI", "a"));
		test.add(new IRNode("RET"));
		return test;
	}

	static private ArrayList<IRNode> test_expr() {
		ArrayList<IRNode> test = new ArrayList<IRNode>();

		test.add(new IRNode("LABEL", "main"));
		test.add(new IRNode("LINK"));
		test.add(new IRNode("STOREI", "1", "$T1"));
		test.add(new IRNode("STOREI", "$T1", "a"));
		test.add(new IRNode("STOREI", "2", "$T2"));
		test.add(new IRNode("STOREI", "$T2", "b"));
		test.add(new IRNode("STOREI", "10", "$T3"));
		test.add(new IRNode("STOREI", "$T3", "c"));
		test.add(new IRNode("STOREI", "20", "$T4"));
		test.add(new IRNode("STOREI", "$T4", "d"));
		test.add(new IRNode("WRITEI", "a"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("WRITEI", "b"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("WRITEI", "c"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("WRITEI", "d"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("ADDI", "a", "b", "$T5"));
		test.add(new IRNode("STOREI", "$T5", "a"));
		test.add(new IRNode("WRITEI", "a"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("MULTI", "a", "c", "$T6"));
		test.add(new IRNode("STOREI", "$T6", "b"));
		test.add(new IRNode("WRITEI", "b"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("STOREI", "0", "$T7"));
		test.add(new IRNode("SUBI", "$T7", "a", "$T8"));
		test.add(new IRNode("ADDI", "$T8", "b", "$T9"));
		test.add(new IRNode("STOREI", "$T9", "c"));
		test.add(new IRNode("WRITEI", "c"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("STOREI", "0", "$T10"));
		test.add(new IRNode("SUBI", "$T10", "d", "$T11"));
		test.add(new IRNode("STOREI", "$T11", "d"));
		test.add(new IRNode("WRITEI", "d"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("ADDI", "a", "b", "$T12"));
		test.add(new IRNode("ADDI", "d", "c", "$T13"));
		test.add(new IRNode("MULTI", "$T12", "$T13", "$T14"));
		test.add(new IRNode("ADDI", "a", "b", "$T15"));
		test.add(new IRNode("ADDI", "$T15", "c", "$T16"));
		test.add(new IRNode("ADDI", "$T16", "d", "$T17"));
		test.add(new IRNode("DIVI", "$T17", "a", "$T18"));
		test.add(new IRNode("SUBI", "$T14", "$T18", "$T19"));
		test.add(new IRNode("STOREI", "$T19", "a"));
		test.add(new IRNode("WRITEI", "a"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("STOREI", "10", "$T20"));
		test.add(new IRNode("ADDI", "a", "$T20", "$T21"));
		test.add(new IRNode("STOREI", "$T21", "a"));
		test.add(new IRNode("WRITEI", "a"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("STOREI", "10", "$T22"));
		test.add(new IRNode("ADDI", "b", "a", "$T23"));
		test.add(new IRNode("ADDI", "$T23", "$T22", "$T24"));
		test.add(new IRNode("STOREI", "$T24", "b"));
		test.add(new IRNode("WRITEI", "b"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("STOREI", "0", "$T25"));
		test.add(new IRNode("STOREI", "10", "$T26"));
		test.add(new IRNode("SUBI", "$T25", "$T26", "$T27"));
		test.add(new IRNode("STOREI", "$T27", "c"));
		test.add(new IRNode("WRITEI", "c"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("STOREF", "1.0", "$T28"));
		test.add(new IRNode("STOREF", "$T28", "x"));
		test.add(new IRNode("STOREF", "2.0", "$T29"));
		test.add(new IRNode("STOREF", "$T29", "y"));
		test.add(new IRNode("STOREF", "3.14159", "$T30"));
		test.add(new IRNode("STOREF", "$T30", "z"));
		test.add(new IRNode("WRITEF", "x"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("WRITEF", "z"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("WRITEF", "y"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("STOREF", "2.0", "$T31"));
		test.add(new IRNode("DIVF", "z", "$T31", "$T32"));
		test.add(new IRNode("STOREF", "$T32", "x"));
		test.add(new IRNode("DIVF", "z", "y", "$T33"));
		test.add(new IRNode("STOREF", "$T33", "y"));
		test.add(new IRNode("WRITEF", "x"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("WRITEF", "y"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("ADDF", "x", "y", "$T34"));
		test.add(new IRNode("ADDF", "$T34", "z", "$T35"));
		test.add(new IRNode("DIVF", "$T35", "z", "$T36"));
		test.add(new IRNode("STOREF", "$T36", "t"));
		test.add(new IRNode("WRITEF", "t"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("MULTF", "t", "t", "$T37"));
		test.add(new IRNode("STOREF", "$T37", "t"));
		test.add(new IRNode("WRITEF", "t"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("STOREF", "2.0", "$T38"));
		test.add(new IRNode("DIVF", "t", "$T38", "$T39"));
		test.add(new IRNode("STOREF", "4.0", "$T40"));
		test.add(new IRNode("DIVF", "z", "$T40", "$T41"));
		test.add(new IRNode("STOREF", "5.0", "$T42"));
		test.add(new IRNode("DIVF", "z", "$T42", "$T43"));
		test.add(new IRNode("STOREF", "6.0", "$T44"));
		test.add(new IRNode("DIVF", "z", "$T44", "$T45"));
		test.add(new IRNode("STOREF", "7.0", "$T46"));
		test.add(new IRNode("DIVF", "z", "$T46", "$T47"));
		test.add(new IRNode("ADDF", "t", "z", "$T48"));
		test.add(new IRNode("ADDF", "$T48", "t", "$T49"));
		test.add(new IRNode("ADDF", "$T49", "$T39", "$T50"));
		test.add(new IRNode("ADDF", "$T50", "$T41", "$T51"));
		test.add(new IRNode("ADDF", "$T51", "$T43", "$T52"));
		test.add(new IRNode("ADDF", "$T52", "$T45", "$T53"));
		test.add(new IRNode("ADDF", "$T53", "$T47", "$T54"));
		test.add(new IRNode("STOREF", "$T54", "t"));
		test.add(new IRNode("WRITEF", "t"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("RET"));

		return test;
	}

	static private ArrayList<IRNode> test_if() {
		ArrayList<IRNode> test = new ArrayList<IRNode>();

		test.add(new IRNode("LABEL", "main"));
		test.add(new IRNode("LABEL", "main"));
		test.add(new IRNode("LINK"));
		test.add(new IRNode("STOREI", "7", "$T1"));
		test.add(new IRNode("STOREI", "$T1", "num"));
		test.add(new IRNode("STOREI", "2", "$T2"));
		test.add(new IRNode("STOREI", "$T2", "i"));
		test.add(new IRNode("STOREI", "42", "$T3"));
		test.add(new IRNode("STOREI", "$T3", "a"));
		test.add(new IRNode("STOREI", "5", "$T4"));
		test.add(new IRNode("GEI", "i", "$T4", "label1"));
		test.add(new IRNode("ADDI", "num", "a", "$T5"));
		test.add(new IRNode("STOREI", "$T5", "num"));
		test.add(new IRNode("STOREI", "3", "$T6"));
		test.add(new IRNode("GEI", "i", "$T6", "label2"));
		test.add(new IRNode("ADDI", "num", "a", "$T7"));
		test.add(new IRNode("STOREI", "$T7", "num"));
		test.add(new IRNode("LABEL", "label2"));
		test.add(new IRNode("JUMP", "label3"));
		test.add(new IRNode("LABEL", "label1"));
		test.add(new IRNode("SUBI", "num", "a", "$T8"));
		test.add(new IRNode("STOREI", "$T8", "num"));
		test.add(new IRNode("LABEL", "label3"));
		test.add(new IRNode("WRITEI", "num"));
		test.add(new IRNode("RET"));

		return test;
	}

	static private ArrayList<IRNode> test_mult() {
		ArrayList<IRNode> test = new ArrayList<IRNode>();

		test.add(new IRNode("LABEL", "main"));
		test.add(new IRNode("LINK"));
		test.add(new IRNode("STOREI", "1", "$T1"));
		test.add(new IRNode("STOREI", "$T1", "a"));
		test.add(new IRNode("STOREI", "2", "$T2"));
		test.add(new IRNode("STOREI", "$T2", "b"));
		test.add(new IRNode("READI", "c"));
		test.add(new IRNode("READI", "d"));
		test.add(new IRNode("MULTI", "a", "c", "$T3"));
		test.add(new IRNode("MULTI", "b", "d", "$T4"));
		test.add(new IRNode("ADDI", "$T3", "$T4", "$T5"));
		test.add(new IRNode("STOREI", "$T5", "e"));
		test.add(new IRNode("WRITEI", "c"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("WRITEI", "d"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("WRITEI", "e"));
		test.add(new IRNode("WRITES", "newline"));
		test.add(new IRNode("RET"));

		return test;
	}

	static private ArrayList<IRNode> test_while() {
		ArrayList<IRNode> test = new ArrayList<IRNode>();

		test.add(new IRNode("LABEL", "main"));
		test.add(new IRNode("LINK"));
		test.add(new IRNode("STOREF", "7.0", "$T1"));
		test.add(new IRNode("STOREF", "$T1", "num"));
		test.add(new IRNode("STOREI", "100", "$T2"));
		test.add(new IRNode("STOREI", "$T2", "i"));
		test.add(new IRNode("STOREI", "1", "$T3"));
		test.add(new IRNode("STOREI", "$T3", "j"));
		test.add(new IRNode("STOREF", "num", "approx"));
		test.add(new IRNode("LABEL", "label1"));
		test.add(new IRNode("STOREI", "0", "$T4"));
		test.add(new IRNode("EQI", "i", "$T4", "label2"));
		test.add(new IRNode("STOREF", "0.5", "$T5"));
		test.add(new IRNode("DIVF", "num", "approx", "$T6"));
		test.add(new IRNode("ADDF", "approx", "$T6", "$T7"));
		test.add(new IRNode("MULTF", "$T5", "$T7", "$T8"));
		test.add(new IRNode("STOREF", "$T8", "newapprox"));
		test.add(new IRNode("STOREF", "newapprox", "approx"));
		test.add(new IRNode("STOREI", "1", "$T9"));
		test.add(new IRNode("SUBI", "i", "$T9", "$T10"));
		test.add(new IRNode("STOREI", "$T10", "i"));
		test.add(new IRNode("JUMP", "label1"));
		test.add(new IRNode("LABEL", "label2"));
		test.add(new IRNode("WRITEF", "approx"));
		test.add(new IRNode("RET"));

		return test;
	}

}