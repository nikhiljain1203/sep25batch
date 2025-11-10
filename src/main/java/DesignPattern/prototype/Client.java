package DesignPattern.prototype;

public class Client {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        Student prototypeStudent = new Student();
        prototypeStudent.setName("DUMMY");
        prototypeStudent.setAge(0);
        prototypeStudent.setPsp(0);
        prototypeStudent.setBatch("SEPT_24_BE");
        prototypeStudent.setCourse("Backend LLD");

        registry.add("sept_24_be", prototypeStudent);

        Student student1 = registry.get("sept_24_be").getClone();
        student1.setName("Sudarshan");
        student1.setAge(26);

        Student student2 = registry.get("sept_24_be").getClone();
        student2.setName("Ankush");
        student2.setAge(27);

        System.out.println("Debug");
    }
}
