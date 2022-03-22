package tree;

import java.util.*;


public class UniqueBST {

	public static void main(String args[]) {

		numTrees(100);

	}

	/**
	 * Intuition
Actually, as it turns out, the sequence of G(n)G(n) function results is known as Catalan number C_nC 
n
​
 . And one of the more convenient forms for calculation is defined as follows:
	 * @param n
	 * @return
	 */
		  public static int numTrees(int n) {
		    // Note: we should use long here instead of int, otherwise overflow
		    long C = 1;
		    for (int i = 0; i < n; ++i) {
		      C = C * 2 * (2 * i + 1) / (i + 2);
		    }
		    System.out.println(C);
		    return (int) C;
		  }
		
}

