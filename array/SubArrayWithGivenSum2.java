package array;

public class SubArrayWithGivenSum2 {
	
	
	//https://leetcode.com/problems/subarray-sum-equals-k/solution/
	
	public static void main(String[] args) {
		int h[]= {1,1,1,13,12,2,2,2,2,2,2,2,2};
		check(h,14);
	}
	
	static int g=0;
	static void check(int[] arr, int s) {
	    int h=0; int sm=0;
		while(h<arr.length) {
			sm=0;
			for(int i=h;i<arr.length;i++) {
				sm=sm+arr[i];
				if(sm==s) g++;
			}
			h++;
		}
		
		System.out.println(g);
	}

}
