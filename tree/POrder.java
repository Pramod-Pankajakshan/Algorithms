package tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import base.CreateBSTree;
import base.Node;
import base.PrintTree;

public class POrder {//node before subtrees
    
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		POrder p=new POrder();
		p.preorder(node);p.preorder2(node);
//		LinkedList<Integer> ln= new LinkedList<Integer>();
//		ln.add(1);ln.add(2);ln.add(3);ln.add(4);
//		ln.add(5);ln.add(6);ln.add(7);//ln.add(8);
//		new POrder().linkedListToBT(ln);
//		System.out.println("sss");
//		new PrintTree().printNode(nw);
//		Node op=p.wrap(node);
//		new PrintTree().printNode(op);
	} 
	
	static Node nw;
	/**
	*			( 6 )
	*	       /     \
	*	    __/       \ _
	*	  ( 3 )        ( 9 )
	*     /  \         / \ 
	*  __/    \ _     /   \
	* ( 1 )  ( 5 ) ( 7 )  ( 10 )
	* 
	* @return
	*/
    /**
     * op must be  - pre order 63159710
     * @param n
     */
	public void preorder(Node n) {
		Stack<Node> stack = new Stack<Node>();
		while (true) {
			while (n != null) {
				System.out.println(n.id);
				stack.push(n); // first push all left nodes to stack
				n = n.left;
			}
			if (stack.isEmpty())
				break; // exit condition
			n = stack.pop();// left end pop and print and n=n.right
			n = n.right;
		}
	}
	
	private void preorder2(Node n) {
		if(n==null) return;		
		System.out.println("-"+n.id);
		preorder(n.left);
		preorder(n.right);
	}

	/** USE STACK AND SAME N EVERYWHREE
	 * preorder and inorder traversal of tree
	 * @param n
	 */
     public void inorder(Node n){		
		Stack<Node> stack= new Stack<Node>();
		while(true){			
					while(n!=null){
							//System.out.println(n.uniqueId);
							stack.push(n); //first push all left nodes to stack 
							n=n.left;
					}
		if(stack.isEmpty()) break; //exit condition
					
		n=stack.pop();//same n
    		System.out.println(n.id);//print here
		n=n.right;
		}			
	} 	
     	//   1
		// 2  3
		//4 5  67

     public void postorder(Node n){
 		Stack<Node> s= new Stack<Node>();
 			    do{//push right and current
 				    // then change n to n=left
	 				while(n!=null){
	 					if(n.right!=null){//push right
	 						s.push(n.right);
	 					}
	 					s.push(n);//push n
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
 			}while(!s.isEmpty());
 		
 	} 	
     
     	//   1
		// 2  3
		//45  67
     //get the list, iterate it one for left and agin for right push to q.
     public void linkedListToBT(LinkedList<Integer> input){
    	 Iterator<Integer> inIter=input.iterator(); 
    	 Queue<Node> q= new LinkedList<Node>();
	 		while(inIter.hasNext()){
	 			Integer i= inIter.next();
			 		if(q.size()==0){
			 				nw=new Node(i);
			 				q.add(nw);
			 				continue;
			 		}
	 			Node n= q.poll();
	 			n.left=new Node(i);
	 			q.add(n.left);
	 			if(inIter.hasNext()){
	 			n.right= new Node (inIter.next());
	 			q.add(n.right);
	 			} 				 			
	 		}
 	}
     
     //we need a return object as we are changing the mapping
     
     Node removeNodesNotInRange(Node n,int min,int max){
    	 
    	 if(n==null) return null;    	 
    	 n.left=removeNodesNotInRange(n.left,min,max);
    	 n.right=removeNodesNotInRange(n.right,min,max);
    	 
    	 if(n!=null&&min>n.id){
    		 n=n.right;
    	 }
    	 if(n!=null&&max<n.id){
    		n=n.left; 
    	 }
    	 
    	 return n;
     }
     
     //Convert a given Binary Tree to Doubly Linked List 
     /**
			( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
* 
* @return
*/
     public Node  wrap(Node n){
    	  n=treetoDll(n);
    	  
    	 while(n.left!=null) n=n.left;
    	 
    	 return n;
     }
     
     Node treetoDll(Node n){
    	 if(n==null) return null;    	
    	//1) 
    	 if(n.left!=null){
    		Node left= treetoDll(n.left);
    		 
    		while(left.right!=null){//** left.right
    			left=left.right;
    		}
    		 
    		 left.right=n;
    		 n.left=left;
    	 
    	 }
    	 //2)
    	 if(n.right!=null){
     		Node right= treetoDll(n.right);
     		 while(right.left!=null) {
     			 right=right.left;
     		 }
     		right.left=n;
     		 n.right=right;
     	 
     	 }
    	 //3)
    	 return n;
     }

 	public void test(Node n){		
		Stack<Node> stack= new Stack<Node>();Stack<Node> stack1= new Stack<Node>();
		while(true){			
					while(n!=null){
							System.out.println(n.id);
							stack.push(n); //first push all left nodes to stack 
							stack1.push(n);
							n=n.left;
					}
		if(stack.isEmpty()) break; //exit condition					
		n=stack.pop();//left end pop and print and n=n.right		
		n=n.right;
		}
		System.out.println("====");
		int anc=7;
		while(!stack1.isEmpty()){
			Node n2=stack1.pop();
			if(n2.left!=null&&n2.left.id==anc||n2.right!=null&&n2.right.id==anc){
				anc=n2.id;
				System.out.println(n2.id);
			}
		}
	} 
     
}
