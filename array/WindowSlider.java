package array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
// get the largest in a given window
public class WindowSlider {
	// Slide the window using dequeue
	public static void main(String[] args) {
		int g[]={4,2,3,1,7,4,8,7,3,5,2,3,2,7,5,9};
		WindowSlider ws= new WindowSlider();
		ws.slide(g,5);
	}
	static void slide(int[]h,int k){
		
		Deque<Integer> dq= new LinkedList<Integer>();
		
		for(int i=0;i<k;i++){
			while(dq.size()>0&&h[dq.getLast()]<h[i])// step 2 remove if small
             dq.removeLast();
			
			dq.addLast(i);// step 1 - add to bottom
		}
		System.out.println(h[dq.getFirst()]);
		
		for(int i=k;i<h.length;i++){
			
			Iterator<Integer> s= dq.iterator();
			while(s.hasNext()){
				if(s.next()<=i-k) //less than or equal to
					s.remove();
			}
			
			while(dq.size()>0&&h[dq.getLast()]<h[i])
             dq.removeLast();
			
			dq.addLast(i);
			
			System.out.println(h[dq.getFirst()]);
		}
		
	
	}
	
	
	
	
	
	private int[] slide1(int []arr, int size) {// 10 and 3
	int n = arr.length;
	int[] r = new int[n-size+1];// 
	int ri = 0;
	// store index
	Deque<Integer> q = new ArrayDeque<>();
	for (int i = 0; i < arr.length; i++) {
		// remove numbers out of range k
		while (!q.isEmpty() && q.peek() < i - size + 1) {
			q.poll();
		}
		// remove smaller numbers in k range as they are useless
		while (!q.isEmpty() && arr[q.peekLast()] < arr[i]) {
			q.pollLast();
		}
		// q contains index... r contains content
		q.offer(i);
		if (i >= size - 1) {
			r[ri++] = arr[q.peek()];
		}
	}
	return r;
}
	

}
