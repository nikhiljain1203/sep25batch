package DesignPattern.Observer;

public class SellerSubscriber implements Subscriber{
    public SellerSubscriber() {
        Amazon.registerSubscriber(this);
    }
    public void onOrderPlaced() {
        System.out.println("Seller Subscriber invoked"); 
    }
}
