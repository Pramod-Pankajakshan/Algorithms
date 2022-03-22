package tree;

import base.CreateBSTree;
import base.Node;

public class DeleteNode {

	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		e.print( delete(node,3));
		
	}
	
	
	static public Node  delete(Node n,int td){
		if(n==null) return null;
		if(n.id>td){
			n.left=delete(n.left,td);
		}else if(n.id<td){
			n.right=delete(n.right,td);
		}else{
			
			if(n.left==null&&n.right==null){
				return null;
			}
			if(n.left!=null&&n.right==null){
				return n.left;
			}
			if(n.left==null&&n.right!=null){
				return n.right;
			}
			
			if(n.left!=null&&n.right!=null){
				 getSmallestFromRight(n.right);
				 n.id=min;
				n.right= deleteNode(min,n.right);
			}
			
			
		}
		return n;
	}
	
	 static Node  deleteNode(int min,Node n){
		 if(n==null) return null;
		 if(n.id==min){
			 n=null;
			 return null;
		 }
		 n.left=deleteNode(min,n.left);
		 n.right=deleteNode(min,n.right);
		 
		 return n;
	 }
	static int min=Integer.MAX_VALUE;
	static Node sm;
	
	
	
	static void getSmallestFromRight(Node n){
		
	    if(n==null) return ;
		if(n.id<min){
			min=n.id; sm=n;
		}
			getSmallestFromRight(n.left);
			getSmallestFromRight(n.right);
			
		
	}
}
