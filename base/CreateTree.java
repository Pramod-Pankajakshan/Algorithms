package base;
public class CreateTree {
	
	
	
	
	/**
	 * 
	 * 			1
	 * 	   2	    3
	 * 	4	 5    6	   7
	 *           8   
	 *          9
	 * 
	 * @return
	 */
	public Node createTree(){
		Node n= new Node(1);
		
		Node n2= new Node(6);
		Node n3= new Node(3);
		
		Node n4= new Node(4);
		Node n5= new Node(5);
		
		Node n6= new Node(6);
		Node n7= new Node(7);
		Node n8= new Node(8);
		Node n9= new Node(9);
		
		n8.addleft(n9);
		n6.addleft(n8);
		
		n2.addleft(n4);
		n2.addright(n5);
		
		n3.addleft(n6);
		n3.addright(n7);
		
		n.addleft(n2);
		n.addright(n3);
		return n;
	}
	public Node createTree2(){
		Node n= new Node(1);
		
		Node n2= new Node(2);
		Node n3= new Node(3);
		
		Node n4= new Node(4);
		Node n5= new Node(5);
		
		Node n6= new Node(6);
		Node n7= new Node(7);
		Node n8= new Node(8);
		Node n9= new Node(9);
		
		//n8.addChildFalse(n9);
		//n6.addChildFalse(n8);
		
		n2.addleft(n4);
		//n2.addChildTrue(n5);
		
		n3.addleft(n6);
		n3.addright(n7);
		
		n.addleft(n2);
		n.addright(n3);
		return n;
	}

}
