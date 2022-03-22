package leetcode;
// minimum jumps needed
public class JumpGame2 {
	public static void main(String[] args) {
		//int a[]= {1,1,3,1,2};
		int a[]= {2,3,5,6,9,0,0,10,0,0}; 
		//System.out.println(canJump(a));
		System.out.println(jump2(a));
	}
	
	
	
	
// Logic is to start from right and go left 
	// for each position before last - 
	// get the distannce needed to reach end 
	// if the value is > then its position gets a 1
	// else from that position get the min of max it can go, which is the value of that pos
	// now u got the value of that position which is required to reach end
	
	
	public static int jump(int[] nums) {
       
	        if(nums.length==1) return 0;
	        int t[]= new int[nums.length]; // temp ARRAY
	        for(int i=nums.length-1-1;i>=0;i--){// second last	        	
	            int distNeeded=nums.length-1-i; // remember - ITS IIIIIIIIIIIIIIIIII
	            System.out.println("DistNeeded...----->"+distNeeded);
	            if(nums[i]>=distNeeded){	      
	            		System.out.println("setting to 1..as .its> needed dist----->"+nums[i]);
	                t[i]=1;
	            }else{
	                int min=100000;
	                for(int j=i+1;j<=i+nums[i];j++){
	                			// etteavum cheriya sanghya to reach dest
	                     min=Math.min(t[j],min);
	                } 		// add that to the position
	                t[i]=1+min;
	              
	            }
	        }
	        return t[0];
 }

	// get the max of a range - the range is the value of positions
	// max is value+ i
	 public static int jump2(int[] nums) {
		   
		    // Step 1
		    int maxRange = nums[0];
		    int currRange = nums[0];		    
		    int jumps = 1;
		    for (int i = 1; i < nums.length; i++) {
		      // Step 3 - decision time
		    	  // when counter has reached the curr range - update range to new maxrange and increment counter.
		      if (i> currRange) {
		    	   currRange = maxRange;
		       jumps++;
		      }
		      // Step 2- keep getting max range for each position [inside current range]
		      maxRange = Math.max(maxRange, nums[i] + i);// its sum of i and nums[i]
		    }
		    return jumps;
		  }
}
