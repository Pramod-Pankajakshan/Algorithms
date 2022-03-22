package linkedlist;

import java.util.LinkedList;

public class CustomSortLk {
	
	static class Node{
		int id;
		Node next;
	}
	
	public static void main(String[] args) {
		Node n0=new Node();n0.id=0;
		Node n1=new Node();n1.id=1;
		Node n2=new Node();n2.id=2;
		Node n3=new Node();n3.id=3;
		Node n4=new Node();n4.id=4;
		Node n5=new Node();n5.id=5;
		
		n5.next=n0;
		n0.next=n4;
		n4.next=n3;
		n3.next=n2;
		n2.next=n1;
		Node f=makelistbyn(n5,3);
		
		while(f!=null){
			System.out.println(f.id);
			f=f.next;
		}
	}
	//sort such that nodes with value less than n is up and down otherwise
static	Node  makelistbyn(Node n,int m){
		Node n1=null; Node n2=null;
		Node temp1=null;Node temp2=null;
		while(n!=null){
			if(n.id<m){				
				temp1=new Node();
				temp1.id=n.id;				
				temp1.next=n1;
				n1=temp1;							
			}else{
				temp2=new Node();
				temp2.id=n.id;				
				temp2.next=n2;
				n2=temp2;
			}	
			n=n.next;
		}
		Node j=null;
		Node nf=n1;
		while(n1!=null){
			j=n1;
			n1=n1.next;
		}
		
		Node n3=new Node();
		n3.id=m;
		j.next=n3;		
		n3.next=n2;
		
		return nf;
	}
}
