package leetcode;

public class ExcelNumber {
	
	public static void main(String[] args) {
		int h=5201;
		toNumber(convertToTitle(h));
	}

	
	
	
	public static String convertToTitle(int in) {
	  StringBuilder result = new StringBuilder();
       while(in>0){
            in--;
            result.insert(0, (char)('A' + in % 26));
            in /= 26;
        }
        System.out.println("--> "+result.toString());
        return result.toString();
	 }
	
	// BB 54
	private static int toNumber(String s) {
		
		for (int i = 0; i < s.length();  i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
		}
		int result = 0;
		for (int i = 0; i < s.length();  i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
		}
		System.out.println(result);
		return result;
	}
}

