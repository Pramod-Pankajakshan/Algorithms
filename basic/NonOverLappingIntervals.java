package leetcode;

import java.util.*;

// same as total -overlapping 
public class NonOverLappingIntervals {

	public static void main(String args[]) {

		eraseOverlapIntervals();

	}
// NonOverLappingIntervals
	//{all intervals} - {max compatible intervals} = minimum deleted intervals
	 public int eraseOverlapIntervals(Interval[] intervals) {
	        Arrays.sort(intervals, Comparator.comparingInt(i -> i.end));
	        int max = 0, lastend = Integer.MIN_VALUE;
	        for (Interval in : intervals) {
	            if (lastend <= in.start) {
	                lastend = in.end;
	                max++;
	            }
	        }
	        return intervals.length - max;
	    }
	
}

