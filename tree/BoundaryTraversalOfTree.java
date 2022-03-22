package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import base.CreateBSTree;
import base.Node;

public class BoundaryTraversalOfTree {//node before subtrees

 
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();		
		//print(node);
		new BoundaryTraversalOfTree().boundary(node);System.out.println("====");
		//print(node);
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
* 
* @return
*/
// better way	
public void  boundary(Node n){
  ArrayList<Stack> al = new ArrayList<Stack>();
	Queue<Node> q= new LinkedList<Node>();
	Stack<Node> s1=null;
	q.add(n);
	while(true){
		int c=q.size(); int curretnsize=q.size();
		if(c==0) break;
		Stack s= new Stack();
		 s1= new Stack();
		while(c>0){
			Node n2=q.poll();
			//System.out.println("---"+n2.id);
			s1.push(n2);
			if(c==1||c==curretnsize){System.out.println(n2.id);}			
			if(n2.left!=null) q.add(n2.left);
			if(n2.right!=null) q.add(n2.right);
			c=c-1;
		}
		
   }
	int c=1; int constantsize=s1.size();
	while(!s1.isEmpty()){
		if(c!=1&&c!=constantsize){
		System.out.println(s1.pop().id);
		}else{
			s1.pop();
		}
		c=c+1;
	}
	
}

}
