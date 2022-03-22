package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import base.CreateBSTree;
import base.Node;

public class SwapLevelNodes {//node before subtrees

 
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();		
		print(node);
		new SwapLevelNodes().swappedbst2(node,Integer.MIN_VALUE,Integer.MAX_VALUE);System.out.println("====");
		print(node);
		System.out.println(nfr);System.out.println(nth);
		System.out.println(n3);System.out.println(n4);
	}
	
	public static void print(Node n){
		if(n==null) return;
		System.out.println(n.id);
		print(n.left);
		
		print(n.right);
	}
/**
* need a stack or q jn 
    		( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
*  /
* 1   6  6   7  8  9   1    9
* @return
*/
public boolean swappedbst2(Node n){
	
	
	
}

}
