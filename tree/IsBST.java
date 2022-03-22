package tree;

import java.util.ArrayList;

import base.CreateBSTree;
import base.CreateTree;
import base.Node;

public class IsBST {
	int value=Integer.MIN_VALUE;
	/**
	 *          ( 6 )
	 *	       /     \
	 *	    __/       \ _
	 *	  ( 3 )        ( 9 )
	 *     /  \         / \ 
	 *  __/    \ _     /   \
	 * ( 1 )  ( 5 ) ( 7 )  ( 10 ) // 1 3 5 6 7 9 10
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("start");
		CreateBSTree bst= new CreateBSTree();
		CreateTree d= new CreateTree();
		//Node n=d.createTree();
		Node n=	bst.createTree();
		IsBST b=new IsBST();		
		b.isbst(n,Integer.MIN_VALUE,Integer.MAX_VALUE);		
		ArrayList<String> al= new ArrayList<String>();
		al.add("ffff");
		Object[] aa=al.toArray();
	}
	
	boolean isbst(Node n, int min,int max){
		if(n==null) return true;	
		
		if(n.id<min||n.id>max){
			return false;
		}		
		return isbst(n.left,min,n.id)&& isbst(n.left,n.id,max);		
	}
	
	void printInOrderTraversal(Node n){
	if(n!=null){
		printInOrderTraversal(n.left);		
		if(n.getUniqueId()>value){
		value=(n.getUniqueId());		
		}else{
			System.out.println("nooooooooo");
		}
		printInOrderTraversal(n.right);
	}
	}

	
	
}
