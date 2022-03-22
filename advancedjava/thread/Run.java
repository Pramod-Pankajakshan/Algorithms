package advancedjava.thread;

import java.util.*;


public class Run {

	public static void main(String args[]) {
       Thread th2= new Thread(new Thread2());
       th2.start();
       Thread th3= new Thread(new Thread3());
       th3.start();
       
	}

	
}

