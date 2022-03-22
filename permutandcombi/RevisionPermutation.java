package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Input: [1,2,3] Output: [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]
 * ]
 * 
 * @author pramod
 *
 */

public class RevisionPermutation {

	public static void main(String[] args) {
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		int[] i = { 1, 2, 3 };
		Set<Integer> s = new HashSet<Integer>();
		List<Integer> t = new ArrayList<Integer>();
		RevisionPermutation rp = new RevisionPermutation();

		rp.backtrack(finalList, i, s, t, 0);
		for (List<Integer> l : finalList) {
			System.out.println(Arrays.toString(l.toArray()));
		}
	}

	// take the first int
	// back track
	// keep track of added
	// when size is met - store
	// remove when u return

	public void backtrack(List<List<Integer>> finalList, int[] input, Set<Integer> addedSet, List<Integer> temp,int pos) {

		if (temp.size() == input.length) {
			finalList.add(new ArrayList<>(temp));
			System.out.println(Arrays.toString(temp.toArray()));
			return;
		}

		for (int i = 0; i < input.length; i++) {
			// check if the number is in set
			// else add to set
			// add to list by position
			if (!addedSet.contains(input[i])) {
				addedSet.add(input[i]);// for dupe check
					temp.add(pos, (input[i]));// add to an exact position - linkedlist is better
					pos = pos + 1;
					backtrack(finalList, input, addedSet, temp, pos);
					pos = pos - 1;
					temp.remove(pos);
				addedSet.remove(input[i]);
			}

		}

	}

}
