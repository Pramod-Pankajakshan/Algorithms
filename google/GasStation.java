package google;

public class GasStation {
	
	// n gas st
	// try to not complicate
	// add more variables as possible
	// speak it out and try to run the code
    public static void main(String[] args) {
    	
      	int gas[] = {1,2,3,4,5};
        int  cost[]= {3,4,5,1,2};
        int pos=0;
        int c=0;
        int cargas=0; int tc=0; // separate the counter
        //canCompleteCircuit(gas,cost);
    	 while(tc<cost.length) {
    		 cargas=cargas+gas[c];
    	    	if(cargas<cost[c]) {
    	    		// reset
    	    		pos=pos+1;
    	    		c=pos;
    	    		cargas=0;
    	    		tc=0;
    	    	}else {
    	    		cargas=cargas-cost[c];
    	    		c++;
    	    	}
   	    	if(c>cost.length-1) {
    	    			c=0;
    	    	}
   	    	tc++;   
    	 
    	 }
    	
    	 
    	 System.out.println(pos);
	}
    
    private static final int EMPTY = 0;
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        assert gas != null && cost != null && gas.length == cost.length;
        int start = 0;
        int tank = EMPTY; // cumulated from station at start
        int total = EMPTY; // extra fuel left at the end of a full circle
        for (int station = 0, count = gas.length; station < count; ++station) {
            int fuel = gas[station] - cost[station]; // re-fuel and drive to the next station
            tank += fuel;
            total += fuel;
            if (tank < EMPTY) { // Ran out of gas on this circle starting from start, so
                tank = EMPTY; // we're starting again
                start = station + 1; // from next station.
                // We already left this station when run out of gas.
                // Starting anywhere (>= 0) up to this station would be futile,
                // because we'll run out of gas somewhere before this station.
            }
        }
        return total < EMPTY?
            -1 // cannot complete the full circle, because we would run out of gas somewhere
            :
            start // something is left in the tank so the last starting point is valid
        ;
    }
   
   


}
