package DesignPattern.Builder;

public class Client {
    public static void main(String[] args) {
//        StudentBuilder studentBuilder = Student.builder();
//        studentBuilder.setName("John Doe");
//        studentBuilder.setAge(27);
//        studentBuilder.setMajor("Computer Science");
//        Student student = studentBuilder.build();

        Student student = Student.builder().setName("Jane Smith")
                .setAge(22)
                .setMajor("Mathematics")
                .build();

        System.out.println("Student created: " +
                student.getName() + ", Age: " +
                student.getAge() + ", Major: " +
                student.getMajor());
    }
}
