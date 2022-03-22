package string;

public class StringreverseRecursion {

	public static void main(String[] args) {
		
		char[] d={'f','a','a','r','t'};
		rev(d,1);
	}
	
	public static void rev(char[] s,int c){
		if(c!=s.length){
			rev(s,c+1);
		}
		System.out.println(s[c-1]);
	}
	

}
