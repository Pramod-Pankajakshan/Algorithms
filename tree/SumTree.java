package tree;

import java.util.HashMap;

import base.CreateBSTree;
import base.Node;
public class SumTree {
	
	/**
			( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
* 
*/
	
	
	public static void main(String[] args) {
	//	HashMap<K, V>
		CreateBSTree c= new CreateBSTree();
		Node f=c.createTree6();
		c.print(f);
		SumTree bs= new SumTree();
		bs.getSum(f,0);
		//bs.getSm(f);
		System.out.println("========");
		c.print(f);
	}
	
	
	/**
	 * one way
	 * @param n
	 * @param pushedVal
	 * @return
	 */
	private int getSum(Node n,int pushedVal) {
		
		if(n==null) return pushedVal;
        int right=getSum(n.right,pushedVal);
        int left=getSum(n.left,n.id+right);
	    n.id=n.id+right;
		
		return left;
	}

	int sum=0;
	/**
	 * using global var
	 * @param n
	 * @return
	 */
	private int getSm(Node n) {		
		if(n==null) return 0;		
		getSm(n.right);
		n.id=n.id+sum;
		sum=n.id;
		getSm(n.left);
		
		return n.id;
		
	}
	
	
}
