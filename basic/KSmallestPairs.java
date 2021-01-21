package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallestPairs {
	
	public static void main(String[] args) {
		
	}

	private void ks(int []a, int []b, int k) {
		
		PriorityQueue<int[]> pq= new PriorityQueue<>(k,new Comparator<int[]>() {
		public int compare(int[] o1, int[] o2) {
			
			return o1[0]+o1[1] -  o2[0]+o2[1];
		}
		});
		
		
		
	}
	
}
