package linkedlist;

import java.util.HashMap;


public class AllLinkedList {

	public static void main(String[] args) {	
		Node n5= new Node();		n5.setId(5);		Node n4= new Node();		n4.setNext(n5);n4.setId(4);		
		Node n2= new Node();		Node n3= new Node();		n3.setNext(n4);n3.setId(3);		n2.setNext(n3);n2.setId(2);
		Node n1= new Node();		n1.setNext(n2);n1.setId(1);		
		//add dupe
	//	n5.setId(5);		Node dup= new Node();		dup.id=2;		Node n6= new Node();		n6.id=6;
		//n5.setNext(dup);		dup.setNext(n6);
		Node input= n1;
			
		Node n22= new Node();
		n22.id=9;
		Node n23= new Node();
		n23.id=1;
		Node n24= new Node();
		n24.id=2;
		n24.next=n23;
		n23.next=n22;
		
		Node n25= new Node();
		n25.id=9;
		Node n26= new Node();
		n26.id=6;
		Node n27= new Node(); 
		n27.id=4;
		n27.next=n26;
		n26.next=n25;
		
		
		
		AllLinkedList al= new AllLinkedList();
		//al.removeDupes(n1);
		//Node op=al.removeDupesNoBuffer(n1);
		//al.mid(n1);
		//al.kthElement(n1,3);
		al.partitionNode(n1);		
		//al.sum(n24,n27);
		//al.linkAlternateNode(input);

	}
	
	Node removeDupes(Node n){
		Node p=null; Node n1=n;
		
		HashMap<Integer, String> h= new HashMap<Integer, String>();
		while(n1!=null){
			if(h.get(n1.getId())==null){
				h.put(n1.getId(), "");
			    p=n1;//basically p points to previous node			
			}else{
				p.next=n1.next;
			}
			
			n1=n1.next;
		}
		
		return n;
	}
	
	void removeDupesNoBuffer(Node n,int h){
		Node p=null;
		Node n1=n;
		while(n1!=null){			
			int toc=n1.getId();
			Node n2=n1.next;
			while(n2!=null){			    
				if(n2.getId()==toc){
					p.next=n2.next;
				}else{
					p=n2;
				}				
				n2=n2.getNext();				
			}
			n1=n1.next;
		}
		
		
	}
	Node removeDupesNoBuffer(Node n){
		Node p=null;
		Node n1=n;
		while(n1!=null){			
			int toc=n1.getId();
			Node n2=n1.next;
			while(n2!=null){			    
				if(n2.getId()==toc){
					p.next=n2.next;
				}else{
					p=n2;
				}				
				n2=n2.getNext();				
			}
			n1=n1.next;
		}
		
		return n;
	}
	
	
	void kthElement(Node n,int k){
		int c=0; Node n2=null;		
		n2=n;
		while(n!=null){
			c=c+1;			
			n=n.next;
			if(c>k+1){
				n2=n2.next;
			}
			
		}
		
		System.out.println(n2.getId());
	}
	
	void mid(Node n1){
		int c=0; Node n3=null;		
		n3=n1;
		while(n1!=null){
			
			if(n1.next!=null){
			n1=n1.next.next;
		    }else{
		    	System.out.println(n3.getId());
		    	return;
		    }
			n3=n3.next;
		}
		
	}
	
	void deleteNode(Node n){
		
		n.id=n.next.id;
		n.next=n.next.next;
	}
	
	void partitionNode(Node n){
		Node l = null;Node h=null;
		Node op=null;
		Node op2=h;
		while(n!=null){
			
			if(n.id<4){
			Node ne=new Node();	
			ne.setId(n.id);
			ne.setNext(l);
			l=ne;		//the gap[ where we have previous and new		
			}else{
				Node ge=new Node();	
				ge.setId(n.id);
				ge.setNext(h);
				h=ge;		
			}
			n=n.next;
		}
		System.out.println("low");
		while(l!=null){
			System.out.println("....."+l.getId());
			l=l.next;
		}
		System.out.println("high");
		while(h!=null){
			System.out.println("....."+h.getId());
			h=h.next;
		}
	}
	
	void sum(Node n1,Node n2){
		int s=0;int c=0; Node l=null;Node in=null;
		while(n1!=null&&n2!=null){
			s=c+n1.id+n2.id;
			c=s/10;
			if(s>=10)
				s=s%10;
			
			
			in= new Node();
			in.id=s;
			in.setNext(l);
			l=in;
			
			n1=n1.next; n2=n2.next;
		}
		if(n1==null&&n2!=null){
			while(n2!=null){
			s=c+n2.id;
			c=s/10;
			if(s>=10)
				s=s%10; 
			
			
			 in= new Node();
			in.id=s;
			in.setNext(l);
			l=in;
			n2=n2.next;
			}
		}
		if(n2==null&&n1!=null){
			while(n1!=null){
				s=c+n1.id;c=s/10;
				if(s>=10)
				s=s%10;
				
				 in= new Node();
				in.id=s;
				in.setNext(l);
				l=in;
				n1=n1.next;
		}
		}
		
		if(n2==null&&n1==null){
			 in= new Node();
			in.id=c;
			in.setNext(l);
			l=in;
			
		}
		
		
	
	}
	
	
	void linkAlternateNode(Node n){
		Node alt=null; Node n2=n;
	while(n!=null){
		alt=n.next;
		if(n.next!=null)
		n.next=n.next.next;
		n=alt;
	}
	while(n2!=null){
		System.out.println("."+n2.getId());
		n2=n2.next;
	}
	}
	
	
	
	static class Node{
		int id;
		Node next;	
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
