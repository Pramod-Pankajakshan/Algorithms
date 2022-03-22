package array;

public class XOR {
    //swapping two numbers
	public static void main(String[] args) {
		int a=2;
		int b=10;
		XOR x= new XOR();
		x.xor(a,b);
	}
	
	void xor(int a,int b){
		System.out.println(a+"-"+b); 
       a=a^b;
       b=a^b;
       a=a^b;
		System.out.println(a+"-"+b);
	}
	
	
}
