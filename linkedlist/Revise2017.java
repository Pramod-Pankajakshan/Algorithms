package linkedlist;

import java.util.PriorityQueue;

import base.Node;

public class Revise2017 {
	 static class Node{
		 Node(int id, Node next){
			 this.id=id;
			 this.next=next;
		 }
		int id;
		Node next;		
	}
	public static void main(String[] args) {
		int i=8;
		if((i&i-1)==0) {
		System.out.println("okokok");}
		Node n6 = new Node(6,null); 
		Node n5 = new Node(5,n6); 
		Node n4 = new Node(4,n5); 
		Node n3 = new Node(3,n4); 
		Node n2 = new Node(2,n3);
		Node n1 = new Node(1,n2);
		//getMiddle(n1);
		System.out.println("****************************");
		//getToKth(n1,2);
		separateEvenOdd(n1);
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
	}
	
	
	static void getMiddle(Node n) {
		Node n1=n;
		Node n2=n.next;
		while(true) {			
			if(n2!=null&&n2.next!=null) {
			n2=n2.next.next;			
			}else {
				System.out.println(n1.id);
				return;
			}
			n1=n1.next;
		}
		
		
	}
	
	static void getToKth(Node n, int k) {
		int counter=0;
		Node n1=n;
		Node n2=n;
		while(true) {	
			
			if(n2!=null) {
			n2=n2.next;			
			}else {
				System.out.println(n1.id);
				return;
			}
			if(counter>k)
			 n1=n1.next;
			
			counter++;
		}

	}
	
	// 2 pointers a flag 
	static void separateEvenOdd(Node n) {
		Node odd=n;
		Node even=n.next;
		Node ff=odd; // for result
		Node p=even; // for result
		n=n.next.next;
		boolean isOdd=true;
		while(n!=null) {  // 1 2 3 4 5
			
			if (isOdd) {
			  	odd.next=n;
			  	odd=odd.next; // push to that location of next
				isOdd=false;
			} else {			
				even.next=n;
				even=even.next;// push to that location of next
		        isOdd=true;
			}
			n=n.next;
		System.out.println("----");	
		}
		odd.next=null;
		even.next=null;
		print(ff);
		System.out.println("---");
		print(p);
		
	}
	
	
   static	void print(Node n){
		while(n!=null) {
			System.out.println(n.id);
			n=n.next;
		}
		
	}
	
	
	
	
	
	

}
