package leetcode;

public class IsPerfectSquare {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(16));
	}
   // divide input by 2 and then square it
	// till square is > than num
	// update t as 4+8/4/2;
	
	static boolean isPerfectSquare(int num) {
		if (num < 1)
			return false;
		
		long powof = num / 2;
		while (powof * powof > num) {
			powof = (powof + num / powof) / 2; // [8+16/8]/2
			System.out.println(powof);
		}
		return powof * powof == num;
	}

}
