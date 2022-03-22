package backtrack;

import java.util.*;


public class WordPattern {

	public static void main(String args[]) {

		System.out.println(wordPatternMatch("aabb","xyzabcxzyabc"));

	}

    public static boolean wordPatternMatch(String pattern, String s) {
        Map<Character,String> temp= new HashMap<>();
        int c=1; int d=2;
        while(c<s.length()){ 
          //System.out.println("a is -"+s.substring(0,c));
          temp.put(pattern.charAt(0),s.substring(0,c));  
          d=c+1;
          while(d<s.length()) {
        	  //System.out.println("b is -"+s.substring(c,d));
        	  temp.put(pattern.charAt(1),s.substring(c,d));
        	  if(!ok)
           validatePettern(pattern,2,s,d,temp); 
           d++;
          }
          if(ok) return true;
          c++;   
        }
        return false;
    }
    
    static boolean ok=false;
    
    
    private  static void validatePettern(String pat,int patpos,String in, int st, Map<Character,String> aandb){
  
    	  if(st>=in.length()&&patpos>=pat.length()-1) {
    		  ok=true;
    		  System.out.println("ok");
    		  return;
    	  }
      	  if(patpos>=pat.length()) {
     		 
    		  return;
    	  }
       String patn=aandb.get(pat.charAt(patpos));
       if(st+patn.length()>in.length()) return;
           //System.out.println(patn+"--comp---"+in.substring(st,st+patn.length()));
        if(patn.equals(in.substring(st,st+patn.length()))){
        	    System.out.println("next");
        	    System.out.println(patn+"--comp---"+in.substring(st,st+patn.length()));
            validatePettern(pat,patpos+1,in,st+patn.length(),aandb);
        }else{
            return;
        }
        
    }
}


