package array;

public class ReverseInteger {

	public static void main(String[] args) {
	System.out.println(reverse(103));
	}
	
	
	public static int reverse(int in)
	{
	    int result = 0;

	    while (in != 0){
	        int remainder = in % 10;
	        int newResult = result * 10 + remainder;
			        if ((newResult - remainder) / 10 != result){
			        	return 0;
			        	}
	        result = newResult;
	        in = in / 10;
	    }

	    return result;
	}
	
	
	static void isPalidrome(String in) {
		char[] ch=in.toCharArray();
		int l=ch.length;
		for(int i=0;i<in.length()/2;i++) {
		 	if(ch[i]!=ch[l-1-i]) {
		 		System.out.println("nono");
		 	return;
		 	}
		 	System.out.println("ok");
		}
	}
	
}
