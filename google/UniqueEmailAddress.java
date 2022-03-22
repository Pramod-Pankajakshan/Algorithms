package google;

import java.util.*;


public class UniqueEmailAddress {

	public static void main(String args[]) {

		oddEvenJumps(new int[]{10,13,12,14,15});

	}

	 public static int oddEvenJumps(int[] A) {
	        int N = A.length;
	        if (N <= 1) return N;
	        boolean[] oddArray = new boolean[N];
	        boolean[] evenArray = new boolean[N];
	        oddArray[N-1] = evenArray[N-1] = true;

	        TreeMap<Integer, Integer> map = new TreeMap();
	        map.put(A[N-1], N-1);
	        for (int i = N-2; i >= 0; --i) {
	           
	            if (map.containsKey(A[i])) {
	                oddArray[i] = evenArray[map.get(A[i])];
	                evenArray[i] = oddArray[map.get(A[i])];
	            } else {
	                Integer lkey = map.lowerKey(A[i]);
	                Integer hkey = map.higherKey(A[i]);

	                if (lkey != null)
	                    evenArray[i] = oddArray[map.get(lkey)];
	                if (hkey != null) {
	                    oddArray[i] = evenArray[map.get(hkey)];
	                }
	            }
	            map.put(A[i], i);
	        }

	        int ans = 0;
	        for (boolean b: oddArray)
	            if (b) ans++;
	        return ans;
	    }
}

