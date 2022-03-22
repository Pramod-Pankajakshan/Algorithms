package linkedlist;

import java.util.Iterator;
import java.util.Stack;

public class QueueUsingStackTest{
	public static void main(String[] args) {
		QueueUsingStack q= new QueueUsingStack();
		q.add("1");
		q.add("2");
		q.add("3");
		System.out.println(q.peek());
		q.poll();
		q.add("4");
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
	}
}

 class QueueUsingStack {
	
	Stack<String> st= new Stack<String>(); // 1 2 3    
	
	Stack<String> st2= new Stack<String>(); ;// 4 3 2 1
	
	public void add(String s) {
		st.push(s);
		
	}

	
    public String poll() {		
    	   reverse();
      return st2.pop();   	
    	   	
    }
    
    public String peek() {	
    	      reverse();
        return st2.peek();   	
      }

    private void reverse() {
    	if(st2.isEmpty()) {// push only when already pushed one is empty
     while(!st.isEmpty()) {
    	 st2.push(st.pop());
     }
     }
    	
    }
    
}
