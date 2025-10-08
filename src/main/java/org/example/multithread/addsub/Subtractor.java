package org.example.multithread.addsub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Callable<Void> {

    private final Value value;
    private ReentrantLock lock;

    public Subtractor(Value value, ReentrantLock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 0; i <= 100; i++) {
            //lock.lock();
            synchronized(value) {
                value.setValue(value.getValue() - i);
                System.out.println("Value after subrtacting "
                        + i + " : " + value.getValue()
                        + " by " + Thread.currentThread().getName());
            }
            //lock.unlock();
        }
        return null;
    }
}
