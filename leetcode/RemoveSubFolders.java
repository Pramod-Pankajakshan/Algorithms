package leetcode;

import java.util.*;

// Hello World my name is Pramod

public class RemoveSubFolders {

	public static void main(String args[]) {
          String [] s=new String [] {"/d","/a","/a/b","/c/d","/c/d/e/"};
		fn(s);

	}

	private static void fn(String[] in) {
		//Collections.sort(in);
		List<String> res= new ArrayList<>();
		Arrays.sort(in);
		//System.out.println(in[0]);
		int i=1;
		res.add(in[0]);
		while(i<in.length) {
			if(!in[i].contains(in[i-1])) {
				res.add(in[i]);
			}
			i++;
		}
		
		System.out.println(Arrays.toString(res.toArray()));
	}
}

