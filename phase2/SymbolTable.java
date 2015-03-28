import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class SymbolTable {
	
	ArrayList<Scope> scopes;
	ArrayList<Scope> allscopes;
	int pointer;
	int counter;
	int scopelevel;
	
	public SymbolTable() {
		scopes = new ArrayList<>();
		allscopes = new ArrayList<>();
		pointer = -1;
		scopelevel = 1;
		counter = 1;
	}
	
	public Symbol lookup(String s) {
		for (int i = pointer; i >= 0; i--) {
			if (scopes.get(i).lookup(s) != null) {
				return scopes.get(i).lookup(s);
			}
		}
		return null;
	}
	
	public void insert(String s, Symbol y) {
		scopes.get(pointer).insert(s, y);
	}
	
	public void initializeScope() {
		if (pointer == -1) {
			scopes.add(new Scope(null, scopelevel, counter));
		} else {
			scopes.add(new Scope(scopes.get(pointer), scopelevel, counter));
		}
		pointer++;
		scopelevel++;
		counter++;
	}

	public void finalizeScope() {
		allscopes.add(scopes.get(pointer));
		scopes.remove(pointer);
		pointer--;
		scopelevel--;
	}
	
	public String toString() {
		String r = "";
		for (Scope s : allscopes) {
			r += "Scope: " + s.getId() + "; Level: " + s.getLevel() + "; Enclosing"
					+ " Scope: ";
			String es = "";
			if (s.getEnclosingScope() == null) {
				es += "null";
			} else {
				es += s.getEnclosingScope().getId();
			}
			r += es + "\n";
		}
		return r;
	}
	
	private class Scope {
		
		private Map<String, Symbol> st;
		private Scope enclosingScope;
		private int level;
		private int id;
		
		public Scope(Scope es, int level, int id) {
			st = new LinkedHashMap<>();
			enclosingScope = es;
			this.level = level;
			this.id = id;
		}
		
		public Symbol lookup(String s) {
			return st.get(s);
		}
		
		public void insert(String s, Symbol y) {
			st.put(s, y);
		}
		
		public Scope getEnclosingScope() {
			return enclosingScope;
		}
		
		public int getLevel() {
			return level;
		}
		
		public int getId() {
			return id;
		}
	}
}
