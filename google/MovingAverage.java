package google;

import java.util.*;


public class MovingAverage {

	int [] arr;
	int pos=0;
	int sum=0;
	int windowSize=0;
	int i=0;
	public static void main(String args[]) {
		MovingAverage mv=new MovingAverage();
		mv.windowSize=3;
		mv.arr= new int[mv.windowSize];
		mv.next(1);mv.next(4);
		mv.next(3);mv.next(2);	mv.next(5);	mv.next(6);	mv.next(9);		
	}
     // 1 2 3 4
	private  double next(int input) {
		 if(i<windowSize) {
		 sum=sum+input;// 1
		 }else{
		 sum=sum+input- arr[pos];
		 }
		 arr[pos]=input;
		 pos++;
		 i++;
		 System.out.println("s-"+sum);
		 if(pos>=windowSize) pos=0;
		 if(i<windowSize) return sum/i;	
		 System.out.println(sum/windowSize);
		return sum/windowSize;
	}
}

