package org.example.demo;

public class Exam {
    public int examId;
    public String examName;

    public Exam() {
        this.examId = 0;
        this.examName = "Not Assigned";
        System.out.println("Exam object created.");
    }

    public Exam(String name, int id) {
        this.examId = id;
        this.examName = name;
        System.out.println("Exam object created.");
    }

    public Exam(Exam other) {
        this.examId = other.examId;
        this.examName = other.examName;
    }
}
