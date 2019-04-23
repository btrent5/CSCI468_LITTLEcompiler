import java.util.ArrayList;

public class TestDriver {
	public static void main(String[] args) {
		ArrayList<IRNode> test = new ArrayList<IRNode>();

		// building from sample IR
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

		TinyGenerator testGen = new TinyGenerator(test);
	}

}