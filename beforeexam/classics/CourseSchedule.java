package beforeexam.classics;

import java.util.*;


public class CourseSchedule {

	public static void main(String args[]) {

	boolean bn=	prepareMap(new int[][]{{1,0},{0,2},{0,3},{3,2},{2,3}});
    System.out.println(bn);
	}

	private static boolean prepareMap(int[][] in) {
		Map<Integer,List<Integer>> hm = new HashMap<>();
		
		for(int [] i:in) {
			List<Integer> ls =hm.getOrDefault(i[0], new ArrayList<Integer>());
			ls.add(i[1]);
			hm.put(i[0], ls);
		}
		// loop and add to map
	    // get the set
		// iterate 
		    // when we iterate - look for visited 
		for(int i:hm.keySet()) {
			Set<Integer> hs= new HashSet<>();
			if(!isGoodSch(i,hm,hs)) return false;
		}
		
		return true;
	}
	
	private static boolean isGoodSch(int i, Map<Integer,List<Integer>> hm,Set<Integer> hs) {
		List<Integer> l=hm.get(i);
		if(l==null) return true;
		for(int in:l ) {
			if(hs.contains(in)) return false;
		hs.add(in);	
		boolean b=isGoodSch(in,hm,hs);
		if(!b) return false;
		hs.remove(in);
		}
		return true;
	}
}

