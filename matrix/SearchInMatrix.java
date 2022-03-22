package matrix;

public class SearchInMatrix {

	public static void main(String[] args) {
	int d[][]= new int[][] { {1,2,7,14},
							 {4,5,10,17},
							 {8,9,11,35}};
	System.out.println(srch(d,8));
							 
    }
// start from top right corner and eliminate a row or column
	private static boolean srch(int[][] arr, int in) {
		int i=0;
		int j=arr[0].length-1;
		while(i<=arr.length-1&&j>=0) {
			System.out.println(arr[i][j]);
			if(arr[i][j]==in) return true;
			else if(arr[i][j]>in) {//14>7 then go left else down
				j--;
			}else {
				i++;
			}
		}
		
		return false;
	}

}
