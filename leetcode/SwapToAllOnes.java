package leetcode;

import java.util.*;

//https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together/  
public class SwapToAllOnes {

	public static void main(String args[]) {

		fn(new int[] {1,1,1,0,1,0,1,0,0,0,0,1});

	}
	static int ans=100;
	private static void fn(int[] in) {
		
		int r=(int) Arrays.stream(in).filter(c -> c==1).count();
		int res=(int) Arrays.stream(in).limit(r).filter(c -> c==1).count();
		System.out.println(res);
		System.out.println(r);
		ans=r-res;
		int st=1; int en=st+1+r; 
		while(en<in.length) {
			if(in[st]==1) res--;
			if(in[en]==1) res++;		
			st++; en++;
			ans=Math.min(ans, r-res);
		}
		System.out.println(ans);
	}
}

