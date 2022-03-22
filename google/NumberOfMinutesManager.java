package google;

import java.util.*;


public class NumberOfMinutesManager {

	public static void main(String args[]) {
		int n = 4;
		int headID = 2;
		int manager[] = new int[] {3,3,-1,2};
		int informTime[] = new int[] {0,0,162,914};
		numOfMinutes(n,headID, manager,informTime);
	}

    public static int numOfMinutes(final int n, final int headID, final int[] manager, final int[] informTime) {
        final Map<Integer, List<Integer>> graph = new HashMap<>();
        int total = 0;
        for (int i = 0; i < manager.length; i++) {
            int j = manager[i];
            if (!graph.containsKey(j))
                graph.put(j, new ArrayList<>());
            graph.get(j).add(i);
        }
        return dfs(graph, informTime, headID);
    }

    private static int dfs(final Map<Integer, List<Integer>> graph, final int[] informTime, final int cur) {
        int max = 0;
        if (!graph.containsKey(cur))
            return max;
        for (int i = 0; i < graph.get(cur).size(); i++)
            max = Math.max(max, dfs(graph, informTime, graph.get(cur).get(i)));
        return max + informTime[cur];
    }
    
    private static int bfs(final Map<Integer, List<Integer>> g, final int[] informTime, final int cur) {
    int    r=informTime[cur];
    	Queue<Integer> q= new LinkedList<>();
    	q.add(cur);
    	while(true) {List<Integer>  nn=null;
    	while(!q.isEmpty()) {  
    		int max=0;
    	 int n=	q.poll();    	
      nn= g.get(n);
     for(int i:nn) {
    	  max=Math.max(informTime[i], max);
     }
     r=r+max;
       	
    	}
    	 q.addAll(nn); 
    	}
    }
}

