package advancedjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Java8 {
public static void main(String arg[]){
LinkedList<Integer> ll= new LinkedList<>();
ll.add(1);ll.add(2);ll.add(3);
System.out.println(ll.size());
removeDupes(ll);
System.out.println(ll.size());
}


public static void removeDupes(LinkedList<Integer> llist) {
	
	//set
	HashSet<Integer> hs= new HashSet<Integer>();
	Iterator<Integer> iter=llist.iterator();
	while(iter.hasNext()) {
		int data=iter.next();
		if(hs.contains(data)) {
			iter.remove();
		}else {
			hs.add(data);
		}
	}
	
}






}




