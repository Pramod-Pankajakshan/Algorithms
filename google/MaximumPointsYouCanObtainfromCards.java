package google;

import java.util.Arrays;

public class MaximumPointsYouCanObtainfromCards {

	public static void main(String args[]) { 
		int[] idn= {5,3,4,8,1}; 
		fn(idn,3);
		
		MaximumPointsYouCanObtainfromCards s= new MaximumPointsYouCanObtainfromCards();
		System.out.println("==="+s.maxScore(idn,3));
	}

	private static void fn(int[] in, int k) {	
	// take left k sum - 
	// take right k sum
	// now try combos
	int t1[]= new int[k+1];
	int t2[]= new int[k+1];
		for(int i=1;i<k+1;i++) {
			t1[i]=t1[i-1]+in[i-1];// 1= 0+in[0] 1
		}// [1,2,3,4,5,6,1], k = 3
		Arrays.stream(t1).forEach(student -> System.out.print(student+","));System.out.println("");
		for(int i=1;i<k+1;i++) {
			t2[i]=t2[i-1]+in[in.length-i];// 1=0+
		}
		int max=0;   // 12 3 4 5 0
		             // 0  2 3 4 13
		Arrays.stream(t2).forEach(student -> System.out.print(student+","));
		for(int i=0;i<k+1;i++) {
			System.out.println("--"+max+"}"+t2[i]+""+t1[k-i]);
			max=Math.max(max,t2[i]+t1[k-i]);
		}
		System.out.println("--"+max);
	}
	/**
	 * The default approach here is to perform this act
	 * @param cardPoints
	 * @param k
	 * @return
	 */
	 public int maxScore(int[] cardPoints, int k) {
	        int in[]=cardPoints;
	        this.k=k;
	        run(in,0,0,in.length-1,0);
	        return fsum;
	    }
	        int k;
		    int fsum;
		    // start from 2nd position
		    private void run(int[] in, int sum, int left, int right, int c){
		         //System.out.println(pos1);System.out.println(pos2);
		        if(left<0||right<0||right>in.length-1||left>in.length-1||c>k) return;
		        if(c==k){
		        	        
		                fsum=Math.max(sum,fsum);//int[] idn= {5,3,4,8,1}; 
		            return;
		        }       
		        run(in, sum+in[left],left+1,right,c+1);
		        run(in, sum+in[right],left,right-1,c+1);
		    } 
		    
		}
	//
	// recursive call
	// sum1 
	// add left to sum1 - sum when comp picks left
	// add right to sum2 - sum when comp pick right
	// if sum1 then 


	
	
	


