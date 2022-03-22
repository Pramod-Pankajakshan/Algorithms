package tree;



import base.CreateBSTree;
import base.Node;

public class TreeToSumTree {//node before subtrees
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
		Node n=e.createTree6();		
		sumTree(n);
		print(n);
		Node n2=e.createTree6();		
		
		System.out.println("==");
		print(n2);
	}
	
	static int sumTree(Node n){
		if(n==null) return 0;
		int t=n.id;
		int sum=sumTree(n.left)+sumTree(n.right);
	    n.id=sum;
	return sum+t;
	}
	
	
	public static void print(Node n){
		if(n==null) return;
		print(n.left);
		System.out.println(n.id);
		print(n.right);
	}
	

}
