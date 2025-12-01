package DesignPattern.Observer;

public class Client {
    public static void main(String[] args) {
        SellerSubscriber s = new SellerSubscriber();
        EmailSubscriber e = new EmailSubscriber();
        InventorySubscriber i = new InventorySubscriber();
        Amazon amazon = new Amazon();
        amazon.orderPlaced();
        //test 

    }
}
