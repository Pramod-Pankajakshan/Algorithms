package tree;

import base.CreateBSTree;
import base.Node;
// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
public class MaxDifferenceBetweenNodeAndAncestor {
	
	public static void main(String[] args) {
		MaxDifferenceBetweenNodeAndAncestor r= new  MaxDifferenceBetweenNodeAndAncestor();
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		int a[]= new int[r.getNodeCount(node)];
		r.rootToLeaf(node, node.id, node.id);
		System.out.println(absMax);
	}

	static int absMax=0;
	public void rootToLeaf(Node n,int max, int min){
		if(n==null) return;		
		max=max>n.id?max:n.id;
		min=min<n.id?min:n.id;
		
		if(n.left==null&&n.right==null){
		  absMax=absMax< max-min?max-min:absMax;
		}
		rootToLeaf(n.left,max,min);
		rootToLeaf(n.right,max,min);
	
	}
	
	void print(int []a){
		int i=0;
		System.out.println("==");
		while(i<a.length){
			if(a[i]!=0)
			System.out.println(a[i]);
			i++;
		}
	}
	
	int getNodeCount(Node n){
		if(n==null) return 0;
		return 1+getNodeCount(n.left)+getNodeCount(n.right);
		
	}
}
