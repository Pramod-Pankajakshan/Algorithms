package array;
/**
 * Find the contiguous subarray within an array (containing at least one number)
 *  which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
 * @author pramod
 */
public class MultipleMaxArrayOrMaxProductSubArray {
	//  	int[] j= {1,2,-3,4,-6,-7,9};
 static	int maxProduct(int A[]) {
            // multiply  from right and also from left
	        // if zero then set to 1 for l and r
	        // get the max
	        int n = A.length, res = A[0], l = 0, r = 0;
	        for (int i = 0; i < n; i++) {
	            l =  (l == 0 ? 1 : l) * A[i];
	            r =  (r == 0 ? 1 : r) * A[n - 1 - i];
	            res = Math.max(res, Math.max(l, r));
	        }
	        return res;
	        
 }
	
 
	
	public static void main(String[] args) {
	   	int[] j= {-1,-2,0,-3,-4};
	   	maxProduct(j);
	   	
	}

	
	

	


	
	
	
	
}
