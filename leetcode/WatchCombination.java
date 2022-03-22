package leetcode;

public class WatchCombination {

	public static void main(String[] args) {
		printAllPermutations("","1000",4);
		
	}
	
	
	
	static void printAllPermutations(String prefix, String in, int size) {
		if(prefix.length()==size) {
			System.out.println(prefix);
			
		}else {
			for(int i=0;i<in.length();i++)
			printAllPermutations(prefix+in.charAt(i), in.substring(0,i)+in.substring(i+1,in.length()), size);
		}
		
	}
	
}
