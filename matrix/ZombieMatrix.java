package matrix;

public class ZombieMatrix {
	public static void main(String[] args) {
		int mat[][] = new int[][] { { 0, 1, 1, 0, 1 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0 } };

		int mat2[][] = new int[][] { { 0, 1 }, { 0, 0 }, { 0, 0 }, { 0, 0 } };

		ZombieMatrix zm = new ZombieMatrix();
		zm.infect(mat);
		System.out.println(zm.h);

	}

	/**
	 * Given a 2D grid, each cell is either a zombie 1 or a human 0. Zombies can
	 * turn adjacent (up/down/left/right) human beings into zombies every hour. Find
	 * out how many hours does it take to infect all humans?
	 * 
	 * @param mat
	 */
	int h = 0;

	private void infect(int[][] oldmatrix) {

		int[][] newmatrix = new int[oldmatrix.length][oldmatrix[0].length];
		boolean pplcnt = false;
		for (int i = 0; i < oldmatrix.length; i++) {
			for (int j = 0; j < oldmatrix[0].length; j++) {
				// run once

				if (oldmatrix[i][j] == 0) {
					pplcnt = true;
				}
				if (oldmatrix[i][j] == 1) {
					newmatrix[i][j] = 1;
					if (check(newmatrix, i + 1, j) && oldmatrix[i + 1][j] == 0) {
						newmatrix[i + 1][j] = 1;
					}
					if (check(newmatrix, i - 1, j) && oldmatrix[i - 1][j] == 0) {
						newmatrix[i - 1][j] = 1;
					}
					if (check(newmatrix, i, j - 1) && oldmatrix[i][j - 1] == 0) {
						newmatrix[i][j - 1] = 1;
					}
					if (check(newmatrix, i, j + 1) && oldmatrix[i][j + 1] == 0) {
						newmatrix[i][j + 1] = 1;
					}
				}

			}
		}
		if (pplcnt) { // if there was one zero, then increment and call again
			h++;
			infect(newmatrix);
		}
	}

	private boolean check(int[][] mat, int i, int j) {
		return (!(i < 0 || j < 0 || i > mat.length - 1 || j > mat[0].length - 1));
	}

}
