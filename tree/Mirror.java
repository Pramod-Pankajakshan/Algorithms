package tree;

import base.CreateBSTree;
import base.Node;

public class Mirror {//node before subtrees

	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		e.print(node);
		System.out.println("====");
		Node n=new Mirror().mirror(node);
		e.print(n);
	}
	/**
	 * 
	 * 			1
	 * 	   2	    3
	 * 	4	 5    6	   7
	 *           8   
	 *          9
	 * 
	 * @return
	 */
	public Node mirror(Node n){
		Node temp;
		if(n==null) return n;
		mirror(n.getLeft());
		mirror(n.getRight());
		//post
		temp=n.getLeft();
		n.left=n.getRight();
		n.right=temp;		
	return n;
	}
	
}
