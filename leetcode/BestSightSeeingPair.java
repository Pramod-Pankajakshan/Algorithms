package leetcode;

import java.util.*;


public class BestSightSeeingPair {

	public static void main(String args[]) {

		fn2(new int[] {8,14,1,16,25,6});

	}

	public static int fn(int[] in) {   
        int i=0;
		int max = in[i] + i;
        for(int j=1;j<in.length;j++){
            int curr = in[i] + in[j] + i - j;
            max = curr > max ? curr : max;
            
            // update the value of i to the one that maximizes
            if(in[i] + i < in[j] + j){
                i=j;
                  
            }
            System.out.println("prev max -"+in[i]);     
        }
        System.out.println(max);
        return max;
    }
	
	
	public static int fn2(int[] in) {   
        int i=0;
		int max = in[i] ;
        for(int j=1;j<in.length;j++){
            int curr = in[i] + in[j] ;
            max = curr > max ? curr : max;            
            // update the value of i to the one that maximizes
            if(in[i] < in[j] ){
                i=j;
                  
            }
            System.out.println("prev max -"+in[i]);     
        }
        System.out.println(max);
        return max;
    }
}

