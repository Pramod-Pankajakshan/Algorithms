package leetcode;

import java.util.Arrays;
import java.util.*;


/**
 * Given a non-negative integer, you could swap two digits at most once to get the maximum valued number. Return the maximum valued number you could get.

Example 1:
Input: 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
 * @author pramod
 *
 */
public class MaxSwap {

	
	public static void main(String[] args) {
		int in=2736;
		MaxSwap ms= new MaxSwap();
		System.out.println(ms.swap(in));
	}
	
	private Integer swap(int i) {
		
		Integer in= new Integer(i);
		char[] inc= in.toString().toCharArray();
		Map<Character, List<Integer>> mp = new HashMap<>();
		for(int j=0;j<inc.length;j++) {
		  List<Integer> ls=	mp.getOrDefault(inc[j], new ArrayList<Integer>());
		    ls.add(j);
			mp.put(inc[j],ls );
		}
		Arrays.sort(inc); int m=0;
		for(int c=inc.length-1;c>=0;c--) {
		 if(in.toString().toCharArray()[m]==inc[c]) {
			 m++;
		 }else {
			 inc=swaps(mp,in.toString().toCharArray(),inc[c],m);
	         break;	 
		 }
		}
		
		return Integer.valueOf(new String(inc));
	}
	private char[] swaps(Map<Character, List<Integer>> mp, char[] inc, char number, int pos) {
		
		char t= inc[pos];
		inc[pos]=number;
		int pos2=mp.get(number).get(0);
		inc[pos2]=t;
		return inc;
	}
	 
}
