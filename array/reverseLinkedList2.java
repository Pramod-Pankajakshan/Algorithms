package array;

public class reverseLinkedList2 {
 static LNode op;int level=0;
	public static void main(String[] args) {
        op=null;
		LNode l1= new LNode();
		l1.setG(1);
		
		LNode l2= new LNode();
		l2.setG(2);
		LNode l3= new LNode();
		l3.setG(3);
		LNode l4= new LNode();
		l4.setG(4);
		LNode l5= new LNode();
		l5.setG(5);
		LNode l6= new LNode();
		l6.setG(6);
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(l5);
		l5.setNext(l6);
		reverseLinkedList2 rr= new reverseLinkedList2();
		System.out.println(l1.toString());
		System.out.println(rr.re(l1,3).toString());
		//System.out.println(op.toString());
		
	}
	
	LNode re(LNode h,int k){//new h
		int c=0;
	level=level+1;
		LNode temp=null;
		LNode next=null;
		LNode head=h;		//new
		//reverse
		while(head!=null&&c<k){		
			c=c+1;			
			next=head.getNextNode();
			head.next=temp;
			temp=head;
			head=next;			
			}		
		
		
		if(head!=null){
		h.next=re(head,k);//append to the tail of last one - h is last one		
		}	
		
		return temp;
	}
	
	public static class LNode{
		LNode next;
		int g;
		void setG(int gg){
			this.g=gg;
		}
		
		int getG(){
			return g;
		}
		
		void setNext(LNode n){
			this.next=n;
		}
		
		LNode getNextNode(){
			return next;
		}
		
	public String	toString(){
		String h=""+g;	
		LNode temp1=this.next;
		while(temp1!=null){
				h=h+"-"+temp1.g;
				temp1=temp1.getNextNode();
			}
	return 	h;
	}
	}

}