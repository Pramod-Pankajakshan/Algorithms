package beforeexam.classics;

import java.util.*;


public class Microsoft2020FillMatrix {
		
		public static void main(String[] args) {
			int[][] in= new int[][]{{ 1,3,2},
	 							  	 {0,0,0	},
	 							  	 {0,0,0	}};

			fillMatrix(in);

			System.out.println(ifFillable);
		}
		static boolean ifFillable=false;

		private static void fillMatrix(int[][] in){
	        // is matrix full - exit and update
	        // cannot proceed - return
			//identify an empty field
			// insert a number [1-3]- validate
	        // invoke again

	        Set<Integer> rowColSet= new HashSet<>();
		    int[] ef=	getEmptyField(in);
		    System.out.println(ef[0]+""+ef[1]);
	       
		    if(ef[0]==-1) {
		    	ifFillable=true;
		    	System.out.println(Arrays.deepToString(in));
		    	return;
		    }
	        // check row and column and see if its possible to place a unique number
	        // check row and col and push number  to the set
	        // pick a number not in set
	        for(int i=0; i<in.length;i++){        	
	            boolean presentr= rowColSet.add(in[ef[0]][i]);// get the row values

	        }

	        for(int i=0; i<in.length;i++){
	        	boolean presentc= rowColSet.add(in[i][ef[1]]);// get the unique col values
	        }

	        //if(presentr==-1||presentc==-1) return;
	        
	        for(int i=1; i<=in.length;i++){ // 1
	        	 if(ifFillable) {
	        	 	return;
	        	 }
	        	if(!rowColSet.contains(i)){
	           		in[ef[0]][ef[1]]=i;
	           		fillMatrix(in);
	           		in[ef[0]][ef[1]]=0;
	        	}
	        }

	        return;

		}

	    // get an empty row and col id
		private static int[] getEmptyField(int[][] in){

	        for(int i=0;i<in.length;i++){
	        	for(int j=0;j<in[0].length;j++){
	                
	                if(in[i][j]==0){
	                	return new int[]{i,j};
	                }

	        	}

	        }
	     return new int[]{-1,-1};
		}
}