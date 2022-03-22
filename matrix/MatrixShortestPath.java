package matrix;

import java.util.HashSet;
import java.util.Set;

public class MatrixShortestPath {
	//not needed 
	class Pair{
		    int i;
			int j;
			public int hashCode() {
				return (""+i+j).hashCode();
			}
			public boolean equals(Pair p) {
				return i==p.i&&j==p.j;
			}
	}
public static void main(String[] args) {
	int [][] dd= {
			{2,1,1},
			{1,0,1},
			{0,3,2}
			};
	MatrixShortestPath msp= new MatrixShortestPath();
	Set<String> hs= new HashSet<>();
	msp.sp(dd, hs, 0, 0,0);
	System.out.println(msp.spath);
}

int spath=Integer.MAX_VALUE;
private void sp(int[][] mat, Set<String> set,int i, int j, int path ) {
	if(i==mat.length-1&&j==mat[0].length-1) {
		spath=spath>path?path:spath;			
		return;
	}
	
	if(check(mat,i,j)&&mat[i][j]>0&&!set.contains((""+i+j))) {
		
		path=path+mat[i][j];
		set.add(""+i+j);
		
		sp(mat,set,i+1,j,path);
		sp(mat,set,i,j+1,path);
		sp(mat,set,i-1,j,path);
		sp(mat,set,i,j-1,path);
		set.remove(""+i+j);
	}
}

private boolean check(int[][] mat,int i, int j){
return 	(!(i<0||j<0||i>mat.length-1||j>mat[0].length-1)) ;
}


}



