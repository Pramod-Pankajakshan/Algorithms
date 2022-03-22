package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// with dupes like 1,1,3 - it will ignore dupes
public class CombinationSumNoReUse {
public static void main(String arg[]){
     int h[]= {1,2,2,2,3,4,5,};
    
	CombinationSumNoReUse s= new CombinationSumNoReUse();
	List<List<Integer>> ls=s.combinationSum2(h,8);
    for(List<Integer> l: ls) {
    	for(int i:l) {
    		System.out.print(i);
    	}
    	System.out.println();
    }
}



public List<List<Integer>> combinationSum2(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<Integer>(), nums, target, 0);
    return list;
    
}

private void backtrack(List<List<Integer>> finalList, List<Integer> tempList, int [] nums, int remain, int start){
    if(remain < 0) return;
    else if(remain == 0) finalList.add(new ArrayList<>(tempList));
    else{
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            tempList.add(nums[i]);
            backtrack(finalList, tempList, nums, remain - nums[i], i + 1);
            tempList.remove(tempList.size() - 1); 
        }
    }
} 
}




