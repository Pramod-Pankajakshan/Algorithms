package leetcode;

import java.util.Arrays;

public class PascalsTriangle {
	//     1
	//   1 2 1
   //   1 3 3 1
//     1 4 6 4 1
	//1 5 10 10 5 1
	
	
	public static void main(String[] args) {
		int g[]= {1,2,1};
		int c=5;
		System.out.println("[1]");
		printIt(g,c-1);
	}

	//     1
	//   1 2 1
   //   1 3 3 1
//     1 4 6 4 1
	//1 5 10 10 5 1
	public static void printIt(int[] a, int c) {
	
		if(c==0) return;
		System.out.println(Arrays.toString(a));
		int next[]=new int[a.length+1];
		next[0]=1;next[a.length]=1;
		int i=0; 
		while(i<a.length-1) {
			next[i+1]=a[i]+a[i+1];			
			i++;		
		}	
		
		
		printIt(next,c-1);
	}
	
	
}
