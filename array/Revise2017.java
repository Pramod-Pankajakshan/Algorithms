package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Revise2017 {

static	void reverse(int[] j) {
		for(int i=0;i<(j.length)/2;i=i+1) {
				swap(j,i, j.length-1-i);
     	}
		System.out.println(Arrays.toString(j));
		}
			

static void arrangeMaxMin(int ar[]) {
	int res[]=new int[ar.length];
	int c1=0; int c2=0;
	for(int i=0;i<ar.length;i++) { //1234  - 4132
		if(i%2==0) {
			res[i]=ar[ar.length-1-c1];
			c1++;
		}else {
			res[i]=ar[c2];
			c2++;
		}
	}
	
	System.out.println(Arrays.toString(res));
}



static void arrangeNegativesToLast(int h[]) {
	// create new array
	int g[]= new int[h.length];
	int gc=0;
	for(int i=0;i<h.length;i++) {		
		if(h[i]>=0) {
			g[gc]=h[i];
		 gc++;
		}		
	}
	
	for(int i=0;i<h.length;i++) {
		if(h[i]<0) {
			g[gc]=h[i];
		 gc++;
		}		
	}
	System.out.println(Arrays.toString(g));
}


static int findNextPosAtEnd(int h[], int st,int cu) {
	int sts=-1;
	if(st==-1) {
		 sts=h.length-1;
	}else {
		sts=st;
	}
	for(int i=sts;i>cu;i--) {	
		if(h[i]>0) {
			return i;
		}
	}
	return -1;
}

static void arrangeNegativesToLast2(int h[]) {
	// 1 2 -3 4 5 6 7
	int posn=-1;
		for(int i=0;i<h.length;i++) {		
		 if(h[i]<0) {
			int sw=findNextPosAtEnd(h,posn,i);
			if(sw>0) {
				swap(h,i,sw);
			  posn=sw;
			}else {
				System.out.println(Arrays.toString(h));
			}
		 }		
	}

	
}
	
	
 static	void wave(int[] j) {
	Arrays.sort(j);
	for(int i=0;i<(j.length)-1;i=i+1) {
		if(i%2==0) {
			swap(j,i, i+1);
		}
	}
		System.out.println(Arrays.toString(j));
	}
	
 static	void swap(int []j, int i, int k) {
	 System.out.println(i+"---"+k);
		int temp=j[i];
		j[i]=j[k];
		j[k]=temp;
	}
	
 
	/**
	 *  Input:  arr[] = {12, 11, 10, 5, 6, 2, 30}
		Output: 5, 6, 30
		
		Input:  arr[] = {1, 2, 3, 4}
		Output: 1, 2, 3 OR 1, 2, 4 OR 2, 3, 4
		
		Input:  arr[] = {4, 3, 2, 1}
		Output: No such triplet
	 */
	public static void sortedSubSequenceOf3(int h[]) {
		int pre[] =new int[h.length];
		int nex[] =new int[h.length];
	    
		int minpos=0;int max=h.length-1;
		
	     
		for(int i=0;i<h.length;i++) {
			if(h[i]<=h[minpos]) {
   			minpos=i;
			}else {
				pre[i]=h[minpos];
			}
		}
		for(int i=h.length-1;i>0;i--) {
			if(h[i]>=h[max]) {
					max=i;
				}else {
					nex[i]=h[max];
				}
		}
		
		for(int i=0;i<h.length;i++) {
			if(pre[i]!=0&&nex[i]!=0) {
				System.out.println(pre[i]);
				System.out.println(h[i]);
				System.out.println(nex[i]);
				
				System.out.println("----");
			}
		}
		
	
	}
		
	static void usePriorityQ(int arr[], int k) {
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(arr.length-1,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1>=o2?(o1>o2?1:0):-1;
			}
		});
		
		for(int i=0;i<arr.length-1;i++) {
			pq.add(arr[i]);
		}
		
		while(k>1) {
			pq.poll();
            k--;		
		}
		System.out.println(pq.peek());
		
	}
 
 
	
	public static void main(String[] args) {
		int []h= {12, 11, 10, 5, 6, 2, 30};
		usePriorityQ(h,3);
		checkIfPaliendrome("qqqqw");
	}

	
	private static void checkIfPaliendrome(String in){

		char[] cIn=in.toCharArray();

		for(int i=0;i<cIn.length/2;i++){

		if(cIn[i]!=cIn[cIn.length-1-i]){
		System.out.println("not ok");
		}


		}
		}

		
	public void testTestey() {
		
		
		LinkedList<String> llist= new LinkedList<String>();
		llist.iterator();
		ArrayList<String> alist= new ArrayList<String>();
		
		
				
	}
}
