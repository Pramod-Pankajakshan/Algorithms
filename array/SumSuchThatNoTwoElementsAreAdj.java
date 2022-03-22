package array;

// alternate robbery
public class SumSuchThatNoTwoElementsAreAdj {

	
	public static void main(String[] args) {
		int[] j= {6, 5, 10, 100, 10, 5};
		SumSuchThatNoTwoElementsAreAdj s= new SumSuchThatNoTwoElementsAreAdj();
		
		System.out.println(s.largestSum(j));
		
	}
	
	int largestSum(int[] h){
		int incl = h[0];
		  int excl=0;
		  int excl_new;
		
		 
		  for (int i = 1; i < h.length; i++)
		  {
		     /* current max excluding i */
		     excl_new = (incl > excl)? incl: excl;		  
		     incl = excl + h[i];		  
		     excl = excl_new;
		  }
		 
		   /* return max of incl and excl */
		   return ((incl > excl)? incl : excl);
		}
		
	
	
}
