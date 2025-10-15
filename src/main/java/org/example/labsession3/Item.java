package org.example.labsession3;

public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item o) {
//        if (this.price < o.price) {
//            return -1; // this object is less than the other object
//        } else if (this.price > o.price) {
//            return 1; // this object is greater than the other object
//        }
//        return 0;
        return this.name.compareTo(o.getName());
//        return o.getName().compareTo(this.name); // descending order
    }
}
