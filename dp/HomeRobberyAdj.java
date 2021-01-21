package dynamic;

public class HomeRobberyAdj {

	// currentMax and porevmax 
	// temp =currmax
	//currmax=prevmax+x or currmax
	//prev=temp
	
	public static  int rob(int[] num) {
	    int prevMax = 0;
	    int currMax = 0;
	    for (int x : num) {
	        int temp = currMax;
	        currMax = Math.max(prevMax + x, currMax);// cux=pex,cux
	        prevMax = temp;
	    }
	    return currMax;
	}
	
	public static void main(String[] args) {
		
		int h[]= {1,2,3,43,5,6,55,44,2,11,78,45,66};
		int hh[]= {1,2,3,1,6};
		if there is just one then i pick 1
		[1]
		if there is 2 i pick 2 since 2>1
		[2]
		System.out.println(rob(hh));
	}
}
