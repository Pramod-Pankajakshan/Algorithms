package array;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * We are given an array A of positive integers, and two positive integers L and R (L <= R).

Return the number of (contiguous, non-empty) subarrays such that the value of the maximum array element in that subarray is at least L and at most R.
 * @author pramod
 *
 */
public class SubArrayBoundedMaximum {

	private int numberOfComb(int n) {
		return (n*n+n)/2;
	}
	  public int numSubarrayBoundedMax(int[] A, int L, int R) {
		  int st=0; int end=0;
		  for(int i=0;i<A.length;i++) {
			 
			  if(A[i]>R) {
				//  calculate()
			  }
		  // if ai is > r then break
			  
		  //ai<l - if prev is valid
		  
		  }
		

		  return 0;
	  }
}

