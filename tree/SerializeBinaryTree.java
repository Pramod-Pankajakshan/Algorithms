package tree;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import base.CreateTree;
import base.Node;

public class SerializeBinaryTree {

	
	
	/**
	 * 
	 * 	      1
	 * 	   2	    3
	 * 	4	 5    6	   7
	 *           8   
	 *          9
	 * 
	 * @return
	 */
	
public static void main(String[] args) {
	CreateTree ct = new CreateTree();
	Node n=ct.createTree();
    StringBuilder sb= new StringBuilder();
	loadPreOrder(n,sb);
	System.out.println(sb.toString());
	List<String> ls=Arrays.asList(sb.toString().split("-"));
	Queue<String> q = new LinkedList<>();
	q.addAll(ls);
	Node n3= new Node();
	Node n2=readPreOrder(n3,q);
	 sb= new StringBuilder();
	loadPreOrder(n2,sb);
	System.out.println(sb.toString());
	

	
}	
 //use stringbuilder and then use N for nulls - convert sb to queue 
 static void  loadPreOrder(Node n,StringBuilder sb) {
	 
       if(n==null) {
    	   sb.append("N-");
    	   return;
       }
       sb.append(n.id+"-");
       loadPreOrder(n.left,sb);
       loadPreOrder(n.right,sb);
 }
 //somehow make it to q and set null as a string before that
 static Node readPreOrder(Node n,Queue<String> q) {
	 String v=q.poll();
	 if(v==null) return null;
	 if(v.equals("N")) {
  	    return null;
     }
	 
	 n.id=Integer.valueOf(v);
	  
	 n.left=readPreOrder(new Node(),q);
	 n.right=readPreOrder(new Node(), q);
	 return n;
 }
 
	
}
