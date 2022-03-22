package beforeexam;

import java.util.*;


public class MedianFromDataStream {

	public static void main(String args[]) {
		MedianFromDataStream m= new MedianFromDataStream();
		m.addNum(2);m.addNum(12);m.addNum(1);
		System.out.println(m.findMedian());
		m.addNum(5);
		System.out.println(m.findMedian());
		m.addNum(6);m.addNum(7);
       System.out.println(m.findMedian());
	}

	private PriorityQueue<Integer> reverseSmall = new PriorityQueue<>(Collections.reverseOrder());
	private PriorityQueue<Integer> large = new PriorityQueue<>();
	private boolean even = true;

	public double findMedian() {
	    if (even)
	        return (reverseSmall.peek() + large.peek()) / 2.0;
	    else
	        return reverseSmall.peek();
	}

	public void addNum(int num) {
	    if (even) {
	        large.add(num);
	        reverseSmall.add(large.poll());
	    } else {
	        reverseSmall.add(num);
	        large.add(reverseSmall.poll());
	    }
	    even = !even;
	}
}

