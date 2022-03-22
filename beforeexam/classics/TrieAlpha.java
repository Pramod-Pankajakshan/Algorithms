package beforeexam.classics;

import java.util.ArrayList;
import java.util.HashMap;

public class TrieAlpha{

	Trie root;
	
	public static  class Trie {
		  boolean isLast;
		  char c;
		  HashMap<Character,Trie> map= new HashMap<Character,Trie>();
	}

	public void add(char [] in){
		if(root==null) root= new Trie();		
		Trie tr= root;
		for(int i=0;i<in.length;i++){ 
			Trie trie=tr.map.getOrDefault(in[i], new Trie());
			trie.c=in[i];
			tr=trie;
		}
	}
   
	public void delete(char [] a){
		Trie pos=null;
		if(root==null) return;		
		Trie cr= root;
		for(int i=0;i<a.length;i++){			
			if(cr.map.get(a[i])==null){
				return;    
			}else{
				if(cr.map.size()>1){
					pos=cr;
				}
			}
			
	     cr=cr.map.get(a[i]);
		}		
	}


}