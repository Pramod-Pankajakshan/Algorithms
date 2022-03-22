package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import base.CreateBSTree;
import base.Node;
//Given an array ‘pre[]’ that represents Preorder traversal of a spacial binary tree where every node has either 0 or 2 children.
//One more array ‘preLN[]’ is given which has only two possible values ‘L’ and ‘N’. The value ‘L’ in ‘preLN[]’ indicates that the
//corresponding node in Binary Tree is a leaf node and value ‘N’ indicates that the corresponding node is non-leaf node. Write a 
//function to construct the tree from the given two arrays.
public class BinaryTreeFromPreorderandLNArray {//node before subtrees
int g=10;boolean found;
    HashMap<Integer, Integer>  map= new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree();
		int pre[] = {10, 30, 20, 5, 15};
	    char ln[] = {'N', 'N', 'L', 'L', 'L'};
	Node n=	new BinaryTreeFromPreorderandLNArray().print(pre,ln);
	print(n);
	}
static 	public void print(Node n){
		if(n==null) return;
		print(n.left);
		System.out.println(n.id);
		print(n.right);
		
		
	}
    int  c=0; int ll=0;
	Node  print(int p[],char l[]){
		
		if(ll>l.length-1) return null;
		int temp=ll;
		Node n= new Node(p[c]);
		c=c+1;
		ll=ll+1;
		if(l[temp]=='N'){	
				
			n.left=print(p,l);
			n.right=print(p,l);
		}
		
	return n;
	}
}
