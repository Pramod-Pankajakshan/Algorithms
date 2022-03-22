package tree;


	import java.io.*;
import java.util.*;
import java.util.Map.Entry;

	class Solution {
	  public static void main(String[] args) {
	    char f[]={'t','a'};
	    System.out.println(checkRule("attach",f));
	  }
	 
	  
	  public static boolean checkRule(String in,char[] c){
	    char inarr[]=in.toCharArray();
	    HashMap<Character,Integer> hm= new HashMap();
	    HashMap<Character,Integer> input= new HashMap();
	    for(int i=0;i<inarr.length;i++){	           
	      if(input.get(inarr[i])!=null){        
	        input.put(inarr[i],input.get(inarr[i])+1);        
	      }else{
	      input.put(inarr[i],1);  
	      } 
	      
	    } 
	    for(int i=0;i<c.length;i++){
	      if(!in.contains(new StringBuilder(c[i]))){
	        System.out.println("dd");
	    	  return false;
	      }      
	      if(hm.get(c[i])!=null){        
	        hm.put(c[i],hm.get(c[i])+1);        
	      }else{
	      hm.put(c[i],1);  
	      }      
	    }  
	  
	    Set<Entry<Character, Integer>> it=hm.entrySet();
	    Iterator it2=it.iterator();
	    while(it2.hasNext()){
	      Entry e=(Entry) it2.next();
	      Character c1=(Character)e.getKey();
	      System.out.println(c1);
	      Integer count=(Integer)e.getValue();
	      if(!(input.get(c1)!=null&&input.get(c1)==count)){
	    	  System.out.println(input.get(c1));
	    	  return false;  
	      }
	      
	    }
	    
	    
	    return true;
	  }
	  
	  
	}

