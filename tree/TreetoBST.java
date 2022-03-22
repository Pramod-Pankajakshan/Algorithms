package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import base.CreateBSTree;
import base.Node;

public class TreetoBST {//node before subtrees
/**
			( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
*/
	public static void main(String[] args) {
		// 3 steps - get the values of node
		// sort it
		// run inorder and set it
		CreateBSTree e= new CreateBSTree();
		Node n=e.preorder();
		inorder(n);
		dsd(n);System.out.println("=============");
		Collections.sort(a);
		System.out.println(a);
		treeToBST(n);
		System.out.println("=============");
		dsd(n);
		
		
	}
	
	static final void dsd(Node n){
		if(n==null) return;
		
		dsd(n.left);
		System.out.println(n.id);
		dsd(n.right);;
	}
	//print inoder
	static int counter;
	static void treeToBST(Node n){
		
		if(n==null) return;
		
		treeToBST(n.left);
		n.id=a.get(counter);	
		counter=counter+1;
		treeToBST(n.right);;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static ArrayList<Integer> a= new ArrayList<Integer>();
	static void inorder(Node n){
		if(n==null) return;
		
		inorder(n.left);
		a.add(n.id);
		inorder(n.right);;
	}
	
	
	

}
