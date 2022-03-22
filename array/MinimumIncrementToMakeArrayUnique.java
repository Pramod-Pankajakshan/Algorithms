package array;

import java.util.*;


public class MinimumIncrementToMakeArrayUnique {

	public static void main(String args[]) {

		int ans=minIncrementForUnique(new int[] {1,2,2});
		
		System.out.println(ans);
	}

	public static int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int result = 0, nextExpected = 0;
        for (int in : A) {
       // 	System.out.println("-----------"+a);
        	//  System.out.println(Math.max(need - a, 0));
            result += Math.max(nextExpected - in, 0);
        //    System.out.println(Math.max(a, need) + 1);
            nextExpected = Math.max(in, nextExpected) + 1;
        //    System.out.println("--------");
        }
        return result;
    }
	
	
	
}

