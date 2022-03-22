package array;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Revise2017CTCI {
	
	public static void main(String[] args) {
		System.out.println(permutation("absdeawaa","abcdeawaa"));
		System.out.println(encode("aaabbbcccbbees"));
		int []h= {1,2,3,4,5};
		printSumOfGivenInt(h,9);
	}
	
	
	
	
	static void printSumOfGivenInt(int[] in, int sum) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<in.length;i++) {
          if(hm.get(sum-in[i])!=null) {
        	  
        	  System.out.println(in[i]+" and "+(sum-in[i]) );
        	  
          }else {
        	   hm.put(in[i], 1);
          }
			
		}
	
	}
	
	
	
	
	
	
	static boolean permutation(String a, String b) {
		int[] in=new int[128];// ITS AN INT ARRAY
		int[] in1=new int[128];
		// check length
		if(a.length()!=b.length())return false;
		char[] ac=a.toCharArray();
		char[] bc=b.toCharArray();
		for(int i=0;i<ac.length;i++) {
			in[ac[i]]=in[ac[i]]+1;
		} 
		for(int i=0;i<bc.length;i++) {
			in1[bc[i]]=in1[bc[i]]+1;
		} 
		for(int i=0;i<in.length;i++) {
		
			if(in[i]!=in1[i]) return false;
			
		} 
		
	return true;
	}
	
	//aaabbbcccc a3b3b3
	
	static String encode(String a) {
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
		char[] ca=a.toCharArray();
		for(int i=0;i<ca.length;i++) {
			
			if(hm.get(ca[i])!=null) {
				int h=hm.get(ca[i]);
				h=h+1;
				hm.put(ca[i], h);
			}else {
				hm.put(ca[i], 1);
			}	
			
		}
		StringBuilder sb= new StringBuilder();
		for(char c:hm.keySet()) {
			sb.append(new String(""+c)+hm.get(c));// new String
		}
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
   static 	boolean allUnique(String a) {
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		char[] cr= new char[256];
		char[] ca=a.toCharArray();
		for(int i=0;i<ca.length;i++) {
		 if(cr[ca[i]]==1) {
				return false;
			}			
			cr[ca[i]]=1;
		}
		
		return true;
	}

}
