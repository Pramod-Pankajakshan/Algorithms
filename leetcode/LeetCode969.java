package leetcode;

import java.util.*;

/**
 * 969. Pancake Sorting
 * 
 * Given an array of integers arr, sort the array by performing a series of
 * pancake flips.
 * 
 * In one pancake flip we do the following steps:
 * 
 * Choose an integer k where 1 <= k <= arr.length. Reverse the sub-array
 * arr[0...k-1] (0-indexed). For example, if arr = [3,2,1,4] and we performed a
 * pancake flip choosing k = 3, we reverse the sub-array [3,2,1], so arr =
 * [1,2,3,4] after the pancake flip at k = 3.
 * 
 * Return an array of the k-values corresponding to a sequence of pancake flips
 * that sort arr. Any valid answer that sorts the array within 10 * arr.length
 * flips will be judged as correct. Example 1:
 * 
 * Input: arr = [3,2,4,1] Output: [4,2,4,3] Explanation: We perform 4 pancake
 * flips, with k values 4, 2, 4, and 3. Starting state: arr = [3, 2, 4, 1] After
 * 1st flip (k = 4): arr = [1, 4, 2, 3] After 2nd flip (k = 2): arr = [4, 1, 2,
 * 3] After 3rd flip (k = 4): arr = [3, 2, 1, 4] After 4th flip (k = 3): arr =
 * [1, 2, 3, 4], which is sorted.
 * 
 * @author pramod
 *
 */

public class LeetCode969 {

	public static void main(String args[]) {

		List<Integer> result = run(new int[] { 1, 4, 2, 3 });
		result.forEach(in -> System.out.println(in));

	}

	private static List<Integer> run(int[] in) {
		// get the max
		// move max to first
		// rotate
		// reduce size & repeat
		List<Integer> result = new ArrayList<>();
		int size = in.length - 1;
		while (size > 0) {
			int max = in[0];
			int mp = 0;
			for (int i = 0; i < size; i++) {
				if (in[i] > max) {
					max = in[i];
					mp = i;
				}
			}
			if (size == mp + 1) {
				size--;
				continue;
			}
			System.out.println("-" + Arrays.toString(in));
			swap(in, mp);
			System.out.println("1flip forward" + Arrays.toString(in));
			if (mp != 0)
				result.add(mp + 1);
			swap(in, size);
			System.out.println("swap ->" + Arrays.toString(in));
			if (size != mp)
				result.add(size + 1);
			size--;
		}
		System.out.println(Arrays.toString(in));
		return result;
	}

	private static void swap(int[] in, int end) {
		int st = 0;
		int en = end;
		while (st < en) {
			int temp = in[st];
			in[st] = in[en];
			in[en] = temp;
			st++;
			en--;
		}

	}

}
