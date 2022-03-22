package matrix;

import java.util.*;


public class Template1 {

	public static void main(String args[]) {
		 String f=""; char [] s=new char[]{'l','e','e','t'};
		 for(int i=0;i<s.length;i++) {	
			 min=1000;
			 tempResult="";
			 StringBuilder sb=new StringBuilder();
			 System.out.println(st+""+st2);			
             recur(ch,s,i,st,st2,0,sb, new HashSet<>());
            f=f+tempResult+"!";
            System.out.println("----------------------------------------------"+tempResult);
		 }
		 System.out.println(f);
	}
 static	char[][] ch= new char[][]{
        {'a','b','c','d','e'}, 
        {'f','g','h','i','j'}, 
        { 'k','l','m','n','o'}, 
        { 'p','q','r','s','t'}, 
        {'u','v','w','x','y'}
  };

static  int min=1000;
static String tempResult;
static int st=0, st2=0;
  static void recur(char[][] ch, char[] in, int pos, int x, int y, int counter, StringBuilder sb,Set<String> vis) {
		// Step 1 - only 1 check
		if(x<0||y<0||y>ch[0].length-1||x>ch.length-1||vis.contains(""+x+"-"+y)) return ; 		
        // 
		if(ch[x][y]==in[pos]&&sb.length()<=min) {
			min=sb.length(); tempResult=sb.toString(); st=x; st2=y;
			return;
	       }
		     vis.add(""+x+"-"+y); // add at start to hashset
			 recur(ch,in,pos,x+1,y,counter+1,sb.append("D"),vis);
			 sb.deleteCharAt(sb.length()-1);// delete builder's last
			
			 recur(ch,in,pos,x,y+1,counter+1,sb.append("R"),vis);
			 sb.deleteCharAt(sb.length()-1);// delete builder's last
			 
			 recur(ch,in,pos,x-1,y,counter+1,sb.append("U"),vis);
			 sb.deleteCharAt(sb.length()-1);// delete builder's last
			 
			 recur(ch,in,pos,x,y-1,counter+1,sb.append("L"),vis);			
			 sb.deleteCharAt(sb.length()-1);// delete builder's last
			 vis.remove(""+x+"-"+y);// remove at end from hashset
  }
	
}

