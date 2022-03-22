package array;

import java.util.Arrays;

public class StringSum {

	public static void main(String[] args) {
		addStrings("0","0");
	}
	
	  public static String addStrings(String num1, String num2) {
	        char n1[]= num1.toCharArray();
	        char n2[]= num2.toCharArray();
	        
	        int pos=0;
	        int car=0;
	        int d[]= new int[n1.length];
	        while(pos<n1.length){
	            int n11=48-n1[pos];
	            int n21=48-n2[pos];
	            int t=n21+n11+car;
	            if (t>9){
	              car=1;  
	                d[n1.length-1-pos]=t%10;
	            } else{
	            d[n1.length-1-pos]=t;    
	            }
	            pos++;
	            
	        }
	        System.out.println(Arrays.toString(d));
	        return Arrays.toString(d);
	    }

}
