package tree;

import base.CreateBSTree;
import base.Node;

public class LeafCount {

	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();  
		System.out.println(leftleafCount(node,0));		
	}

	
	static int leafCount(Node n){
	 if(n==null) return 0;	
	 if(n.left==null&&n.right==null) return 1;
	
	 int l=leafCount(n.left);
	 int r=leafCount(n.right);
	
	 return l+r;
	}
	
	static int leftleafCount(Node n,int level){
		 if(n==null) return 0;	
		 if(level==1&&n.left==null&&n.right==null) return 1;
		 if(level==0) return 0; 
		 int l=leftleafCount(n.left,1);
		 int r=leftleafCount(n.right,0);
		
		 return l+r;
		}

}
