package tree;

import base.CreateTree;
import base.Node;
// balanced if its empty or height diff of left or right nodes r <=1 for any nodes  
public class BalancedBinaryTree {
	
	public static void main(String[] args) {
		CreateTree e= new CreateTree();
		Node n=e.createTree();
		BalancedBinaryTree bt= new BalancedBinaryTree();
		System.out.println(bt.isbalanced(n));
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	boolean isbalanced(Node n){
	if(getHeightForChecking(n)<0) return false;	
	return true;
	}
	
	/**
	 * IS BALANCED - GET THE HEIGHT
	 * @param n
	 * @returnIS BALANCED - GET THE HEIGHT
	 */
	int getHeightForChecking(Node n){		
		if(n==null) return 0;			
		int left=getHeightForChecking(n.left);
		int right=getHeightForChecking(n.right);		
		if(left==-1 || right ==-1) return -1;			
		if(Math.abs(left-right)>1) return -1;	// get absolute difference 
		return Math.max(left,right)+1; 
	
	}
}
