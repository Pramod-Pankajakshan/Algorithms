


package array;

import java.util.HashMap;
import java.util.Map;

public class ThreeSum {
	public static void main(String[] args) {
		System.out.println("ok");
		ThreeSum ts= new ThreeSum();
		ts.wrap(6);
	}
	
	void wrap(int sum) {
		int h[]= {4,1,2,3,7,5,6};
		for(int i: h) {
			threesum(i,sum-i,h);
		}
	}
	
	void threesum(int ex,int rsum,int h[]) {
				
		Map<Integer,Integer> mp= new HashMap<Integer,Integer>();
		//System.out.println(rsum);System.out.println(ex);
		for(int i: h) {
			if(i!=ex) {
			if(mp.get(i)!=null) {
			  System.out.println(i+"-"+mp.get(i)+"-"+ex);
			}else {
				mp.put(rsum-i, i);
			}
			}
			
		}
		//System.out.println("=================");
		
	}
}