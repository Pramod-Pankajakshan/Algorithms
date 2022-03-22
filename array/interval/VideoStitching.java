package array.interval;

import java.util.*;

/**
 * You are given a series of video clips from a sporting event that lasted T
 * seconds. These video clips can be overlapping with each other and have varied
 * lengths.
 * 
 * Each video clip clips[i] is an interval: it starts at time clips[i][0] and
 * ends at time clips[i][1]. We can cut these clips into segments freely: for
 * example, a clip [0, 7] can be cut into segments [0, 1] + [1, 3] + [3, 7].
 * 
 * Return the minimum number of clips needed so that we can cut the clips into
 * segments that cover the entire sporting event ([0, T]). If the task is
 * impossible, return -1.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: clips = [[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]], T = 10 Output: 3
 * Explanation: We take the clips [0,2], [8,10], [1,9]; a total of 3 clips.
 * Then, we can reconstruct the sporting event as follows: We cut [1,9] into
 * segments [1,2] + [2,8] + [8,9]. Now we have segments [0,2] + [2,8] + [8,10]
 * which cover the sporting event [0, 10].
 * 
 * @author pramod
 *
 */

public class VideoStitching {

	public static void main(String args[]) {

		int[][] clips = new int[][] //{ { 0, 2 }, { 4, 6 }, { 8, 10 }, { 1, 9 }, { 1, 5 }, { 5, 9 } };
		{{0,1},{6,8},{0,2},{5,6},{0,4},{0,3},{6,7},{1,3},{4,7},{1,4},{2,5},{2,6},{3,4},{4,5},{5,7},{6,9}};
				
//		int[][] clips = new int[][] { { 0, 9 }, { 4, 8 }, { 8, 10 } };
		int T = 9;
		// int[][] clips = new
		// int[][]{{0,1},{6,8},{0,2},{5,6},{0,4},{0,3},{6,7},{1,3},{4,7},{1,4},{2,5},{2,6},{3,4},{4,5},{5,7},{6,9}};
		// int[][] clips = new int[][]{{0,4},{2,8}};
		System.out.println(videoStitching(clips, T));

	}

	// video stitching - its a simple thing similar to dp of jump game
	 public static int videoStitching(int[][] clips, int totalLength) {
			Arrays.sort(clips, (a,b) ->  a[0] - b[0]);
			int prev=0; int range=0;
			int [] r= new int[totalLength+1];
			Arrays.fill(r, totalLength + 1);
			for(int [] cl:clips) {
				System.out.println(Arrays.toString(r));
				System.out.println(cl[0]+"-"+cl[1]+"-"+prev);
	            if(cl[0]==0) {
					prev=1;
				}else {
					prev=r[cl[0]];
				}
				for(int i=cl[0];i<=Math.min(cl[1],totalLength);i++) {				
					r[i]=Math.min(r[i],prev+1);
				}
				
				
			}
			System.out.println(Arrays.toString(r));
			
		return r[r.length-1]==totalLength+1?-1:r[r.length-1];
		}
	
	public static int videoStitching1(int[][] clips, int totalLength) {
		int[] dp = new int[totalLength + 1];
		Arrays.fill(dp, totalLength + 1);
		dp[0] = 0;
		for (int i = 1; i <= totalLength ; i++) {
			System.out.println(Arrays.toString(dp));
			if(dp[i - 1] < totalLength) break;
			for (int[] clipDim : clips) {
				if (clipDim[0] <= i && clipDim[1] >= i)
					dp[i] = Math.min(dp[i], dp[clipDim[0]] + 1);
			}
		}
		return dp[totalLength] == totalLength + 1 ? -1 : dp[totalLength];
	}

}
