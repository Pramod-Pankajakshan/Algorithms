package tree;

import base.CreateBSTree;
import base.Node;

public class KDistanceNodesPrint {//node before subtrees
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
		new KDistanceNodesPrint().nodesatKdist(n6,n,2);
	}


	public int nodesatKdist(Node root,Node target,int k){		
		
		if(root==null) return -1;		
		if(root==target){
			nodesatKdistDown(root,k);
			return 0;//if found return zero
		}
		int lt=nodesatKdist(root.left,target,k);		
		if(lt!=-1){		
			if(lt+1==k){//keep incrementing
				System.out.println(root.id);
			}else{
				nodesatKdistDown(root.right,k-lt-2);
			}
			return lt+1;//keep incrementing
		}
		//c// MIRROR OF ABOVE CODE FOR RIGHT SUBTREE
		int rt=nodesatKdist(root.right,target,k);
		
		if(rt!=-1){
		
			if(rt+1==k){
				System.out.println(root.id);
			}else{
				nodesatKdistDown(root.left,k-rt-2);
			}			
			return rt+1;
			}		
	return -1;
	}
	
	public void nodesatKdistDown(Node n,int k){
	    if(n==null||k<0) return;
		if(k==0){
		System.out.println(n.id);
		return;
		}else{
			nodesatKdistDown(n.left,k-1);
			nodesatKdistDown(n.right,k-1);
		}
		
	}
	
public int nodesatKdistDownLeaf(Node root,Node target,int k){
		
		if(root==null) return -1;
		
		if(root==target){
			nodesatKdistDown(root,k);
			return 0;
		}
		int lt=nodesatKdist(root.left,target,k);		
		if(lt!=-1){		
			if(lt+1==k){
				System.out.println(root.id);
			}else{
				nodesatKdistDown(root.right,k-lt-2);
			}
			return lt+1;
		}
		//copy for right
		int rt=nodesatKdist(root.right,target,k);
		
		if(rt!=-1){
		
			if(rt+1==k){
				System.out.println(root.id);
			}else{
				nodesatKdistDown(root.left,k-rt-2);
			}			
			return rt+1;
			}		
	return -1;
	}


//public int k(Node root,Node n,int k){
//	

//	}
//	
//	
//}























}
