package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.stream.Stream;

public class NGE {
	
	
	public static void main(String[] args) {
		int hh=0; int jj=0;int kk=0; int g=0;
		if(Stream.of(hh, jj, kk).anyMatch(x -> x.equals(g))) {
			System.out.println("poot");
		}
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("");
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("");
		
		PriorityQueue<String> pq= new PriorityQueue<String>();
		
		int []j= {3,1,2,0,7,6,5,4,9};
		nge(j);
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "2");
		hm.put("11", "2");
		hm.put("111", "2");
		
		for(String h: hm.keySet()) {
			System.out.println(hm.getOrDefault(145, "NA"));
		}
		
	}
        // 3,1,2,0,7,6,5,4,9  -2 7 7 
	 static   void nge(int h[]) {
		
		Stack<Integer> st = new Stack<Integer>();
		// get the number
		// dd to stack
		// next number - if 
		for(int i=0;i<h.length;i++) {
			
               while(!st.isEmpty()&& st.peek()<h[i]) {
            	   System.out.println(st.pop()+"-"+h[i]);
               }
			
			st.push(h[i]);
			
		}
		
		
		
		
		
	}
	
}
