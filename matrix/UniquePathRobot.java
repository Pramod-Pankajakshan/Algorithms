package matrix;

public class UniquePathRobot {
public static void main(String arg[]){

	System.out.println(uniquePathForRobot(7,7));
	char h[]= {'r','d'};
	getPath(7,7,1,1,h,"");
	System.out.println(v);
}

// 00 is 1, from there keep adding the previous j-1
// and i-1
public static int uniquePathForRobot(int m, int n) {
    int[][] grid = new int[m][n];
    for(int i = 0; i<m; i++){
        for(int j = 0; j<n; j++){
            if(i==0||j==0)
                grid[i][j] = 1;
            else
                grid[i][j] = grid[i][j-1] + grid[i-1][j];
        }
    }
    return grid[m-1][n-1];
}


static int v=0;
private static void getPath(int m,int n, int currm, int currn,char[] dorup,String r) {
	if(n==currn&&m==currm) {
		System.out.println(r);
		v=v+1;
		return;
	}
 for(int i=0;i<dorup.length;i++) {
	 if(currm==m&&dorup[i]=='r')
		 continue;
	 if(currn==n&&dorup[i]=='d')
		 continue;
	 if(currm<=m&&dorup[i]=='r')
		 currm=currm+1;
		 if(currn<=n&&dorup[i]=='d')
		 currn=currn+1;
	 getPath(m,n,currm,currn,dorup,r+dorup[i]);
	 if(currm<=m&&dorup[i]=='r')
	 currm=currm-1;
	 if(currn<=n&&dorup[i]=='d')
	 currn=currn-1;
 }
}

}


