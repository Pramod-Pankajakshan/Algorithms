package tree;

import base.Node;

public class TreefromSortedArray {
	
	public static void main(String[] args) {
		int g[]={1,2,3,4,5,6};
		TreefromSortedArray t= new TreefromSortedArray();
		Node n=t.createTree(g,0,5);
		t.print(n);
	}
	
	public void print(Node n){		
		if(n==null) return ;
		 print(n.getLeft());			
		 print(n.getRight());
		 System.out.println("-"+n.getId());	
		 }
	
   Node createTree(int h[], int start,int end){
	  
	   if(start>end) return null;
	  
	   int mid=(start+end)/2;
	   
	    Node n=new Node(h[mid]);
	    n.left=createTree(h,start,mid-1);
	    n.right=createTree(h, mid+1, end);
	   
	   return n;
	}

   public static class Node{
		public int id;

		public Node(int uid){
			this.id=uid;
		}
		
			
	    public 	Node right;
		
		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node left;

		public int getId() {
			return id;
		}
	

	}
   
   
}
