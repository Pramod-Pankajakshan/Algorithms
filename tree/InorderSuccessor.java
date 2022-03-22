package tree;

import base.CreateBSTree;
import base.Node;

public class InorderSuccessor {

	public static Node successor(Node root, Node p) {
		  if (root == null)
		    return null;
		  if (root.id <= p.id) {
		    return successor(root.right, p);
		
		  } else {
			  Node left = successor(root.left, p);
		    return (left != null) ? left : root;
		  }
		}
	
	public static Node predecessor(Node root, Node p) {
		  if (root == null)
		    return null;

		  if (root.id >= p.id) {
		    return predecessor(root.left, p);
		  } else {
		    Node right = predecessor(root.right, p);
		    return (right != null) ? right : root;
		  }
		}
	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		Node n= new Node(9);	
		System.out.println(successor(node,n).id);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//if input n right is not null
	//then get minleft in right
	//else in while loop - 
	
	
	
	
	
	
	
	
	static Node insuccessr(Node root,Node n2){
		Node ans=null;	
		if(n2.right!=null){
		  return getleftmost(n2.right);
		}		
		while(root!=null){
		  if(n2.id<root.id){		
			ans=root;
			root=root.left;			
		  }else if(n2.id>root.id){
			  root=root.right;			  
		  }else{
			  break;
		  }
	     
	    }
		return ans;
	}
	
static	Node  getleftmost(Node n){
		Node l=null;
		while(n!=null){
			l=n;
			n=n.left;
		}
		return l;	
		}
		
	}
