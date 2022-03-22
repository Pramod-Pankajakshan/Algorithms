package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// prints permutations
// with dupes like 1,1,3 - it will ignore dupes
public class Permutations {
public static void main(String arg[]){
     int h[]= {1,2,3};
	Permutations s= new Permutations();
	List<List<Integer>> ls=s.permute(h);
    for(List<Integer> l: ls) {
    	for(int i:l) {
    		System.out.print(i);
    	}
    	System.out.println();
    }
}


public List<List<Integer>> permute(int[] nums) {
	   List<List<Integer>> list = new ArrayList<>();
	   permu3Parameters(list, new ArrayList<Integer>(), nums);	   
	   return list;
	}
    // check revision permutation
	private void permu3Parameters(List<List<Integer>> finalList, List<Integer> tempList, int [] nums){
	   if(tempList.size() == nums.length){// or a custom size
	      finalList.add(new ArrayList<>(tempList));
	   } else{
	      for(int i = 0; i < nums.length; i++){ 
	         if(tempList.contains(nums[i])) continue; // element already exists, skip
	         tempList.add(nums[i]);
	         permu3Parameters(finalList, tempList, nums);
	         tempList.remove(tempList.size() - 1);
	      }
	   }
	} 

	
	//Test
	private void permu3Parameters1(List<List<Integer>> list, List<Integer> tempList, int [] nums){
		 
		      list.add(new ArrayList<>(tempList));
		
		      for(int i = 0; i < nums.length; i++){ 
		         if(tempList.contains(nums[i])) continue; // element already exists, skip
		         tempList.add(nums[i]);
		         permu3Parameters1(list, tempList, nums);
		         tempList.remove(tempList.size() - 1);
		      }
		   
		} 
}



