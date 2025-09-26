package org.example.inheritance;

public class client {
    public static void main(String[] args) {
//        User user = new User("Nikhil", 1);
//        Student student = new Student();
//        Instructor instructor = new Instructor();
//        SpecialStudent specialStudent = new SpecialStudent();

        User user1 = new Student();
        user1.id = 10;
        user1.username = "User1";

        user1.login();

        Student student1 = new Student();
        student1.login("A");


        System.out.println("Debug"); // true
    }
}
