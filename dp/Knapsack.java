package dynamic;

/**
Suppose we have a knapsack which can hold int w = 10 weight units. We have a total of int n = 4 items to choose from, 
whose values are represented by an array int[] val = {10, 40, 30, 50} and weights represented by an array int[] wt = {5, 4, 6, 3}.
Since this is the 0–1 knapsack problem, we can either include an item in our knapsack or exclude it,
 but not include a fraction of it, or include it multiple times.
 
 n items
 w limit =10

 table of n+1 rows
 w+1 columns
 
 Total weight is less than or equal to a given limit and total value is as large as possible
 
*/


import java.util.Arrays;

public class Knapsack {
    public static void main(String args[]) {
        int w = 10;
        int n = 4;
        int[] val = {10, 40, 30, 50};
        int[] wg = {5, 4, 6, 3};
        // Populate base cases
        int[][] dp = new int[n + 1][w + 1];       
        //---> set the limiting factor
        // downwards is the value        
        //  Knapsack Main logic
        for (int i = 1; i <= n; i++) { // items
            for (int j = 1; j <= w; j++) { // weight 1-10
                int ii=i-1;               
                if (j < wg[ii]) {  // wt=9 and wieghtarr=4 - check for prev row 5                 
                	dp[i][j] = dp[ii][j];  
                }else {
                	dp[i][j] = Math.max(dp[ii][j], val[ii]+ dp[ii][j - wg[ii]]);  
                }
                     // Pick the larger of the two - but one row up
            }
        }        
        System.out.println(dp[n][w]); // Final answer
        System.out.println(Arrays.deepToString(dp)); // Visualization of the table
      
    }
}