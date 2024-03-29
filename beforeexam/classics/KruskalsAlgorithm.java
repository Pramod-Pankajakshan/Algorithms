package beforeexam.classics;

import java.util.*;


public class KruskalsAlgorithm {

	public static void main(String args[]) {
		KruskalsAlgorithm b= new KruskalsAlgorithm();
		int r=b.minimumCost(3, new int[][]{{1,2,5},{1,3,6},{2,3,1}});
		System.out.println(r);
	}

	    int[] parent;
	    int n;
	    
	    private void union(int x, int y) {
	        int px = find(x);
	        int py = find(y);
	        
	        if (px != py) {
	            parent[px] = py;
	            n--;
	        }
	    }
	    
	    private int find(int x) {
	        if (parent[x] == x) {
	            return parent[x];
	        }
	        parent[x] = find(parent[x]); // path compression
	        return parent[x];
	    }
	    /**
	     * Basically for each node get the parent, if they are same
	     * then get the 
	     * 
	     * @param N
	     * @param connections
	     * @return
	     */
	    public int minimumCost(int N, int[][] connections) {
	    	  
	        parent = new int[N + 1];
	        n = N;
	        for (int i = 0; i <= N; i++) {
	            parent[i] = i;
	        }	        
	        Arrays.sort(connections, (a, b) -> (a[2] - b[2]));	        
	        int res = 0;
	        for (int[] c : connections) {
	            int x = c[0], y = c[1];
	            if (find(x) != find(y)) {
	                res += c[2];
	                union(x, y);
	            }
	        }
	        
	        return n == 1 ? res : -1;
	    }
		
}

