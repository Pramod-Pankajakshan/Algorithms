package array;

import java.util.Arrays;

public class RotateArray2 {

	
	public static void main(String f[]){
		String s= new String(new char[] {'1'});
		int h[]={1,2,3,4,5,6,7}; // 
		int r=3;
		//rotate(h,0,r-1);	//System.out.println(Arrays.toString(h));
		//rotate(h,r,h.length-1);	//System.out.println(Arrays.toString(h));
		//rotate(h,0,h.length-1);
		//String g="1234";
		//System.out.println(g.substring(0,3));
		rotate2017(h,0,h.length-1);// reverse all
		System.out.println(Arrays.toString(h));
		rotate2017(h,0,r-1);// reverse first half 
		System.out.println(Arrays.toString(h));
		rotate2017(h,r,h.length-1);// reverse second half
		
		System.out.println(Arrays.toString(h));
	}
	
	
	public static void rotate(int []a,int st,int en){
		// or a while loop with start<end condition
		for(int i=st;i<en;i++){
			int temp=a[i];
			a[i]=a[en];
			a[en]=temp;
			en--;
		}
	}
  public static void rotate2017(int []a,int st,int en){
			
			while(st<en) {
				int temp=a[st];
				a[st]=a[en];
				a[en]=temp;
				st++;en--;				
			}
		
	}
  
  
  public void swap(int[] in, int st, int en) {
	  
	  while(st<en) {
		  int temp=in[st];
		  in[st]= in[en];
		  in[en]=temp;
		  st++; en--;
	  }
	  
	  
  }
  
  
  
}
