package array;

import java.util.*;

public class Leetcode1477 {

	public static void main(String args[]) {
		int h = minSumOfLengths();
		minSumOfLengths2();
		System.out.println(h);
	}

	/**
	 * 1477. Find Two Non-overlapping Sub-arrays Each With Target Sum 
	 * 
	 * 
	 * Share Given an array of integers arr and an integer target.
	 * 
	 * You have to find two non-overlapping sub-arrays of arr each with sum equal
	 * target. There can be multiple answers so you have to find an answer where the
	 * sum of the lengths of the two sub-arrays is minimum. Return the minimum sum
	 * of the lengths of the two required sub-arrays, or return -1 if you cannot
	 * find such two sub-arrays.
	 * 
	 */
	// create
	public static int minSumOfLengths() {
		int[] arr = { 3, 1, 1, 1, 5, 1, 2, 1 };
		int target = 3;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int sum = 0, lsize = Integer.MAX_VALUE, result = Integer.MAX_VALUE;
		hmap.put(0, -1);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			hmap.put(sum, i); // stores key as sum upto index i, and value as i.
		}
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (hmap.get(sum - target) != null) {
				lsize = Math.min(lsize, i - hmap.get(sum - target)); // stores minimum length of sub-array ending with
																		// index<= i with sum target. This ensures non-
																		// overlapping property.
			}
			// hmap.get(sum+target) searches for any sub-array starting with index i+1 with
			// sum target.
			if (hmap.get(sum + target) != null && lsize < Integer.MAX_VALUE) {
				result = Math.min(result, hmap.get(sum + target) - i + lsize); // updates the result only if both left
																				// and right sub-array exists.
			}
		}
		return result == Integer.MAX_VALUE ? -1 : result;
	}

	// Find Two Non-overlapping Sub-arrays Each With Target Sum
	public static int minSumOfLengths2() {
		int c = 0;
		int[] arr = { 3, 1, 1, 1, 5, 1, 3 };
		int target = 3;
		TreeMap<Integer, List<int[]>> tm = new TreeMap<>();
		// for loop
		// j=0
		// if sum= target
		int j = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

			while (sum > target) {
				sum = sum - arr[j];
				j++;
			}

			if (sum == target) {
				List<int[]> ls = tm.getOrDefault(i - j, new ArrayList<>());
				ls.add(new int[] { i, j });
				tm.put(i - j, ls);
			}
		}
		for (int i : tm.keySet()) {
			System.out.println(i + "->" + tm.get(i));
		}
		return c;
	}

}
