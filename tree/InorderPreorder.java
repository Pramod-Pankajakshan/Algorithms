package tree;

import java.util.Arrays;

import base.CreateBSTree;
import base.Node;

public class InorderPreorder {//node before subtrees
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
		print(e.createTree6());System.out.println("================");
		int[] i1={1,3,5,6,7,9,10};
		int[] p2={6,3,1,5,9,7,10};	
		Node n2=inorderpreorder(i1,p2,0,p2.length-1);
		//inorderpreorderprintpost(p2,0,i1,0,p2.length);	
		print(n2);
	}
	
	
	static void print(Node n){
		if(n==null) return;		
		System.out.println(n.id);
		print(n.left);		
		print(n.right);;
		
	}
	
	
	static int preorderindex;
	// start with a class level preorder index and start from 0 
	// fint that in the inorder and get its position
	// now for left - call same fn for start to position -1
	// for right - call same fn for pos+1 to end;
	
	public static Node inorderpreorder(int inorderarray[],int preorderarray[], int start,int end){
		if(start>end) {
			return null;
		}
		Node n=new Node(preorderarray[preorderindex]);
		preorderindex=preorderindex+1;
		if(start==end) {
			return n;
		}
		int positioninInorder=getPositionInOrder(n.id,inorderarray,start,end);		
		n.left=inorderpreorder(inorderarray,preorderarray,start,positioninInorder-1 );
		n.right=inorderpreorder(inorderarray,preorderarray,positioninInorder+1,end);
		return n;
	}
	
	
	
	//	int[] i1={1,3,5,6,7,9,10};
    // 	int[] p2={6,3,1,5,9,7,10}; op=1 5 3 7 10 9 6
	public static void inorderpreorderprintpost(int prearr[],int preidx,int inarr[], int low, int high){	
		if(low>high) return;
		
		int idx=getPositionInOrder(prearr[preidx],inarr,low,high);
		
		int curr=preidx;
		preidx=preidx+1;
		
			inorderpreorderprintpost(prearr,preidx,inarr,low,idx-1 );	
				
		
			inorderpreorderprintpost(prearr,preidx,inarr,idx+1,high );		
		
		
		System.out.println(prearr[curr]);
	}
	

 static int getPositionInOrder(int value,int in[],int s,int e){
	 for(int i=s;i<=e;i++){
		 if(in[i]==value){
			 return i;
		 }
	 }
	 return -1;
 }





}
