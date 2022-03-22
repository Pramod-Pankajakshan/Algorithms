package tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import base.CreateBSTree;
import base.Node;

public class ZigZag {//node before subtrees
int g=10;boolean found;
    HashMap<Integer, Integer>  map= new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree10();		
		new ZigZag().zigzag2(node);
	}

private static void zigzag2(Node n){

	     List<Node> lst= new ArrayList<>();
	     lst.add(n); int startPos=0; int range=0; int previousSize=0; 
	     boolean leftToRight=false; 
	      while(startPos<=lst.size()-1){ // que - 1
	           leftToRight=!leftToRight; // true 
	           startPos=previousSize;
	           previousSize=lst.size();
	            range=previousSize-startPos;
             while(range>0){ // 1 2 4
	        	       Node n1= lst.get(previousSize-range);  
	            	   if(n1.getLeft()!=null) { lst.add(n1.left);}
	 	           if(n1.getRight()!=null) { lst.add(n1.right); }
	 	           if(!leftToRight)
	                 System.out.print(" "+n1.id);
	 	           else{
	 	        	    System.out.print(" "+lst.get(startPos+range-1).id );// 1 2 3 4
	 	        	   
	 	           }
	              range--;
	            }
	          System.out.println("");
	        
	          }
	     
	      }
	    

}
	

/**
 * need a stack or q jn 
    		    ( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
* 
* @return
*/

