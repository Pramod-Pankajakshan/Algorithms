package array;

import java.util.HashMap;

public class SubArrayWithGivenSum {
	
	
	//http://www.geeksforgeeks.org/find-subarray-with-given-sum/
	// 1,5,8,3,7,23 - check for contigious array for 30 as sum
	
	public static void main(String[] args) {
		int h[]= {1,5,8,7,7,23,1};
		check(h,14);subarraySum(h,14);
	}
	// 1 6 14 21 28  51 52
    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);// dont miss this
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))// 
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
        return count;
    }

	static void check(int[] arr, int s) {
		System.out.println("started");
		// start from 0 
		// keep adding
		// if > then s remove first - keep doing it
		//
		int sum=0;
		int left=0; 
		for(int i=0;i<arr.length;i++) {
			
			if(sum==s) {
				System.out.println(left+" to "+i);
				break;
			}
			sum=sum+arr[i];
			while(sum>s&&left<=i) {
				sum=sum-arr[left];
				left=left+1;
			}
			if(sum==s) {
				System.out.println(left+" to "+i);
				break;
			}
			
				
		}
		
		
		
		
	}

}
