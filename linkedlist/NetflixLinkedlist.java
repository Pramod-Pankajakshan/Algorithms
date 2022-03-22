package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

import linkedlist.LinkedListWork.Node;

public class NetflixLinkedlist {
	
static	final ArrayList<Integer> s= new ArrayList<Integer>();
	static class Node {		
		int id;
		Node next;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}		
	}
	
	public static void main(String[] args) {
		s.add(1);
		Node n1= new Node();n1.id=1;
		Node n2= new Node();n2.id=2;
		Node n3= new Node();n3.id=3;
		Node n4= new Node();n4.id=4;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;	
		print(n1);System.out.println("=====");
		
		print(reverse(n1,2));
	}


	public static Node reverse(Node n,int k){
		// 1234  2143
		Node node=n;
		Node prev=null;
		Node next=null;
		int c=k;
		while(node!=null&&c>0){
			next=node.next;
			node.next=prev;
			prev=node;
			node=next;
			c--;
		}
		if(node!=null){
		n.next=reverse(node,k);	
		}
		 return prev;
		
	}
	
	
  static void print(Node n){
	  while(n!=null){
		  System.out.println(n.id);
		  n=n.next;
	  }
  }

}
