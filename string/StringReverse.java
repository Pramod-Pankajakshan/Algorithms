package string;

public class StringReverse {
	
	public static void main(String[] args) {
		char h='A';
		int g=53;
		System.out.println("--="+checkVersion("2.31.1","2.31.1.1"));
		final double pai=3.14;final double pai1=3.114;
		 float fval = 10.0f;
		  System.out.println( pai - pai1);
		  
		  System.out.println("pai Number : " + pai);
		System.out.println(convertToTitle(g));
		System.out.println(titleToNumber(convertToTitle(g)));
	   //	System.out.println(new Integer(h));
		//reverseWords(h);
		//System.out.println(inPlacePlaindrome(h));
	}

	public static boolean inPlacePlaindrome(String in){
		char[] p=in.toCharArray();
		for(int i=0;i<p.length/2;i++){			
			if(p[i]!=p[p.length-1-i]){
				return false;
			}	
		}	return true;
	}
	
	
	static void reverseWords(String str) {
		String[] g= str.split(" ");
		StringBuilder sb= new StringBuilder();
		for(int i=g.length-1;i>=0;i--) {
			sb.append(g[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString());
		
	}
    
	 static void dnaSequence(String st) {
		 
		// st.
		
		 
		 
	 }
	 
	 
	
 
	 public static String convertToTitle(int n) {
	        StringBuilder result = new StringBuilder();

	        while(n>0){
	            n--;
	            result.insert(0, (char)('A' + n % 26));
	            n /= 26;
	        }

	        return result.toString();
	    }
	 
	 
	 public  static int titleToNumber(String s) {
		    int result = 0;
		    for(int i = 0 ; i < s.length(); i++) {
		      result = result * 26 + (s.charAt(i) - 'A' + 1);
		      System.out.println("--"+result);
		    }
		    return result;
		  }
	 
	 
	 public static int checkVersion(String a, String b) {
		 char ar[]=a.toCharArray();
		 char br[]=b.toCharArray();
	     int i=0; 
		 while(true) {
			if(i>=ar.length&&i>=br.length) {
	    		   return 0;
	    	   }
	    	   if(i>=ar.length||i>=br.length) {
	    		   if(i>=br.length) {
	    			   return 1;
	    		   }else {
	    			 return  -1;
	    		   }
	    	   }
	    	  if(check(ar[i], br[i])>0) {
	    		  return 1;
	    	  }
	    	  if(check(ar[i], br[i])<0) {
	    		  return -1;
	    	  }
	    	 
	    	  i++;
	      }

	 }
	 
	 
	 
	 private static int check(int a, int b) {
		 
		 if(a>b)return 1;
		 if(a<b)return -1;
		 
		 return 0;
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
