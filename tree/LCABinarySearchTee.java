package tree;

import base.CreateBSTree;
import base.Node;

public class LCABinarySearchTee {
	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node n=e.createTree6();
		
		Node n2=getLCABST(n,10,7);
		System.out.println(n2.id);
	}
  //idea is to find the node where one value is left and other is right
	//note - keep returning the value
	static Node  getLCABST(Node n,int v1,int v2){
	 if(n==null) return null;
	 
	 if(v1<n.id&&v2<n.id){
		 return getLCABST(n.left,v1,v2);
	 }
	 if(v1>n.id&&v2>n.id){
		 return getLCABST(n.right,v1,v2);
	 }
		
	 return n;
	}
	
	
	
	
}
