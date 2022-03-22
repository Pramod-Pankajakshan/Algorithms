package array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {

 
	public static void main(String[] args) {
		//int a[]={2,3,4,5,8,12};
		//int b[]={1,2,3,6,7,9,14};
		int ar1[]={2,3,4,5,9,12};
		int ar2[]={1,2,3,6,7,9,14};
	
		
		m(ar1,ar2);
	}
	
	public static int[] merger(int[] a, int[] b) {

	    int[] main = new int[a.length + b.length];
	    int acount = 0, bcount = 0, maincount = 0;
//============================================================//
	    while (acount < a.length && bcount < b.length)
	    {
	        if (a[acount] < b[bcount])       
	            main[maincount++] = a[acount++];
	        else        
	            main[maincount++] = b[bcount++];               
	    }
//============================================================//
	    while (acount < a.length)  
	        main[maincount++] = a[acount++];
//============================================================//
	    while (bcount < b.length)    
	        main[maincount++] = b[bcount++];

	    return main;
	}
	
	
	
	public static void m(int ar1[],int ar2[]){
		int i1=0; int i2=0; 
		int union[]= new int[ar1.length+ar2.length];
		int inters[]=new int[ar1.length+ar2.length];
		int u=0; int i=0;
		while(i1<ar1.length&&i2<ar2.length){			
			if(ar1[i1]<ar2[i2]){
				union[u++]=ar1[i1++];
			}
			else if(ar1[i1]>ar2[i2]){
				union[u++]=ar2[i2++];
			}else{
				inters[i++]=ar2[i2++]; i1++;
			}			
		}
		
		 while (i1<ar1.length)  
			 union[u++] = ar1[i1++];
		 while (i2<ar2.length)  
			 union[u++] = ar2[i2++];
		
		System.out.println(Arrays.toString(inters));		
		System.out.println(Arrays.toString(union));
	}
}