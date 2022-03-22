package array;

import java.util.Arrays;

public class MergeLists {


	public static void main(String[] args) {
       int a[]={1,2,3,4,0,0,0,0,0};
       int b[]={1,3,5,6,8};
       sort(a,4,b,b.length);
       System.out.println(Arrays.toString(a));
	}
	

// merge two arrays
static void sort(int big[],int m,int []small,int n){
			
		while(m>0&&n>0){
			if(big[m-1]>small[n-1]){
				big[m+n-1]=big[m-1];
				m--;
			}else if(big[m-1]<small[n-1]){
				big[m+n-1]=small[n-1];
				n--;
			}else{
				big[m+n-1]=small[n-1];
				m--;
				n--;
			}
		}
		
		while(n>0){
			big[m+n-1]=small[n-1];
			n--;
		}
				
		}
		
	}
	

