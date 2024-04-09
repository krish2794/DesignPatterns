package org.example.prototype;

public class Student implements Prototype{
    //Clonable interface can be used instead of using Prototype interface
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public Student clone(){
        return new Student(id, name);
    }
}
