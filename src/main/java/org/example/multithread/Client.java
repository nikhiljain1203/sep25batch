package org.example.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
Print numbers from 1 to 100 each in a separate thread.
 */
public class Client {
    public static void main(String[] args) throws Exception {
//        for(int i = 0 ; i <100; i++) {
//            Thread t = new Thread(new NumberPrinter(i));
//            t.start();
//        }

//        FibonacciNumber fibo = new FibonacciNumber(2);
//        System.out.println(fibo.call());

        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<Integer>> futureList = new ArrayList<>();
        for(int i = 0; i< 100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            Future<Integer> number = executorService.submit(np);
            futureList.add(number);
//            System.out.println("Number: "
//                    + number.get()
//                    + " printed by "
//                    + Thread.currentThread().getName());
        }

        for(Future<Integer> f : futureList) {
            System.out.println(f.get());
        }
    }

}
