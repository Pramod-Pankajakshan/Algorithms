package dynamic;

import java.util.HashMap;
import java.util.Map;


public class LongestRepeatedSubsequence {

	 public static void main(String args[]) { 
		 LongestRepeatedSubsequence lbs= new LongestRepeatedSubsequence();
		 String f="aabcaabdaab";		 
	        char[] arr = f.toCharArray(); 
	        for(int i=0;i<f.length();i++) {
	        	lbs.insertWord(arr,i);
	        }
	        System.out.println(lbs.max);
	    } 
	 
	 
	 private class Trie{	 
       Map<Character,Trie> mp= new HashMap<>();
        boolean end;
        char c;
        int count;
	 }
	
	 Trie rt= new Trie();
	 int max=0;
	private void insertWord(char[] w, int st) {		
		Trie root=rt;		
		int depth=0;
		for(char c:w) {			
			if(st<=0) {
				depth++;
			Trie tr=null;
			if(root.mp.get(c) != null) {
				 tr=root.mp.get(c);
				 tr.count=depth;
				 if(tr.count>max) max=tr.count;
			}else {
				tr = new Trie();
				tr.c=c;
				tr.count=1;
				root.mp.put(c, tr);
			}
			root=tr;
		}		
		st--;
		}
		root.end=true;
	}
}
