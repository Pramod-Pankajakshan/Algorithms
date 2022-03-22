package array;
/**
 * 
 * @author pramod pankajakshan
 *
 */
public class DecodeWays {
	public static void main(String[] args) {
		String input="226111";
		DecodeWays decodeWays= new DecodeWays();
		decodeWays.numDecodings(input.toCharArray(), 0);
		System.out.println(numberOfWays);
	}

	static int numberOfWays = 0;
    /**
     * Decode ways - Check first character and then combine 1st and second.
     * Check if this is >9 and less than 27 [to handle 01 02 03 etc]
     * Recurse - You can derive dp logic from this using 2d array
     * @param input
     * @param position
     */
	public  void numDecodings(char[] input, int position) {
		if (position > (input.length - 1)) {
			numberOfWays++;
			return;
		}
		int val = Integer.valueOf(Character.toString(input[position]));
		if (isValid(val))
			numDecodings(input, position+1);
		if (position < (input.length - 1)) {
			int val2 = Integer.valueOf((input[position]+ "" + input[position + 1])  );
			if (isValid(val2) && val2 > 9)
				numDecodings(input, position+2);
		}
	}

	private  boolean isValid(int val) {
		if (val > 0 && val < 27)
			return true;
		return false;
	}

}
