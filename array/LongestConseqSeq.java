package array;

class LongestConseqSeq{
	
	
	public static void main(String[] args) {
	
		LongestConseqSeq ls= new LongestConseqSeq();
		int s[]= {3,6,3,4,5,6,7,12,1,2,3,4,5,6,7,8,9};
			ls.check(s);
    }
	
	
	public void check(int[] arr) {
		int currentLen=1;
		int tempLen=0;
		int prev=arr[0];
		int curr=0;
		for(int i=1;i<arr.length;i++) {// 3 6 3 4 5 7
	     	 curr=arr[i];
		 	if(prev+1==curr) {
		 		tempLen++;
		 	}else {
		 		currentLen=tempLen>currentLen?tempLen:currentLen;
		 		tempLen=0;
		 		
		 	}
		 	 prev=curr;
		 	
		}
		currentLen=tempLen>currentLen?tempLen:currentLen;
		System.out.println(currentLen+1);
	}
}