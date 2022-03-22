package tree;

import base.CreateBSTree;
import base.Node;

public class MirrorCheck {//node before subtrees

	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree();
		System.out.println(new MirrorCheck().mirrorCheck(node,node));
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
	public boolean mirrorCheck(Node n1,Node n2){
		//pass in such a way that they must macth
	if(n1==null&&n2==null) return true;	 
	
	if(n1.id!=n2.id) return false;
	
	if(n1==null&&n2!=null||n1!=null&&n2==null) return false;
	
	return mirrorCheck(n1.left,n2.right)&&mirrorCheck(n1.right,n2.left);
	}
	
	
	public boolean isomorphic(Node n1,Node n2){
		if(n1==null&&n2==null) return true;	 
		if(n1.id!=n2.id) return false;
		if(n1==null&&n2!=null||n1!=null&&n2==null) return false;
	return isomorphic(n1.left,n2.left)||isomorphic(n1.left,n2.right) && isomorphic(n1.right,n2.right)||isomorphic(n1.right,n2.left);
	}
	
}
