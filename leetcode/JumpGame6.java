package leetcode;

import java.util.PriorityQueue;

public class JumpGame6 {
	public static void main(String[] args) {
		//int a[]= {1,1,3,1,2};
		//int a[]= {1,-1,-2,4,-7,3}; 
		int a[]= {2,9,0,6,9,0,0,10,0,0}; 
		//System.out.println(canJump(a));
		System.out.println(maxResultq(a,2));
	}
	
	 public static int maxResult(int[] nums, int k) {	        
	        recur(nums,0,k,0);	        
	        return max;
	    }
	    
	    static int max=0;
	    private static void recur(int nums[],int st, int k,int sum){	    	
	        if(st>=nums.length){
	        	System.out.println(sum);
	            max=Math.max(sum,max);
	            return;
	        }	    
	    for(int i=st;i<=Math.min(st+k-1,nums.length-1);i++){
	        sum=sum+nums[i];
	        recur(nums,i+1,k,sum);
	        sum=sum-nums[i];
	    }
	    
	    }
	    
	    
//You are given a 0-indexed integer array nums and an integer k.
//You are initially standing at index 0. In one move, you can jump
//at most k steps forward without going outside the boundaries of the array. 
//That is, you can jump from index i to any index in the range [i + 1, min(n - 1, i + k)] inclusive.
//You want to reach the last index of the array (index n - 1).
//Your score is the sum of all nums[j] for each index j you visited in the array.
//Return the maximum score you can get.
	    public static int maxResultq(int[] nums, int k) {
	        int n = nums.length;
	        int score = nums[0];
	        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> b[0] - a[0]);
	        priorityQueue.add(new int[] { nums[0], 0 });
	        for (int i = 1; i < n; i++) {
	            // Step 3 integrity check for the range
	            while (priorityQueue.peek()[1] < i - k) {
	                priorityQueue.remove();
	            }
	            score = nums[i] + priorityQueue.peek()[0];// Step 1 Simply keep adding peek+value 
	            priorityQueue.add(new int[] { score, i }); //  Step 2store value and i
	        }
	        return score;
	    }
	
}
