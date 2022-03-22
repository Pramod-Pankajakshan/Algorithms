package tree;

import java.util.LinkedList;
import java.util.Queue;

import base.CreateBSTree;
import base.Node;

public class QuickRevision {
	
	public static void main(String[] args) {
		CreateBSTree c= new CreateBSTree();
		QuickRevision q=new QuickRevision();
		Node n2=c.createTreeNotCom();Node n=c.createTree6();
		int h[]=new int[10];
		//q.printAncestor(n,h,0);
		System.out.println(q.sizeOfTree(n));
		System.out.println(q.heightOfTree(n,0));
		System.out.println(q.identicalTrees(n,n2));
		q.levelOrder(n);
	}
	//63159710
	public static void print(Node n){
		if(n==null) return;
		
		print(n.left);		
		print(n.right);
		System.out.println(n.id);
		
	}

	int g=1;
	void printAncestor(Node n,int []p,int l){
		if(n==null) return;
		p[l]=n.id;
		if(n.id==g){ print(p);}
		printAncestor(n.right,p,l+1);
		printAncestor(n.left,p,l+1);
		
	}
	
	void print(int h[]){
		for(int g:h)System.out.println(g);
	}
	
	int sizeOfTree(Node n){
		if(n==null) return 0;		
		return sizeOfTree(n.left)+1+sizeOfTree(n.right);
	}
	
	int heightOfTree(Node n,int h){
		if(n==null) return 0;
		System.out.println(n.id);
		return 1+Math.max(heightOfTree(n.left,h),heightOfTree(n.right,h));
	}
	
	boolean identicalTrees(Node n1,Node n2){
		boolean d=false;
		if(n1==null&&n2==null) return true;
		if(n1!=null&&n2==null) return false;
		if(n1==null&&n2!=null) return false;
		if(n1!=null&&n2!=null) {
			 d= n1.id==n2.id;
		}
		boolean l=identicalTrees(n1.left,n2.left);
		boolean r=identicalTrees(n1.right,n2.right);
		return d&l&r;
	}
	
	
	public Node mirror(Node n){
		if(n==null)return null;
		mirror(n.left);
		mirror(n.right);
		Node temp=n.right;
		n.right=n.left;
		n.left=temp;		
		return n;		
	}
	
	
	public void levelOrder(Node n){
		Queue<Node> q= new LinkedList<Node>();
		q.add(n);
		while(true){
			int counter=q.size();			
			if(counter==0) break; 
			while(counter>0){
				Node n1=q.poll();	
				System.out.println(n1.id);				
				if(n1.left!=null)
					q.add(n1.left);
				if(n1.right!=null)
					q.add(n1.right);				
				counter--;
			} 
		}
	}
	
	public void doLevel(Node n){
		
		Queue<Node> q= new LinkedList<Node>();
		q.add(n);
		
		while(true){			
			int c=q.size();	
			if(c==0) return;
			while(c>0){
				Node n1=q.poll();
				System.out.println(n1.id);
				if(n1.left!=null){
					q.add(n1.left);
				}
				if(n1.right!=null){
					q.add(n1.right);
				}
				c--;
			}
		}

		
	}
	
}
