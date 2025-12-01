package DesignPattern.Observer;

public class EmailSubscriber implements Subscriber{
    public EmailSubscriber() {
        Amazon.registerSubscriber(this);
    }
    public void onOrderPlaced() {
        System.out.println("Email Has been invoked");
    }
}
