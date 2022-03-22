package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode 340
Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.
 * @author pramod
 *
 */

public class LongestSubStringWithNoRepeatChars2 {


	
	public static void main(String[] args) {
		longestNonRepeatingChars("abcabcbb");
	}
	static void longestNonRepeatingChars(String k) {
		char[] in= k.toCharArray(); int l=0; int max=0;
		Map<Character,Integer> mp = new HashMap<>();
		// window
		// add position to map - increase window
		// remove from map
		// get the position of the that char
		// set that as left
		for(int r=0;r<in.length;r++) {			
			if(!mp.containsKey(in[r])) {
			 mp.put(in[r], r);						
			}else {				
				max= Math.max(r-l, max);
				int pos=mp.get(in[r]);
				l=pos+1;				
				mp.put(in[r], r);
			}
		}
		System.out.println(max);
		
         
	}

  
}
