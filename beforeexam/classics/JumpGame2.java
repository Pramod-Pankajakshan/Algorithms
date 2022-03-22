package beforeexam.classics;

import java.util.Arrays;

public class JumpGame2 {
	public static void main(String[] args) {
		int a[]= {3,1,1,1,2};
		//System.out.println(canJump(a));
		System.out.println(jump(a));
	}
	
	 public static int jump(int[] in) {
	      
	    if (in.length < 2) return 0;
	        // Step 1
			    int maxRange = in[0];
			    int currRange = in[0];
			    int jumps = 1;
			    for (int i = 1; i < in.length; i++) {
			      // Step 3 - decision time
			    	  // when counter has reached the curr range - update range to new maxrange and increment counter.
			      if (i> currRange) { // > than current range then replace it wit max range
			    	   currRange = maxRange;
			       jumps++;
			      }
			      // Step 2- keep getting max range for each position [inside current range]
			      maxRange = Math.max(maxRange, in[i] + i);// its sum of i and nums[i]
			    }
			    return jumps;
      }
	 
	 public int jump2(int[] nums) {
	        int[] state = new int[nums.length];
	        Arrays.fill(state, Integer.MAX_VALUE);
	        state[0] = 0;	        
	        for (int i = 1; i < nums.length; i++) {
	            for (int j = 0; j < i; j++) {
	                if (nums[j] + j >= i) { // j can jump to i
	                    state[i] = Math.min(state[i], state[j] + 1);
	                }
	            }
	        }
	        
	        return state[nums.length - 1];
	    }
}
