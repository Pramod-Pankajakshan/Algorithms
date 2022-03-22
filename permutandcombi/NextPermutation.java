package permutandcombi;

import java.util.Arrays;

public class NextPermutation {
	
	public static void main(String[] args) {
		NextPermutation npp= new NextPermutation();
		int [] nums= {1,2,3};
		npp.nextPermutation(nums);
	}
	
	public void nextPermutation(int[] nums) {
        StringBuilder sb= new StringBuilder();
       for(int i:nums){
           sb.append(i);
       }
     nm=nums;
       np(nums,"", Integer.parseInt(sb.toString()),0); 
       System.out.print(Arrays.toString(nm));
    }
    int diffMax=Integer.MAX_VALUE;
    
    int[] nm=null;
    
    private void np(int[] nums,String newnumber, int orig, int pos){
      System.out.println(newnumber);
        if(newnumber.length()>=3&&Integer.parseInt(newnumber)!=orig){
            if(new Integer(newnumber) > orig&& Integer.parseInt(newnumber)-orig<diffMax){
                diffMax=Integer.parseInt(newnumber)-orig;
                //System.out.print(Integer.parseInt(newnumber));
               char[] finall= newnumber.toCharArray();
                for(int i=0;i<finall.length;i++){
                    nm[i]='0'+finall[i];
                    
                }
            }
            return;
        }

        for(int i=pos;i<nums.length;i++){
          newnumber= newnumber+nums[i];
          np(nums,newnumber,orig, pos+1);
         if(!newnumber.equals(""))
          newnumber= newnumber.substring(0,newnumber.length()-1);  
          //System.out.println(">>---"+newnumber);
        }
    }

}
