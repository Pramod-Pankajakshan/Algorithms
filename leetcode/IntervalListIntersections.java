package leetcode;

import java.util.*;


public class IntervalListIntersections {

	public static void main(String args[]) {
		int[][] A = new int[][]{{0,2},{5,10},{13,23},{24,25}}; int[][] B = new int[][]{{1,5},{8,12},{15,24},{25,26}};
				System.out.println(Arrays.toString(intervalIntersection(A,B)));
	}

	  public static int[][] intervalIntersection(int[][] A, int[][] B) {
		    List<int[]> ans = new ArrayList();
		    int i = 0, j = 0;

		    while (i < A.length && j < B.length) {
		      // Let's check if A[i] intersects B[j].
		      // lo - the startpoint of the intersection
		      // hi - the endpoint of the intersection
		      int lo = Math.max(A[i][0], B[j][0]);
		      int hi = Math.min(A[i][1], B[j][1]);
		      if (lo <= hi)
		        ans.add(new int[]{lo, hi});

		      // Remove the interval with the smallest endpoint
		      if (A[i][1] < B[j][1])
		        i++;
		      else
		        j++;
		    }
           System.out.println(ans);
		    return ans.toArray(new int[ans.size()][]);
		  }
}

