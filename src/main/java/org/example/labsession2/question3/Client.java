package org.example.labsession2.question3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Bank Account Synchronization (synchronized block and method)
Objective
Learn how to avoid race conditions using synchronized.

Problem Statement
Implement a BankAccount class with a balance.
Create multiple threads representing depositors and withdrawers.
Simulate a race condition where multiple users deposit and withdraw simultaneously.
Fix the issue using:
synchronized methods
synchronized blocks
Measure execution time with and without synchronization.

 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable depositTask = () -> {
            for(int i = 0; i < 1000; i++) {
                account.deposit(i);
            }
        };

        Runnable withdrawTask = () -> {
            for(int i = 0; i < 1000; i++) {
                account.withdraw(i);
            }
        };

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 5; i++) {
            executorService.submit(depositTask);
            executorService.submit(withdrawTask);
        }
        Thread.sleep(100);
        executorService.shutdown();

        long endTime = System.currentTimeMillis();

        System.out.println("Final Balance: " + account.getBalance());
        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}
