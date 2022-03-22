package tree;

import java.util.LinkedList;
import java.util.Queue;

import base.CreateTree;
import base.Node;

public class CompleteBST {
public static void main(String arg[]){

	CreateTree ct = new CreateTree();
	
	System.out.println(isCompleteBT(ct.createTree2()));

}

/* Given a binary tree, return true if the tree is complete
else false */
static boolean isCompleteBT(Node root)
{
 // Base Case: An empty tree is complete Binary Tree
 if(root == null)
     return true;
  
 // Create an empty queue
 Queue<Node> queue =new LinkedList<>();
  
 // Create a flag variable which will be set true
 // when a non full node is seen
 boolean flag = false;
  
 // Do level order traversal using queue.
 queue.add(root);
 while(!queue.isEmpty())
 {
     Node temp_node = queue.remove();
      
     /* Check if left child is present*/
     if(temp_node.left != null)
     {
          // If we have seen a non full node, and we see a node
          // with non-empty left child, then the given tree is not
          // a complete Binary Tree
         if(flag == true)
             return false;
          
          // Enqueue Left Child
         queue.add(temp_node.left);
     }
     // If this a non-full node, set the flag as true
     else
         flag = true;
      
     /* Check if right child is present*/
     if(temp_node.right != null)
     {
         // If we have seen a non full node, and we see a node
         // with non-empty right child, then the given tree is not
         // a complete Binary Tree
         if(flag == true)
             return false;
          
         // Enqueue Right Child
         queue.add(temp_node.right);
          
     }
     // If this a non-full node, set the flag as true
     else
         flag = true;
 }
  // If we reach here, then the tree is complete Bianry Tree
 return true;
}

}



