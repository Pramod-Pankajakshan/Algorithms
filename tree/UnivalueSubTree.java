package tree;

import java.util.*;


public class UnivalueSubTree {

	public static void main(String args[]) {

		countUnivalSubtrees(null);

	}

	 public static int countUnivalSubtrees(TreeNode root) {
	        
	       
	        if(root==null) return 0;
	       countUnivalSubtrees1(root,root.val);
	       return c;
	    }
	 static int c=0;
	    public static boolean countUnivalSubtrees1(TreeNode root, int pval) {
	        if(root==null) return true;     
	        
	       boolean l= countUnivalSubtrees1(root.left,root.val);
	       boolean r= countUnivalSubtrees1(root.right,root.val);
	         if(l&&r){
	             c++;
	             return (root.val==pval);
	        }
	        return false;
	    }
}

