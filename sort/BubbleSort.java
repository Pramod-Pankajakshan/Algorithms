package com.pramod.sort;

import java.util.Arrays;


public class BubbleSort {
	public static void main(String args[]){
		System.out.println("hello start");
		bubbleSort(h);
		System.out.println(h);
	}
	static int[] h={1,14,2,13,11};
	public static void bubbleSort(int[] ha){
		int temp=0;
		boolean swapped=false;
		do{
			swapped=false;
		for(int i=0;i<h.length-1;i++){
			if(i!=h.length-1&&h[i]>h[i+1]){
				swapped=true;
				temp=h[i];
				h[i]=h[i+1];
				h[i+1]=temp;
			}
			System.out.println(Arrays.toString(h));
		}
		}while(swapped);
		
	}
	
	
	

}
