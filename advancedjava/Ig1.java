package advancedjava;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Ig1 {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad= new ArrayDeque<>();
		ad.add(1);
		ad.addFirst(3);
		ad.addFirst(3);
		ad.addFirst(3);
		ad.addFirst(3);
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		
		for(String a:al) {
			System.out.println(a);
		}
		
		Stack<String> s = new Stack<String>();
		s.push("1");
		System.out.println(s.pop());
		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("1");
		
		
	}
	
}
