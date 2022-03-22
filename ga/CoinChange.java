package ga;
/* Dynamic Programming Java implementation of Coin 
Change problem */
import java.util.Arrays; 

class CoinChange 
{ 
// coin change - for each coin get all possible maches till value
 static long countWays(int S[], int m, int value) 
 { 
     long[] table = new long[value+1]; 
     table[0] = 1; 
     for (int i=0; i<S.length; i++) {
    	 	int	currCoin=S[i];
         for (int j=currCoin; j<=value; j++) 
             table[j] =table[j]+ table[j-currCoin]; 
     }
     return table[value]; 
 } 

 // Driver Function to test above function 
 public static void main(String args[]) 
 { 
     int arr[] = {1,2}; 
     int m = arr.length; 
     int n = 4; 
     System.out.println(countWays(arr, m, n)); 
 } 
} 