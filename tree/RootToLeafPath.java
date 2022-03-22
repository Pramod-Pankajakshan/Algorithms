package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import base.CreateBSTree;
import base.Node;

public class RootToLeafPath {
	
	public static void main(String[] args) {
		RootToLeafPath r= new  RootToLeafPath();		
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		int a[]= new int[r.getNodeCount(node)];
		r.rootToLeaf(node, a, 0);
		List<Integer> a2= new LinkedList<>();
		r.rootToLeaf2(node, a2, 0);
	}

	

	public void rootToLeaf2(Node n,List<Integer> a,int c){
		if(n==null) return;		
		int as=n.id;
		a.add(c, as);
		if(n.left==null&&n.right==null){
			print2(a);
		}
		rootToLeaf2(n.left,a,c+1);
		rootToLeaf2(n.right,a,c+1);
		a.remove(c);
	}
	
	void print2(List<Integer>a){
		int i=0;
		System.out.println(",");
		while(i<a.size()){
			if(a.get(i)!=0)
			System.out.print(a.get(i));
			i++;
		}
	}
	
	
	
	
	public void rootToLeaf(Node n,int[] a,int c){
		if(n==null) return;		
		int as=n.id;
		a[c]=as;
		if(n.left==null&&n.right==null){
			print(a);
		}
		rootToLeaf(n.left,a,c+1);
		rootToLeaf(n.right,a,c+1);
	
	}
	
	void print(int []a){
		int i=0;
		System.out.println(",");
		while(i<a.length){
			if(a[i]!=0)
			System.out.print(a[i]);
			i++;
		}
	}
	
	int getNodeCount(Node n){
		if(n==null) return 0;
		return 1+getNodeCount(n.left)+getNodeCount(n.right);
		
	}
	
}
