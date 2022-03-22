package stack;

import java.util.LinkedList;

public class Basics {
	public static void main(String[] args) {
		StackUsingQ a= new StackUsingQ();
		a.push("1");a.push("2");a.push("3");
		//System.out.println(a.pop());System.out.println(a.pop());System.out.println(a.pop());System.out.println(a.pop());
		Node n= new Node(1);Node n2= new Node(2);Node n3= new Node(3);Node n4= new Node(4);Node n5= new Node(5);Node n6= new Node(6);
		n.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;
		//kthelementinLinkedList(n,3);
		MyStack<Integer> ms= new MyStack<Integer>();
		ms.push(1);ms.push(2);ms.push(3);ms.push(4);ms.push(5);ms.push(6);ms.push(7);
		System.out.println(ms.pop());		System.out.println(ms.pop());		System.out.println(ms.pop());
	}
	
	static class Node{
		Node(Object ob){
			o=ob;
		}
		public Node next;
		public Object o;		
	}
	
	
	
	static void kthelementinLinkedList(Node ln,int k){
		int k1=0; int c=0; Node l2=ln;
		while(ln.next!=null){			
			if(c>=k){
				l2=l2.next;
			}
			c=c+1;
			ln=ln.next;
		}
		System.out.println(l2.o.toString());
	}
	
}
