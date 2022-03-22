package beforeexam;

import java.util.*;

//may not be the best ....
public class PathCompressionTech {

	public static void main(String args[]) {
		int n = 6; int [][]edges =new int[][] {{0,1},{1,2},{1,3},{3,5},{3,4}};
		countComponents(n,edges);
	}

	public static int countComponents(int n, int[][] edges) {
	    int[] roots = new int[n];
	    for(int i = 0; i < n; i++) roots[i] = i; 

	    for(int[] e : edges) {
	        int root1 = find(roots, e[0]);
	        int root2 = find(roots, e[1]);
	        if(root1 != root2) {      
	            roots[root1] = root2;  // union
	            n--;
	        }
	    }
	    return n;
	}

	public static int find(int[] roots, int id) {
	    while(roots[id] != id) {
	        roots[id] = roots[roots[id]];  // optional: path compression
	        id = roots[id];
	    }
	    return id;
	}
}

