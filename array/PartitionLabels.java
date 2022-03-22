package array;

import java.util.ArrayList;
import java.util.List;

/**
 * A string S of lowercase English letters is given. We want to partition this
 * string into as many parts as possible so that each letter appears in at most
 * one part, and return a list of integers representing the size of these parts.
 * Example 1:
 * 
 * Input: S = "ababcbacadefegdehijhklij" Output: [9,7,8] Explanation: The
 * partition is "ababcbaca", "defegde", "hijhklij". This is a partition so that
 * each letter appears in at most one part. A partition like "ababcbacadefegde",
 * "hijhklij" is incorrect, because it splits S into less parts.
 * 
 * @author pramod
 * Essence - Split a stream into many parts so that all same chars are in one group
 * - for that 
 */
public class PartitionLabels {

	public static void main(String[] args) {
		String s = "abcabefg";
		List<Integer> lst = new ArrayList<>();
		lst = partitionLabels(s);
		for (int i : lst) {
			System.out.println("---------" + i);
		}
	}
    // record  last position of each char
	// now start with first substring and find its last char - last char is the max position of a char in that substring.
	public static List<Integer> partitionLabels(String S) {
		if (S == null || S.length() == 0) {
			return null;
		}
		List<Integer> list = new ArrayList<>();
		int[] arr = new int[26]; // record the last index of the each char

		for (int i = 0; i < S.length(); i++) {
			arr[S.charAt(i) - 'a'] = i;// saved the position  - so we already know where the last one is, now splitting is as simple as 
			// last ==i
		}
		// record the end index of the current sub string
		int last = 0;int start = 0; // LAST is the last of the current substring
		for (int i = 0; i < S.length(); i++) {
			last = Math.max(last, arr[S.charAt(i) - 'a']);
			System.out.println(S.charAt(i));
			System.out.println("last>>" + last);
			if (last == i) {
				System.out.println("last==i" + last);
				list.add(last - start + 1);
				start = last + 1;
			}
		}
		return list;
	}
}
