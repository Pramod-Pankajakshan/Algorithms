package leetcode;

public class IsPerfectSquare {

	
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(16));
	}
	
	
	
	static  boolean isPerfectSquare(int num) {
	      if (num < 1) return false;
	      long t = num / 2;
	      System.out.println(t);
	      while (t * t > num) {
	    	  System.out.println(t);
	        t = (t + num / t) / 2; //[8+16/8]/2
	      }
	      return t * t == num;
	 }

}
