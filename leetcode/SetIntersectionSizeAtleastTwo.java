package leetcode;

import java.util.*;

/**
 * 757. Set Intersection Size At Least Two Hard
 * 
 * 
 * An integer interval [a, b] (for integers a < b) is a set of all
 * consecutive integers from a to b, including a and b.
 * 
 * Find the minimum size of a set S such that for every integer interval A in
 * intervals, the intersection of S with A has a size of at least two.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: intervals = [[1,3],[1,4],[2,5],[3,5]] Output: 3 Explanation: Consider
 * the set S = {2, 3, 4}. For each interval, there are at least 2 elements from
 * S in the interval. Also, there isn't a smaller size set that fulfills the
 * above condition. Thus, we output the size of this set, which is 3. Example 2:
 * 
 * Input: intervals = [[1,2],[2,3],[2,4],[4,5]] Output: 5 Explanation: An
 * example of a minimum sized set is {1, 2, 3, 4, 5}.
 * 
 * @author pramod
 *
 */
public class SetIntersectionSizeAtleastTwo {

	public static void main(String args[]) {
		SetIntersectionSizeAtleastTwo s = new SetIntersectionSizeAtleastTwo();
		//int[][] intervals = new int[][] { { 1, 4 }, { 1, 3 }, { 2, 5 }, { 3, 5 } };
		int[][] intervals = new int[][] { { 1, 2 }, { 2, 3 }, { 2, 4 }, { 4, 5 } };
		s.intersectionSizeTwo(intervals);
	}
// the question asks about findingthe size of an array that has at least two values  present in all the sets.
// For this i start by sorting the elements from end and then reverse sorting from start.
// Now merge and increase count by starting at first element and then moving it to next
	public int intersectionSizeTwo(int[][] intervals) {
		int res = 0;
		if (intervals == null || intervals.length == 0) {
			return res;
		}
		//if 1 is not = sort by reverse of 0 else sort by 1
		Arrays.sort(intervals, (a, b) -> a[1] != b[1] ? a[1] - b[1] : b[0] - a[0]);// sort by 1 and reverse sort by 0
		System.out.println(Arrays.deepToString(intervals));//[[1, 3], [1, 4], [3, 5], [2, 5]]
		// known two rightmost point in the set/res
		int left = intervals[0][1] - 1; // start by taking last two of first element.
		int right = intervals[0][1];
		res += 2;
		for (int i = 1; i < intervals.length; i++) {
			int[] curr = intervals[i];
			// 1. one element of the set is in the interval
			// 2. no elemnet of the set is in the interval
			if (left < curr[0] && curr[0] <= right) {
				res++;
				left = right;
				right = curr[1];
			} else if (curr[0] > right) {// nothing in common so increase to another 2
				
				res += 2;
				left = curr[1] - 1;
				right = curr[1];
			}
		}
		System.out.println("Answer-"+res);
		return res;
	}
}
