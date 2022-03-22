package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BldgGraph {
	
	static class Value{
		public Value(int start, int end, int range) {
			this.start=start;
			this.end=end;
			this.range=range;
		}
		int start;
		int end;
		int range;
	}
public static void main(String arg[]){
  List<Value> lst= new ArrayList<>();
 	//[ [2 9 10], [3 7 15], [5 12 12], [15 20 10], [19 24 8] ]
    //[ [2 10], [3 15], [7 12], [12 0], [15 10], [20 8], [24, 0] ]
	Value val= new Value(2,9,10);lst.add(val);
	Value val1= new Value(3,7,15);lst.add(val1);
	Value val2= new Value(5,12,12);lst.add(val2);
	Value val3= new Value(15,20,10);lst.add(val3);
	Value val4= new Value(19,24,8);lst.add(val4);
	BldgGraph bg= new BldgGraph();
	bg.run(lst);
}

public void  run(List<Value> lst){

	Map<Integer,Integer> hm= new HashMap<>();
	int min=Integer.MAX_VALUE;int max=Integer.MIN_VALUE;
	for(Value val:lst) {
		int i=val.start; 
		if(i<min)min=i;
		int j=val.end; 
		if(j>max)max=j;
		while(i<=val.end) {
		 int cval=hm.getOrDefault(i, 0);
		 if(cval<val.range)	
		 hm.put(i,val.range);
		i++;
		}
		
	}
	int temp=0;
	int prevH=0;
	int h=0;
	while(min<=max) {
         temp=prevH;		
		 h=hm.getOrDefault(min, 0);
		 if(temp>h) {			 
			 System.out.println(min-1+"-"+h);
		 }else if(temp<h) {
			 System.out.println(min+"-"+h);
		 }
		 if(max==min) {
				 System.out.println(max+"-"+0);
		 }
		 
		 prevH=h;		
	    min++;
	}
	
	
	
	
	
	
}
}



