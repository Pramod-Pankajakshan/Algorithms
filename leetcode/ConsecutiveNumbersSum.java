package leetcode;

import java.util.*;

/**
 * 829.
 * Given a positive integer N, how many ways can we write it as a sum of consecutive positive integers?

		Example 1:		
		Input: 5
		Output: 2
		Explanation: 5 = 5 = 2 + 3 
 * @author pramod
 *
 */
public class ConsecutiveNumbersSum {

	public static void main(String args[]) {

		fn(12);

	}
    /**
     * 
     * Maths 
     *  N= x,x+1,x+2 ....k times can be written as
     *  kx+k(k-1)/2 = N
     *  kx=N-k(k-1)/2
     *  so if x is an integer then we have an answer
     * 
     * @param input
     */
	private static void fn(int in) {
		int ans=0;
		for(int k=2;k<Math.sqrt(new Double(2*in));k++){
			if(( in-(k*(k-1))/2)%k==0)ans++;
		}
		System.out.println(ans);
	}
}
/**
 * The thought process goes like this- Given a number N, we can possibly write it as a sum of 2 numbers, 3 numbers, 4 numbers and so on. Let's assume the fist number in this series be x. Hence, we should have
x + (x+1) + (x+2)+...+ k terms = N
kx + k*(k-1)/2 = N implies
kx = N - k*(k-1)/2 - x is the multiplier - so if there is a valid x then ++;
// so for each k k=2-> k<Math.sqrt(2*in) k++ find an x increment result count to return it after the loop
So, we can calculate the RHS for every value of k and if it is a multiple of k then we can construct a sum of N using k terms starting from x.
Now, the question arises, till what value of k should we loop for? That's easy. In the worst case, RHS should be greater than 0. That is
N - k*(k-1)/2 > 0 which implies
k*(k-1) < 2N which can be approximated to
k*k < 2N ==> k < sqrt(2N)
Hence the overall complexity of the algorithm is O(sqrt(N))
*/