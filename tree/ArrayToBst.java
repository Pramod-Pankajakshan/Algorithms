package tree;

import base.Node;

public class ArrayToBst {
public static void main(String[] args) {
		
		int []ds={1,1,2,3,3,4,4};
		ArrayToBst d= new ArrayToBst();
		d.toBst(ds,0,ds.length-1);//imp
	}

public Node toBst(int a[],int st,int en){
	if(en<st) return null;
	
	int mid=st+en/2;
	Node n=new Node(a[mid]);
	n.left=toBst(a,st,mid-1);// meed  plus 1
	n.right=toBst(a,mid+1,en);//meed minus 1
	
	return n;
}

//DIY

public Node toBST(int[] ar,int start,int end){

	if(end<start) return null;
	
	int mid=start+end/2;
	Node n= new Node(ar[mid]);
	n.left=toBst(ar, start, mid-1);
	n.right=toBst(ar, mid+1, end);
    
	return n;
}

}
