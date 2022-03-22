package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOptions {
	 // sort
	// comparator
	// quick tricks to save 2 minutes
	
	public static void main(String[] args) {
		
		  int[][] e1 = new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 5}, {5, 6}, {3, 4}};
		  List<int[]> a=new ArrayList<>();
		  int s[]= new int[]{0,1};
		  int s1[]= new int[]{0,2};
		  int s2[]= new int[]{1,3};
		  a.add(s);a.add(s1);a.add(s2);
		  Collections.sort(a, (i,j) -> i[1] - j[1]);
		  
		  List<Integer> a1=new ArrayList<>();
		  a1.add(3); a1.add(1); a1.add(6);
		  System.out.println(a1.get(0));
		  Collections.sort(a1, (i,j) -> i - j);
		  System.out.println(a1.get(0));
		  
		  List<String> a2=new ArrayList<>();
		  a2.add("c"); a2.add("a"); a2.add("b");
		  System.out.println(a2.get(0));
		  Collections.sort(a2, (i,j) -> i.charAt(0) - j.charAt(0));
		  System.out.println(a2.get(0));
		  char g[]= new char[] {'c','b','a'};
		  List<Character> a3=new ArrayList<>();
		  a3.add(g[0]); a3.add(g[1]); a3.add(g[2]);
		  System.out.println(a3.get(0));
		  Collections.sort(a3, (i,j) -> i - j);
		  System.out.println(a3.get(0));
		  System.out.println(a3.get(1));
		  System.out.println(a3.get(2));

		  
		  
	}

}
