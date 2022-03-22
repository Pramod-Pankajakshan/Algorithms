package beforeexam;

import base.CreateBSTree;
import base.Node;

public class TestTree {

public static void main(String[] args) {
	TestTree t= new TestTree();
	CreateBSTree c= new CreateBSTree();
	Node n=c.createTree();
	//System.out.println(t.isTreeBst(n,Integer.MAX_VALUE,Integer.MIN_VALUE));
	//int g[]= new int[256];
	//t.printAnces(n,g,0,13);
}


public void print(Node n){
	if(n==null) return;
	System.out.println(n.id);
	print(n.left);
	print(n.right);	
}


public boolean isTreeBst(Node n,int max,int min){
	if(n==null) return true; 
	
	if(!(n.id<max&&n.id>min)){// 
		return false;
	}	
	 return isTreeBst(n.left, n.id, min)&& isTreeBst(n.right, max,n.id);
}


public void printAnces(Node n,int a[],int c,int kid){
	if(n==null) return;
	if(n.id==kid){
		printA(a,c); return;
	}else{
	a[c]=n.id;
	printAnces(n.left,a,c+1,kid);
	printAnces(n.right,a,c+1,kid);}
}

public void printA(int a[],int c){
	for(int i=0;i<c;i++){
		System.out.println(a[i]);
	}
}


public void le

}
