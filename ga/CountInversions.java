package ga;

//Java implementation of the approach 
import java.util.Arrays; 

public class CountInversions { 

	// Function to count the number of inversions 
	// during the merge process 
	private static int mergeAndCount(int[] arr, int l, int m, int r) 
	{ 

		// Left subarray 
		int[] left = Arrays.copyOfRange(arr, l, m + 1); 

		// Right subarray 
		int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 

		int i = 0, j = 0, k = l, swaps = 0; 
		System.out.println(Arrays.toString(left));
		System.out.println("is Left and Right ->");
		System.out.println(Arrays.toString(right));
		System.out.println("l="+l+" m="+m+" r="+r);
		while (i < left.length && j < right.length) { 
			System.out.println("comparing i ->"+left[i]+"with j ->"+right[j]);
			if (left[i] <= right[j]) 
				arr[k++] = left[i++]; 
			else { 
				arr[k++] = right[j++]; 
				System.out.println("add ->"+((m + 1) - (l + i)));
				swaps += (m + 1) - (l + i); 
				System.out.println("swap now uis ->"+swaps);
			} 
		} 

		// Fill from the rest of the left subarray 
		while (i < left.length) 
			arr[k++] = left[i++]; 

		// Fill from the rest of the right subarray 
		while (j < right.length) 
			arr[k++] = right[j++]; 

		return swaps; 
	} 

	// Merge sort function 
	private static int mergeSortAndCount(int[] arr, int l, int r) 
	{ 

		// Keeps track of the inversion count at a 
		// particular node of the recursion tree 
		int count = 0; 

		if (l < r) { 
			int m = (l + r) / 2; 

			// Total inversion count = left subarray count 
			// + right subarray count + merge count 

			// Left subarray count 
			count += mergeSortAndCount(arr, l, m); 

			// Right subarray count 
			count += mergeSortAndCount(arr, m + 1, r); 
			//System.out.println(Arrays.toString(arr));
			System.out.println("-----------------"+count);
			// Merge count 
			count += mergeAndCount(arr, l, m, r); 
		} 
System.out.println(Arrays.toString(arr));
		return count; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int[] arr = { 6,2,1,3 }; 

		System.out.println(mergeSortAndCount(arr, 0, arr.length - 1)); 
	} 
} 

//This code is contributed by Pradip Basak 
