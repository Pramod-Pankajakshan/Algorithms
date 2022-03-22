package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationWithDuplicates {
public static void main(String arg[]){
  int ii[]= {1,2,2,3};

	List<List<Integer>> ls=	permuteWithDupe(ii);
	;
    for(List<Integer> l: ls) {
    	for(int i:l) {
    		System.out.print(i);
    	}
    	System.out.println();
    }

}

public static List<List<Integer>> permuteWithDupe(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
    return list;
}
// list, temp,nums, used
private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] used){
    if(tempList.size() == nums.length){
        list.add(new ArrayList<>(tempList));
    } else {
        for(int i = 0; i < nums.length; i++){
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1])
            		continue;
            used[i] = true; 
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, used);
            used[i] = false; 
            tempList.remove(tempList.size() - 1);
        }
    }
}

}



