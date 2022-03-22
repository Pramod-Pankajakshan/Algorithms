package array;

import java.util.Arrays;

public class DecodeWays2 {
	public static void main(String[] args) {		
		System.out.println(numDecodings(new String("226111")));
	}

	
	static int cnt = 0;

	  public static int numDecodings(String s) {

	        if(s == null || s.length() == 0) {
	            return 0;
	        }

	        // DP array to store the subproblem results
	        int[] dp = new int[s.length() + 1];
	        dp[0] = 1;//init
	        // Ways to decode a string of size 1 is 1. Unless the string is '0'.
	        // '0' doesn't have a single digit decode.
	        dp[1] = s.charAt(0) == '0' ? 0 : 1;

	        for(int i = 2; i < dp.length; i += 1) {
	          	System.out.println(Arrays.toString(dp));
	            // Check if successful single digit decode is possible.
	            if(s.charAt(i-1) != '0') { // KEY
	               dp[i] += dp[i-1];  
	            }

	            // Check if successful two digit decode is possible.
	            int twoDigit = Integer.valueOf(s.substring(i-2, i));// KEY - i-2 
	            if(twoDigit >= 10 && twoDigit <= 26) {
	                dp[i] += dp[i-2];
	            }
	            
	        }
	      	System.out.println(Arrays.toString(dp));
	        return dp[s.length()];

	    }
	
	

}
