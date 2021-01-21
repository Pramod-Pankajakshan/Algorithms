package leetcode;

public class NumberNthDigit {


public static void main(String[] args) {
	System.out.println("-----"+findNthDigit(15));
}

public static int findNthDigit(int input) {
	int len = 1;
	long count = 9;
	int start = 1;

	while (input > len * count) { // 9 180 2700  
		System.out.println("checking for "+len * count);
		input -=  (len * count);
		len =len+ 1; // 1 2 3
		count =count * 10; //9 90 900 9000
		start = start * 10; // 1 10 100 1000
	}
	System.out.println(start);
	System.out.println(input);
	System.out.println((input-1)/len);
	start = start+(input - 1) / len;
	String s = Integer.toString(start);
    System.out.println(s);
	return Character.getNumericValue(s.charAt((input - 1) % len));
}

}