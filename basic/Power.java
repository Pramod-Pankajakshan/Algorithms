package leetcode;

public class Power {
 public static void main(String[] args) {
	System.out.println(pow(2,5 ));
}
	public static  double pow(double x, int n) {
		System.out.println("power of--"+x);System.out.println("n.."+n);
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        System.out.println(n/2);
        return (n%2 == 0) ? pow(x*x, n/2) : x*pow(x*x, n/2);
    }
	public static  double pow1(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? pow(x*x, n/2) : x*pow(x*x, n/2);
    }
	
}
