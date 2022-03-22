package base;
public class Node{
	public int id;

	public Node(int uid){
		this.id=uid;
	}
	
	public Node(){
		
	}
	

		
    public 	Node right;
	
	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}


	public Node left;

	

	public int getUniqueId() {
		return id;
	}
	
	public void addright(Node child){
		
	this.right=child;
	}
	
	public void addleft(Node child){
		this.left=child;
	}

}
