package tree;

import java.util.Stack;

import base.CreateBSTree;
import base.Node;

public class BSTIterator {
    
	public static void main(String[] args) {
		CreateBSTree c= new CreateBSTree();
		BSTIterator b= new BSTIterator(c.createTree6());
		while(b.hasNext()) {
			System.out.println(b.next());
		}
	}
	
    Stack<Node> stack =  null ;            
    Node current = null ;
	
    public BSTIterator(Node root) {
    	  current = root;	     
    	  stack = new Stack<> ();
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {		  
	      return !stack.isEmpty() || current != null;  
	}

	/** @return the next smallest number */
	// create a stack
	// in next
	// implement inordr traversal
	public int next() {
		while (current != null) {
			stack.push(current);
			current = current.left ;
		}		
		Node nextvalue = stack.pop() ;		
		current = nextvalue.right ;		
		return nextvalue.id ;// same as inorder
	}
}


