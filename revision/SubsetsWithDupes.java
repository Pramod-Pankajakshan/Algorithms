package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// with dupes like 1,1,3 - it will ignore dupes
public class SubsetsWithDupes {
public static void main(String arg[]){
     int h[]= {1,2,3};
	SubsetsWithDupes s= new SubsetsWithDupes();
	List<List<Integer>> ls=s.subsets(h);
    for(List<Integer> l: ls) {
    	for(int i:l) {
    		System.out.print(i);
    	}
    	System.out.println();
    }
}



public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<Integer>(), nums, 0);
    return list;
}




private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
} 


}



