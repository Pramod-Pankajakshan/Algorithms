package array;


public class IsIntegerPalindrome {

public static void main(String[] args) {

	IsIntegerPalindrome gp= new IsIntegerPalindrome();
	System.out.println(gp.isPal("aabaa"));
	//boolean b=gp.isPalindrome(23332);
	//System.out.println(b);
	
}

public boolean isPalindrome(int x) {
    if (x<0 || (x!=0 && x%10==0)) return false;
    int rev = 0;
    while (x>rev){// x>rev - reverse and check half of it
    	rev = rev*10 + x%10;
    	x = x/10;
    }
    System.out.println(rev);
    return (x==rev || x==rev/10);
}
	

private boolean isPal(String s) {
	char r[]= s.toCharArray();
	for(int i=0;i<=(s.length()-1)/2;i++) {
		if(r[i]==r[s.length()-1-i]) {
			System.out.println("i is "+r[i]);
			System.out.println("s-i is "+r[s.length()-1-i]);
			continue;
		}else {
			return false;
		}
	}
	
	return true;
	
}



}
