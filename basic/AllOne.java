package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class AllOne {
	

    /** Initialize your data structure here. */
    public AllOne() {
        
    }
    private String maxkey="";
    private String minkey="";
    private Stack<String> minStack= new Stack<>();
    private Stack<String> maxStack= new Stack<>();
      
   private    Map<String,Integer> map= new HashMap<>();
    
    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) { 
    	//a 1 b 1  a 2
        // get key and update
       int val=	map.getOrDefault(key, 0)+1;
       if(val>max) {
    	   max=val;
    	   maxkey=key;
       }
       if(val==1||val<min) {
    	   min=val;
    	   minkey=key;
       }
    	   map.put(key,val);    	
    }
    
    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
    	 int val=	map.getOrDefault(key, 0)-1;
    	  if(val==0)map.remove(key);
         if(val==max||val>max) {
        	 maxkey=key;
         }
         if(val<min) {
        	 min=val;
        	 minkey=key;
         }
      	   map.put(key,val);
    }
    
    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
		return maxkey;
        
    }
    
    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
		return minkey;
        
    }
}


