package ga;

//contiguous subsequence of a list S id a subsequence made up of conservative elemts of is
//op- contiguous subsequence of maximum sum 
//5,15,-30,10,-5,40,10 
public class Dpv61 {
	
	public static void main(String[] args) {
		int h[]= {5,15,-30,10,-5,40,10};
		csub(h);
	}
	
	public static void csub(int[] r) {
		int sm=0;
		int max=0;
		for(int i=0;i<r.length;i++) {
			 sm=Math.max(sm+r[i],r[i]);

			if(sm>max)max=sm;
		}
		
	System.out.println(max);	
		
	}

}
