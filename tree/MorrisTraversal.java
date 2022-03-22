package tree;

import base.CreateBSTree;
import base.Node;

public class MorrisTraversal {

	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		new Many().print(node);
		System.out.println("----");
		new MorrisTraversal().morrisTraversal(node);
		//new MorrisTraversal().print(node);
	}
	
	
	void morrisTraversal(Node n){
		Node parent=n;
		Node tmp=n;
		
		while(parent!=null){
			
			if(parent.left==null){
				System.out.println(parent.id);
				parent=parent.right;
			}else{
					tmp=parent.left;
					while(tmp.right!=null&&parent!=tmp.right) // and p not equal to tr
					tmp=tmp.right;
				
					if(tmp.right==null){ //if tr=null then tr=p and p=pl
						tmp.right=parent; 
						parent=parent.left;
					}else{                   //else print and  tr=null and p=pr
						System.out.println(parent.id);
						tmp.right=null;
						parent=parent.right;
					}
			}
			
		}
	}
	
}
