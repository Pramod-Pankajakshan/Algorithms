package array;

public class PerfectSquare {
	
	public static void main(String[] args) {

		int num=81;
		long x=num;
		
		while(x*x>num) {
			x=(x+num/x)/2;
		}
		
		System.out.println(x*x==num);
	}

}
