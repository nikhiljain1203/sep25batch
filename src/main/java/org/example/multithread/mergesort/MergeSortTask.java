package org.example.multithread.mergesort;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.util.Arrays.copyOfRange;

public class MergeSortTask implements Callable<int[]> {
    private int[] array;

    public MergeSortTask(int[] array) {
        this.array = array;
    }

    @Override
    public int[] call() throws Exception {
        System.out.println("Thread Name: "
                + Thread.currentThread().getName()
                + " is sorting array of length: "
                + array.length);
        if(array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] leftArray = copyOfRange(array, 0, mid);
        int[] rightArray = copyOfRange(array, mid, array.length);

        MergeSortTask leftTask = new MergeSortTask(leftArray);
        MergeSortTask rightTask = new MergeSortTask(rightArray);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<int[]> leftFuture = executorService.submit(leftTask);
        Future<int[]> rightFuture = executorService.submit(rightTask);

        // ----------------------

        int[] leftSorted = leftFuture.get();
        int[] rightSorted = rightFuture.get();
        
        return mergeArray(leftSorted, rightSorted);

    }

    private int[] mergeArray(int[] leftSorted, int[] rightSorted) {
        int[] mergedArray = new int[leftSorted.length + rightSorted.length];
        int i = 0, j = 0, k = 0;
        while(i < leftSorted.length && j < rightSorted.length) {
            if (leftSorted[i] <= rightSorted[j]) {
                mergedArray[k++] = leftSorted[i++];
            } else {
                mergedArray[k++] = rightSorted[j++];
            }
        }
        while(i < leftSorted.length) {
            mergedArray[k++] = leftSorted[i++];
        }
        while(j < rightSorted.length) {
            mergedArray[k++] = rightSorted[j++];
        }
        return mergedArray;
    }
}
