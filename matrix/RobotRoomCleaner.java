package matrix;

import java.util.HashSet;
import java.util.Set;

// Clean the room
// instaed of running around
public class RobotRoomCleaner {

	public static void main(String args[]) {
	  int mat[][]= new int [][]{     {0, 0, 1, 0, 1},
									 {0, 0, 0, 0, 0},
									 {0, 0, 0, 0, 1},
									 {0, 1, 0, 0, 0}};
	  backTrack(mat,new int[] {3,3},0);
	}
    // there is a need for a go back action
	static Set<String> visited= new HashSet<>(); 
	private static void backTrack(int[][] input, int[] st, int dir) {
		System.out.println(st[0]+"-"+st[1]+"/"+visited.size()+"DIR::::->"+dir);
	     visited.add(st[0]+"-"+st[1]);
	     if(visited.size()>=25)  return;
		for(int i=0;i<4;i++) {
			int newx=st[0];
			int newy=st[1];
			 dir=(dir+i)%4;
			if(dir==0) {
				 newx= st[0]-1;
				 newy= st[1];
			}
			if(dir==1) {
				 newx= st[0];
				 newy= st[1]+1;
			}	
			if(dir==2) {
				 newx= st[0]+1;
				 newy= st[1]+0;
			}	
			if(dir==3) {
				 newx= st[0];
				 newy= st[1]+-1;
			}	
			if(isValid(newx,newy,input)&&!visited.contains(newx+"-"+newy)) {// moved to next pos 
				// move robot
			 backTrack(input,new int[] {newx,newy},dir);// for this new pos try all
             // ur back - so update robot	- boback		
			 System.out.println("return");
			}
		}  
	}
	
	private static boolean isValid(int newx,int newy,int[][] input) {
		if(newx>3||newx<0||newy>4||newy<0||input[newx][newy]==1) return false;
		return true;
	}
}

