package array;

public class CircularLinkedList {
	
	public static void main(String[] args) {
		Node n5= new Node();
		Node n3= new Node();
		Node n4= new Node();
		Node n2= new Node();
		Node n1= new Node();
		n4.setNext(n2);
		n3.setNext(n4);	
		n2.setNext(n3);
		n1.setNext(n2);
		n4.setId(4);		
		n2.setId(2);
		n3.setId(3);
		n5.setId(5);
		n1.setId(1);	
		
		CircularLinkedList c= new CircularLinkedList();
		c.check(n1);
		
	}

	
 void check(Node n){
	 Node slow=n;
	 Node fast=n;
	 
		while(fast!=null&&fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast){
				System.out.println("ok"+slow.id);
				break;
			}
			
			if(fast==null||fast.next==null) return;
		}
		
		slow=n;
		while(slow!=null){
			slow=slow.next;
			fast=fast.next;
			if(slow==fast)System.out.println(slow.id); return;
		}
	}
	
	static class Node{
		
		Node next;
		
		int id;

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}	
		
	}
}
