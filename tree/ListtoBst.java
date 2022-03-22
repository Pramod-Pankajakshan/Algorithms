package tree;

import base.Node;

public class ListtoBst{
	
	int d[]= new int[9];
	
	public static void main(String[] args) {
		ListtoBst c= new ListtoBst();
		c.d[0]=1;
		c.d[1]=2;
		c.d[2]=3;
		c.d[3]=4;
		c.d[4]=5;
		c.d[5]=6;
		c.d[6]=7;
		c.d[7]=8;
		c.d[8]=9;
	new LevelOrderTraversal().performLevelOrder(c.tobst(c.d, 0, 8));
	}
	//0 1 2 3 4 5 6
	int getmid(int start,int end){
	int mid=0;	
	
	return mid;
	}
	
	public Node tobst(int []s,int start,int end){//0 6
		Node n=null;
		int	mid= (start+end)/2;//3
		int	chk= (end-start);
		if(chk==0){return new Node(s[mid]);}
		if(chk==1){
			 n=new Node(s[mid]);
			 n.right= new Node(s[end]);
			return n;}
		if(chk<=2){
		 n=new Node(s[mid]);
		n.left=new Node(s[start]);
		n.right=new Node(s[end]);
		return n;
		}else{
			 n=new Node(s[mid]);						
		}		
		n.left=tobst(s,start,mid-1);
		n.right=tobst(s,mid+1,end);
		
		return n;
	}
	
	
	
	
}