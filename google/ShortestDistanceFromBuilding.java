package google;

import java.util.*;


public class ShortestDistanceFromBuilding {

	public static void main(String args[]) {
		int j[][] = {

				{ 1, 0, 0, 0, 0 },

				{ 0, 0, 0, 0, 0 },

				{ 0, 0, 0, 0, 1 },

				{ 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 },

		};
	}

	private static void bfs(int[][] in, int i, int j) {
		Set<String> st= new HashSet<>();
		// for position
		// push that to q
		// loop and add that to s
		// keep a visited one
		Queue<int[]> qu= new LinkedList<>();
		qu.add(new int[] {i,j});
		while(!qu.isEmpty()) {
			int[] r= qu.poll();
			
			
		}
		
		
	}
	
	private void fill(Queue<int[]> qu,int[] r,int[][] in) {
		
	}
}

