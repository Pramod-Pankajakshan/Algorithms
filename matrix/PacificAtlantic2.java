package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import java.util.List;

import java.util.Set;
import java.util.stream.Collectors;

public class PacificAtlantic2 {

	public static void main(String[] args) {

		int j[][] = {

				{ 1, 2, 2, 3, 5 },

				{ 3, 2, 3, 4, 4 },

				{ 2, 4, 5, 3, 1 },

				{ 6, 7, 1, 4, 5 },

				{ 5, 1, 1, 2, 4 }

		};
		PacificAtlantic2 v= new PacificAtlantic2();
		v.pacificAtlantic(j);

	}
	
	    public List<List<Integer>> pacificAtlantic(int[][] heights) {
	        this.matx=heights.length-1;
	        this.maty=heights[0].length-1;
	        List<List<Integer>> res= new ArrayList<>();
	        
	        for(int i=0;i<heights.length;i++){
	            for(int j=0;j<heights[0].length;j++){
	                Set<String> vis= new HashSet<>();
	          //       System.out.println(i+"----start----"+j);
	               boolean r5=  isGoingToPacific(i,j,vis,heights,true);
	                 vis= new HashSet<>();
	                 boolean r6=  isGoingToPacific( i,  j,vis,heights,false);
	             //    System.out.println(i+"----end----"+j+""+r5+""+r6);
	                if(r5&&r6){
	                     System.out.println(i+"----******************----"+j);
	                    int []ints= new int[]{i,j};
	                   res.add(Arrays.stream(ints).boxed().collect(Collectors.toList()));
	                }
	            
	            }
	        }
	        
	        return res;
	        
	    }
	    
	    
	    boolean isGoingToPacific(int x, int y,Set<String> visited,int[][] in,boolean isPac){
	      //  System.out.println(x+"--------"+y);
	        if(isOcn(x,y)&&isPac){
	        //    System.out.println(x+"---ok-----"+y);
	           return x<=0||y<=0;
	        }
	        if(isOcn(x,y)&&!isPac){
	         //   System.out.println(x+"---okk----"+y);
	           return x>=matx||y>=maty;
	        }  
	        boolean r1=false;boolean r2=false;boolean r3=false;boolean r4=false;
	        if(visited.contains(x+"-"+y)) return false;
	         visited.add(x+"-"+y);
	        if(isValid(x+1,y)&&in[x+1][y]<=in[x][y]||isOcn(x+1,y))
	          r1=isGoingToPacific(x+1,y,visited,in,isPac);
	        if(isValid(x,y+1)&&in[x][y+1]<=in[x][y]||isOcn(x,y+1))
	  llllllllllllllllllllllllllllllllllljhjjuj        r2=isGoingToPacific(x,y+1,visited,in,isPac);
	        if(isValid(x-1,y)&&in[x-1][y]<=in[x][y]||isOcn(x-1,y))
	          r3=isGoingToPacific(x-1,y,visited,in,isPac);
	        if(isValid(x,y-1)&&in[x][y-1]<=in[x][y]||isOcn(x,y-1))
	          r4=isGoingToPacific(x,y-1,visited,in,isPac);
	        visited.remove(x+"-"+y);
	        
	        return r1||r2||r3||r4;
	    }
	    
	    
	    int matx=0;
	    int maty=0;
	    boolean isValid(int x, int y){
	        if(x>matx||y>maty||x<0||y<0) return false;
	        return true;
	    }
	    
	    boolean isOcn(int x, int y){
	        if(x>matx||y>maty||x<0||y<0) return true;
	        return false;
	    }
	    
	  
	}

