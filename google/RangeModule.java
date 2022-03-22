package google;

import java.util.*;


public class RangeModule {

	public static void main(String args[]) {
		RangeModule rm=new  RangeModule();
		rm.addRange(10, 20);
		rm.addRange(11, 19);
		rm.addRange(11, 22);
		rm.addRange(9, 22);
	}

	
	    private TreeMap<Integer, Integer> map = new TreeMap<>();

	    public void addRange(int left, int right) {
	    
	    	if(map.get(map.floorKey(left))>right) {
	    		return;
	    	}
	    	
	    	if(map.get(map.floorKey(left))<right) {
	    		map.put(map.floorKey(left),right);
	    		return;
	    	}
	    	if(map.get(map.floorKey(left))==null)) {
	    		map.put(map.floorKey(left),right);
	    		return;
	    	}
	    	map.put(left,right);
	     
	   
	    }

	    public boolean queryRange(int left, int right) {
	    
	    return true;
	    }

	    public void removeRange(int left, int right) {
	     
	    }
	

}

