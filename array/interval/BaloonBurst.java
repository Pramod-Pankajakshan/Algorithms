package array.interval;

import java.util.Arrays;
import java.util.Comparator;

public class BaloonBurst {
	
	public static class Interval{
		int start;
		int end;
	}
public static void main(String arg[]){

//int hj[][]= {{10,16},{2,8},{1,6},{7,12}};
	int hj[][]= {{7,10},{1,5},{3,6},{2,4},{1,4}};
int h=baloons(hj);

System.out.println(h);
}

//	int hj[][]= {{7,10},{1,5},{3,6},{2,4},{1,4}};
public static int  baloons(int[][] m){
	Arrays.sort(m, (a,b)-> a[1]-b[1]);
	int c=1; int minEnd=m[0][1];
	for(int i=1;i<m.length;i++) {
		// start less than current end- merge scenario
		if(m[i][0]<minEnd) {		
			 if(minEnd>m[i][1]){ // check on end
				 minEnd=m[i][1];
			 }
		}else {
			c++; // increment here
			 minEnd=Math.max(m[i][1], minEnd);
		}
	}
	
	return c;
}






}



