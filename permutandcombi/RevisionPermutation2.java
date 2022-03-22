package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * Input: [1,2,3]
		Output:
		[
		  [1,2,3],
		  [1,3,2],
		  [2,1,3],
		  [2,3,1],
		  [3,1,2],
		  [3,2,1]
		]
 * @author pramod
 *
 */

public class RevisionPermutation2 {
	
	public static void main(String[] args) {
		
		
		
		
		List<List<Integer>> finalList= new ArrayList<List<Integer>>();
		int[] i= {1,1,3};
		for(int j:i) {
			char g=(char) ('0'+j);
			System.out.println(g);
		}
		
		List<String> ls = new ArrayList<>();
		ls.add("a"); ls.size();  ls.add(0, "ws");
		
		
		Set<String> s= new HashSet<String>();
		List<Integer> t= new ArrayList<Integer>();
		RevisionPermutation2 rp= new RevisionPermutation2();
		
		rp.backtrack(finalList,i,s,t,0);
		for(List<Integer> l: finalList) {
			System.out.println(Arrays.toString(l.toArray()));
		}
	}
	
	// take the first int
	// back track
	// keep track of added
	// when size is met - store
	// remove when u return
	
	public void backtrack(List<List<Integer>> finalList, int[] input, Set<String> addedSet,List<Integer> temp, int pos) {
		
	
		if(temp.size()==input.length) {
			finalList.add(new ArrayList<>(temp));
			System.out.println(Arrays.toString(temp.toArray()));			
			return;
		}
		
		for(int i=0;i<input.length;i++) {
			
			if(!addedSet.contains(i+"-"+input[i])){
			 addedSet.add(i+"-"+input[i]);
			 temp.add(pos, (input[i]));
			 pos=pos+1;
			 backtrack(finalList,input, addedSet, temp,pos);
			 pos=pos-1;
			 temp.remove(pos);
			 addedSet.remove(i+"-"+input[i]);			
			}			
			
		}
			
	}
	
	
	
	

}
