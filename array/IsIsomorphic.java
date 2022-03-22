package array;

public class IsIsomorphic {

public static void main(String[] args) {
	System.out.println(isIsomorphic("abc","ddf"));
	System.out.println(isIsomorphic1("paper","title"));
}
	
		public	 static   boolean isIsomorphic1(String s, String t) {
			       char []sc=s.toCharArray();
			       char []tc=t.toCharArray();
		        int m1[] = new int[256];
		        int m2[] = new int[256];
		        int  n = s.length();
		        for (int i = 0; i < n; i++) {
		        	    char asc=sc[i];
		        	    char atc=tc[i];
		        if (m1[asc] != m2[atc]) return false;// check for each loop
		            m1[asc] = i + 1;
		            m2[atc] = i + 1;
		          
		        }
		        return true;
		    }
		
		public static boolean isIsomorphic(String s1, String s2) {
	        int[] m = new int[512];
	        for (int i = 0; i < s1.length(); i++) {
	            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
	            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
	        }
	        return true;
	    }
		

}
