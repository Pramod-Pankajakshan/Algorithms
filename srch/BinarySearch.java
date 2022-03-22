package srch;

import java.util.HashMap;
import java.util.Set;

public class BinarySearch {

public static void main(String[] args) {
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		Set<Integer> set=hm.keySet();
		for(Integer a:set){
			
		}
		int h[]={1,2,3,4,5};
		BinarySearch a=new BinarySearch();
		int position=a.search(5,h);
		System.out.println(position);
		int position2=a.search2(5);
		System.out.println(position2);
	
	}
	
	/**
	 * while low less than or equal to high loop it, get the mid everytime, low must be mid plus one 
	 * and high must be mid minus one and return mid or return -1
	 * @param srchval
	 * @param in
	 * @return
	 */
	static int search(int srchval,int in[]){
		int l=0;
		int r=in.length-1; 
		while(l<=r){//missed =	
			int mid=(l+r)/2;			
			if(srchval>in[mid]){l=mid+1;}//missed low=mid+1
			else if(srchval<in[mid]){r=mid-1;}//missed high=mid-1
			else return mid;
		}		
	return -1;
	}
	
// when ever you want to find a switch - use this GGGGTTTTT
	public int search2(int n) { // n is the end value ok
	    int left = 1; // l=1;
	    int right = n;// r = 
	    while (left < right) {
	        int mid = left + (right - left) / 2;
	        if (isBadVersion(mid)) {
	            right = mid;
	        } else {
	            left = mid + 1;
	        }
	    }
	    return left;
	}
	
	private static boolean isBadVersion(int h) {
		return h>=4?true:false;
	}
	
	
	
	
}
