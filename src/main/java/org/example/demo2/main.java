package org.example.demo2;

public class main {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Nikhil");
        st.age = 32;
        st.batch = "AUG 24";

        Student st2 = new Student("Ganesh", 32, "AUG 24");

        System.out.println("Student Details: " + st.getName());
    }
}
