package array;

import java.util.Arrays;

public class SwapArrays {
public static void main(String[] args) {
	int h[]={15,2,3,4,5,6,7,8};
	//even and then odd
	int left=0;
	int right=h.length-1;
	
	while(left<right){
		if(left>=right) return;
		while(h[left]%2==0&&left<right){
			left=left+1;
			}
		
		while(h[right]%2==1&&left<right){
			right=right-1;
		}
		
		swap(left,right,h);
		left=left+1;right=right-1;
	}
	System.out.println(Arrays.toString(h));
}
	static void swap(int l,int r,int[]j){
		
		int t=j[l];
		j[l]=j[r];
		j[r]=t;
	}
}

