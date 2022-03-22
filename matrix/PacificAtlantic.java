package matrix;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.List;

import java.util.Set;

public class PacificAtlantic {

	public static void main(String[] args) {

		int j[][] = {

				{ 1, 2, 2, 3, 5 },

				{ 3, 2, 3, 4, 4 },

				{ 2, 4, 5, 3, 1 },

				{ 6, 7, 1, 4, 5 },

				{ 5, 1, 1, 2, 4 }

		};

		checkflow(j);

	}

	// for each position

	// look for lower number

	// more left / up and right / down

	// store visited

	// repeat

	public static List<List<Integer>> checkflow(int m[][]) {

		List<List<Integer>> lm = new ArrayList<List<Integer>>();

		Set<String> hs = new HashSet<>();

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				hs = new HashSet<>();
				// i=2;j=2;
				toAtl(i, j, m, hs);
				hs = new HashSet<>();
				// System.out.println("================================");
				toPac(i, j, m, hs);
				// i=7;j=9;
				// System.out.println(a);System.out.println(aa);System.out.println("====");
				if (a && aa) {
					aa = false;
					a = false;
					List<Integer> s = new ArrayList<>();
					s.add(i);
					s.add(j);
					System.out.println("====");
					System.out.println(i + "-" + j);
					lm.add(s);
					}
			}
		}
		System.out.println(lm.size());
		return lm;
	}

	static boolean a = false;
	static boolean op = false;

	static void toAtl(int i, int j, int m[][], Set<String> se) {
		if (i == 0 || j == 0) {
			// System.out.println("a");
			a = true;
			return;
		}
		if (i + 1 < m.length && m[i + 1][j] <= m[i][j] && !se.contains((i + 1) + "-" + j)) {
			se.add((i + 1) + "-" + j);
			toAtl(i + 1, j, m, se);
			se.remove((i + 1) + "-" + j);
		}
		if (j + 1 < m[0].length && m[i][j + 1] <= m[i][j] && !se.contains(i + "-" + (j + 1))) {
			se.add(i + "-" + (j + 1));
			toAtl(i, j + 1, m, se);
			se.remove(i + "-" + (j + 1));
		}
		if (i - 1 >= 0 && m[i - 1][j] <= m[i][j] && !se.contains(i - 1 + "-" + j)) {
			se.add(i - 1 + "-" + j);
			toAtl(i - 1, j, m, se);
			se.remove(i - 1 + "-" + j);
		}
		if (j - 1 >= 0 && m[i][j - 1] <= m[i][j] && !se.contains(i + "-" + (j - 1))) {
			se.add(i + "-" + (j - 1));
			toAtl(i, j - 1, m, se);
			se.remove(i + "-" + (j - 1));
		}
		return;
	}

	static boolean aa = false;
	static void toPac(int i, int j, int m[][], Set<String> se) {
		// System.out.println("----");

		// System.out.println(m[i][j]);

		// System.out.println(i+"--"+j);

		if (i == m.length - 1 || j == m.length - 1) {

			// System.out.println("b");

			aa = true;

			// System.out.println(aa);

			return;

		}

		if (i + 1 < m.length && m[i + 1][j] <= m[i][j] && !se.contains((i + 1) + "-" + j)) {

			se.add((i + 1) + "-" + j);

			toPac(i + 1, j, m, se);

			se.remove((i + 1) + "-" + j);

		}

		if (j + 1 < m[0].length && m[i][j + 1] <= m[i][j] && !se.contains(i + "-" + (j + 1))) {

			se.add(i + "-" + (j + 1));

			toPac(i, j + 1, m, se);
			se.remove(i + "-" + (j + 1));

		}

		if (i - 1 >= 0 && m[i - 1][j] <= m[i][j] && !se.contains(i - 1 + "-" + j)) {

			se.add(i - 1 + "-" + j);

			toPac(i - 1, j, m, se);
			se.remove(i - 1 + "-" + j);

		}

		if (j - 1 >= 0 && m[i][j - 1] <= m[i][j] && !se.contains(i + "-" + (j - 1))) {

			se.add(i + "-" + (j - 1));

			toPac(i, j - 1, m, se);
			se.remove(i + "-" + (j - 1));

		}

		return;

	}

}
