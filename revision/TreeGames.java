package revision;

import java.util.LinkedList;
import java.util.Queue;

import base.CreateBSTree;
import base.Node;


public class TreeGames {
	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		new TreeGames().performLevelOrder(node);
	}

	//level order - use queue
  private void performLevelOrder(Node n) {
		Node temp=null;
		LinkedList<Node> queue= new LinkedList<Node>();
		queue.add(n);
		while(true){
			Node nq=queue.poll();		
		   System.out.println(nq.id);
		   if(nq.left!=null)
			   queue.add(nq.getLeft());
		   if(nq.right!=null)
			   queue.add(nq.getRight());
	    }
	
}
  
   public void performLevelOrder1(Node n){		
		LinkedList<Node> queue= new LinkedList<Node>();
		queue.add(n);		
		while(true){
		Node f=queue.pop();//poll
		System.out.println(f.getUniqueId());		
		if(f.left!=null){
			queue.add(f.left);
		}
		if(f.right!=null){
			queue.add(f.right);
		}
		}
	}
}
