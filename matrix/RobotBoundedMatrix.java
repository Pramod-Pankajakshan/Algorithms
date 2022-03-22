package matrix;

import java.util.*;
/**
 *
 * On an infinite plane, a robot initially stands at (0, 0) and faces north. The robot can receive one of three instructions:
	"G": go straight 1 unit;
	"L": turn 90 degrees to the left;
	"R": turn 90 degrees to the right.
	The robot performs the instructions given in order, and repeats them forever.
	Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 * @author pramod
 * Input: instructions = "GGLLGG"
Output: true
 *
 */

public class RobotBoundedMatrix {

	public static void main(String args[]) {

		System.out.println(isRobotBounded("GGLLGG"));

	}

	public static boolean isRobotBounded(String ins) {
       char[] ch= ins.toCharArray(); 
       // 00 north 01 east 02 south 03 west
       int[][] dir= new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
       int x=0; int y=0;  int currentDirection=0 ;//north
       for(char c:ch) {
    	   // decide direction by identifying value in dir
    	   if(c=='L') {
    		   currentDirection=(currentDirection+1)%4;
    	   }
    	   if(c=='R') {
    		   currentDirection=(currentDirection+3)%4;
       }
    	   x=x+dir[currentDirection][0];y=y+dir[currentDirection][1];
    	   
    	   
       }
       return x==0&&y==0||currentDirection!=0;
    }
}

