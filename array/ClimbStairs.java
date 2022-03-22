package array;

public class ClimbStairs {
public static void main(String arg[]){

	//System.out.println(climbStairs(31));
	System.out.println(climbStairs(31));

}
public static int climbStairs(int n) {
    if (n == 1) {
        return 1;
    }
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}
}


