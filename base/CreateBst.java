package base;

import java.util.*;


public class CreateBst {

	public static void main(String args[]) {

		Node n=fn(new int[]{1,2,3},0,2);
        System.out.println(n.id);
	}
              
	private static Node fn(int[] in, int l, int r) {
		if(l>r) return null;// start > end
		
		Node n = new Node();
		
		int mid= (l+r)/2;
		n.id=in[mid];
		n.left=fn(in,l,mid-1);// mid-1 and mid+1 was missed
		n.right=fn(in,mid+1,r);
		
		return n;
	}
}

