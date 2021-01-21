package dynamic;

import java.util.*;


public class MinimumWindowSubSequence {

	public static void main(String args[]) {

		minWindow( "abcdebdde",  "bde");

	}
	/**      a  b  c  d  e  b  d  d  e
	 * [[ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
	 *  b[0, 0, 2, 2, 2, 2, 6, 6, 6, 6], 
	 *  d[0, 0, 0, 0, 2, 2, 2, 6, 6, 6],
	 *  e[0, 0, 0, 0, 0, 2, 2, 2, 2, 6]]
	 *  Have a row with positions
	 *  carry forward  i-1 j-1
	 *  else 
	 */
	public static String minWindow(String S, String T) {
	    int m = T.length(), n = S.length();
	    int[][] dp = new int[m + 1][n + 1];
	    for (int j = 0; j <= n; j++) { //[[ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
	        dp[0][j] = j + 1;
	    }
	    for (int i = 1; i <= m; i++) {
	        for (int j = 1; j <= n; j++) {
	            if (T.charAt(i - 1) == S.charAt(j - 1)) {
	                dp[i][j] = dp[i - 1][j - 1];
	            } else {
	                dp[i][j] = dp[i][j - 1];
	            }
	        }
	    }
         int start = 0, len = n + 1;
	    for (int j = 1; j <= n; j++) {
	        if (dp[m][j] != 0) {// check last row thats it
	            if (j - dp[m][j] + 1 < len) {
	                start = dp[m][j] - 1;
	                len = j - dp[m][j] + 1;
	                System.out.println(S.substring(dp[m][j]-1,j));
	            }
	        }
	    }
	    return len == n + 1 ? "" : S.substring(start, start + len);
	}
}


