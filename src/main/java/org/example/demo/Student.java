package org.example.demo;

public class Student {
    public String name;
    int age;
    private String batch;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.batch = "Not Assigned";
        System.out.println("Student object created.");
    }

    public Student(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        System.out.println("Student object created.");
    }

    void registerForClass(String className) {
        this.name = "test";
        this.age = 10;
        this.batch = "AUG 24";
        System.out.println(name + " has registered for " + className + " class.");
    }
}
