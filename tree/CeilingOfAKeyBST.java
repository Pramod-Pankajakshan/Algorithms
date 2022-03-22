package tree;

import base.CreateBSTree;
import base.CreateTree;
import base.Node;

public class CeilingOfAKeyBST {

static int diff=Integer.MAX_VALUE;
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		int ceil=ceil(node,2);
		System.out.println("---"+ceil);
	}
	/**
	 * int Ceil(node *root, int input)
{
    // Base case
    if( root == NULL )
        return -1;
 
    // We found equal key
    if( root->key == input )
        return root->key;
 
    // If root's key is smaller, ceil must be in right subtree
    if( root->key < input )
        return Ceil(root->right, input);
 
    // Else, either left subtree or root has the ceil value
    int ceil = Ceil(root->left, input);
    return (ceil >= input) ? ceil : root->key;
}
	 * @param n
	 * @param in
	 * @return
	 */
	static int ceil(Node n,int in){
		if(n==null) return -1;		
		if(n.id==in) 
			return n.id;		
		if(n.id<in) 
			return ceil(n.right,in);		
		int c=ceil(n.left,in);		
		return (c>=n.id)?c:n.id;
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
* @return
*/
//	static int ceil=0;
//	//key =4 
//	static void ceil(Node n,int key){
//		if(n==null) return ;
//		if(key==n.id) {
//			ceil=key;
//			return;
//		}
//		if(n.id>key&&n.id -key<diff){
//			diff=n.id-key;
//			ceil=n.id;			
//		}
//		
//		if(key<n.id){			
//		    ceil(n.left,key);
//	    }else{	    	
//			ceil(n.right,key);
//		}
//	}
}
