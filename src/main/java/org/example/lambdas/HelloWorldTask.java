package org.example.lambdas;

public class HelloWorldTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, World!");
    }
}
