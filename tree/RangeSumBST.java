package tree;

import base.CreateBSTree;
import base.Node;

public class RangeSumBST {
	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		RangeSumBST r= new RangeSumBST();
		Node node=e.createTree6();
		//new Many().print(node);
		r.rsum(node, 6, 15);
		System.out.println(r.sum);
	}
	
	int sum=0;
	
	private void rsum(Node n, int l,int r) {
		if(n==null) return;
		if(n.id>l&&n.id<r) {
			sum=sum+n.id;
		}
		if(n.id>l||n.id<r) {
		rsum(n.left,l,r);
		rsum(n.right,l,r);		
		}
		
		
	}

}
