package tree;

import java.util.ArrayList;

import base.CreateBSTree;
import base.CreateTree;
import base.Node;

///* Given two trees, return true if they are
//structurally identical */
//int identicalTrees(struct node* a, struct node* b)
//{
//   /*1. both empty */
//   if (a==NULL && b==NULL)
//       return 1;
//
//   /* 2. both non-empty -> compare them */
//   if (a!=NULL && b!=NULL)
//   {
//       return
//       (
//           a->data == b->data &&
//           identicalTrees(a->left, b->left) &&
//           identicalTrees(a->right, b->right)
//       );
//   }
//    
//   /* 3. one empty, one not -> false */
//   return 0;
//} 


public class TwoTrees {
	ArrayList<Node> d1= new ArrayList<Node>();
	ArrayList<Node> d2= new ArrayList<Node>();
	int value=Integer.MIN_VALUE;
	/**
	 * 
	 * 			1
	 * 	   2	    3
	 * 	4	 5    6	   7
	 *            
	 *         
	 * 
	 * @return
	 */

	public static void main(String[] args) {
		
		//CreateBSTree bst= new CreateBSTree();
		//Node n=	bst.createTree();
		CreateTree d= new CreateTree();
		Node n=d.createTree();Node n2=d.createTree2();
		
		TwoTrees b=new TwoTrees();		
		b.identical(n,n2);		
	}
	
	void identical(Node n,Node n2){
		
		if(n==null&&n2!=null) System.out.println("no1");
		if(n!=null&&n2==null) System.out.println("no2");
	
		if(n==null||n2==null) return;
		
		if(!(n.getUniqueId()==n2.getUniqueId())) System.out.println("no");
		
		if((n.getLeft()!=null&&n2.getLeft()==null)||
				(n2.getLeft()!=null&&n.getLeft()==null))
			System.out.println("lno");
		if((n.getRight()!=null&&n2.getRight()==null||
				(n.getRight()==null&&n2.getRight()!=null)))
			System.out.println("rno");
		
		if(n.getLeft()!=null&&n2.getLeft()!=null){
			identical(n.getLeft(),n2.getLeft());
		}
		
		if(n.getRight()!=null&&n2.getRight()!=null){
			identical(n.getRight(),n2.getRight());
		}
	
	}
	
	
}
