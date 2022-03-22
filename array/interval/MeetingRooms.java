package array.interval;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {
	
	public static class Interval{
		int start;
		int end;
	}
public static void main(String arg[]){

Interval m=  new Interval();
m.start=2;m.end=15;
System.out.println(2+"-"+15);
Interval m1= new Interval();
m1.start=36;m1.end=45;
System.out.println(36+"-"+45);
Interval m2= new Interval();
m2.start=9;m2.end=29;
System.out.println(9+"-"+29);
Interval m3= new Interval();
m3.start=16;m3.end=23;
System.out.println(16+"-"+23);
Interval m4= new Interval();
m4.start=4;m4.end=9;	
System.out.println(4+"- "+9);
Interval mw[]= {m,m1,m2,m3,m4};

int h=minMeetingRooms1(mw);
int h2=minMeetingRooms(mw);
System.out.println(h);System.out.println(h2);
}


//test rapid
//how many rooms needed
//[[0, 30],[5, 10],[15, 20]],
public static int  minMeetingRooms1(Interval[] m){
	Arrays.sort(m, (o1,o2)-> o1.start-o2.start);
//	Arrays.sort(m, new Comparator<Interval>() {
//		public int compare(Interval o1, Interval o2){
//			return o1.start-o2.start;
//		}
//	});
	int c=0; int minEnd=m[0].end;
	for(int i=0;i<m.length;i++) {
		if(m[i].start<minEnd) {
			c++;
			 if(minEnd>m[i].end){
				 minEnd=m[i].end;
			 }
		}else {
			 minEnd=Math.max(m[i].end, minEnd);
		}
	}
	
	return c;
}


// [[0, 30],[5, 10],[15, 20]],
public static int  minMeetingRooms(Interval[] m){
	
Arrays.sort(m,new Comparator<Interval>() {	
	public int compare(Interval o1, Interval o2) {		
		return o1.start>o2.start?1:-1;
	}
});

int c=0;
int minend=m[0].end;
for(int i=0;i<m.length;i++) {
	Interval curr=m[i];
	if(curr.start<minend) {
		
		if(curr.end<minend) {// or get the min since we can start a  meeting after it ends
		minend=curr.end;			
	   }
		c++;
    }else {
    	minend=curr.end>minend?curr.end:minend;
    }
 
}
return c;

}



}



