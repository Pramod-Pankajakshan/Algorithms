package advancedjava;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SimpleJava {


	public static void main(String arg[]){
	try {
//		HashMap<String,String> hm = new HashMap<>();
//		Comparator<String> c=(String i1,String i2)->  {
//		  if(i1.length()<i2.length()) {
//			  if()
//		  }
//		}
//		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(c);
//		
//		
		String input ="aaadddggfhhh";
		char [] in= input.toCharArray();

			StringBuilder sb = new StringBuilder();
			sb.append(in[in.length-1]);
			for(int i=in.length-2;i>0;i--){

			if(in[i]!=in[i-1]){
			sb.append(in[i]);
			}

			}
			System.out.println(sb.toString());
		
		//listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
		
		int y=1;
		int j=0;
		int k=y/j;
		
		
	}catch(RuntimeException e) {
		System.out.println(e);
		System.out.println("ex");
	}catch(Exception e) {
		System.out.println(e);
		System.out.println("ex");
	}catch(Throwable e) {
		System.out.println(e);
		System.out.println("ex");
	}finally {
		System.out.println("finally");
	}


}
}





