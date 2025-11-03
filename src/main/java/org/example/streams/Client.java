package org.example.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello Streams!");

        List<Integer> list = List.of(12, 21, 33, 4, 15, 60, 17, 81, 19, 10);

        // Using Streams to filter even numbers
        for(Integer num : list) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        List<Integer> l2 = list.stream()
                .filter(((num) -> num % 2 == 0))
                .sorted()
                .map(x -> x * x)
                .distinct()
                .collect(Collectors.toList());



        System.out.println("Even numbers using Streams: " + l2);
    }
}
