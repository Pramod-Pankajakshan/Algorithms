package advancedjava.thread;

import java.util.*;


public class Thread3 implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<100)
		System.out.println("Th3");
		i++;
		
	}

	
	
}

