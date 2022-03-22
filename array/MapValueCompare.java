package array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

 public class MapValueCompare{

	
	public  static class MyComparator implements Comparator<Map.Entry<Integer,Integer>> {
		@Override
		public int compare(Entry<Integer, Integer> o1,
				Entry<Integer, Integer> o2) {
		if(o1.getValue()>o2.getValue()){
			return 1;
		}else if(o1.getValue()<o2.getValue()){
			return -1;
		}else{
			return 0;
		}
		}
	}
	
	public static void main(String[] args) {
		TreeMap<Integer, Integer> hm = new TreeMap();
		hm.put(1,8);
		hm.put(2,4);
		hm.put(4,17);
		hm.put(11,21);
		hm.put(41,7);
		LinkedList<Map.Entry<Integer, Integer>>  llist = new LinkedList(hm.entrySet());
		Collections.sort(llist,new MyComparator());
		System.out.println(llist.poll());
		
		
	}
	
}