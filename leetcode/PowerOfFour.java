package leetcode;

public class PowerOfFour {
	
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16)); 
	}
	
	
	static boolean isPowerOfFour(int num) {
	    return num > 0 && (num & (num - 1)) == 0 && (num - 1) % 3 == 0;
	}
	

}
