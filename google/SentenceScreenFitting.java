package google;

public class SentenceScreenFitting {
	
	public static void main(String[] args) {
		String [] l= {"asa","bcd","e"};
		//fit(3,6,l);
		String [] l2= {"a","bcd","apple","pie"};
		//fit(4,5,l2);
		String [] l3= {"hello","world"};
		//fit(2,8,l3);
		wordsTyping(l,5,6);
	}
	
	
	 public static int wordsTyping(String[] sentence, int rows, int cols) {
	        String s = String.join(" ", sentence) + " ";
	        int pos = 0, l = s.length();
	        for (int i = 0; i < rows; i++) {
	            pos += cols;
	            if (s.charAt(pos % l) == ' ') {
	                pos++;
	            } else {
	            	System.out.println("> "+s.charAt((pos-1) % l));
	            	System.out.println("-> "+pos);
	            	
	                while (pos > 0 && s.charAt((pos-1) % l) != ' ') {
	                    pos--;
	                }
	                
	                System.out.println("--> "+pos);    
	            }
	        }
	        
	        return pos / s.length();
	    }
	
	
	//Input:
	//rows = 3, cols = 6, sentence = ["a", "bcd", "e"]
	private static void fit(int r, int c, String[] in) {
	  int fl=0; int rc=1; int bal=0; int total=0;boolean done=false; int fp=0;
	  for(int i=0;i<in.length;i++) {
			fl=fl+in[i].length();
			fl++;			
	     	}
	  total=fl;
	  fl=0;
	  while(!done) {
     	for(int i=0;i<in.length;i++) {
			fl=fl+in[i].length();
			fl++;
			if(fl>c) {
				rc++;
				fl=0;
				i=i-1;
				if(rc==r&&c-fl<total) {
				  done=true;
				  rc--;	break;
				}
			}	
	     	}
     	
     	fp++;
		
		}
	  System.out.println(fp);
	}
	

}
