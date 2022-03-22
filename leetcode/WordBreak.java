package leetcode;

import java.util.*;
import java.util.stream.Collectors;


public class WordBreak {

	public static void main(String args[]) {
 		boolean b=wordBreak("catsandog", Arrays.stream(new String[] {"cats","dog","sand","and","cat"}).collect(Collectors.toList()));
		boolean b1=wordBreak("applepenapple", Arrays.stream(new String[] {"apple","pen"}).collect(Collectors.toList()));
		System.out.println(b);
		System.out.println(b1);
	}

	  public static  boolean wordBreak(String s, List<String> wordDict) {
	        Set<String> wordDictSet = new HashSet<>(wordDict);
	        Queue<Integer> queue = new LinkedList<>();
	        boolean[] visited = new boolean[s.length()];
	        queue.add(0);
	        while (!queue.isEmpty()) {
	            int start = queue.remove();
	            if (visited[start]) {
	                continue;
	            }
	            for (int end = start + 1; end <= s.length(); end++) {
	                if (wordDictSet.contains(s.substring(start, end))) {
	                    queue.add(end);
	                    if (end == s.length()) {
	                        return true;
	                    }
	                }
	            }
	            visited[start] = true;
	        }
	        return false;
	    }
}

