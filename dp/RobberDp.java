package dynamic;

public class RobberDp {

	// check home robbery class
	public static void main(String[] args) {
		
		int h[]= {1,2,3,43,5,6,55,44,2,11,78,45,66};
		// h[]= {};
		System.out.println(rob(h,h.length));
		System.out.println(findMaxSum(h,h.length));
	}
	
	static int rob(int num[], int n) {
	    int a = 0;
	    int b = 0;
	    
	    for (int i=0; i<n; i++)
	    {
	        if (i%2==0)
	        {
	            a = Math.max(a+num[i], b);
	        }
	        else
	        {
	            b =Math.max(a, b+num[i]);
	        }
	    }
	    
	    return Math.max(a, b);
	}
	
	static int findMaxSum(int arr[], int n)
	{
	  int incl = arr[0];
	  int excl = 0;
	  int excl_new;
	  int i;
	 
	  for (i = 1; i < n; i++)//i=1;
	  { 
	     excl_new = (incl > excl)? incl: excl; 
	     //excl_new is biggest of incl and excl
	     incl = excl + arr[i];//incl is excl plus arri[i]
	     excl = excl_new;//excl=excl new
	  }	 
	   return ((incl > excl)? incl : excl);
	}
	
}
