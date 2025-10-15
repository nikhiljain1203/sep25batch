package org.example.labsession3;

import java.util.LinkedList;

public class RecentlyViewedItems {
    private LinkedList<Item> items;
    private static final int MAX_SIZE = 5;

    public RecentlyViewedItems() {
        items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        if(items.contains(item)) {
            items.remove(item);
        }

        items.addFirst(item);

        if(items.size() > MAX_SIZE) {
            items.removeLast();
        }
    }

    public LinkedList<Item> getRecentlyViewedItems() {
        return items;
    }
}
