package leetcode;

public class JumpGame {


	public static void main(String[] args) {
		int a[]= {1,0,0,5,0,0};
		System.out.println(canJump(a));
		
	}

	public static  boolean canJump(int[] in) {
		System.out.println("last pos is set and accepted");
	        int stepsneededtoreachend = in.length - 1;
	        for (int i = in.length - 1; i >= 0; i--) {
	            if (i + in[i] >= stepsneededtoreachend) { // keep moving baxk the last position --WATCH >=
	                stepsneededtoreachend = i;
	                System.out.println("Now need to reach -"+stepsneededtoreachend);
	            }else {
	            	System.out.println("nope");
	            }
	        }
	        return stepsneededtoreachend == 0;
	    }
	
	// micro coding
	public static  boolean canJump1(int[] nums) {
	        int stepsneededtoreachend = nums.length - 1;
	        for (int position = nums.length - 1; position >= 0; position--) {
	            if (position + nums[position] >= stepsneededtoreachend) 
	                stepsneededtoreachend = position;	           
	        }
	        return stepsneededtoreachend == 0;
	    }
	
}
