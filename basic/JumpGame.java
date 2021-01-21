package leetcode;

public class JumpGame {


	public static void main(String[] args) {
		int a[]= {1,2,3,1,2,3};
		System.out.println(canJump(a));
		//System.out.println(jump(a));
	}

	public static  boolean canJump(int[] nums) {
	        int stepsneededtoreachend = nums.length - 1;
	        for (int position = nums.length - 1; position >= 0; position--) {
	            if (position + nums[position] >= stepsneededtoreachend) { // keep moving baxk the last position --WATCH >=
	                stepsneededtoreachend = position;
	            }
	        }
	        return stepsneededtoreachend == 0;
	    }
	
}
