package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import base.CreateBSTree;
import base.Node;
//iteratively
public class MaximumElement {//node before subtrees

	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree();
		int ans=new MaximumElement().getMaxx(node);
		System.out.println(ans);
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
	
	int getMax(Node n){
		int max=Integer.MIN_VALUE;
		if(n==null) return 0;
		int left=getMax(n.left);
		int right=getMax(n.right);
		if(left>right){
			if(left>max) max=left;
		}else{
			if(right>max) max=right;
		}
		max=max>n.id?max:n.id;
		return max;
	}
	
	int getMaxx(Node n){
		Stack<Node> stack= new Stack<Node>();
		int max=0;
		while(true){
			while(n!=null){
				stack.push(n);
			n=n.left;
			}
		 if(stack.isEmpty()) break;
		  n=stack.pop();// same n same n
		 if(n.id>max)max=n.id;
		 n=n.right;
		}
		return max;
	}
		
		
		
	
	
}
