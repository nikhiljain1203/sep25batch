package org.example.interfaces;

public abstract class Animal {
    public int legs;

    public void makeSound() {
        System.out.println("Animal sound");
    }

    public abstract void eat();
}
