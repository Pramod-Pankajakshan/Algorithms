package google;

import java.util.*;


public class RemoveComments {

	public static void main(String args[]) {
		RemoveComments rc= new RemoveComments();
		rc.fn(null);
	}

	private static void fn(String[] input) {
		input= new String[]{"aa/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
		boolean block=false;
		List<String> lst= new ArrayList<String>();
	   for(int i=0;i<input.length;i++) {
		   
		   if(input[i].matches(".*\\/\\*.* \\*\\/")) {
	  			continue;
	  		 }
        
          if(input[i].matches(".*\\/\\*.*")) {
        	   System.out.println("----"+input[i]);
  			continue;
  		   }
          
          if(input[i].matches("\\/\\*.*")) {
  			continue;
  		   }
          if(input[i].matches(".*\\/\\/ .*")) {
    			continue;
    		   }
		   if(input[i].matches("//*")) {
			   block=true;
			   continue;
		   }
		   if(input[i].matches("\\*/")) {
			   block=false;
			   continue;
		   }
		   if(!block) {
		   lst.add(input[i]);
		   System.out.println(input[i]);
		   }
	   }
	   System.out.println(lst.toArray(new String[lst.size()]));
		
	
	
	}
}

