import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TigerLexer a = new TigerLexer(new ANTLRFileStream("src/main.tig"));
			TokenStream tokens = new CommonTokenStream(a);
			TigerParser parser = new TigerParser(tokens);
			parser.program();
			System.out.println("successful parse");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}