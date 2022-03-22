package google;

import java.util.*;

/**
 * 
 * 
 * You are given a series of video clips from a sporting event that lasted time seconds. 
 * These video clips can be overlapping with each other and have varying lengths.

Each video clip is described by an array clips where clips[i] = [starti, endi]
 indicates that the ith clip started at starti and ended at endi.

We can cut these clips into segments freely.

For example, a clip [0, 7] can be cut into segments [0, 1] + [1, 3] + [3, 7].
Return the minimum number of clips needed so that we can cut the clips into segments that 
cover the entire sporting event [0, time]. If the task is impossible, return -1.
Input: clips = [[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]], time = 10
Output: 3
Explanation: 
We take the clips [0,2], [8,10], [1,9]; a total of 3 clips.
Then, we can reconstruct the sporting event as follows:
We cut [1,9] into segments [1,2] + [2,8] + [8,9].
Now we have segments [0,2] + [2,8] + [8,10] which cover the sporting event [0, 10].
 * @author pramod
 *
 */
public class VideoStitching {

	public static void main(String args[]) {

		int[][] clips = new int[][] {{0,2},{4,6},{8,10},{1,9},{1,5},{5,9}};
		
		int T =10;
		//int[][] clips = new int[][]{{0,1},{6,8},{0,2},{5,6},{0,4},{0,3},{6,7},{1,3},{4,7},{1,4},{2,5},{2,6},{3,4},{4,5},{5,7},{6,9}};
	    // clips = new int[][]{{0,4},{2,3},{3,8}};
	     System.out.println(videoStitching(clips,T));
	

	}


	// Working and accepted solution - by self
	   public static int videoStitching(int[][] clips, int dur) {
	       Arrays.sort(clips,((o1,o2) -> o1[0]-o2[0]));
			int[] dp = new int[dur + 1];
			Arrays.fill(dp, dur + 1);
			dp[0]=1;
			
				for (int[] clipDim : clips) {				
					int prev=0;
					for(int i=clipDim[0];i<=clipDim[1]&&i<dp.length;i++)   {  
						if(i==clipDim[0]) {
							prev=i==0?1:dp[Math.max(clipDim[0],i-1)]+1;// the clip prev can start only from that clips start value
						}// cos if we take prev value then it will consider breaks in the tape - check leetcode submissions
						dp[i] = Math.min(prev, dp[i]);	
					   
					   }
					System.out.println(Arrays.toString(dp)); 
			}
			return dp[dur] == dur + 1 ? -1 : dp[dur];
		}
	}
	 


