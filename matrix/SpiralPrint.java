package matrix;

import java.util.HashSet;

public class SpiralPrint {
	// basically rowtsrt is incremented after its printed
	//

	// Function print matrix in spiral form
	static void spiralPrint(int rowMax, int colMax, int a[][]) {
		int i, rowStar = 0, colStar = 0;

		while (rowStar < rowMax && colStar < colMax) {
			// Print the first row from the remaining rows
			for (i = colStar; i < colMax; ++i) {
				System.out.print(a[rowStar][i] + " ");
			}
			rowStar++;

			// Print the last column from the remaining columns
			for (i = rowStar; i < rowMax; ++i) {
				System.out.print(a[i][colMax - 1] + " ");
			}
			colMax--;

			// Print the last row from the remaining rows */
			if (rowStar < rowMax) {
				for (i = colMax - 1; i >= colStar; --i) {
					System.out.print(a[rowMax - 1][i] + " ");
				}
				rowMax--;
			}

			// Print the first column from the remaining columns */
			if (colStar < colMax) {
				for (i = rowMax - 1; i >= rowStar; --i) {
					System.out.print(a[i][colStar] + " ");
				}
				colStar++;
			}
		}
	}

	// driver program
	public static void main(String[] args) {

		System.out.println(Math.pow(3, 4));
		int R = 3;
		int C = 6;
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		spiralPrint(R, C, a);
	}

}
