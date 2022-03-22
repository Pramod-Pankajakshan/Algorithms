package linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListWork {
	
	static class Node {
		
		int id;
		Node next;
	
	}
	
	
	
	public static void main(String[] args) {
//		LinkedList<Integer> ln = new LinkedList<Integer>();
//		ln.add(1);ln.add(11);ln.add(12);ln.add(13);
//		Iterator<Integer> it=ln.iterator();
//		
//		while(it.hasNext()){		
//			if(it.next()==11){
//			it.remove();
//			}
//		}
//		Iterator<Integer> it2=ln.iterator();
//		
//		while(it2.hasNext()){		
//			System.out.println(it2.next());
//		}
//		
//		ArrayList<Integer> al= new ArrayList<Integer>();
//		al.add(1111);
//		
//		for(int g:al){
//			System.out.println(g);
//		}
//		
		
		 Node n11= new Node();
	     n11.id=11;
     Node n1= new Node();
     n1.id=1;
     Node n2= new Node();
     n2.id=2;
     Node n3= new Node();
     n3.id=3;
     Node n4= new Node();
     n4.id=4;
     Node n5= new Node();
     n5.id=5;
     Node n6= new Node();
     n6.id=6;
     Node n7= new Node();
     n7.id=7; //4 2 3 5 1 6 11 7
     //n4.next=n2; n2.next=n3; n3.next=n5;  n5.next=n1; n1.next=n6; n6.next=n11; n11.next=n7; 
          n1.next=n2;n2.next=n3; n3.next=n5;// n5.next=n6;n6.next=n7 ;
    
    System.out.println("===="); 
    Node n0= new Node();n0.id=4;
    print(n1);
    insertAnElementIntoLl(n0,n1);
    System.out.println("===="); 
    print(n1);
     // Node op=reverseLinkedList(n1);
   
      //print(op);
      //System.out.println("====");
      ////   Node op2=reverseLinkedListOnSize(n1,1);
      //   print(op2);
//     Node op2=mid(n1);
System.out.println("====");
// print(deletegreater(n4));
  
////     System.out.println("========");
////     print(n6);
////     Node op2=   sortTwoLinkedList(n1,n6);
////     System.out.println("========");
//   //  print(op2);
	}
	
	static void print(Node n){
		while(n!=null){
			System.out.println(n.id);
			n=n.next;
		}
	}
	
	static void test(Node n){
		Node current=n; Node na=null;
		Node f=null;
		while(current!=null){			
			na= new Node();
			na.id=n.id;		
			
			current=current.next;
		}
	}
	
	
	
	
	static Node  reverseLinkedList(Node n){
		
		Node node= n;// define current variable
		Node temp=null;
		Node prev=null;
		
		while(node!=null){ // 1 2  null  // 2 1
		temp=node.next;	// next =2  // to set the counter
		node.next=prev;  // 1-> null // swith
		prev=node;		// prev =1  //switch
		node=temp;        // current =2  // now use the counter from 1
		}		
		return prev;
	}
	
    static Node  reverseLinkedListOnSize(Node head,int k){
		
		Node node= head;
		Node temp=null;
		Node prev=null;
		int count=0; // 1 2 3 4 
		while(node!=null&&count<k){
		temp=node.next; // 2
		
		node.next=prev; //null 
		prev=node; //1 
		
		node=temp; //2
		count=count+1;
		}
		//out of loop
		if(temp!=null)
		head.next=reverseLinkedListOnSize(temp,k);
		
		return prev;
	}
	//Merge sort is best here
	public static Node  sortTwoLinkedList(Node n1, Node n2){
		Node result=null;
		if(n1==null&&n2!=null)
			return n2;
		if(n1!=null&&n2==null)
			return n1;
		
		if(n1==null&&n2==null) return result;
		
		if(n1.id<=n2.id){
			result=n1;
			result.next=sortTwoLinkedList(n1.next,n2);
		}else{
			result=n2;
			result.next=sortTwoLinkedList(n1,n2.next);
		}
		
		return result;
	}
	
	

	
	// 1 2 3
	public static void evenodd(Node n){
	
		Node current=n;
		Node nextodd=null;Node nextev=null;
	     Node odd=null; Node ev=null; 
		
		while(current!=null){
						
			if(current.id%2!=0){					
				nextodd=new Node();
				nextodd.id=current.id;
				nextodd.next=odd;
				odd=nextodd;					
			}else{				
				nextev=new Node();
				nextev.id=current.id;
				nextev.next=ev;
				ev=nextev;
			}
			current=current.next;
		}
		
		print(odd);print(ev);
	}
	//4 2 3 5 1 6 11 7
	public static Node deletegreater(Node n){
		Node c=n;	
		Node max=c.next; 
		Node temp=null;
		while(max!=null){
			
		    if(c.id<max.id){		    	
		    	c.id=max.id;
		    	c.next=max.next;
		    	max=max.next;
		    }else{
		    	c=c.next;
		    	max=max.next;
		    }		   
		}		
		return n;		
	}
	//17 15
static	public Node AddTwoLinkedList(Node n1,Node n2){
		Node sum=null; Node temp=null; int carry=0; int t=0;
		while(n1!=null&&n2!=null){
			temp=new Node();
		     if(carry+n1.id+n2.id>9){
				t=(carry+n1.id+n2.id)%10;
				carry=carry+n1.id+n2.id/10;
		     }else{
		    	 t=(carry+n1.id+n2.id);
		    	 }
			
			temp.id=t;
			temp.next=sum;
			sum=temp;
			n1=n1.next; n2=n2.next;
		}
		while(n1!=null){
			temp=new Node();
			 if(carry+n1.id>9){
				 t=(carry+n1.id)%10;
				 carry=carry+n1.id/10;
			 }else{
				 t=(carry+n1.id);
			 }
			temp.next=sum;
			temp.id=t;
			sum=temp;
			n1=n1.next;
		}
		while(n2!=null){
			temp=new Node();	
			if(carry+n2.id>9){
				 t=(carry+n2.id)%10;
				 carry=carry+n2.id/10;
			 }else{
				 t=(carry+n2.id);
			 }
			temp.id=t;
			temp.next=sum;
			sum=temp;
			n2=n2.next;
		}
		if(carry>0){
			temp=new Node();
			temp.id=carry;
			temp.next=sum;
			sum=temp;
		}
		
		return sum;
	}
	
	
	public static  Node mid(Node n){		
		Node n1=n;
		int length;
		while(n1!=null&&n1.next!=null){			
			n1=n1.next.next;
			n=n.next;			
		}
		System.out.println(n.id);
		return n;
	}
	
	public static void insertAnElementIntoLl(Node tois, Node n) {
      	//1235  insert 4 -SORTED
	   Node r=null;
		while(n.id<tois.id) {
			r= n;		//3
			n=n.next;	//5	
		}		
		r.next=tois;
		tois.next=n;
		
		
	}
	
	
	

}
