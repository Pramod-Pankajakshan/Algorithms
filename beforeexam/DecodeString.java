package beforeexam;

import java.util.*;
/**
 *  Given an encoded string, return its decoded string.

    The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

    You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

    Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 * @author pramod
 *
 */

public class DecodeString {

	public static void main(String args[]) {
		DecodeString ds= new DecodeString();
		ds.fn("3[a2[c]]"); // 3[a2[c c[2 2c cc push cc 3[a2
		ds.fn("2[abc]3[cd]ef");
		ds.fn("3[a]2[bc]");
		
	}

	private static void fn(String input) {
		char[] ch= input.toCharArray();
		// stack
		// push the number 
		// push all till a closign bracket
		// pop till open bracket and the next number
		// keep pushing
		String hh="";String h="";String th="";
		Stack<Character> st = new Stack<>();
		for(int i=0;i<ch.length;i++) {
		//	System.out.println(hh);
			th="";
			int num=0; h="";
			if(ch[i]!=']')
			 st.push(ch[i]);
			else {
				while(true) {					
					if(Character.isDigit(st.peek())){
						num=Character.getNumericValue(st.pop());
						break;
					}
					if(st.peek()=='[') {
						st.pop();
						continue;
					}
					h=st.pop()+h;					
				}
				while(num>0) {// 3
					th=th+h; //c 2 cc 1 ccc 
					num--;
				}
				
				//System.out.println(th);
				for(char c:th.toCharArray())
				  st.push(c);
			}
			
		}
		String r="";
		while(!st.isEmpty()) {
		r=st.pop()+r;	
		}
		System.out.println(r);
		
		
		
		
	}
}

