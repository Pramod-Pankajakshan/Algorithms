package matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobotPath {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } };
		Set<String> st = new HashSet<String>();
		allPath(2, 2, arr, 0);
		// roboPath(2,2,arr,0,st, new ArrayList<String>(),"u");

	}

	static int[][] directions = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
	static Set<String> visited = new HashSet();
	static int count = 0;
	static void allPath(int i, int j, int[][] arr, int sum) {

	}

	static void roboPath(int i, int j, int[][] arr, int sum, Set<String> visited, List<String> path, String dir) {

		if (i == 0 && j == 0) {
			System.out.println("ok");
			for (String s : path) {
				System.out.print(s);
				System.out.print("/");
			}

		}

		if (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length && arr[i][j] != 1) {
			System.out.println(i + "&" + j + "||" + dir);
			visited.add(i + "-" + j);
			int d = 0;
			int u = 0;
			int r = 0;
			int l = 0;
			while (d == 0 || u == 0 || l == 0 || r == 0) {
				i = i - 1;
				j = j;
				path.add((i) + "--" + j);
				roboPath(i, j, arr, sum, visited, path, dir);
				if (dir.equals("u") && u == 0) {
					dir = "r";
					u = 1;
				}
				if (dir.equals("r") && r == 0) {
					dir = "d";
					r = 1;
				}
				if (dir.equals("d") && d == 0) {
					dir = "l";
					d = 1;
				}
				if (dir.equals("l") && l == 0) {
					dir = "u";
					l = 1;
				}
			}

			visited.remove(i + "-" + j);
		} else {
			System.out.println(i + "&" + j + "||" + dir + "->");

			for (String s : path) {
				System.out.print(s + "> ");
			}
			System.out.println("returning...");

		}

	}

	/**
	 * { 0, 0, 1}, { 0, 0, 0}, { 0, 0, 0}
	 */

}
