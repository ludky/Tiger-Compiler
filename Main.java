import org.antlr.runtime.*;

public class Main {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			throw new IllegalArgumentException();
		} else if (args.length == 1) {
			try {
				String inputFile = args[0];
				TigerLexer a = new TigerLexer(new ANTLRFileStream(inputFile));
				TokenStream tokens = new CommonTokenStream(a);
				TigerParser parser = new TigerParser(tokens);
				parser.program();
				System.out.println("Successfully parsed.");
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
				parser.printTokenType();
				System.out.println("Successfully parsed.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
