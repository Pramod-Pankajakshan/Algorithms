package tree.revise;

import java.util.*;

import base.CreateBSTree;
import base.Node;
/**
			( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
* 
* @return
*/

public class AllOrderSimple {

	public static void main(String args[]) {
		CreateBSTree c= new CreateBSTree();
		Node n=c.createTree6();
		AllOrderSimple as= new AllOrderSimple();
		System.out.println("Pre-Order...");
		as.preorder(n);
		System.out.println();
		System.out.println  ("In-Order...");
		as.inorder(n);
		System.out.println();
		System.out.println  ("Post-Order...");
		as.postorder(n);
		
		

	}
//Pre-Order...
//	.6.3.1.5.9.7.10
	private void preorder(Node n) {
		if(n==null) return;		
		System.out.print  ("."+n.id);
		preorder(n.left);
		preorder(n.right);
	}
//In-Order...
//	1.3.5.6.7.9.10.	
	private void inorder(Node n) {
		if(n==null) return;
		inorder(n.left);
		System.out.print(n.id+".");
		inorder(n.right);
	}
//	Post-Order...
//	1.5.3.7.10.9.6.	
	private void postorder(Node n) {
		if(n==null) return;
		postorder(n.left);
		postorder(n.right);
		System.out.print  (n.id+".");
	}
}

