package org.example.abstractFactory.factory;

import org.example.abstractFactory.service.Car;

public interface AbstractFactory {
    public Car getInstance(int price);
}
