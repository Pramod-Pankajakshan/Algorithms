package leetcode;

import base.CreateBSTree;
import base.CreateTree;
import base.Node;

public class CheckSumCountOfTree {
	
	public static void main(String[] args) {
		CheckSumCountOfTree v= new CheckSumCountOfTree();
		CreateBSTree t=  new CreateBSTree();
		Node n=t.createTree6();
		System.out.println(v.pathSum(n,19));

	}//CheckSumCountOfTree - any path
	    public int pathSum(Node root, int sum) {
	    	
	        if (root == null) return 0;
	        System.out.println("starting from +"+root.id);
	        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	    }
	    
	    private int dfs(Node node, int sum) {
	        if (node == null) return 0;
	        return (node.id == sum ? 1 : 0)
	        		+ dfs(node.left, sum - node.id) + dfs(node.right, sum - node.id);
	    }
	}


