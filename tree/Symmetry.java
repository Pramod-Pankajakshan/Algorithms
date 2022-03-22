package tree;

import base.Node;

public class Symmetry {
 /**    1
	   / \
	  2   2
	 / \ / \
	3  4 4  3
*/	
	
	public boolean isSymmetric(Node root) {
	    return root==null || isSymmetricHelp(root.left, root.right);
	}

	private boolean isSymmetricHelp(Node left, Node right){
	    if(left==null || right==null)
	        return left==right;
	    if(left.id!=right.id)
	        return false;
	    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}
}
