package array;

import java.util.Stack;

public class SmallestorLargestLeftElement {

	//start from left
	// push all and pop when small is found 
	public static void main(String[] args) {
		int []g={9,7,6,8,13,1,5,8,3,1};
		smallestLeft(g);
		System.out.println("..");
	}
	
	static void smallestLeft(int h[]){
		Stack<Integer> st= new Stack<Integer>();
		for(int i=0;i<h.length;i++){
			//
			while(!st.isEmpty()&&st.peek()>h[i]) // for BiggestSum just change > to <
			 st.pop();
			
			if(st.isEmpty()){
				System.out.println("_");
			}else{
				System.out.println(h[i]+"-----"+st.peek());
			}
			
			st.push(h[i]);
		}
		
	}


}
