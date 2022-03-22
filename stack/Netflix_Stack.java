package stack;

import java.util.Stack;

public class Netflix_Stack {
	
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("1");st.push("2");
		st.push("3");st.push("4");		
		
		for(int i=0;st.size()>0;i++){
			System.out.println(st.pop());
		}
	}

	
	
	public Stack<String> reverseStack(Stack<String> s){
		Stack<String> st2 = new Stack<String>();
		while(s.size()>0)
		st2.push(s.pop());		
		return st2;	
	}
	
	
	
}
