package string;

import java.util.*;

public class LongestSubStringWithNoRepeatChars {

	
	
	public static void main(String[] args) {		
		String h="ABCDSQCFGFHASJKIALC";
		int i=lengthOfLongestSubstring(h);
		System.out.println(i);
	}
	
	// for eg - abcdefa - slide window and when we see a dupe remove first
	
	 public static int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        Set<Character> set = new HashSet<>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {	           
	            if (!set.contains(s.charAt(j))){	           
	                set.add(s.charAt(j++));	                
	                ans = Math.max(ans, j - i);
	            } else {
	                set.remove(s.charAt(i));
	                i++;
	            }
	        }
	        return ans;
	    }
}
