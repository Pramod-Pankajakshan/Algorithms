package array;

import java.util.*;

public class LexicographicalAnalysis {

	// push alien order to hashmap
	// for each position 
	//   - compare
	   
	
	public static void main(String[] args) {
		LexicographicalAnalysis c= new LexicographicalAnalysis();
      	String[]	 words =new String[] {"hello","leetcode"};String order = "hlabcdefgijkmnopqrstuvwxyz";
		c.isAlienSorted(words, order);
	}
	

	    Map<Character,Integer> o;
	    public boolean isAlienSorted(String[] words, String order) {
	        o= new HashMap<>();
	       char[] p= order.toCharArray();
	       for(int i=0;i<order.length();i++){
	           o.put(p[i],i);
	       }
	        int pos=0;
	        for(String w :words){ 
	         pos=Integer.max(w.length()-1,pos);
	        }
	        for(int i=0;i<pos;i++){
	           boolean b= check(words,pos);
	            if(!b) {
	                return false;
	                
	            }
	        }
	        // order to array
	        // for each char in word
	        // check
	        return true;
	        
	    }
	    
	    
	    private boolean check(String[] words, int pos){
	        int curr=100;
	        int maxl=0;
	        // take each word 
	        for(String w :words){         
	            char[] f=w.toCharArray();
	            if(f.length<maxl){
	              return false;  
	            } else{
	            maxl=Integer.max(maxl,f.length-1);
	                }
	            if(pos>f.length-1) {
	            	
	            	continue;
	            }
	            if(curr<o.get(f[pos])){ //100 < 10
	                return false;
	            }else{  // 1
	                curr=o.get(f[pos]);
	            }
	        }
	    return true;
	      
	        
	    }
	}

