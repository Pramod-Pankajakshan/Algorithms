package tree;

import base.CreateBSTree;
import base.Node;

public class Many {//node before subtrees
int counter=0; int datatofind=0;
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		new Many().print(node);
		System.out.println("----");
		new Many().getLeaf(node);
		//new Many().print(node);
	}
	
	public void print(Node n){		
		if(n==null) return ;
		 print(n.getLeft());			
		 print(n.getRight());
		 System.out.println(n.getUniqueId());	
		 }
	
	public Node min(Node n){
		
		if(n==null) return n;
		min(n.getLeft());
		
		
		if(counter==datatofind) System.out.println(n.getUniqueId());
		counter=counter+1;
		min(n.getRight());
		
	return n;
	}
 public Node max(Node n){
		
		if(n==null) return n;
		max(n.getRight());
		if(counter==datatofind) System.out.println(n.getUniqueId());
		counter=counter+1;
		max(n.getLeft());
		
	return n;
	}
 
 public int checkSum(Node n){
	 int l=0,r=0;
	 
	 
	 if(n.getLeft()!=null){
	  l=checkSum(n.getLeft());
	 }
	 if(n.getRight()!=null){
	  r=checkSum(n.getRight());}
	 System.out.println(l);System.out.println(r);
	 if(l!=0&&r!=0&&(l+r)!=n.getUniqueId()) System.out.println("no");
	 
	 return n.getUniqueId();
 }
 
 public void  getLeaf(Node n){
	 if(n==null) return ;
	 
	 
	 if(n.getLeft()!=null){
	 getLeaf(n.getLeft());}
	 if(n.getRight()!=null){
	 getLeaf(n.getRight());}
	 if(n.getLeft()==null&&n.getRight()==null) System.out.println(n.getUniqueId());

 }
 //b is greater than a
 public void  getLCA(Node n,int a,int b){
	 if(n==null) return ;
	 
	 if(a<n.getUniqueId()&&n.getUniqueId()<b){
		 System.out.println(n.getUniqueId());
		 return;
	 }
	 
	 if(b==n.getUniqueId()){
		 System.out.println(b); 
		 return;
	 }
	 if(a==n.getUniqueId()) {
		 System.out.println(a);
		 return;
	 }
	 
	 if(n.getLeft()!=null&&b<n.getUniqueId()){
		 getLCA(n.getLeft(),a,b);}
	 if(n.getRight()!=null&&b>n.getUniqueId()){
		 getLCA(n.getRight(),a,b);}
 }
 
 
 public void MakeNodeBigger(Node n){
	 
	 if(n==null) return ;
	 
	
	 
	 if(n.getLeft()!=null){
		 MakeNodeBigger(n.getLeft());
	 }
	 if(n.getRight()!=null){
		 MakeNodeBigger(n.getRight());
	 }
	 if(((n.getLeft()!=null)&&(n.getRight()!=null)
			 &&(n.getLeft().getUniqueId()+n.getRight().getUniqueId() )>n.getUniqueId())){
		 n.id= n.id+Math.abs((n.getLeft().getUniqueId()+n.getRight().getUniqueId() )-n.id);
	 }
	 
	 if(((n.getLeft()!=null))&&n.getRight()==null ){
		 n.id=n.getLeft().id;
		 }
	 
	  if(n.getLeft()==null &&n.getRight()!=null){
		  n.id=n.getRight().id;
		 }
	 
 }
 
public void childrenSum(Node n){
	 
	 if(n==null) return ;
	 
	 
	 if(n.getLeft()!=null){
		 childrenSum(n.getLeft());
	 }
	 if(n.getRight()!=null){
		 childrenSum(n.getRight());
	 }
	 if(((n.getLeft()!=null))&&n.getRight()!=null ){
			n.getLeft().id=n.getLeft().id+Math.abs(n.id+n.getRight().id);
		 }
		 if(((n.getLeft()!=null))&&n.getRight()==null ){
				n.getLeft().id=n.id;
			 }
		 
		  if(n.getLeft()==null &&n.getRight()!=null){
				n.getRight().id=n.id;
			 }
		 
 }
 
 
 
 
}
