package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
public static void main(String arg[]){
     int h[]= {1,2,3};
	Subsets s= new Subsets();
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

	private void backtrack(List<List<Integer>> finalList, ArrayList<Integer> tempList, int[] nums, int idx) {
		finalList.add(new ArrayList<>(tempList));// no check and a counter
		for (int i = idx; i < nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(finalList, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}

}


