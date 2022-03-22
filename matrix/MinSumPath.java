package matrix;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * 
 * [1,3,1],
  [1,5,1],
  [4,2,1]
  
  1 4 5
  2 7 6
  6 8 7
  
 * @author pramod
 *
 */
public class MinSumPath {

	
	public static void main(String[] args) {
		int[][] arr = new int[][]{
			  { 1, 0, 1},
			  { 1, 5, 5},
			  { 4, 2, 1}			 
			};
			Set<String> st=new HashSet<String>();
		minSum(0,0,arr,0,st);
		System.out.println(min);
	}
	
	
static	int min=Integer.MAX_VALUE;
	static void minSum(int i, int j, int[][] arr, int sum, Set<String> visited) {		
		
		if(i>=0&&i<arr.length&&j>=0&&j<arr[0].length) {
			
			sum=sum+arr[i][j];  
			if(i==arr.length-1&&j==arr[0].length-1)	{			
				min=Math.min(sum, min);				
			    System.out.println("end");
			}
			visited.add(i+"-"+j);
			minSum(i+1,j,arr,sum,visited);				
			minSum(i,j+1,arr,sum,visited);
			visited.remove(i+"-"+j);
		}
	}
	
	
	
	
	
	
}
