package dynamic;

public class coins {

	
	public static void main(String[] args) {
		int []g={2,4};
		
		System.out.println(",,,,,,,"+mincoins(g,5));
	}
static int mincoins(int []inputcoins,int val){
	int finalansarr[] = new int[val+1];
	
	 for (int g=1; g<=val; g++)
	        finalansarr[g] = Integer.MAX_VALUE;
	 prit(finalansarr);
	
	  for (int valuecounter=1; valuecounter<=val; valuecounter++)
	    {
		
	        for (int inpcntr=0; inpcntr<inputcoins.length; inpcntr++){
	        	int currentcoin=inputcoins[inpcntr];
	          if (currentcoin <= valuecounter)
	          {
	        	 
	        	  int subresult = finalansarr[valuecounter-currentcoin];
	        	  System.out.println("to get "+valuecounter+" u need "+(subresult+1));
	              if (subresult != Integer.MAX_VALUE && subresult + 1 < finalansarr[valuecounter])
	                  finalansarr[valuecounter] = subresult + 1;
	          }
	          
	         prit(finalansarr);
	          }
	    }

return finalansarr[val];

}

public static void prit(int[] h){
	 for (int g=0; g<h.length; g++){
		 System.out.print(h[g]);System.out.print(",");
	 }
}
}


