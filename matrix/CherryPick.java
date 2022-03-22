package matrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CherryPick {

	public static void main(String[] args) {
		int j[][] =
				{		{ 0, 1, -1 },
						{ 1, 0, -1 },
						{ 1, 1, 1 }
				};

		Set<Object> hs = new HashSet<>();
		cp(0, 0, j, hs, 0, false);
		System.out.println("------------" + fval);
		Object[] f = map.get(fval);
		for (Object dd : f)
			System.out.println("..." + (String) dd);
		Set<Object> set = new HashSet<>(Arrays.asList(f));
		cp(j.length - 1, j[0].length - 1, j, set, 0, true);
		System.out.println(ffval + fval);

	}

	public static int fval = 0;
	public static int ffval = 0;
	public static Map<Integer, Object[]> map = new HashMap<>();
	public static Map<Integer, Object[]> map2 = new HashMap<>();
	public static void cp(int i, int j, int m[][], Set<Object> hs, int val, boolean reverse) {
		// see if right is valid
		// check if values is 1
		// mark as visited
		// check if its end save the max value
		// see if down is valid
		if (!reverse) {
			System.out.println(i + "---" + j);
			if (i == m.length - 1 && j == m[0].length - 1) {
				System.out.println("->" + val);
				if (val > fval) {
					fval = val;
					map.put(fval, hs.toArray());
				}
				return;
			}
			if (i + 1 < m.length && !hs.contains(i + 1 + "-" + (j)) && m[i + 1][j] != -1) {
				hs.add((i + 1) + "-" + j);
				cp(i + 1, j, m, hs, val + m[i + 1][j], reverse);
				hs.remove((i + 1) + "-" + j);
			}
			if (j + 1 < m[0].length && !hs.contains(i + "-" + (j + 1)) && m[i][j + 1] != -1) {
				hs.add((i) + "-" + (j + 1));
				cp(i, j + 1, m, hs, val + m[i][j + 1], reverse);
				hs.remove((i) + "-" + (j + 1));
			}
			return;
		} else {
			System.out.println(i + "---" + j);
			if (i == 0 && j == 0) {
				System.out.println("->" + val);
				ffval = Math.max(val, ffval);
				map2.put(ffval, hs.toArray());
				return;
			}
			if (i - 1 >= 0 && m[i - 1][j] != -1) {
				int v = val;
				if (hs.contains((i - 1) + "-" + j)) {
					System.out.println("und");
					v = val;
				} else {
					v = val + m[i - 1][j];
				}
				cp(i - 1, j, m, hs, v, reverse);
			}
			if (j - 1 >= 0 && m[i][j - 1] != -1) {
				int v = val;
				if (hs.contains((i) + "-" + (j - 1))) {
					System.out.println("und");
					v = val;
				} else {
					v = val + m[i][j - 1];
				}
				cp(i, j - 1, m, hs, v, reverse);
			}
			return;
		}
	}
}