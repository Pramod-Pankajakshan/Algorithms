package array;

import java.util.Arrays;
import java.util.Stack;

public class DutchFlag {
	
	public static void main(String[] args) {
		int g[]=new int[] {0,1,2,0,2,1,1,0};
		//g=new int[] {0,0,1,1,1,0};
		DutchFlag d= new DutchFlag();
		d.threeWayPartition(g);
		//d.sort(g);
		System.out.println(Arrays.toString(g));
	}
	
	 public static void sort(int[] nums) {
	        int l=0; int r=nums.length-1;
	        boolean z=false;boolean t=false;
	        while(r>l){            
	            if(nums[l]==1){
	                z=true;
	            }else{
	                l++;
	            }
	            if(nums[r]==0){
	                t=true;
	            }  else{
	                r--;
	            }          
	            if(z&&t){                
	                swap(nums,l,r);
	                z=false;
	                t=false;
	                l++;r--;
	            } 
	        }
	
	}
	
	static void swap(int[]k,int a,int b){
		int t=k[a];		
		k[a]=k[b];
		k[b]=t;
	}

	
	
	/// 0 1 2 0 0 2 1 2 0 2 1 1 1 0
	public void threeWayPartition(int in[]) {
		// have 3 moving vars
		int st=0; int mid=0; int en=in.length-1;
		while(mid<=en) {
			// mid<=en
			switch(in[mid]) {// its the MID
			case 0:
				swap(in,mid,st);
				mid++;
				st++;				
				System.out.println("case 0 first swap mid and start, increment both");break;
			case 1:
				mid++;
				System.out.println("case 1 - no swap mid++");break;
			case 2: 				
				swap(in,mid,en);
				en--;
				System.out.println("case 2 first swap mid and en -  en--");break;			
			}
			System.out.println(Arrays.toString(in));
		}
		
	}
	
	
	
}
