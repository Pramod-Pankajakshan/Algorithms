	package array;

import java.util.*;

class Worker{
	Worker(int p,int r, int t){
		this.pos=p;
		this.role=r;
		this.time=t;
	}
	int pos;
	int role;
	int time;
}
// basically u have times
// process time 1
// attach rest to time 2

public class Turnstile {

	public static void main(String args[]) {

		int []time = {0, 0, 1, 6} ;
		int []direction = {0, 1, 1, 0};
fn(time,direction);

for(Worker w:resu) {
	System.out.println(w.pos+"--"+w.time);//We return [2, 0, 1, 6].
	
}
	}

	static int prev=0;// 0 1  or 2
	private static void fn(int[] time, int[] dir) {
		TreeMap<Integer,List<Worker>> mp = new TreeMap<>(); int c=0;
		for(int i: time) {			
			List<Worker> ls=mp.getOrDefault(i, new LinkedList<Worker>());
			ls.add(new Worker(c,dir[c],-1));
			mp.put(i,ls);
			c++;
		}
	
		List<Worker> lsprev=null; int timemax=7;
		for(int j=0;j<timemax;j++) {
	
			// get the list
			// pick winner and remove and also update the result.
			List<Worker> ls=mp.get(j);
			if(ls==null&&lsprev!=null&&!lsprev.isEmpty()) {
				ls=lsprev;
			}else if(ls!=null&&lsprev!=null&&!lsprev.isEmpty()) {
				ls.addAll(lsprev);
			}
			if(ls!=null)
			 getPrio(ls,j);
			 lsprev=ls;
					
		}
		
		
	}
	static List<Worker> resu= new ArrayList<>();
	static void getPrio(List<Worker> ls, int timr) {

		if(prev==0) {
			Iterator<Worker> it=ls.iterator();
		  while(it.hasNext()) {
			  Worker w=it.next();
			  if(w.role==1) {
				  w.time=timr;
				 // System.out.println(""+timr+"-->"+w.pos);
				  resu.add(w);
				  it.remove();
				  prev=2;
				  return;
			  }			  
		  }
		  it=ls.iterator();
		  while(it.hasNext()) {
			  Worker w=it.next();
			  if(w.role==0) {
				  w.time=timr;
				  resu.add(w);
				  it.remove();
				  prev=1;
				  return;
			  }			  
		  }
		  
		}else if(prev==1) {
			Iterator<Worker> it=ls.iterator();
			  while(it.hasNext()) {
				  Worker w=it.next();
				  if(w.role==0) {
					  w.time=timr;
					  resu.add(w);
					  it.remove();
					  prev=1;
					  return;
				  }			  
			  }
			  it=ls.iterator();
			  while(it.hasNext()) {
				  Worker w=it.next();
				  if(w.role==1) {
					  w.time=timr;
					  resu.add(w);
					  it.remove();
					  prev=2;
					  return;
				  }			  
			  }
		}else if(prev==2) {
			Iterator<Worker> it=ls.iterator();
			  while(it.hasNext()) {
				  Worker w=it.next();
				  if(w.role==1) {
					  w.time=timr;
					  resu.add(w);
					  it.remove();
					  prev=2;
					  return;
				  }			  
			  }
			   it=ls.iterator();
			  while(it.hasNext()) {
				  Worker w=it.next();
				  if(w.role==0) {
					  w.time=timr;
					  resu.add(w);
					  it.remove();
					  prev=1;
					  return;
				  }			  
			  }
		}
	
	}
}

/**
A warehouse has one loading dock that workers use to load and unload goods.

Warehouse workers carrying the goods arrive at the loading dock at different times. They form two queues, a "loading" queue and an "unloading" queue. Within each queue, the workers are ordered by the time they arrive at the dock.

The arrival time (in minutes) array stores the minute the worker arrives at the loading dock. The direction array stores whether the worker is "loading" or "unloading", a value of 0 means loading and 1 means unloading. Loading/unloading takes 1 minute.

When a worker arrives at the loading dock, if no other worker is at the dock at the same time, then the worker can use the dock.

If a "loading" worker and an "unloading" worker arrive at the dock at the same time, then we decide who can use the dock with these rules:

if the loading dock was not in use in the previous minute, then the unloading worker can use the dock.
if the loading dock was just used by another unloading worker, then the unloading worker can use the dock.
if the loading dock was just used by another loading worker, then the loading worker can use the dock.
Return an array of the time (in minute) each worker uses the dock.

Examples
Example 1:
Input:
time = [0, 0, 1, 6] direction = [0, 1, 1, 0]



Explanation:
At time 0, worker 0 and 1 want to use the dock. Worker 0 wants to load and worker 1 wants to unload. The dock was not used in the previous minute, so worker 1 unload first.
At time 1, workers 0 and 2 want to use the rock. Worker 2 wants to unload, and at the previous minute the dock was used to unload, so worker 2 uses the dock.
At time 2, worker 0 is the only worker at the dock, so he uses the dock.
At time 6, worker 3 arrives at the empty dock and uses the dock.
We return [2, 0, 1, 6].
**/