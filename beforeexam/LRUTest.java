import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUTest {
	
   int size=5;
	
	HashMap<String, String> hm= new HashMap<String, String>();
	LinkedList<String> llist= new LinkedList<String>();
	
	public String get(String key) {		
		updateList(key);		
		return hm.get(key);	
	}
	
	
	public void set(String key, String value) {
	
		if(hm.size()>=size) {
			// get first ll
			String f=llist.getFirst();
			// remove first from hm
			hm.remove(f);
			llist.removeFirst();
		}
		hm.put(key, value);
		llist.addLast(key);
		
	}
	
	void updateList(String key){
		Iterator<String> iter=llist.iterator();
		
		while(iter.hasNext()) {
			String s= iter.next();
			if(s.equals(key)) {
				iter.remove();
			}
		}
		llist.addLast(key);
	}
	

}
