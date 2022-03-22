package permutandcombi;

import java.util.List;

public class Permutationold {

	
	// n P n = n!  8 c 6 =28
	public static void main(String[] args) {
	//	printAAAPermutation("abc","");
		int h[]= new int[5];
		printPerm1("","+-*");
		//comb2BySize("","abcde",3);
		//comb2("","abcd");
	}
	/**
	 * all permutations
	 * @param prefix
	 * @param input
	 * @param size
	 */
	static void printPerm(String prefix,String input,int size){
		
	     if(input.length()==size){
	    	 System.out.println(prefix);
	     }else{
	    	 for(int i=0;i<input.length();i++){ 
	    		 printPerm(prefix+input.charAt(i), input.substring(0,i)+input.substring(i+1,input.length())
	    				  ,size);	 
	    	 }
	    	 
	     }		
	}
	
	
	/**TEST
	 * 
	 * d
da
dab
dabc
dac
	 * all permutations
	 * @param prefix
	 * @param in
	 * @param size
	 */
	static void printPerm1(String prefix,String in){
	     
	    	 System.out.println(prefix);
	   
	    	 for(int i=0;i<in.length();i++){ 
	    		 printPerm1(prefix+in.charAt(i),in.substring(0,i)+in.substring(i+1,in.length()));	 
	    	 }
	    	 
	     	
	}
	
	
	/**
	 * ALL COMBINATIONS - and also think og 000 001 010 
	 * @param prefix
	 * @param s
	 */	
	 private static void comb2(String prefix, String s) {
	        System.out.println(prefix);
	        for (int i = 0; i < s.length(); i++)
	            comb2(prefix + s.charAt(i), s.substring(i + 1));
	    }
	
	 
	 /**
		 * ALL COMBINATIONS OF A SIZE - and also think og 000 001 010  like abc abd abe- no cba
		 * @param prefix
		 * @param s
		 */	
		 private static void comb2BySize(String prefix, String s,int ss) {
			 if(prefix.length()==ss) {
				 System.out.println(prefix);
			 }
		       
		        for (int i = 0; i < s.length(); i++)
		        	comb2BySize(prefix + s.charAt(i), s.substring(i + 1),ss);
		    }
	
		 
		
	 public static void printcombo(String st){
	   char[] d= st.toCharArray();
		 int pow=pow2(st.length());
		 for(int i=0;i<=pow;i++){
				String bit= Integer.toBinaryString(i);
				char sc[]=bit.toCharArray();				
				StringBuilder s= new StringBuilder();
				int c=0;
				for(int j=sc.length-1;j>=0;j--){
					if(sc[j]=='1'){
						s.append(d[d.length-1-c]);
						} 
					c=c+1;
				}
			System.out.println(s.reverse().toString());
		 }
	 }
	 
	 public static int pow2(int i){
		 int o=1;
		 while(i>0){
			 o=o*2;
			 i=i-1;
			}
		 return o;
	 }
	 /**
	 * For arrays
	 * swap
	 * permute k+1
	 * swap
	 * @param list
	 * @param k
	 */
	  static void permute(java.util.List<? extends Object> list, int k){
	        for(int i = k; i < list.size(); i++){
	            java.util.Collections.swap(list, k, i);
	            permute(list, k+1);
	            java.util.Collections.swap(list, i, k);
	        }
	        if (k == list.size() -1){
	            System.out.println(java.util.Arrays.toString(list.toArray()));
	        }
	    }
	
	
	//include dupes
	private static void printAAAPermutation(String str, String stringToPrint){
		  if(stringToPrint.length()==str.length()){
		   System.out.println(stringToPrint);
		   return;
		  }else {
			  System.out.println(stringToPrint);
		  }
		  for (int i = 0; i < str.length(); i++) {
			  printAAAPermutation(str, stringToPrint + str.charAt(i));//str stays - strtoprint+str.charati
		  }
		 }
	
	
	static int countDecodingDP(char []digits, int n)
	{
	     // A table to store results of subproblems
	    int count[] = new int[n+1];
	    count[0] = 1;count[1] = 1;
	 
	    for (int i = 2; i <= n; i++) {
	        count[i] = 0;	 
	        // If the last digit is not 0, then last digit must add to
	        // the number of words
	        if (digits[i-1] > '0')
	            count[i] = count[i-1];
	 
	        // If second last digit is smaller than 2 and last digit is
	        // smaller than 7, then last two digits form a valid character
	        if (digits[i-2] < '2' || (digits[i-2] == '2' && digits[i-1] < '7') )
	            count[i] += count[i-2];
	    }
	    return count[n];
	}
	
}
