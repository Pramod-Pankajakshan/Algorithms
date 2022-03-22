package tree;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;

import base.CreateBSTree;
import base.Node;

public class GoogleQn2 {//node before subtrees

	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		e.print(node);
		int s[]= new int[100];
		ArrayList<Integer> al= new ArrayList<Integer>();
		new GoogleQn2().invoke(node);
	}
	
	
/**
    	     	( 6 )
*	       /     \
*	    __/       \ _
*	  ( b )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
*    /
*    /
*    b
*    /
*    /
*    1
* 
*/

LinkedList<Node> ll= new LinkedList<>();

public void invoke(Node n) {
	ll.add(n);
	ArrayList<Node> al = new ArrayList<>();
	while(ll.size()>0) {
		
		if(ll.peek()!=null) {
			al.add(ll.peek());
		}
		findBorder(ll.pop());
	}
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i).id);
	}
}
public void findBorder(Node n) {
	
	if(n==null) return;
	if(n.left!=null&&n.left.id==0) {
		ll.add(n.left.left);
		ll.add(n.left.right);
		n.left=null;
	}
	if(n.right!=null&&n.right.id==0) {
		ll.add(n.right.left);
		ll.add(n.right.right);
		n.right=null;
	}
	findBorder(n.left);
	findBorder(n.right);
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 * https://leetcode.com/problems/delete-nodes-and-return-forest/
 */

    public List<Node> delNodes(Node root, int[] to_delete) {
        int counter=1; List<Node> ls = new ArrayList<>(); Set<Integer> set= new HashSet<>();
        for(int i:to_delete){
            set.add(i);
        }
        if(!set.contains(root.id))
        ls.add(root);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            
            while(counter>0){
                
               Node tn= q.poll();
                
                if(set.contains(tn.id)){         
                   
                    if(tn.left!=null){
                        q.add(tn.left);
                        if(!set.contains(tn.left.id))
                        ls.add(tn.left);              
                      }
                    if(tn.right!=null){
                        q.add(tn.right);
                        if(!set.contains(tn.right.id))
                        ls.add(tn.right); 
                    }
                    
                    tn.right=null; tn.left=null;
                }else{
                    
                    if(tn.left!=null)q.add(tn.left); 
                    if(tn.right!=null)q.add(tn.right);                 
                    
                }
                if(tn.right!=null&&set.contains(tn.right.id)){
                    tn.right=null;
                }
                 if(tn.left!=null&&set.contains(tn.left.id)){
                    tn.left=null;
                }
                
                counter--;
            }
            
            counter=q.size();
            
        }
        
        return ls;
    }
}














