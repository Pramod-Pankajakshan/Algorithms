package array;

public class SmallestSumSubset {

//http://www.geeksforgeeks.org/find-smallest-value-represented-sum-subset-given-array/	
//	int findSmallest(int arr[], int n)
//	{
//	   int res = 1; // Initialize result
//	 
//	   // Traverse the array and increment 'res' if arr[i] is
//	   // smaller than or equal to 'res'.
//	   for (int i = 0; i < n && arr[i] <= res; i++)
//	       res = res + arr[i];
//	 
//	   return res;
//	
	public static void main(String[] args) {
		int arr1[] = {1,2,5,6,7,9}; //ans must be 4
		System.out.println(findSmallest(arr1,arr1.length));
     }

	static int findSmallest(int arr[], int n)
	{
	   int res = 1; // Initialize result
	 
	   // Traverse the array and increment 'res' if arr[i] is
	   // smaller than or equal to 'res'.
	   for (int i = 0; i < n && arr[i] <= res; i++)	 {
		
		   res = res + arr[i];	   
	   }	   
	   return res;
	}
}
