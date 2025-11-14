package DesignPattern.factory.example2;

public class IOSButton implements Button {
    @Override
    public void Click() {
        System.out.println("iOS Button Clicked");
    }
}
