package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* prints 
 ***
*+
+*
++*/
public class AllCombinations {
	public static void main(String arg[]){
	     char h[]= {'+','*','-'};
	     //**
	     // *+
	     // +*
	     // ++
	     AllCombinations s= new AllCombinations();
		List<List<Character>> ls=s.subsets(h);
		for(List<Character> l: ls) {
	    	for(char i:l) {
	    		System.out.print(i);
	    	}
	    	System.out.println();
	    }
	}



		public List<List<Character>> subsets(char[] nums) {
			List<List<Character>> list = new ArrayList<>();
			
			backtrack(list, new ArrayList<Character>(), nums, 0);
			
			return list;
		}

		int size = 3;

		private void backtrack(List<List<Character>> finalLst, ArrayList<Character> tempList, char[] nums, int sm) {
			if (size == sm) {
				finalLst.add(new ArrayList<>(tempList));
			}
			if (sm > size)
				return;
			for (int i = 0; i < nums.length; i++) {
				tempList.add(nums[i]);
				backtrack(finalLst, tempList, nums, sm +1);
				tempList.remove(tempList.size() - 1);
			}
		}

}



