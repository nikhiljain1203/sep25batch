package org.example.demo;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Nikhil";
        student.age = 32;
        student.batch = "AUG 24";
        Exam exam = new Exam();
        exam.examId = 101;
        exam.examName = "Java Basics";
        student.exam = exam;

//        Student student1 = student;
//        student1.age = 30;
        Student student1 = new Student(student);


        System.out.println(student.age);
    }
}
