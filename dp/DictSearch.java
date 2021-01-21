package dynamic;

import java.util.HashSet;
import java.util.Set;

public class DictSearch {

	public static void main(String[] args) {
		HashSet<String> hm = new HashSet<String>();
		
		hm.add("lee");
		hm.add("t");
		hm.add("cod");
		hm.add("cool");
		hm.add("a");
		hm.add("e");
		System.out.println(wordBreak("aleetcode",hm));
	}

	    public static boolean wordBreak(String s, Set<String> dict) {
	        
	        boolean[] f = new boolean[s.length() + 1];
	        
	        f[0] = true;
	        //Second DP
	        for(int i=1; i <= s.length(); i++){
	            for(int j=0; j < i; j++){
	                if(f[j] && dict.contains(s.substring(j, i))){
	                    f[i] = true;
	                    break;
	                }
	            }
	        }
         return f[s.length()];
	    }
	}

