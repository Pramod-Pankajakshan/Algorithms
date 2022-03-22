package srch;

import java.util.HashMap;
import java.util.Set;

public class BinarySearchRotated {

public static void main(String[] args) {
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		Set<Integer> set=hm.keySet();
		for(Integer a:set){
			
		}
		int h[]={3,4,5,6,7,8,0,1,2};
		BinarySearchRotated a=new BinarySearchRotated();
		int position=search(h,0,8,0);
		System.out.println(findMin(h));
		System.out.println(position);
		
	}
	
	/**
	 * while low less than or equal to high loop it, get the mid everytime, low must be mid plus one 
	 * and high must be mid minus one and return mid or return -1
	 * @param k
	 * @param h
	 * @return
	 */
	static int search(int h[],int low,int high,int key){
		
		int mid=(low+high)/2; //1
		if(h[mid]==key) return mid;//2
		if(h[low]<=h[mid]){//  means this is sorted
			if(key>=h[low]&&key<=h[mid])
				return search(h,low,mid-1,key);
			return search(h,mid+1,high,key);//search other side
		}		
			if(key>=h[mid]&&key<=h[high])
				return search(h,mid+1,high,key);		
			return search(h,low,mid-1,key);
		
	}
	
	//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/discuss/48493/Compact-and-clean-C++-solution
	// leetcode 153
	static int findMin(int[] num) {
	        int start=0,end=num.length-1;
	        
	        while (start<end) {
	            if (num[start]<num[end])
	                return num[start];
	            // else find the mid and check if 
	            // mid is bigger than start
	            
	            int mid = (start+end)/2;
	            
	            if (num[mid]>=num[start]) {
	                start = mid+1;
	            } else {
	                end = mid;
	            }
	        }
	        
	        return num[start];
	    }
}
