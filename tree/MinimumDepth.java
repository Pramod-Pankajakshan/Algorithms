package tree;

import base.CreateBSTree;
import base.Node;

public class MinimumDepth {
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree();
		int ans=new MinimumDepth().minDepth2(node,0);
		System.out.println(ans);
	}

public int minDepth(Node root) {
    if (root == null) return 0;
    int L = minDepth(root.left), R = minDepth(root.right);
    return 1 + (Math.min(L, R) > 0 ? Math.min(L, R) : Math.max(L, R));
}

public static  int minDepth2(Node n, int c) {
    if(n.left==null&&n.right==null) {
    	return c;
    }
    int l=Integer.MAX_VALUE,r=Integer.MAX_VALUE;
      if(n.left!=null) {
    	 l=  minDepth2(n.left,c+1);
      } if(n.right!=null) {
     r=	  minDepth2(n.right,c+1);
      }

return Math.min(l, r);
}
}



