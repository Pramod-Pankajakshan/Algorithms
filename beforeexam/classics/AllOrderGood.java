package beforeexam.classics;

import java.util.*;

import base.CreateBSTree;
import base.Node;


public class AllOrderGood {

	public static void main(String args[]) {
		AllOrderGood a= new AllOrderGood();
		CreateBSTree cb = new CreateBSTree();
		//a.inorder(cb.createTree6());
		//a.preorder(cb.createTree6());
		a.postorder(cb.createTree6());
//CreateBSTree
	}
/**
	        ( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
* 
*
*/  
	private  void inorder(Node n) {
		Stack<Node> st= new Stack<>();
		while(true) {
			 while(n!=null) {
				 st.push(n);
				 n=n.left;
			 }
			if(st.isEmpty()) break;
			Node n1=st.pop();
			System.out.println(n1.id);
			n=n1.right;
			
		}
		
		
	}
	
	private  void preorder(Node n) {
		Stack<Node> st= new Stack<>();
		while(true) {
			 while(n!=null) {
				 st.push(n);
				 System.out.println(n.id);
				 n=n.left;
			 }
			if(st.isEmpty()) break;
			Node n1=st.pop();
			
			n=n1.right;
			
		}
	}
	
	//   1
	// 2  3
	//4 5  67

 public void postorder(Node n){
		Stack<Node> s= new Stack<Node>();
			    while(true){ //push right and current
				             // then change n to n=left
			    	
		 				while(n!=null){
		 					if(n.right!=null){// first push right
		 						s.push(n.right);
		 					}
		 					s.push(n);// then push n
		 					n=n.left;//n is left
		 				} 				
				n=s.pop(); 		//get the first one		
				
				if(n.right!=null&&!s.isEmpty()&&s.peek()==n.right){ //s.peek=n.right speek=nr
					s.pop();
					s.push(n);
					n=n.right;//put n=n.right 					
				}else{
					System.out.println(n.id);
					n=null;// n is null
				} 	
				
			}
		
	} 	
 
	
}

