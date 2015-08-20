package p3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class ArrayTable {
	
	ArrayList<Scope> scopes;
	ArrayList<Scope> allscopes;
	int pointer;
	int counter;
	int scopelevel;
	
	public enum ScopeType {
		GLOBAL, LOCAL;
	}
	
	public ArrayTable() {
		scopes = new ArrayList<>();
		allscopes = new ArrayList<>();
		pointer = -1;
		scopelevel = 1;
		counter = 1;
	}
	
/*	public String searchTempName(String s) {
		for (int i = pointer; i >= 0; i--) {
			if (scopes.get(i).lookup(s) != null) {
				return scopes.get(i).lookup(s).getTempName();
			}
		}
		return null;
	}*/
	
	public int searchSize1(String s) {
		for (int i = pointer; i >= 0; i--) {
			if (scopes.get(i).lookup(s) != null) {
				return scopes.get(i).lookup(s).getSize1();
			}
		}
		return -1;
	}
	
	public int searchSize2(String s) {
		for (int i = pointer; i >= 0; i--) {
			if (scopes.get(i).lookup(s) != null) {
				return scopes.get(i).lookup(s).getSize2();
			}
		}
		return -1;
	}
	
	public boolean searchIsFloat(String s) {
		for (int i = pointer; i >= 0; i--) {
			if (scopes.get(i).lookup(s) != null) {
				return scopes.get(i).lookup(s).getFloat();
			}
		}
		return false;
	}
	
	/*public String lookupCurrentScope(String s) {
		return getCurrentScope().lookup(s).getTempName();
	}*/
	
	public Scope getScope(int i) {
		for (Scope s : allscopes) {
			if (s.getId() == i) {
				return s;
			}
		}
		return null;
	}
	
	/*public String searchScope(Scope s, String a) {
		while (s != null) {
			if (s.lookup(a) == null) {
				s = s.getEnclosingScope();
			} else {
				return s.lookup(a).getTempName();
			}
		}
		return null;
	}*/
	
	public void insert(String s, int size1, int size2, boolean isFloat) {
		ArrayItem it = new ArrayItem(s, size1, size2, isFloat);
		scopes.get(pointer).insert(s, it);
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
	
	public Scope getCurrentScope() {
		return scopes.get(pointer);
	}
	
	/*public String toString() {
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
			for (String st : s.getMap().keySet()) {
				if (s.getMap().get(st).getTypeName() != "definedtype" || s.getMap().get(st).getIsVar()) {
					r += "Symbol Name: " + st + "; " + s.getMap().get(st) + "\n";
				} else {
					r += s.getMap().get(st) + "\n";
				}
			}
		}
		return r;
	}*/
	
	private class Scope {
		
		private Map<String, ArrayItem> st;
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
		
		public Map<String, ArrayItem> getMap() {
			return st;
		}
		
		public ArrayItem lookup(String s) {
			return st.get(s);
		}
		
		public void insert(String s, ArrayItem y) {
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