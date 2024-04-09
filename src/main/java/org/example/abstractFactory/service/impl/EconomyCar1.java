package org.example.abstractFactory.service.impl;

import org.example.abstractFactory.service.Car;

public class EconomyCar1 implements Car {
    @Override
    public int getTopSpeed() {
        return 100;
    }
}
