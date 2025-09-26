package org.example.interfaces;

public class Dog extends Animal implements Runner, Swimmer{
    public String breed;

    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void fastSwim() {

    }
}
