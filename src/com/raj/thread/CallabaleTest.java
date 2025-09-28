package com.raj.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallabaleTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor =  Executors.newSingleThreadExecutor();
        Callable<Integer> task = ()->{
        	int sum = 0;
        	for(int i=0;i<5;i++) {
        		sum+=i;
        	}
			return sum;        	
        };
        //Now Using Future to execute executor submit with task object to receive result
        Future<Integer> future = executor.submit(task);
        System.out.println("Future is with Value "+future.get());
        executor.shutdown();
	}

}
