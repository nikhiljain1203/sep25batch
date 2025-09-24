package org.example.demo2;

public class Student {
    private String name;
    int age;
    public String batch;

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
        System.out.println(name + " has registered for " + className + " class.");
    }

    void rateClass(int rating) {
        System.out.println(name + " rated the class with " + rating + " stars.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
