package matrix;

import java.util.*;


public class BFS {

	public static void main(String args[]) {
		int d[][]= new int[][] { {1,2,7,14},
							     {4,5,10,17},
			                     {8,9,11,35}
							   };
		bfs(d);

	}
    // add visited when we add to q
	// make sure visited is of correct dimensions v.length and v[0].length
	private static void bfs(int[][] in) {
		int [][] visited=new int[in.length][in[0].length];
		Queue<int[]> q= new LinkedList<>();
		q.add(new int[] {0,0});
		visited[0][0]=1;
		while(!q.isEmpty()) {			
			int[] p=q.poll();
			
			System.out.println("---"+p[0]+"-"+p[1]);
			
			if(isValid(p[0]+1,p[1],in)&&visited[p[0]+1][p[1]]==0) {
				q.add(new int[] {p[0]+1,p[1]});// add to q
				visited[p[0]+1][p[1]]=1;// update visited
				
			}
			if(isValid(p[0]-1,p[1],in)&&visited[p[0]-1][p[1]]==0) {
				q.add(new int[] {p[0]-1,p[1]});
				visited[p[0]-1][p[1]]=1;
			}
			if(isValid(p[0],p[1]-1,in)&&visited[p[0]][p[1]-1]==0) {
				q.add(new int[] {p[0],p[1]-1});
				visited[p[0]][p[1]-1]=1;
			}
			if(isValid(p[0],p[1]+1,in)&&visited[p[0]][p[1]+1]==0) {
				q.add(new int[] {p[0],p[1]+1});
				visited[p[0]][p[1]+1]=1;
			}
			
		}
	
	}
	
	private static boolean isValid(int x, int y,int[][]  in) {
		if(x<0||y<0|| x> in.length-1||y>in[0].length-1) {
			return false;
		}
		return true;
	}
}

