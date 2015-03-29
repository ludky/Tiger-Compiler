import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class SymbolTable {
	
	ArrayList<Scope> scopes;
	ArrayList<Scope> allscopes;
	int pointer;
	int counter;
	int scopelevel;
	
	public enum ScopeType {
		GLOBAL, LOCAL;
	}
	
	public SymbolTable() {
		scopes = new ArrayList<>();
		allscopes = new ArrayList<>();
		pointer = -1;
		scopelevel = 1;
		counter = 1;
	}
	
	public Type lookup(String s) {
		for (int i = pointer; i >= 0; i--) {
			if (scopes.get(i).lookup(s) != null) {
				return scopes.get(i).lookup(s);
			}
		}
		return null;
	}
	
	public void insert(String s, Type y) {
		scopes.get(pointer).insert(s, y);
	}
	
	public void initializeScope() {
		if (pointer == -1) {
			scopes.add(new Scope(null, scopelevel, counter, ScopeType.GLOBAL));
		} else {
			scopes.add(new Scope(scopes.get(pointer), scopelevel, counter,
						ScopeType.LOCAL));
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
			r += "Scope: " + s.getId() + "; Scope Type: " + s.getScopeType().toString()
				 + "; Level: " + s.getLevel() + "; Enclosing" + " Scope: ";
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
		
		private Map<String, Type> st;
		private ScopeType type;
		private Scope enclosingScope;
		private int level;
		private int id;
		
		public Scope(Scope es, int level, int id, ScopeType type) {
			st = new LinkedHashMap<>();
			enclosingScope = es;
			this.level = level;
			this.id = id;
			this.type = type;
		}
		
		public Type lookup(String s) {
			return st.get(s);
		}
		
		public void insert(String s, Type y) {
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
		
		public ScopeType getScopeType() {
			return type;
		}
	}
}