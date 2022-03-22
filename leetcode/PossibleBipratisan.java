package leetcode;

import java.util.*;

public class PossibleBipratisan {
public static void main(String[] args) {
	int [][]l= {{1,2},{1,3},{1,4},{1,5}};
	
	System.out.println(isBipartite(l));
}

public static boolean isBipartite(int[][] graph) {
    int n = graph.length;
    int[] colors = new int[n];			
			
    for (int i = 0; i < n; i++) {              //This graph might be a disconnected graph. So check each unvisited node.
        if (colors[i] == 0 && !validColor(graph, colors, 1, i)) {
            return false;
        }
    }
    return true;
}

public static boolean validColor(int[][] graph, int[] colors, int color, int node) {
    if (colors[node] != 0) {
        return colors[node] == color;
    }       
    colors[node] = color;       
    for (int next : graph[node]) {
        if (!validColor(graph, colors, -color, next)) {
            return false;
        }
    }
    return true;
}
	    
}
