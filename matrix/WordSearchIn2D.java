	package matrix;

public class WordSearchIn2D {


public static void main(String[] args) {
	
	char[][] ch= new char[][]{
		  { 'a', 'r', 'c', 'd' },//--> x  | is y
		  { 'e', 'u', 'n', 'v' },
		  { 's', 'w', 'g', 'j' },
		};
		char[] k= {'a','r','u','n'};
		   boolean anser=false;
		    for (int y=0; y<ch.length; y++) {
		    	for (int x=0; x<ch[y].length; x++) {
		    		if (exist(ch,k, x, y, 0)) {
		    			
		    			anser=true;
		    		}
		    	}
		    }
		    System.out.println(anser);
}


static boolean exist(char[][] ch, char[] in, int x, int y, int counter) {
	boolean a,a1,a2,a3;
	if(counter>in.length-1) {
		return false;
	}
	
	if(x<0||y<0||x>ch[0].length-1||y>ch.length-1) return false; 
	
	
	if(ch[y][x]==in[counter]) {
		
		if(counter==in.length-1) {
			return true;
		}
		 a=exist(ch,in,x+1,y,counter+1);
		 a1=exist(ch,in,x,y+1,counter+1);
		 a2=exist(ch,in,x-1,y,counter+1);
		 a3=exist(ch,in,x,y-1,counter+1);
		
    }else {
    	  return false;
    }
	
	return a||a1||a2||a3;
 
}


}
