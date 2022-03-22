package array;

import java.util.*;


public class Leetcode1466 {

	public static void main(String args[]) {
		minReorder(6, new int[][] {{0,1},{1,3},{2,3},{4,0},{4,5}});
		
	}

	 
	 
	 public static int minReorder(int n, int[][] cs) {
	        Set<String> st = new HashSet<>();
	        Map<Integer, Set<Integer>> map = new HashMap<>();
	        for (int[] c : cs) {
	            st.add(c[0] + "," + c[1]);
	           Set<Integer> hs= map.getOrDefault(c[0],new HashSet<>());
	           hs.add(c[1]);
	           Set<Integer> hs1=  map.getOrDefault(c[1],new HashSet<>());
	           hs1.add(c[0]);
	           map.put(c[0], hs);
	           map.put(c[1], hs1);// put both forward and reverse
	        }
	        // regular bfs 
	        // if not in hashset then add
	        // just add a visited onbe
	        Queue<Integer> q = new LinkedList<>();
	        q.add(0);
	        int res = 0;
	        boolean[] vs = new boolean[n];
	        vs[0] = true;
	        while (!q.isEmpty()) {
	            int c = q.poll();
	            for (int next : map.getOrDefault(c, new HashSet<>())) {
	                if (vs[next]) {
	                	System.out.println("vvv"+next);
	                	continue;
	                }
	                vs[next] = true;
	                if (!st.contains(next + "," + c)) res++;
	                q.add(next);
	            }
	        }
	        System.out.println(res);
	        return res;
	    }
	 
	 
}

