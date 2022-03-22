package beforeexam;

import java.util.*;

/**
 * 
 * Given the availability time slots arrays slots1 and slots2 of two people and a meeting duration duration, 
 * return the earliest time slot that works for both of them and is of duration duration.
	If there is no common time slot that satisfies the requirements, return an empty array.
	The format of a time slot is an array of two elements [start, end] representing an inclusive time range from start to end.
	It is guaranteed that no two availability slots of the same person intersect with each other. 
	That is, for any two time slots [start1, end1] and [start2, end2] of the same person, either start1 > end2 or start2 > end1.
 * Example 1:

Input: slots1 = [[10,50],[60,120],[140,210]], slots2 = [[0,15],[60,70]], duration = 8
Output: [60,68]
 * @author pramod
 *
 */
public class MeetingScheduler {

	public static void main(String args[]) {
		int[][] slots1= new int[][] {{10,50},{60,120},{140,210}};
		int[][] slots2= new int[][] {{60,75},{70,90}};
		List<Integer> d=minAvailableDuration(slots1,slots2,8);
        System.out.println(d.get(0));System.out.println(d.get(1));
	}
	


	public static List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, (a,b)->a[0]-b[0]); // sort increasing by start time
        Arrays.sort(slots2, (a,b)->a[0]-b[0]); // sort increasing by start time

        int i = 0, j = 0;
        int n1 = slots1.length, n2 = slots2.length;
        while (i < n1 && j < n2) {
            // Get the intersection 
            int intersectStart = Math.max(slots1[i][0], slots2[j][0]);
            int intersectEnd = Math.min(slots1[i][1], slots2[j][1]);

            if ( intersectEnd- intersectStart >=duration ) // Found the result
                return Arrays.asList(intersectStart, intersectStart + duration);
            else if (slots1[i][1] < slots2[j][1])
                i++;
            else
                j++;
        }
        return new ArrayList<>();
    }	
}

