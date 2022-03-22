package google;

import java.util.*;

/**
 * Given an array of integers nums and an integer limit, return the size of the longest non-empty subarray such that the absolute
 *  difference between any two elements of this subarray is less than or equal to limit.
 * Input: nums = [8,2,4,7], limit = 4
Output: 2 
Explanation: All subarrays are: 
[8] with maximum absolute diff |8-8| = 0 <= 4.
[8,2] with maximum absolute diff |8-2| = 6 > 4. 
[8,2,4] with maximum absolute diff |8-2| = 6 > 4.
[8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
[2] with maximum absolute diff |2-2| = 0 <= 4.
[2,4] with maximum absolute diff |2-4| = 2 <= 4.
[2,4,7] with maximum absolute diff |2-7| = 5 > 4.
[4] with maximum absolute diff |4-4| = 0 <= 4.
[4,7] with maximum absolute diff |4-7| = 3 <= 4.
[7] with maximum absolute diff |7-7| = 0 <= 4. 
Therefore, the size of the longest subarray is 2.
 * @author pramod
 *
 */
public class LeetCode1438 {

	public static void main(String args[]) {
		int[] nums= {8,2,4,7}; int lt=4;
		longestSubarray(nums,lt);
	}
	/**
	 * Given an array of integers nums and an integer limit, return the size of the longest non-empty subarray such that the absolute
	 *  difference between any two elements of this subarray is less than or equal to limit.
	 * Input: nums = [8,2,4,7], limit = 4
	Output: 2 
	Explanation: All subarrays are: 
	[8] with maximum absolute diff |8-8| = 0 <= 4.
	[2] with maximum absolute diff |2-2| = 0 <= 4.
	[2,4] with maximum absolute diff |2-4| = 2 <= 4.
	Therefore, the size of the longest subarray is 2.
	 * @author pramod
	 */	
	 public static int longestSubarray(int[] nums, int limit) {
	        PriorityQueue<Integer> minq = new PriorityQueue<>();
	        PriorityQueue<Integer> maxq = new PriorityQueue<>((a, b) -> b - a);	        
	        int i = 0,  res = 0;// 2 q's one min and other max
	                         	// if diff >limit then remove i - i and j are windoes
	                         	// else simple update result
	        for (int j=0; j < nums.length; j++) {
	            minq.add(nums[j]);
	            maxq.add(nums[j]);
	            if (maxq.peek() - minq.peek() <= limit) {
	                res = Math.max(res, j - i + 1);
	            } else {
	                while (maxq.peek() - minq.peek() > limit) {
	                    minq.remove(nums[i]);
	                    maxq.remove(nums[i]);
	                    i++;
	                }
	            }
	        }
	        System.out.println(res);
	        return res;
	    }
}

