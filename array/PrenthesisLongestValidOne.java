package array;

import java.util.*;


public class PrenthesisLongestValidOne {
	// Given a string containing just the characters “)” and “(“, find the length of longest well formed parentheses substring.

	// input: s = "(()"
	// Output: 2, ()

	// Example 2:
	// Input: s = ")()())"
	// Output: 4 - "()()"

	// Example 3:
	// Input: s = ""
	// Output: 0

	// )(()) - 4
	// ()()

	// Input: s = "()(()()"
	// Output: 2 - "()"


	    
   public static void main(String ar[]){
	        System.out.println("(() - " + count("(()"));
	        System.out.println("(()) - " + count("(())"));
	        System.out.println("(()))()() - " + count("(()))))()()"));  
	        System.out.println("(())(() - " + count("(())(()"));   
	        System.out.println("()()() - " + count("()()()")); 
	    }
	private static int count(String s){
	    char [] ch= s.toCharArray();
	    int ct=0; 
	    Stack<Integer> st= new Stack<>();
	    st.push(-1);
	    for(int i=0;i<ch.length;i++){
	           if(ch[i]=='('){
	               st.push(i);	               
	           }else{	  
	        	     st.pop();
	             if(st.isEmpty()) {
	            	 st.push(i);
	             }else {
	            	 ct=Math.max(ct, i-st.peek());
	             }
	            	
	             }
	           }
	    
	    
	   return ct;   
	 }

	}


