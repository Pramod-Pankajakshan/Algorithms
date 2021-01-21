package leetcode;

import java.util.Stack;

/**
 * 
 * Input: ["2", "1", "+", "3", "*"]
 * ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
	Output: 9
	Explanation: ((2 + 1) * 3) = 9
 * @author pramod
 *
 */
public class ReversePolish {
   
public static void main(String[] args) {
	String[] rpp= new String []{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
	evalRPN(rpp);
}


public static int evalRPN(String[] tokens) {
    
    Stack<Integer> st= new Stack<>();
    for(String s:tokens){
        if(isNumber(s)){
            System.out.println("inserting ->"+s);
          st.push(Integer.parseInt(s));
        }else{
          int b=st.pop() ;
          int a=st.pop() ;
          int r = action(s,a,b);
          st.push(r);
        }
    }
    return st.pop();
}

static int  action(String sym, int a, int b){
    if(sym.equals("*")){
        return a*b;
    }else if(sym.equals("-")){
        return a-b;
    }else if(sym.equals("+")){
        return a+b;
    }else if(sym.equals("/")){
        return a/b;
    }
    return 0;
}
static boolean  isNumber(String s){
return   s.matches("^-?[0-9]*$");
}


 private static void rp(String []in) {
	 Stack<String> s = new Stack<>();
	 for(String c:in) {
		 if(isNumber(c)) {
		   s.push(c);	
		 }else {
		   popMe(s,c);
		 }
		   
		 
	 }
	 System.out.println(s.peek());
	 // push to stack
	 // when symbol found - 
	 // pop 2
	 // call function for that
	 // push to stack
 }
 


 private static Stack<String> popMe(Stack<String> s, String sym){
	 int i=Integer.valueOf(s.pop());
	 int j=Integer.valueOf(s.pop());
	 if(sym.equals("+")) {
		 s.push(""+(i+j));
	 }else if(sym.equals("*")) {
		 s.push(""+(i*j));
	 }
	return s;
	 
 }
}




