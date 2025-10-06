package org.example.multithread.mergesort;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(array));

        MergeSortTask mergeSort = new MergeSortTask(array);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<int[]> sortedArray = executorService.submit(mergeSort);

        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(sortedArray.get()));
    }
}
