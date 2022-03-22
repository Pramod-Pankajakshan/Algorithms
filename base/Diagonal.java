package base;

import java.util.ArrayList;
import java.util.HashSet;

public class Diagonal {
	
	public static void main(String[] args) {
		int g[][]=new int[3][3];
		g[0][0]=0;g[0][1]=1;g[0][2]=2;
		g[1][0]=10;g[1][1]=11;g[1][2]=12;
		g[2][0]=20;g[2][1]=21;g[2][2]=22;
		printDiag(g);
	}	
	
	public static void printDiag(int[][] m) {
		int h[]=new int[(m.length)*m[0].length];
		int i=0;
		int rp=0;int cp=0;
		boolean up=true;
		while(rp!=m.length&&cp!=m[0].length) {
			System.out.println("ok");if(i>h.length-1)break;
			if(rp==0&&cp==0) {
				h[i]=m[rp][cp];
				cp++;i++;
				up=false;
			}
			if(up) {
				System.out.println("up");
				System.out.println("current rp="+rp);
				System.out.println("current cp="+cp);
				System.out.println(up);
				h[i]=m[rp][cp];
				i++;
				rp--;
				cp++;
				if(cp>m[0].length-1) {
					cp--;
					up=false;
				}
				if(rp<0) {
					rp++;					
					if(up==false)
					 rp=rp+1;
					
					
				}
				System.out.println("r="+rp);
				System.out.println("c="+cp);
				System.out.println(up);
			}else {
				System.out.println("down"+i);
				if(i>h.length-1)break;
				
				
				System.out.println(rp);System.out.println(cp);
				h[i]=m[rp][cp];
				i++;
				rp++;
				cp--;
				if(cp<0) {
					cp++;
					up=true;
				}
				if(rp>m.length-1) {
					rp--;
					cp++; cp++;
					up=true;
				}
				
		

			}
			
			
			System.out.println("r-"+rp);
			System.out.println(cp);
			System.out.println(up);
			
		}
		
		for(int si:h)System.out.println(si);
	}
	
	
	

}
