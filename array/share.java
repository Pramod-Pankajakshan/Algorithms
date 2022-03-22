package array;
//share market best deal
public class share {
	
	static int g[]={15,16,7,19,11,33};
public static void main(String[] args) {
	share f= new share();
	System.out.println(f.maxProfit(g));
}
/**
 * first set the 
 * @param prices
 * @return
 */
public int maxProfit(int[] prices) {
  
	int profit=0;
	int minvalue=Integer.MAX_VALUE;
	
	for(int i=0;i<prices.length;i++){
		
		if( (prices[i]-minvalue)>profit )
			profit=prices[i]-minvalue;
		if(prices[i]<minvalue)
		minvalue=prices[i];
	}
	
	
	return profit;
}
}
//System.out.println("start");
//System.out.println("max of"+profit+"and"+(prices[i]-minElement));
//profit = Math.max(profit, prices[i]-minElement);
//System.out.println("is [profit]]"+profit);       
//System.out.println("minimum of "+minElement+"  &  "+prices[i]);
//minElement = Math.min(minElement, prices[i]);
//System.out.println("is [mine]"+minElement);
//System.out.println("end");