package linkedlist;

import java.util.LinkedList;

public class QuickRevision {
	
	public static class Node{
		public int id;
	    public Node next;		
	}
	
	public static void main(String[] args) {
		QuickRevision q= new QuickRevision();
		Node n= new Node();
		n.id=1;
		Node n2= new Node();
		n2.id=2;
		Node n3= new Node();
		n3.id=3;
		Node n4= new Node();
		n4.id=4;	
		Node n5= new Node();
		n5.id=5;	
		n3.next=n4;
		n4.next=n5;
		n2.next=n3;
		n.next=n2;
		q.kthelement(n, 1);
	}

	public void findMiddle(Node n){
		Node c=n.next;	Node c2=n.next.next;		
		while(c2!=null&&c2.next!=null){
			c=c.next;
			c2=c2.next.next;
		}	
		
		System.out.println(c.id);
	}
	
	// 1 2 3 4 5
	public void kthelement(Node n,int k){
		Node c2=n;		Node c=n; int t=0;
		while(c2.next!=null){
			if(t>=k){
				c=c.next;
			}
			c2=c2.next;
			t=t+1;
		}	
		System.out.println(c.id);
	}
	
	
}
