package org.example.multithread.addsub;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value value;

    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 0; i <= 100; i++) {
            value.setValue(value.getValue() + i);
        }
        return null;
    }
}
