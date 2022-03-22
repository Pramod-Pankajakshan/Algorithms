package set;

import java.util.*;


public class BestTeamWithNoConflicts {
     //scores = [1,2,3,5], ages = [8,9,10,1]
	public static void main(String args[]) {
		BestTeamWithNoConflicts bc= new BestTeamWithNoConflicts();
		int ans=bc.bestTeamScore(new int[] {1,3,5,10,15},new int[] {1,2,3,4,5}); 
		System.out.println(ans);
	}

	
	    class BoyGroup{
	        int scormax;
	        int agemax;
	        int sum;
	    }
	    public int bestTeamScore(int[] scores, int[] ages) {
	        List<BoyGroup> bgl= new ArrayList<>();
	       for(int i=0;i<ages.length;i++){
	           BoyGroup bg= new BoyGroup();
	           bg.scormax=scores[i];bg.sum=scores[i];
	           bg.agemax=ages[i];
	           bgl.add(bg);
	       }    
	       List<BoyGroup> bglm= new ArrayList<>();
	       Collections.sort(bgl,(a,b)->a.agemax-b.agemax);
	        for(BoyGroup bg:bgl){
	        	    if(bglm.isEmpty()) {
	        	    	bglm.add(bg);
	        	    	continue;
	        	    }
	        	    boolean merged=false;
	            for(BoyGroup bgm:bglm) {
	            	 if(bg.scormax>bgm.scormax) {
	            		 bgm.scormax=bg.scormax;
	            		 bgm.agemax=bg.agemax;
	            		 bgm.sum+=bg.sum;
	            		 merged=true;
	            		 break;
	            	 }	            	 
	            }
	             if(!merged)
           		 bglm.add(bg); 
           }
	       int max=0;
	        for(BoyGroup bg:bglm) {
	        	max=max<bg.sum?bg.sum:max;
	        }
	        return max;
	    }
	}


