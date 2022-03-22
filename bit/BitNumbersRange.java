package bit;

public class BitNumbersRange {
public static void main(String arg[]){


	System.out.println("ans"+rangeBitwiseAnd(15,7));
}

public static int rangeBitwiseAnd(int m, int n) {
	        int moveFactor = 1;
	        while(m != n){
	            m >>= 1;// divide by 2 both m an n till m==n
	            n >>= 1;
	            System.out.println("--"+moveFactor);
	            moveFactor <<= 1; // * movefactor by 2
	            System.out.println(moveFactor);
	        }
	        return m * moveFactor;// return m * movefactor
	    }

}

