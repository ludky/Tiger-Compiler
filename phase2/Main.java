import org.antlr.runtime.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			throw new IllegalArgumentException();
		} else if (args.length == 1) {
			try {
				String inputFile = args[0];
				TigerLexer a = new TigerLexer(new ANTLRFileStream(inputFile));
				TokenStream tokens = new CommonTokenStream(a);
				TigerParser parser = new TigerParser(tokens);
				parser.program();
				if (parser.hasError == 0) {
					System.out.println("successful parse.");
				}
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
