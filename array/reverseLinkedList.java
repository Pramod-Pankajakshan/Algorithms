package array;

public class reverseLinkedList {
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
		reverseLinkedList rr= new reverseLinkedList();
		System.out.println(l1.toString());
		rr.re(l1,2);
		System.out.println(op);
		//System.out.println(op.toString());
		
	}
	
	void re(LNode h,int k){
		int c=0;int cc=0;
	    level=level+1;
		LNode temp=null;LNode temp2=null;
		LNode next=null;
		LNode head=h;boolean fp=false;	
		while(head!=null){
			
			if(!fp){
			c=c+1;			
			next=head.getNextNode();//get the next node
			head.next=temp;//aDD new row to itop
			temp=head;//store new node
			head=next;//loop			
			if(c==k){
				fp=true;
				c=0;
				
				if(op==null){
					System.out.println(temp);
					op=temp;
				}else{
					System.out.println(temp);
					op.setNext(temp);
				}
			}
			
			
			}else{
			 	c=c+1;
			 	temp2=head;
			 	temp2.setNext(null);
				op.setNext(temp2);
				head=head.getNextNode();
				if(c==k){
					fp=false;
					c=0;
				}
			}
		}
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
