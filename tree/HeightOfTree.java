package tree;

import java.util.LinkedList;
import java.util.Queue;

import base.CreateBSTree;
import base.Node;

public class HeightOfTree {
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree();
		System.out.println(new HeightOfTree().getHeight(node));		
		System.out.println(height(node));
	}
	
	
	public static int height(Node n) {
		if(n==null) {
			return 0;
		}
		return 1+Math.max(height(n.right),height(n.left));
	}
	
	
	// or 1+ Math.max(fn(n.right), fn(n.left))
	public int getHeight(Node n){
		int height=0;
		if(n==null) return 0;
		Queue<Node> q= new LinkedList<Node>();		
		q.add(n);
		while(true){			
			int counter=q.size(); //counter is the key
			if(counter==0){
				//System.out.println(height);
				return height;
			}			
			height=height+1;
			while(counter>0){
				Node n1=q.poll();				
				if(n1.left!=null){
					q.add(n1.left);
				}
				if(n1.right!=null){
					q.add(n1.right);
				}				
				counter=counter-1;
			}
			
		}
		
		
	}

}
