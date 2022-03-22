package google;

import java.util.*;


public class SequenceReconstruction {

	public static void main(String args[]) {
		System.out.println(sequenceReconstruction());
	}

	public static boolean sequenceReconstruction() {
		//int []org = {4,1,5,2,6,3}; int [][]seqs = {{5,2,6,3},{4,1,5,2}};
		int []org ={1,2,3};  int [][]seqs  = {{1,2},{1,3},{2,3}};
	    Map<Integer, List<Integer>> graph = new HashMap<>();
	    Map<Integer, Integer> indegree = new HashMap<>();
	    for (int[] seq : seqs) {
	        for (int i = 0; i < seq.length; i++) {
	            graph.putIfAbsent(seq[i], new ArrayList<Integer>());
	            indegree.putIfAbsent(seq[i], 0);
	            if (i > 0) {
	                graph.get(seq[i - 1]).add(seq[i]);// create graph - attach to prev
	                indegree.put(seq[i], indegree.get(seq[i]) + 1);
	            }
	        }
	    }
	    if (org.length != indegree.size()) {
	        return false;
	    }
	    
	    Queue<Integer> q = new LinkedList<>();
	    for (Map.Entry<Integer, Integer> entry : indegree.entrySet()) {
	        if (entry.getValue() == 0) {
	            q.add(entry.getKey());
	        }
	    }
	    
	    int index = 0;
	    while (!q.isEmpty()) {
	        if (q.size() > 1) {
	            return false;
	        }
	        int curr = q.poll();
	        if (org[index++] != curr) {
	            return false;
	        }
	        for (int nb : graph.get(curr)) {
	            indegree.put(nb, indegree.get(nb) - 1);
	            if (indegree.get(nb) == 0) {
	                q.add(nb);
	            }
	        }
	    }
	    return index == org.length;
	}
}

