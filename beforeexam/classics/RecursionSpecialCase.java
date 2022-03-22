package beforeexam.classics;

import java.util.*;


public class RecursionSpecialCase {

	public static void main(String args[]) {
         int[][] inn= new int[][] {{4,5},{1,1},{5}};  
		 recur(inn,0,0,10);
		 System.out.println(re);
	}
   static   int re=0;
	private static void recur(int[][] input, int pos, int curr, int tot) {
		if(curr>tot) return;
		System.out.println("pos is "+pos);
		if(pos>input.length-1) {
			if(tot>=curr)re=re+1; 
			return;
		}
		
		int[] cr= input[pos];
		for(int i:cr) {
			//curr=curr+i;
			System.out.println("st..."+curr);
			recur(input, pos+1, curr+i,tot);
			System.out.println("pos is >"+pos);
			System.out.println("return..."+curr);//Note that its pos+1 and not pos++
			//curr=curr-i;

		}
		
	}
}

