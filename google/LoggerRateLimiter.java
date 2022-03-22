package google;

import java.util.HashMap;
import java.util.*;

public class LoggerRateLimiter {

	public static void main(String[] args) {
		
	}
	  Map<String,String> hm = new HashMap<>();
	Queue<String[][]> q= new LinkedList<>();
	private boolean spm(String time, String text) {
		
		// if text present then false
		// if absent true
	//	add to map
		//add time
	//	check diff
		
	//	add to queue
		//get first check and remove for each call
	 	
	 	
       
		 if(!hm.containsKey(text)||hm.containsKey(text)&&Integer.valueOf(time)-Integer.valueOf(hm.get(text))<10) {
			
			 while(Integer.valueOf(time) - Integer.valueOf(q.peek()[0][1])>10) {
			 		hm.remove(q.poll()[0][0]);
			 	}
			 hm.put(text, time);
			 return false;
		 }else {
			 while(Integer.valueOf(time) - Integer.valueOf(q.peek()[0][1])>10) {
			 		q.poll();
			 }
			 String[][] st= new String[1][1];
			 st[0][0]= text; st[0][1]= time; 
			 q.add(st);
			 return true;
		 }
           		
		
		
	}

}
