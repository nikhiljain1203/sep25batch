package org.example.generics;

import org.example.generics.wildcard.Tiger;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair pair = new Pair();
        pair.setFirst("Hello");
        pair.setSecond(123);

        pair.setFirst(1.00);

        Pair pair1 = new Pair();
        pair1.setFirst(45.67);
        pair1.setSecond(true);

        GenericPair<String, Integer> genericPair = new GenericPair<String, Integer>();
        genericPair.setFirst("Hello");
        genericPair.setSecond(123);

        genericPair.setFirst(1.00);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog());
        animals.add(new Cat());

        Animal a = new Tiger();

        printAnimalNames(animals);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        printAnimalNames(dogs);




    }

    //ANIMAL -> CAT -> TIGER, DOG -> Retiver
    static <T extends Animal> void printAnimalNames(List<T> animals) {
        for(T a : animals) {
            System.out.println(a.getName());
        }
    }

    // TIGER -> MAMMAL -> OBJECT
    static void printNumberOfLegs(List<? super Tiger> animals) {
        for(Object a : animals) {
            System.out.println(((Animal)a).getName());
        }

    }
}
