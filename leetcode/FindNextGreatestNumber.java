package leetcode;

public class FindNextGreatestNumber {


/**
 * 
 * 
 * Find next greater number with same set of digits
Given a number n, find the smallest number that has same set of digits as n and is greater than n. If x is the greatest possible number with its set of digits, then print “not possible”.

Examples:
For simplicity of implementation, we have considered input number as a string.

Input:  n = "218765"
Output: "251678"

Input:  n = "1234"
Output: "1243"

Input: n = "4321"
Output: "Not Possible"

Input: n = "534976"
Output:    "536479"
 * 
 * 
 * 
 * 
 */

	
	public static void main(String[] args) {
		String  n = "123";
		nextSmallest(String.valueOf(n).toCharArray(),n);
	}
	
	
	//WRONG 
	// get all permutations 
	
	static void nextSmallest(char[] in, String qq) {
		 int pos= in.length-1;
		int diff=Integer.MAX_VALUE;
		int ans=0;
		int q=Integer.valueOf(qq);
		while(pos>=0) {
			
			for(int i=0;i<in.length;i++) {
				
			int h =swap(pos, i ,qq.toCharArray());
			if(h==536479) {System.out.println("-------");}
			System.out.println(h);
			if(h-q>0&&h-q<diff) {
				ans=h;
				diff=h-q;
			}
			}
			pos--;
		}
		
		System.out.println(ans);
		System.out.println(diff);
		
		
	}
	
	static int swap(int a,int b, char[] arr) {
	char t= arr[a];
	arr[a]=arr[b];
	arr[b]=t;
	return Integer.valueOf(String.valueOf(arr));
	}


}
