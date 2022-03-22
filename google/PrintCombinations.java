package google;

import java.util.*;

import permutandcombi.Subsets;


public class PrintCombinations {



	public static void main(String arg[]){
	     char h[]= {'a','b','p','c','p','l','e','a'};
		//char h[]= {'a','b','a','c','p','l'};
	     PrintCombinations ss= new PrintCombinations();
		List<List<Character>> ls=ss.subsets(h); 
	    for(List<Character> l: ls) {
	    	StringBuilder sb= new StringBuilder();
	    	for(char i:l) {
	    		sb=sb.append(i);	    		
	    	}
	    	if(sb.toString().equals("apple")) System.out.println("------------------------------"+sb.toString());
	    	System.out.println(sb.toString());
	    }
	}


		public List<List<Character>> subsets(char[] nums) {
			List<List<Character>> list = new ArrayList<>();
			//Arrays.sort(nums);
			backtrack(list, new ArrayList<Character>(), nums, 0);
			return list;
		}

		private void backtrack(List<List<Character>> finalList, ArrayList<Character> tempList, char[] nums, int idx) {
			finalList.add(new ArrayList<>(tempList));// no check and a counter
			for (int i = idx; i < nums.length; i++) {
				tempList.add(nums[i]);
				backtrack(finalList, tempList, nums, i + 1);
				tempList.remove(tempList.size() - 1);
			}
		}
		
		
}

