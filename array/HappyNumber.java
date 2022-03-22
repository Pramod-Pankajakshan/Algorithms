package array;

import java.util.HashSet;

public class HappyNumber {
	
	/***
	 * 
	 * 
	 * 
	 * 
	 * Write an algorithm to determine if a number is "happy".

	 A happy number is a number defined by the following process: Starting with any positive integer,
	 replace the number by the sum of the squares of its digits, 
	 and repeat the process until the number equals 1 (where it will stay),
	 or it loops endlessly in a cycle which does not include 1. 
	 Those numbers for which this process ends in 1 are happy numbers.
		
		Example: 19 is a happy number
		
		12 + 92 = 82
		82 + 22 = 68
		62 + 82 = 100
		12 + 02 + 02 = 1

	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		isHappy(25);
	}
	
	static void isHappy(int i){
		System.out.println("--"+i);
		int newi=i;
		HashSet<Integer> hs= new HashSet<Integer>();
		while(true) {
			if(!hs.add(newi)) {
				System.out.println("CYCLIC");
				break;
			}
		if(newi==1) {
			System.out.println("HAPPY");
			break;
		}
		
		 newi=getSquare(newi);
		System.out.println(newi);
		}
		
		
		
		
	}
// 37 gives 58 3^2+7^2
static	int getSquare(int i) {
	     int temp=i;
		int sum=0;
		while(i>0) {
			int r=i%10;
			sum=sum+r*r;
			i=i/10;			
		}
		System.out.println(temp+"-"+sum);
		return sum;
	}
	
}
