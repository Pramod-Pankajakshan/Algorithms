package stack;

import java.util.Stack;

public class SortAStack {
public static void main(String arg[]){
	Stack<Integer> st = new Stack<Integer>();
	st.add(5);
	st.add(4);
	st.add(1);
	st.add(2);
	st.add(3);
	st.add(6);
	Stack<Integer> st1 = 	reverse(st);
	for(int i: st1) {
		System.out.println(i);
	}

}
// 3 2 4 5 6  - 23456
public static Stack<Integer>  reverse(Stack<Integer> in){

	Stack<Integer> st = new Stack<Integer>();
	while(!in.isEmpty()) {
		int top=in.pop();
		while(!st.isEmpty()&&st.peek()<top) // its a while - dont forget that - u need to pop till its less
			in.add(st.pop());
		
			st.add(top);
	}
	return st;
}



}



