package array;

import java.util.*;


public class HIndex {

	public static void main(String args[]) {

		hIndex(new int[] {3,0,6,1,5});

	}

	public static int hIndex(int[] citations) {
		
        // sorting the citations in ascending order
        Arrays.sort(citations);
        // finding h-index by linear search
        int i = 0;
        int a=0;
        while (i < citations.length) {
            
            if( citations[citations.length-1-i] <= i)
               break;
            else{
                a=i;
            }
            i--;
        }
        return a+1; 
    }
}



/**
Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return compute the researcher's h-index.

According to the definition of h-index on Wikipedia: A scientist has an index h if h of their n papers have at least h citations each, and the other n − h papers have no more than h citations each.

If there are several possible values for h, the maximum one is taken as the h-index.

 

Example 1:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.

**/