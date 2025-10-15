package org.example.labsession3;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        if(item1.getPrice() < item2.getPrice()) {
            return -1;
        } else if(item1.getPrice() > item2.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}
