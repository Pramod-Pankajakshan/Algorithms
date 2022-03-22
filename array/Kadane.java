package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;


//MAX SUM SUBARRAY - and plus
public class Kadane {
public static void main(String[] args) {
 int f[]={8, -88, 17, -13, 10, 11, 12};
 int m=kdn2(f);
 System.out.println(m);
 // m=maxcircularsum(f);
 System.out.println(m);
 ArrayList<String> al = new ArrayList<>();
 al.add("");
 LinkedList<String> ll= new LinkedList<>();
 ll.add("");
 Stack<String> st= new Stack<String>();
 st.push("abc");
 st.push("abc");
}

static int kdn(int g[]){
	int maxcurr=0;
	int maxsum=0;
	for(int i=0;i<g.length;i++){
		maxcurr=maxcurr+g[i];
		
		if(maxcurr>maxsum)
				maxsum=maxcurr;	
		if(maxcurr<0)
			maxcurr=0;
	}
	
	return maxsum;	
}
/**
 * 2017 TEST
 * @param g
 * @return
 */
static int kdn2(int g[]){
	HashMap<Integer,Integer[]> hm = new HashMap<Integer, Integer[]>();
	int maxcurr=0;
	int maxsum=0;int cnt=0; int end=0;
	Integer h[]= new Integer[2];
	for(int i=0;i<g.length;i++){
		
		maxcurr=maxcurr+g[i];
		if(maxcurr<0) {
			maxcurr=0;			
			cnt=i+1;
		}
		else if(maxcurr>maxsum) {
			  end=i;			  
			  h[0]=cnt; h[1]=end;
			  hm.put(maxcurr, h);
				maxsum=maxcurr;	
		}
	}
	System.out.println(Arrays.asList(hm.get(maxsum)));
	return maxsum;	
}



static int maxcircularsum(int g[]){
	
	int kmax=kdn(g);
	int m=0;
	for(int i=0;i<g.length;i++){
		m=m+g[i];
		
		g[i]= -g[i];
	}
	m=m+kdn(g);
		
		return m>kmax?m:kmax;
}

}
