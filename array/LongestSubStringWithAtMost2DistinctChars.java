package array;

import java.util.*;


public class LongestSubStringWithAtMost2DistinctChars {

	public static void main(String args[]) {

	}

	/**
	 * char array is being used
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstringTwoDistinct(String s) {
		   int[] count = new int[256];
		   int i = 0, numDistinct = 0, maxLen = 0;
		   for (int j = 0; j < s.length(); j++) { 
		      if (count[s.charAt(j)] == 0) numDistinct++; // if char array count is 0 then increase distinct count
		      		count[s.charAt(j)]++;// regular increase
		      while (numDistinct > 2) {
		         count[s.charAt(i)]--; // reverse - regular decrease
		         if (count[s.charAt(i)] == 0) numDistinct--; // reverse
		         i++;
		}
		      maxLen = Math.max(j - i + 1, maxLen);
		   }
		   return maxLen;
		}

}

