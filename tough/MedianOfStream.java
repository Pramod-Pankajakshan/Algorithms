package tough;
import java.util.Comparator;
import java.util.PriorityQueue;

// Given a stream of unsorted integers, find the median element in sorted order at any given time.
// http://www.ardendertat.com/2011/11/03/programming-interview-questions-13-median-of-integer-stream/
public class MedianOfStream {

	public PriorityQueue<Integer> minHeap;
	public PriorityQueue<Integer> maxHeap;
	public int numOfElements;
	
	public MedianOfStream() {
		minHeap = new PriorityQueue<Integer>();
		maxHeap = new PriorityQueue<Integer>(10, new MaxHeapComparator()); 
		numOfElements = 0;
	}
	
	public void addNumberToStream(Integer num) {
		maxHeap.add(num);
		if (numOfElements%2 == 0) {
			if (minHeap.isEmpty()) {
				numOfElements++;
				return;
			}
			else if (maxHeap.peek() > minHeap.peek()) {				
				maxHeap.add(minHeap.poll());
				minHeap.add(maxHeap.poll());
			} 
		} else {
			minHeap.add(maxHeap.poll());
		}
		numOfElements++;
	}
	
	public Double getMedian() {
		if (numOfElements%2 != 0) //odd
			return new Double(maxHeap.peek());
		else
			return (maxHeap.peek() + minHeap.peek()) / 2.0; 
	}
	
	private class MaxHeapComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	}
	
	public static void main(String[] args) {
		MedianOfStream streamMedian = new MedianOfStream();
		
		streamMedian.addNumberToStream(1);
		System.out.println(streamMedian.getMedian()); // should be 1
		
		streamMedian.addNumberToStream(5);
		streamMedian.addNumberToStream(10);
		streamMedian.addNumberToStream(12);
		streamMedian.addNumberToStream(2);
		System.out.println(streamMedian.getMedian()); // should be 5
		
		streamMedian.addNumberToStream(3);
		streamMedian.addNumberToStream(8);
		streamMedian.addNumberToStream(9);
		System.out.println(streamMedian.getMedian()); // should be 6.5
	}
}