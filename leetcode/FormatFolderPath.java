package leetcode;

import java.util.*;



// Hello World my name is Pramod

public class FormatFolderPath {


	Trie root;
	
	public static  class Trie {
		  boolean isLast;
		  char c;
		  HashMap<Character,Trie> map= new HashMap<Character,Trie>();
	}

	public void add(char [] in){
		if(root==null) this.root= new Trie();		
		Trie cr= root;
		for(int i=0;i<in.length;i++){ 
			if(in[i]=='/') {
				continue;
			}
			Trie trie=null;
			trie=cr.map.getOrDefault(in[i], new Trie());
			trie.c=in[i];	
			if(i==in.length-1) {trie.isLast=true;}
			cr.map.put(in[i],trie);
			cr=trie;
		}
	
	}
	
	public static void main(String args[]) {
        String [] s=new String [] {"/d","/a","/a/b","/a/c","/c/d","/c/d/e","/x/y/z"};
		fn(s);

	}

	private static void fn(String[] in) {
		FormatFolderPath f= new FormatFolderPath();
		for(String s:in) {
			f.add(s.toCharArray());
		}
		System.out.println("----");	
		print(f.root,"");
   }
	
	private static void print(Trie e, String res) {
		Trie t=e;	 res=res+"-";
		if(t==null||t.map==null) return;
		for(char c:t.map.keySet()) {
			System.out.println(res+c);
			print(t.map.get(c),res);
		}
	}
	
}

