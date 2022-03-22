package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TargetSum {

	public static void main(String[] args) {
		int fd[]= {1,1,1,1,1};
		findTargetSumWays(fd,3);	
		System.out.println(c);
	}
	 public static int findTargetSumWays(int[] nums, int S) {
		 List<Integer> ls= new ArrayList<Integer>();
	      recur(nums,0,S,0,new HashSet<String>(),ls);
	        return c;
	    }
	    static int c=0;
	    private static void recur(int[] nums, int pos, int s, int cs,Set<String> set,List<Integer> in){
	        if(s==cs&&pos==nums.length){
		        System.out.println(Arrays.toString(in.toArray())+"--pos ="+pos+"--sum is "+cs);

	            c++; 
	        }
	        if(pos>nums.length-1) return;

	        recur(nums,pos+1,s,cs+nums[pos],set,in);
	        recur(nums,pos+1,s,cs-nums[pos],set,in);
	        
	        
	    }
}
