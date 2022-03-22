package tree;

import java.util.*;

//Given an integer n, return all the structurally unique BST's (binary search trees),
// which has exactly n nodes of unique values from 1 to n. Return the answer in any order.
public class GenerateBinaryTrees {

	public static void main(String args[]) {
		GenerateBinaryTrees g= new GenerateBinaryTrees();
		List<TreeNode> ls= g.genTreeStart(4);
		System.out.println(ls.);
	}
	
	
	 List<TreeNode> genTreeStart(int n){
			return	genTree(1,n);
			}
			

			private List<TreeNode> genTree(int st, int en){
				List<TreeNode> result= new LinkedList<>();
				if(st>en) {
		            result.add(null);
					return result;
				}		
				for(int i=st;i<=en;i++) {
					
				List<TreeNode> right=	genTree(i+1,en);
				List<TreeNode> left =	genTree(st,i-1);
					for(TreeNode tl:left) {
						for(TreeNode tr:right) {
							TreeNode main= new TreeNode(i);
							main.left=tl; main.right=tr;
							result.add(main);
						}
					}
				}
				
				return result;
			}
     
}
