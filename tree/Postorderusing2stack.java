package tree;


import java.util.Stack;

import base.CreateBSTree;
import base.Node;

public class Postorderusing2stack {//node before subtrees
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
		CreateBSTree e= new CreateBSTree();		
		postorder2stack(e.createTree6());
		System.out.println("================");			
	}
	public static void print(Node n){
		if(n==null) return;
		print(n.left);
		System.out.println(n.id);
		print(n.right);
		
		
	}

	
	static void postorder2stack(Node n){
		//create 2 stacks
		//push first - loop it -pop it- put first 2nd stack,
		//push left and right to first stack
		//keep doing it		
		Stack<Node> tempStack= new Stack<Node>();
		Stack<Node> finalStack= new Stack<Node>();		
		tempStack.push(n);		
		while(!tempStack.isEmpty()){
		
			Node node=tempStack.pop();
			finalStack.push(node);	// called just once	
			if(node.left!=null){
				tempStack.push(node.left);
				}
			if(node.right!=null){
				tempStack.push(node.right);
				}	
			
		}	
		
		
		while(!finalStack.isEmpty()){
			System.out.println(finalStack.pop().id);
		}		
	}	
}
