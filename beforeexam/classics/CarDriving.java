package beforeexam.classics;

import java.util.*;


public class CarDriving {
	/*
	* Give you a map as a 0, 1 matrix (1 means blocked, 0 means not blocked), a start point x and end point y
	* Determine if you can start from x and end at y.
	* Move rule:
	* 1. You can only go up, left, down or right
	* 2. For each move, you have to move all the way until you hit the blocker (value 1) or you hit map boundary
	*
	*
	* Example:
	0 0 0 1 0 0
	0 0 0 0 0 0
	0 0 0 0 1 0
	1 0 0 0 0 0
	0 0 0 1 0 1

	start: (0,0)  target: (4, 2) -> True
	start: (0,0)  target: (2, 2) -> False
	*/


	public static void main(String[] args) {
		int j[][] =
			{		{ 0, 0, 1,0 },
					{ 0, 0, 0,0 },
					{ 0, 1, 0,0 },
					{ 1, 1, 0,0 }
			};
		track(j,0,0,new HashSet<String>());
	   }
	   
	   // pick a direction
	   // move
	   // obstacle
	   // change dir
	   // 
	static  boolean status=false; static int targetx=0; static int targety=0;
	   String dirr="down";
	   private static void track(int[][] in,int x, int y,  Set<String> visited){
		   if(status) return;
		  if( isEnd(x,y, in) )return;
		   if(in[x][y]==1){
	           return;
	       }
		   if(x==3&&y==3) {
			   System.out.println("ok");
			   status=true;
			   return;
		   }
		  
		   if(visited.contains(x+""+y))return;
		   System.out.println(x+"=="+y);
	       visited.add(x+""+y);
	       track(in,x+1,y,  visited);	      
	       track(in,x-1,y,  visited);	      
	       track(in,x,y-1,  visited);       
	       track(in,x,y+1,  visited);
	   }
	   
  private static boolean isEnd(int x, int y, int[][] ub) {
	  return x<0||y<0||x>ub.length-1|| y>ub[0].length-1;
  }
	  
	
}

