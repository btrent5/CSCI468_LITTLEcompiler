import java.util.ArrayList;

public class TestDriver {
	public static void main(String[] args) {
		// building from sample IR
		TinyGenerator testGen = new TinyGenerator(test_while());
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

}