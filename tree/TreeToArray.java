package tree;

import base.CreateTree;
import base.Node;

public class TreeToArray {

	public static void main(String ar[]) {
		System.out.println("hello");
		CreateTree ct= new CreateTree();
		Node n=ct.createTree();
		Node nn=run(n);
		
		System.out.println("------------");
		System.out.println(nn);
		System.out.println(na[0].id);System.out.println(na[1].id);
		
	}
	
	// actions
	
	// store the node in an array
	// go left and go right
	// if node=
	
	static Node na[]= new Node[10];
	static int c=0;
	
	private static Node run(Node n){
	
		if(n == null)
			return null;	
		System.out.println(n.id);
		n.left=run(n.left);
		n.right=run(n.right);
		if(n.id==6) {
			na[c]=n;
			c++;
			n=null;			
		}
		
		return n;
	}
	
}
