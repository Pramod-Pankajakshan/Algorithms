package matrix;

import java.util.HashSet;

public class WallsAndGates {
public static void main(String arg[]){

	int d[][]= new int[][]
	  { {Integer.MAX_VALUE,-1,  0,Integer.MAX_VALUE},
		{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,-1},
		{Integer.MAX_VALUE,-1,Integer.MAX_VALUE,-1},
		{0,-1,Integer.MAX_VALUE,Integer.MAX_VALUE}};
		
		
		wallsAndGates(d);
	    for (int i = 0; i < d.length; i++) {
	    	System.out.println("\n");
	    		for (int j = 0; j < d[0].length; j++)
	    			System.out.print(d[i][j]+",");
	    }
		System.out.println("\n");
}


public static void  wallsAndGates(int[][] rooms) {
    for (int i = 0; i < rooms.length; i++)
        for (int j = 0; j < rooms[0].length; j++)
            if (rooms[i][j] == 0) dfs(rooms, i, j, 0);// do only for 0
}

private static void   dfs(int[][] rooms, int i, int j, int distance) {                 //return if d is big
    if (i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] < distance) return;// 
    rooms[i][j] = distance;
    dfs(rooms, i - 1, j, distance + 1);
    dfs(rooms, i + 1, j, distance + 1);
    dfs(rooms, i, j - 1, distance + 1);
    dfs(rooms, i, j + 1, distance + 1);
}

//mine below


//static HashSet<String> hs= null;
//public static int  findDistance(String[][] in,int x, int y,int xsize,int ysize, int distance){
//
// if(x<0||y<0||x>=xsize||y>=ysize||in[x][y].equals("-1")||hs.contains("x"+x+"y"+y)) {
//	 return Integer.MAX_VALUE;
// }
// 
// if(in[x][y].equals("0")) {
//	 //System.out.println(distance);
//	 return distance;
// }
//
//          hs.add("x"+x+"y"+y);
//		int a=findDistance(in,x+1,y,xsize,ysize,distance+1);
//		   if(a==0)hs.remove("x"+x+"y"+y);
//		   hs.add("x"+x+"y"+y);
//		int a2=findDistance(in,x,y+1,xsize,ysize,distance+1);
//		  if(a2==0)hs.remove("x"+x+"y"+y);
//		  
//		  hs.add("x"+x+"y"+y);
//		int a3=findDistance(in,x-1,y,xsize,ysize,distance+1);
//		  if(a3==0)hs.remove("x"+x+"y"+y);
//		  
//		  hs.add("x"+x+"y"+y);
//		int a4=findDistance(in,x,y-1,xsize,ysize,distance+1);
//		  if(a4==0)hs.remove("x"+x+"y"+y);
//
//		return Math.min(Math.min(a,a2),Math.min(a3, a4));
//
//
//
//
//}




}



/**




You are given a m x n 2D grid initialized with these three possible values.

-1 - A wall or an obstacle.
0 - A gate.
INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.

For example, given the 2D grid:
INF  -1  0  INF
INF INF INF  -1
INF  -1 INF  -1
  0  -1 INF INF
After running your function, the 2D grid should be:
  3  -1   0   1
  2   2   1  -1
  1  -1   2  -1
  0  -1   3   4
*
**/