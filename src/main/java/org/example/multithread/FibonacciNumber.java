package org.example.multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n-1) + fibonacci(n-2);
}
 */

public class FibonacciNumber implements Callable<Integer> {
    private int n;

    public FibonacciNumber(int n) {
        this.n = n;
    }

    int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    @Override
    public Integer call() throws Exception {
        if(n<=1) return n;

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Integer> first = executorService.submit(new FibonacciNumber(n-1));
        Future<Integer> second = executorService.submit(new FibonacciNumber(n-2));

        int x = first.get();
        int y = second.get();

        return x+ y;
    }
}
