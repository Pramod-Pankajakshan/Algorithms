package array;

import java.util.Arrays;
import java.util.Stack;

public class SwappedTwoCorrectIt {

	//start from left
	// push all and pop when small is found 
	public static void main(String[] args) {
		int []g={1,2,3,4,5,6};
		correct(g);
		System.out.println("..");
	}
	
	static void correct(int h[]){
		int f=-1; int k=-1; boolean foundfist=false;
		for(int i=1;i<h.length;i++){
		        int t=i;
			if(h[i]<h[i-1]&&!foundfist){			
				foundfist=true;		        
				f=t-1;		 
			}
			if(h[i]<h[i-1]&&foundfist){		
						        
				k=t;		 
			}
			
		}
		swap(f,k,h);
		System.out.println(Arrays.toString(h));
	}

	static void swap(int a,int b,int g[]){
		int temp=g[a];
		g[a]=g[b];
		g[b]=temp;	
	}
}
