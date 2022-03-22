package array;

import java.util.*;
/***
 * Very good and concise solution. Especially that approach to mark the height as negative for all the left coordinates deserves an upvote. Here is an explanation to your approach for easy understanding:

Store all the coordinate values in height arraylist and mark the height of each start/left coordinate as negative. We'll discuss it why.

Sort the height array such that it considers following conditions:
i. When the two points are not equal then sort them by coordinate values.
ii. When two coordinate values are same, then check
a. if both of them are start/left coordinates. If so, consider the largest height. (That's why left coordinate heights are marked negative).
b. if both of them are end/right coordinates. If so, consider the shortest height.
c. If one of them is end/right and other is start/left then consider the start/left height.

Iterate height arraylist and store height values in the priority queue (reverse ordered) only if current coordinate is a left/start coordinate. Remove a height values from the queue if we encounter a right/end coordinate.

Check if the maximum height changes in queue after each iteration. If so then add current maxheight and current coordinate to result array.

There is a possibility of improvement here. As we remove from priority queue it takes O(n) time. Instead of that, we can use a TreeMap to sort values by height and remove values in O(log n) time.
Here is my solution with TreeMap and explicitly designed comparator:
 * @author pramod
 *
 */
public class SkylineProblem {
	
	int g[][]= new int [][] { {2,9,10},
						 {3,7,15},
						 {5,12,12},
						 {15,20,10},
						 {19,24,8}
	                    };
  public static void main(String[] args) {
	
	  SkylineProblem s= new SkylineProblem();
	  s.getSkyline(s.g);
	  
	  
	  
  }

  //Input: buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]
 // Output: [[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]
  public List<int[]> getSkyline(int[][] buildings) {
      List<int[]> heights = new ArrayList<>();
      for (int[] buidg : buildings) {
          // Nice trick to put negative height for the left edge
          heights.add(new int[] {buidg[0], -buidg[2]});
          heights.add(new int[] {buidg[1], buidg[2]});
      }
      Collections.sort(heights, (a, b) -> a[0] != b[0] ?a[0] - b[0] :a[1] - b[1]);
      
      // Max heap of heights
      Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
      pq.offer(0);
      // Height of the previous key point
      int prev = 0;
      List<int[]> result = new ArrayList<>();
      for (int[] h : heights) {
          if (h[1] < 0) {
              // Add the building to priority queue
              pq.offer(-h[1]);// *************imp
          } else {
              // Remove the building from priority queue
              pq.remove(h[1]);
          }
          int cur = pq.peek();
          // Height changes, so add a new key point to the result
          if (prev != cur) {
              result.add(new int[] {h[0], cur});
              prev = cur;
          }
      }
      System.out.println(Arrays.deepToString(result.toArray()));
      return result;
  }
  // get the heights - store 2 -10 and 9 10
  // sort by position or height
  // pq a,b -> b-a
  // add 0
  // prev=0 - it starts always as 0 right
  // if < 0 add else remove
  // gett peek
  // if prev!=cur add prev=cur
  
  
}
