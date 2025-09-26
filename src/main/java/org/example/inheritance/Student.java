package org.example.inheritance;

public class Student extends User {
    public String batch;

//    public Student(String batch) {
//        super("DefaultStudent");
//        this.batch = batch;
//    }


    //OVERRIDDING
    public void login() {
        System.out.println(this.username + " logged in. STUDENT");
    }

    //OVERLOADING
    public void login(String a) {
        System.out.println(this.username + " logged in. STUDENT A");
    }

    public int attendClass(int a, int b) {
        return a + b;
    }

    public String attendClass(String a, int b) {
        return a + b;
    }

    public String attendClass(int a, String b) {
        return a + b;
    }

    public String attendClass(String a) {
        return a;
    }
}
