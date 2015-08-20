package p3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 1) {
			throw new IllegalArgumentException();
		} else if (args.length == 0) {
			try {
				String inputFile = "src/p3/testcase01.tig";
				TigerLexer a = new TigerLexer(new ANTLRFileStream(inputFile));
				TokenStream tokens = new CommonTokenStream(a);
				TigerParser parser = new TigerParser(tokens);
				parser.program();
				treeWalkerLexer b = new treeWalkerLexer(new ANTLRFileStream(inputFile));
				TokenStream tokensb = new CommonTokenStream(b);
				treeWalkerParser parserb = new treeWalkerParser(tokensb);
				parserb.setup();
				parserb.program();
				IRGenerator gen = parserb.getGen();
				gen.print();
				StringToInstruction sti = new StringToInstruction(gen.getBuffer());
			/*	for (int i : sti.hm.keySet()) {
					System.out.println(sti.hm.get(i).base);
				}*/
				List<Instruction> instr = sti.getOutput();
/*				for (Instruction i : instr) {
					System.out.println(i.toString());
				}*/
				CFG cfg = new CFG((ArrayList<Instruction>)instr);
				List<String> l = cfg.getList();
				try {
		    		PrintWriter writer = new PrintWriter("analysis.txt", "UTF-8");
		    		for (String s : l) {
						
					
		    			writer.println(s.toString());
		    		}
		    		writer.close();
		    	} catch (IOException e) {
		    		e.printStackTrace();
		    	}
				Translate trans = new Translate((ArrayList<Instruction>) instr);
				trans.naiveTranslateFile();
				trans.toFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (args.length == 2 && args[0].equals("-debug")) {
			try {
				String inputFile = args[1];
				TigerLexer a = new TigerLexer(new ANTLRFileStream(inputFile));
				TokenStream tokens = new CommonTokenStream(a);
				TigerParser parser = new TigerParser(tokens);
				parser.program();
				if (parser.hasError == 0) {
					System.out.println("successful parse.");
				}
				parser.printTokenType();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

}
