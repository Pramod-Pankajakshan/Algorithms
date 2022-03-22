package array;

import java.util.*;

// mug it - its log n solution not worth the time for now.
public class FindMedianOfTwoSortedArrays {

	public static void main(String args[]) {
		FindMedianOfTwoSortedArrays fm= new FindMedianOfTwoSortedArrays();
		fm.findMedianSortedArrays(new int[] {8,11,16,34,41,45}, new int[] {1,2,5,6,7,90});

	}

	public double findMedianSortedArrays(int[] ar1, int[] ar2) {
	    int m = ar1.length, n = ar2.length;
	    int l = (m + n + 1) / 2;
	    int r = (m + n + 2) / 2;
	    return (getPos(ar1, 0, ar2, 0, l) + getPos(ar1, 0, ar2, 0, r)) / 2.0;
	}

public double getPos(int[] in1, int in1St, int[] in2, int in2St, int pos) {
	if (in1St > in1.length - 1)
		return in2[in2St + pos - 1];            
	if (in2St > in2.length - 1) 
		return in1[in1St + pos - 1];                
	if (pos == 1)
		return Math.min(in1[in1St], in2[in2St]);
	
	int in1Mid = Integer.MAX_VALUE;
	int in2Mid = Integer.MAX_VALUE;
	if (in1St + pos/2 - 1 < in1.length) 
		in1Mid = in1[in1St + pos/2 - 1]; 
	if (in2St + pos/2 - 1 < in2.length) 
		in2Mid = in2[in2St + pos/2 - 1];        
	
	if (in1Mid < in2Mid) 
	    return getPos(in1, in1St + pos/2, in2, in2St,   pos - pos/2);// Check: aRight + bLeft 
	else 
	    return getPos(in1, in1St,  in2, in2St + pos/2, pos - pos/2);// Check: bRight + aLeft
}
}

