package org.example.abstractFactory;

import org.example.abstractFactory.factory.AbstractFactory;
import org.example.abstractFactory.factory.AbstractFactoryProducer;
import org.example.abstractFactory.service.Car;

public class TestMain {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory abstractFactory = abstractFactoryProducer.getFactoryInstance("Luxury");
        Car car = abstractFactory.getInstance(2500000);
        System.out.println(car.getTopSpeed());
    }
}
