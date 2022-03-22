package beforeexam.classics;

import java.util.*;


public class MaxPointsFromCards {

	public static void main(String args[]) {

		//fn("");
		//[1,2,3,4,5,6,1], k = 3
				maxScore(new int[] {1,2,3,4,5,6,1},5);

	}

	   // check a video
    // have 2 arrays - like dp keep adding sums for left and right 
    // then just
    public static int maxScore(int[] cardPoints, int k) {
   int[] in=cardPoints;
	// take left k sum
	// take right k sum
	// now try combos
	int t1[]= new int[k+1];// mistake was in defiining the size
	int t2[]= new int[k+1];
		for(int i=1;i<k+1;i++) {
			t1[i]=t1[i-1]+in[i-1];// 1= 0+in[0] 1
		}// [1,2,3,4,5,6,1], k = 3
		for(int i=1;i<k+1;i++) {
			t2[i]=t2[i-1]+in[in.length-i];// 1=0+
		}
		int max=0; // 12 3 4 5 0
		             // 0 2 3  4 13
		System.out.println(Arrays.toString(t1));System.out.println(Arrays.toString(t2));
 		for(int i=0;i<k+1;i++) {
			max=Math.max(max,t2[i]+t1[k-i]);
			
		}
		System.out.println(max);
          return max;
	}}



