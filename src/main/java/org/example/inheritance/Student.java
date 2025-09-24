package org.example.inheritance;

public class Student extends User {
    public String batch;

    public Student(String batch) {
        super("DefaultStudent");
        this.batch = batch;
    }
}
