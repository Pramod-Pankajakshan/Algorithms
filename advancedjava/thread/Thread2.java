package advancedjava.thread;

import java.util.*;


public class Thread2 implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<100)
		System.out.println("Th2");
		i++;
		
	}

	
	
}

