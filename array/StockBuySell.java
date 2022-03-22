package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.SliderUI;

public class StockBuySell {
	
	
	public static void main(String[] args) {
		int d[]={100, 180, 50, 310, 40, 535, 695};
		stockBuySell(d);
	
	}
	
//first get the low
//then next biggest
//	print
	
 static void stockBuySell(int s[]){
		int n=s.length;
		int i=0;

		while(i<n-1){
			//get local minima - get the loswet 
			while(i<n-1&&s[i+1]<=s[i]){
				i=i+1;
			}
			System.out.println("buy at "+i);
			i=i+1; //increment once as we want 
			//to find the big one from next of buy
			if(i==n-1) break;
			
			while(i<n&&s[i]>=s[i-1]){
				i=i+1;
			}
			System.out.println("sell at "+(i-1));
		}
		
	}

}
