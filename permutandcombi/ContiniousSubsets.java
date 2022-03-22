package permutandcombi;

import java.util.*;


public class ContiniousSubsets {

	public static void main(String args[]) {
		ContiniousSubsets cs= new ContiniousSubsets();
		cs.fn("abc".toCharArray());
	}

	private static void fn(char[] in) {
		String inn=new String(in);
		for(int i=0;i<in.length;i++) {
			for(int j=i;j<in.length;j++) {
				System.out.println(new String(inn.substring(i,j+1)));
				
			}
		}
		
		
	}
}

