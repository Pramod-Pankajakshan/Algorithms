package tree;

import base.Node;

public class InorderLevelOrder {
	 
	 public static void main(String args[]) {
	  int[] inOrder =    { 4, 2, 6, 5, 7, 1, 3 };
	  int[] levelOrder = { 1, 2, 3, 4, 5, 6, 7 };
	 
	  Node rootNode = constructTree(levelOrder, inOrder);
	  System.out.println(rootNode);
	 }
	 
	 private static Node constructTree(int[] levelOrder, int[] inOrder){
	  Node startNode=null;
	  return constructBinaryTree(startNode, levelOrder, inOrder, 0, inOrder.length-1);
	 }
	  
	 private static Node constructBinaryTree(Node startNode, int[] levelOrder, int[] inOrder, int inStart, int inEnd) {
	   
	  // this condition is true when no more element to work that is we reach end of left or right.
	  if(inStart>inEnd){ 
	   return null;
	  }
	 
	  // this condition is true when we are working on last element present either on left or right.
	  if(inStart==inEnd){
	   return new Node(inOrder[inStart]);
	  }
	 
	  // Finding which elements in inOrder array appear first in levelOrder array.
	  // What actually we are doing here is, picking the element from levelOrder array and 
	  // finding where that element is found in inOrder array and once found we will get to know
	  // left and right child's as well for next recursive call.
	  boolean isFound = false;
	  int index=0; // it represents the index in inOrder array of element that appear first in levelOrder array.
	  for (int i = 0; i < levelOrder.length-1; i++) {
	   int data = levelOrder[i];
	   for (int j = inStart; j < inEnd; j++) {
	    if(data==inOrder[j]){
	     startNode = new Node(data);
	     index = j;
	     isFound = true;
	     break;
	    }
	   }
	   if(isFound){
	    break;
	   }
	  }
	 
	  //elements present before index are part of left child's of startNode.
	  //elements present after index are part of right child's of startNode.
	  startNode.setLeft(constructBinaryTree(startNode, levelOrder, inOrder, inStart, index-1));
	  startNode.setRight(constructBinaryTree(startNode, levelOrder, inOrder, index+1, inEnd));
	 
	  return startNode;
	 }
	 
	}