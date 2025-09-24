package org.example.inheritance;

public class client {
    public static void main(String[] args) {
        User user = new User("Nikhil", 1);
        Student student = new Student();
        Instructor instructor = new Instructor();
        SpecialStudent specialStudent = new SpecialStudent();

        System.out.println("Debug"); // true
    }
}
