package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphCriticalRouters {
	

	
	  public static void main(String[] args) {
	        int[][] e1 = new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 5}, {5, 6}, {3, 4}};
	        int[][] e = new int[][]{{0, 1}, {1, 2}, {1, 3}, {2, 0}};
	        int nodes = 4;  int edges = 7; 
	        List<Integer> edges4=start(populate(e),nodes);
	        System.out.println("-------------------");
	        for(int i:edges4) {
	        	System.out.println(i);
	        }
	    }
	  
	  
	  // convert to set of Node objects
	  // perform dfs
	  // check for cycles
	

	
	private static HashMap<Integer, List<Integer>> populate(int[][] e) {
		HashMap<Integer, List<Integer>> hm = new HashMap<>();
	
		for(int i=0;i<e.length;i++) {	
			List<Integer> edges= new ArrayList<Integer>();	
			  if(hm.get(e[i][0])==null) {
				   edges.add(e[i][1]);
					hm.put(e[i][0], edges);
			  }else {
				  List<Integer> edges2=  hm.get(e[i][0]);
				  edges2.add(e[i][1]);
				  hm.put(e[i][0], edges2);
			  }
				List<Integer> edges3= new ArrayList<Integer>();	
			  if(hm.get(e[i][1])==null) {
				   edges3.add(e[i][0]);
					hm.put(e[i][1], edges3);
			  }else {
				  List<Integer> edges4=  hm.get(e[i][1]);
				  edges4.add(e[i][0]);
				  hm.put(e[i][1], edges4);
			  }
			  
		}
		return hm;
	}
	
	
	private static List<Integer> start(HashMap<Integer, List<Integer>> graph, int nodes) {
	
		List<Integer> edges3= new ArrayList<Integer>();
		for(int i:graph.keySet()) {			
			// start by excluding i
			// now loop and check the unique size
			boolean b=process(i,graph, nodes-1);
			if(b) edges3.add(i);
		}
		
	return edges3;
	}
	
	private static  boolean process(int exclude, HashMap<Integer, List<Integer>> hm, int expectedsieze){
		Set<Integer> visited= new HashSet<>();
		System.out.println(exclude+"- is the exclude");
		for(int i:hm.keySet()) {	
		 if(i==exclude) {
			 continue;
		 }else {		
		 p(hm,i,visited,exclude); break;
		}
		}
	  System.out.println(visited.size());
		return visited.size()!=expectedsieze?true:false;
	}
	
	
	
	private static void p(HashMap<Integer, List<Integer>> hm, int curr,Set<Integer> vis ,int ex) {
		if(vis.contains(curr)) return ;
		vis.add(curr);
		List<Integer> ls=hm.get(curr);
		for(int i:ls) {
			if(i!=ex)
				p(hm,i,vis,ex);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
