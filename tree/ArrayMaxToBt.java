package tree;

import base.CreateBSTree;
import base.CreateTree;
import base.Node;

public class ArrayMaxToBt {
	
	/**
	 * Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    / 
     2  0   
       \
        1
	 */
	
	public static void main(String[] args) {
		int s[]= {3,2,1,6,0,5};
		Node n=arrToBt(s,0,5);
		CreateBSTree c= new CreateBSTree();
	Node n2=	c.createTree6();
		print(n);
		System.out.println("--");
		print(n2);
	}
	
	// 0 5 
	static Node  arrToBt(int arr[], int st, int en) {
	if(st>en||en<st||st<0||st>arr.length-1||en<0||en>arr.length-1) return null;
	int i=	getBiggest(arr,st,en);
	 Node n=new Node(arr[i]);
	 
	 n.left=arrToBt(arr,st,i-1);
	 n.right=arrToBt(arr,i+1,en);
	return n;
	}
	
 static	int getBiggest(int arr[], int st, int en){
	 int max=Integer.MIN_VALUE;
	 int pos=Integer.MIN_VALUE;
	 for(int i=st;i<=en;i++) {
		 if(arr[i]>max) {
			 max=arr[i];
			 pos=i;
		 }
	 }
	
	return pos;
	}
	
	
	
 public static void print(Node n){
		if(n==null) return;
		
		System.out.println(n.id);
		
		print(n.left);
		
		print(n.right);	
	}
	
	
	
	
}
