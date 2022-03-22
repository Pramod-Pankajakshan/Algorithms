package array;

import java.util.HashMap;

public class ContiniousSum {
	/**
	 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

			Example 1:
			
			Input:nums = [1,1,1], k = 2
			Output: 2
	 * @param in
	 */
	public static void main(String[] args) {
		int sum =7;
		int in[]= new int[]{7,1,3,3,5,6,1,2,3,3,2,6,5,4,3,4};
		subarraySum(in,sum);
		// window - size =1
		// l=0, r=0;
		// check sum
		// if == then increase count
		// if less then r++;
		// if greater then l++;
		
		int r=0;int l=0;
		int c=0; int csum=0;
		while(r<in.length) {
		if(l==r) {
			csum=in[l];	
			if (in[l]==sum) {
				c++;
				l++;
			}
				
			r++;
		}else{
			
			if (csum+in[r]<sum) {
				 csum=csum+in[r];
				r++;
			}else if(csum+in[r]>sum){
			    csum=csum-in[l];
				l++;
			}else {
				csum=csum+in[r];
				c++;
				l++;
			}
		}
		}
		System.out.println(c);
	}
	
	// if 19 -12 =7 then its a cont sum right...so keep adding the sum and check the diff of k from currsum
	// if we see it in map then its a match
   public static int subarraySum(int[] nums, int k) {
	        int count=0, sum=0;
	        HashMap<Integer, Integer> h = new HashMap();	        
	        for (int num : nums) {
	            // current prefix sum
	            sum += num;	            
	            // situation 1:  
	            // continuous subarray starts 
	            // from the beginning of the array
	            if (sum == k)
	                count++; 
	            // situation 2:
	            // number of times the curr_sum − k has occured already, 
	            // determines the number of times a subarray with sum k 
	            // has occured upto the current index
	            System.out.println("-->"+(sum-k)+"/"+h.getOrDefault(sum - k, 0));
	            
	            count+=h.getOrDefault(sum - k, 0);
	            // add the current sum
	            h.put(sum, h.getOrDefault(sum, 0) + 1);    
	        }
	        System.out.println("->"+count);
	        return count;
    }
	

}
