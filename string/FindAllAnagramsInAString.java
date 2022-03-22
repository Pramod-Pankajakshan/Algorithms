package string;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
	
	public static void main(String[] args) {
		FindAllAnagramsInAString fa= new FindAllAnagramsInAString();
		fa.findAnagrams("ababababab","aab");//		
	}
	
	//fa.findAnagrams("ababababab","aab");//	
	// "smiles".substring(1, 5) returns "mile"
	public List<Integer> findAnagrams(String s, String p) {	        
        List<Integer> list= new ArrayList<>();
        int hc=  getCharacterHashCode(p);
        System.out.println("---"+hc); 
        int l=0;int windowsize=p.length()-1;
		//	      if(p.length()>s.length()){
		//	        return list;
		//	       }
        
        String tem= s.substring(0,windowsize+1);
        while(windowsize<s.length()){
            if(getCharacterHashCode(tem)==hc){
            	    System.out.println("==================="+l);
                list.add(l);
            }
                l++;
                windowsize++;
                if(windowsize<s.length())
                tem= s.substring(l,windowsize+1);                         
        }
        return list;
    }   
    private int getCharacterHashCode(String p){   
    	
        char [] pi= new char[26];      
        char [] pp= p.toCharArray();
        for(char c:pp){
            pi[c-'a']=(char)((int)pi[c-'a']+1);
        }
        int hc= new String(pi).hashCode();
        System.out.println(p+"--hashcode is--"+hc);
        return hc;
      }
    
    
	}


