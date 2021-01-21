package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindowTemplate {
	

	
	public static void main(String[] args) {
		SlidingWindowTemplate swt = new SlidingWindowTemplate();
		int [] in= {2,6,5,3,7,4}; int s=11;	
		int [] in2= {2,4,5,6,4,7};
	//	System.out.println( java.util.Arrays.hashCode(in));
	//	System.out.println( java.util.Arrays.hashCode(in2));
		//swt.slidingWindowTemplate(in, s);	
		 int s1=3;	
		swt.slidingWindowMaximum(in,s1);
	}
	
	private void  slidingWindowTemplate(int[] in, int s) {
		// define window
		int left=0; int right =1;		
		// cases
		int sum=0;
		sum=in[left]+in[right];
		while(left<in.length) {				
			if(sum>s) {
				sum=sum-in[left];
				left++;				
			}else if(sum<s) {
				right++;
				if(right>in.length-1) right=in.length-1;	// error 1 - missed this check
				sum=sum+in[right];
			}else {
				System.out.println(left+"---"+right);
				sum=sum-in[left]; // error 2 
				left++; 
			}			
		}		
	}
	
	private void  slidingWindowMaximum(int[] in, int s) {
		// define window
		PriorityQueue<Integer> pq= new PriorityQueue<>(new Comparator<Integer>() {
			public int  compare(Integer a,Integer b) {
				return a>b?-1:1;
			}
		});
	
		int left=0; int right =s-1;
		for(int i=left;i<=right;i++) {
			pq.add(in[i]);
		}
		System.out.println(pq.peek());			
		while(left<in.length) {	
			right++;
			if(right>in.length-1) {return;}
			pq.add(in[right]);
			pq.remove(in[left]);
			System.out.println(pq.peek());
			left++;
			
		}		
	}

}
