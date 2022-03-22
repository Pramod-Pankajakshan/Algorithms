package beforeexam.classics;

import java.util.*;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
   Example 1:
   Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
   Output: [[1,6],[8,10],[15,18]]
   Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * @author pramod
 *
 */
public class MergeIntervals {

	public static void main(String args[]) {
		int[][]intervals = {{1,3},{1,2},{2,6},{8,10},{15,18}};
		merge(intervals);

	}

	public static int[][] merge(int[][] in) {
        Arrays.sort(in, (a, b) -> Integer.compare(a[0], b[0])); // to remember
	         List<int[]> ls= new ArrayList<>();
	        int max=in[0][1];int min= in[0][0];
	        for(int i=1;i<in.length;i++){                        
	           if(in[i][0]<=max) {
	        	    max=Math.max(max,in[i][1]);
	           }else {
	        	 	ls.add(new int[] {min,max});
	        	 	min=in[i][0];max=in[i][1];
	        	 	}
	           }
	        ls.add(new int[] {min,max});
	        
	        
	        for(int[] r:ls) System.out.println(r[0]+"-"+r[1]);
	        
	        return ls.toArray(new int[ls.size()][]); // to remember
	    }
}

