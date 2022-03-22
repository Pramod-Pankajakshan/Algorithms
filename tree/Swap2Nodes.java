package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import base.CreateBSTree;
import base.Node;

public class Swap2Nodes {//node before subtrees

 
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();		
		print(node);
		new Swap2Nodes().swappedbst(node,Integer.MIN_VALUE,Integer.MAX_VALUE);System.out.println("====");
		print(node);
		System.out.println(nfr);System.out.println(nth);
		System.out.println(n3);System.out.println(n4);
	}
	
	public static void print(Node n){
		if(n==null) return;
		System.out.println(n.id);
		print(n.left);
		
		print(n.right);
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
*  /
* 1   6  6   7  8  9   1    9
* @return
*/
// better way	
public void  reversel(Node n){
			
}

boolean onefound=false;
Node n1=null;
Node n2=null;

public void swappedbst(Node n,int min,int max){
	
	if(n==null) return;
	
	if(n.id<min||n.id>max){
		if(onefound){
			int temp=n.id;
			n.id=n1.id;
			n1.id=temp;
		}
		if(!onefound){
		onefound=true;
		n1=n;
		}
	}
	swappedbst(n.left,min,n.id);
	swappedbst(n.right,n.id,max);
}


static Node n3=null;
static Node n4=null;
static String nth="";static String nfr="";boolean first=false;
/**
 * u cannot change data
 * @param n
 * @param min
 * @param max
 */
public boolean swappedbst2(Node n,int min,int max){
	
	if(n==null) return false;
	
	if(n.id<min||n.id>max){
	return true;
	}
	boolean l=swappedbst2(n.left,min,n.id);
	boolean r=swappedbst2(n.right,n.id,max);
	if(l||r){
	if(first){
	if(l){
		n3=n;
		nth="l";
	}
	if(r){
		n3=n;
		nth="r";
	}
	}else{
		if(l){
			n4=n;
			nfr="l";
		}
		if(r){
			n4=n;
			nfr="r";
		}
		first=true;
	}
	}
	return false;
}

}
