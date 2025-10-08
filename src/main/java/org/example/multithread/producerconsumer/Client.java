package org.example.multithread.producerconsumer;

import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(10);

        Semaphore producerSemaphore = new Semaphore(10);
        Semaphore consumerSemaphore = new Semaphore(0);

        for(int i = 0; i < 100; i++) {
            new Thread(new Producer(store, producerSemaphore, consumerSemaphore)).start();
            new Thread(new Consumer(store, producerSemaphore, consumerSemaphore)).start();
        }

//        for(int i = 0; i < 100; i++) {
//            new Thread(new Consumer(store)).start();
//        }
    }
}
