package leetcode;

import java.util.HashMap;

public class Heater {

	public static void main(String[] args) {
		int g[] = {1,2,3,4};
		int h[]= {3};
		System.out.println(findRadius(g,h));
	}


	
	
	    //1234 - 31
	    public static int findRadius(int[] houses, int[] heaters) {
	        int min=Integer.MAX_VALUE;
	        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	        for(int h:houses){
	            hm.put(h,min);
	        }
	        for(int h:houses){
	         for(int he:heaters){
	            // get the distance 
	             int dis=Math.abs(h-he);
	            // check if its min
	              if(hm.get(h)!=null&&dis<hm.get(h))               
	                hm.put(h,dis);             
	        }
	        }
	        int minrad=0;
	        for(Integer key : hm.keySet()){
	         
	             minrad= hm.get(key)>minrad?hm.get(key):minrad;
	            
	            
	        }
	        return minrad;
	    }
	
}
