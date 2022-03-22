package array;

public class Koko {
//https://leetcode.com/problems/koko-eating-bananas/
	public static void main(String[] args) {
		//Input: piles = [3,6,7,11], H = 8
		//		Output: 4
		
		Koko k = new Koko();
		k.minEatingSpeed(new int[] {3, 6,7,11},8);
	}
	
	
	    public int minEatingSpeed(int[] piles, int H) {
	      int max=0;
	        for(int i:piles){
	          if(i>max) max=i;
	      }  
	        System.out.println(max);
	   return binSrch(0,max,piles,H);
	    
	    
	    }
       private int binSrch(int min,int max, int in[], int h){
	        while(min<max){
	            int mid=min+(max-min)/2;	            
	            if(isValid(mid,in,h)){
	                max=mid;
	            }else{
	                min=mid+1;
	            }     
	        }	        
	     return min;   
	    }
	    boolean isValid(int v,int[] in, int hr){
	         int h=0;
	        for(int i=0;i<in.length;i++){
	            int vl=in[i]; 
	            while(vl>0){
	                vl=vl-v;
	                h++;
	            }            
	        }
	        return h>hr?false:true;
	    }
	    
	    
	  
	}

