package beforeexam;

/**


We are working on a security system for a badged-access room in our company's building.

We want to find employees who badged into our secured room unusually often. We have an unordered list of names and entry times over a single day.
 Access times are given as numbers up to four digits in length using 24-hour time, such as "800" or "2250".

Write a function that finds anyone who badged into the room three or more times in a one-hour period. 
Your function should return each of the employees who fit that criteria, plus the times that they badged
 in during the one-hour period. 
 If there are multiple one-hour periods where this was true for an employee, 
 just return the earliest one for that employee.


]

 // Expected output (in any order)
 // John:  830  835  855  915  930
 // Paul: 1315 1355 1405
  //John-[730, 830, 835, 855, 915, 930, 940, 1615, 1630, 1640]

Expected output (in any order)
  John:  830  835  855  915  930
  Paul: 1315 1355 1405
n: length of the badge records array
*/

import java.io.*;
import java.util.*;

public class WayFair {
  public static void main(String[] argv) {
    String[][] badgeTimes = new String[][] {
      {"Paul",     "1355"},
      {"Jennifer", "1910"},
      {"John",      "835"},
      {"John",      "830"},
      {"Paul",     "1315"},
      {"John",     "1615"},
      {"John",     "1640"},
      {"Paul",     "1405"},
      {"John",      "855"},
      {"John",      "930"},
      {"John",      "915"},
      {"John",      "730"},
      {"John",      "940"},
      {"Jennifer", "1335"},
      {"Jennifer",  "730"},
      {"John",     "1630"},
      {"Jennifer",    "5"},
    };
  Map<String,List<Integer>> mp=  process(badgeTimes);
    for(String hh: mp.keySet()) {
    	System.out.println(hh+"-");
    	for(Integer v:mp.get(hh)) {
    		System.out.print(v+"//");
    	}
    }
    
  }
  
  private static Map<String,List<Integer>> process(String[][] in){
    Map<String,List<Integer>> mp= new HashMap<>();
    for(int i=0;i<in.length;i++){
      String name=in[i][0];
      String time=in[i][1];
      List<Integer> lst= mp.getOrDefault(name, new ArrayList<Integer>());
      lst.add(Integer.valueOf(time));
      mp.put(name, lst);
    }
    Map<String,List<Integer>> finalRes= new HashMap<>();
    Set<String> s= mp.keySet();
    
    for(String st:s){
    	List<Integer> ls = mp.get(st);
     Collections.sort(ls);
     System.out.println(st+"-"+Arrays.toString(ls.toArray()));
       List<Integer> res =new ArrayList<>(); boolean fs=false;
      for(int i=0;i<ls.size();i++){
    	     int j=i;
    	     if(fs) break;
    	     while(j<ls.size()) {
    	    	 res.add(ls.get(j));
    	    	 
    	     if(j+1!=ls.size()&&chk(ls.get(j),ls.get(j+1))) {    	 
 System.out.println("tru");
    	     }else {
    	      	 if(j-i>=3) {
    	    		 finalRes.put(st,res);
    	    		 fs=true;	 break;
    	    	      }
	    		 res =new ArrayList<>();
	    	 }
    	     j++;
        
      }
    }
    }
    
     return finalRes;
    // iterate the array
    // for each push to a map
    // from each entry in map delete the ones that are having diff greater than 60
    // return
  }  

  private static boolean chk(int a, int b) {
	  System.out.println(a+"---"+b);
	  boolean st=false;
	 if(b/100-a/100>0) {
		 if(b-a-40<60) {
			 return true;
		 }
	 }else {
		 st=b-a<60? true: false;
	 }
	  
	 return st;
  }
  
}
