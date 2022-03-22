package array;

import java.util.HashMap;

public class ArrayManipulation {

	
	public static void main(String[] args) {
		//int a[]= new int[10];
		nonrepeatedchar("qwertyqwer");
		int a[]= {1,2,3,4,8,9};closestSum(a,10);
	}	
	//sorted array - find the closest sum
	// 2 numbers are used not range
	static void closestSum(int a[],int sum){
		int closest=Integer.MAX_VALUE;
		int l=0; int r=a.length-1; int c1=0; int c2=0;
		while(r>l){
			int current=Math.abs(a[l]+a[r]-sum);
			if(current<closest){
				closest=current;c1=a[l];c2=a[r];
			}
			if(sum-a[l]+a[r]>0){
				l=l+1;
			}else if (sum-a[l]+a[r]<0){
				r=r-1;
			}else{
				System.out.println("exact match "+a[l]+""+a[r]+"");
				break;
			}
			
		}
		System.out.println(c1 +"-"+c2);
		
	}
	
	
	static void closestSum2(int sum, int arr[]) {
		
	}
	
	static void nonrepeatedchar(String s){
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char cs[]=s.toCharArray();
		for(int i=0;i<cs.length;i++){
			if(hm.get(cs[i])!=null){
				hm.put(cs[i], hm.get(cs[i])+1);
			}else{
			hm.put(cs[i],1 );
			}
		}
		for(int i=0;i<cs.length;i++){
		   if(hm.get(cs[i])==1){
			   System.out.println(cs[i]); break;
		   }
		}
		
		
		
	}
}
