package beforeexam;

import java.util.*;


public class ApplePSAll {

	public static void main(String args[]) {

		System.out.println(reverse("How how Are HOW You are you"));

	}
	/**
	 * 	Input: "How how Are HOW You are you"
		Output: "You Are How"
		Explanation: If words are repeated, the first occurence should be considered. 
	 * @param input
	 */
	private static String reverse(String input) {
		char[] in=input.toCharArray();
		
		// start from first char & loop
		// when space is found
		// create string from stringbuilder and check in set
		// if present continue
		// else add them to beginning of result stringbuilder with space
		StringBuilder sb= new StringBuilder();
		StringBuilder fb= new StringBuilder();
		Set<String> hs= new HashSet<>();
		for(char c :in) {
			if(c!=' ') {
				sb.append(c);
			}else {
				String word=sb.toString();				
				if(!hs.contains(word.toLowerCase())){
					hs.add(word.toLowerCase());
					fb.insert(0," ");
					fb.insert(0,word);
				}
				sb=new StringBuilder();
			}
		}
		
		return fb.toString();
		
		
	}
}

