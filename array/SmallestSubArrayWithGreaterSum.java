package array;

public class SmallestSubArrayWithGreaterSum {

	static int k=51;

	public static void main(String[] args) {
		int arr1[] = {1, 4, 45, 6, 10, 19};
		System.out.println(findSmallestArray(arr1));
     }

	static int findSmallestArray(int arr[])	{
	   int min=Integer.MAX_VALUE;
		int st=0; 
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			
			if(sum>k){
				
				while(st<=i&&sum>k){			
					sum=sum-arr[st];
					if(sum>k)
					st=st+1;				
				}				
				if(min>(i-st+1)){
					min=i-st+1;				
				}
				st=st+1;//increase starting point after processing
			}
			
		}		
		return min;
	}
}
