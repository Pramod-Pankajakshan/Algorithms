package array;

import java.util.*;


public class FindSum {

	public static void main(String args[]) {
		int[] nums1 = { 37, 23, 60 };
		int[] nums2 = { 10, 50, 90, 30 };
		int[] nums3 = { 30, 20, 150, 100, 40 };
		int[] nums4 = { 60, 60, 60 };
		System.out.println(fn(nums1));
		System.out.println(fn(nums2));
		System.out.println(fn(nums3));
		System.out.println(fn(nums4));
	//	fn(new int[]{ 30, 20, 150, 100, 40 });

	}
    // trick - double percentage 601 no else check - keep adding to handle dupes
	private static int fn(int[] time) {
		Map<Integer,Integer> mp = new HashMap<>(); int c=0; 
		for(int i=0;i<time.length;i++) {
			
			if(mp.containsKey(time[i]%60)) {
				c+=mp.get(time[i]%60);
			}
			mp.put((60-time[i]%60)%60, mp.getOrDefault((60-time[i]%60)%60, 0)+1);// 30 20 
			
			
		}
		
		return c;
	}
}

