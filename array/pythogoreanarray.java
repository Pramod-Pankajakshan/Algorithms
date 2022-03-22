package array;
//2sq+3sq+=5sq
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class pythogoreanarray {
	static int g[]={5,1,4,2,3};
	public static void main(String[] args) {
		
		pythogoreanarray p= new pythogoreanarray();
		ArrayList<Integer> h=	p.getSquare(g);	
		for(int hk:h){
			
			for(int g:h){
				if(h.contains(hk-g)){
					System.out.println(hk+"-"+g+"-"+(g-hk)+"-");
				}
			}
			
		}
	}

	
	public ArrayList<Integer> getSquare(int h[]){
		ArrayList<Integer> g= new ArrayList<Integer>();
		//HashMap<Integer, Integer> gh= new HashMap<Integer, Integer>();
		for(int j=0;j<h.length;j++){
		 g.add(h[j]*h[j]);
		}		
		return g;
		}
	}
