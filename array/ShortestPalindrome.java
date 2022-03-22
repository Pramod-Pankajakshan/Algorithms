package array;

public class ShortestPalindrome {
   
   public static void main(String[] args) {
	   String in="aacecaaa";
	   String p=sp(in);
	   System.out.println(in.replaceAll(p, "")+in);
   }
   public static String sp(String in) {
	   boolean rec=false;
	   if(in.length()<=1)return "";
	   char []f=in.toCharArray();	   
	  for(int i=0;i<f.length/2;i++) {		  
		  if(f[i]!=f[f.length-1-i]) {
			 rec=true;
			 break;
		  }		  
	  }
	     if(rec)
	     in =sp(in.substring(0,in.length()-1));	
	   return in;
   }

}
