package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OptimalUtilizationNearest {
	 // sort
	// comparator
	// quick tricks to save 2 minutes
	
	public static void main(String[] args) {
		//a = [[1, 3], [2, 5], [3, 7], [4, 10]]
		//		b = [[1, 2], [2, 3], [3, 4], [4, 5]]

		  List<int[]> a=new ArrayList<>();
		  int s[]= new int[]{1,3};
		  int s1[]= new int[]{2,5};
		  int s2[]= new int[]{3,7};int s3[]= new int[]{4,10};
		  a.add(s);a.add(s1);a.add(s2);a.add(s3);
		  List<int[]> b=new ArrayList<>();
		  int sb[]= new int[]{1,2};
		  int sb1[]= new int[]{2,3};
		  int sb2[]= new int[]{3,4};int sb3[]= new int[]{4,5};
		  b.add(sb);b.add(sb1);b.add(sb2);b.add(sb3);
		  

		  
		  Collections.sort(a, (i,j) -> i[1] - j[1]);
		  Collections.sort(b, (i,j) -> i[1] - j[1]);
          int diff=Integer.MAX_VALUE;
		  int bc=b.size()-1;int ac=0;
		  int sum=10;
		  List<int[]> r= new ArrayList<>();
		  while(bc>=0&&ac<a.size()) {
			  // compare a first and b last
			  // if > than sum then increase a
			  // else decrease b
			  if(a.get(ac)[1]+b.get(bc)[1]>sum) {
				  bc--;
			  }else{	  
				  System.out.println("----"+diff);
				  if(sum-(a.get(ac)[1]+b.get(bc)[1])<diff) {
					 diff= sum-(a.get(ac)[1]+b.get(bc)[1]);
					 System.out.println("new idff"+diff);
					 // replace
					 r= new ArrayList<>();
					 int[] op=new int[2];
					 op[0]=a.get(ac)[0];op[1]=b.get(bc)[0];
					 r.add(op);
					 System.out.println("replace"+op[0]+"&"+op[1]);
				  }else if(sum-(a.get(ac)[1]+b.get(bc)[1])==diff) {
					   int[] op=new int[2];
						 op[0]=a.get(ac)[0];op[1]=b.get(bc)[0];
						 r.add(op);
						 System.out.println("append-"+op[0]+"&"+op[1]);
				   }
				  ac++;
			  }
			  
			  
			  
			  
		  }
		  
		  for(int[] k:r) {
			  System.out.println("--"+k[0]+"&"+k[1]);
			  
		  }
		  
		  
	}

}
