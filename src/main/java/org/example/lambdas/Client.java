package org.example.lambdas;

import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //HelloWorldTask task = new HelloWorldTask();
        Runnable task = () -> {
            System.out.println("Hello, World!");
        };
        Thread th = new Thread(task);
        th.start();


        List<Integer> l = new java.util.ArrayList<>(List.of(12, 21, 33, 4, 15, 60, 17, 81, 19, 10));
        l.sort((a, b) -> {
            if (a % 2 == b % 2) {
                return b - a;
            } else if (a % 2 == 0) {
                return -1;
            } else {
                return 1;
            }
        });

        Collections.sort(l, (a, b) -> {
            if (a % 2 == b % 2) {
                return b - a;
            } else if (a % 2 == 0) {
                return -1;
            } else {
                return 1;
            }
        });

        System.out.println(l);

        test test = () -> {
            System.out.println("This is a test.");
        };

        test.foo();

    }
}
