package advancedjava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public  class Thread1 implements Runnable{

	
	public static void main(String[] args) throws Exception {
	
		
		Thread1 t= new Thread1();
	
		t.testExecutorService();
		for(int i=0;i<10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}

	}
	
	@Override
	public void run() {
		
		System.out.println("Thread1");
	}

	
	
	public void testExecutorService() throws InterruptedException, ExecutionException {
		ExecutorService es= Executors.newFixedThreadPool(3);
		Thread1 t1= new Thread1();
		es.execute(t1);
		Callable c= new Callable<Object>() {
			public Object call() throws Exception {
		        System.out.println("Asynchronous Callable");
		        return "Callable Result";
		    }
		};
		FutureTask o=(FutureTask) es.submit(c);
		System.out.println(o.get());
	}
}
