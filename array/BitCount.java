package array;

import java.util.Arrays;

public class BitCount {
	
	public static void main(String[] args) {
	// System.out.println(Integer.toBinaryString(4));
	 int h=8;
	 System.out.println(99<<1);
	 countBits(5);
	}
	
	public static  int[] countBits(int num) {
	    int[] f = new int[num + 1];
	    for (int i=1; i<=num; i++) {
	    	System.out.println("i is"+i);
	    	System.out.println(i>>1);
	    System.out.println(i&1);
	    	f[i] = f[i >> 1] + (i & 1);
	    	}
	    
	    System.out.println(Arrays.toString(f));
	    return f;
	}
	
	void getBits(int h) {
		
		new Integer(h).byteValue();
		
	}

}
