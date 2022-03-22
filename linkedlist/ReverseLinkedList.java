package linkedlist;

import linkedlist.LinkedListWork.Node;

public class ReverseLinkedList {

static class Node {
		
		int id;
		Node next;
		public Node(int id) {
			this.id=id;
		}
	}
	
	public static void main(String[] args) {
		Node n1= new Node(1);Node n2= new Node(2);Node n3= new Node(3);Node n4= new Node(4);Node n6= new Node(6);
		n1.next=n2; n2.next=n4; n4.next=n6;n6.next=n3;
	    Node t=	revByCondition(n1);		
		while(t!=null) {			
			System.out.println(t.id);
			t=t.next;
		}
	}
	
	static Node  reverseLinkedList(Node n){
		
		Node node= n;// define current variable
		Node temp=null;
		Node prev=null;
		
		while(node!=null){ // 1 2  null  // 2 1
		temp=node.next;	  // next =2  // to set the counter
		node.next=prev;  // 1-> null // swith
		prev=node;		// prev =1  //switch
		node=temp;     // current =2  // now use the counter from 1
		}		
		return prev;
	}
	//wrong
	static Node revByCondition(Node n) {
		Node head=n;
		Node t=n;
		while(t!=null&&t.next!=null) {
	     if(t.next.id%2==0) {
	    	 t.next=reverseLinkedList2(t.next);
	    	 t=pointer;
	     }else {
	    	 t=t.next;
	     }
		
		}
		
	return head;
	}
	static int c=0;
	static Node pointer;
	static Node  reverseLinkedList2(Node n){
		c=0;pointer=null;
		Node head=n;
		Node node= n;// define current variable
		Node temp=null;
		Node prev=null;
		
		while(node!=null){ // 1 2  null  // 2 1
		temp=node.next;// next =2  // to set the counter
		node.next=prev;  // 1-> null // swith
		prev=node;		// prev =1  //switch
		node=temp;   // current =2  // now use the counter from 1
		c++;
		if(node!=null&&node.id%2!=0)break;
		}		
		pointer=node;
		n.next=node;
		return prev;
	}
}


