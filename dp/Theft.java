import java.io.*; 
  
class Theft  
{ 
    // Function to calculate the maximum stolen value 
    static int maxLoot(int hval[], int n) 
    { 
        if (n == 0) 
        return 0; 
        if (n == 1) 
            return hval[0]; 
        if (n == 2) 
            return Math.max(hval[0], hval[1]); 
   
        // dp[i] represent the maximum value stolen 
        // so far after reaching house i. 
        int[] dp = new int[n]; 
   
        // define base case to start
        dp[0] = hval[0]; 
        dp[1] = Math.max(hval[0], hval[1]); // take max of both 
        
        for (int i = 2; i<n; i++) 
            dp[i] = Math.max(hval[i]+dp[i-2], dp[i-1]); 
   
        return dp[n-1]; 
    } 
      
    // Driver program 
    public static void main (String[] args)  
    { 
        int hval[] ={ 12, 9, 7, 33 }; ;
        int n = hval.length; 
        System.out.println("Maximum loot value : " + maxLoot(hval, n)); 
    } 
} 