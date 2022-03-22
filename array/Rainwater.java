package array;

import java.util.Stack;

public class Rainwater {
public static void main(String arg[]){

int []b= {4,2,1,2,3,4};
System.out.println(trap(b));
}

public static  int trap(int[] bukArr) {
    if (bukArr==null) return 0;
    Stack<Integer> s = new Stack<Integer>();
    int i = 0, maxWater = 0, maxBotWater = 0;
    while (i < bukArr.length){
    	  /**
    	   * 4 3 2 1 then 2 
    	   */
    	    System.out.println(s.isEmpty()?"":"peek of stack"+bukArr[s.peek()]);
    	    System.out.println("val in arr -"+bukArr[i]);
        if (s.isEmpty() || bukArr[i]<=bukArr[s.peek()]){
        	    System.out.println("push"+bukArr[i]+"at"+i);
            s.push(i);
            i=i+1;
        }
        else {
            int bot = s.pop();// this is the bottom // bot is 1
            System.out.println("pop "+bukArr[bot]+"@ "+bot);
            maxBotWater = s.isEmpty()? // empty means no il
            0:(Math.min(bukArr[s.peek()],bukArr[i])// 2 or 2 // take min of bith borders and subtract to get height then * by
            		//distance
            		
            		-bukArr[bot])*(i-s.peek()-1);// minus 1 * i-s.peek-1
            // get min of the borders and * 
            //it with distance
            System.out.println(maxBotWater);
            maxWater += maxBotWater;
        }
    }
    return maxWater;
}
}



