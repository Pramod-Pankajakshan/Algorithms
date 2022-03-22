package string;

import java.util.List;
import java.util.*;

public class FindAnagramsInString {
public static void main(String arg[]){
//https://www.geeksforgeeks.org/anagram-substring-search-search-permutations/ - better and simple
	FindAnagramsInString ff= new FindAnagramsInString();
	  List<Integer> l=ff.findAnagrams("xyzzzzabxccbaxyz", "abcc");
    for(int i:l) {
    		System.out.println(i);
    }
}
   // s is input string - t is anagram to be checked for
   public List<Integer> findAnagrams(String stream, String ana) {
	   Map<Character,Integer> mp= new HashMap<>();
	   List<Integer> count= new ArrayList<>();
	   //push anagrams to map
	   for(char c:ana.toCharArray())
		   mp.put(c, mp.getOrDefault(c,0)+1);
	   int start=0; int end=0;
	   int countr=mp.size();
	   printMap(mp);  
	   while(end<stream.length()) {
		   char c=stream.charAt(end);
		   System.out.println(end+"-en="+c);
			 if(mp.containsKey(c)){
				 mp.put(c, mp.get(c)-1);
				 if(mp.get(c)==0) {// all must become 0 even dupes
					 countr--;
				 }
			 }
		   end++;
		   printMap(mp);  
	   while(countr==0) {
			 System.out.println("**** entering ****");
			char temp=stream.charAt(start);
			 System.out.println(start+"-st="+temp);
			 
			if(mp.containsKey(temp)) {
				mp.put(temp,mp.get(temp)+1);
				if(mp.get(temp)>0) {
					countr++;
				}
			}
			if(end-start==ana.length()) {
				
				System.out.println("FOUND");
				count.add(start);
			}
			printMap(mp); 
			 
			start++; 
		 }
	
	   }
	 return count;  
	   
   }
   
   void printMap(Map<Character,Integer> hm) {
	   System.out.println("==hm==");
	   for(Object o:hm.keySet()) {
		   System.out.println(o+"->"+hm.get(o));
	   }
	   System.out.println("====");
   }
}




