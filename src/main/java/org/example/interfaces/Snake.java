package org.example.interfaces;

public class Snake extends Animal{
    public boolean isVenomous;

    public void makeSound() {
        System.out.println("Hiss");
    }

    @Override
    public void eat() {

    }
}
