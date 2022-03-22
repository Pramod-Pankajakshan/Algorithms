package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import base.CreateBSTree;
import base.Node;

public class RightViewOfTree {

    HashMap<Integer, Integer>  map= new HashMap<Integer, Integer>();

	static void printRightView(Node n){
		Queue<Node> q= new LinkedList<Node>();
		q.add(n);
		while(q.size()>0){		    
			int counter=q.size();
			int realSize=q.size();
		   while(counter>0){
			  Node nd=q.poll();
			  if(counter==1){
				  System.out.println("right view...."+nd.id);
			  }
			  if(counter==realSize){
				  System.out.println("left view........... ...."+nd.id);
			  }
			   if(nd.left!=null){
				   q.add(nd.left);
			   }
			   if(nd.right!=null){
				   q.add(nd.right);
			   }
			   counter=counter-1;
		   }
		}
		
		
		
	}
	
    
    
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();	
		print(e.createTree6());
		printRightView(e.createTree6());
	}

    static	public void print(Node n){
		if(n==null) return;
		print(n.left);
		System.out.println(n.id);
		print(n.right);
		
		
	}	
	
}
