package design;

import java.util.*;

/**
 * The first two operations in \mathcal{O}(1)O(1) time are provided by the standard hashmap, and the last one - by linked list.

   There is a structure called ordered dictionary, it combines behind both hashmap and linked list. In Python this structure is called OrderedDict and in Java LinkedHashMap.
 * @author pramod
 *
 */
class LRUCacheOrderedDictionary extends LinkedHashMap<Integer, Integer>{
    private int capacity;
    
    public LRUCacheOrderedDictionary(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity; 
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */