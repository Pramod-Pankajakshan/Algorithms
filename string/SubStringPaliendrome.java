package string;

import java.util.HashMap;

public class SubStringPaliendrome {

	public static void main(String[] args) {
		SubStringPaliendrome g= new SubStringPaliendrome();
		//char[] j= {'a','b','c','b','b','c',};
		String j="aaa";
		
		System.out.println(g.check(j));
	}




// no magic here - 2 for loops to make substrings
// and then the standard way to check for paliendrome
private int check(String s){
    int c=0;
    for(int i=0;i<s.length();i++){
        for(int j=i;j<=s.length();j++){
         String ss= s.substring(i,j);// include 
            System.out.println("--"+ss);
           if(ss.length()!=0&&isPal(ss)){
               System.out.println(ss);
               c++;
               }         
            }
         }
    return c;
     }
              
              

private boolean isPal(String h){
    char[] g= h.toCharArray();
    for(int i=0;i<g.length/2;i++){
        if(g[i]!=g[g.length-1-i]) return false;
    }
    
return true;
}


void print(char[] n, int st, int en) {
	StringBuilder sb = new StringBuilder();
	for(int i=st;i<=en;i++) {
	sb.append(n[i]);
	}
	System.out.println(sb.toString());
}
}
