import java.util.*;
import java.nio.file.*;
import java.nio.*;
import java.nio.charset.Charset;
public class CFGTest {
    public static void main(String[] args) {

	//content = new Scanner(new File("ifElseIR"));
	//Path path = FileSystems.getDefault().getPath("text", "test.text");
	try {
	List<String> content = Files.readAllLines(Paths.get("/home/lu/Desktop/CFG/test.text"), Charset.defaultCharset());


	
	ArrayList<String> test = new ArrayList<String>(content);

	CFG cfg = new CFG(test);

	cfg.generateBasicBlock();
	cfg.generateCFG();

	List<BasicBlock> blist =  cfg.getBlockList();

	for(BasicBlock b: blist) {

		System.out.println("basic block: " + b.getBlockId());
		System.out.println("prev idx:  " + b.getPrev());
		System.out.print("next: ");
		if(b.getNext() != null) {
			//System.out.print("next: ");
			for(int n : b.getNext()) {
				System.out.print(" " + n);
			}
				System.out.println();
		} else {
			System.out.print("null");
		}


		//System.out.println("basic block: " + b.getBlockId());
		List<String> block = b.getBlockList();
		for(String s: block) {
			System.out.println(s);
		}

		System.out.println();

		System.out.println();

	}

	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
    }


}
