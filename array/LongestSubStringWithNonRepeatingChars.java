package array;

import java.util.HashMap;

/**
 * 
 * 
 * Given a string, find the length of the longest substring without repeating characters.

	Examples:

	Given "abcabcbb", the answer is "abc", which the length is 3.
	Given "bbbbb", the answer is "b", with the length of 1.
	Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * @author pramod
 *
 */

public class LongestSubStringWithNonRepeatingChars {


	
	public static void main(String[] args) {
		longestNonRepeatingChars("abcdecabcbbxyswqpofnmnq");
		System.out.println("....."+longest);
	}

	
	static int longest=Integer.MIN_VALUE;
	
	static void longestNonRepeatingChars(String h) {
	// to chars
		char[] sc= h.toCharArray();
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		int c=0; int len=0; int j=0;
		for(char ch:sc) {
			c=c+1;
			if(hm.get(ch)==null) { //abcdecabcbb
				hm.put(ch, c);
				len=len+1;
				if(longest<len)
					longest=len;
			}else {
				int k=hm.get(ch);
				hm.put(ch, c);
				if(j<k) {
					len=c-k;
					j=k;
				}else {
					len=len+1;
				}
				
			}
		}
	}
	
	
	


}
