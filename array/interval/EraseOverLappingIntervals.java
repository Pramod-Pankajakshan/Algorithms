package array.interval;

import java.util.*;


public class EraseOverLappingIntervals {

	public static void main(String args[]) {

		eraseOverlapIntervals(new int[][] {{1,2},{2,3},{3,4},{1,3}});

	}

    public static int eraseOverlapIntervals(int[][] intervals) {
        int[][] m=intervals;
        if(m.length<=1)return 0;
    Arrays.sort(m, (a,b)-> a[1]-b[1]);
	int c=0; 
	int minEnd=m[0][1];// one
	for(int i=1;i<m.length;i++) {
		if(m[i][0]<minEnd) {		// start less than current end- merge scenario
			 if(minEnd>m[i][1]){ // check on end
				 minEnd=m[i][1];// keep smallest as min end
			 }            
            c++;// increment here
		}else {

			minEnd=Math.max(m[i][1], minEnd);
		}
	}
	
	return c;
    }

}

