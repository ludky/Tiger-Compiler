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
			ins = ins.replaceAll("\\s+","");
			String[] insA = ins.split("\\s*,\\s*");
			if(insA[0].equals("add") || insA[0].equals("sub")
			|| insA[0].equals("mult") || insA[0].equals("div")
			|| insA[0].equals("and") || insA[0].equals("or")) {
				instr.add(new Binary(insA[0], new Temp(insA[1]), new Temp(insA[2]), new Temp(insA[3])));
			}
		}
		instruction = instr;
		return instr;
	}
	public ArrayList<Instruction> getInstructionList() {
		return instruction;
	}

}
