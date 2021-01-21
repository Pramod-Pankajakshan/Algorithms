package leetcode;

import java.util.Arrays;

public class PlusOne {
	
	
	public static void main(String[] args) {
		int h[]= {1,2,3};
		test(h,h);
	}

	//1234
	// 467
 static	void test(int[] in, int[] ad) {
		int res[]= new int[in.length+1];
		 int carry=0;
	  for(int i=0;i<in.length;i++) {
		   if(i<ad.length) {
			  int su=in[i]+ad[i]+carry;
			 
			  if(su>9) {carry=su/10;res[i]=su%10;}
			  else {carry=0;res[i]=su;}
	  	   }else {
	  		
	  		  int su=in[i]+carry;
	  	
			  if(su>9) {carry=su/10;res[i]=su%10;}
			  else {carry=0;res[i]=su;}
	  	   }
	  }
	  
	  System.out.println(Arrays.toString(res));
	}
	
}
