package p3;
import java.util.*;

public class StringToInstruction {

	private List<String> string;

	private ArrayList<Instruction> instruction;

	public StringToInstruction(ArrayList<String> string) {
		this.string = string;
		instruction = new ArrayList<Instruction>();
		convert(string);
	}

	public List<Instruction> convert(ArrayList<String> string) {
		ArrayList<Instruction> instr = new ArrayList<Instruction>();
		for(String ins: string) {
			System.out.println("converting:  ");
			ins = ins.replaceAll("\\s+","");
			String[] insA = ins.split("\\s*,\\s*");

			if(insA[0].equals("add") || insA[0].equals("sub")
			|| insA[0].equals("mult") || insA[0].equals("div")
			|| insA[0].equals("and") || insA[0].equals("or")) {
				instr.add(new Binary(insA[0], new Temp(insA[1]), new Temp(insA[2]), new Temp(insA[3])));

			} else if(insA[0].equals("assign")) {
				instr.add(new Assignment(new Temp(insA[1]), new Temp(insA[2]) )  );
			} else if(insA[0].equals("brneq") || insA[0].equals("breq")
					||insA[0].equals("brlt") || insA[0].equals("brgt")
					||insA[0].equals("brgeq") || insA[0].equals("brleq")) {
				instr.add(new Branch(insA[0], new Temp(insA[1]), new Temp(insA[2]), new Label(insA[3]) ));
			} else if(insA[0].equals("return")) {
				instr.add(new Return(new Temp(insA[1])));
			} else if(insA[0].equals("goto")) {
				instr.add(new Goto(new Label(insA[1])));
			} else {
				instr.add(new InsLabel(new Label(insA[0].substring(0,insA[0].length()-1))));
			}
		}
		instruction = instr;
		return instr;
	}
	public ArrayList<Instruction> getInstructionList() {
		return instruction;
	}

}
