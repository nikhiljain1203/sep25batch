package org.example.labsession2.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/*
Problem Statement
Given an array of 1 million random numbers,
divide the array into N chunks (N = number of available cores).
Figure out how to find the number of available cores.

Implementation
Use Callable to compute the sum of each chunk.
Retrieve the final sum using Future objects.

Solution
Adding 1 million numbers sequentially is time-consuming.
We can parallelize this task using multiple threads.
First, determine the number of available cores.
Divide the array into N chunks and submit each chunk to the executor.

 */
public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int size = 1_000_000;
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100));
        }

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available cores: " + cores);

        int chunkSize = size / cores;
        System.out.println("Chunk size: " + chunkSize);

        ExecutorService executorService = Executors.newFixedThreadPool(cores);

        List<Future<Long>> futureList = new ArrayList<>();

        for(int i =0; i< cores; i++) {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? size : (i + 1) * chunkSize;
            futureList.add(executorService.submit(new SumMulithreadCallable(numbers, start, end)));
        }

        Long finalSum = 0L;
        for(Future<Long> f : futureList) {
            finalSum += f.get();
        }
        System.out.println("Final Sum: " + finalSum);
    }
}
