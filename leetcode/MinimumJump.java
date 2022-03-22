package leetcode;
//https://leetcode.com/problems/jump-game-ii/description/
/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

For example:
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

Note:
You can assume that you can always reach the last index.
 * @author pramod
 *
 */
public class MinimumJump {
	
	static int min=Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		int a[]= {2,3,1,1,4,1,1,1,1};
		jump(a,0,0,0);
		System.out.println("----"+min);
	}
	
 static  void jump(int [] a, int jumps, int pos, int val) {
	   System.out.println("jumps is "+jumps);
	   System.out.println("pos is "+pos);
	   
	    if(val==a.length) {
	    	  if(min>jumps) min=jumps;	    	   
	    }
	    
	    if(val>a.length) {
	    	System.out.println("return");
	    	 return;
	    }
	   for(int i=pos;i<=a[pos];i++) {
		   System.out.println("pos is "+pos+"a[i]"+a[i]);
		   jump(a,jumps+1,i,val+a[i]);// 1 3 1 1 1
	   }
   }
	
	
}
