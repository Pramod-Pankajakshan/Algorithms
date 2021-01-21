package dynamic;

import java.util.Arrays;

public class CoinsDp {

	
	public static void main(String[] args) {
		int []g={1,2,5};
		
		System.out.println("==>"+coinChangeMinNeeed(g,11));
	}
	//==>1
	//[0, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21]//
	 public static int coinChangeMinNeeed(int[] coins, int amount) {
		    int max = amount + 1;
		    int[] dp = new int[amount + 1];
		    Arrays.fill(dp, max);
		    dp[0] = 0;// only this to 0
		    for (int value = 1; value <= amount; value++) {
		    	System.out.println("==>"+value);
		    	
		      for (int j = 0; j < coins.length; j++) {
		        if (coins[j] <= value) {
		          dp[value] = Math.min(dp[value], dp[value - coins[j]] + 1); // 1 ,2,5 for 3 u check for min of 3-2
		        }
		      }
		      System.out.println(Arrays.toString(dp));
		    }
		    return dp[amount] > amount ? -1 : dp[amount];
		  }
}


