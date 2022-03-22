package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// read the tinyurl again
// read kindle
// revise codes
// my papers
public class RemoveDupes {

	public static void main(String[] args) {
		RemoveDupes rd= new RemoveDupes();
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(1);al.add(1);
		al.add(1);	
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(6);
		al.add(7);
		
		//rd.removeArrayListDupes2(al);
		int h[]={1,1,1,1,1,2,2,2,3,3,3,3,4,5,5,5,5,5};
		System.out.println(rd.removeDupes(h));
		System.out.println(Arrays.toString(h));
	}
	
	
	void removeArrayListDupes(ArrayList<Integer> al){
		int counter=0;
		Iterator<Integer> d= al.iterator();
		int prev=0; int curr=0;
	while(d.hasNext()){
		counter=counter+1;
		curr=d.next();
		if(curr==prev&&counter!=1){			
			d.remove();
		}else{
			prev=curr;
		}		
	}
	System.out.println(al.toString());
	}
	
	void removeArrayListDupes2(ArrayList<Integer> al){
		int counter=0;
		
		int prev=0; int curr=0;
		
		for(int i:al){//111233
			counter=counter+1;
			curr=i;
			if(curr!=prev&&counter!=1){
				System.out.println(curr);
				prev=curr;
			}else{
			    if(counter==1){ 
			    	System.out.println(curr);
			    	prev=curr;
			    }
			}
		}
		
		}
	// leetcode 26 - easy
  int removeDupes(int[] e) {
	      int n=e.length;
	 
	        if(n < 2) return n;
	        int id = 1;
	        for(int i = 1; i < n; i++) 
	        	
	            if(e[i] != e[i-1]) {	            	 
	            	e[id] = e[i];
	            	id=id+1;
	            }
	        return id;
	  
  }
	
	
	
}
