package tree;

import base.CreateBSTree;
import base.Node;

public class MaxPathSum {
	
	public static void main(String arg[]){
		CreateBSTree e= new CreateBSTree();	
		System.out.println(maxPathSum(e.createTree6()));
	}


  	static   int maxValue;
    
    public static int maxPathSum(Node root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }
    
    private static int maxPathDown(Node node) {
        if (node == null) return 0;
        
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        
        maxValue = Math.max(maxValue, left + right + node.id);
        return Math.max(left, right) + node.id;
    }

}



