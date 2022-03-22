package tree;

import java.util.Stack;

import base.CreateBSTree;
import base.Node;

public class UberPrep {
	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		sumtree(node);
		print(node);
	}
	public static void print(Node n){
		if(n==null) return;
		print(n.left);
		System.out.println(n.id);
		print(n.right);
		
		
	}
	
	public static void inorder(Node n){		
		Stack<Node> st= new Stack<Node>();		
		while(true){			
			while(n!=null){			 
			  st.push(n);
			  n=n.left;				
			}
		if(st.isEmpty()) return;
		n=st.pop();
		 System.out.println(n.id);	
		n=n.right;
		}
		
	}
	
	public static void postorder(Node n){
		Stack<Node> st= new Stack<Node>();
		
		do{
			
			while(n!=null){
				if(n.right!=null){
					st.push(n.right);
				}
				st.push(n);
				n=n.left;
			}
			n=st.pop();			
			if(n.right==st.peek()){
				st.pop();//1
				st.push(n);//2
				n=n.right;//3
			}else{
				System.out.println(n.id);
				n=null;
			}
			
			
			
		}while(!st.isEmpty());
		
	}
	
	static 	public void rootToLeaf(Node n,int sum,int k){
		if(n==null) return;
		sum=sum+n.id;
		if(n.left==null&&n.right==null){
		if(k==sum){
			System.out.println("ok");
		}
		}		
		rootToLeaf(n.left,sum,k);
		rootToLeaf(n.right,sum,k);		
	}
	
	static int add=0;
 
	static 	public void sumtree(Node n){
	if(n==null) return;	
	sumtree(n.right);
	System.out.println(n.id);
	n.id=n.id+add;	
	add=n.id;
	sumtree(n.left);
	
}



	
}
