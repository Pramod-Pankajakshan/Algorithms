package google;

import java.util.*;


public class Lc1055 {

	public static void main(String args[]) {

		fn("xyz","xzyzxz");

	}
     // simply compare target and source repeatedly but trget posiyion changes for every matc
	
	 public static int fn(String source, String target) {
	        int t = 0;
	        int ans = 0;
	        while (t < target.length()) {
	            int pt = t;
	            System.out.println("start from t and check source fully");
	            for (int s = 0; s < source.length(); s++) {
	                if (t < target.length() && source.charAt(s) == target.charAt(t)) {
	                	  System.out.println(source.charAt(s) +" is source= target-"+ target.charAt(t));
	                    t++;
	                }
	            }
	            System.out.println("t moved till -"+t);
	            if (t == pt) {
	                return -1;
	            }
	            ans++;
	        }
	        System.out.println("==>"+ans);
	        return ans;
	    }
}

