package array;

import java.util.Arrays;

public class Merge2SortedArrays {


	public static void main(String[] args) {
	       int a[]={1,2,3,9};
	       int b[]={1,3,5,6,8};
	      int g[]= sort(a,b);
	       System.out.println(Arrays.toString(g));
		}
	
	private static int [] sort(int[] a,int []b) {
		int [] re=new int[a.length+b.length-2];
		int i=0;
		int	j=0;
		int rec=0;
		while(true) {
			if(i>=a.length&&j>=b.length) {
			  break;
			}else if(i>=a.length&&j<b.length) {
				re[rec]=b[j];
				rec++; j++;
				continue;
			} else if(j>=b.length&&i<a.length) {
				re[rec]=a[i];
				rec++; i++;
				continue;
			}
			if(a[i]==b[j]) {
				re[rec]=a[i];
				rec++;
				i++;
				j++;
			}else if(a[i]<b[j]) {
				re[rec]=a[i];
				rec++;
				i++;
			
			}else if(a[i]>b[j]) {
				re[rec]=b[j];
				rec++;
				j++;
			
			}
			
		}
			
			
		
		
		
		
		
		return re;
	}
		

	}
