package leetcode;

import java.util.*;

public class ExchangeRates {

	/**
	 * 
	 *  (countryA, countryB, 5),
		(countryA, countryF, 10),
		(countryB, countryD, 30),
	 * 
	 */
	
	int ans=0;
	int fc=1;
	private void exRate(String from, String to, Map<String,Map<String,Integer>> comap,int ex, int count, Set<String> visited) {
		
		Map<String,Integer> mp=comap.get(from);
		if(mp.get(to)!=null) {
			ans= count; fc=mp.get(to)*ex;
		}else {
		for(String s: mp.keySet()) {
			exRate(s,to,comap,ex*mp.get(s), count+1,visited);
		}
		}
		
	}



	

}
