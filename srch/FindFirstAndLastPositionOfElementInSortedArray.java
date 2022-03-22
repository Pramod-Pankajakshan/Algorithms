package srch;

import java.util.*;

/*
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
/**
 * Given an array of integers nums sorted in ascending order, find the starting
 * and ending position of a given target value.
 * 
 * If target is not found in the array, return [-1, -1].
 * 
 * Follow up: Could you write an algorithm with O(log n) runtime complexity?
 * Example 1:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
 * 
 * @author pramod
 * 
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

	public static void main(String args[]) {
		FindFirstAndLastPositionOfElementInSortedArray f= new FindFirstAndLastPositionOfElementInSortedArray();
		int g[]=f.searchRange(new int[] {5,7,7,8,8,10},8);
         System.out.print(g[0]);System.out.println("&"+g[1]);
	}

	
			public int[] searchRange(int[] nums, int target) {
				int res[] = { -1, -1 };
				if (nums.length == 0)
					return res;
				int left = binarySearch(nums, target - 0.5);
				int right = binarySearch(nums, target + 0.5);
				if (right - left == 0)
					return res;
				res[0] = left;
				res[1] = right - 1;
				return res;
			}

			private int binarySearch(int[] arr, double target) {
				int left = 0;
				int right = arr.length - 1;
				while (left <= right) {
					int mid = (left + right) / 2;
					if (arr[mid] > target)
						right = mid - 1;
					else if(arr[mid] < target)
						left = mid + 1;
				}
				return left;
			}
		
}

