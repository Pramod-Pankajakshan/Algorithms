package tough;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 * Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

For example,
[2,3,4], the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.
double findMedian() - Return the median of all elements so far.

 * @author pramod
 *
 */
public class MedianStream295 {
public static void main(String arg[]){

	MedianStream295 m= new MedianStream295();
	m.addNum(1);
//	System.out.println(m.findMedian());
	m.addNum(2);
//	System.out.println(m.findMedian());
	m.addNum(3);
//	System.out.println(m.findMedian());
	m.addNum(4);
//	System.out.println(m.findMedian());
	m.addNum(5);
//	System.out.println(m.findMedian());
	m.addNum(6);
	m.addNum(7);
	m.addNum(8);
	m.addNum(9);
	
	System.out.println(m.findMedian());

}



 

    PriorityQueue<Integer> biggerHalf = new PriorityQueue<>();
    PriorityQueue<Integer> smallerHalf = new PriorityQueue<>(Collections.reverseOrder());

    // Adds a number into the data structure.
    public void addNum(int num) {
    	System.out.println("adding"+num+"small");
    	smallerHalf.offer(num);
    	System.out.println("moving.."+smallerHalf.peek()+" to bigger one ....");
    	biggerHalf.offer(smallerHalf.poll());// move smallest in larger  to smaller q
    	if (smallerHalf.size() < biggerHalf.size()) { //smaller half must be big or =
    		System.out.println("BALANCING.."+biggerHalf.peek()+" to small q");
    		smallerHalf.offer(biggerHalf.poll());
    	}
    	
    System.out.println("smallerHalf");
    	print(smallerHalf);
    	System.out.println("biggerHalf");
    	print(biggerHalf);
    	System.out.println("***");
    }

    // Returns the median of current data stream
    public double findMedian() {
    	if (smallerHalf.size() == biggerHalf.size())
    		return (smallerHalf.peek() + biggerHalf.peek()) / 2.0;
    	else
    		return smallerHalf.peek();
    }
    
    private void print(Queue<Integer> l) {
    	Iterator iter= l.iterator();
    	while(iter.hasNext()) {
    		System.out.print(iter.next());
    	}
    	System.out.println("\n..");
    }
}




