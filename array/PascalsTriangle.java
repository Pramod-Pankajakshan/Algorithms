package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {

	
	public static void main(String[] args) {
		pastr(6);
	}
	
	

     	//11
		//121
		//1331
		//14641
static List<List<Integer>> pastr(int d) {
	List<Integer> lst= new ArrayList<>();
	lst.add(1);lst.add(1);
	List<List<Integer>> flist= new ArrayList<>();flist.add(lst);
	List<Integer> nlst=null;
	for(int i=2;i<d;i++) {
		nlst= new ArrayList<>();
		nlst.add(1);
		for(int j=1;j<i;j++) {
			nlst.add(lst.get(j-1)+lst.get(j));
		 }
		nlst.add(1);
		flist.add(nlst);
		lst=nlst;
	}
	
	return flist;
}

}
