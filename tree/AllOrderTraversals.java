package tree;

import java.util.Stack;

import base.CreateBSTree;
import base.CreateTree;
import base.Node;

public class AllOrderTraversals {
	
	public static void main(String[] args) {
		CreateBSTree c= new CreateBSTree();
		Node n=c.createTree6();
		Node n1=c.createTree61();
		inorder(n);
		//c.print(n);
		//Node nd=mergeTrees(n,n1);
		System.out.println("---");
		//c.print(nd);
	}
	
	public static  void inorder(Node n) {		
		if(n==null) return;
		Stack<Node> s = new Stack<Node>();		
		while(true) {			
			while(n!=null) {				
				s.push(n);
				n=n.left;
			}			
			if(s.isEmpty()) break;
			
		    n= s.pop();
		    System.out.print(n.id+".");
			n=n.right;	
		}		
	return;		
	}
	
	
	
	
	private static Node mergeTrees(Node n1, Node n2) {
		
	if(n1==null&&n2==null) return null;
	if(n1!=null&&n2==null) return n1; 
	if(n1==null&&n2!=null) return n2;
	
	if(n1!=null&&n2!=null) {
		
		n1.id=n1.id+n2.id;
		n1.left=mergeTrees(n1.left,n2.left);
		n1.right=mergeTrees(n1.right,n2.right);
		
	}
	return n1;
	}

	
	
	
	
	
}
