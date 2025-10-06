package org.example.multithread;

import java.util.concurrent.Callable;

public class NumberPrinter implements Callable<Integer> {
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

//    @Override
//    public void run() {
//        System.out.println("Number: "
//                + number
//                + " printed by "
//                + Thread.currentThread().getName());
//    }
//
    @Override
    public Integer call() throws Exception {
        return  number*5;
    }
}
