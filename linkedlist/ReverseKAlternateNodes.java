package linkedlist;

import java.util.HashSet;

import linkedlist.CustomSortLk.Node;

public class ReverseKAlternateNodes {
	
	public static void main(String[] args) {
		Node n10=new Node();n10.id=10;
		Node n1=new Node();n1.id=1;
		Node n2=new Node();n2.id=2;
		Node n3=new Node();n3.id=3;
		Node n4=new Node();n4.id=4;
		Node n5=new Node();n5.id=5;
		Node n6=new Node();n6.id=6;
		Node n7=new Node();n7.id=7;
		Node n8=new Node();n8.id=8;
		Node n9=new Node();n9.id=9;
		
		Node n55=new Node();n55.id=5;
		Node n88=new Node();n88.id=8;
		Node n99=new Node();n99.id=9;
		Node n22=new Node();n22.id=2;
		n1.next=n2;
		
		n2.next=n3;
		//n22.next=n3;
		
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n55.next=n6;
		n6.next=n7;
		n7.next=n8;
		n8.next=n9;//n8.next=n88;n88.next=n99;n99.next=n9;
		n9.next=n10;
		print(n1);
		Node f=reverseAlternateKNodes(n1,3,true);
		
		System.out.println("========");
		//Node f=sort123(n1);
		
		print(f);

	}
	
	static void print(Node n){
		  while(n!=null){
			  System.out.println(n.id);
			  n=n.next;
		  }
	  }

	
	static Node reverseAlternateKNodes(Node n,int s, boolean flip) {
        int f=s;
		Node prev=null; 
		Node curr=n;
		Node temp=null;		
		if(flip){
				while(curr!=null ) { // 1 2 3 4 5 
					if(s<=0) 
						break;
					
				  	temp=curr.next;
					curr.next=prev;
					prev=curr; 		  	
					curr=temp;
					s--;
				}
				flip=false;
		}else{
				prev=n;
				while(n!=null) {
					if(s<=1) 
						break;
					n=n.next;
					s--;
				}
				if(n!=null)
				curr=n.next;				
				flip=true;
		}
		if(curr==null) return prev;
		if(n!=null)
		n.next=reverseAlternateKNodes(curr,f,flip);
		return prev;
	
	}
	
	
	static void intersection(Node n,Node n2) {
		HashSet<Node> hs= new HashSet<CustomSortLk.Node>();
		// iterate through the nodes 
		// put it in set
		// 
		while(n!=null) {
			hs.add(n);
			n=n.next;
		}
		
		while(n2!=null) {
			if(hs.contains(n2)) {
				System.out.println(n2.id);
				break;
			}
		}
		
	}
	
	
	static Node moveLastToFirst(Node n) {
		Node st=n;
		Node prev=null;
		while(n!=null&&n.next!=null) {
	 		prev=n;
			n=n.next;			
		}
          prev.next=null;
          
          n.next=st;
          
          return n;
		
	}
	 
	
	static Node removeDupesSorted(Node n) {
		Node prev=n;
		while(n!=null) {
			
			if(n.next!=null) { 
				if(n.id==n.next.id) {
					n.next=n.next.next;
					continue;
				}else {
					n=n.next;
				}
			}else {
				n=n.next;
			}
				
		}
		
		
		return prev;
		
	}
	
	static Node sort123(Node n) {
		Node one=null;
		Node two=null;
		Node three=null;
		while(n!=null) {
			
			if(n.id==1) {
				if(one==null) {
					one=n;
					
				}else {
				one.next=n;
				
				n=n.next;
				}
			}
				
		}
		
		
		return one;
		
	}
	
	
	
	
	
	
	

}
