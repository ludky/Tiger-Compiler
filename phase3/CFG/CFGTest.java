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

	List<BasicBlock> blist =  cfg.getBlockList();

	for(BasicBlock b: blist) {
		System.out.println("basic block: " + b.getBlockId());
		List<String> block = b.getBlockList();
		for(String s: block) {
			System.out.println(s);
		}
	}
	List<String> llist = cfg.getLeader();
/*
	for(String s: llist) {
		System.out.println(s);
	}*/
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
    }


}
