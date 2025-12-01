package DesignPattern.Observer;


public class InventorySubscriber implements Subscriber {
    public InventorySubscriber() {
        Amazon.registerSubscriber(this);
    }
    public void onOrderPlaced() {
        System.out.println("Inventory Sub Invoked");
    }
}
