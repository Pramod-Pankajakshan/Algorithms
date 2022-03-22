package tree;

import base.CreateBSTree;
import base.Node;

public class RobberDp2 {

/**
	        ( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 900 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 500 ) ( 7 )  ( 10 )
* 
* @return
*/
	public static void main(String[] args) {
		
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree62();
		System.out.println(rob(node));

	}
	
	public static int rob(Node root) {
	    if (root == null) return 0;
	    
	    int val = 0;
	    
	    if (root.left != null) {
	        val += rob(root.left.left) + rob(root.left.right);
	    }
	    
	    if (root.right != null) {
	        val += rob(root.right.left) + rob(root.right.right);
	    }
	    
	    return Math.max(val + root.id, rob(root.left) + rob(root.right));
	}
	
}
