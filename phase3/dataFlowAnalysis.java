package p3;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dataFlowAnalysis {
	
    private Map<Variable, Integer> m;
    private int[][] tClosure;
    private Set<Variable> vars;
    private Variable[] vs;
    private List<BasicBlock> blocks;
    //	private String[] register;
    private final static int MAX_REG = 16;
    private ArrayList<String> toPrint;
    

    public dataFlowAnalysis(List<BasicBlock> blocks) {
	this.blocks = blocks;
	allBlocksLiveness(blocks);
	this.vars = new HashSet<Variable>();
	m = new HashMap<Variable, Integer>();
	this.vars = getVar();
	tClosure = new int[vars.size()][vars.size()];
	vs = new Variable[vars.size()];
	initializeMap();
	transitiveClosure();
	toPrint = new ArrayList<String>();


	generatingList();
	//	toPrint = blocks.getStringList();
    }

    public ArrayList<String> getArrayList() {
	return toPrint;
    }


    public Map<Variable, Integer> initializeMap(/*Set<Variable> vars*/) {
	int counter = 0;
	for(Variable v: vars) {
	    Integer num = new Integer(counter);
	    m.put(v, num);
	    vs[counter] = v;
	    //  System.out.print(v.name().toString() + "   " + (m.get(v)).intValue());
	    counter++;
	}
	return m;
    }

    public Set<Variable> getVar() {
	//int counter = 0;
	Set<Variable> temps = new HashSet<Variable>();
	for(BasicBlock bb: blocks) {
	    for(InsInOut ins: bb.getLivenessList()) {
		for(Variable v: ins.getIn()) {
		    if(!Pattern.matches( "[0-9]+\\.[0-9]+" , v.name().toString()))
			vars.add(v);
		}
	        for(Variable v: ins.getOut()) {
		    if(!Pattern.matches( "[0-9]+\\.[0-9]+" , v.name().toString()))
			temps.add(v);
		}
	    }
	}
	return temps;
    }

    public int[][] transitiveClosure() {
	for(BasicBlock bb: blocks) {
	    for(InsInOut ins: bb.getLivenessList()) {
		if(ins.getIn().size()>1) {
		    for(Variable v: ins.getIn()) {
			for(Variable t: ins.getIn()) {
			    tClosure[m.get(v)][m.get(t)] = 1;
			}
		    }
		    for(Variable v: ins.getOut()) {
			for(Variable t: ins.getOut()) {
			    tClosure[m.get(v)][m.get(t)] = 1;
			}
		    }
		}
		
	    }
	}
	return tClosure;
    } 



    

    public void generatingList() {
	printC();//toPrint.add("----------------------------printing");
       	printReg();

    }

    public void printC() {
	toPrint.add("----------------------------printing transitive closure--------------------------------");
        String s = "";
	
	for(int i = 0; i < tClosure.length; i++) {
	    s += ("       " + vs[i].name().toString() );
	}
	toPrint.add(s);
	s = "";
	for(int i = 0; i < tClosure.length; i++) {
	    s = "";
	    s += vs[i].name().toString();
	    for(int j = 0; j< tClosure.length;j++) {
		s += ("        " + tClosure[i][j]);
	    }
	    toPrint.add(s);
	    toPrint.add("");
	}

	toPrint.add("--------------------------end printing transitive closure----------------------------");
	
    }



    public void printClosure() {

	
	for(int i = 0; i < tClosure.length; i++) {
	    System.out.print("      " + vs[i].name().toString() );
	}
	System.out.println();
	for(int i = 0; i < tClosure.length; i++) {
	    System.out.print(vs[i].name().toString());
	    for(int j = 0; j< tClosure.length;j++) {
		System.out.print("   " + tClosure[i][j] +  "    ");
	    }
	    System.out.println();
	}
	
    }


    public void printAll(List<BasicBlock> block) {

	System.out.println();
	System.out.println("---------------use def set--------------------------------");
	for(BasicBlock b: blocks) {
		
	    for(InsInOut sio: b.getLivenessList()) {
		System.out.println(sio.instruction());
		sio.printUseDef();
	    }
	}


	System.out.println();
	System.out.println("---------------in out result--------------------------------");
	for(BasicBlock b: blocks) {
		
	    for(InsInOut sio: b.getLivenessList()) {
		System.out.println(sio.instruction());
		sio.printInOut();
	    }
	}
	System.out.println();
	System.out.println("-------------------------live analysis------------------");
	System.out.println();
	printClosure();


    }
 


    //	public void 





    /*

      private Map<Variable, Integer> m;
      private int[][] tClosure;
      private Set<Variable> vars;
      private Variable[] vs;
      private List<BasicBlock> blocks;
      private final static MAX_REG = 16;




    */
    public int[] graphColoring() {
	if(vars.size() <= MAX_REG ) {
	    allocateAll();
	    return null;
	}
	//	vars;
	int regNum = 0;
	int cost = 0;
	int[] v = new int[vs.length];
	Set<String> added = new HashSet<String>();
	for(int j=0;j<vs.length;j++) {
	    cost=0;
	    if(added.add(vs[j].name().toString())) {
		vs[j].setColor(regNum);
	    }
	    for(int i = 0; i<vs.length;i++) {
		if(tClosure[j][i]==1) {
		    cost+=1;
		}
		if(tClosure[j][i]==0 && added.add(vs[i].name().toString())) {
		    vs[i].setColor(regNum);
		}
	    }
	    v[j]=cost;
	    //   System.out.println(cost);
	    regNum++;
	}
	return v;
    }

    public void printReg() {
	int[] cost = graphColoring();


	String[] ss = new String[MAX_REG];
	/*
	for(String s: ss) {
	    s="";
	}
	*/
	//	List<v>[]
	String lsReg = "";
	for(Variable v: vs) {
	    //  System.out.println(v.name() + "   " + v.color());
	    int i = v.color();
	    if(i<0) {
		lsReg += v.name().toString();
	    } else {
		if(ss[i]==null){
		    ss[i] = v.name().toString();
		} else {
		    ss[i] += ("  " + v.name().toString());
		}
		//	System.out.println(ss[i]);
	    }
	}
	toPrint.add("--------------------------------------temp register allocation-------------------------");
	for(int i = 0; i< ss.length;i++) {
	    if(ss[i] != null) {
		toPrint.add(("$t" + i+ ":  " + ss[i]));
	    }
	}
	toPrint.add("not assigned variable (if existed):");
	toPrint.add(lsReg);


	toPrint.add("--------------optimized register allocation(keep the most used in one and reduce the load and store)--------------");
	




    }

    public void allocateAll() {
	System.out.println("Enough Register:");

	int colorNum = 0;
	for(Variable v: vars) {
	    v.setColor(colorNum);
	    colorNum++;
	}
    }






    public void insInFromOut(InsInOut ins) {

	
	Set<Variable> in = addToSet(removeFromSet(ins.getOut(), ins.getDef()) , ins.getUse());
	if(ins.replaceIn(in)) {
	    //isChanged = true;		
	}
    }


    private Set<Variable> addToSet(Set<Variable> set, Set<Temp> toAdd) {
	Set<Variable> nSet = new HashSet<Variable>();

	for(Variable v: set) {
	    nSet.add(v);
	}
	for(Temp t: toAdd) {
	    if (nSet.add(new Variable(t))) {
		
	    }
	}
	return nSet;
    }

    private Set<Variable> removeFromSet(Set<Variable> set, Set<Temp> toRemove) {
	//System.out.println("out[I] - def[I]");
		
	Set<Variable> nSet = new HashSet<Variable>();
	for(Variable v: set) {
	    if(!toRemove.contains(v.name())) {
		nSet.add(v);
	    }
	}
	return nSet;
    }

    private void printSet(Set<Variable> set) {
	System.out.print("   set: ");
	for(Variable v: set) {
	    System.out.print("  " + v.toString());
	}
	System.out.println();
    }

    //algorithms within block
    public void blockLiveness(ArrayList<InsInOut> instruction) {
	int n = instruction.size();
	Boolean isChanged = true;
	Set<Variable> prevIn = new HashSet<Variable>();
	while(isChanged) {
	    isChanged = false;
	    for(int i = n - 1; i >=0; i--) {
		InsInOut cur = instruction.get(i);
		if (i < n - 1) {
					
		    Set<Variable> oldOut = cur.getOut();
		    cur.replaceOut(prevIn);
					
		    if(!cur.getOut().equals(oldOut)) {
					
			
			isChanged = true;
		    }
		}
		Set<Variable> oldIn = cur.getIn();
		insInFromOut(cur);
				
		if(!cur.getIn().equals(oldIn)) {
		    isChanged = true;
		    //prevIn = cur.getIn();
		}
		prevIn = cur.getIn();
	    }
	}
    }

    public boolean oneTimeTraversal(List<InsInOut> instruction, boolean isChanged) {
	//System.out.println(instruction);
	int n = instruction.size();
	//isChanged = false;
	Set<Variable> prevIn = new HashSet<Variable>();

	for(int i = n - 1; i >=0; i--) {
	    InsInOut cur = instruction.get(i);
	
	    if (i < n - 1) {
		
		Set<Variable> oldOut = cur.getOut();
		cur.replaceOut(prevIn);
					
		if(!cur.getOut().equals(oldOut)) {
	
		    isChanged = true;
		}
	    }
	    Set<Variable> oldIn = cur.getIn();
	    insInFromOut(cur);
				
	    if(!cur.getIn().equals(oldIn)) {
		isChanged = true;

	    }
	    prevIn = cur.getIn();
				
	}
	return isChanged;
    }






    // algorithms between block

    public void allBlocksLiveness(List<BasicBlock> blocks) {
	boolean	isChanged = true;
	int counting = 0;
	while(counting < 50) {
	    counting ++;
	    isChanged = false;
	    for(int i = blocks.size()-1;i>=0;i--) {

		BasicBlock	curBlock = blocks.get(i);
		List<InsInOut> curIns = curBlock.getLivenessList();
		oneTimeTraversal(curIns, isChanged);
		Set<Variable> in = curIns.get(0).getIn();
		Set<Variable> out = curIns.get(curIns.size()-1).getOut();
		for(int idx_prev: curBlock.getPrev()) {
		    BasicBlock prevBlock = blocks.get(idx_prev);
		    List<InsInOut> prev = prevBlock.getLivenessList();
		    InsInOut lastLine = prev.get(prev.size()-1);

		    for(int idx_next: prevBlock.getNext()) {

			BasicBlock nbb = blocks.get(idx_next);
	
			Set<Variable> newOut = (unionTwoSets(lastLine.getOut(), (nbb.getLivenessList()).get(0).getIn(), isChanged));
							
			lastLine.replaceOut(newOut);
			in = nbb.getLivenessList().get(0).getIn();
			out = lastLine.getOut();
						
			oneTimeTraversal(prev, isChanged);


		    }

		}

					
	    }
	}

    }

    private Set<Variable> unionTwoSets(Set<Variable> a, Set<Variable> b, boolean isChanged) {

	Set<Variable> toReturn = new HashSet<Variable>();

        for(Variable v: a) {
            if(!b.contains(v)) {
                isChanged = true;
            }
	    toReturn.add(v);
        }
        for(Variable v: b) {
            if(!a.contains(v)) {
                isChanged = true;
            }
	    toReturn.add(v);
        }

	return toReturn;
    }

}

