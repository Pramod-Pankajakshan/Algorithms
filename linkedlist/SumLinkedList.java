package linkedlist;

import base.Node;

public class SumLinkedList {
	
	static class Node{
		public Node(int val) {
			this.val=val;
		}
		int val;
		Node next;	
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public int getId() {
			return val;
		}
		public void setId(int id) {
			this.val = id;
		}		
	}
	
public static void main(String arg[]){
	Node n = new Node(2);
	Node n1 = new Node(0);
	Node n2 = new Node(4);
	n.setNext(n1);n1.setNext(n2);
	
	Node n3 = new Node(1);
	Node n4 = new Node(0);
	Node n5 = new Node(6);
	n3.setNext(n4);n4.setNext(n5);
	
	Node nn=addTwoNumbers(n,n3);
	while(nn!=null) {
		System.out.println(nn.val);
		nn=nn.next;
	}

}


public static Node addTwoNumbers(Node p, Node q) {
    Node dummyHead = new Node(0);
    Node  curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new Node(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new Node(carry);
    }
    return dummyHead.next;
}
}



