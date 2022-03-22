package leetcode;

import java.util.Arrays;

public class PlusOne {
	
	
	public static void main(String[] args) {
		int h[]= {5,0,0,5};
		//test(h,h);
		sum(h,h);
	}

 private static  int[] sum(int[] in1,int[] in2) {
	  int res[]= new int[in1.length+1]; int carry=0;
	 for(int i=in1.length-1;i>=0;i--) {		 
		 int r=in1[i]+in2[i]+carry;
		 carry=r>9?1:0;
		 r=r%10;
		 res[i+1]=r;
	 }
	 res[0]=carry;
	  System.out.println(Arrays.toString(res));
	return res;
	 
 }
 
}
