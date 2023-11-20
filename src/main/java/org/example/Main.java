package org.example;

import java.time.LocalTime;
interface StudentInterface {
    void learn();
}
class Student implements StudentInterface {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    public void learn() {
        System.out.println(name);
    }
}
class StudentDecorator implements StudentInterface {
    private StudentInterface student;
    public StudentDecorator(StudentInterface student) {
        this.student = student;
    }
    public void learn() {
        student.learn();
        System.out.println(LocalTime.now());
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Виталий");
        StudentInterface decoratedStudent = new StudentDecorator(student);
        decoratedStudent.learn();
    }
}