package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQ{
Queue<String> q1=new LinkedList<String>();
Queue<String> q2=new LinkedList<String>();

void push(String s){	
	q1.add(s);// 1 2 3 4
}

String pop(){
	move();
	String h=q1.poll();
	q1=q2;
	q2=new LinkedList<String>();
	return h;
}

void move(){	
while(!q1.isEmpty()){
	if(q1.size()==1){
		return ;
	}
	q2.add(q1.poll());	
	}
}

}
