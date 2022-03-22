package beforeexam;

import java.util.*;


public class WayFairPhoneScreen {




	

		
	
	/*
	Suppose we have some input data describing a graph of relationships between parents and children over multiple generations. The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique positive integer identifier.

	For example, in this diagram, 6 and 8 have common ancestors of 4 and 14.

	             15
	             |
	         14  13
	         |   |
	1   2    4   12
	 \ /   / | \ /
	  3   5  8  9
	   \ / \     \
	    6   7     11

	parentChildPairs1 = [
	    (1, 3), (2, 3), (3, 6), (5, 6), (5, 7), (4, 5),
	    (4, 8), (4, 9), (9, 11), (14, 4), (13, 12),
	    (12, 9),(15, 13)
	]

	Write a function that takes the graph, as well as two of the individuals in our dataset, as its inputs and returns true if and only if they share at least one ancestor.

	Sample input and output:

	hasCommonAncestor(parentChildPairs1, 3, 8) => false
	hasCommonAncestor(parentChildPairs1, 5, 8) => true
	hasCommonAncestor(parentChildPairs1, 6, 8) => true
	hasCommonAncestor(parentChildPairs1, 6, 9) => true
	hasCommonAncestor(parentChildPairs1, 1, 3) => false
	hasCommonAncestor(parentChildPairs1, 3, 1) => false
	hasCommonAncestor(parentChildPairs1, 7, 11) => true
	hasCommonAncestor(parentChildPairs1, 6, 5) => true
	hasCommonAncestor(parentChildPairs1, 5, 6) => true

	*/

	import java.io.*;
	import java.util.*;

	public class Solution {
	  public static void main(String[] argv) {
	    int[][] parentChildPairs1 = new int[][] {
	        {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5},
	        {4, 8}, {4, 9}, {9, 11}, {14, 4}, {13, 12}, {12, 9},
	        {15, 13}
	    };
	    Solution s= new Solution();
	    //boolean re=s.hasCommonAncestor(parentChildPairs1,6,8);
	     boolean re2=s.hasCommonAncestor(parentChildPairs1,7,11);
	    System.out.println(re2);

	  }
	  
	  private boolean hasCommonAncestor(int[][] in, int c, int p){
	    ancSet= new HashSet<>();
	    Map<Integer,List<Integer>> ancMap= new HashMap<>();
	    // {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5},
	    for(int[] i:in){
	      List<Integer> ls=ancMap.getOrDefault(i[1],new ArrayList<>());
	      ls.add(i[0]);
	      ancMap.put(i[1],ls);
	    }
	    getAnc(c,ancMap);
	    ancSet.stream().forEach(System.out::println);
	    getChk(p,ancMap);
	    return res;
	  }
	    // for c get all ancestors
	    
	  Set<Integer> ancSet= new HashSet<>();
	    private void getAnc(int in,Map<Integer,List<Integer>> map){     
	      if(!map.containsKey(in)) return;
	      
	      List<Integer> ls= map.get(in);
	      ancSet.addAll(ls);      
	      for(int i:ls){        
	        getAnc(i,map);        
	      }
	      
	    }
	  
	  boolean res=false;
	   private void getChk(int in,Map<Integer,List<Integer>> map){
	     
	      if(!map.containsKey(in)) return;
	      
	      List<Integer> ls= map.get(in);
	      for(int i:ls){
	        if(ancSet.contains(i)) res=true;
	        return;
	      }      
	      for(int i:ls){        
	        getChk(i,map);        
	      }
	      
	    }
	  
	  
	}


}

