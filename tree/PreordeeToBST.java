package tree;

import java.util.Stack;

import base.CreateBSTree;
import base.Node;

public class PreordeeToBST {
//only preordr to bst not bt
static int[] preorderarray={6,3,1,5,9,7,10};

//static int[] preorderarray={6,3,1,5,9,7,10};
static Node preordertobst(Node n){	
	Stack<Node> s= new Stack<Node>();
     int count=1;
     Node temp=null;
     Node root=new Node(preorderarray[0]);
     s.push(root);
     // 2 while loops
	while(count<preorderarray.length){	
			// find where we can attach the big number  
			while((s.size()>0&&preorderarray[count]>s.peek().id)){ //3) now pop till 3 we get 3 as temp
				 temp=  s.pop();
			}
			if(temp!=null){// founf where to attach big number to right
				temp.right=new Node(preorderarray[count]);
				s.push(temp.right);
			}else{//else add small number to  left and push it
			s.peek().left=new Node(preorderarray[count]);//1) - 3 added - 2) -1 added 
			s.push(s.peek().left);
		}		
		count=count+1;
		}
	return root;
}





public static void print(Node n){
	if(n==null) return;
	print(n.left);
	System.out.println(n.id);
	print(n.right);
	
	
}
/**
*			( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
*/
public static void main(String[] args) {
CreateBSTree e= new CreateBSTree();
print(preordertobst(e.createTree6()));
System.out.println("================");
int[] i1={1,3,5,6,7,9,10};


}

}
