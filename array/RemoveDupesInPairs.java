package array;

import java.util.Arrays;

public class RemoveDupesInPairs {
	
	
	public static void main(String arg[]){
	   int i[]= {1,1,2,2,2,2,2,2,2,2,2,3,3,3};
		int h=removeDuplicates(i);
	   System.out.println(h);
	}

	public static int removeDuplicates(int[] nums) {
	    int counter = 0;
	    for (int in : nums) {
	        if (counter < 2 || in > nums[counter-2]) {     // if counter is less than 2 just add that int
	        	// or the current number is diff than current value assessed
	            nums[counter] = in;// this  is to move those numbers
	            counter=counter+1;
	         
	        }
	      }
	    return counter;
	}
}



