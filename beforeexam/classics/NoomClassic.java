package beforeexam.classics;

import java.util.*;
// Three types of responsibilities:
	// - personal coaching
	// - group coaching
	// - managing
	// Two types of allocations:
	// - baseline
	// - temporary
	//
	// Task: For a given date interval, calculate the percent of time spent working on each responsibility

	/*
	Baseline:
	    Personal Coaching: 50%
	    Managing: 50%

	Temporary: 2019-03-15 - 2019-03-18
	    Managing: 100%

	Temporary: 2019-03-20 - 2019-03-22
	    Group Coaching: 10%
	    Personal Coaching: 90%
	====================================
	The report for 2019-03-14 - 2019-03-15
	    Personal coaching: 25%
	    Managing: 75%
	*/

public class NoomClassic {
 
	class BaseLine{
		Map<String,Integer> bl;
	}
	
	class Temp{
		Map<String,Integer> bl;
		int st; int en;
	}
	
	
	public static void main(String args[]) {
		NoomClassic nc= new NoomClassic();
		BaseLine b=  nc.new BaseLine(); 
		Map<String,Integer> bl= new HashMap<>();
		bl.put("pc", 50);bl.put("m", 50);b.bl=bl;
		Temp t= nc.new Temp();Map<String,Integer> bl1= new HashMap<>();
		bl1.put("m", 100);t.bl=bl1; t.st=15; t.en=18;List<NoomClassic.Temp> tl= new ArrayList<NoomClassic.Temp>();tl.add(t);
		fn(b,tl,14,15);
	}

	private static void fn(BaseLine input, List<Temp> tl, int rpst, int rpen) {
		Map<Integer, Map<String,Integer>> dateToRespMap= new HashMap<>(); 
		for(Temp ls: tl) {
			for(int i=ls.st;i<=ls.en;i++) {
				Map<String,Integer> respToPerMap=ls.bl;				
				dateToRespMap.put(i,respToPerMap);				
			}
		}
		Map<String,Integer> report= new HashMap<>();
		int days=(rpen-rpst)+1;
		for(int i=rpst;i<=rpen;i++) {
			 Map<String,Integer> dailreport=dateToRespMap.get(i);
			 if(dailreport==null) {
				 for(String s:input.bl.keySet()) {
					int v= report.getOrDefault(s, 0);
				 report.put(s, v+input.bl.get(s));
				 }
				 continue;
			 }
			 for(String s:dailreport.keySet()) {				 
				 int val =	 report.getOrDefault(s, 0);		
				 report.put(s,val+dailreport.get(s));				 
			 }
			
		}
		 for(String s:report.keySet()) {
		         System.out.println(s+"--"+report.get(s)/days);
		 }
	}
}

