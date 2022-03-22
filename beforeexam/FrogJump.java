package beforeexam;

import java.util.*;


public class FrogJump {

	public static void main(String args[]) {
		Set<Integer> hs1 = new HashSet<>();
		
       Set<Integer> hs= new HashSet<>();
       hs.add(1);//[0,1,3,5,6,8,12,17]//
       hs.add(3);
       hs.add(5);
       hs.add(6);
       hs.add(8);
       hs.add(12);
       hs.add(17);
       hs.add(0);
       FrogJump fj= new FrogJump();
       fj.fn(hs, 1, 17, 1,"");
 	}

	private static void fn(Set<Integer> hs,int jump, int target, int pos,String s) {
		if(pos==target) {
			System.out.println(s);
			return;
		}
		if(pos>target) {		
			return;
		}
		if(pos>target) {		
			return;
		}
		if(jump==0) {		
			return;
		}
		
		if(hs.contains(pos)) {
			fn(hs,jump, target,pos+jump,s+jump);
		}
		if(hs.contains(pos)) {
			fn(hs,jump+1, target,pos+jump+1,s+(jump+1));
		}
		if(hs.contains(pos)) {
			fn(hs,jump-1, target,pos+jump-1,s+(jump-1));
		}
	}
}

