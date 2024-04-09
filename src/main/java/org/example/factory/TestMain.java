package org.example.factory;

public class TestMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        shape.computeArea();
    }
}
