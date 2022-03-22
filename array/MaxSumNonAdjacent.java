package array;

public class MaxSumNonAdjacent {

	public static void main(String[] args) {
		int arr[] ={1,2,3,43,5,6,55,44,2,11,78,45,66};
		 System.out.println(findMaxSum(arr, arr.length));
	}
	
	
	
	
	//standard answer
	static int findMaxSum(int arr[], int n){
	 
	  int excl = 0;
	  int excl_new=0;
	
	  int incl = arr[0]; 
	  for (int i = 1; i < n; i++)//i=1;
	  { 
	     excl_new = (incl > excl)? incl: excl; 
	     //excl_new is biggest of incl and excl
	     incl = excl + arr[i];//incl is excl plus arri[i]
	     excl = excl_new;//excl=excl new
	  }	 
	   return ((incl > excl)? incl : excl);
	}
}
