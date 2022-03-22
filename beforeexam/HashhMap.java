package beforeexam;

import java.util.*;


public class HashhMap {

	
	/**
	 * 
	 *  int[] cc= new int[52];
        char[] ss=s.toCharArray();
        for(char c:ss){
            cc[c-'a']= cc[c-'a']+1;
        }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		int []intarr= new int[] {1,2,3};
		
		List<int[]> ls = new ArrayList<>();
		ls.toArray(new int[ls.size()][]);
        Map<String,String> hm = new HashMap<>();
        hm.put("1","a");hm.put("2","b");
        String h=hm.get("2");
        hm.replace("2", "x");
        hm.replace("2", "x","b");// old with new =only if it matches
        hm.remove("2");
        Set<String> st=hm.keySet();
        Collection<String> cl=hm.values();
        hm.computeIfAbsent("3", k -> f(k));//33
        hm.computeIfAbsent("4", String ::new);//4 hm.containskey
		System.out.println("");		
		TreeMap<String,String> tm = new TreeMap<>();String key="";
		tm.firstKey();
		tm.floorKey(key);
		tm.pollFirstEntry();
		tm.ceilingKey(key);
		tm.ceilingEntry(key);
		tm.descendingKeySet();
	}

	private static String f(String k) {	
		return k+k;
	}

	private static void fn(String input) {
	int[] a= new int[5];
	char cc[]=new char[3];
	char ccc[][] = new char[1][2];
	}
}

