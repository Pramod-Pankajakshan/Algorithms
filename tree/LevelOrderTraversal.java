package tree;

import java.util.LinkedList;
import java.util.Stack;

import base.CreateBSTree;
import base.Node;
//http://www.geeksforgeeks.org/iterative-method-to-find-height-of-binary-tree/
public class LevelOrderTraversal {

	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		new LevelOrderTraversal().performLevelOrder(node);
	}
	//LEVEL - use QUEUE 
	public void performLevelOrder(Node n){		
		LinkedList<Node> queue= new LinkedList<Node>();
		queue.add(n);		
		while(!queue.isEmpty()){
		Node f=queue.pop();
		System.out.println(f.getUniqueId());		
		if(f.left!=null){
			queue.add(f.left);
		}
		if(f.right!=null){
			queue.add(f.right);
		}
		}
	}
	

}
