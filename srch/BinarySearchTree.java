package srch;

import base.CreateBSTree;
import base.Node;

/*
 * 2017
 */
public class BinarySearchTree {

	public static void main(String[] args) {
		CreateBSTree c= new CreateBSTree();
		Node f=c.createTree6();
		c.print(f);
		BinarySearchTree bs= new BinarySearchTree();
		System.out.println(bs.search(f, 1).id);
	}        
	
	
	private Node search(Node n, int in) {
	   if(n!=null)
		System.out.println("----"+n.id);
		//base case
		if(n==null || n.id==in) {
			System.out.println("found"+n.id);
			return n;
		}		
		//left
		if(n.id>in) {
		 return	search(n.left,in);
		}else {
		 return	search(n.right, in);
		}
		
		//right
	 
	}
	
}
