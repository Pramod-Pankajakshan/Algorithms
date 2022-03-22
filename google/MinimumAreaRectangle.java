package google;

import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class MinimumAreaRectangle {

	public static void main(String args[]) {

		int[][] clips = new int[][]{{1,1},{1,3},{3,1},{3,3},{2,2}};
		
		minimumAreaRectangle(clips);

	}

	private static void minimumAreaRectangle(int [][] p) {
		// Take two points in the same row
		// look for mathing points
		// compute -new int[][]{{1,1},{1,3},{3,1},{3,3},{2,2}};
		int fmin=Integer.MAX_VALUE;
		// put the list in a map of rows
		Map<Integer,List<Integer>> rMap= new HashMap<>();
		for(int i=0;i<p.length;i++) {
			List<Integer> ll=rMap.getOrDefault(p[i][0], new ArrayList<Integer>());
			ll.add(p[i][1]);
			rMap.put(p[i][0], ll);// push all columns to rows as a map
		}
		 int min = Integer.MAX_VALUE;
		for(int i=0;i<p.length;i++) {
			for(int j=0;j<p.length;j++) {
				// same rows
				 int row1=p[i][0];
				 int row2=p[j][0];
					int col1=p[i][1];
					int col2=p[j][1];
					if(col1==col2||row1==row2) continue;//!!!!!!!!!!!!!!!!!!!!!!!!!
					//{{1,1},{1,3},{3,1},{3,3},{2,2}}; 11 and 13
					if (rMap.get(row1).contains(col2) && rMap.get(row2).contains(col1)) { // find other two points
	                    min = Math.min(min, Math.abs(row1 -row2) * Math.abs(col1 - col2));
	                }
				}
	
			}
		
		
		System.out.println("==="+min);
		
	}

}

