package tree;

import base.CreateBSTree;
import base.Node;

public class ConvertTreeToDll {
/**
			( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
*/


    //CONVERT TREE TO DLL
	static public  Node todll(Node n){
		
		if(n==null) return null;
		Node[] n1= new Node[1];
		createdll(n,n1);
		return n1[0];
	}
	static void createdll(Node n,Node ar[]){
		if(n==null){			
			return ;
			}		
		createdll(n.right,ar);//move to right		
		n.right=ar[0];//step 3 wht ever was prev
		if(ar[0]!=null)
			ar[0].left=n;// step one - current is left of prev
		ar[0]=n;  //step 2 current is set here		
		createdll(n.left,ar);	//move to left	
	}



	




















}
