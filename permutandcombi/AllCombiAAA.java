package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllCombiAAA {

	public static void main(String arg[]){
     int h[]= {1,2,3,4};
     AllCombiAAA s= new AllCombiAAA();
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

	int sum = 6;

	private void backtrack(List<List<Integer>> finalLst, ArrayList<Integer> tempList, int[] nums, int sm) {
		if (sum == sm) {
			finalLst.add(new ArrayList<>(tempList));
		}
		if (sm > sum)
			return;
		for (int i = 0; i < nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(finalLst, tempList, nums, sm + nums[i]);
			tempList.remove(tempList.size() - 1);
		}
	}

}


