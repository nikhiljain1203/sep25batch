package org.example.labsession3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(T item) {
        if(item.getQuantity() <=0) {
            System.out.println("Item quantity must be greater than zero.");
            return;
        }
        if(items.containsKey(item.getId())) {
            System.out.println("Item with ID " + item.getId() + " already exists.");
            return;
        }
        items.put(item.getId(), item);
    }

    public void removeItem(String id) {
        if(!items.containsKey(id)) {
            System.out.println("Item with ID " + id + " does not exist.");
            return;
        }
        items.remove(id);
    }

    public T getItem(String id) {
        return items.get(id);
    }

    public List<T> getAllItems() {
        return new ArrayList<>(items.values());
    }
}
