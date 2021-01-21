package dynamic;

public class LongestAnySubSequence {

	 public static void main(String args[]) 
	    { 
	        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
	            int n = arr.length; 
	            System.out.println("Length of lis is " 
	                              + lis( arr, n ) + "\n" ); 
	    } 
	 
	 private static boolean check(int a,int b) {
		 boolean f = false;
		 //in[i]>in[j]
		 // a > b
		 //if(a>b)return true;
		// if(Math.abs(a-b)<15  )return true;
		 if(Math.abs(a-b)<5  )return true;
		 return f;
	 }
	 
	 public static int lis(int in[],int n) {
		 
		 int arr[]=new int[n];
		 arr[0]=1;
		 for(int i=1;i<n;i++) {
			 for(int j=0;j<i;j++) {
				 
				 if(check(in[i],in[j])) {
					 
					 if(arr[i]<arr[j]+1)
					    arr[i]=arr[j]+1;
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
