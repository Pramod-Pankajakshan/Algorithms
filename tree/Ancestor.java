package tree;

import java.util.ArrayList;
import java.util.HashMap;

import base.CreateBSTree;
import base.Node;

public class Ancestor {//node before subtrees
    int g=10;boolean found;
    HashMap<Integer, Integer>  map= new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		CreateBSTree e= new CreateBSTree();
		Node node=e.createTree6();
		int s[]= new int[100];
		ArrayList<Integer> al= new ArrayList<Integer>();
		new Ancestor().printAnces(node,al,0,10);
	}
	/**
	 * 
	 * @param n
	 * @param al
	 * @param c counter
	 * @param kid
	 */
	public void printAnces(Node n,ArrayList<Integer> al,int c,int kid){
		if(n==null) return;
		if(n.id==kid){
			printA(al,c); return;
		}else{
		al.add(c, n.id);
		printAnces(n.left,al,c+1,kid);
		printAnces(n.right,al,c+1,kid);}
	}

	public void printA(ArrayList<Integer> al,int c){
		for(int f:al){
			if(c==0) break;
			c=c-1;
			System.out.println(f);
			
		}
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
//	public void  ancestor(Node n,int[] arr,int count){
//			if(n==null)
//				return;			
//			arr[count]=n.getUniqueId();
//			count=count+1;
//			if(n.getUniqueId()==5){
//				if(!found){
//					save(arr,count);				
//				}else{
//					for(int i=count-2;i>=0;i--){
//						if(map.get(arr[i])!=null){
//							System.out.println(arr[i]);
//							break;
//						}
//					}
//				}
//						
//				return;
//			}
//			if(n.getUniqueId()==1){
//				if(!found){
//					save(arr,count);				
//				}else{
//					for(int i=count-2;i>=0;i--){
//						if(map.get(arr[i])!=null){
//							System.out.println(arr[i]);
//							break;
//						}
//					}
//				}
//				return;
//			}
//		ancestor(n.getLeft(),arr,count);		
//		ancestor(n.getRight(),arr,count);	
//		
//	}
//
//	void save(int a[],int count){		
//		for(int i=0;i<count;i++)
//			map.put(a[i], i);
//	found=true;
//	}
//	
//	

}
