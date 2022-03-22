package google;

import java.util.*;


public class LargestRectangleInHistogram {

	public static void main(String args[]) {
		largestRectangleArea(new int[] {2,5,6});//{2,1,5,6,2,3}
	}

	 public static int largestRectangleArea(int[] heights) {
	        int maxarea = 0;// try from each i
	        for (int i = 0; i < heights.length; i++) { // from left to right
	            int minheight = Integer.MAX_VALUE;
	            for (int j = i; j < heights.length; j++) {// from current pos to right get the lowest height & get the max area of it
	                minheight = Math.min(minheight, heights[j]);
	                System.out.println("min of"+minheight+" and "+heights[j]+" = "+minheight);
	                maxarea = Math.max(maxarea, minheight * (j - i + 1)); // get lowest height 
	               // System.out.println("Area is   "+maxarea);

	            }
	            System.out.println("Area is   "+maxarea);
	        }
	        System.out.println(maxarea);
	        return maxarea;
	    }
}

