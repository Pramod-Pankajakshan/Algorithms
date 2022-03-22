package leetcode;
    
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi]
 * represents the width and the height of an envelope.
 * 
 * One envelope can fit into another if and only if both the width and height of
 * one envelope are greater than the other envelope's width and height.
 * 
 * Return the maximum number of envelopes you can Russian doll (i.e., put one
 * inside the other).
 * 
 * Note: You cannot rotate an envelope.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: envelopes = [[5,4],[6,4],[6,7],[2,3]] Output: 3 Explanation: The
 * maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] =>
 * [6,7]).
 * 
 * @author pramod
 *
 */
public class RussianDoll {
	public static void main(String[] args) {
		int[][] j = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } ,{1,1},{0,0}};
		maxEnvelopes(j);
		System.out.println(mx);
	}

	public static int maxEnvelopes1(int[][] in) {
	//	Integer[][]envelope=	Arrays.stream(envelopes).sorted((o1,o2)-> o1[0]==o2[0]? o1[1]-o2[1]:o1[0]-o2[0]).toArray(Integer[][]:: new);
		Integer[][] envelope = 	Arrays.stream(in).map(array -> IntStream.of(array).boxed().toArray(Integer[]::new)).sorted((o1,o2)-> o1[0]==o2[0]? o1[1]-o2[1]:o1[0]-o2[0]).toArray(Integer[][]::new);
		Arrays.stream(envelope).forEach(o1-> System.out.println(o1[0]+"--"+o1[1]));
		recur(envelope, 0, 0, envelope[0][0], envelope[0][1], new HashSet<String>(), "");
		return mx;
	}

	static int mx = 0;

	private static void recur(Integer[][] envolopeArr, int count, int pos, int x, int y, Set<String> visited, String whatsgoingon) {
		if (pos>envolopeArr.length-1|| visited.contains(envolopeArr[pos][0] + "" + envolopeArr[pos][1]))
			return;
		if (mx < count)
			mx = count;
		System.out.println(whatsgoingon);
		System.out.println(envolopeArr[pos][0] + "" + envolopeArr[pos][1]);
		for (int i = pos; i < envolopeArr.length; i++) {
			visited.add(envolopeArr[i][0] + "" + envolopeArr[i][1]);
			if (x <= envolopeArr[i][0] && y <= envolopeArr[i][1]) {
				recur(envolopeArr, count + 1, i + 1, envolopeArr[i][0], envolopeArr[i][1], visited,whatsgoingon + "|" + envolopeArr[i][0] + "-" + envolopeArr[i][1]);
			}
			visited.remove(envolopeArr[i][0] + "" + envolopeArr[i][1]);
		}
	}
	


	    public static int lengthOfLIS(int[] nums) {
	        int[] dp = new int[nums.length];
	        int len = 0;
	        for (int num : nums) {
	            int i = Arrays.binarySearch(dp, 0, len, num);
	            if (i < 0) {
	                i = -(i + 1);
	            }
	            dp[i] = num;
	            if (i == len) {
	                len++;
	            }
	        }
	        return len;
	    }

	    public static int maxEnvelopes(int[][] envelopes) {
	        // sort on increasing in first dimension and decreasing in second
	        Arrays.sort(envelopes, new Comparator<int[]>() {
	            public int compare(int[] arr1, int[] arr2) {
	                if (arr1[0] == arr2[0]) {
	                    return arr2[1] - arr1[1];
	                } else {
	                    return arr1[0] - arr2[0];
	                }
	           }
	        });
	        // extract the second dimension and run LIS
	        int[] secondDim = new int[envelopes.length];
	        for (int i = 0; i < envelopes.length; ++i) secondDim[i] = envelopes[i][1];
	        Arrays.stream(secondDim).forEach(o1-> System.out.println(o1));
	        return lengthOfLIS(secondDim);
	    }
	
}
