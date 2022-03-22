package base;
public class CreateBSTree {
	

public void print(Node n){
	if(n==null) return;
	System.out.println(n.id);
	print(n.left);
	
	print(n.right);	
}
	
	public Node createTree(){ 
		Node n11= new Node(11);
		Node n12= new Node(12);
		Node n13= new Node(13);
		Node n14= new Node(14);
		
		Node n15= new Node(15);
		Node n16= new Node(16);
		Node n17= new Node(17);
		Node n18= new Node(18);
		
		
		Node n= new Node(1);		
		Node n3= new Node(0);		
		Node n5= new Node(5);	
		Node n6= new Node(6);
		Node n7= new Node(7);		
		Node n9= new Node(0);
		Node n10= new Node(10);
		
		
		
		
		
		
		n7.addleft(n15);
		n7.addright(n16);
		n10.addleft(n17);
		n10.addright(n18);
		
		n.addleft(n11);
		n.addright(n12);
		
		n5.addleft(n13);
		n5.addright(n14);
		
		n9.addleft(n7);
		n9.addright(n10);
		
		n3.addleft(n);		
		n3.addright(n5);
		
		n6.addleft(n3);
		n6.addright(n9);
		
		                         
		return n6;
	}
/**
    		   ( 6 )
*	       /     \
*	    __/       \ _
*	  ( 3 )        ( 9 )
*     /  \         / \ 
*  __/    \ _     /   \
* ( 1 )  ( 5 ) ( 7 )  ( 10 )
* 
* @return
*/
	public Node createTree6(){ 
		
		
		Node n= new Node(1);		
		Node n3= new Node(3);		
		Node n5= new Node(5);	
		Node n6= new Node(6);
		Node n7= new Node(7);		
		Node n9= new Node(9);
		Node n10= new Node(10);
		Node n11= new Node(11);Node n13= new Node(13);Node n12= new Node(12);
		n9.addleft(n7);
		n9.addright(n10);
		n3.addleft(n);		
		n3.addright(n5); 
		
		n6.addleft(n3);
		n6.addright(n9);
		
		return n6;
	}
public Node createTree10(){ 
		
		
		Node n1= new Node(1);	
		Node n2= new Node(2);	
		Node n3= new Node(3);Node n4= new Node(4);		
		Node n5= new Node(5);	
		Node n6= new Node(6);
		Node n7= new Node(7);Node n8= new Node(8);		
		Node n9= new Node(9);
		Node n10= new Node(10);
		Node n11= new Node(11);
		Node n13= new Node(13);Node n14= new Node(14);Node n15= new Node(15);Node n16= new Node(16);
		Node n12= new Node(12);
		Node n0= new Node(0);Node n17= new Node(17);Node n18= new Node(18);
	
		n1.right=n4;
		n1.left=n3;
		
		n3.addleft(n7);		
		n3.addright(n8); 
		n2.left=n5;n2.right=n6; 
		n0.addleft(n1);
		n0.addright(n2);
		n4.left=n9; n4.right=n10; n5.left=n11; n5.right=n12; n6.left=n13; n6.right=n14;
		n7.left=n15; n7.right=n16; n8.left=n17;n8.right=n18;
		return n0;
	}
	public Node createTree62(){ 
		
		
		Node n= new Node(1);		
		Node n3= new Node(3);		
		Node n5= new Node(500);	
		Node n6= new Node(6);
		Node n7= new Node(7);		
		Node n9= new Node(900);
		Node n10= new Node(10);
		
		n9.addleft(n7);
		n9.addright(n10);
		n3.addleft(n);		
		n3.addright(n5); 
		
		n6.addleft(n3);
		n6.addright(n9);
		
		return n6;
	}
public Node createTree61(){ 
		
		
	Node n= new Node(1);		
	Node n3= new Node(3);		
	Node n5= new Node(5);	
	Node n6= new Node(6);
	Node n7= new Node(7);		
	Node n9= new Node(9);
	Node n10= new Node(10);
	
	Node n11= new Node(4);
	Node n12= new Node(10);
	Node n13= new Node(10);
	
	n9.addleft(n7);
	n9.addright(n10);
	n3.addleft(n);		
	n3.addright(n5); 
	n5.addleft(n11);
	n6.addleft(n3);
	n6.addright(n9);
	
	return n6;
	}
	
	
	public Node createTreeNotCom(){ 
		
		
		Node n= new Node(1);		
		Node n3= new Node(3);		
		Node n5= new Node(5);	
		Node n6= new Node(6);
		Node n7= new Node(7);		
		Node n9= new Node(9);
		Node n10= new Node(10);	Node n11= new Node(11);	Node n12= new Node(12);		
		Node n13= new Node(13);
		n10.addright(n13);
		n11.addleft(n12);
		n7.addleft(n11);
		n9.addleft(n7);
		n9.addright(n10);
		n3.addleft(n);		
		//n3.addChildTrue(n5);		
		n6.addleft(n3);
		n6.addright(n9);
		                         
		return n6;
	}
	
	
	//use for pre order
	public Node preorder(){ 
		
		
		Node n= new Node(1);		
		Node n3= new Node(3);		
		Node n5= new Node(5);	
		Node n6= new Node(6);
		Node n7= new Node(7);		
		Node n2= new Node(2);
		Node n4= new Node(4);
		
		n2.left=n4; n2.right=n5;
		n3.left=n6; n3.right=n7;
		n.left=n2;n.right=n3;
		
		
		                         
		return n;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
