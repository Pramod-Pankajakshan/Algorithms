package array.group;

import java.util.*;

public class GroupNumberInArray {
	public static void main(String[] args) {
		char[] h="234".toCharArray();
		System.out.println( );
		
		diffWaysToCompute(h);
		
	}
	    public static void  diffWaysToCompute(char [] input) {
	    int siz=input.length;
	    	for(int i=0;i<8;i++) {
	    	String bit= Integer.toBinaryString(i);	 
	    	char sc[]=String.format("%3s", Integer.toBinaryString(i)).replaceAll(" ", "0").toCharArray();		
			StringBuilder s= new StringBuilder();
			StringBuilder os= new StringBuilder();
			for(int j=sc.length-1;j>=0;j--){
				if(sc[j]=='1'){
					s.append(input[siz-1-j]);
				 }else {
					 os.append(input[siz-1-j]);
				 }			
			}
			
			System.out.println("------");
			System.out.println(s);
		
			System.out.println(os);
			System.out.println("------");
	    	}   	
	    	
	    }   
	    
	}




