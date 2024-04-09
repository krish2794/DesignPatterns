package org.example.abstractFactory.factory;

import org.example.abstractFactory.service.Car;
import org.example.abstractFactory.service.impl.LuxuryCar1;
import org.example.abstractFactory.service.impl.LuxuryCar2;

public class LuxuryCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price<=150000){
            return new LuxuryCar1();
        }
        else if(price > 200000){
            return new LuxuryCar2();
        }
        return null;
    }
}
