package tree;

import base.CreateBSTree;
import base.Node;

//http://www.geeksforgeeks.org/diameter-of-a-binary-tree/
//longest path
public class DiameterOfTree {

	public static void main(String[] args) {
		DiameterOfTree c= new DiameterOfTree();
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		System.out.println(c.diameter(node));
	}
	// 
	public int diameter(Node n){
		if(n==null) return 0;		
		//3 cases
		// root involed //left only or right only
		int rootdiameter= getHeight(n.getLeft())+getHeight(n.getRight())+1;	// height if l+r+1
		int leftDiameter=diameter(n.getLeft()); // diameter of left
		int rightDiamter=diameter(n.getRight());// diameter of right		
		int boggestofleftandright=Math.max(leftDiameter, rightDiamter);//max of both		
	return Math.max(rootdiameter, boggestofleftandright);// get biggest of left or right or combined
	}
	
	public int getHeight(Node n){
		if(n==null) return 0;
		return 1+Math.max(getHeight(n.left),getHeight(n.right));
	}
}
