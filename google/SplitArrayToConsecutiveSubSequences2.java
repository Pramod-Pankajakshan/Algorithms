package google;

import java.util.*;

/**
 * 
 *
 */

public class SplitArrayToConsecutiveSubSequences2 {
   
	public static void main(String args[]) {
		int []	hand = {1,2,3,3,4,4,5,6};
		System.out.println(isPossible(hand));
	}
     /**
      * Say we have a count of each number, and let tails[x] be the number of chains ending right before x.
	  Now let's process each number. If there's a chain ending before x, then add it to that chain. 
	  Otherwise, if we can start a new chain, do so.
		It's worth noting that our solution can be amended to take only O(1)O(1) additional space, 
		since we could do our counts similar to Approach #1, and we only need to know the last 3 counts at a time.
     * @param in
      * @return
      */
	 public static boolean isPossible(int[] in) {
	        Counter count = new Counter();
	        Counter tails = new Counter();
	        for (int x: in) 
	        	   count.add(x, 1); // add to map

	        for (int x: in) {
	            if (count.get(x) == 0) {
	                continue;
	            } else if (tails.get(x) > 0) {
	                tails.add(x, -1);
	                tails.add(x+1, 1);
	            } else if (count.get(x+1) > 0 && count.get(x+2) > 0) {
	                count.add(x+1, -1);
	                count.add(x+2, -1);
	                tails.add(x+3, 1);
	            } else {
	                return false;
	            }
	            count.add(x, -1);
	        }
	        return true;
	  }
}

class Counter extends HashMap<Integer, Integer> {
    public int get(int k) {
        return containsKey(k) ? super.get(k) : 0;
    }

    public void add(int k, int v) {
        put(k, get(k) + v);
    }
}
