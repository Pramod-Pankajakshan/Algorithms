package string;

import java.util.*;

/**
 * LC- 1400
 * Given a string s and an integer k. You should construct k non-empty
 * palindrome strings using all the characters in s.
 * 
 * Return True if you can use all the characters in s to construct k palindrome
 * strings or False otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "annabelle", k = 2 Output: true Explanation: You can construct two
 * palindromes using all characters in s. Some possible constructions "anna" +
 * "elble", "anbna" + "elle", "anellena" + "b" Example 2:
 * 
 * Input: s = "leetcode", k = 3 Output: false Explanation: It is impossible to
 * construct 3 palindromes using all the characters of s.
 * 
 * @author pramod
 *
 */
public class ConstructKpaliendromeStrings {

	public static void main(String args[]) {

		System.out.println(canConstruct("aabc", 4));
		System.out.println(canConstruct("aabc", 5));

	}
   // very simple trick, if number of odds<=k and k less than string length then its possible
	public static boolean canConstruct(String s, int k) {
		int odd = 0;
		int n = s.length();
		int[] arr = new int[26];

		// count number of odd chars
		for (char c : s.toCharArray()) {
			arr[c - 'a']++;
		}

		for (int i : arr) {
			if (i % 2 == 1)
				odd++;
		}

		return odd <= k && k <= n;
	}
}
/**
 * Intuition Condition 1. odd characters <= k Count the occurrences of all
 * characters. If one character has odd times occurrences, there must be at
 * least one palindrome, with odd length and this character in the middle. So we
 * count the characters that appear odd times, the number of odd character
 * should not be bigger than k.
 * 
 * Condition 2. k <= s.length() Also, if we have one character in each
 * palindrome, we will have at most s.length() palindromes, so we need k <=
 * s.length().
 * 
 * The above two condition are necessary and sufficient conditions for this
 * problem. So we return odd <= k <= n
 * 
 * 
 * Construction
 * 
 * @spjparmar immediately got a question like why this works always for all
 *            strings. He gave the some following dry runs. :) For any string
 *            with 0 odd character count , we can form k no. of palindrome
 *            strings for sure with k<=n (This is why k<=n)
 * 
 *            eg aabb, k=1| abba aabb, k=2 | aa, bb aabb, k=3 | a, a, bb aabb,
 *            k=4 | a, a, b, b
 * 
 *            For any string with odd character count <=k , we can always form k
 *            palindrome string for sure with k<=n eg2 aabbc, k=1 | aacbb aabbc,
 *            k=2 | aca, bb aabbc, k=3 | a,a, bcb aabbc, k=4 | a, a, c ,bb
 *            aabbc, k=5 | a, a, c, b, b
 * 
 *            eg3 aabc, k=1 | N/A aabc, k=2 | aba, c aabc, k=3 | aa, b, c aabc,
 *            k=4 | a, a, b, c
 * 
 *            Hope this helps somebody.
 * 
 * 
 *            Complexity Time O(N) Space O(1)
 **/
