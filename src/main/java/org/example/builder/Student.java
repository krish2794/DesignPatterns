package org.example.builder;

import java.util.List;
import java.util.Stack;

public class Student {
    int rollNumber;
    String name;
    int age;

    List<String> subjects;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", subjects=" + subjects +
                '}';
    }

    public Student(StudentBuilder studentBuilder){
        this.rollNumber = studentBuilder.rollNumber;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.subjects = studentBuilder.subjects;
    }
}
