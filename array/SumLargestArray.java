package array;


public class SumLargestArray {

	
	public static void main(String[] args) {
		int[] j= {1,-2,3,1,7,4,9,-5,-1,1};
		
		char h[]= "abc".toCharArray();
	    char h2[]= new char[h.length];
	    for(int i=0;i<h.length;i++){
	      System.out.println(h[i]);
	      int f2=(int)'a'-h[i];
	      System.out.println(f2);
	      char f3= (char)('a'+f2+1);
	      System.out.println(f3);
	      h2[i]=f3;
	    }
		
		
		SumLargestArray s= new SumLargestArray();
		
		//s.largestSum(j);
		
	}
	
	void largestSum(int[] h){
		int max=0; int sum=0;
		for(int i=0;i<h.length;i++){
			sum=sum+h[i];
			if(sum>max){
				max=sum;
				System.out.println(h[i]);
				
			}else{
				System.out.println("start"+h[i+1]);
				sum=0;
			}			
		}		
	}
	
}
