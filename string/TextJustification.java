package string;

import java.util.*;


public class TextJustification {

	public static void main(String args[]) {
		TextJustification tj= new TextJustification();
	 String arr[]=new String[] {"This", "is", "an", "example", "of", "text", "justification."}; int maxWidth = 16;
		tj.fullJustify(arr,maxWidth);

	}

	
	    public List<String> fullJustify(String[] words, int maxWidth) {
	         List<String> ls = new ArrayList<String>();
	        // take each word split as 16
	        StringBuilder sb= new StringBuilder();
	        int c=0;
	        for(String w:words){
	            if(c+w.length()>16){
	            	 System.out.println(sb.toString());
	                ls.add(sb.toString());
	                c=0; sb= new StringBuilder();
	            }
	            c+=w.length()+1;            
	            sb.append(w+" ");            
	        }
	        ls.add(sb.toString());
	        System.out.println(sb.toString());
	        return ls;
	    
	}
}

