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

public class LongestSubStringWithKDistinctChars {


	
	public static void main(String[] args) {
		longestSubStringWithKDistinctChars("sdsaabbsghj",3);
	}
	static void longestSubStringWithKDistinctChars(String k, int uniqueSize) {
		char[] in= k.toCharArray();
	int l=0;int r=0; int maxsize=0; int c=0;
	// while 
	// increase r
	// check unique size
	// if > uniquesize
	// stop
	// move left till it reaches = unique size
	// move right
	//012345678901234
	//sdsaabbsghjjjjj
		Map<Character, Integer> map = new HashMap<>();
		System.out.println(k.length());
		while(l<k.length()) {			
			if(map.size()<=uniqueSize&&r<k.length()) {
				add(map,in[r]);
				System.out.println(r+"--"+l);				
				r++; 				
			} else {
				maxsize=Math.max(r-l, maxsize);
				remove(map,in[l]);
				l++;
			}
			
		}
		System.out.println(maxsize);
		}
	
  private static void add(Map<Character, Integer> map, char val) {
	  if(!map.containsKey(val)) {
	        map.put(val, 1);			        		       
		}else {
			map.put(val, map.get(val)+1);
		}
  }

  private static void remove(Map<Character, Integer> map, char val) {
	  if(map.get(val)>1) {
			map.put(val, map.get(val)-1);			     	       
		}else {
			map.remove(val);
		}
  }

  
}
