package org.example.labsession3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();

        itemList.add(
                new Book("B001",
                        "The Great Gatsby",
                        10.99,
                        5,
                        "F. Scott Fitzgerald"));

        itemList.add(
                new Electronics("E001",
                        "Smartphone",
                        299.99,
                        10,
                        24));

        itemList.add(
                new Clothing("C001",
                        "T-Shirt",
                        15.99,
                        20,
                        "M"));


        System.out.println("Before Sorting:");
        for(Item item : itemList) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        Collections.sort(itemList);

        System.out.println("\nAfter Sorting by Name:");
        for(Item item : itemList) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        Collections.sort(itemList, new ItemPriceComparator());
        System.out.println("\nAfter Sorting by Price:");
        for(Item item : itemList) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

//        Inventory<Book> bookInventory = new Inventory<>();
//        bookInventory.addItem(new Book("B001", "The Great Gatsby", 10.99, 5, "F. Scott Fitzgerald"));
//        bookInventory.addItem(new Book("B002", "1984", 8.99, 3, "George Orwell"));
//        bookInventory.addItem(new Book("B002", "1986", 8.99, 3, "George Orwell"));
//
//        System.out.println("Books in Inventory:");
//        for(Book book : bookInventory.getAllItems()) {
//            System.out.println(book.getName() + " by " + book.getAuthor());
//        }
//
//        Inventory<Electronics> electronicsInventory = new Inventory<>();
//        Inventory<Item> itemInventory = new Inventory<>();

//        RecentlyViewedItems items = new RecentlyViewedItems();
//        for(int i = 1; i <= 7; i++) {
//            items.addRecentlyViewedItem(new Book("B00" + i, "Book " + i, 10.0 + i, i, "Author " + i));
//        }
//
//        System.out.println("Recently Viewed Items:");
//        for(Item item : items.getRecentlyViewedItems()) {
//            System.out.println(item.getName());
//        }

//        OrderProcessor orderProcessor = new OrderProcessor();
//        orderProcessor.addOrder(new Order("Order001",false));
//        orderProcessor.addOrder(new Order("Order002",true));
//        orderProcessor.addOrder(new Order("Order003",true));
//
//        System.out.println("Processing Orders:");
//        while (orderProcessor.getSize() > 0) {
//            Order order = orderProcessor.processOrder();
//            System.out.println("Processed Order ID: "
//                    + order.getOrderId());
//        }
    }
}
