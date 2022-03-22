package beforeexam.classics;

import java.util.*;


public class BinarySearch {

	public static void main(String args[]) {

		binarySearch(new int[] {5,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,10},8);
		searchRange(new int[] {5,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,10},8);

	}

      
      private static int binarySearch(int[] in, int t){
	     int l=0; int r=in.length;
	  while(l<=r){
		  int mid=l+(r-l)/2;
		  if(in[mid]>t){ 
			  r=mid-1;
		  }else if(in[mid]<t){
			  l=mid+1;
		  }else{
			  System.out.println("->"+mid);
			  r=mid;
			  if(mid==0||in[mid]!=in[mid-1]){
				  System.out.println(mid);
			   return mid;
			  }
		  }
		  }
	  return -1;
	  }
      
      public static int[] searchRange(int[] nums, int target) {          
          int firstOccurrence = findBound(nums, target, true);          
          if (firstOccurrence == -1) {
              return new int[]{-1, -1};
          }          
          int lastOccurrence = findBound(nums, target, false);          
          return new int[]{firstOccurrence, lastOccurrence};
      }
      //34. Find First and Last Position of Element in Sorted Array
      private static int findBound(int[] nums, int target, boolean isFirst) {
          int l = 0, r = nums.length - 1;          
          while (l <= r) {              
              int mid = (l + r) / 2;              
              if (nums[mid] == target) {                  
                  if (isFirst) {                      
                      // This means we found our lower bound.
                      if (mid == l || nums[mid - 1] != target) {
                          return mid;
                      }                      
                      // Search on the left side for the bound.
                      r = mid - 1;                      
                  } else {                      
                      // This means we found our upper bound.
                      if (mid == r || nums[mid + 1] != target) {
                          return mid;
                      }                      
                      // Search on the right side for the bound.
                      l = mid + 1;
                  }
                  
              } else if (nums[mid] > target) {
                  r = mid - 1;
              } else {
                  l = mid + 1;
              }
          }
          
          return -1;
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
  	} // landr<=mid+1mid-1
}

