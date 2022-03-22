package matrix;

public class MaximalSquare {

	

public static void main(String arg[]){

	char[][] ch= new char[][]{
		  { '1', '1', '1', '1' },//--> x  | is y
		  { '1', '1', '1', '1' },
		  { '1', '1', '1', '1' },//--> x  | is y
		  { '1', '1', '1', '0' },
		
		};
	System.out.println("Ans->"+maximalSquare(ch));
}

//Starting from index (0,0), for every 1 found in the original matrix, we update the value of the current element as


public static int maximalSquare(char[][] matrix) {
    int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
    int[][] dp = new int[rows + 1][cols + 1];// check neighbors and get min +1 - then take max of that and prev
    int maxsqlen = 0;
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= cols; j++) {
            if (matrix[i-1][j-1] == '1'){
                dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                maxsqlen = Math.max(maxsqlen, dp[i][j]);// all processing on this
            }
        }
    }
    return maxsqlen * maxsqlen;
}


}



