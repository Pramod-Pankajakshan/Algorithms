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
public class RemoveNodesWithLengthLessThanK {
	//static int k=1;
	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTreeNotCom();
		print(node);System.out.println("==");
		new RemoveNodesWithLengthLessThanK().remove(node,0);
		print(node);
	}
	static int k=1;
	
	
	
	public boolean remove(Node n,int count){		
	if(n==null) return false;
    count=count+1;
	boolean left=remove(n.left,count);
	boolean right=remove(n.right,count);    

	if(left) n.left=null;
	if(right) n.right=null;	
	if(n.left==null&&n.right==null&&count<k){//note
		return true;
	}else{
		return false;
	}	
	}
	
	
	
	
	public static void print(Node n){
		if(n==null) return;
		System.out.println(n.id);
		print(n.left);
		
		print(n.right);
		
		
	}
}
