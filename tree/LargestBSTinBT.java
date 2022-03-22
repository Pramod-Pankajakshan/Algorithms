package tree;

import base.CreateBSTree;
import base.Node;

//tushcode
public class LargestBSTinBT {
 static class MinMax{
	 int min=Integer.MAX_VALUE;
	 int max=Integer.MIN_VALUE;
	 boolean isbst=true;
	 int size=0;
 }
	
  public MinMax largest(Node n){
	  if(n==null) return new MinMax();
	  
	  MinMax mleft= largest(n.left);
	  MinMax mright= largest(n.right);
	  MinMax m= new MinMax();
	  if(!mleft.isbst||!mright.isbst||mleft.max>n.id||mright.min<n.id){ //minofright and maxofleft
		  m.isbst=false;
		  m.size=Math.max(mleft.size, mright.size);
		  return m;
	  }
	  
	  m.isbst=true;
	  m.size=mleft.size+mright.size+1;
	  m.min=(n.left==null)?n.id:mleft.min;// right check..
	  m.max=(n.right!=null)?n.id:mright.max;// left check of future
	   return m;
  }
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		
		MinMax m=new LargestBSTinBT().largest(node);
		System.out.println(m.size);
	}
}
