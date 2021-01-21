package dynamic;

public class LongestIncreasingSubSequence {

	 public static void main(String args[]) 
	    { 
	        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
	            int n = arr.length; 
	            System.out.println("Length of lis is " 
	                              + lis( arr, n ) + "\n" ); 
	    } 
	 
	 public static int LongestIncreasingSubSequence(int in[],int n) {
		 
		 int arr[]=new int[n];
		 arr[0]=1;
		 for(int i=1;i<n;i++) { // take small sets 
			 for(int j=0;j<i;j++) { // check for the diff and update array 10 to 22
				 if(in[i]>in[j]) {
					 if(arr[i]<arr[j]+1)
					    arr[i]=arr[j]+1; // key is arr[j] and not arr[previous]
				 }				 
			 } 
		 }
		 int max=0;
		 for(int i:arr) {
			 if(i>max) {
				 max=i;
			 }
		 }
		 System.out.println(max);
		 return max;
		 
	 }
	
	
}
