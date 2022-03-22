package tree;

import base.CreateBSTree;
import base.CreateTree;
import base.Node;

public class FindFullNodes {//node before subtrees

	public static void main(String[] args) {
		CreateTree e= new CreateTree();
		Node node=e.createTree();
		new FindFullNodes().fullNode(node);
	}
	/**
	 * 
	 * 			1
	 * 	   2	    3
	 * 	4	 5    6	   7
	 *           8   
	 *          9
	 * 
	 * @return
	 */
	public Node fullNode(Node n){		
		
		if(n==null) return n;
		fullNode(n.getLeft());
		fullNode(n.getRight());
		if(n.getLeft()!=null&&n.getRight()!=null){
			System.out.println(n.getUniqueId());
		}
			
		
	return n;
	}
	
	
	
}
