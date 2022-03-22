package array;

import java.util.HashMap;
// given a number - find sum of 2 numbers in array which match that number
public class sumanddiffmatch {
	static	int sum=10;
	static	int diff=2;
	public static void main(String[] args) {
		int gg[]={1,4,6,2,9};
		diff(gg);
	}
	
	static public void sum(int g[]){
	HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		
	for(int i=0;i<g.length;i++){
		
		if(hm.containsKey(sum-g[i]) ){
			System.out.println(g[i]+"and"+ (sum-g[i]));
		}else{
			hm.put(g[i], 1);
		}
	}
	}
	static public void diff(int g[]){
		
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
			
		for(int i=0;i<g.length;i++){		
			int t=g[i]-diff;
			if(hm.containsKey(t) ){
				System.out.println(g[i]+"minus"+ (sum-g[i]));
			}else{
				hm.put(g[i], 1);
			}
		}
		
	
		
	
	}
	

	
	
	

}
