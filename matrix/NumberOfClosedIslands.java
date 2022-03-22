package matrix;

import java.util.*;


public class NumberOfClosedIslands {

	public static void main(String args[]) {
		NumberOfClosedIslands ns= new NumberOfClosedIslands();
		  int mat[][]= new int [][]{ 
				 {0,0,1,1,0,1,0,0,1,0},
				 {1,1,0,1,1,0,1,1,1,0},
				 {1,0,1,1,1,0,0,1,1,0},
				 {0,1,1,0,0,0,0,1,0,1},
				 {0,0,0,0,0,0,1,1,1,0},
				 {0,1,0,1,0,1,0,1,1,1},
				 {1,0,1,0,1,1,0,0,0,1},
				 {1,1,1,1,1,1,0,0,0,0},
				 {1,1,1,0,0,1,0,1,0,1},
				 {1,1,1,0,1,1,0,1,1,0}};
		ns.closedIsland(mat);
		
	}

	public int closedIsland(int[][] grid) {
        // get a 0 
        // convert to 2
        // expand 2 till it cannot be expanded
        // if border - ignore
        // pass this grid and check border of 2
        // increase count
        // look for remainig 0
        // repeat
		//System.out.println(Arrays.deepToString(grid));
        int res=0; int c=2;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){                
                if(grid[i][j]==0){
                	Set<int[]> v= new HashSet<>();
                	expand(grid,i,j,  c,v);	 v= new HashSet<>();
               // 	System.out.println(Arrays.deepToString(grid));
                	check(grid,i,j,c);
                	System.out.println(a);
                if(a)res++;
                a=true;
                c++;
                }
        }
       
    }System.out.println(res);
		return res;
	}
        private void expand(int[][] grid, int i, int j, int c,Set<int[]> visited){
           if(isInvalid(i,j,grid)) return;
           
             if(grid[i][j]==0){
                   grid[i][j]=c; 
             }else {
            	 return;
             }
            expand(grid,i+1,j,c,visited);
            expand(grid,i,j+1,c,visited);
            expand(grid,i-1,j,c,visited);            
            expand(grid,i,j-1,c,visited);          
        }
        
        private boolean isInvalid(int i, int j, int [][]grid){
            if(i<0||j<0||i>grid.length-1||j>grid[0].length-1) return true;
			return false;
        }
        boolean a=true;
        public void check(int[][] grid,int i, int j,int c) {// visted not needed
        		if(i<0||j<0||i>grid.length-1||j>grid[0].length-1||grid[i][j]!=c) return ;
        	       if(grid[i][j]==c){
                  if(j==0||i==0||i==(grid.length-1)||j==(grid[0].length-1)) {
                	   a=false;
                	  	return ; 
                  } else {
                	  grid[i][j]=-c;
                  }
                  check(grid,i+1,j,c);
                  check(grid,i,j+1,c);
                  check(grid,i-1,j,c);            
                  check(grid,i,j-1,c);
                  }
        }
}


