package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
/**
You have a number of envelopes with widths and heights given as a pair of integers (w, h). 
One envelope can fit into another if and only if both the width and height of one envelope is 
greater than the width and height of the other envelope.
What is the maximum number of envelopes can you Russian doll? (put one inside other)

Note:
Rotation is not allowed.

Example:

Input: [[5,4],[6,4],[6,7],[2,3]]
Output: 3 
Explanation: The maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] => [6,7]).

**/
public class RussianDoll {
   public static void main(String[] args) {
	int [][]j = {{5,4},{6,4},{6,7},{2,3}};
	
	maxEnvelopes(j);
	System.out.println(mx);
}
	
	  public static int maxEnvelopes(int[][] envelopes) {
	        recur(envelopes,0,0,envelopes[0][0],envelopes[0][1], new HashSet<String>(),"");	        
	        return mx;
	    }
	  static int mx=0;
	  private static void recur(int[][] env, int count, int pos, int x, int y, Set<String> hs, String whatsgoingon){
	        if(hs.contains(env[pos][0]+""+env[pos][1])) return;
	        if(mx<count)mx=count;
	        System.out.println(whatsgoingon);
	        for(int i=pos;i<env.length;i++){
	        	hs.add(env[i][0]+""+env[i][1]);
			    if(x<=env[i][0] && y<= env[i][1] ){
				recur(env, count+1, i+1,env[i][0],env[i][1],hs,whatsgoingon+"|"+env[i][0]+"-"+env[i][1]);
			    }
	      		hs.remove(env[i][0]+""+env[i][1]);
	        }
	    }
}
