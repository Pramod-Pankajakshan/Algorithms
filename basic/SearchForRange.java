package leetcode;

/**
 * 
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].


 * @author pramod
 *
 */

public class SearchForRange {


public static void main(String[] args) {
	int h[]= {5,7,7,8,8,10};
	System.out.println(System.currentTimeMillis());
	search(h,8);
}

static void search(int []in, int num) {
	
	int l=in.length;
	
	int le=0; int ri=l-1;
	
	while(le<ri) {
		
		int mid=(le+ri)/2;
		
		if(num>in[mid]) le=mid+1;
		if(num<in[mid]) ri=mid-1;
		
		if(num==in[mid]) {
			getRange(in,mid,num);
			break;
		}
	}



}

static void getRange(int [] in,int mid, int num) {
	int st=mid; int en=mid;
System.out.println("--"+mid);
	while(true) {
		if(in[st]!=num) break;
		st=st-1;
	}
	System.out.println(st+1);
	while(true) {
		if(in[en]!=num) break;
		en=en+1;
	}
	System.out.println(en-1);
	System.out.println(System.currentTimeMillis());
	
}

}
