package array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WordLadder {
	
	public static void main(String[] args) {
		String start = "hit";
		String	end = "cog";
		HashSet<String> hs = new HashSet<String>();
		hs.add("hot");		hs.add("dot");
		hs.add("dog");		hs.add("lot");
		hs.add("log");		
		WordLadder wl= new WordLadder();
		wl.ladderLength(start,end,hs);
	}
	
	class WordNode{
	    String word;
	    int numSteps;
 
	    public WordNode(String word, int numSteps){
	        this.word = word;
	        this.numSteps = numSteps;
	    }
	}
	 
	    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
	    	
	        LinkedList<WordNode> queue = new LinkedList<WordNode>();
	        queue.add(new WordNode(beginWord, 1));
	        wordDict.add(endWord);
	        while(!queue.isEmpty()){
	            WordNode top = queue.remove();
	            String word = top.word;
	 
	            if(word.equals(endWord)){
	            	System.out.println("******"+top.numSteps);
	                return top.numSteps;
	            }
	            System.out.println("processing....."+word);
	            char[] arr = word.toCharArray();
	            for(int i=0; i<arr.length; i++){// for each char
	                for(char c='a'; c<='z'; c++){
	                	    char temp = arr[i];
	                	    
	                    if(arr[i]!=c){
	                        arr[i]=c;// hit - ait
	                    }
	                    String newWord = new String(arr);
	                    if(wordDict.contains(newWord)){
	                        queue.add(new WordNode(newWord, top.numSteps+1));
	                        wordDict.remove(newWord);// remove from dict - so that same path is not repeated
	                    }
	                    arr[i]=temp;// have the string back as hit
	                }
	                
	            }
	            int t=0;
	            while(t<queue.size()) {
	            System.out.println(queue.get(t).word);
	            t++;
	            }
	        }
	 
	        return 0;
	    }
	
}
