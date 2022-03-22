package google;

import java.util.*;

/**
 * 
 * Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8].
 * @author pramod
 *
 */
public class SplitArrayToConsecutiveSubSequences {
    // use Treemap
	// add and then replace       
	public static boolean isPossible(int[] nums, int k) {
        if(nums.length % k != 0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
         // Treemap
        // sorted so just put
        for(int x: nums)
           map.put(x,map.getOrDefault(x,0)+1); 
        // map has all nums - now iterate
        // get 1 loop  1+k times
        for(int n: map.keySet()){
            int curr = map.get(n);
            
            if(curr == 0) continue;
            
            for(int i = n; i < n + k; i++){
                if(!map.containsKey(i) || map.get(i) <= 0)
                    return false;
                map.put(i,map.get(i) - curr);
                
            }
        }
        
        return true;
    }
	
	
	public static void main(String args[]) {
	int []	hand = {1,2,3,3,4,4,5,6};
	System.out.println(isPossible(hand,4));
	}
}


