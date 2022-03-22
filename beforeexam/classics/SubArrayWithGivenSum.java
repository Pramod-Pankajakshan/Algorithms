package beforeexam.classics;

public class SubArrayWithGivenSum {
	
	
	//http://www.geeksforgeeks.org/find-subarray-with-given-sum/
	// 1,5,8,3,7,23 - check for contigious array for 30 as sum
	
	public static void main(String[] args) {
		int h[]= {14,1,5,8,3,7,23,1,13};
		check(h,14);
	}
	static void check(int[] arr, int s) {
		
		// start from 0 
		// keep adding
		// if > then s remove first - keep doing it
		//
		int sum=0;
		int left=0; 
		for(int i=0;i<arr.length;i++) {
      		sum=sum+arr[i];      		
			while(sum>s&&left<=i) {
				sum=sum-arr[left];
				left=left+1;
			}
			if(sum==s) {
				System.out.println(left+" - "+i);
				continue;
			}
				
		}
	}

}
