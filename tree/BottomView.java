package tree;

import java.util.ArrayList;
import java.util.HashMap;

import base.CreateBSTree;
import base.Node;

public class BottomView {
	
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTreeNotCom();
		bottomView(node,0);
		for(int a:hm.keySet()){
			ArrayList<Node> as =hm.get(a);
			System.out.println("level -"+a);
			for(Node n:as){
				System.out.println(n.id);
			}
			System.out.println("--endd"+a);
		}
	}
	
static HashMap<Integer,ArrayList<Node>> hm= new HashMap<Integer,ArrayList<Node>>();


static	public void bottomView(Node n,int vlevel){
		
		if(n==null) return;
		if(hm.get(vlevel)!=null){
			ArrayList<Node> a=hm.get(vlevel);
			a.add(n);
		    hm.put(vlevel,a);}
		else{
			ArrayList<Node> aa= new ArrayList<Node>();
			aa.add(n);
			hm.put(vlevel,aa);
		}
		if(n.left!=null)
		bottomView(n.left,vlevel-1);
		if(n.right!=null)
		bottomView(n.right,vlevel+1);
	}
	
}
