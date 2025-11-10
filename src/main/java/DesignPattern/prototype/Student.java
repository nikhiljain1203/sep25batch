package DesignPattern.prototype;

public class Student implements Prototye<Student> {
    private String name;
    private int age;
    private int psp;
    private String batch;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student() {

    }

//    public Student(Student student) {
//        this.name = student.name;
//        this.age = student.age;
//        this.psp = student.psp;
//        this.batch = student.batch;
//        this.course = student.course;
//    }

    @Override
    public Student getClone() {
        //return new Student(this);
        Student clonedStudent = new Student();
        clonedStudent.setName(this.name);
        clonedStudent.setAge(this.age);
        clonedStudent.setPsp(this.psp);
        clonedStudent.setBatch(this.batch);
        clonedStudent.setCourse(this.course);
        return clonedStudent;
    }
}
