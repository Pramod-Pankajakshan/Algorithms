package array;

import java.util.HashMap;

public class Stack1 {
	
	char in[]={'{','(','['};
	char []op={'}',')',']'};
	
	public static void main(String[] args) {
	String par="{(a+b)*[c]+(d)(x-y)}";	
	
	checkpara(par);
	
	}

	public static void checkpara(String in){	
		HashMap<Character, Character> imap= new HashMap<Character,Character>();
		HashMap<Character, Character> omap= new HashMap<Character, Character>();
		java.util.Stack<Character> st= new java.util.Stack<Character>();
		imap.put('{','}');
		imap.put('[',']');
		imap.put('(',')');
		omap.put('}','{');
		omap.put(']','[');
		omap.put(')','(');
	    char [] s= in.toCharArray();	
		for(int i=0;i<s.length;i++){
			if(imap.get(s[i])!=null){
				st.push(s[i]);
			}
			if(omap.get(s[i])!=null){
				if(omap.get(s[i])!=st.pop()){
					System.out.println("error");
				}
			}
		}
		if(st.size()!=0)System.out.println("error");
	}
}
