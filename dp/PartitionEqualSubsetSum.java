package dynamic;

import java.util.*;


public class PartitionEqualSubsetSum {

	public static void main(String args[]) {
      Map<String,List<String>> np= new HashMap<>();
     // np.com
	}

	 public boolean canPartition(int[] nums) {
	        int totalSum = 0;
	        // find sum of all array elements
	        for (int num : nums) {
	            totalSum += num;
	        }
	        // if totalSum is odd,it cannot be partitioned into equal sum subset
	        if (totalSum % 2 != 0) return false;
	        int subSetSum = totalSum / 2;
	       // int n = nums.length;
	        boolean dp[][] = new boolean[nums.length + 1][subSetSum + 1];
	        dp[0][0] = true;
	        for (int i = 1; i <= nums.length; i++) {
	            int curr = nums[i - 1];
	            for (int j = 0; j <= subSetSum; j++) {
	                if (j < curr)
	                    dp[i][j] = dp[i - 1][j];
	                else
	                    dp[i][j] = dp[i - 1][j] || (dp[i - 1][j - curr]);
	            }
	        }
	        return dp[nums.length][subSetSum];
	    }
	 
	 
	 
	}


