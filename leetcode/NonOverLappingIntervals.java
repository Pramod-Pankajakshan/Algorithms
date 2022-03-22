package leetcode;

import java.util.*;

// same as total -overlapping 
public class NonOverLappingIntervals {
	
	public static void main(String args[]) {

		eraseOverlapIntervals(new int[][] {{1,2},{2,3},{3,4},{1,3}});

	}
// NonOverLappingIntervals
	//{all intervals} - {max compatible intervals} = minimum deleted intervals
	// Trick - Gain the max intervals that can be accumulated that way we have as many intervals as possible
	 // hence total - max gives the ones to be deleted
	 public static int eraseOverlapIntervals(int[][] intervals) {
	        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));
	        Arrays.stream(intervals).map(c->c[0]+"-"+c[1]+",").forEach(System.out::print);
	        int max = 1, lastend = intervals[0][1];
	        for (int[] in : intervals) {
	            if (in[0] >=lastend  ) {
	                lastend = in[1];
	                max++;
	            }
	        }
	        System.out.println(intervals.length - max);
	        return intervals.length - max;
	    }
	
}

