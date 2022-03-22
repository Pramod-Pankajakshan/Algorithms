package google;

import java.util.*;


public class MyCalendar {

	

	    public MyCalendar() {
	          this.tm = new TreeMap<>();
	    }
	      TreeMap<Integer,Integer> tm =null;
	    public boolean book(int start, int end) {
	        
	        if(tm.floorKey(start)!=null){
	            if(tm.get(this.tm.floorKey(start))>start) return false;
	        }
	        
	        if(tm.ceilingKey(start)!=null){
	            if(tm.ceilingKey(start)<end) return false;
	        }
	        
	         tm.put(start,end);
	        
	        return true;
	    }
	}



