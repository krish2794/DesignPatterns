package org.example.abstractFactory.factory;

import org.example.abstractFactory.service.Car;
import org.example.abstractFactory.service.impl.EconomyCar1;
import org.example.abstractFactory.service.impl.EconomyCar2;

public class EconomicCarFactory implements AbstractFactory{


    @Override
    public Car getInstance(int price) {
        if(price <= 50000){
            return new EconomyCar1();
        }
        else if(price <= 100000){
            return new EconomyCar2();
        }
        return null;
    }
}
