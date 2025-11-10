package DesignPattern.Builder;

public class Student {
    private String name;
    private int age;
    private String major;

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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student() {

    }

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();
        this.age = studentBuilder.getAge();
        this.major = studentBuilder.getMajor();
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    static class StudentBuilder {
        private String name;
        private int age;
        private String major;

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getMajor() {
            return major;
        }

        public StudentBuilder setMajor(String major) {
            this.major = major;
            return this;
        }

        public Student build() {
            if(this.age < 18) {
                throw new IllegalArgumentException("Age must be at least 18");
            }
            return new Student(this);
        }
    }
}
