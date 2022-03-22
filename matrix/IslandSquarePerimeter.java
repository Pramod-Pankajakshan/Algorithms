package matrix;

import java.util.ArrayList;
import java.util.HashSet;

public class IslandSquarePerimeter {
	
	


	
	public static void main(String[] args) {
		int[][] multi = new int[][]{
			  { 0, 1, 0, 0},
			  { 1, 1, 1, 0},
			  { 0, 1, 0, 0},
			  { 1, 1, 0, 0}
			};
			IslandSquarePerimeter vf= new IslandSquarePerimeter();           
			System.out.println(vf.getPerimeter(multi));
	}
	
	
	int getPerimeter(int[][] m) {
	// define permiter =0
	 int p=0;
	//prepare a hashmap of islands
	 HashSet<String> hm = getHm(m, m.length, m[0].length);
	// get each matrix block
	 for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
			  if(m[i][j]==1) {
				   int pp=4-checkAndGetIslandNeighbors(i,j,hm);
				   p=p+pp;
			  }
			
		}
	 }
	// if its island
	
	// get the neighbors
	
	// check how many are islands using hashmap
	
	//  so 4 - the number of islands
	
	// repeat for all rectangles
	
	// return perimeter
	return p;
	}
	
	
	int checkAndGetIslandNeighbors(int i, int j, HashSet<String> hs){
		
		int h=0;
		int pj=j+1;
		int mj=j-1;
		int pi=i+1;
		int mi=i-1;
		if(hs.contains(""+i+""+(pj)) ) {			
			h=h+1;
		}
		 if(hs.contains(""+(pi)+""+j) ) {		
			h=h+1;
		} if(hs.contains(""+i+""+(mj)) ){			
			h=h+1;
		} if(hs.contains(""+(mi)+""+j)) {			
			h=h+1;
		}
		
		
		return h;
	}
	
	
	HashSet<String> getHm(int [][] mu, int x, int y){
		HashSet<String> hs= new HashSet<String>();
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
			  if(mu[i][j]==1) {
				  
				  hs.add(""+i+""+j);
			  }
			
		}
	}
		return hs;
	}
	
	
}
