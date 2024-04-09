package org.example.builder;

public class TestMain {
    public static void main(String[] args) {
        EngineerStudentBuilder engineerStudentBuilder = new EngineerStudentBuilder();
        Student student = engineerStudentBuilder.setRollNumber(1)
                .setName("Krishna")
                .setAge(21)
                .build();

        System.out.println(student);
    }
}
