package org.example.multithread.addsub;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        ReentrantLock lock = new ReentrantLock();
        Adder adder = new Adder(value, lock);
        Subtractor subtractor = new Subtractor(value, lock);

        ExecutorService executorService =
                java.util.concurrent.Executors.newFixedThreadPool(10);

        Future<Void> adderFuture = executorService.submit(adder);
        Future<Void> subtractorFuture = executorService.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println("Final Value: " + value.getValue());
    }
}
