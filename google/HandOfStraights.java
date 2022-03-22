	package google;

import java.util.*;

/**
 * 
 *  Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
 *  Output: true
 *  Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8].
 *  @author pramod
 *
 */

public class HandOfStraights {
	    // use Treemap
		// add and then replace 
		public static void main(String args[]) {
			int []	hand = {1,2,3,6,2,3,4,7,8,9,10,11,12,33,34,35,36};
			int W = 3;
			System.out.println(isNStraightHand(hand,W));
		}
     // 122334678   123 234  567
		public static  boolean isNStraightHand(int[] hand, int W) {
			
			        TreeMap<Integer, Integer> map = new TreeMap();
			        for (int card: hand) {
			        	 
			            if (!map.containsKey(card))
			                map.put(card, 1);
			            else
			                map.replace(card, map.get(card) + 1);
			        }
	
			        while (map.size() > 0) {
			            int first = map.firstKey();// map.firstkey and map.replace 
			            for (int card = first; card < first + W; ++card) {
			                if (!map.containsKey(card)) return false;
			                int c = map.get(card);
			                if (c == 1) map.remove(card);
			                else map.replace(card, c - 1);
			            }
			        }
	
			        return true;
		}
}

