package stack;

import java.util.Arrays;

import stack.Basics.Node;
/**
 * custom stack
 * @author Pramod
 *
 * @param <K>
 */
public class MyStack<K>{
	
	//initial size 
	int size=5;
	// array
	Object[] stak=new Object[size];
	int position;
    int currentsize=stak.length;
/**
 *     
 * @param s
 */
public void push(K s){	
	if(position>=currentsize){
		stak=Arrays.copyOf(stak,currentsize*2);
	}
	stak[position]=s;
	position=position+1;
}
/**
 * 
 * @return
 */
 public K pop(){
	 position=position-1;
	K k=(K) stak[position];
   
 return k;
 }
}
