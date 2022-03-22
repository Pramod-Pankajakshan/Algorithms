package stack;

import java.util.Stack;

/**
 * 
 * review
 * @author pramod
 *
 */
public class MinStack2017 {

	private final Stack<Integer> st= new Stack<Integer>();
	int min=Integer.MAX_VALUE;
 	void push(Integer item) {
 		if(item<min) min=item;
		st.push(item);
	}
	
 	Integer pop() {
 		Integer t= st.pop();
 		calculateMin(t);
      	return t;		
	}
	
 	Integer top() {
	     
		return st.peek();
		
		
	}
	
 	Integer getMin() {
		return min;
	}
	
 private void calculateMin(int t) {
	 // check if t = min;
	 // iterarte stack and get the next min;
	 int newmin=Integer.MAX_VALUE;
	 if(t==min) {
		 
		 for(int tt: st) {
			 if(newmin>tt) {
				newmin=tt;
			 }
		 }
		 min=newmin;
	 }
	 
 }
 
 
}
