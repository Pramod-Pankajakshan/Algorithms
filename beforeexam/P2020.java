package beforeexam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P2020{

public static void main(String[] args) {
	
	
	String[] df=new String[]{"",""};
	
}	
	


   public static void testRecur(int nums[], String ss,int pos) {
	   if(pos>nums.length) return;
	     System.out.println(ss);
	   for(int i=0;i<nums.length;i++) {
	    testRecur(nums,ss+"-"+nums[i],pos+1);
	   }
   }
  
	
}