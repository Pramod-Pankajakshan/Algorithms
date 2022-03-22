package tree;

import java.util.LinkedList;
import java.util.Queue;

import base.CreateBSTree;
import base.Node;
/**
        	( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*    	   		    / \ 
*  	    n          /   \
*               ( 7 )  ( 10 )
*               11        13   
*              12       
* @return
*/
// set node to null return it and check if k is less and kill it 
public class RemoveNodesWithSumLessThanK {
	//static int k=1;
	
	public static void print(Node n){
		if(n==null) return;
		System.out.println(n.id);
		print(n.left);		
		print(n.right);
	}
	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTreeNotCom();
		print(node);System.out.println("==");
		new RemoveNodesWithSumLessThanK().remove(node,0);
		print(node);
	}
	
	static int k=12;
	
	
	public boolean remove(Node n,int sum){		
		boolean nl=false; boolean nr=false;	
		if(n==null) return false;
		sum=sum+n.id;	
		nl=remove(n.left,sum);
		nr=remove(n.right,sum);
		if(nl) n.left=null;
		if(nr) n.right=null;		
		if(n!=null&&n.right==null&&n.left==null){
			if(sum<k) return true;
		}	
		if(nl&&nr) return true;		
		return false;
	}	
}
