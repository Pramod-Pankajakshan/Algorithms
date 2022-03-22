package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordBreak {
	
	public static void main(String[] args) {
		WordBreak wb= new WordBreak();
		ArrayList<String> al= new ArrayList<>();
		al.add("cat");		al.add("cats");
		al.add("and");		al.add("sand");
		al.add("dog");		//al.add("ab");
	//	al.add("a");		al.add("aa");
		wb.wordBreakList("catsanddog",new HashSet<>(al),0, new ArrayList<String>());
	}
	
    public boolean wordBreak(String s, List<String> wordDict) {
        return word_Break(s, new HashSet(wordDict), 0, new Boolean[s.length()]);
    }
    // 
    public boolean word_Break(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length()) {
            return true;
        }
        if (memo[start] != null) {
            return memo[start];
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && word_Break(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }
	
    public void wordBreakList(String s, Set<String> wordDict, int start,List<String>  lst ) {
        if(start==s.length()) {
        	int j=0;
        	 StringBuilder builder= new StringBuilder();
        	 while(j<lst.size()) {        		
        		 builder.append(lst.get(j)+" ");
        	 j++;
        	 }
        	 System.out.println(builder.toString());
        }
        if(start>=s.length()) return;
       for (int i = start + 1; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(start, i)) ) {
            	 lst.add(s.substring(start, i));
            	 wordBreakList(s, wordDict, i,lst);
            	 lst.remove(lst.size()-1);
            }
        }
      
    }
    
    
    
	 public boolean wordBreakBFS(String s, List<String> wordDict) {
	        Set<String> wordDictSet=new HashSet(wordDict);
	        
	        Queue<Integer> queue = new LinkedList<>();// store the integer
	        
	        int[] visited = new int[s.length()];
	        
	        queue.add(0);
	        
	        while (!queue.isEmpty()) {
	            int start = queue.remove();
	            if (visited[start] == 0) {// the only extra
	                for (int end = start + 1; end <= s.length(); end++) {
	                    if (wordDictSet.contains(s.substring(start, end))) {
	                        queue.add(end);// add the end not string
	                        if (end == s.length()) {
	                            return true;
	                        }
	                    }
	                }
	                visited[start] = 1;// the only extra    
	            }
	        }
	        return false;
	    }

}
