package tree;

import base.CreateBSTree;
import base.Node;

public class populateinorderField {

	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();		
		Node f=populatenextwithinorder(node,null);		
		while(f.next!=null){
			System.out.println(f.next.val);
			f=f.next;
		}
	}

	// do reverse inorder
	static public Node  populatenextwithinorder(Node n,Node previous){
		
		if(n==null){ return previous;}
		n.next=populatenextwithinorder(n.right,previous);
    	return populatenextwithinorder(n.left,n);
    	
   }

}
