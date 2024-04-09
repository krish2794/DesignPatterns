package org.example.prototype;

public class TestMain {
    public static void main(String[] args) {

        Student student = new Student(1, "Krishna");
        Student student2 = student.clone();

        System.out.println(student2);
    }
}
