 package tree;

import base.CreateBSTree;
import base.Node;
//common ancestor
public class LCABinaryTee {
	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node n=e.createTree6();
		Node n2=getLCA(n,10,7);
		
		System.out.println(n2.id);
	}
  //idea is to find the node where one value is left and other is right
	//note - keep returning the value
	static Node  getLCA(Node n,int v1,int v2){
		if(n==null) return null;
		if(n.id==v1){			
			return n;
		}
		if(n.id==v2){			
			return n;
		}
     	Node r=getLCA(n.right,v1,v2);
		Node l=getLCA(n.left,v1,v2);
		
		if(r!=null&&l!=null){
			System.out.println(n.id);
			return n;// from here line below is valid
		}
		
		return r!=null?r:l;// i missed this
	}
	
	
	
	
}
