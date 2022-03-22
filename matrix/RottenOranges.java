package matrix;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RottenOranges {

	private void gridUpdate(int[][] matx, Queue<int[]> queue, int c) {
		for (int i = 0; i < matx.length; i++) {
			for (int j = 0; j < matx[0].length; j++) {
				if (matx[i][j] == 2) {
					updateNext(queue, matx, i, j);// get the good oranges around rotten to a q
				}
			}
		}
		if (queue.isEmpty()) {
			System.out.println("--" + c);
			return;
		}
		while (!queue.isEmpty()) {
			int h[] = queue.poll();
			matx[h[0]][h[1]] = 2;
		}
		c = c + 1;
		gridUpdate(matx, queue, c);

	}

	void updateNext(Queue<int[]> que, int[][] matrix, int i, int j) {
		int l = i - 1;int r = i + 1;int d = j + 1;int u = j - 1;
		if (!(l < 0 || l >= matrix.length)&&matrix[l][j] == 1) que.add(new int[] { l, j });
		if (!(r < 0 || r >= matrix.length)&&matrix[r][j] == 1) que.add(new int[] { r, j });
		if (!(d < 0 || d >= matrix.length)&&matrix[i][d] == 1)que.add(new int[] { i, d });
		if (!(u < 0 || u >= matrix.length)&&matrix[i][u] == 1)que.add(new int[] { i, u });
	}
	public static void main(String[] args) {
		int[][] dd = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		RottenOranges rc = new RottenOranges();
		Queue<int[]> s = new LinkedList<>();
		rc.gridUpdate(dd, s, 0);
	}
	
	/***
	 * 
	 * 
	 * 
	 * In a given grid, each cell can have one of three values:
	 * 
	 * the value 0 representing an empty cell; the value 1 representing a fresh
	 * orange; the value 2 representing a rotten orange. Every minute, any fresh
	 * orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
	 * 
	 * Return the minimum number of minutes that must elapse until no cell has a
	 * fresh orange. If this is impossible, return -1 instead.
	 * 
	 * 
	 * @param args
	 */

	// get the grid
	// check each location
	// create new g


}
