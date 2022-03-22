package tree;

import base.CreateBSTree;
import base.Node;

public class TreetoDLL {//node before subtrees
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
		
		Node n= new Node(1);		
		Node n3= new Node(3);		
		Node n5= new Node(5);	
		Node n6= new Node(6);
		Node n7= new Node(7);		
		Node n9= new Node(9);
		Node n10= new Node(10);
		n6.addleft(n3);
		n6.addright(n9);
		n9.addleft(n7);
		n9.addright(n10);
		n3.addleft(n);		
		n3.addright(n5);   
		System.out.println("ss");
		Node n34=new TreetoDLL().todll(n6);
		//new TreetoDLL().flatten(n6);
		printDLL(n34);
		System.out.println("---");
		printDLL(prev);
	}
	public static void printDLL(Node  root){
		while(root != null){
			System.out.print(root.id+" ");
			root = root.right;
		}
	}

	static public  Node todll(Node n){
		
		if(n==null) return null;
		Node[] n1= new Node[1];// new array -empty
		createdll(n,n1);
		return n1[0];		
	}
		// go to right end 1 3 5 6 7 9 10 ---
	static void createdll(Node n,Node ar[]){
		if(n==null)return ;
			
		createdll(n.right,ar);//move to right	
		n.right=ar[0];//step 3		
		if(ar[0]!=null)
			ar[0].left=n;//step 2		
		ar[0]=n; //step - 1
		
		
		createdll(n.left,ar);// pass it here which sets step3	
	}



	// same as above
	private static Node prev = null;
    // to print in 63157910
	public static void flatten(Node root) {
	    if (root == null)
	        return;
	    flatten(root.right);
	    flatten(root.left);
	    root.right = prev;
	 //   root.left = null; show off - set it if asked
	    prev = root;
	}



















}
