import org.antlr.runtime.*;

public class Main {
	
	public static void main(String[] args) {
		try {
			TigerLexer a = new TigerLexer(new ANTLRFileStream("src/test.tig"));
			TokenStream tokens = new CommonTokenStream(a);
			TigerParser parser = new TigerParser(tokens);
			parser.program();
			System.out.println("Successfully parsed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
