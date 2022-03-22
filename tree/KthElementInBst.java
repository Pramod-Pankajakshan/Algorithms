package tree;

import base.CreateBSTree;
import base.Node;

public class KthElementInBst { //change the from , means 0>k>n 
int kth=4;int counter=0;
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		new KthElementInBst().kth(node);
		Node node2=e.createTree6();
		new KthElementInBst().inorder(node2);
	}
	/**
	       /**
    		    ( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
	 */
	public void kth(Node n){
		
		if(n==null) return;		
		kth(n.left);	
		counter=counter+1;	//counter	
		//System.out.println("........"+n.getUniqueId());
		if(counter==kth){
			System.out.println("> "+n.getUniqueId());
		}
		
		kth(n.right);	
	}
	
public void inorder(Node n){		
		if(n==null) return;		
		inorder(n.left);	
		System.out.println("==="+n.getUniqueId());
		inorder(n.right);	
	}
	
}
