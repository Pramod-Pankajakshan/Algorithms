package google;

import java.util.*;


public class MaxAreaOfIsland {

	public static void main(String args[]) {
     int [][] mp= new int [][] { 
    	                        {0,0,1,0,0,0,0,1,0,0,0,0,0},
                            {0,0,0,0,0,0,0,1,1,1,0,0,0},
                            {0,1,1,0,1,0,0,0,0,0,0,0,0},
                            {0,1,0,0,1,1,0,0,1,0,1,0,0},
                            {0,1,0,0,1,1,0,0,1,1,1,0,0},
                            {0,0,0,0,0,0,0,0,0,0,1,0,0},
                            {0,0,0,0,0,0,0,1,1,1,0,0,0},
                            {0,0,0,0,0,0,0,1,1,0,0,0,0}};
                            MaxAreaOfIsland mi= new MaxAreaOfIsland();
                            mi.fn(mp);
                            
	}

	private  void fn(int[][] in) {
		int max=0;
		for(int i=0;i<in.length;i++) {
			for(int j=0;j<in[0].length;j++) {
			 
				if(in[i][j]==1) {
					int g=getRange(in, i,j,1, new HashSet<String>());
					//System.out.println(g);
					 max=Math.max(g, max);
				}
			}
		}
		
		System.out.println(max);
		
	}
	// use a set for visited
	// 
    private  int getRange(int[][] in,int i, int j, int c,Set<String> set) {
	    
        if(in[i][j]==1) {
        	in[i][j]=0;
        }
      
        set.add(""+i+"-"+j);
    	   if(i+1<in.length&&j<in[0].length&&i+1>=0&&j>=0&&in[i+1][j]==1&&!set.contains(""+(i+1)+"-"+j)) {
    		 c+= getRange(in,i+1,j,1,set);
    	   }
    	   if(i<in.length&&j+1<in[0].length&&i>=0&&j+1>=0&&in[i][j+1]==1&&!set.contains(""+i+"-"+(j+1))) {
    		 c+=   getRange(in,i,j+1,1,set);
    	   }
    	   if(i-1<in.length&&j<in[0].length&&i-1>=0&&j>=0&&in[i-1][j]==1&&!set.contains(""+(i-1)+"-"+j)) {
    		 c+=  getRange(in,i-1,j,1,set);
    	   }
    	   if(i<in.length&&j-1<in[0].length&&i>=0&&j-1>=0&&in[i][j-1]==1&&!set.contains(""+i+"-"+(j-1))) {
    		 c+=    getRange(in,i,j-1,1,set);
    	   }
		
		return c;
	}
	
	
	
	
	
	
	
	
}

