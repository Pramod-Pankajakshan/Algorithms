package stack;

import java.util.Stack;

public class CopyofReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        reversestack(stack);

        for (int i = 0, n = stack.size(); i < n; i++) {
            System.out.println(stack.elementAt(i));
        }
    }

   static void reversestack(Stack s){
	   if (s.isEmpty()) {
           return;
       }
	   Object o=popbottom(s);
	   reversestack(s);
	   s.push(o);
	   
   }
    
   
   static Object popbottom(Stack s){
	   Object top=s.pop();  
	   
	   if(s.isEmpty()){
		   return top;
	   }else{	   
		   Object bottom= popbottom(s);
		   s.push(top);
		   return bottom;
	   }
	   
   }
    
}