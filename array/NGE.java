package array;

import java.util.Stack;
//trick - start from last - compare with stack add to stack
//pop if next element is greater then 
public class NGE {
	
	public static void main (String[] args) 
	{
		int arr[] = { 5, 3, 12, 4, 8, 6 };
		getNGE(arr);
	}
	
	//use a stack ans start from last
  static	void getNGE(int h[]){
		Stack<Integer> st= new Stack<Integer>();
		for(int i=h.length-1;i>=0;i--){
			// 2 - pop 6
			while(!st.isEmpty()&&h[i]>st.peek())
				st.pop();
			if(st.isEmpty()){
				System.out.println("-1 for "+h[i]);
			}else{
				System.out.println(st.peek()+" for "+h[i]);
			}
			// step 1 add 6 
			// 3 - add 8
			st.add(h[i]);
		}
	}
  
 
}
