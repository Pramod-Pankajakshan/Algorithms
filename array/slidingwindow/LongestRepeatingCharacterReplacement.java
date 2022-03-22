package array.slidingwindow;

import java.util.*;


public class LongestRepeatingCharacterReplacement {

	public static void main(String args[]) {

		fn("AABABBA",1);

	}

	private static void fn(String input,int k) {
	int[] count= new int[26];int st=0; int mostFreqLetter=0; int max=0;
	for(int en=0;en<input.length();en++) {
		count[input.charAt(en)-'A']=count[input.charAt(en)-'A']+1;
		mostFreqLetter=Math.max(mostFreqLetter,count[input.charAt(en)-'A'] );
		int lettersToChange =en-st+1-mostFreqLetter;
		if(lettersToChange>k) {
			count[input.charAt(st)-'A']=count[input.charAt(st)-'A']-1;
			st++;
		}
		max = Math.max(max, en - st + 1);
	}
		
	System.out.println(max);
	
	}
}

