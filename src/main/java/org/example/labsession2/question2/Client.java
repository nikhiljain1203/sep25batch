package org.example.labsession2.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
Objective
Understand the difference between FixedThreadPool and CachedThreadPool by simulating a web scraper.

Problem Statement
Given a list of 100 URLs (e.g., "http://example.com/pageX"),
simulate fetching the page content using Thread.sleep(200ms).
Implement two versions:
Use a FixedThreadPool(10) to process 10 URLs at a time.
Use a CachedThreadPool to process them dynamically.
Compare the execution time for both approaches.

 */
public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String[] urls = new String[1000];
        for (int i = 0; i < 100; i++) {
            urls[i] = "http://example.com/page" + (i + 1);
        }

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        long startFixed = System.currentTimeMillis();
        List<Future<Void>> fixedFutures = new ArrayList<>();
        for(String url : urls) {
            ScrapUrl task = new ScrapUrl(url);
            Future<Void> future = fixedThreadPool.submit(task);
            fixedFutures.add(future);
        }
        for (Future<Void> f: fixedFutures) {
            f.get();
        }
        long endFixed = System.currentTimeMillis();
        fixedThreadPool.shutdown();

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        long startCached = System.currentTimeMillis();
        List<Future<Void>> cachedFutures = new ArrayList<>();
        for(String url : urls) {
            ScrapUrl task = new ScrapUrl(url);
            Future<Void> future = cachedThreadPool.submit(task);
            cachedFutures.add(future);
        }
        for (Future<Void> f: cachedFutures) {
            f.get();
        }
        long endCached = System.currentTimeMillis();
        cachedThreadPool.shutdown();

        System.out.println("FixedThreadPool Execution Time: " + (endFixed - startFixed) + " ms");
        System.out.println("CachedThreadPool Execution Time: " + (endCached - startCached) + " ms");

    }
}
