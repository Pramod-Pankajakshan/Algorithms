package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// with dupes like 1,1,3 - it will ignore dupes
public class CombinationSum {
public static void main(String arg[]){
     int h[]= {1,2,3,4};
    // Integer[] i= new Integer[h.length];
     
	CombinationSum s= new CombinationSum();
	List<List<Integer>> ls=s.combinationSum(h,5);
    for(List<Integer> l: ls) {
    	for(int i:l) {
    		System.out.print(i);
    	}
    	System.out.println();
    }
}

//int h[]= {1,2,3,4};
//CombinationSum s= new CombinationSum();
//List<List<Integer>> ls=s.combinationSum(h,5);
public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<Integer>(), nums, target, 0);
    return list;
}
private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
    if(remain < 0) return;
    else if(remain == 0) list.add(new ArrayList<>(tempList));
    else{ 
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
            tempList.remove(tempList.size() - 1);
        }
    }
}

}



