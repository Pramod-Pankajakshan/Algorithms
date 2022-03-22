package ga;

import java.util.Arrays;
/**
 * 
 * 	Problem 1 Longest Common Sub*!?*
	Given two strings X = x1, x2, . . . , xn and Y = y1, y2, . . . , ym give a dynamic programming
	algorithm to find the length k of the longest string Z = z1, . . . , zk where Z appears as a substring
	of X and as a subsequence of Y . Recall, a substring is consecutive elements.
	For example, for the following input:
	X = a, b, d, b, a, b, f, g, d
	Y = b, e, t, f, d, b, f, a, f, r
	then the answer is 4 (since, b, d, b, a is a substring of X and it is also a subsequence of Y). You do
	not need to output the actual substring, just its length.
 * @author pramod
 *
 */
public class DpLcstar {

	private static void lcsstar(int x[],int y[]) {
		
		int [][] ij=new int[x.length][y.length];
		
		for (int i=0;i<1;i++) {
			for (int j=0;j<1;j++) {
				  ij[i][j]=0;
			}
		}
		int max=0;
		for (int i=1;i<x.length;i++) {			
			for (int j=1;j<y.length;j++) {
			  if(x[i-1]==y[j-1]) {
				  ij[i][j]= ij[i-1][j-1]+1;
			  }else {
				  ij[i][j]= ij[i][j-1];
			  }
			  if(ij[i][j]>max)max=ij[i][j];
			}
		}
		System.out.println("Answer is ->"+max);
		print2D(ij);
	}
	
    public static void print2D(int mat[][]) 
    { 
        // Loop through all rows 
        for (int[] row : mat) 
  
            // converting each row as string 
            // and then printing in a separate line 
            System.out.println(Arrays.toString(row)); 
    } 
	public static void main(String[] args) {

		int[] x = {'a','b','d','b','a', 'b', 'f', 'g', 'd'};
		int[] y = {'b','e','t','f','d','b','f','a','f','r'};
		DpLcstar.lcsstar(x,y);

	}
	
}
