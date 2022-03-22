package tree;
import java.util.LinkedList;
import java.util.Queue;

import base.Node;
// LINKEDLIST TO BT- USE A QUEUE
public class LinkedListToCOMPLETEBt {

	public static void main(String[] args) {	
	LinkedList<Integer> ln= new LinkedList<Integer>();
	ln.add(12);ln.add(14);
	ln.add(15);	ln.add(16);
	level(ln);
	print(referencetohead,"root");
	}
	static Node referencetohead=null;
	
	// create a q
	// add first node
	//loop and keep adding to left or right
	static void level(LinkedList<Integer> list){
		Queue<Node> queue= new LinkedList<Node>();
		Node n2=new Node(list.poll());
		queue.add(n2);
		referencetohead=n2;
		while(!queue.isEmpty()){
			
			Node n =queue.poll();//poll first
			if(list.peek()!=null){// check linkedlist
				n.left=new Node(list.poll());	//create left
				queue.add(n.left);// addleft to q
			}
			if(list.peek()!=null){
				n.right=new Node(list.poll());
				queue.add(n.right);
			}
			
		}		
	}
	
	
	public static void print(Node n,String l){
		if(n==null) return;
		System.out.println(l+n.id);
		print(n.left,"left ");
		
		print(n.right,"right ");
	}
}
