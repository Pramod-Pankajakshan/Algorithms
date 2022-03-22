package matrix;

import java.util.HashMap;

public class BackPack {
	
	int a[][]= new int[10][10];
	
	public static void main(String[] args) {
		int g[][]= new int [2][2];
		g[0][0]=0;g[0][1]=1;g[1][0]=2;g[1][1]=3;
		
		print(g);
		
	}

	
	static void print(int a[][]) {
		int x=a.length;
		int y=a[0].length;
		for(int i=0;i<x;i++ ) {
			for(int j=0;j<y;j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
}
