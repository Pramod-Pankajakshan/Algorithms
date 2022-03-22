package tree;

import java.util.Stack;

import base.CreateBSTree;
import base.CreateTree;
import base.Node;

public class FindHalfNodes {//node before subtrees

	public static void main(String[] args) {
		CreateTree e= new CreateTree();
		Node node=e.createTree();
		new FindHalfNodes().fullNodeQ(node);
	}
	/**
	 * 
	 * 			1
	 * 	   2	    3
	 * 	4	 5    6	   7
	 *           8   
	 *          9
	 * 
	 * @return
	 */
	public Node fullNode(Node n){		
		
		if(n==null) return n;
		
		if(n.getLeft()!=null&&n.getRight()==null){
			System.out.println(n.getUniqueId());
		}
		if(n.getLeft()==null&&n.getRight()!=null){
			System.out.println(n.getUniqueId());
		}
		fullNode(n.getLeft());
		fullNode(n.getRight());	
		
	return n;
	}
	
public Node fullNodeQ(Node n){		
		
		
		
		Stack<Node> sta= new Stack<Node>();
		sta.push(n);
		while(sta.size()>0){
			if(n==null) return n;
			Node n2=sta.pop();
			if(n2.left==null&&n2.right!=null){
				System.out.println(n2.getUniqueId());
			}
			if(n2.left!=null&&n2.right==null){
				System.out.println(n2.getUniqueId());
			}
			
			if(n2.getLeft()!=null){
				sta.push(n2.getLeft());				
			}
			if(n2.getRight()!=null){
				sta.push(n2.getRight());				
			}			
		}
		
	return n;
	}
	
	
	
}
