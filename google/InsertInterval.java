package google;

import java.util.*;



public class InsertInterval {

	public class Interval{
		public Interval(int s, int e) {
			this.start=s;
			this.end=e;
		}
		int start;
		int end;
	}

	public static void main(String args[]) {
		//int [][]intervals = {{1,3},{6,9}}; int [] newInterval = {4,6};
		//int [][]intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}}; int [] newInterval = {4,8};	
		
		// the logic is loop till we identify the interval which has end value bigger than start of new interval
		// 3 less than 4
		// 
		List<Interval> intervals = new LinkedList<>();
		InsertInterval ii= new InsertInterval();
		Interval i = ii.new Interval(6,8); 
		
		Interval i1 = ii.new Interval(1,2);
		Interval i2 = ii.new Interval(3,5);
		Interval i3 = ii.new Interval(6,7);
		Interval i4 = ii.new Interval(8,10);
		Interval i5 = ii.new Interval(12,17);
		intervals.add(i1);intervals.add(i2);intervals.add(i3);intervals.add(i4);intervals.add(i5);
		ii.insert(intervals,i );
	}

	// expand ni or newinterval is the trick and do not increment i
	//Insert Interval int [][]intervals = {{1,3},{6,9}}; int [] newInterval = {4,6};
	public  List<Interval> insert(List<Interval> lst, Interval ni) {
        int i=0;
        // find merge spot
        while(i<lst.size() && lst.get(i).end<ni.start) i++; // 3,5 
        // keep merging
        while(i<lst.size() &&  (lst.get(i).start<=ni.end)){
            // min of start and max of end
            ni = this.new Interval(Math.min(lst.get(i).start, ni.start), Math.max(lst.get(i).end, ni.end));
            lst.remove(i);// get new nl 
            // remove get new interval - repeat - do not increment i
        }
        // finally add
       lst.add(i,ni); // insert into i position
       
        for(Interval it:lst) {
        	 System.out.println(it.start+","+it.end);
        }
        return lst;
}
	    
}

