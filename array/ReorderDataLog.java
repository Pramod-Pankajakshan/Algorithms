package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ReorderDataLog {

	public static void main(String[] args) {
		String  l[]= new String [] {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"};

		ReorderDataLog dc= new ReorderDataLog();
		dc.reorderLogFiles(l);
	}
	
	private boolean isNumber(String s) {
		String regex = "\\d+";
		System.out.println("---"+s.substring(s.lastIndexOf(" "))+"---");
		System.out.println(s.substring(s.lastIndexOf(" ")).trim().matches(regex));
	return 	s.substring(s.lastIndexOf(" ")).trim().matches(regex);
	}
	 public String[] reorderLogFiles(String[] logs) {
	        List<String> d= new ArrayList<>();
	        List<String> s= new ArrayList<>();
	        for(String l: logs){
	             if(isNumber(l)) {
	            	  d.add(l);
	             }else {
	            	  s.add(l);
	             }	   
	        }
	        List<String> t= new ArrayList<>();
	       Map<String,String> hm= new HashMap<>();
	       for(String ff:s) {
	    	   System.out.println("---------"+ff.split((ff.split(" ")[0]))[1]);
	    	  
	    	   if(hm.get(ff.replaceFirst(ff.split(" ")[0],""))!=null){
	    		   
	    	   hm.put(ff.replaceFirst(ff.split(" ")[0],""), hm.get(ff.replaceFirst(ff.split(" ")[0],""))+"#"+ff);
	    	   }else {
	    		   t.add(ff.replaceFirst(ff.split(" ")[0],""));
	    		   hm.put(ff.replaceFirst(ff.split(" ")[0],""), ff);
	    	   }
	       }
	       Collections.sort(t);
	       List<String> s1= new ArrayList<>();
	       for(String h:t) {
	    	   String j=hm.get(h);
	    	   if(j.split("#").length==1) {
	    		   s1.add(hm.get(h));	    	   
	    	   }else {
	    		  String[] ss= j.split("#");
	    		  Arrays.sort(ss);
	    		  for(String hl:ss) {
	    			  s1.add(hl);
	    		  }
	    	   }
	       }
	       
	       s1.addAll(d);
	       for(String dw:s1) {
	    	   System.out.println(dw);
	       }
	       String[] itemsArray = new String[s1.size()];
	       return s1.toArray(itemsArray);
	 }
}

