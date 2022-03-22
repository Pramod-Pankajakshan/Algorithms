package tree;

public class MapUsingBST {

	Node root;
	
	public void get(int id){
		
	}
	
	public void set(int key,Object val){
	
	}
	
	static class Node{
		
		int id;
		Object value;
		
		Node left;
		Node right;
		
	}
	
	
	void setData(int key,Object val){
		if(root==null){
			root= new Node();
			root.id=key;
			root.value=val;
		}else{
			
			
		}
		
	}
	 void insert(Node n,Node in,int key){
		if(n==null) {
			return;
		}
		 
		if(n.id<key){
		insert(n.left,in,key);			
		n.left=in;
		}else if(n.id>key){
			insert(n.right,in,key);
			n.right=in;
		}else{
			n.value=in.value;
		}
	 }
}
