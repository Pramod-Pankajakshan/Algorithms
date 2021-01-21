import java.util.Arrays;

// A Dynamic Programming solution for Rod cutting problem 
class RodCut 
{ 
    /* Returns the best obtainable price for a rod of 
       length n and price[] as prices of different pieces */
    static int cutRod(int price[],int n) 
    { 
        int val[] = new int[n+1]; 
        val[0] = 0;   
        for (int i = 1; i<=n; i++) { 
            for (int j = 0; j < i; j++) {
            	val[i] = Math.max(val[i],price[j] + val[i-j-1]);                 
            }          
        } 
         System.out.println(Arrays.toString(val));
        return val[n]; 
    } 
  
    /* Driver program to test above functions */
    public static void main(String args[]) 
    { 
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
        int size = arr.length; 
        System.out.println("Maximum Obtainable Value is " + 
                            cutRod(arr, size)); 
    } 
} 
/* This code is contributed by Rajat Mishra */
