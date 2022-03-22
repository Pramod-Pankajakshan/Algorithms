package array;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class BiggestAverageSubArray {
public static void main(String[] args) {
	int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
	BiggestAverageSubArray b= new BiggestAverageSubArray();
	int bigavg=b.chkmax(arr);
    //System.out.println(bigavg);
}

int k=3;

int getAvg(Deque<Integer> l){
	int avg=0;
	Iterator<Integer> it=l.iterator();
	while(it.hasNext()){
		avg=it.next()+avg;		
	}	
return avg/k;
}
int getBiggest(Deque<Integer> l){
	int big=0;
	Iterator<Integer> it=l.iterator();
	while(it.hasNext()){
		int h=it.next();
		if(big<h) big=h;
	}	
return big;
}


 int chk(int j[]){
	 int avg=0; int st=0; int en=0; int cst=0;
	 Deque<Integer> q= new LinkedList<Integer>();
	 
	 for(int i=0;i<k;i++){
		q.add(j[i]);		
	 }en=k-1;
	 if(getAvg(q)>avg) avg=getAvg(q);
	 
	 for(int i=k;i<j.length;i++){
			
		    q.removeFirst();
			q.addLast(j[i]);
			st=st+1;
			if(getAvg(q)>avg){ cst=st;
				avg=getAvg(q);	en=i;		
			}
		 }
	 System.out.println(cst);System.out.println(en);
	 return avg;
 }

 int chkmax(int j[]){
	 int avg=0; int st=0; int en=0; int cst=0;
	 Deque<Integer> q= new LinkedList<Integer>();
	 
	 for(int i=0;i<k;i++){
		q.add(j[i]);		
	 }
	 if(getBiggest(q)>avg) avg=getBiggest(q);
	 System.out.println(avg);
	 for(int i=k;i<j.length;i++){
			
		    q.removeFirst();
			q.addLast(j[i]);
			st=st+1;				
				System.out.println(getBiggest(q));
			
		 }
	
	 return avg;
 }






















}
