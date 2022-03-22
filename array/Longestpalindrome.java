package array;

import java.util.HashMap;


public class Longestpalindrome {

	
	public static void main(String[] args) {
	System.out.println(9/10);
		Longestpalindrome s= new Longestpalindrome();
		
		System.out.println(s.longestPalindrome("dsmalayalamdredd"));
		
	}
	// aba and abba 
	public String longestPalindrome(String inputstring) {
		if (inputstring.isEmpty()) {
			return null;
		}	 
		if (inputstring.length() == 1) {
			return inputstring;
		}	 
		String longest = inputstring.substring(0, 1);
		//start from 0th char to end
		// call helper twice
		for (int i = 0; i < inputstring.length(); i++) {
			// get longest palindrome with center of i
			String tmp = helper(inputstring, i, i);// same i
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}	 
			// get longest palindrome with center of i, i+1
			tmp = helper(inputstring, i, i + 1);// i and i+1 
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}	 
		return longest;
	}
	 
	// Given a center, either one letter or two letter, 
	// Find longest palindrome
	public String helper(String inputstring, int begin, int end) {
		System.out.println(inputstring+"-"+begin+"-"+end);
		while (begin >= 0 && end <= inputstring.length() - 1
				&& inputstring.charAt(begin) == inputstring.charAt(end)) {
			begin--;
			end++;
		}
		return inputstring.substring(begin + 1, end);
	}
	
	
	
}
