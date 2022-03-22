package matrix;

import java.util.*;


public class SubMatricesWithOnes {

	public static void main(String args[]) {
		int mat[][]= new int [][]{
			 {0, 0, 0, 0, 1},
			 {0, 1, 0, 0, 0},
			 {0, 1, 1, 0, 0},
			 {0, 1, 1, 0, 0}};
		fn(mat);

	}


	
	
	private static int fn(int[][] mat) {
		//
		
		 int m = mat.length;
	        int n = mat[0].length;
	        int count = 0;
	        // for each position 
	        for (int i=0; i<m; i++) {
	            for (int j=0; j<n; j++) {
	                count += helper(mat, i, j);
	            }
	        }
		System.out.println(count);
		return count;
	}
	 // mathc - count all 1s from each position
      static int helper(int[][] mat, int crow, int ccol) {
        
	    	  int m = mat.length;
		  int n = mat[0].length;
	        int count = 0;
	        int bound = n;
	        // the logic is simple
	        // every row has unique set of rectangles - there cannot be dupes
	        // keep doing it for each row, row ++
	        
	        for (int i=crow; i<m; i++) {
	            for (int j=ccol; j<bound; j++) { // CR
	                if (mat[i][j]==1) count += 1;
	                else bound = j;//when u find a 0 then thats the limit
	            }
	        }
	        System.out.println(crow+"--"+ccol+"="+count);
	        return count;

    }
	
	
}

/**
Given a rows * columns matrix mat of ones and zeros, return how many submatrices have all ones.



Example 1:

Input: mat = [[1,0,1],
              [1,1,0],
              [1,1,0]]
Output: 13
Explanation:
There are 6 rectangles of side 1x1.
There are 2 rectangles of side 1x2.
There are 3 rectangles of side 2x1.
There is 1 rectangle of side 2x2. 
There is 1 rectangle of side 3x1.
Total number of rectangles = 6 + 2 + 3 + 1 + 1 = 13.
**/