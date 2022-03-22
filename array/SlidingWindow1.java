package array;

import java.util.*;

// use a hashmap to keep track of dupes
public class SlidingWindow1 {

	public static void main(String args[]) {

	int s=	fn("bacc");
	int s1=	ss("bacc");
	System.out.println(s);System.out.println(s1);

	}

	private static int fn(String s) {
		
        Map<Character, Integer> map = new HashMap<>();
        char c[]= s.toCharArray(); int dis=0; int j=0; 
        for(int i=0;i<c.length;i++){            
           map.put(c[i], map.getOrDefault(c,0)+1);          
          while(map.size()>2){
             map.put(c[j], map.get(c[j])-1);
              if(map.get(c[j]) == 0)
                map.remove(c[j]);
              j++;
             dis=Math.max(dis,i-j+1);
            }
           
          }
     
     
        dis=Math.max(s.length()-j,dis);
        
        return dis;
    }
	// o(n)
	public static int ss(String s) {
	    Map<Character, Integer> map = new HashMap<>();
	    int max = 0, start = 0;
	    for(int end=0; end<s.length(); end++) {
	        char c = s.charAt(end);
	        map.put(c, map.getOrDefault(c,0)+1);
	        while(map.size() > 2) {
	            c = s.charAt(start);
	            map.put(c, map.get(c)-1);
	            if(map.get(c) == 0)
	                map.remove(c);
	            
	            System.out.println(start);
	            start++;
	            max = Math.max(end-start+1, max);
	        }
	    }
	     
	    System.out.println(start);   
	    max = Math.max(s.length()-start, max);        
	    return max;
	}
}

