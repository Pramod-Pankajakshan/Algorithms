package leetcode;

import java.util.*;

/**
 * 
 * We are given hours, a list of the number of hours worked per day for a given
 * employee.
 * 
 * A day is considered to be a tiring day if and only if the number of hours
 * worked is (strictly) greater than 8.
 * 
 * A well-performing interval is an interval of days for which the number of
 * tiring days is strictly larger than the number of non-tiring days.
 * 
 * Return the length of the longest well-performing interval.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: hours = [9,9,6,0,6,6,9] Output: 3 Explanation: The longest
 * well-performing interval is [9,9,6].
 */
public class LongestWellPerformingInterval {

	public static void main(String args[]) {

		longestWPI(new int[] { 9, 9, 6, 0, 6, 6, 9, 9, 9, 9, 6, 6, 6, 6, 6, 9 });

	}
   // Keep adding up +1 or -1 and wen sum is negative push the sum -1 -2 etc to map

	public static int longestWPI(int[] hours) {
		int res = 0, sum = 0, n = hours.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; ++i) {
			sum += hours[i] > 8 ? 1 : -1;
			if (sum > 0) {
				res = i + 1;
			} else {
				map.putIfAbsent(sum, i);
				if (map.containsKey(sum - 1)) {
					res = Math.max(res, i - map.get(sum - 1));
					System.out.println("currently at ->" + i);
					System.out.println("looking for " + (sum - 1));
					System.out.println("got - " + map.get(sum - 1));
				}
			}
			printMap(map);
		}
		System.out.println(res);
		return res;
	}

	private static void printMap(Map<Integer, Integer> map) {
		map.keySet().stream().forEach(k -> System.out.println(k + "  =  " + map.get(k)));
		System.out.println("==");
	}
}
