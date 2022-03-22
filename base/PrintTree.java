package base;

import java.util.LinkedList;
import java.util.Stack;


public class PrintTree {
	int i=0;
	/**
	 * 
	 * 			1
	 * 		2		   3
	 * 	4		5  6	   7
	 * 
	 * 
	 * 
	 * @return
	 */
	public static void main(String[] args) {
		CreateTree d= new CreateTree();
		Node n=d.createTree();
		//new PrintTree().printLevelNode(n);
		new PrintTree().mm(n);
	}
	
	
    public void printLevelNode(Node n){
    	i=i+1;
		if(n==null){
			System.out.println("r");
		//	System.out.println("i is "+i);
			i=i-1;
			//System.out.println("i is "+i);
			return;
		}
	System.out.println(	n.getUniqueId());
	System.out.println(	"level..."+i);
	printLevelNode(n.left);
	System.out.println("to right");
	
	printLevelNode(n.right);
	}

    /**simple print
	 * 
	 * @param n
	 */
 public	void printNode(Node n){
		
		if(n==null){
			return;
		}
	
	printNode(n.left);
	System.out.println(	n.getUniqueId());
	printNode(n.right);
	}
	
	void printNodeNoRec(Node n){
		Node f=n;
		Stack s= new Stack<Node>();
		while(true){
			while(f!=null){
			
			
			System.out.println(f.getUniqueId());
			s.add(f);
			f=f.left;	
			if(f==null){
				System.out.println("f left is null");
			}
		     }
			if(!s.empty()){
			Node fd=(Node) s.pop();
			System.out.println("pop for"+fd.getUniqueId());
			f=fd.right;
			System.out.println("f"+f);
			}
		}
	}
	
	//just add to a q and u will be just fine
	
	void mm(Node n){
		
		Node temp=null;
		LinkedList<Node> ln= new LinkedList<Node>();
		ln.add(n);
		int coui=0;
		while(!ln.isEmpty()){
			coui=coui+1;
		
			temp=ln.poll();					
			System.out.println("polled ="+temp.getUniqueId());
			
		if(temp.left!=null){
         	ln.add(temp.left);
		}
		
		
		 
		
		if(temp.right!=null){
			ln.add(temp.right);
		}
		}
	}
	
	
	
	
}
