package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class HeightToQueue {
	
	/** 406
	 * https://leetcode.com/problems/queue-reconstruction-by-height/description/
	 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k),
	 * where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h.
	 * Write an algorithm to reconstruct the queue.
		Note:
		The number of people is less than 1,100.
		Example
		
		Input:
		[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
		
		Output:
		[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
	 * @param args
	 */
	public static void main(String[] args) {
		int g[][]= new int [][]{
			      { 7, 0 }	,
			      { 4, 4 }	,
			      { 7, 1 }	,
			      { 5, 0 }	,
			      { 6, 1 }	,
			      { 5, 2 }	
				};
	    //int j[][]=reconstructQueue(g);
		int j[][]=reconstructQueue2(g);
		
		for(int i=0;i<j.length;i++) {
			System.out.println(j[i][0]+""+j[i][1]);			
		}
		
	}
	public static int[][] reconstructQueue(int[][] people) {
    Arrays.sort(people,new Comparator<int[]>(){
        public int compare(int[] p1, int[] p2){
            return p1[0]!=p2[0]?Integer.compare(p2[0],p1[0]): Integer.compare(p1[1],p2[1]);
        }
     });
     List<int[]> list = new LinkedList();
     for (int[] ppl: people) {
    	 list.add(ppl[1], ppl);
     }
     return list.toArray(new int[people.length][] );
 }
	// Check if their height is same, then compare ppl in front
	// else compare height - default sort
	// [[7,0], [4,4], [7,1], 
	//  44,70,71
	// now insert to list by number of ppl in front
	// 0 mein 7 dalo
	// 1 mein 7 dalo
	// 4 mein 4 dalo
	// insert into the middle use a linkedlist
	
	public static int[][] reconstructQueue2(int[][] people) {
	    Arrays.sort(people,new Comparator<int[]>(){
	        public int compare(int[] p1, int[] p2){
	            return p1[0]!=p2[0]?Integer.compare(p2[0],p1[0]): Integer.compare(p1[1],p2[1]);
	        }
	     });
	     List<int[]> list = new LinkedList();//
	     for (int[] ppl: people) {
	    	 list.add(ppl[1], ppl);
	     }
	     return list.toArray(new int[people.length][] );
	 }


}
