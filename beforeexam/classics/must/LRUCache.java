package design;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new item.
 * @author Pramod
 * @param <K>
 * @param <V>
 */


public class LRUCache<K,V>{
	
	static final int size=5;
	
	HashMap<K, V> hm= new HashMap<K, V>();
	LinkedList<K> l= new LinkedList<K>();
	
	public V get(K k){			
		addktotop(k);		
		return hm.get(k);	 
	}
	
	private void addktotop(K k){
		Iterator<K> it=l.iterator();
		if(hm.get(k)!=null){
		while(it.hasNext()){			
			if(it.next()==k){
				it.remove();
			}
		}
		}
		l.addFirst(k);// key - add to top
	}
	
	public void put(K k, V v){
		if(hm.size()+1>=size){
			evict();
		}
		l.addFirst(k);
		hm.put(k,v);
	}
	
	private void evict(){
		K k=l.getLast();
		l.removeLast();
		hm.remove(k);		
	}
	
}