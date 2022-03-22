package tree;

import base.CreateBSTree;
import base.Node;

public class DeleteTree {

	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();  
		e.print( deleteTree(node));		
	}
	
	
	static public Node  deleteTree(Node n){
		if(n==null) return null;
		
		n.left=deleteTree(n.left);
		n.right=deleteTree(n.right);
		
		return null;
	}
	
	
}
