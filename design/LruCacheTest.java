package design;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;


/** not worth using treemap
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new item.
 * @author Pramod
 * @param <K>
 * @param <V>
 */
public class LruCacheTest {
	class Kv{
		public Kv(int c,String k) {
			this.c=c; this.k=k;
		}
		int c;
		String k;
		public int hashCode() {
			return k.hashCode();
		}
	}
	static TreeMap<Kv,Integer> cache= new TreeMap<>(new Comparator<Kv>() {
		@Override
		public int compare(Kv o1,Kv o2) {	
			
			return o1.c-o2.c;
		}
	});
   public static void main(String[] args) {
	    LruCacheTest d= new LruCacheTest();		
		d.set("x");
		d.set("x");
		d.set("x");d.set("x");d.set("r");
		d.set("x");d.set("d");d.set("x");d.set("r");d.set("r");d.set("r");
		d.set("x");d.set("c");
		d.set("c");d.set("x");
		System.out.println(d.getTop(1));
   }
   
     public String getTop(int in) {    	  	 
    	 return cache.firstKey().k;    	 
     }
     
     public void set(String in) {   	 
    	  cache.put(new Kv(cache.getOrDefault(new Kv(0,in), 0)+1,in),cache.getOrDefault(new Kv(0,in), 0)+1); 
     }
   
   
}
