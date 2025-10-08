package org.example.multithread.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public List<Object> getItems() {
        return items;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void addItem(Object item) {
        items.add(item);
        System.out.println("Item added: " + item + ". Current size: " + items.size());
    }

    public void removeItem() {
        items.remove(items.size() - 1);
        System.out.println("Item removed. Current size: " + items.size());
    }
}
