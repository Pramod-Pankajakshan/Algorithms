package tree;

import java.util.*;


// prints vertical order but specific descending order is not supported
// not a soultion for https://leetcode.com/problems/binary-tree-vertical-order-traversal/
public class VerticalOrder {

	public static void main(String args[]) {
		VerticalOrder v= new VerticalOrder();
		//verticalOrder()

	}

	  
	  
	  
	  public List<List<Integer>> verticalOrder(TreeNode root) {
	        List<List<Integer>> ls = new ArrayList<>();
	        vorder(root,0);
	        for(int i:map.keySet()){
	            
	         ls.add(map.get(i));   
	        }
	      return ls;  
	    }
	    
	    Map<Integer,List<Integer>> map= new TreeMap<>();
	    
	    private void vorder(TreeNode root, int pos){
	        if(root==null) return;
	       List<Integer> ls=map.getOrDefault(pos, new ArrayList<Integer>());
	        System.out.println(pos+"-"+ls.size());
	        ls.add(root.val);
	        map.put(pos,ls);
	        vorder(root.left,pos-1);
	        vorder(root.right,pos+1);
	    }
}

